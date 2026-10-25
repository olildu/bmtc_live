package app.chalo.livetracking.universalsearch.data.model.api;

import defpackage.cb0;
import defpackage.d41;
import defpackage.dd;
import defpackage.n21;
import defpackage.pk0;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/RoutesDetailApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RoutesDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] F;
    public final int A;
    public final int B;
    public final String C;
    public final String D;
    public final String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4985a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final long p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final StopsInfoApiModel v;
    public final String w;
    public final Boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/RoutesDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/RoutesDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RoutesDetailApiModel> serializer() {
            return RoutesDetailApiModel$$serializer.f4986a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        F = new Lazy[]{null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new d41(16)), LazyKt.a(lazyThreadSafetyMode, new d41(17)), LazyKt.a(lazyThreadSafetyMode, new d41(18)), null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new d41(19)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ RoutesDetailApiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, String str8, long j, boolean z5, int i2, boolean z6, boolean z7, List list4, StopsInfoApiModel stopsInfoApiModel, String str9, Boolean bool, boolean z8, boolean z9, int i3, int i4, String str10, String str11, String str12) {
        if ((i & 1) == 0) {
            this.f4985a = null;
        } else {
            this.f4985a = str;
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
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list3;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z2;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z3;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        this.p = (32768 & i) == 0 ? 2L : j;
        if ((65536 & i) == 0) {
            this.q = false;
        } else {
            this.q = z5;
        }
        if ((131072 & i) == 0) {
            this.r = 0;
        } else {
            this.r = i2;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z6;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = stopsInfoApiModel;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str9;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool;
        }
        this.y = (16777216 & i) == 0 ? true : z8;
        if ((33554432 & i) == 0) {
            this.z = false;
        } else {
            this.z = z9;
        }
        if ((67108864 & i) == 0) {
            this.A = 0;
        } else {
            this.A = i3;
        }
        if ((134217728 & i) == 0) {
            this.B = 0;
        } else {
            this.B = i4;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = str10;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = str11;
        }
        if ((i & 1073741824) == 0) {
            this.E = null;
        } else {
            this.E = str12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDetailApiModel)) {
            return false;
        }
        RoutesDetailApiModel routesDetailApiModel = (RoutesDetailApiModel) obj;
        return Intrinsics.d(this.f4985a, routesDetailApiModel.f4985a) && Intrinsics.d(this.b, routesDetailApiModel.b) && Intrinsics.d(this.c, routesDetailApiModel.c) && Intrinsics.d(this.d, routesDetailApiModel.d) && Intrinsics.d(this.e, routesDetailApiModel.e) && Intrinsics.d(this.f, routesDetailApiModel.f) && Intrinsics.d(this.g, routesDetailApiModel.g) && Intrinsics.d(this.h, routesDetailApiModel.h) && Intrinsics.d(this.i, routesDetailApiModel.i) && Intrinsics.d(this.j, routesDetailApiModel.j) && this.k == routesDetailApiModel.k && this.l == routesDetailApiModel.l && this.m == routesDetailApiModel.m && this.n == routesDetailApiModel.n && Intrinsics.d(this.o, routesDetailApiModel.o) && this.p == routesDetailApiModel.p && this.q == routesDetailApiModel.q && this.r == routesDetailApiModel.r && this.s == routesDetailApiModel.s && this.t == routesDetailApiModel.t && Intrinsics.d(this.u, routesDetailApiModel.u) && Intrinsics.d(this.v, routesDetailApiModel.v) && Intrinsics.d(this.w, routesDetailApiModel.w) && Intrinsics.d(this.x, routesDetailApiModel.x) && this.y == routesDetailApiModel.y && this.z == routesDetailApiModel.z && this.A == routesDetailApiModel.A && this.B == routesDetailApiModel.B && Intrinsics.d(this.C, routesDetailApiModel.C) && Intrinsics.d(this.D, routesDetailApiModel.D) && Intrinsics.d(this.E, routesDetailApiModel.E);
    }

    public final int hashCode() {
        String str = this.f4985a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        int iHashCode10 = (((((((((iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237)) * 31;
        String str8 = this.o;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        long j = this.p;
        int i = (((((((((((iHashCode10 + iHashCode11) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.q ? 1231 : 1237)) * 31) + this.r) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237)) * 31;
        List list4 = this.u;
        int iHashCode12 = (i + (list4 == null ? 0 : list4.hashCode())) * 31;
        StopsInfoApiModel stopsInfoApiModel = this.v;
        int iHashCode13 = (iHashCode12 + (stopsInfoApiModel == null ? 0 : stopsInfoApiModel.hashCode())) * 31;
        String str9 = this.w;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.x;
        int iHashCode15 = (((((((((iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.y ? 1231 : 1237)) * 31) + (this.z ? 1231 : 1237)) * 31) + this.A) * 31) + this.B) * 31;
        String str10 = this.C;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.D;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.E;
        return iHashCode17 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RoutesDetailApiModel(routeId=", this.f4985a, ", routeName=", this.b, ", transportType=");
        cb0.t(sbE, this.c, ", firstStopName=", this.d, ", lastStopName=");
        cb0.t(sbE, this.e, ", directionStopName=", this.f, ", agencyName=");
        pk0.w(this.g, ", trackingSpecialFeature=", ", updateSpecialFeaturesList=", sbE, this.h);
        dd.o(sbE, this.i, ", stopSeq=", this.j, ", mobileTicketing=");
        z40.r(sbE, this.k, ", mTicketEnabled=", this.l, ", routePassEnabled=");
        z40.r(sbE, this.m, ", isFreeRide=", this.n, ", polyLine=");
        n21.p(this.p, this.o, ", availabilityLevel=", sbE);
        sbE.append(", isRouteDisrupted=");
        sbE.append(this.q);
        sbE.append(", seatOccupancy=");
        sbE.append(this.r);
        sbE.append(", isAirportRoute=");
        sbE.append(this.s);
        sbE.append(", isPremiumBusRoute=");
        sbE.append(this.t);
        sbE.append(", stopSequenceWithDetails=");
        sbE.append(this.u);
        sbE.append(", directionStop=");
        sbE.append(this.v);
        sbE.append(", stationType=");
        sbE.append(this.w);
        sbE.append(", hasFrequencyTrips=");
        sbE.append(this.x);
        sbE.append(", isLive=");
        sbE.append(this.y);
        sbE.append(", shortTripEnabled=");
        sbE.append(this.z);
        z40.o(this.A, this.B, ", timeTableStatus=", ", timeTableStatusId=", sbE);
        cb0.t(sbE, ", resultType=", this.C, ", via=", this.D);
        return z40.h(sbE, ", routeNamingScheme=", this.E, ")");
    }
}
