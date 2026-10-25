package app.chalo.metro.ui.regular;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.metro.ui.landing.PickStopRequestType;
import app.chalo.models.productbooking.productcapability.OperationalHoursAppModel;
import app.chalo.productbooking.common.data.models.app.response.TicketBookingFareAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedMetroLandingScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketBookingFareAppModel f5534a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final PickStopRequestType f;
    public final List g;
    public final List h;
    public final StopAppModel i;
    public final StopAppModel j;
    public final StopBasedMetroLandingScreenBottomSheetType k;
    public final Map l;
    public final OperationalHoursAppModel m;

    public StopBasedMetroLandingScreenDataState(TicketBookingFareAppModel ticketBookingFareAppModel, boolean z, String str, String str2, List list, PickStopRequestType pickStopRequestType, List applicableStopList, List recentStopBasedTripAppModel, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopBasedMetroLandingScreenBottomSheetType bottomSheetState, Map map, OperationalHoursAppModel operationalHoursAppModel) {
        Intrinsics.i(pickStopRequestType, "pickStopRequestType");
        Intrinsics.i(applicableStopList, "applicableStopList");
        Intrinsics.i(recentStopBasedTripAppModel, "recentStopBasedTripAppModel");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        this.f5534a = ticketBookingFareAppModel;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = pickStopRequestType;
        this.g = applicableStopList;
        this.h = recentStopBasedTripAppModel;
        this.i = stopAppModel;
        this.j = stopAppModel2;
        this.k = bottomSheetState;
        this.l = map;
        this.m = operationalHoursAppModel;
    }

    public static StopBasedMetroLandingScreenDataState a(StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState, TicketBookingFareAppModel ticketBookingFareAppModel, boolean z, String str, String str2, List list, PickStopRequestType pickStopRequestType, List list2, List list3, StopAppModel stopAppModel, StopAppModel stopAppModel2, StopBasedMetroLandingScreenBottomSheetType stopBasedMetroLandingScreenBottomSheetType, LinkedHashMap linkedHashMap, OperationalHoursAppModel operationalHoursAppModel, int i) {
        if ((i & 1) != 0) {
            ticketBookingFareAppModel = stopBasedMetroLandingScreenDataState.f5534a;
        }
        TicketBookingFareAppModel ticketBookingFareAppModel2 = ticketBookingFareAppModel;
        boolean z2 = (i & 2) != 0 ? stopBasedMetroLandingScreenDataState.b : z;
        String str3 = (i & 4) != 0 ? stopBasedMetroLandingScreenDataState.c : str;
        String str4 = (i & 8) != 0 ? stopBasedMetroLandingScreenDataState.d : str2;
        List list4 = (i & 16) != 0 ? stopBasedMetroLandingScreenDataState.e : list;
        PickStopRequestType pickStopRequestType2 = (i & 32) != 0 ? stopBasedMetroLandingScreenDataState.f : pickStopRequestType;
        List applicableStopList = (i & 64) != 0 ? stopBasedMetroLandingScreenDataState.g : list2;
        List recentStopBasedTripAppModel = (i & 128) != 0 ? stopBasedMetroLandingScreenDataState.h : list3;
        StopAppModel stopAppModel3 = (i & 256) != 0 ? stopBasedMetroLandingScreenDataState.i : stopAppModel;
        StopAppModel stopAppModel4 = (i & 512) != 0 ? stopBasedMetroLandingScreenDataState.j : stopAppModel2;
        StopBasedMetroLandingScreenBottomSheetType bottomSheetState = (i & 1024) != 0 ? stopBasedMetroLandingScreenDataState.k : stopBasedMetroLandingScreenBottomSheetType;
        Map map = (i & 2048) != 0 ? stopBasedMetroLandingScreenDataState.l : linkedHashMap;
        OperationalHoursAppModel operationalHoursAppModel2 = (i & 4096) != 0 ? stopBasedMetroLandingScreenDataState.m : operationalHoursAppModel;
        stopBasedMetroLandingScreenDataState.getClass();
        Intrinsics.i(pickStopRequestType2, "pickStopRequestType");
        Intrinsics.i(applicableStopList, "applicableStopList");
        Intrinsics.i(recentStopBasedTripAppModel, "recentStopBasedTripAppModel");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        return new StopBasedMetroLandingScreenDataState(ticketBookingFareAppModel2, z2, str3, str4, list4, pickStopRequestType2, applicableStopList, recentStopBasedTripAppModel, stopAppModel3, stopAppModel4, bottomSheetState, map, operationalHoursAppModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedMetroLandingScreenDataState)) {
            return false;
        }
        StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState = (StopBasedMetroLandingScreenDataState) obj;
        return Intrinsics.d(this.f5534a, stopBasedMetroLandingScreenDataState.f5534a) && this.b == stopBasedMetroLandingScreenDataState.b && Intrinsics.d(this.c, stopBasedMetroLandingScreenDataState.c) && Intrinsics.d(this.d, stopBasedMetroLandingScreenDataState.d) && Intrinsics.d(this.e, stopBasedMetroLandingScreenDataState.e) && this.f == stopBasedMetroLandingScreenDataState.f && Intrinsics.d(this.g, stopBasedMetroLandingScreenDataState.g) && Intrinsics.d(this.h, stopBasedMetroLandingScreenDataState.h) && Intrinsics.d(this.i, stopBasedMetroLandingScreenDataState.i) && Intrinsics.d(this.j, stopBasedMetroLandingScreenDataState.j) && this.k == stopBasedMetroLandingScreenDataState.k && Intrinsics.d(this.l, stopBasedMetroLandingScreenDataState.l) && Intrinsics.d(this.m, stopBasedMetroLandingScreenDataState.m);
    }

    public final int hashCode() {
        TicketBookingFareAppModel ticketBookingFareAppModel = this.f5534a;
        int iHashCode = (((ticketBookingFareAppModel == null ? 0 : ticketBookingFareAppModel.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int iB = r30.b(r30.b((this.f.hashCode() + ((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.g), 31, this.h);
        StopAppModel stopAppModel = this.i;
        int iHashCode4 = (iB + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.j;
        int iHashCode5 = (this.k.hashCode() + ((iHashCode4 + (stopAppModel2 == null ? 0 : stopAppModel2.hashCode())) * 31)) * 31;
        Map map = this.l;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        OperationalHoursAppModel operationalHoursAppModel = this.m;
        return iHashCode6 + (operationalHoursAppModel != null ? operationalHoursAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopBasedMetroLandingScreenDataState(bookingFareAppModel=");
        sb.append(this.f5534a);
        sb.append(", showLoadingDialog=");
        sb.append(this.b);
        sb.append(", configId=");
        cb0.t(sb, this.c, ", agencyName=", this.d, ", productTnc=");
        sb.append(this.e);
        sb.append(", pickStopRequestType=");
        sb.append(this.f);
        sb.append(", applicableStopList=");
        dd.o(sb, this.g, ", recentStopBasedTripAppModel=", this.h, ", selectedFromStation=");
        sb.append(this.i);
        sb.append(", selectedToStation=");
        sb.append(this.j);
        sb.append(", bottomSheetState=");
        sb.append(this.k);
        sb.append(", passengerSelectionMap=");
        sb.append(this.l);
        sb.append(", operationHours=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
