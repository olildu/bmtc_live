package app.chalo.livetracking.tripplanner.data.models.api;

import app.chalo.livetracking.universalsearch.data.model.api.StopsInfoApiModel;
import defpackage.cb0;
import defpackage.cl1;
import defpackage.gf;
import defpackage.pk0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerLegApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] H;
    public final Integer A;
    public final Integer B;
    public final String C;
    public final String D;
    public final String E;
    public final LiveEtaApiModel F;
    public final TripPlannerModeRunningTimeRangeResponseApiModel G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4636a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Integer g;
    public final Integer h;
    public final String i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final Integer o;
    public final List p;
    public final String q;
    public final StopsInfoApiModel r;
    public final StopsInfoApiModel s;
    public final StopsInfoApiModel t;
    public final String u;
    public final String v;
    public final List w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/TripPlannerLegApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerLegApiResponseModel> serializer() {
            return TripPlannerLegApiResponseModel$$serializer.f4637a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        H = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(9)), null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new cl1(10)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TripPlannerLegApiResponseModel(int i, int i2, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num, Integer num2, String str, Boolean bool, String str2, String str3, Integer num3, String str4, Integer num4, List list, String str5, StopsInfoApiModel stopsInfoApiModel, StopsInfoApiModel stopsInfoApiModel2, StopsInfoApiModel stopsInfoApiModel3, String str6, String str7, List list2, String str8, String str9, String str10, Integer num5, Integer num6, String str11, String str12, String str13, LiveEtaApiModel liveEtaApiModel, TripPlannerModeRunningTimeRangeResponseApiModel tripPlannerModeRunningTimeRangeResponseApiModel) {
        if ((1 != (i2 & 1)) || (-1 != i)) {
            PluginExceptionsKt.a(new int[]{i, i2}, new int[]{-1, 1}, TripPlannerLegApiResponseModel$$serializer.f4637a.getDescriptor());
            throw null;
        }
        this.f4636a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = num;
        this.h = num2;
        this.i = str;
        this.j = bool;
        this.k = str2;
        this.l = str3;
        this.m = num3;
        this.n = str4;
        this.o = num4;
        this.p = list;
        this.q = str5;
        this.r = stopsInfoApiModel;
        this.s = stopsInfoApiModel2;
        this.t = stopsInfoApiModel3;
        this.u = str6;
        this.v = str7;
        this.w = list2;
        this.x = str8;
        this.y = str9;
        this.z = str10;
        this.A = num5;
        this.B = num6;
        this.C = str11;
        this.D = str12;
        this.E = str13;
        this.F = liveEtaApiModel;
        this.G = tripPlannerModeRunningTimeRangeResponseApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerLegApiResponseModel)) {
            return false;
        }
        TripPlannerLegApiResponseModel tripPlannerLegApiResponseModel = (TripPlannerLegApiResponseModel) obj;
        return Intrinsics.d(this.f4636a, tripPlannerLegApiResponseModel.f4636a) && Intrinsics.d(this.b, tripPlannerLegApiResponseModel.b) && Intrinsics.d(this.c, tripPlannerLegApiResponseModel.c) && Intrinsics.d(this.d, tripPlannerLegApiResponseModel.d) && Intrinsics.d(this.e, tripPlannerLegApiResponseModel.e) && Intrinsics.d(this.f, tripPlannerLegApiResponseModel.f) && Intrinsics.d(this.g, tripPlannerLegApiResponseModel.g) && Intrinsics.d(this.h, tripPlannerLegApiResponseModel.h) && Intrinsics.d(this.i, tripPlannerLegApiResponseModel.i) && Intrinsics.d(this.j, tripPlannerLegApiResponseModel.j) && Intrinsics.d(this.k, tripPlannerLegApiResponseModel.k) && Intrinsics.d(this.l, tripPlannerLegApiResponseModel.l) && Intrinsics.d(this.m, tripPlannerLegApiResponseModel.m) && Intrinsics.d(this.n, tripPlannerLegApiResponseModel.n) && Intrinsics.d(this.o, tripPlannerLegApiResponseModel.o) && Intrinsics.d(this.p, tripPlannerLegApiResponseModel.p) && Intrinsics.d(this.q, tripPlannerLegApiResponseModel.q) && Intrinsics.d(this.r, tripPlannerLegApiResponseModel.r) && Intrinsics.d(this.s, tripPlannerLegApiResponseModel.s) && Intrinsics.d(this.t, tripPlannerLegApiResponseModel.t) && Intrinsics.d(this.u, tripPlannerLegApiResponseModel.u) && Intrinsics.d(this.v, tripPlannerLegApiResponseModel.v) && Intrinsics.d(this.w, tripPlannerLegApiResponseModel.w) && Intrinsics.d(this.x, tripPlannerLegApiResponseModel.x) && Intrinsics.d(this.y, tripPlannerLegApiResponseModel.y) && Intrinsics.d(this.z, tripPlannerLegApiResponseModel.z) && Intrinsics.d(this.A, tripPlannerLegApiResponseModel.A) && Intrinsics.d(this.B, tripPlannerLegApiResponseModel.B) && Intrinsics.d(this.C, tripPlannerLegApiResponseModel.C) && Intrinsics.d(this.D, tripPlannerLegApiResponseModel.D) && Intrinsics.d(this.E, tripPlannerLegApiResponseModel.E) && Intrinsics.d(this.F, tripPlannerLegApiResponseModel.F) && Intrinsics.d(this.G, tripPlannerLegApiResponseModel.G);
    }

    public final int hashCode() {
        Double d = this.f4636a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.e;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.i;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.p;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.q;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StopsInfoApiModel stopsInfoApiModel = this.r;
        int iHashCode18 = (iHashCode17 + (stopsInfoApiModel == null ? 0 : stopsInfoApiModel.hashCode())) * 31;
        StopsInfoApiModel stopsInfoApiModel2 = this.s;
        int iHashCode19 = (iHashCode18 + (stopsInfoApiModel2 == null ? 0 : stopsInfoApiModel2.hashCode())) * 31;
        StopsInfoApiModel stopsInfoApiModel3 = this.t;
        int iHashCode20 = (iHashCode19 + (stopsInfoApiModel3 == null ? 0 : stopsInfoApiModel3.hashCode())) * 31;
        String str6 = this.u;
        int iHashCode21 = (iHashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.v;
        int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list2 = this.w;
        int iHashCode23 = (iHashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.x;
        int iHashCode24 = (iHashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.y;
        int iHashCode25 = (iHashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.z;
        int iHashCode26 = (iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.A;
        int iHashCode27 = (iHashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.B;
        int iHashCode28 = (iHashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str11 = this.C;
        int iHashCode29 = (iHashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.D;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.E;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        LiveEtaApiModel liveEtaApiModel = this.F;
        int iHashCode32 = (iHashCode31 + (liveEtaApiModel == null ? 0 : liveEtaApiModel.hashCode())) * 31;
        TripPlannerModeRunningTimeRangeResponseApiModel tripPlannerModeRunningTimeRangeResponseApiModel = this.G;
        return iHashCode32 + (tripPlannerModeRunningTimeRangeResponseApiModel != null ? tripPlannerModeRunningTimeRangeResponseApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerLegApiResponseModel(fromLat=");
        sb.append(this.f4636a);
        sb.append(", toLat=");
        sb.append(this.b);
        sb.append(", fromLon=");
        sb.append(this.c);
        sb.append(", toLon=");
        sb.append(this.d);
        sb.append(", distance=");
        sb.append(this.e);
        sb.append(", travelTime=");
        sb.append(this.f);
        sb.append(", frequency=");
        pk0.y(sb, this.g, ", ttType=", this.h, ", mode=");
        gf.v(this.j, this.i, ", isFrequencyLeg=", ", startPlaceName=", sb);
        cb0.t(sb, this.k, ", endPlaceName=", this.l, ", ttSid=");
        gf.w(this.m, ", polyline=", this.n, ", ttStatus=", sb);
        sb.append(this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", routeId=");
        sb.append(this.q);
        sb.append(", lastStop=");
        sb.append(this.r);
        sb.append(", firstStop=");
        sb.append(this.s);
        sb.append(", directionStop=");
        sb.append(this.t);
        sb.append(", agencyName=");
        cb0.t(sb, this.u, ", routeName=", this.v, ", intermediateStopsInfo=");
        cb0.s(", tripId=", this.x, ", routeSchemeType=", sb, this.w);
        cb0.t(sb, this.y, ", via=", this.z, ", startTime=");
        pk0.y(sb, this.A, ", endTime=", this.B, ", routeType=");
        cb0.t(sb, this.C, ", routeColor=", this.D, ", routeColorValue=");
        sb.append(this.E);
        sb.append(", liveEta=");
        sb.append(this.F);
        sb.append(", startingTimeRange=");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }
}
