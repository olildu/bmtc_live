package app.chalo.premiumbus.ui.slotselection.compose;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.f90;
import defpackage.gl;
import defpackage.hl;
import defpackage.qu0;
import defpackage.zf;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "indicatorStart", "indicatorEnd", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusScrollableTabRowKt {
    public static final void a(List tabPositions, int i, Composer composer, int i2) {
        int i3;
        Object currentState;
        Object currentState2;
        Intrinsics.i(tabPositions, "tabPositions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1947719296);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabPositions) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1947719296, i3, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator (PremiumBusScrollableTabRow.kt:92)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Integer.valueOf(i), "", composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 0);
            f90 f90Var = new f90(3);
            Dp.Companion companion = Dp.INSTANCE;
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion2.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = transitionUpdateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion2.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue = ((Number) currentState).intValue();
            composerStartRestartGroup.startReplaceGroup(-1257963372);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1257963372, 0, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:104)");
            }
            float left = ((TabPosition) tabPositions.get(iIntValue)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl = Dp.m7276boximpl(left);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue2 = ((Number) ((State) objRememberedValue).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(-1257963372);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1257963372, 0, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:104)");
            }
            float left2 = ((TabPosition) tabPositions.get(iIntValue2)).getLeft();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl2 = Dp.m7276boximpl(left2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl, dpM7276boximpl2, (FiniteAnimationSpec) f90Var.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            f90 f90Var2 = new f90(4);
            TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(companion);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion3 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot2 = companion3.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable2 = companion3.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = transitionUpdateTransition.getCurrentState();
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        composerStartRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion3.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int iIntValue3 = ((Number) currentState2).intValue();
            composerStartRestartGroup.startReplaceGroup(-1073549875);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1073549875, 0, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:117)");
            }
            float fM2518getRightD9Ej5fM = ((TabPosition) tabPositions.get(iIntValue3)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl3 = Dp.m7276boximpl(fM2518getRightD9Ej5fM);
            boolean zChanged5 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue4 = ((Number) ((State) objRememberedValue3).getValue()).intValue();
            composerStartRestartGroup.startReplaceGroup(-1073549875);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1073549875, 0, -1, "app.chalo.premiumbus.ui.slotselection.compose.ChaloTabIndicator.<anonymous> (PremiumBusScrollableTabRow.kt:117)");
            }
            float fM2518getRightD9Ej5fM2 = ((TabPosition) tabPositions.get(iIntValue4)).m2518getRightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Dp dpM7276boximpl4 = Dp.m7276boximpl(fM2518getRightD9Ej5fM2);
            boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Integer>>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt$ChaloTabIndicator$$inlined$animateDp$4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BoxKt.Box(ZIndexModifierKt.zIndex(SizeKt.fillMaxSize$default(SizeKt.m833width3ABfNKs(SizeKt.wrapContentSize$default(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl(), 0.0f, 2, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), Dp.m7278constructorimpl(((Dp) TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM7276boximpl3, dpM7276boximpl4, (FiniteAnimationSpec) f90Var2.invoke(((State) objRememberedValue4).getValue(), composerStartRestartGroup, 0), vectorConverter2, "", composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE).getValue()).m7292unboximpl() - ((Dp) stateCreateTransitionAnimation.getValue()).m7292unboximpl())), 0.0f, 1, null), 1.0f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hl(tabPositions, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x017d  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void b(List tabs, PagerState pagerState, Modifier modifier, float f, float f2, Function1 onTabSelected, Function5 tabContent, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        float f3;
        boolean z;
        Composer composer2;
        float f4;
        Modifier modifier3;
        float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        int i4;
        float f6;
        float f7;
        int i5;
        int i6;
        Intrinsics.i(tabs, "tabs");
        Intrinsics.i(pagerState, "pagerState");
        Intrinsics.i(onTabSelected, "onTabSelected");
        Intrinsics.i(tabContent, "tabContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(598379517);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    f3 = f2;
                    int i8 = composerStartRestartGroup.changed(f3) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    f3 = f2;
                }
                i3 |= i8;
            } else {
                f3 = f2;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onTabSelected)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(tabContent)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    float f8 = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
                    i4 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        f6 = ChaloTheme.b(composerStartRestartGroup, 0).R;
                        i4 = i3 & (-64513);
                    } else {
                        f6 = f3;
                    }
                    f7 = f8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    int i9 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        i9 = i3 & (-64513);
                    }
                    f7 = f;
                    i4 = i9;
                    f6 = f3;
                    modifier4 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(598379517, i4, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRow (PremiumBusScrollableTabRow.kt:49)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                TabRowKt.m2528ScrollableTabRowsKfQg0A(pagerState.getCurrentPage(), SizeKt.m814height3ABfNKs(modifier4, ChaloTheme.b(composerStartRestartGroup, 0).m), Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, f7, ComposableLambdaKt.rememberComposableLambda(172474589, true, new gl(pagerState, 1), composerStartRestartGroup, 54), ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a, ComposableLambdaKt.rememberComposableLambda(442266333, true, new qu0(tabs, pagerState, onTabSelected, f6, tabContent), composerStartRestartGroup, 54), composer2, 14352768, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                f5 = f6;
                f4 = f7;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                modifier3 = modifier2;
                f5 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new zf(tabs, pagerState, modifier3, f4, f5, onTabSelected, tabContent, i, i2));
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                }
                i3 |= i8;
            } else {
                f3 = f2;
            }
            i3 |= i8;
        } else {
            f3 = f2;
        }
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onTabSelected)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(tabContent)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                float f9 = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
                i4 = i3 & (-7169);
                if ((i2 & 16) != 0) {
                    f6 = ChaloTheme.b(composerStartRestartGroup, 0).R;
                    i4 = i3 & (-64513);
                } else {
                    f6 = f3;
                }
                f7 = f9;
            } else {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                float f10 = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
                i4 = i3 & (-7169);
                if ((i2 & 16) != 0) {
                    f6 = ChaloTheme.b(composerStartRestartGroup, 0).R;
                    i4 = i3 & (-64513);
                } else {
                    f6 = f3;
                }
                f7 = f10;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(598379517, i4, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRow (PremiumBusScrollableTabRow.kt:49)");
            }
            Modifier modifier6 = modifier4;
            composer2 = composerStartRestartGroup;
            TabRowKt.m2528ScrollableTabRowsKfQg0A(pagerState.getCurrentPage(), SizeKt.m814height3ABfNKs(modifier4, ChaloTheme.b(composerStartRestartGroup, 0).m), Color.INSTANCE.m4640getTransparent0d7_KjU(), 0L, f7, ComposableLambdaKt.rememberComposableLambda(172474589, true, new gl(pagerState, 1), composerStartRestartGroup, 54), ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a, ComposableLambdaKt.rememberComposableLambda(442266333, true, new qu0(tabs, pagerState, onTabSelected, f6, tabContent), composerStartRestartGroup, 54), composer2, 14352768, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
            f5 = f6;
            f4 = f7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f4 = f;
            modifier3 = modifier2;
            f5 = f3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zf(tabs, pagerState, modifier3, f4, f5, onTabSelected, tabContent, i, i2));
        }
    }
}
