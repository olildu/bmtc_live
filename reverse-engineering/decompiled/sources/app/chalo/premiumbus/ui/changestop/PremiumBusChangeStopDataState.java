package app.chalo.premiumbus.ui.changestop;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusChangeStopDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7528a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final Map h;
    public final String i;
    public final Map j;
    public final String k;
    public final LatLng l;
    public final Long m;
    public final MapCameraViewState n;
    public final ChangeStopScreenState o;

    public PremiumBusChangeStopDataState(String str, String str2, String str3, String str4, String str5, List eligibleStops, String str6, Map map, String str7, Map map2, String str8, LatLng latLng, Long l, MapCameraViewState mapCameraViewState, ChangeStopScreenState screenState) {
        Intrinsics.i(eligibleStops, "eligibleStops");
        Intrinsics.i(mapCameraViewState, "mapCameraViewState");
        Intrinsics.i(screenState, "screenState");
        this.f7528a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = eligibleStops;
        this.g = str6;
        this.h = map;
        this.i = str7;
        this.j = map2;
        this.k = str8;
        this.l = latLng;
        this.m = l;
        this.n = mapCameraViewState;
        this.o = screenState;
    }

    public static PremiumBusChangeStopDataState a(PremiumBusChangeStopDataState premiumBusChangeStopDataState, String str, String str2, String str3, String str4, String str5, List list, String str6, Map map, String str7, Map map2, String str8, LatLng latLng, Long l, MapCameraViewState mapCameraViewState, ChangeStopScreenState changeStopScreenState, int i) {
        String str9 = (i & 1) != 0 ? premiumBusChangeStopDataState.f7528a : str;
        String str10 = (i & 2) != 0 ? premiumBusChangeStopDataState.b : str2;
        String str11 = (i & 4) != 0 ? premiumBusChangeStopDataState.c : str3;
        String str12 = (i & 8) != 0 ? premiumBusChangeStopDataState.d : str4;
        String str13 = (i & 16) != 0 ? premiumBusChangeStopDataState.e : str5;
        List eligibleStops = (i & 32) != 0 ? premiumBusChangeStopDataState.f : list;
        String str14 = (i & 64) != 0 ? premiumBusChangeStopDataState.g : str6;
        Map map3 = (i & 128) != 0 ? premiumBusChangeStopDataState.h : map;
        String routePolylineString = (i & 256) != 0 ? premiumBusChangeStopDataState.i : str7;
        Map map4 = (i & 512) != 0 ? premiumBusChangeStopDataState.j : map2;
        String str15 = (i & 1024) != 0 ? premiumBusChangeStopDataState.k : str8;
        LatLng latLng2 = (i & 2048) != 0 ? premiumBusChangeStopDataState.l : latLng;
        Long l2 = (i & 4096) != 0 ? premiumBusChangeStopDataState.m : l;
        MapCameraViewState mapCameraViewState2 = (i & 8192) != 0 ? premiumBusChangeStopDataState.n : mapCameraViewState;
        ChangeStopScreenState screenState = (i & 16384) != 0 ? premiumBusChangeStopDataState.o : changeStopScreenState;
        premiumBusChangeStopDataState.getClass();
        Intrinsics.i(eligibleStops, "eligibleStops");
        Intrinsics.i(routePolylineString, "routePolylineString");
        Intrinsics.i(mapCameraViewState2, "mapCameraViewState");
        Intrinsics.i(screenState, "screenState");
        return new PremiumBusChangeStopDataState(str9, str10, str11, str12, str13, eligibleStops, str14, map3, routePolylineString, map4, str15, latLng2, l2, mapCameraViewState2, screenState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusChangeStopDataState)) {
            return false;
        }
        PremiumBusChangeStopDataState premiumBusChangeStopDataState = (PremiumBusChangeStopDataState) obj;
        return Intrinsics.d(this.f7528a, premiumBusChangeStopDataState.f7528a) && Intrinsics.d(this.b, premiumBusChangeStopDataState.b) && Intrinsics.d(this.c, premiumBusChangeStopDataState.c) && Intrinsics.d(this.d, premiumBusChangeStopDataState.d) && Intrinsics.d(this.e, premiumBusChangeStopDataState.e) && Intrinsics.d(this.f, premiumBusChangeStopDataState.f) && Intrinsics.d(this.g, premiumBusChangeStopDataState.g) && Intrinsics.d(this.h, premiumBusChangeStopDataState.h) && Intrinsics.d(this.i, premiumBusChangeStopDataState.i) && Intrinsics.d(this.j, premiumBusChangeStopDataState.j) && Intrinsics.d(this.k, premiumBusChangeStopDataState.k) && Intrinsics.d(this.l, premiumBusChangeStopDataState.l) && Intrinsics.d(this.m, premiumBusChangeStopDataState.m) && Intrinsics.d(this.n, premiumBusChangeStopDataState.n) && Intrinsics.d(this.o, premiumBusChangeStopDataState.o);
    }

    public final int hashCode() {
        String str = this.f7528a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iB = r30.b((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f);
        String str6 = this.g;
        int iF = d.f(this.j, nf1.e(d.f(this.h, (iB + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31, this.i), 31);
        String str7 = this.k;
        int iHashCode5 = (iF + (str7 == null ? 0 : str7.hashCode())) * 31;
        LatLng latLng = this.l;
        int iHashCode6 = (iHashCode5 + (latLng == null ? 0 : latLng.hashCode())) * 31;
        Long l = this.m;
        return this.o.hashCode() + ((this.n.hashCode() + ((iHashCode6 + (l != null ? l.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusChangeStopDataState(bookingId=", this.f7528a, ", currentFromStopId=", this.b, ", currentToStopId=");
        cb0.t(sbE, this.c, ", routeId=", this.d, ", vehicleNumber=");
        pk0.w(this.e, ", eligibleStops=", ", selectedStopId=", sbE, this.f);
        sbE.append(this.g);
        sbE.append(", liveEtaByStopId=");
        sbE.append(this.h);
        sbE.append(", routePolylineString=");
        sbE.append(this.i);
        sbE.append(", stopLocationsById=");
        sbE.append(this.j);
        sbE.append(", agencyName=");
        sbE.append(this.k);
        sbE.append(", liveVehiclePosition=");
        sbE.append(this.l);
        sbE.append(", liveVehicleLastUpdatedAt=");
        sbE.append(this.m);
        sbE.append(", mapCameraViewState=");
        sbE.append(this.n);
        sbE.append(", screenState=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
