package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.cash.sqldelight.TransactionWithoutReturn;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.core.Premium_reserve_ticket_ack_table;
import app.chalo.core.Premium_reserve_ticket_ack_tableQueries;
import app.chalo.core.Premium_reserve_ticket_receipt_table;
import app.chalo.core.Premium_reserve_ticket_receipt_tableQueries;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.core.Premium_reserve_trip_table;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import app.chalo.core.Product_activation_details_tableQueries;
import app.chalo.core.Super_pass_trip_receipt_table;
import app.chalo.core.database.dao.PremiumBusTripDaoImpl;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.home.ui.chalobus.PremiumBusTutorialViewState;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.StopsBetweenPickUpAndDropDialogData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsAvailableSelectionBottomSheetUISpecs;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsAvailableSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.SelectedPassInfo;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUISpec;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.ticketvalidation.QRValidationStatus;
import app.chalo.userprofile.Gender;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.PostPunchBottomSheetData;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QrCodeData;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QrScreenBottomSheetType;
import app.chalo.vault.dao.QuickPayDaoImpl;
import app.chalo.vault.mapper.QuickPayEntityMapperKt;
import app.chalo.vault.mapper.QuickPayReceiptMapperKt;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import io.github.alexzhirkevich.compottie.internal.animation.RawProperty;
import io.github.alexzhirkevich.compottie.internal.animation.expressions.ExpressionsRuntimeKt;
import io.github.alexzhirkevich.keight.ScriptRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18348a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lu0(int i, Object obj, Object obj2) {
        this.f18348a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        SeatSelectionBottomSheetType seatSelectionBottomSheetTypeH0;
        switch (this.f18348a) {
            case 0:
                PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = (PremiumBusProductPurchaseFlowType) this.b;
                PremiumBusProductSelectionConfig premiumBusProductSelectionConfig = (PremiumBusProductSelectionConfig) this.c;
                PremiumBusProductSelectionDataState it = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusProductSelectionDataState.a(it, true, false, null, false, null, premiumBusProductPurchaseFlowType, false, premiumBusProductSelectionConfig, null, 342);
            case 1:
                GenderConfirmationBottomSheetType genderConfirmationBottomSheetType = (GenderConfirmationBottomSheetType) this.b;
                PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent genderSelectionOptionSelectedIntent = (PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent) this.c;
                PremiumBusSeatSelectionDataState it2 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                Gender gender = genderSelectionOptionSelectedIntent.f7739a;
                List genderOptions = ((GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType) genderConfirmationBottomSheetType).f7717a;
                Intrinsics.i(genderOptions, "genderOptions");
                return PremiumBusSeatSelectionDataState.a(it2, false, null, null, null, null, false, null, null, false, null, new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(new GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType(gender, genderOptions)), null, null, 61439);
            case 2:
                GenderPreferenceSelectionStates genderPreferenceSelectionStates = (GenderPreferenceSelectionStates) this.b;
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = (PremiumBusSeatSelectionComponent) this.c;
                PremiumBusSeatSelectionDataState it3 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = it3.c;
                if (premiumBusSeatSelectionFlowType == null || (seatSelectionBottomSheetTypeH0 = PremiumBusSeatSelectionComponent.H0(premiumBusSeatSelectionComponent, it3.m, genderPreferenceSelectionStates, premiumBusSeatSelectionFlowType)) == null) {
                    seatSelectionBottomSheetTypeH0 = it3.l;
                }
                return PremiumBusSeatSelectionDataState.a(it3, false, null, null, null, null, false, null, null, false, genderPreferenceSelectionStates, seatSelectionBottomSheetTypeH0, null, null, 59391);
            case 3:
                PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) this.b;
                Object obj2 = ((ChaloUseCaseResult.Success) this.c).f10419a;
                PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
                Map map = premiumBusSlotSelectionDataState.g;
                LinkedHashMap linkedHashMapU = map != null ? MapsKt.u(map) : new LinkedHashMap();
                long j = pBODPairWithSlotSectionListUiModel.f7820a;
                PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j));
                if (pBODPairWithSlotSectionListUiModel2 != null) {
                    ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = (ODPairsAndRespectiveSlotsBetweenStops) obj2;
                    linkedHashMapU.put(Long.valueOf(j), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel2, oDPairsAndRespectiveSlotsBetweenStops, null, false, oDPairsAndRespectiveSlotsBetweenStops.c, 0, oDPairsAndRespectiveSlotsBetweenStops.e, false, 11259));
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, null, linkedHashMapU, Long.valueOf(j), null, 0, null, null, null, false, null, null, null, null, false, null, null, null, ((ODPairsAndRespectiveSlotsBetweenStops) obj2).f, null, false, null, null, null, null, null, -16777416);
            case 4:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(new MultipleSlotSelectionCalendarState.ErrorState((PBAvailableSlotsTripAppModel) this.b, (SelectedPassInfo) this.c)), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 5:
                NearBySlotsAvailableSelectionBottomSheetUIState nearBySlotsAvailableSelectionBottomSheetUIState = (NearBySlotsAvailableSelectionBottomSheetUIState) this.b;
                NearBySlotsAvailableSelectionBottomSheetUISpecs nearBySlotsAvailableSelectionBottomSheetUISpecs = (NearBySlotsAvailableSelectionBottomSheetUISpecs) this.c;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1362656078, true, new fu0(5, nearBySlotsAvailableSelectionBottomSheetUISpecs, nearBySlotsAvailableSelectionBottomSheetUIState)), 3, null);
                final List list = nearBySlotsAvailableSelectionBottomSheetUIState.d;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearBySlotsAvailableSelectionUI$lambda$1$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearBySlotsAvailableSelectionUI$lambda$1$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            NearBySlotsCardUIState nearBySlotsCardUIState = (NearBySlotsCardUIState) list.get(iIntValue);
                            composer.startReplaceGroup(-1679019258);
                            PremiumBusSlotSelectionScreenKt.a(nearBySlotsCardUIState, composer, 0);
                            ChaloSpacersKt.o(composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PremiumBusSlotSelectionScreenKt.e, 3, null);
                return Unit.f17538a;
            case 6:
                ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState = (ViewAllSlotsBottomSheetUIState) this.b;
                final ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec = (ViewAllSlotsBottomSheetUISpec) this.c;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a, 3, null);
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(1005120174, true, new fu0(7, viewAllSlotsBottomSheetUIState, viewAllSlotsBottomSheetUISpec)), 3, null);
                final List list2 = viewAllSlotsBottomSheetUIState.c;
                LazyColumn2.items(list2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$ViewAllSlotsBottomSheet$lambda$1$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list2.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$ViewAllSlotsBottomSheet$lambda$1$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            PbSlotCardUIState pbSlotCardUIState = (PbSlotCardUIState) list2.get(iIntValue);
                            composer.startReplaceGroup(352254702);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec2 = viewAllSlotsBottomSheetUISpec;
                            PremiumBusSlotSelectionUiStateKt.q(ChaloThemeKt.c(companion, viewAllSlotsBottomSheetUISpec2.f7904a), pbSlotCardUIState, false, composer, 384);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, viewAllSlotsBottomSheetUISpec2.d), composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(1778162125, true, new la0(viewAllSlotsBottomSheetUIState, 24)), 3, null);
                return Unit.f17538a;
            case 7:
                List<PremiumReserveTripEntity> list3 = (List) this.b;
                PremiumBusTripDaoImpl premiumBusTripDaoImpl = (PremiumBusTripDaoImpl) this.c;
                for (PremiumReserveTripEntity premiumReserveTripEntity : list3) {
                    Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries = premiumBusTripDaoImpl.f2070a;
                    Intrinsics.i(premiumReserveTripEntity, "<this>");
                    premium_reserve_trip_tableQueries.Z(new Premium_reserve_trip_table(premiumReserveTripEntity.f7141a, premiumReserveTripEntity.b, premiumReserveTripEntity.c, premiumReserveTripEntity.d, premiumReserveTripEntity.e));
                }
                return Unit.f17538a;
            case 8:
                PremiumBusTutorialViewState premiumBusTutorialViewState = (PremiumBusTutorialViewState) this.b;
                final Function1 function1 = (Function1) this.c;
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                final List list4 = premiumBusTutorialViewState.f3297a;
                LazyColumn3.items(list4.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$lambda$4$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list4.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$lambda$4$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            final PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel = (PremiumBusTutorialConfigUiModel) list4.get(iIntValue);
                            composer.startReplaceGroup(1208727598);
                            String str = premiumBusTutorialConfigUiModel.c;
                            String str2 = premiumBusTutorialConfigUiModel.d;
                            String str3 = premiumBusTutorialConfigUiModel.b;
                            final Function1 function2 = function1;
                            boolean zChanged = composer.changed(function2) | composer.changed(premiumBusTutorialConfigUiModel);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.home.ui.chalobus.PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$4$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(new PremiumBusTutorialViewIntent.TutorialClicked(premiumBusTutorialConfigUiModel));
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            PremiumBusTutorialCardKt.a(str, str2, str3, (Function0) objRememberedValue, null, 0.0f, 0.0f, ChaloTheme.e(composer, 0).getBodyMedium(), 0, ChaloTheme.e(composer, 0).getBodySmall(), 0.0f, composer, 0, 0, 1392);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
            case 9:
                PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = (PremiumReserveTicketPostBookingActionHandlerImpl) this.b;
                List list5 = (List) this.c;
                PremiumReserveTicketPostBookingActionState it4 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it4, "it");
                String str = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(premiumReserveTicketPostBookingActionHandlerImpl.H).getValue()).f;
                if (str == null) {
                    str = "";
                }
                return PremiumReserveTicketPostBookingActionState.a(it4, null, null, null, null, null, null, null, null, null, new StopsBetweenPickUpAndDropDialogData(str, list5), null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -4097, 31);
            case 10:
                RouteAppModel routeAppModel = (RouteAppModel) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                PremiumReserveTicketPostBookingActionState it5 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it5, "it");
                return PremiumReserveTicketPostBookingActionState.a(it5, null, null, null, null, null, null, null, null, null, new StopsBetweenPickUpAndDropDialogData(routeAppModel.c, arrayList), null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -4097, 31);
            case 11:
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                PremiumReserveTicketPostBookingActionState it6 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it6, "it");
                return PremiumReserveTicketPostBookingActionState.a(it6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, arrayList2, arrayList3, null, null, null, null, false, null, false, null, null, null, null, null, null, -6291457, 31);
            case 12:
                Premium_reserve_ticket_ack_table premium_reserve_ticket_ack_table = (Premium_reserve_ticket_ack_table) this.b;
                Premium_reserve_ticket_ack_tableQueries premium_reserve_ticket_ack_tableQueries = (Premium_reserve_ticket_ack_tableQueries) this.c;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, premium_reserve_ticket_ack_table.f1981a);
                execute.bindString(1, premium_reserve_ticket_ack_table.b);
                execute.bindString(2, premium_reserve_ticket_ack_table.c);
                execute.bindString(3, premium_reserve_ticket_ack_table.d);
                execute.bindString(4, (String) premium_reserve_ticket_ack_tableQueries.b.f1982a.encode(premium_reserve_ticket_ack_table.e));
                execute.b(5, Boolean.valueOf(premium_reserve_ticket_ack_table.f));
                execute.bindString(6, premium_reserve_ticket_ack_table.g);
                return Unit.f17538a;
            case 13:
                Function13 function13 = (Function13) this.b;
                Premium_reserve_ticket_receipt_table.Adapter adapter = ((Premium_reserve_ticket_receipt_tableQueries) this.c).b;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                Long lE = cb0.e(l, sqlCursor, 2);
                String string = sqlCursor.getString(3);
                String strJ = cb0.j(string, sqlCursor, 4);
                String string2 = sqlCursor.getString(5);
                String strJ2 = cb0.j(string2, sqlCursor, 6);
                String string3 = sqlCursor.getString(7);
                String strJ3 = cb0.j(string3, sqlCursor, 8);
                String string4 = sqlCursor.getString(9);
                String strJ4 = cb0.j(string4, sqlCursor, 10);
                String string5 = sqlCursor.getString(11);
                Map map2 = string5 != null ? (Map) adapter.f1984a.a(string5) : null;
                String string6 = sqlCursor.getString(12);
                return function13.invoke(strI, l, lE, string, strJ, string2, strJ2, string3, strJ3, string4, strJ4, map2, string6 != null ? (RefundInfoEntityModel) adapter.b.a(string6) : null);
            case 14:
                Premium_reserve_ticket_receipt_table premium_reserve_ticket_receipt_table = (Premium_reserve_ticket_receipt_table) this.b;
                Premium_reserve_ticket_receipt_tableQueries premium_reserve_ticket_receipt_tableQueries = (Premium_reserve_ticket_receipt_tableQueries) this.c;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, premium_reserve_ticket_receipt_table.f1983a);
                execute2.d(1, Long.valueOf(premium_reserve_ticket_receipt_table.b));
                execute2.d(2, Long.valueOf(premium_reserve_ticket_receipt_table.c));
                execute2.bindString(3, premium_reserve_ticket_receipt_table.d);
                execute2.bindString(4, premium_reserve_ticket_receipt_table.e);
                execute2.bindString(5, premium_reserve_ticket_receipt_table.f);
                execute2.bindString(6, premium_reserve_ticket_receipt_table.g);
                execute2.bindString(7, premium_reserve_ticket_receipt_table.h);
                execute2.bindString(8, premium_reserve_ticket_receipt_table.i);
                execute2.bindString(9, premium_reserve_ticket_receipt_table.j);
                execute2.bindString(10, premium_reserve_ticket_receipt_table.k);
                Map map3 = premium_reserve_ticket_receipt_table.l;
                execute2.bindString(11, map3 != null ? (String) premium_reserve_ticket_receipt_tableQueries.b.f1984a.encode(map3) : null);
                RefundInfoEntityModel refundInfoEntityModel = premium_reserve_ticket_receipt_table.m;
                execute2.bindString(12, refundInfoEntityModel != null ? (String) premium_reserve_ticket_receipt_tableQueries.b.b.encode(refundInfoEntityModel) : null);
                return Unit.f17538a;
            case 15:
                Premium_reserve_ticket_table premium_reserve_ticket_table = (Premium_reserve_ticket_table) this.b;
                Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries = (Premium_reserve_ticket_tableQueries) this.c;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, premium_reserve_ticket_table.f1985a);
                execute3.d(1, Long.valueOf(premium_reserve_ticket_table.b));
                execute3.d(2, Long.valueOf(premium_reserve_ticket_table.c));
                execute3.bindString(3, (String) premium_reserve_ticket_tableQueries.b.f1986a.encode(premium_reserve_ticket_table.d));
                execute3.bindString(4, premium_reserve_ticket_table.e);
                execute3.bindString(5, premium_reserve_ticket_table.f);
                execute3.bindString(6, premium_reserve_ticket_table.g);
                execute3.bindString(7, premium_reserve_ticket_table.h);
                execute3.bindString(8, premium_reserve_ticket_table.i);
                execute3.bindString(9, premium_reserve_ticket_table.j);
                execute3.bindString(10, premium_reserve_ticket_table.k);
                execute3.bindString(11, premium_reserve_ticket_table.l);
                execute3.d(12, Long.valueOf(premium_reserve_ticket_table.m));
                execute3.d(13, Long.valueOf(premium_reserve_ticket_table.n));
                execute3.d(14, Long.valueOf(premium_reserve_ticket_table.o));
                execute3.bindString(15, premium_reserve_ticket_table.p);
                execute3.bindString(16, premium_reserve_ticket_table.q);
                execute3.bindString(17, premium_reserve_ticket_table.r);
                execute3.bindString(18, premium_reserve_ticket_table.s);
                execute3.bindString(19, premium_reserve_ticket_table.t);
                Premium_reserve_ticket_table.Adapter adapter2 = premium_reserve_ticket_tableQueries.b;
                execute3.bindString(20, (String) adapter2.b.encode(premium_reserve_ticket_table.u));
                execute3.bindString(21, (String) adapter2.c.encode(premium_reserve_ticket_table.v));
                execute3.b(22, Boolean.valueOf(premium_reserve_ticket_table.w));
                execute3.bindString(23, (String) adapter2.d.encode(premium_reserve_ticket_table.x));
                execute3.bindString(24, premium_reserve_ticket_table.y);
                execute3.d(25, premium_reserve_ticket_table.z);
                execute3.d(26, Long.valueOf(premium_reserve_ticket_table.A));
                execute3.d(27, Long.valueOf(premium_reserve_ticket_table.B));
                FirstBookingAppModel firstBookingAppModel = premium_reserve_ticket_table.C;
                execute3.bindString(28, firstBookingAppModel != null ? (String) adapter2.e.encode(firstBookingAppModel) : null);
                PremiumReserveTicketStatus premiumReserveTicketStatus = premium_reserve_ticket_table.D;
                execute3.bindString(29, premiumReserveTicketStatus != null ? (String) adapter2.f.encode(premiumReserveTicketStatus) : null);
                RefundInfoAppModel refundInfoAppModel = premium_reserve_ticket_table.E;
                execute3.bindString(30, refundInfoAppModel != null ? (String) adapter2.g.encode(refundInfoAppModel) : null);
                List list6 = premium_reserve_ticket_table.F;
                execute3.bindString(31, list6 != null ? (String) adapter2.h.encode(list6) : null);
                return Unit.f17538a;
            case 16:
                Premium_reserve_trip_table premium_reserve_trip_table = (Premium_reserve_trip_table) this.b;
                Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries2 = (Premium_reserve_trip_tableQueries) this.c;
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, premium_reserve_trip_table.f1987a);
                execute4.bindString(1, premium_reserve_trip_table.b);
                execute4.bindString(2, premium_reserve_trip_table.c);
                execute4.bindString(3, (String) premium_reserve_trip_tableQueries2.b.f1988a.encode(premium_reserve_trip_table.d));
                execute4.b(4, Boolean.valueOf(premium_reserve_trip_table.e));
                return Unit.f17538a;
            case 17:
                Super_pass_trip_receipt_table super_pass_trip_receipt_table = (Super_pass_trip_receipt_table) this.b;
                Product_activation_details_tableQueries product_activation_details_tableQueries = (Product_activation_details_tableQueries) this.c;
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, super_pass_trip_receipt_table.f2017a);
                execute5.bindString(1, super_pass_trip_receipt_table.b);
                execute5.bindString(2, super_pass_trip_receipt_table.c);
                execute5.d(3, Long.valueOf(super_pass_trip_receipt_table.d));
                execute5.d(4, Long.valueOf(super_pass_trip_receipt_table.e));
                execute5.bindString(5, super_pass_trip_receipt_table.f);
                execute5.bindString(6, super_pass_trip_receipt_table.g);
                execute5.bindString(7, super_pass_trip_receipt_table.h);
                execute5.bindString(8, super_pass_trip_receipt_table.i);
                execute5.bindString(9, super_pass_trip_receipt_table.j);
                execute5.bindString(10, (String) product_activation_details_tableQueries.b.f2018a.encode(super_pass_trip_receipt_table.k));
                execute5.bindString(11, super_pass_trip_receipt_table.l);
                execute5.bindString(12, (String) product_activation_details_tableQueries.b.b.encode(super_pass_trip_receipt_table.m));
                return Unit.f17538a;
            case 18:
                Function13 function14 = (Function13) this.b;
                Product_activation_details_tableQueries product_activation_details_tableQueries2 = (Product_activation_details_tableQueries) this.c;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string7 = sqlCursor2.getString(1);
                String strJ5 = cb0.j(string7, sqlCursor2, 2);
                Long l2 = sqlCursor2.getLong(3);
                Long lE2 = cb0.e(l2, sqlCursor2, 4);
                String string8 = sqlCursor2.getString(5);
                String strJ6 = cb0.j(string8, sqlCursor2, 6);
                String string9 = sqlCursor2.getString(7);
                String strJ7 = cb0.j(string9, sqlCursor2, 8);
                String string10 = sqlCursor2.getString(9);
                Intrinsics.f(string10);
                Super_pass_trip_receipt_table.Adapter adapter3 = product_activation_details_tableQueries2.b;
                return function14.invoke(strI2, string7, strJ5, l2, lE2, string8, strJ6, string9, strJ7, string10, cb0.f(sqlCursor2, 10, adapter3.f2018a), sqlCursor2.getString(11), cb0.g(sqlCursor2, 12, adapter3.b));
            case 19:
                QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) this.b;
                QRValidationComponent qRValidationComponent = (QRValidationComponent) this.c;
                QRValidationDataState currentState = (QRValidationDataState) obj;
                Intrinsics.i(currentState, "currentState");
                Iterator it7 = currentState.g.iterator();
                int i = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i = -1;
                    } else if (!((QrCodeData) it7.next()).c) {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                Throwable th = null;
                if (i < 0) {
                    numValueOf = null;
                }
                boolean z = qRValidationLifecycleResult.b;
                List list7 = qRValidationLifecycleResult.f10519a;
                long j2 = qRValidationLifecycleResult.d;
                long j3 = qRValidationLifecycleResult.e;
                qRValidationComponent.getClass();
                List listR = (list7.isEmpty() && qRValidationLifecycleResult.b) ? CollectionsKt.R(new QrInfo("CHALO_EXPIRED_QR_PLACEHOLDER", null, QRValidationStatus.UNKNOWN, QRValidationType.STATIC)) : list7;
                int iE = listR.isEmpty() ? -1 : numValueOf != null ? RangesKt.e(numValueOf.intValue(), 0, CollectionsKt.K(listR)) : 0;
                List list8 = listR;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list8, 10));
                int i2 = 0;
                for (Object obj3 : list8) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th2 = th;
                        CollectionsKt.z0();
                        throw th2;
                    }
                    QrInfo qrInfo = (QrInfo) obj3;
                    Throwable th3 = th;
                    arrayList4.add(new QrCodeData(qrInfo.f10520a, qrInfo.b, i2 == iE, qrInfo.d));
                    i2 = i3;
                    th = th3;
                }
                return QRValidationDataState.a(currentState, null, z, null, null, j2, j3, arrayList4, null, null, null, false, false, null, null, null, false, false, 130957);
            case 20:
                ProductValidationData productValidationData = (ProductValidationData) this.b;
                ProductReceiptData productReceiptData = (ProductReceiptData) this.c;
                QRValidationDataState currentState2 = (QRValidationDataState) obj;
                Intrinsics.i(currentState2, "currentState");
                PostPunchBottomSheetData postPunchBottomSheetData = new PostPunchBottomSheetData(productReceiptData, productValidationData);
                String f10462a = productReceiptData.getF10462a();
                String str2 = f10462a.length() > 0 ? f10462a : null;
                long c = productReceiptData.getC();
                return QRValidationDataState.a(currentState2, productValidationData, false, null, null, 0L, 0L, null, postPunchBottomSheetData, str2, c > 0 ? Long.valueOf(c) : null, false, false, null, QrScreenBottomSheetType.VALIDATION_SUCCESS, null, false, false, 121982);
            case 21:
                QRValidationDataState qRValidationDataState = (QRValidationDataState) obj;
                return QRValidationDataState.a(qRValidationDataState, null, false, null, null, 0L, 0L, QRValidationComponent.K0((QRValidationComponent) this.b, qRValidationDataState.g, ((QRValidationIntent.OnQrSwiped) this.c).f10640a), null, null, null, false, false, null, null, null, false, false, 131007);
            case 22:
                QuickPayDaoImpl quickPayDaoImpl = (QuickPayDaoImpl) this.b;
                QuickPayEntity quickPayEntity = (QuickPayEntity) this.c;
                TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction, "$this$transaction");
                quickPayDaoImpl.f10755a.g().W(quickPayEntity.i);
                quickPayDaoImpl.f10755a.g().e0(QuickPayEntityMapperKt.a(quickPayEntity));
                return Unit.f17538a;
            case 23:
                List list9 = (List) this.b;
                QuickPayDaoImpl quickPayDaoImpl2 = (QuickPayDaoImpl) this.c;
                TransactionWithoutReturn transaction2 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction2, "$this$transaction");
                Iterator it8 = list9.iterator();
                while (it8.hasNext()) {
                    quickPayDaoImpl2.p().X(QuickPayReceiptMapperKt.a((QuickPayReceipt) it8.next()));
                }
                return Unit.f17538a;
            case 24:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, TripAmountState.CORRECT_AMOUNT, ((QuickpayTripAmountComponent) this.b).y.a(((Number) ((ChaloUseCaseResult.Success) ((ChaloUseCaseResult) this.c)).f10419a).longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), null, 0L, false, false, null, 0L, false, null, 1004);
            case 25:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, false, null, 0L, ((QuickpayTripAmountIntent.ViewCreatedIntent) this.b).d.d, (String) this.c, 255);
            case 26:
                return RadioButtonKt.RadioButton$lambda$1$lambda$0((State) this.b, (State) this.c, (DrawScope) obj);
            case 27:
                return ExpressionsRuntimeKt.b(((RawProperty) this.b).g0((AnimationState) obj), (ScriptRuntime) this.c);
            case 28:
                Function2 function2 = (Function2) this.b;
                UniversalSearchRecentSearchItem.Place place = (UniversalSearchRecentSearchItem.Place) this.c;
                String favTitle = (String) obj;
                Intrinsics.i(favTitle, "favTitle");
                function2.invoke(favTitle, place);
                return Unit.f17538a;
            default:
                Function2 function3 = (Function2) this.b;
                UniversalSearchRecentSearchItem.Stop stop = (UniversalSearchRecentSearchItem.Stop) this.c;
                String favTitle2 = (String) obj;
                Intrinsics.i(favTitle2, "favTitle");
                function3.invoke(favTitle2, stop);
                return Unit.f17538a;
        }
    }
}
