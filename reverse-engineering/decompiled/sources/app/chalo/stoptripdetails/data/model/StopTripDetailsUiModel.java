package app.chalo.stoptripdetails.data.model;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopTripDetailsUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripDetailsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9470a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final SeatAvailabilityLevel h;
    public final boolean i;
    public final List j;
    public final StopETAModel k;
    public final String l;
    public final String m;
    public final boolean n;
    public final List o;
    public final int p;
    public final boolean q;
    public final ChaloTransitMode r;
    public final TimeTableStatus s;
    public final String t;
    public final RouteNamingSchemeType u;

    public StopTripDetailsUiModel(String stopId, String stopName, String routeId, String str, String tripId, String firstStopName, String destinationName, SeatAvailabilityLevel seatAvailabilityLevel, boolean z, List specialFeatureList, StopETAModel stopETAModel, String str2, String str3, boolean z2, List frequencyDataArray, int i, boolean z3, ChaloTransitMode transitMode, TimeTableStatus timeTableStatus, String str4, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(firstStopName, "firstStopName");
        Intrinsics.i(destinationName, "destinationName");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        Intrinsics.i(specialFeatureList, "specialFeatureList");
        Intrinsics.i(frequencyDataArray, "frequencyDataArray");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(timeTableStatus, "timeTableStatus");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f9470a = stopId;
        this.b = stopName;
        this.c = routeId;
        this.d = str;
        this.e = tripId;
        this.f = firstStopName;
        this.g = destinationName;
        this.h = seatAvailabilityLevel;
        this.i = z;
        this.j = specialFeatureList;
        this.k = stopETAModel;
        this.l = str2;
        this.m = str3;
        this.n = z2;
        this.o = frequencyDataArray;
        this.p = i;
        this.q = z3;
        this.r = transitMode;
        this.s = timeTableStatus;
        this.t = str4;
        this.u = routeNamingSchemeType;
    }

    public static StopTripDetailsUiModel a(StopTripDetailsUiModel stopTripDetailsUiModel, SeatAvailabilityLevel seatAvailabilityLevel, StopETAModel stopEtaModel, String str, boolean z, int i) {
        String stopId = stopTripDetailsUiModel.f9470a;
        String stopName = stopTripDetailsUiModel.b;
        String routeId = stopTripDetailsUiModel.c;
        String routeName = stopTripDetailsUiModel.d;
        String tripId = stopTripDetailsUiModel.e;
        String firstStopName = stopTripDetailsUiModel.f;
        String destinationName = stopTripDetailsUiModel.g;
        boolean z2 = stopTripDetailsUiModel.i;
        List specialFeatureList = stopTripDetailsUiModel.j;
        String str2 = stopTripDetailsUiModel.l;
        List frequencyDataArray = stopTripDetailsUiModel.o;
        boolean z3 = stopTripDetailsUiModel.q;
        ChaloTransitMode transitMode = stopTripDetailsUiModel.r;
        TimeTableStatus timeTableStatus = stopTripDetailsUiModel.s;
        String str3 = stopTripDetailsUiModel.t;
        RouteNamingSchemeType routeNamingSchemeType = stopTripDetailsUiModel.u;
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(firstStopName, "firstStopName");
        Intrinsics.i(destinationName, "destinationName");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        Intrinsics.i(specialFeatureList, "specialFeatureList");
        Intrinsics.i(stopEtaModel, "stopEtaModel");
        Intrinsics.i(frequencyDataArray, "frequencyDataArray");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(timeTableStatus, "timeTableStatus");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        return new StopTripDetailsUiModel(stopId, stopName, routeId, routeName, tripId, firstStopName, destinationName, seatAvailabilityLevel, z2, specialFeatureList, stopEtaModel, str2, str, z, frequencyDataArray, i, z3, transitMode, timeTableStatus, str3, routeNamingSchemeType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsUiModel)) {
            return false;
        }
        StopTripDetailsUiModel stopTripDetailsUiModel = (StopTripDetailsUiModel) obj;
        return Intrinsics.d(this.f9470a, stopTripDetailsUiModel.f9470a) && Intrinsics.d(this.b, stopTripDetailsUiModel.b) && Intrinsics.d(this.c, stopTripDetailsUiModel.c) && Intrinsics.d(this.d, stopTripDetailsUiModel.d) && Intrinsics.d(this.e, stopTripDetailsUiModel.e) && Intrinsics.d(this.f, stopTripDetailsUiModel.f) && Intrinsics.d(this.g, stopTripDetailsUiModel.g) && this.h == stopTripDetailsUiModel.h && this.i == stopTripDetailsUiModel.i && Intrinsics.d(this.j, stopTripDetailsUiModel.j) && Intrinsics.d(this.k, stopTripDetailsUiModel.k) && Intrinsics.d(this.l, stopTripDetailsUiModel.l) && Intrinsics.d(this.m, stopTripDetailsUiModel.m) && this.n == stopTripDetailsUiModel.n && Intrinsics.d(this.o, stopTripDetailsUiModel.o) && this.p == stopTripDetailsUiModel.p && this.q == stopTripDetailsUiModel.q && this.r == stopTripDetailsUiModel.r && this.s == stopTripDetailsUiModel.s && Intrinsics.d(this.t, stopTripDetailsUiModel.t) && this.u == stopTripDetailsUiModel.u;
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() + r30.b((((this.h.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f9470a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31) + (this.i ? 1231 : 1237)) * 31, 31, this.j)) * 31;
        String str = this.l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode3 = (this.s.hashCode() + n21.c(this.r, (((r30.b((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31, 31, this.o) + this.p) * 31) + (this.q ? 1231 : 1237)) * 31, 31)) * 31;
        String str3 = this.t;
        return this.u.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopTripDetailsUiModel(stopId=", this.f9470a, ", stopName=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", routeName=", this.d, ", tripId=");
        cb0.t(sbE, this.e, ", firstStopName=", this.f, ", destinationName=");
        sbE.append(this.g);
        sbE.append(", seatAvailabilityLevel=");
        sbE.append(this.h);
        sbE.append(", isTripAvailableToday=");
        hq0.w(sbE, this.i, ", specialFeatureList=", this.j, ", stopEtaModel=");
        sbE.append(this.k);
        sbE.append(", transportDescription=");
        sbE.append(this.l);
        sbE.append(", vehicleNumber=");
        t10.s(this.m, ", isTripEnabled=", ", frequencyDataArray=", sbE, this.n);
        sbE.append(this.o);
        sbE.append(", timeForSortingItems=");
        sbE.append(this.p);
        sbE.append(", isFrequencyTrip=");
        sbE.append(this.q);
        sbE.append(", transitMode=");
        sbE.append(this.r);
        sbE.append(", timeTableStatus=");
        sbE.append(this.s);
        sbE.append(", via=");
        sbE.append(this.t);
        sbE.append(", routeNamingSchemeType=");
        sbE.append(this.u);
        sbE.append(")");
        return sbE.toString();
    }

    public StopTripDetailsUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List list, StopETAModel stopETAModel, String str8, List list2, int i, ChaloTransitMode chaloTransitMode, TimeTableStatus timeTableStatus, String str9, RouteNamingSchemeType routeNamingSchemeType, int i2) {
        this(str, str2, str3, str4, str5, str6, str7, SeatAvailabilityLevel.UNKNOWN, z, list, stopETAModel, str8, null, true, list2, i, (i2 & 65536) == 0, chaloTransitMode, timeTableStatus, str9, routeNamingSchemeType);
    }
}
