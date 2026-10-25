package defpackage;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.livetracking.provider.tracking.model.LiveVehicleDataAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.data.models.app.WomenAdjacencyPromiseState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveBusMarkerUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20069a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y20(FareDetailsComponent fareDetailsComponent, PassengerSelectionPolicy passengerSelectionPolicy, String str, ChaloUseCaseResult chaloUseCaseResult, List list, ApplicableRuleAppModel applicableRuleAppModel, String str2, String str3) {
        this.d = fareDetailsComponent;
        this.e = passengerSelectionPolicy;
        this.c = str;
        this.h = chaloUseCaseResult;
        this.b = list;
        this.i = applicableRuleAppModel;
        this.f = str2;
        this.g = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen;
        List list;
        switch (this.f20069a) {
            case 0:
                FareDetailsComponent fareDetailsComponent = (FareDetailsComponent) this.d;
                PassengerSelectionPolicy passengerSelectionPolicy = (PassengerSelectionPolicy) this.e;
                String str = (String) this.c;
                ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) this.h;
                ApplicableRuleAppModel applicableRuleAppModel = (ApplicableRuleAppModel) this.i;
                String str2 = (String) this.f;
                String str3 = (String) this.g;
                FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) obj;
                List listD0 = CollectionsKt.D0(fareDetailsComponent.O.values());
                boolean zP0 = FareDetailsComponent.P0(fareDetailsComponent);
                boolean zN0 = FareDetailsComponent.N0(fareDetailsComponent);
                boolean zA1 = fareDetailsComponent.a1(passengerSelectionPolicy, str);
                String strA = fareDetailsComponent.n.a(FareDetailsComponent.I0(fareDetailsComponent), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                FetchMobileTicketFareResponseAppModel fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                String str4 = fetchMobileTicketFareResponseAppModel.d;
                List list2 = this.b;
                if (list2 == null) {
                    list2 = fareDetailsViewState.p;
                }
                List list3 = list2;
                List list4 = fetchMobileTicketFareResponseAppModel.f;
                if (applicableRuleAppModel == null || (list = applicableRuleAppModel.f) == null) {
                    checkoutScreen = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ApplicableRuleUxCopyAppModel.CheckoutScreen) {
                            arrayList.add(obj2);
                        }
                    }
                    checkoutScreen = (ApplicableRuleUxCopyAppModel.CheckoutScreen) ((ApplicableRuleUxCopyAppModel) CollectionsKt.H(arrayList));
                }
                return FareDetailsViewState.a(fareDetailsViewState, null, null, null, false, false, false, null, listD0, strA, zN0, false, null, zA1, null, list3, false, str4, null, null, null, zP0, false, null, null, str2, false, null, false, str3, passengerSelectionPolicy, str, list4, checkoutScreen, null, 2004708471, 16);
            case 1:
                PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) this.d;
                List list5 = (List) this.e;
                MapCameraViewState.UpdatedState updatedState = (MapCameraViewState.UpdatedState) this.f;
                ArrayList arrayList2 = (ArrayList) this.g;
                LiveVehicleDataAppModel liveVehicleDataAppModel = (LiveVehicleDataAppModel) this.h;
                long j = liveVehicleDataAppModel.c;
                LiveBusDelayedState liveBusDelayedState = liveVehicleDataAppModel.h;
                String str5 = (String) this.c;
                TimeUtilsContract timeUtilsContract = ((PremiumReserveTicketPostBookingActionHandlerImpl) this.i).l;
                PremiumReserveTicketPostBookingActionState it = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it, "it");
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = it.r;
                List list6 = this.b;
                if (list6 != null) {
                    return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, list6, null, CollectionsKt.R(premiumBusLiveBusMarkerUIState), list5, updatedState, 14) : null, null, false, null, null, arrayList2, null, liveVehicleDataAppModel.j, str5, false, null, liveBusDelayedState instanceof LiveBusDelayedState.Delayed, timeUtilsContract.u(j, timeUtilsContract.b()), null, null, null, null, null, -1719926785, 31);
                }
                return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, null, null, CollectionsKt.R(premiumBusLiveBusMarkerUIState), list5, updatedState, 15) : null, null, false, null, null, arrayList2, null, liveVehicleDataAppModel.j, str5, false, null, liveBusDelayedState instanceof LiveBusDelayedState.Delayed, timeUtilsContract.u(j, timeUtilsContract.b()), null, null, null, null, null, -1719926785, 31);
            default:
                PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) this.d;
                PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = (PremiumBusBookingVehicleInfoState) this.e;
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.c;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f;
                List list7 = (List) this.g;
                WomenAdjacencyPromiseState womenAdjacencyPromiseState = (WomenAdjacencyPromiseState) this.h;
                VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel = (VehicleBreakdownAppResponseModel) this.i;
                PremiumReserveTicketPostBookingActionState it2 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it2, "it");
                return PremiumReserveTicketPostBookingActionState.a(it2, null, null, null, null, null, null, null, null, premiumBusBookingTripTimeInfoState, null, premiumBusBookingVehicleInfoState, null, null, null, null, null, null, false, null, null, null, null, null, null, booleanRef.element, (Integer) objectRef.element, false, null, this.b, null, list7, womenAdjacencyPromiseState, vehicleBreakdownAppResponseModel, 1744820223, 3);
        }
    }

    public /* synthetic */ y20(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, List list, List list2, WomenAdjacencyPromiseState womenAdjacencyPromiseState, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel) {
        this.d = premiumBusBookingTripTimeInfoState;
        this.e = premiumBusBookingVehicleInfoState;
        this.c = booleanRef;
        this.f = objectRef;
        this.b = list;
        this.g = list2;
        this.h = womenAdjacencyPromiseState;
        this.i = vehicleBreakdownAppResponseModel;
    }

    public /* synthetic */ y20(List list, PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState, List list2, MapCameraViewState.UpdatedState updatedState, ArrayList arrayList, LiveVehicleDataAppModel liveVehicleDataAppModel, String str, PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl) {
        this.b = list;
        this.d = premiumBusLiveBusMarkerUIState;
        this.e = list2;
        this.f = updatedState;
        this.g = arrayList;
        this.h = liveVehicleDataAppModel;
        this.c = str;
        this.i = premiumReserveTicketPostBookingActionHandlerImpl;
    }
}
