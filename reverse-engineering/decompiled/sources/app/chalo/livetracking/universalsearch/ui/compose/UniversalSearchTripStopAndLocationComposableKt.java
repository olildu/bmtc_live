package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposableKt;
import defpackage.ag1;
import defpackage.fl1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchTripStopAndLocationComposableKt {
    public static final void a(AnnotatedString annotatedString, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1190412879);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(annotatedString) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1190412879, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.GetStopText (UniversalSearchTripStopAndLocationComposable.kt:57)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2624TextZ58ophY(annotatedString, PaddingKt.m786paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically(), false, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i2 & 14, 24960, 241660);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(annotatedString, i, 11));
        }
    }

    public static final void b(final String fromText, final String toText, final boolean z, final Function0 onClick, final Function0 function0, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Function0 function1;
        Intrinsics.i(fromText, "fromText");
        Intrinsics.i(toText, "toText");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1709346436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fromText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(toText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1709346436, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposable (UniversalSearchTripStopAndLocationComposable.kt:24)");
            }
            int i3 = i2 << 3;
            final AnnotatedString annotatedStringB = GenerateAnnotatedStringKt.b(composerStartRestartGroup, (i3 & 112) | 6, fromText);
            final AnnotatedString annotatedStringB2 = GenerateAnnotatedStringKt.b(composerStartRestartGroup, (i2 & 112) | 6, toText);
            if (annotatedStringB.length() == 0 || annotatedStringB2.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i4 = 0;
                    final boolean z3 = z2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: bn1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    UniversalSearchTripStopAndLocationComposableKt.b(fromText, toText, z3, onClick, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    UniversalSearchTripStopAndLocationComposableKt.b(fromText, toText, z3, onClick, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            function1 = onClick;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean z4 = (i2 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(function1, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).k, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            final int i5 = 0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-672494328, true, new Function2() { // from class: cn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-672494328, iIntValue, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposable.<anonymous> (UniversalSearchTripStopAndLocationComposable.kt:49)");
                                }
                                UniversalSearchTripStopAndLocationComposableKt.a(annotatedStringB, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-503242743, iIntValue, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposable.<anonymous> (UniversalSearchTripStopAndLocationComposable.kt:50)");
                                }
                                UniversalSearchTripStopAndLocationComposableKt.a(annotatedStringB, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54);
            final int i6 = 1;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-503242743, true, new Function2() { // from class: cn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-672494328, iIntValue, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposable.<anonymous> (UniversalSearchTripStopAndLocationComposable.kt:49)");
                                }
                                UniversalSearchTripStopAndLocationComposableKt.a(annotatedStringB2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-503242743, iIntValue, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposable.<anonymous> (UniversalSearchTripStopAndLocationComposable.kt:50)");
                                }
                                UniversalSearchTripStopAndLocationComposableKt.a(annotatedStringB2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54);
            boolean z5 = (57344 & i2) == 16384;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ag1(function0, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            FromAndToStopDetailViewKt.b(modifierM787paddingqDBjuR0, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, z, (Function0) objRememberedValue2, composer2, (i3 & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            function1 = onClick;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i7 = 1;
            final Function0 function2 = function1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: bn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i7) {
                        case 0:
                            ((Integer) obj2).getClass();
                            UniversalSearchTripStopAndLocationComposableKt.b(fromText, toText, z, function2, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            UniversalSearchTripStopAndLocationComposableKt.b(fromText, toText, z, function2, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }
}
