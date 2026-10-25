package app.chalo.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayoutKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import defpackage.c0;
import defpackage.i41;
import defpackage.l61;
import defpackage.nd;
import defpackage.pk0;
import defpackage.wl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TitoRideDetailsBottomSheetLayoutKt {
    public static final void a(final TitoRideDataAppModel titoRideDataAppModel, Modifier modifier, final Function1 sendIntent, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        TapInDetailAppModel tapInDetailAppModel;
        TapInDetailAppModel tapInDetailAppModel2;
        Intrinsics.i(titoRideDataAppModel, "titoRideDataAppModel");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1875564188);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(titoRideDataAppModel) : composerStartRestartGroup.changedInstance(titoRideDataAppModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            final Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1875564188, i4, -1, "app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayout (TitoRideDetailsBottomSheetLayout.kt:37)");
            }
            TITOValidationAppModel tITOValidationAppModel = titoRideDataAppModel.f9677a;
            String str = null;
            String str2 = (tITOValidationAppModel == null || (tapInDetailAppModel2 = tITOValidationAppModel.f9672a) == null) ? null : tapInDetailAppModel2.f9673a;
            if (tITOValidationAppModel != null && (tapInDetailAppModel = tITOValidationAppModel.f9672a) != null) {
                str = tapInDetailAppModel.l;
            }
            if (!(str == null || str.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    ChaloRoundedCardKt.b(companion, ChaloTheme.d(composerStartRestartGroup, 0).e, ChaloTheme.c(composerStartRestartGroup, 0).e, 0.0f, ComposableLambdaKt.rememberComposableLambda(61942907, true, new c0(titoRideDataAppModel, str2, str, sendIntent, 20), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 24576, 8);
                    modifier2 = companion;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i5 = 0;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: uj1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i6) {
                            case 0:
                                TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, companion, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, companion, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.skipToGroupEnd();
        modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i6 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: uj1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, modifier2, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, modifier2, sendIntent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(590512520);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590512520, i, -1, "app.chalo.home.ui.common.TitoRideDetailsCardHeaderComponent (TitoRideDetailsBottomSheetLayout.kt:71)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.BEST_BUS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineMedium()), composer2, 0, 0, 131066);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAPPED_IN, new Object[0], composer2, 6), rowScopeInstance.align(PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(companion, ChaloTheme.a(composer2, 0).C, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).e, ChaloTheme.b(composer2, 0).c), companion2.getCenterVertically()), ChaloTheme.a(composer2, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getTitleLarge(), composer2, 0, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 24));
        }
    }

    public static final void c(TitoRideDataAppModel titoRideDataAppModel, String str, String str2, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        String str3;
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1543763045);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(titoRideDataAppModel) : composerStartRestartGroup.changedInstance(titoRideDataAppModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1543763045, i2, -1, "app.chalo.home.ui.common.TitoRideDetailsCardInfoComponent (TitoRideDetailsBottomSheetLayout.kt:107)");
            }
            boolean zChanged = composerStartRestartGroup.changed(titoRideDataAppModel.c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TitoVehicleAndEtaData titoVehicleAndEtaData = titoRideDataAppModel.c;
                objRememberedValue = Boolean.valueOf((titoVehicleAndEtaData instanceof TitoVehicleAndEtaData.RideData) && (((TitoVehicleAndEtaData.RideData) titoVehicleAndEtaData).b instanceof TITOStopInfoEtaState.LiveEta));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(null, null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1916063942, true, new nd(modifier, function2, str3, ((Boolean) objRememberedValue).booleanValue(), str2, titoRideDataAppModel), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l61(titoRideDataAppModel, str, str2, modifier, function1, i));
        }
    }
}
