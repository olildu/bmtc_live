package app.chalo.citydata.data.model.api.response;

import defpackage.cb0;
import defpackage.d41;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteStaticDataApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteStaticDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1680a;
    public final String b;
    public final List c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final Boolean l;
    public final List m;
    public final List n;
    public final String o;
    public final Boolean p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final List t;
    public final List u;
    public final String v;
    public final String w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteStaticDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteStaticDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteStaticDataApiModel> serializer() {
            return RouteStaticDataApiModel$$serializer.f1681a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        x = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new d41(2)), null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new d41(3)), LazyKt.a(lazyThreadSafetyMode, new d41(4)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new d41(5)), LazyKt.a(lazyThreadSafetyMode, new d41(6)), null, null};
    }

    public /* synthetic */ RouteStaticDataApiModel(int i, String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str3, Boolean bool5, Integer num, Boolean bool6, Boolean bool7, List list2, List list3, String str4, Boolean bool8, Boolean bool9, Integer num2, Integer num3, List list4, List list5, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f1680a = null;
        } else {
            this.f1680a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = Boolean.FALSE;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = Boolean.FALSE;
        } else {
            this.f = bool3;
        }
        if ((i & 64) == 0) {
            this.g = Boolean.FALSE;
        } else {
            this.g = bool4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = Boolean.FALSE;
        } else {
            this.i = bool5;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = Boolean.FALSE;
        } else {
            this.k = bool6;
        }
        this.l = (i & 2048) == 0 ? Boolean.FALSE : bool7;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool8;
        }
        this.q = (65536 & i) == 0 ? Boolean.FALSE : bool9;
        if ((131072 & i) == 0) {
            this.r = 0;
        } else {
            this.r = num2;
        }
        if ((262144 & i) == 0) {
            this.s = 0;
        } else {
            this.s = num3;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = list4;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list5;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str5;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStaticDataApiModel)) {
            return false;
        }
        RouteStaticDataApiModel routeStaticDataApiModel = (RouteStaticDataApiModel) obj;
        return Intrinsics.d(this.f1680a, routeStaticDataApiModel.f1680a) && Intrinsics.d(this.b, routeStaticDataApiModel.b) && Intrinsics.d(this.c, routeStaticDataApiModel.c) && Intrinsics.d(this.d, routeStaticDataApiModel.d) && Intrinsics.d(this.e, routeStaticDataApiModel.e) && Intrinsics.d(this.f, routeStaticDataApiModel.f) && Intrinsics.d(this.g, routeStaticDataApiModel.g) && Intrinsics.d(this.h, routeStaticDataApiModel.h) && Intrinsics.d(this.i, routeStaticDataApiModel.i) && Intrinsics.d(this.j, routeStaticDataApiModel.j) && Intrinsics.d(this.k, routeStaticDataApiModel.k) && Intrinsics.d(this.l, routeStaticDataApiModel.l) && Intrinsics.d(this.m, routeStaticDataApiModel.m) && Intrinsics.d(this.n, routeStaticDataApiModel.n) && Intrinsics.d(this.o, routeStaticDataApiModel.o) && Intrinsics.d(this.p, routeStaticDataApiModel.p) && Intrinsics.d(this.q, routeStaticDataApiModel.q) && Intrinsics.d(this.r, routeStaticDataApiModel.r) && Intrinsics.d(this.s, routeStaticDataApiModel.s) && Intrinsics.d(this.t, routeStaticDataApiModel.t) && Intrinsics.d(this.u, routeStaticDataApiModel.u) && Intrinsics.d(this.v, routeStaticDataApiModel.v) && Intrinsics.d(this.w, routeStaticDataApiModel.w);
    }

    public final int hashCode() {
        String str = this.f1680a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.g;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool5 = this.i;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool6 = this.k;
        int iHashCode11 = (iHashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.l;
        int iHashCode12 = (iHashCode11 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.n;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool8 = this.p;
        int iHashCode16 = (iHashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.q;
        int iHashCode17 = (iHashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Integer num2 = this.r;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.s;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list4 = this.t;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.u;
        int iHashCode21 = (iHashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str5 = this.v;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        return iHashCode22 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteStaticDataApiModel(routeName=", this.f1680a, ", agencyName=", this.b, ", specialFeaturesList=");
        sbE.append(this.c);
        sbE.append(", mobileTicketing=");
        sbE.append(this.d);
        sbE.append(", mTicketEnabled=");
        hq0.u(sbE, this.e, ", routePassEnabled=", this.f, ", isFreeRide=");
        hq0.t(this.g, ", polyLine=", this.h, ", isRouteDisrupted=", sbE);
        sbE.append(this.i);
        sbE.append(", seatOccupancy=");
        sbE.append(this.j);
        sbE.append(", isAirportRoute=");
        hq0.u(sbE, this.k, ", isPremiumBusRoute=", this.l, ", stopSequenceWithDetails=");
        dd.o(sbE, this.m, ", trafficSignals=", this.n, ", stationType=");
        gf.v(this.p, this.o, ", hasFrequencyTrips=", ", shortTripEnabled=", sbE);
        sbE.append(this.q);
        sbE.append(", timeTableStatus=");
        sbE.append(this.r);
        sbE.append(", timeTableStatusId=");
        sbE.append(this.s);
        sbE.append(", timeTable=");
        sbE.append(this.t);
        sbE.append(", shortTrips=");
        cb0.s(", via=", this.v, ", routeNamingScheme=", sbE, this.u);
        return vo1.p(sbE, this.w, ")");
    }
}
