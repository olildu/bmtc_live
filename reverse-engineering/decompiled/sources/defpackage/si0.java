package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.multimodal.MetroLineContainerComposableKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.BusPassedDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.VehicleBreakDownUpcomingTripUiModel;
import app.chalo.productpurchase.passselection.ui.PassCategoryTagUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.multimodal.MetroLineContainerUIState;
import app.chalo.uistate.text.TextUIState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class si0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19306a;
    public final /* synthetic */ List b;

    public /* synthetic */ si0(List list, int i) {
        this.f19306a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.f19306a;
        Unit unit = Unit.f17538a;
        List<PassCategoryTagUIState> list = this.b;
        switch (i) {
            case 0:
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-42530723, iIntValue, -1, "app.chalo.compose.components.multimodal.MetroLineContainerComposable.<anonymous> (MetroLineContainerComposable.kt:34)");
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MetroLineContainerComposableKt.c((MetroLineContainerUIState) it.next(), composer2, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                FlowRowScope FlowRow2 = (FlowRowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow2, "$this$FlowRow");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(395124816, iIntValue2, -1, "app.chalo.productpurchase.passselection.ui.BookablePassConfigItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:377)");
                    }
                    for (PassCategoryTagUIState passCategoryTagUIState : list) {
                        TextUIState.ChaloTextUIState chaloTextUIState = passCategoryTagUIState.f8529a;
                        UIShape uIShape = passCategoryTagUIState.d;
                        TextKt.c(chaloTextUIState, ChaloThemeKt.c(ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(Modifier.INSTANCE, ChaloColorTokenKt.c(passCategoryTagUIState.b), ChaloThemeKt.d(uIShape)), ChaloThemeKt.d(uIShape)), passCategoryTagUIState.c), null, null, composer3, 0, 12);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(357549214, iIntValue3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.VehicleBreakdownScreen.<anonymous>.<anonymous> (PostValidationScreen.kt:215)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(1694781179);
                    int i3 = 0;
                    for (Object obj4 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        VehicleBreakDownUpcomingTripUiModel vehicleBreakDownUpcomingTripUiModel = (VehicleBreakDownUpcomingTripUiModel) obj4;
                        PostValidationScreenKt.h(vehicleBreakDownUpcomingTripUiModel.f7405a, vehicleBreakDownUpcomingTripUiModel.b, vehicleBreakDownUpcomingTripUiModel.c, vehicleBreakDownUpcomingTripUiModel.d, composer4, 0);
                        if (i3 != CollectionsKt.K(list)) {
                            composer4.startReplaceGroup(1855869939);
                            DividerKt.m1950HorizontalDivider9IZ8Weo(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer4, 0).h, 0.0f, 2, null), ChaloTheme.b(composer4, 0).b, ChaloTheme.a(composer4, 0).A, composer4, 0, 0);
                        } else {
                            composer4.startReplaceGroup(1845396930);
                        }
                        composer4.endReplaceGroup();
                        i3 = i4;
                    }
                    if (b3.t(composer4)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            default:
                int iIntValue4 = ((Integer) obj).intValue();
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= composer5.changed(iIntValue4) ? 4 : 2;
                }
                if (composer5.shouldExecute((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(488930126, iIntValue5, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostActivationRouteDetails.<anonymous>.<anonymous> (PostValidationScreen.kt:499)");
                    }
                    BusPassedDetails busPassedDetails = ((PremiumBusPostActivationStopDetails) list.get(iIntValue4)).e;
                    if (busPassedDetails.f7359a) {
                        composer5.startReplaceGroup(1483431825);
                        ImageKt.Image(PainterResourceHelperKt.a(busPassedDetails.b ? IconType.LIVE_BUS_LIST_DELAYED : IconType.ROUTE_LIST_LIVE_DIRECTION, composer5, 0), (String) null, SizeKt.m828size3ABfNKs(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer5, 0).e, 1, null), ChaloTheme.b(composer5, 0).l), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, Painter.$stable | 48, 120);
                        composer = composer5;
                    } else {
                        composer = composer5;
                        composer.startReplaceGroup(1463086804);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
        }
    }
}
