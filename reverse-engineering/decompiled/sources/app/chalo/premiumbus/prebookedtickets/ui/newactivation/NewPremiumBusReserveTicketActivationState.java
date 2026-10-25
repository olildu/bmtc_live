package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.premiumbus.data.models.app.WomenAdjacencyPromiseState;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.components.map.TrafficLayerConfig;
import defpackage.cb0;
import defpackage.dd;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewPremiumBusReserveTicketActivationState {
    public final boolean A;
    public final Integer B;
    public final boolean C;
    public final String D;
    public final List E;
    public final PBStopDetailsZoomedImageState F;
    public final PremiumBusPostBoardingDetailsTab G;
    public final List H;
    public final WomenAdjacencyPromiseState I;
    public final List J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7396a;
    public final String b;
    public final String c;
    public final String d;
    public final PremiumBusBookingTripTimeInfoState e;
    public final PremiumBusBookingVehicleInfoState f;
    public final PremiumBusPostBookingStopSchedule g;
    public final PremiumBusPostBookingStopSchedule h;
    public final String i;
    public final PremiumBusActivationScreenBottomSheetTypes j;
    public final StopsBetweenPickUpAndDropDialogData k;
    public final NewPremiumReserveTicketDetailsScreenType l;
    public final PremiumReserveTicketStopDirectionsInfoState m;
    public final PremiumReserveTicketTrackingState n;
    public final PremiumBusLiveTrackingState o;
    public final ChaloMapUIState p;
    public final IconButtonUIState q;
    public final Integer r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final List v;
    public final List w;
    public final String x;
    public final String y;
    public final String z;

    public NewPremiumBusReserveTicketActivationState(boolean z, String str, String str2, String str3, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2, String str4, PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes, StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState, PremiumReserveTicketTrackingState premiumReserveTicketTrackingState, PremiumBusLiveTrackingState premiumBusLiveTrackingState, ChaloMapUIState chaloMapUIState, IconButtonUIState iconButtonUIState, Integer num, boolean z2, boolean z3, List pickUpStopImageDetails, List dropOffStopImageDetails, List routeStopList, String str5, String str6, String str7, boolean z4, Integer num2, boolean z5, String str8, List tripCommunicationBanners, PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState, PremiumBusPostBoardingDetailsTab postValidationScreenSelectedTab, List selectedSeats, WomenAdjacencyPromiseState womenAdjacencyPromiseState, List list) {
        Intrinsics.i(pickUpStopImageDetails, "pickUpStopImageDetails");
        Intrinsics.i(dropOffStopImageDetails, "dropOffStopImageDetails");
        Intrinsics.i(routeStopList, "routeStopList");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(postValidationScreenSelectedTab, "postValidationScreenSelectedTab");
        Intrinsics.i(selectedSeats, "selectedSeats");
        this.f7396a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = premiumBusBookingTripTimeInfoState;
        this.f = premiumBusBookingVehicleInfoState;
        this.g = premiumBusPostBookingStopSchedule;
        this.h = premiumBusPostBookingStopSchedule2;
        this.i = str4;
        this.j = premiumBusActivationScreenBottomSheetTypes;
        this.k = stopsBetweenPickUpAndDropDialogData;
        this.l = newPremiumReserveTicketDetailsScreenType;
        this.m = premiumReserveTicketStopDirectionsInfoState;
        this.n = premiumReserveTicketTrackingState;
        this.o = premiumBusLiveTrackingState;
        this.p = chaloMapUIState;
        this.q = iconButtonUIState;
        this.r = num;
        this.s = z2;
        this.t = z3;
        this.u = pickUpStopImageDetails;
        this.v = dropOffStopImageDetails;
        this.w = routeStopList;
        this.x = str5;
        this.y = str6;
        this.z = str7;
        this.A = z4;
        this.B = num2;
        this.C = z5;
        this.D = str8;
        this.E = tripCommunicationBanners;
        this.F = pBStopDetailsZoomedImageState;
        this.G = postValidationScreenSelectedTab;
        this.H = selectedSeats;
        this.I = womenAdjacencyPromiseState;
        this.J = list;
    }

    public static NewPremiumBusReserveTicketActivationState a(NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, boolean z, String str, String str2, String str3, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2, String str4, PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes, StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState, PremiumReserveTicketTrackingState premiumReserveTicketTrackingState, PremiumBusLiveTrackingState premiumBusLiveTrackingState, ChaloMapUIState chaloMapUIState, IconButtonUIState iconButtonUIState, Integer num, boolean z2, boolean z3, List list, List list2, List list3, String str5, String str6, String str7, boolean z4, Integer num2, boolean z5, String str8, List list4, PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState, List list5, WomenAdjacencyPromiseState womenAdjacencyPromiseState, List list6, int i, int i2) {
        boolean z6 = (i & 1) != 0 ? newPremiumBusReserveTicketActivationState.f7396a : z;
        String str9 = (i & 2) != 0 ? newPremiumBusReserveTicketActivationState.b : str;
        String str10 = (i & 4) != 0 ? newPremiumBusReserveTicketActivationState.c : str2;
        String str11 = (i & 8) != 0 ? newPremiumBusReserveTicketActivationState.d : str3;
        newPremiumBusReserveTicketActivationState.getClass();
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2 = (i & 32) != 0 ? newPremiumBusReserveTicketActivationState.e : premiumBusBookingTripTimeInfoState;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState2 = (i & 64) != 0 ? newPremiumBusReserveTicketActivationState.f : premiumBusBookingVehicleInfoState;
        PremiumBusPostBookingStopSchedule pickupStopScheduleTime = (i & 128) != 0 ? newPremiumBusReserveTicketActivationState.g : premiumBusPostBookingStopSchedule;
        PremiumBusPostBookingStopSchedule dropStopScheduleTime = (i & 256) != 0 ? newPremiumBusReserveTicketActivationState.h : premiumBusPostBookingStopSchedule2;
        String str12 = (i & 512) != 0 ? newPremiumBusReserveTicketActivationState.i : str4;
        PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes2 = (i & 1024) != 0 ? newPremiumBusReserveTicketActivationState.j : premiumBusActivationScreenBottomSheetTypes;
        StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData2 = (i & 2048) != 0 ? newPremiumBusReserveTicketActivationState.k : stopsBetweenPickUpAndDropDialogData;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType2 = (i & 4096) != 0 ? newPremiumBusReserveTicketActivationState.l : newPremiumReserveTicketDetailsScreenType;
        PremiumReserveTicketStopDirectionsInfoState stopDirectionsInfoState = (i & 8192) != 0 ? newPremiumBusReserveTicketActivationState.m : premiumReserveTicketStopDirectionsInfoState;
        PremiumReserveTicketTrackingState trackingState = (i & 16384) != 0 ? newPremiumBusReserveTicketActivationState.n : premiumReserveTicketTrackingState;
        PremiumBusLiveTrackingState premiumBusLiveTrackingState2 = (i & 32768) != 0 ? newPremiumBusReserveTicketActivationState.o : premiumBusLiveTrackingState;
        ChaloMapUIState chaloMapUIState2 = (i & 65536) != 0 ? newPremiumBusReserveTicketActivationState.p : chaloMapUIState;
        boolean z7 = z6;
        IconButtonUIState iconButtonUIState2 = (i & 131072) != 0 ? newPremiumBusReserveTicketActivationState.q : iconButtonUIState;
        Integer num3 = (i & 262144) != 0 ? newPremiumBusReserveTicketActivationState.r : num;
        boolean z8 = (i & 524288) != 0 ? newPremiumBusReserveTicketActivationState.s : z2;
        boolean z9 = (i & 1048576) != 0 ? newPremiumBusReserveTicketActivationState.t : z3;
        List pickUpStopImageDetails = (i & 2097152) != 0 ? newPremiumBusReserveTicketActivationState.u : list;
        String str13 = str9;
        List dropOffStopImageDetails = (i & 4194304) != 0 ? newPremiumBusReserveTicketActivationState.v : list2;
        String str14 = str10;
        List routeStopList = (i & 8388608) != 0 ? newPremiumBusReserveTicketActivationState.w : list3;
        String str15 = str11;
        String str16 = (i & 16777216) != 0 ? newPremiumBusReserveTicketActivationState.x : str5;
        String str17 = (i & 33554432) != 0 ? newPremiumBusReserveTicketActivationState.y : str6;
        String str18 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? newPremiumBusReserveTicketActivationState.z : str7;
        boolean z10 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? newPremiumBusReserveTicketActivationState.A : z4;
        Integer num4 = (i & 268435456) != 0 ? newPremiumBusReserveTicketActivationState.B : num2;
        boolean z11 = (i & 536870912) != 0 ? newPremiumBusReserveTicketActivationState.C : z5;
        String str19 = (i & 1073741824) != 0 ? newPremiumBusReserveTicketActivationState.D : str8;
        List tripCommunicationBanners = (i & Integer.MIN_VALUE) != 0 ? newPremiumBusReserveTicketActivationState.E : list4;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState2;
        PBStopDetailsZoomedImageState zoomedImagesState = (i2 & 1) != 0 ? newPremiumBusReserveTicketActivationState.F : pBStopDetailsZoomedImageState;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState3 = premiumBusBookingVehicleInfoState2;
        PremiumBusPostBoardingDetailsTab postValidationScreenSelectedTab = (i2 & 2) != 0 ? newPremiumBusReserveTicketActivationState.G : null;
        String str20 = str12;
        List selectedSeats = (i2 & 4) != 0 ? newPremiumBusReserveTicketActivationState.H : list5;
        PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes3 = premiumBusActivationScreenBottomSheetTypes2;
        WomenAdjacencyPromiseState womenAdjacencyPromiseState2 = (i2 & 8) != 0 ? newPremiumBusReserveTicketActivationState.I : womenAdjacencyPromiseState;
        StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData3 = stopsBetweenPickUpAndDropDialogData2;
        List list7 = (i2 & 16) != 0 ? newPremiumBusReserveTicketActivationState.J : list6;
        newPremiumBusReserveTicketActivationState.getClass();
        Intrinsics.i(pickupStopScheduleTime, "pickupStopScheduleTime");
        Intrinsics.i(dropStopScheduleTime, "dropStopScheduleTime");
        Intrinsics.i(stopDirectionsInfoState, "stopDirectionsInfoState");
        Intrinsics.i(trackingState, "trackingState");
        Intrinsics.i(chaloMapUIState2, "chaloMapUIState");
        Intrinsics.i(pickUpStopImageDetails, "pickUpStopImageDetails");
        Intrinsics.i(dropOffStopImageDetails, "dropOffStopImageDetails");
        Intrinsics.i(routeStopList, "routeStopList");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(zoomedImagesState, "zoomedImagesState");
        Intrinsics.i(postValidationScreenSelectedTab, "postValidationScreenSelectedTab");
        Intrinsics.i(selectedSeats, "selectedSeats");
        Intrinsics.i(womenAdjacencyPromiseState2, "womenAdjacencyPromiseState");
        return new NewPremiumBusReserveTicketActivationState(z7, str13, str14, str15, premiumBusBookingTripTimeInfoState3, premiumBusBookingVehicleInfoState3, pickupStopScheduleTime, dropStopScheduleTime, str20, premiumBusActivationScreenBottomSheetTypes3, stopsBetweenPickUpAndDropDialogData3, newPremiumReserveTicketDetailsScreenType2, stopDirectionsInfoState, trackingState, premiumBusLiveTrackingState2, chaloMapUIState2, iconButtonUIState2, num3, z8, z9, pickUpStopImageDetails, dropOffStopImageDetails, routeStopList, str16, str17, str18, z10, num4, z11, str19, tripCommunicationBanners, zoomedImagesState, postValidationScreenSelectedTab, selectedSeats, womenAdjacencyPromiseState2, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPremiumBusReserveTicketActivationState)) {
            return false;
        }
        NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) obj;
        return this.f7396a == newPremiumBusReserveTicketActivationState.f7396a && Intrinsics.d(this.b, newPremiumBusReserveTicketActivationState.b) && Intrinsics.d(this.c, newPremiumBusReserveTicketActivationState.c) && Intrinsics.d(this.d, newPremiumBusReserveTicketActivationState.d) && Intrinsics.d(this.e, newPremiumBusReserveTicketActivationState.e) && Intrinsics.d(this.f, newPremiumBusReserveTicketActivationState.f) && Intrinsics.d(this.g, newPremiumBusReserveTicketActivationState.g) && Intrinsics.d(this.h, newPremiumBusReserveTicketActivationState.h) && Intrinsics.d(this.i, newPremiumBusReserveTicketActivationState.i) && Intrinsics.d(this.j, newPremiumBusReserveTicketActivationState.j) && Intrinsics.d(this.k, newPremiumBusReserveTicketActivationState.k) && this.l == newPremiumBusReserveTicketActivationState.l && Intrinsics.d(this.m, newPremiumBusReserveTicketActivationState.m) && Intrinsics.d(this.n, newPremiumBusReserveTicketActivationState.n) && Intrinsics.d(this.o, newPremiumBusReserveTicketActivationState.o) && Intrinsics.d(this.p, newPremiumBusReserveTicketActivationState.p) && Intrinsics.d(this.q, newPremiumBusReserveTicketActivationState.q) && Intrinsics.d(this.r, newPremiumBusReserveTicketActivationState.r) && this.s == newPremiumBusReserveTicketActivationState.s && this.t == newPremiumBusReserveTicketActivationState.t && Intrinsics.d(this.u, newPremiumBusReserveTicketActivationState.u) && Intrinsics.d(this.v, newPremiumBusReserveTicketActivationState.v) && Intrinsics.d(this.w, newPremiumBusReserveTicketActivationState.w) && Intrinsics.d(this.x, newPremiumBusReserveTicketActivationState.x) && Intrinsics.d(this.y, newPremiumBusReserveTicketActivationState.y) && Intrinsics.d(this.z, newPremiumBusReserveTicketActivationState.z) && this.A == newPremiumBusReserveTicketActivationState.A && Intrinsics.d(this.B, newPremiumBusReserveTicketActivationState.B) && this.C == newPremiumBusReserveTicketActivationState.C && Intrinsics.d(this.D, newPremiumBusReserveTicketActivationState.D) && Intrinsics.d(this.E, newPremiumBusReserveTicketActivationState.E) && Intrinsics.d(this.F, newPremiumBusReserveTicketActivationState.F) && this.G == newPremiumBusReserveTicketActivationState.G && Intrinsics.d(this.H, newPremiumBusReserveTicketActivationState.H) && Intrinsics.d(this.I, newPremiumBusReserveTicketActivationState.I) && Intrinsics.d(this.J, newPremiumBusReserveTicketActivationState.J);
    }

    public final int hashCode() {
        int i = (this.f7396a ? 1231 : 1237) * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = this.e;
        int iHashCode4 = (iHashCode3 + (premiumBusBookingTripTimeInfoState == null ? 0 : premiumBusBookingTripTimeInfoState.hashCode())) * 31;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = this.f;
        int iHashCode5 = (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode4 + (premiumBusBookingVehicleInfoState == null ? 0 : premiumBusBookingVehicleInfoState.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes = this.j;
        int iHashCode7 = (iHashCode6 + (premiumBusActivationScreenBottomSheetTypes == null ? 0 : premiumBusActivationScreenBottomSheetTypes.hashCode())) * 31;
        StopsBetweenPickUpAndDropDialogData stopsBetweenPickUpAndDropDialogData = this.k;
        int iHashCode8 = (iHashCode7 + (stopsBetweenPickUpAndDropDialogData == null ? 0 : stopsBetweenPickUpAndDropDialogData.hashCode())) * 31;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = this.l;
        int iHashCode9 = (this.n.hashCode() + ((this.m.hashCode() + ((iHashCode8 + (newPremiumReserveTicketDetailsScreenType == null ? 0 : newPremiumReserveTicketDetailsScreenType.hashCode())) * 31)) * 31)) * 31;
        PremiumBusLiveTrackingState premiumBusLiveTrackingState = this.o;
        int iHashCode10 = (this.p.hashCode() + ((iHashCode9 + (premiumBusLiveTrackingState == null ? 0 : premiumBusLiveTrackingState.hashCode())) * 31)) * 31;
        IconButtonUIState iconButtonUIState = this.q;
        int iHashCode11 = (iHashCode10 + (iconButtonUIState == null ? 0 : iconButtonUIState.hashCode())) * 31;
        Integer num = this.r;
        int iB = r30.b(r30.b(r30.b((((((iHashCode11 + (num == null ? 0 : num.hashCode())) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237)) * 31, 31, this.u), 31, this.v), 31, this.w);
        String str5 = this.x;
        int iHashCode12 = (iB + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.y;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.z;
        int iHashCode14 = (((iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31) + (this.A ? 1231 : 1237)) * 31;
        Integer num2 = this.B;
        int iHashCode15 = (((iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.C ? 1231 : 1237)) * 31;
        String str8 = this.D;
        int iHashCode16 = (this.I.hashCode() + r30.b((this.G.hashCode() + ((this.F.hashCode() + r30.b((iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.E)) * 31)) * 31, 31, this.H)) * 31;
        List list = this.J;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewPremiumBusReserveTicketActivationState(shouldSetupTicketDetailsSection=");
        sb.append(this.f7396a);
        sb.append(", fromStopName=");
        sb.append(this.b);
        sb.append(", toStopName=");
        cb0.t(sb, this.c, ", routeName=", this.d, ", originalSlotTime=null, tripTimeInfoState=");
        sb.append(this.e);
        sb.append(", vehicleInfoState=");
        sb.append(this.f);
        sb.append(", pickupStopScheduleTime=");
        sb.append(this.g);
        sb.append(", dropStopScheduleTime=");
        sb.append(this.h);
        sb.append(", numberOfSeats=");
        sb.append(this.i);
        sb.append(", dialogType=");
        sb.append(this.j);
        sb.append(", stopsBetweenPickUpAndDropDialogData=");
        sb.append(this.k);
        sb.append(", ticketDetailsScreenType=");
        sb.append(this.l);
        sb.append(", stopDirectionsInfoState=");
        sb.append(this.m);
        sb.append(", trackingState=");
        sb.append(this.n);
        sb.append(", liveTrackingState=");
        sb.append(this.o);
        sb.append(", chaloMapUIState=");
        sb.append(this.p);
        sb.append(", myLocationBtnUIState=");
        sb.append(this.q);
        sb.append(", noOfStopsBetweenPickUpAndDrop=");
        sb.append(this.r);
        sb.append(", showRouteFetchFailedSnackBar=");
        z40.r(sb, this.s, ", isLocationPermissionGranted=", this.t, ", pickUpStopImageDetails=");
        dd.o(sb, this.u, ", dropOffStopImageDetails=", this.v, ", routeStopList=");
        cb0.s(", userCancellationAndReschedulePolicyWebUrl=", this.x, ", passedStopName=", sb, this.w);
        cb0.t(sb, this.y, ", passesStopPassingTime=", this.z, ", isUserReadyToBoard=");
        sb.append(this.A);
        sb.append(", distanceFromBoardingStop=");
        sb.append(this.B);
        sb.append(", isBusTrackingDown=");
        pk0.x(", etaLastUpdateAtTimeString=", this.D, ", tripCommunicationBanners=", sb, this.C);
        sb.append(this.E);
        sb.append(", zoomedImagesState=");
        sb.append(this.F);
        sb.append(", postValidationScreenSelectedTab=");
        sb.append(this.G);
        sb.append(", selectedSeats=");
        sb.append(this.H);
        sb.append(", womenAdjacencyPromiseState=");
        sb.append(this.I);
        sb.append(", vehicleBreakDownUpcomingTrips=");
        sb.append(this.J);
        sb.append(")");
        return sb.toString();
    }

    public NewPremiumBusReserveTicketActivationState() {
        EmptyList emptyList = EmptyList.f17557a;
        TrafficLayerConfig trafficLayerConfig = new TrafficLayerConfig();
        ChaloMapUIEventHandler.f9960a.getClass();
        ChaloMapUIState chaloMapUIState = new ChaloMapUIState(emptyList, false, MapCameraViewState.InitialState.NoState.f1881a, emptyList, null, trafficLayerConfig, (ChaloMapUIEventHandler) ChaloMapUIEventHandler.Companion.b.getValue(), 48);
        PremiumBusPostBoardingDetailsTab premiumBusPostBoardingDetailsTab = PremiumBusPostBoardingDetailsTab.ROUTE;
        WomenAdjacencyPromiseState womenAdjacencyPromiseState = new WomenAdjacencyPromiseState();
        PremiumBusPostBookingStopSchedule.Unknown unknown = PremiumBusPostBookingStopSchedule.Unknown.f7429a;
        this(false, null, null, null, null, null, unknown, unknown, null, null, null, null, PremiumReserveTicketStopDirectionsInfoState.StopLocationNotAvailable.f7475a, PremiumReserveTicketTrackingState.Unknown.f7480a, null, chaloMapUIState, null, null, false, false, emptyList, emptyList, emptyList, null, null, null, false, null, false, null, emptyList, PBStopDetailsZoomedImageState.Hide.f7940a, premiumBusPostBoardingDetailsTab, emptyList, womenAdjacencyPromiseState, null);
    }
}
