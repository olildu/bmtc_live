package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.pk0;
import defpackage.rj;
import defpackage.sj;
import defpackage.uj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloDotsIndicatorsKt {
    public static final void a(Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        int i4;
        int i5;
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1942455820);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942455820, i4, -1, "app.chalo.compose.components.ChaloDotsIndicator (ChaloDotsIndicators.kt:28)");
            }
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                rj rjVar = new rj(i, i5, j, j2, 0);
                composerStartRestartGroup.updateRememberedValue(rjVar);
                objRememberedValue = rjVar;
            }
            LazyDslKt.LazyRow(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 12) & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sj(i, i2, j, j2, modifier, i3, 0));
        }
    }

    public static final void b(Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        int i4;
        int i5;
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(978971850);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(978971850, i4, -1, "app.chalo.compose.components.ChaloDotsIndicatorWithSelectedPosition (ChaloDotsIndicators.kt:51)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                rj rjVar = new rj(i, i5, j, j2, 1);
                composerStartRestartGroup.updateRememberedValue(rjVar);
                objRememberedValue = rjVar;
            }
            LazyDslKt.LazyRow(modifier, null, null, false, null, centerVertically, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, ((i4 >> 12) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 478);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sj(i, i2, j, j2, modifier, i3, 1));
        }
    }

    public static final void c(long j, Composer composer, int i) {
        int i2;
        long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(639972640);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(639972640, i2, -1, "app.chalo.compose.components.DotComposable (ChaloDotsIndicators.kt:99)");
            }
            j2 = j;
            BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).f), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j2 = j;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uj(i, 0, j2));
        }
    }

    public static final void d(final int i, final long j, final int i2, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-993727275);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-993727275, i4, -1, "app.chalo.compose.components.DotWithItemPositionTextComposable (ChaloDotsIndicators.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 6).h), j, ChaloTheme.d(composerStartRestartGroup, 6).d);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk((i + 1) + "/" + i2, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 6).d, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 6).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.j(ChaloTheme.e(composerStartRestartGroup, 6)), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: vj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ChaloDotsIndicatorsKt.d(i, j, i2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
