package app.chalo.citydata.data.model.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.y21;
import defpackage.z40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteDetailOldApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteDetailOldApiModel {
    public static final Lazy[] A;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1670a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final long l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final List q;
    public final StopApiModel r;
    public final String s;
    public final Boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final String x;
    public final String y;
    public final List z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteDetailOldApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteDetailOldApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteDetailOldApiModel> serializer() {
            return RouteDetailOldApiModel$$serializer.f1671a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        A = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(11)), LazyKt.a(lazyThreadSafetyMode, new y21(12)), null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(13)), null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new y21(14))};
    }

    public /* synthetic */ RouteDetailOldApiModel(int i, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, String str5, long j, boolean z5, int i2, boolean z6, boolean z7, List list3, StopApiModel stopApiModel, String str6, Boolean bool, boolean z8, int i3, int i4, String str7, String str8, List list4) {
        if ((i & 1) == 0) {
            this.f1670a = null;
        } else {
            this.f1670a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        this.l = (i & 2048) == 0 ? 2L : j;
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z5;
        }
        if ((i & 8192) == 0) {
            this.n = 0;
        } else {
            this.n = i2;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z6;
        }
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z7;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list3;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = stopApiModel;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str6;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool;
        }
        if ((1048576 & i) == 0) {
            this.u = false;
        } else {
            this.u = z8;
        }
        if ((2097152 & i) == 0) {
            this.v = 0;
        } else {
            this.v = i3;
        }
        if ((4194304 & i) == 0) {
            this.w = 0;
        } else {
            this.w = i4;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str7;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str8;
        }
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailOldApiModel)) {
            return false;
        }
        RouteDetailOldApiModel routeDetailOldApiModel = (RouteDetailOldApiModel) obj;
        return Intrinsics.d(this.f1670a, routeDetailOldApiModel.f1670a) && Intrinsics.d(this.b, routeDetailOldApiModel.b) && Intrinsics.d(this.c, routeDetailOldApiModel.c) && Intrinsics.d(this.d, routeDetailOldApiModel.d) && Intrinsics.d(this.e, routeDetailOldApiModel.e) && Intrinsics.d(this.f, routeDetailOldApiModel.f) && this.g == routeDetailOldApiModel.g && this.h == routeDetailOldApiModel.h && this.i == routeDetailOldApiModel.i && this.j == routeDetailOldApiModel.j && Intrinsics.d(this.k, routeDetailOldApiModel.k) && this.l == routeDetailOldApiModel.l && this.m == routeDetailOldApiModel.m && this.n == routeDetailOldApiModel.n && this.o == routeDetailOldApiModel.o && this.p == routeDetailOldApiModel.p && Intrinsics.d(this.q, routeDetailOldApiModel.q) && Intrinsics.d(this.r, routeDetailOldApiModel.r) && Intrinsics.d(this.s, routeDetailOldApiModel.s) && Intrinsics.d(this.t, routeDetailOldApiModel.t) && this.u == routeDetailOldApiModel.u && this.v == routeDetailOldApiModel.v && this.w == routeDetailOldApiModel.w && Intrinsics.d(this.x, routeDetailOldApiModel.x) && Intrinsics.d(this.y, routeDetailOldApiModel.y) && Intrinsics.d(this.z, routeDetailOldApiModel.z);
    }

    public final int hashCode() {
        String str = this.f1670a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (((((((((iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31;
        String str5 = this.k;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        long j = this.l;
        int i = (((((((((((iHashCode6 + iHashCode7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.m ? 1231 : 1237)) * 31) + this.n) * 31) + (this.o ? 1231 : 1237)) * 31) + (this.p ? 1231 : 1237)) * 31;
        List list3 = this.q;
        int iHashCode8 = (i + (list3 == null ? 0 : list3.hashCode())) * 31;
        StopApiModel stopApiModel = this.r;
        int iHashCode9 = (iHashCode8 + (stopApiModel == null ? 0 : stopApiModel.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.t;
        int iHashCode11 = (((((((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.u ? 1231 : 1237)) * 31) + this.v) * 31) + this.w) * 31;
        String str7 = this.x;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.y;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list4 = this.z;
        return iHashCode13 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteDetailOldApiModel(routeId=", this.f1670a, ", routeName=", this.b, ", transportType=");
        cb0.t(sbE, this.c, ", agencyName=", this.d, ", legacyFeaturesList=");
        dd.o(sbE, this.e, ", specialFeaturesList=", this.f, ", mobileTicketing=");
        z40.r(sbE, this.g, ", mTicketEnabled=", this.h, ", routePassEnabled=");
        z40.r(sbE, this.i, ", isFreeRide=", this.j, ", polyLine=");
        n21.p(this.l, this.k, ", availabilityLevel=", sbE);
        sbE.append(", isRouteDisrupted=");
        sbE.append(this.m);
        sbE.append(", seatOccupancy=");
        sbE.append(this.n);
        sbE.append(", isAirportRoute=");
        sbE.append(this.o);
        sbE.append(", isPremiumBusRoute=");
        sbE.append(this.p);
        sbE.append(", stopSequenceWithDetails=");
        sbE.append(this.q);
        sbE.append(", directionStop=");
        sbE.append(this.r);
        sbE.append(", stationType=");
        sbE.append(this.s);
        sbE.append(", hasFrequencyTrips=");
        sbE.append(this.t);
        sbE.append(", shortTripEnabled=");
        sbE.append(this.u);
        sbE.append(", timeTableStatus=");
        sbE.append(this.v);
        sbE.append(", timeTableStatusId=");
        sbE.append(this.w);
        sbE.append(", via=");
        sbE.append(this.x);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.y);
        sbE.append(", trafficSignals=");
        sbE.append(this.z);
        sbE.append(")");
        return sbE.toString();
    }
}
