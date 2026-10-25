package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.data.models.app.WomenAdjacencyPromiseState;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.StopsBetweenPickUpAndDropDialogData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIState;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketPostBookingActionState {
    public final boolean A;
    public final Integer B;
    public final boolean C;
    public final String D;
    public final List E;
    public final String F;
    public final ChaloMapUIState G;
    public final List H;
    public final WomenAdjacencyPromiseState I;
    public final VehicleBreakdownAppResponseModel J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7473a;
    public final boolean b;
    public final PremiumReserveTicketStatus c;
    public final PremiumStopDetailsAppModel d;
    public final PremiumStopDetailsAppModel e;
    public final String f;
    public final String g;
    public final Long h;
    public final PremiumBusPostBookingStopSchedule i;
    public final PremiumBusPostBookingStopSchedule j;
    public final PremiumBusBookingTripTimeInfoState k;
    public final StopsBetweenPickUpAndDropDialogData l;
    public final PremiumBusBookingVehicleInfoState m;
    public final List n;
    public final PremiumBusPostBookingBottomSheetType o;
    public final PremiumReserveTicketTrackingState p;
    public final PremiumReserveTicketStopDirectionsInfoState q;
    public final PremiumBusLiveTrackingState r;
    public final List s;
    public final boolean t;
    public final List u;
    public final List v;
    public final List w;
    public final String x;
    public final String y;
    public final String z;

    public PremiumReserveTicketPostBookingActionState(String str, boolean z, PremiumReserveTicketStatus premiumReserveTicketStatus, PremiumStopDetailsAppModel premiumStopDetailsAppModel, PremiumStopDetailsAppModel premiumStopDetailsAppModel2, String str2, String str3, Long l, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, List list, PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType, PremiumReserveTicketTrackingState premiumReserveTicketTrackingState, PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState, PremiumBusLiveTrackingState premiumBusLiveTrackingState, List list2, boolean z2, List pickUpStopImageDetails, List dropOffStopImageDetails, List routeStopList, String str4, String str5, String str6, boolean z3, Integer num, boolean z4, String str7, List tripCommunicationBanners, String str8, ChaloMapUIState chaloMapUIState, List selectedSeats, WomenAdjacencyPromiseState womenAdjacencyPromiseState, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel) {
        Intrinsics.i(pickUpStopImageDetails, "pickUpStopImageDetails");
        Intrinsics.i(dropOffStopImageDetails, "dropOffStopImageDetails");
        Intrinsics.i(routeStopList, "routeStopList");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(selectedSeats, "selectedSeats");
        this.f7473a = str;
        this.b = z;
        this.c = premiumReserveTicketStatus;
        this.d = premiumStopDetailsAppModel;
        this.e = premiumStopDetailsAppModel2;
        this.f = str2;
        this.g = str3;
        this.h = l;
        this.i = premiumBusPostBookingStopSchedule;
        this.j = premiumBusPostBookingStopSchedule2;
        this.k = premiumBusBookingTripTimeInfoState;
        this.l = stopsBetweenPickUpAndDropDialogData;
        this.m = premiumBusBookingVehicleInfoState;
        this.n = list;
        this.o = premiumBusPostBookingBottomSheetType;
        this.p = premiumReserveTicketTrackingState;
        this.q = premiumReserveTicketStopDirectionsInfoState;
        this.r = premiumBusLiveTrackingState;
        this.s = list2;
        this.t = z2;
        this.u = pickUpStopImageDetails;
        this.v = dropOffStopImageDetails;
        this.w = routeStopList;
        this.x = str4;
        this.y = str5;
        this.z = str6;
        this.A = z3;
        this.B = num;
        this.C = z4;
        this.D = str7;
        this.E = tripCommunicationBanners;
        this.F = str8;
        this.G = chaloMapUIState;
        this.H = selectedSeats;
        this.I = womenAdjacencyPromiseState;
        this.J = vehicleBreakdownAppResponseModel;
    }

    public static PremiumReserveTicketPostBookingActionState a(PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState, String str, PremiumReserveTicketStatus premiumReserveTicketStatus, PremiumStopDetailsAppModel premiumStopDetailsAppModel, PremiumStopDetailsAppModel premiumStopDetailsAppModel2, String str2, String str3, Long l, PremiumBusPostBookingStopSchedule.ScheduleAvailable scheduleAvailable, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, List list, PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType, PremiumReserveTicketTrackingState premiumReserveTicketTrackingState, PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState, PremiumBusLiveTrackingState premiumBusLiveTrackingState, ArrayList arrayList, boolean z, List list2, List list3, List list4, String str4, String str5, String str6, boolean z2, Integer num, boolean z3, String str7, List list5, String str8, List list6, WomenAdjacencyPromiseState womenAdjacencyPromiseState, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel, int i, int i2) {
        String str9 = (i & 1) != 0 ? premiumReserveTicketPostBookingActionState.f7473a : str;
        boolean z4 = (i & 2) != 0 ? premiumReserveTicketPostBookingActionState.b : true;
        PremiumReserveTicketStatus premiumReserveTicketStatus2 = (i & 4) != 0 ? premiumReserveTicketPostBookingActionState.c : premiumReserveTicketStatus;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel3 = (i & 8) != 0 ? premiumReserveTicketPostBookingActionState.d : premiumStopDetailsAppModel;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel4 = (i & 16) != 0 ? premiumReserveTicketPostBookingActionState.e : premiumStopDetailsAppModel2;
        String str10 = (i & 32) != 0 ? premiumReserveTicketPostBookingActionState.f : str2;
        String str11 = (i & 64) != 0 ? premiumReserveTicketPostBookingActionState.g : str3;
        Long l2 = (i & 128) != 0 ? premiumReserveTicketPostBookingActionState.h : l;
        PremiumBusPostBookingStopSchedule pickupStopScheduledTime = (i & 256) != 0 ? premiumReserveTicketPostBookingActionState.i : scheduleAvailable;
        PremiumBusPostBookingStopSchedule dropStopScheduleTime = (i & 512) != 0 ? premiumReserveTicketPostBookingActionState.j : PremiumBusPostBookingStopSchedule.NotApplicable.f7427a;
        premiumReserveTicketPostBookingActionState.getClass();
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2 = (i & 2048) != 0 ? premiumReserveTicketPostBookingActionState.k : premiumBusBookingTripTimeInfoState;
        StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData2 = (i & 4096) != 0 ? premiumReserveTicketPostBookingActionState.l : stopsBetweenPickUpAndDropDialogData;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState2 = (i & 8192) != 0 ? premiumReserveTicketPostBookingActionState.m : premiumBusBookingVehicleInfoState;
        List list7 = (i & 16384) != 0 ? premiumReserveTicketPostBookingActionState.n : list;
        PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType2 = (32768 & i) != 0 ? premiumReserveTicketPostBookingActionState.o : premiumBusPostBookingBottomSheetType;
        PremiumReserveTicketTrackingState trackingState = (65536 & i) != 0 ? premiumReserveTicketPostBookingActionState.p : premiumReserveTicketTrackingState;
        PremiumReserveTicketStopDirectionsInfoState stopDirectionsInfoState = (131072 & i) != 0 ? premiumReserveTicketPostBookingActionState.q : premiumReserveTicketStopDirectionsInfoState;
        PremiumBusLiveTrackingState premiumBusLiveTrackingState2 = (i & 262144) != 0 ? premiumReserveTicketPostBookingActionState.r : premiumBusLiveTrackingState;
        List list8 = (i & 524288) != 0 ? premiumReserveTicketPostBookingActionState.s : arrayList;
        boolean z5 = (i & 1048576) != 0 ? premiumReserveTicketPostBookingActionState.t : z;
        List pickUpStopImageDetails = (i & 2097152) != 0 ? premiumReserveTicketPostBookingActionState.u : list2;
        String str12 = str9;
        List dropOffStopImageDetails = (i & 4194304) != 0 ? premiumReserveTicketPostBookingActionState.v : list3;
        List routeStopList = (i & 8388608) != 0 ? premiumReserveTicketPostBookingActionState.w : list4;
        PremiumReserveTicketStatus premiumReserveTicketStatus3 = premiumReserveTicketStatus2;
        String str13 = (i & 16777216) != 0 ? premiumReserveTicketPostBookingActionState.x : str4;
        String str14 = (i & 33554432) != 0 ? premiumReserveTicketPostBookingActionState.y : str5;
        String str15 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? premiumReserveTicketPostBookingActionState.z : str6;
        boolean z6 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? premiumReserveTicketPostBookingActionState.A : z2;
        Integer num2 = (i & 268435456) != 0 ? premiumReserveTicketPostBookingActionState.B : num;
        boolean z7 = (i & 536870912) != 0 ? premiumReserveTicketPostBookingActionState.C : z3;
        String str16 = (i & 1073741824) != 0 ? premiumReserveTicketPostBookingActionState.D : str7;
        List tripCommunicationBanners = (i & Integer.MIN_VALUE) != 0 ? premiumReserveTicketPostBookingActionState.E : list5;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel5 = premiumStopDetailsAppModel3;
        String str17 = (i2 & 1) != 0 ? premiumReserveTicketPostBookingActionState.F : str8;
        ChaloMapUIState chaloMapUIState = premiumReserveTicketPostBookingActionState.G;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel6 = premiumStopDetailsAppModel4;
        List selectedSeats = (i2 & 4) != 0 ? premiumReserveTicketPostBookingActionState.H : list6;
        String str18 = str10;
        WomenAdjacencyPromiseState womenAdjacencyPromiseState2 = (i2 & 8) != 0 ? premiumReserveTicketPostBookingActionState.I : womenAdjacencyPromiseState;
        String str19 = str11;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel2 = (i2 & 16) != 0 ? premiumReserveTicketPostBookingActionState.J : vehicleBreakdownAppResponseModel;
        premiumReserveTicketPostBookingActionState.getClass();
        Intrinsics.i(pickupStopScheduledTime, "pickupStopScheduledTime");
        Intrinsics.i(dropStopScheduleTime, "dropStopScheduleTime");
        Intrinsics.i(trackingState, "trackingState");
        Intrinsics.i(stopDirectionsInfoState, "stopDirectionsInfoState");
        Intrinsics.i(pickUpStopImageDetails, "pickUpStopImageDetails");
        Intrinsics.i(dropOffStopImageDetails, "dropOffStopImageDetails");
        Intrinsics.i(routeStopList, "routeStopList");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(chaloMapUIState, "chaloMapUIState");
        Intrinsics.i(selectedSeats, "selectedSeats");
        Intrinsics.i(womenAdjacencyPromiseState2, "womenAdjacencyPromiseState");
        return new PremiumReserveTicketPostBookingActionState(str12, z4, premiumReserveTicketStatus3, premiumStopDetailsAppModel5, premiumStopDetailsAppModel6, str18, str19, l2, pickupStopScheduledTime, dropStopScheduleTime, premiumBusBookingTripTimeInfoState2, stopsBetweenPickUpAndDropDialogData2, premiumBusBookingVehicleInfoState2, list7, premiumBusPostBookingBottomSheetType2, trackingState, stopDirectionsInfoState, premiumBusLiveTrackingState2, list8, z5, pickUpStopImageDetails, dropOffStopImageDetails, routeStopList, str13, str14, str15, z6, num2, z7, str16, tripCommunicationBanners, str17, chaloMapUIState, selectedSeats, womenAdjacencyPromiseState2, vehicleBreakdownAppResponseModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketPostBookingActionState)) {
            return false;
        }
        PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState = (PremiumReserveTicketPostBookingActionState) obj;
        return Intrinsics.d(this.f7473a, premiumReserveTicketPostBookingActionState.f7473a) && this.b == premiumReserveTicketPostBookingActionState.b && this.c == premiumReserveTicketPostBookingActionState.c && Intrinsics.d(this.d, premiumReserveTicketPostBookingActionState.d) && Intrinsics.d(this.e, premiumReserveTicketPostBookingActionState.e) && Intrinsics.d(this.f, premiumReserveTicketPostBookingActionState.f) && Intrinsics.d(this.g, premiumReserveTicketPostBookingActionState.g) && Intrinsics.d(this.h, premiumReserveTicketPostBookingActionState.h) && Intrinsics.d(this.i, premiumReserveTicketPostBookingActionState.i) && Intrinsics.d(this.j, premiumReserveTicketPostBookingActionState.j) && Intrinsics.d(this.k, premiumReserveTicketPostBookingActionState.k) && Intrinsics.d(this.l, premiumReserveTicketPostBookingActionState.l) && Intrinsics.d(this.m, premiumReserveTicketPostBookingActionState.m) && Intrinsics.d(this.n, premiumReserveTicketPostBookingActionState.n) && Intrinsics.d(this.o, premiumReserveTicketPostBookingActionState.o) && Intrinsics.d(this.p, premiumReserveTicketPostBookingActionState.p) && Intrinsics.d(this.q, premiumReserveTicketPostBookingActionState.q) && Intrinsics.d(this.r, premiumReserveTicketPostBookingActionState.r) && Intrinsics.d(this.s, premiumReserveTicketPostBookingActionState.s) && this.t == premiumReserveTicketPostBookingActionState.t && Intrinsics.d(this.u, premiumReserveTicketPostBookingActionState.u) && Intrinsics.d(this.v, premiumReserveTicketPostBookingActionState.v) && Intrinsics.d(this.w, premiumReserveTicketPostBookingActionState.w) && Intrinsics.d(this.x, premiumReserveTicketPostBookingActionState.x) && Intrinsics.d(this.y, premiumReserveTicketPostBookingActionState.y) && Intrinsics.d(this.z, premiumReserveTicketPostBookingActionState.z) && this.A == premiumReserveTicketPostBookingActionState.A && Intrinsics.d(this.B, premiumReserveTicketPostBookingActionState.B) && this.C == premiumReserveTicketPostBookingActionState.C && Intrinsics.d(this.D, premiumReserveTicketPostBookingActionState.D) && Intrinsics.d(this.E, premiumReserveTicketPostBookingActionState.E) && Intrinsics.d(this.F, premiumReserveTicketPostBookingActionState.F) && Intrinsics.d(this.G, premiumReserveTicketPostBookingActionState.G) && Intrinsics.d(this.H, premiumReserveTicketPostBookingActionState.H) && Intrinsics.d(this.I, premiumReserveTicketPostBookingActionState.I) && Intrinsics.d(this.J, premiumReserveTicketPostBookingActionState.J);
    }

    public final int hashCode() {
        String str = this.f7473a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        PremiumReserveTicketStatus premiumReserveTicketStatus = this.c;
        int iHashCode2 = (iHashCode + (premiumReserveTicketStatus == null ? 0 : premiumReserveTicketStatus.hashCode())) * 31;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = this.d;
        int iHashCode3 = (iHashCode2 + (premiumStopDetailsAppModel == null ? 0 : premiumStopDetailsAppModel.hashCode())) * 31;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = this.e;
        int iHashCode4 = (iHashCode3 + (premiumStopDetailsAppModel2 == null ? 0 : premiumStopDetailsAppModel2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.h;
        int iHashCode7 = (this.j.hashCode() + ((this.i.hashCode() + ((iHashCode6 + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 961;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = this.k;
        int iHashCode8 = (iHashCode7 + (premiumBusBookingTripTimeInfoState == null ? 0 : premiumBusBookingTripTimeInfoState.hashCode())) * 31;
        StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData = this.l;
        int iHashCode9 = (iHashCode8 + (stopsBetweenPickUpAndDropDialogData == null ? 0 : stopsBetweenPickUpAndDropDialogData.hashCode())) * 31;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = this.m;
        int iHashCode10 = (iHashCode9 + (premiumBusBookingVehicleInfoState == null ? 0 : premiumBusBookingVehicleInfoState.hashCode())) * 31;
        List list = this.n;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType = this.o;
        int iHashCode12 = (this.q.hashCode() + ((this.p.hashCode() + ((iHashCode11 + (premiumBusPostBookingBottomSheetType == null ? 0 : premiumBusPostBookingBottomSheetType.hashCode())) * 31)) * 31)) * 31;
        PremiumBusLiveTrackingState premiumBusLiveTrackingState = this.r;
        int iHashCode13 = (iHashCode12 + (premiumBusLiveTrackingState == null ? 0 : premiumBusLiveTrackingState.hashCode())) * 31;
        List list2 = this.s;
        int iB = r30.b(r30.b(r30.b((((iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.t ? 1231 : 1237)) * 31, 31, this.u), 31, this.v), 31, this.w);
        String str4 = this.x;
        int iHashCode14 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.y;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.z;
        int iHashCode16 = (((iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.A ? 1231 : 1237)) * 31;
        Integer num = this.B;
        int iHashCode17 = (((iHashCode16 + (num == null ? 0 : num.hashCode())) * 31) + (this.C ? 1231 : 1237)) * 31;
        String str7 = this.D;
        int iB2 = r30.b((iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.E);
        String str8 = this.F;
        int iHashCode18 = (this.I.hashCode() + r30.b((this.G.hashCode() + ((iB2 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31, 31, this.H)) * 31;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel = this.J;
        return iHashCode18 + (vehicleBreakdownAppResponseModel != null ? vehicleBreakdownAppResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("PremiumReserveTicketPostBookingActionState(bookingId=", this.f7473a, ", isTicketDetailsInitialized=", ", ticketStatus=", this.b);
        sbM.append(this.c);
        sbM.append(", fromStopDetails=");
        sbM.append(this.d);
        sbM.append(", toStopDetails=");
        sbM.append(this.e);
        sbM.append(", routeName=");
        sbM.append(this.f);
        sbM.append(", routeId=");
        cb0.r(this.h, this.g, ", originalSlotTime=", ", pickupStopScheduledTime=", sbM);
        sbM.append(this.i);
        sbM.append(", dropStopScheduleTime=");
        sbM.append(this.j);
        sbM.append(", scheduledTimeStringWithoutDate=null, arrivalTimeInfo=");
        sbM.append(this.k);
        sbM.append(", stopsBetweenPickUpAndDropDialogData=");
        sbM.append(this.l);
        sbM.append(", vehicleInfoState=");
        sbM.append(this.m);
        sbM.append(", passengerCategoryDetails=");
        sbM.append(this.n);
        sbM.append(", dialogTypes=");
        sbM.append(this.o);
        sbM.append(", trackingState=");
        sbM.append(this.p);
        sbM.append(", stopDirectionsInfoState=");
        sbM.append(this.q);
        sbM.append(", liveTrackingState=");
        sbM.append(this.r);
        sbM.append(", stopNameListFromPickupToDrop=");
        sbM.append(this.s);
        sbM.append(", isLocationPermissionGranted=");
        sbM.append(this.t);
        sbM.append(", pickUpStopImageDetails=");
        dd.o(sbM, this.u, ", dropOffStopImageDetails=", this.v, ", routeStopList=");
        cb0.s(", userCancellationAndReschedulePolicyWebUrl=", this.x, ", passedStopName=", sbM, this.w);
        cb0.t(sbM, this.y, ", passedStopPassingTime=", this.z, ", isUserReadyToBoard=");
        sbM.append(this.A);
        sbM.append(", distanceFromBoardingStop=");
        sbM.append(this.B);
        sbM.append(", isBusTrackingDown=");
        pk0.x(", etaLastUpdateAtTimeString=", this.D, ", tripCommunicationBanners=", sbM, this.C);
        cb0.s(", firstBookingSlotTimeString=", this.F, ", chaloMapUIState=", sbM, this.E);
        sbM.append(this.G);
        sbM.append(", selectedSeats=");
        sbM.append(this.H);
        sbM.append(", womenAdjacencyPromiseState=");
        sbM.append(this.I);
        sbM.append(", vehicleBreakdownInfo=");
        sbM.append(this.J);
        sbM.append(")");
        return sbM.toString();
    }

    public PremiumReserveTicketPostBookingActionState() {
        EmptyList emptyList = EmptyList.f17557a;
        ChaloMapUIEventHandler.f9960a.getClass();
        ChaloMapUIState chaloMapUIState = new ChaloMapUIState(emptyList, false, MapCameraViewState.InitialState.NoState.f1881a, emptyList, null, null, (ChaloMapUIEventHandler) ChaloMapUIEventHandler.Companion.b.getValue(), 112);
        WomenAdjacencyPromiseState womenAdjacencyPromiseState = new WomenAdjacencyPromiseState();
        PremiumBusPostBookingStopSchedule.Unknown unknown = PremiumBusPostBookingStopSchedule.Unknown.f7429a;
        this(null, false, null, null, null, null, null, null, unknown, unknown, null, null, null, null, null, PremiumReserveTicketTrackingState.Unknown.f7480a, PremiumReserveTicketStopDirectionsInfoState.StopLocationNotAvailable.f7475a, null, null, false, emptyList, emptyList, emptyList, null, null, null, false, null, false, null, emptyList, null, chaloMapUIState, emptyList, womenAdjacencyPromiseState, null);
    }
}
