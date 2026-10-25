package app.chalo.home.ui.premiumbus.prebookedtickets.newactivation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.bu0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusStopInfoWindowKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3589a;

        static {
            int[] iArr = new int[PremiumBusStopType.values().length];
            try {
                iArr[PremiumBusStopType.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusStopType.DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusStopType.INTERMEDIATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusStopType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3589a = iArr;
        }
    }

    public static final void a(PremiumBusStopType premiumBusStopType, StopLiveEtaUiModel stopLiveEtaUiModel, Composer composer, int i) {
        int i2;
        Intrinsics.i(premiumBusStopType, "premiumBusStopType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1045337236);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusStopType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stopLiveEtaUiModel) : composerStartRestartGroup.changedInstance(stopLiveEtaUiModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1045337236, i2, -1, "app.chalo.home.ui.premiumbus.prebookedtickets.newactivation.PremiumBusStopInfoWindow (PremiumBusStopInfoWindow.kt:21)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.m835widthInVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).x, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = WhenMappings.f3589a[premiumBusStopType.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1832293388);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PICKUP, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceGroup(-1832015566);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.DROP_OFF, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 3) {
                composerStartRestartGroup.startReplaceGroup(-1831748904);
                PostValidationScreenKt.e(null, stopLiveEtaUiModel, true, composerStartRestartGroup, 384 | (i2 & 112), 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 4) {
                    throw pk0.p(composerStartRestartGroup, 356533565);
                }
                composerStartRestartGroup.startReplaceGroup(-1831605374);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(premiumBusStopType, stopLiveEtaUiModel, i, 14));
        }
    }
}
