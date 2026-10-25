package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ar0;
import defpackage.pk0;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBookingRescheduleConfirmationBottomSheetKt {
    public static final void a(PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel, Function0 onRescheduleRideClick, Function0 function0, Function0 additionalInfoCtaClick, Composer composer, int i) {
        int i2;
        Function0 function1;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        Function0 onGoBackClick = function0;
        Intrinsics.i(onRescheduleRideClick, "onRescheduleRideClick");
        Intrinsics.i(onGoBackClick, "onGoBackClick");
        Intrinsics.i(additionalInfoCtaClick, "additionalInfoCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-880934476);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(premiumBusProductModificationAdditionalInfoAppModel) : composerStartRestartGroup.changedInstance(premiumBusProductModificationAdditionalInfoAppModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRescheduleRideClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGoBackClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(additionalInfoCtaClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880934476, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingRescheduleConfirmationBottomSheet (PremiumBusBookingRescheduleConfirmationBottomSheet.kt:27)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strC = premiumBusProductModificationAdditionalInfoAppModel != null ? premiumBusProductModificationAdditionalInfoAppModel.f2384a : null;
            if (strC == null) {
                composerStartRestartGroup.startReplaceGroup(-1362304333);
                strC = StringResourcesHelperKt.c(StringEnum.ARE_YOU_SURE_YOU_WANT_TO_RESCHEDULE_YOUR_RIDE, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1362305821);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = strC;
            TextStyle displaySmall = ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(displaySmall, 0L, 0L, companion4.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 131070);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (premiumBusProductModificationAdditionalInfoAppModel != null) {
                composerStartRestartGroup.startReplaceGroup(718507161);
                i5 = 0;
                i3 = i2;
                companion = companion2;
                i4 = 6;
                PremiumBusBookingCancellationConfirmationBottomSheetKt.b(StringResourcesHelperKt.c(StringEnum.NEED_MORE_FLEXIBILITY, new Object[0], composerStartRestartGroup, 6), premiumBusProductModificationAdditionalInfoAppModel, null, TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composerStartRestartGroup, 0).getHeadlineSmall(), 0L, 0L, companion4.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 0L, ChaloTheme.a(composerStartRestartGroup, 0).t0, additionalInfoCtaClick, composerStartRestartGroup, ((i2 << 3) & 112) | ((i2 << 9) & 3670016), 20);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
            } else {
                companion = companion2;
                i3 = i2;
                i4 = 6;
                i5 = 0;
                composerStartRestartGroup.startReplaceGroup(716732132);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strC2 = StringResourcesHelperKt.c(StringEnum.RESCHEDULE_RIDE, new Object[i5], composerStartRestartGroup, i4);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, i5).g;
            int i7 = i3;
            int i8 = (i7 & 112) == 32 ? 1 : i5;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = onRescheduleRideClick;
                objRememberedValue = new ar0(function1, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = onRescheduleRideClick;
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC2, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, 492);
            ChaloSpacersKt.o(composerStartRestartGroup, i5);
            String strC3 = StringResourcesHelperKt.c(StringEnum.GO_BACK, new Object[i5], composerStartRestartGroup, i4);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shape shape2 = ChaloTheme.d(composerStartRestartGroup, i5).g;
            int i9 = (i7 & 896) == 256 ? 1 : i5;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                onGoBackClick = function0;
                objRememberedValue2 = new ar0(onGoBackClick, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                onGoBackClick = function0;
            }
            ChaloFilledButtonKt.f(strC3, false, modifierFillMaxWidth$default2, null, shape2, 0.0f, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 384, 106);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = onRescheduleRideClick;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 23, premiumBusProductModificationAdditionalInfoAppModel, function1, onGoBackClick, additionalInfoCtaClick));
        }
    }
}
