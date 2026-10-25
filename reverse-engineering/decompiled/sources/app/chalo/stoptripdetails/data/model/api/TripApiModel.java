package app.chalo.stoptripdetails.data.model.api;

import app.chalo.citydata.data.model.api.response.StopApiModel;
import defpackage.cb0;
import defpackage.cl1;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xi1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9486a;
    public final StopApiModel b;
    public final int c;
    public final Boolean d;
    public final StopApiModel e;
    public final List f;
    public final Boolean g;
    public final Boolean h;
    public final StopApiModel i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final String n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final int r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/TripApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripApiModel> serializer() {
            return TripApiModel$$serializer.f9487a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(28)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(29)), LazyKt.a(lazyThreadSafetyMode, new cl1(0)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TripApiModel(int i, String str, StopApiModel stopApiModel, int i2, Boolean bool, StopApiModel stopApiModel2, List list, Boolean bool2, Boolean bool3, StopApiModel stopApiModel3, String str2, String str3, List list2, List list3, String str4, String str5, Integer num, Integer num2, int i3, String str6, String str7, String str8, String str9) {
        if (4194303 != (i & 4194303)) {
            PluginExceptionsKt.b(TripApiModel$$serializer.f9487a.getDescriptor(), i, 4194303);
            throw null;
        }
        this.f9486a = str;
        this.b = stopApiModel;
        this.c = i2;
        this.d = bool;
        this.e = stopApiModel2;
        this.f = list;
        this.g = bool2;
        this.h = bool3;
        this.i = stopApiModel3;
        this.j = str2;
        this.k = str3;
        this.l = list2;
        this.m = list3;
        this.n = str4;
        this.o = str5;
        this.p = num;
        this.q = num2;
        this.r = i3;
        this.s = str6;
        this.t = str7;
        this.u = str8;
        this.v = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripApiModel)) {
            return false;
        }
        TripApiModel tripApiModel = (TripApiModel) obj;
        return Intrinsics.d(this.f9486a, tripApiModel.f9486a) && Intrinsics.d(this.b, tripApiModel.b) && this.c == tripApiModel.c && Intrinsics.d(this.d, tripApiModel.d) && Intrinsics.d(this.e, tripApiModel.e) && Intrinsics.d(this.f, tripApiModel.f) && Intrinsics.d(this.g, tripApiModel.g) && Intrinsics.d(this.h, tripApiModel.h) && Intrinsics.d(this.i, tripApiModel.i) && Intrinsics.d(this.j, tripApiModel.j) && Intrinsics.d(this.k, tripApiModel.k) && Intrinsics.d(this.l, tripApiModel.l) && Intrinsics.d(this.m, tripApiModel.m) && Intrinsics.d(this.n, tripApiModel.n) && Intrinsics.d(this.o, tripApiModel.o) && Intrinsics.d(this.p, tripApiModel.p) && Intrinsics.d(this.q, tripApiModel.q) && this.r == tripApiModel.r && Intrinsics.d(this.s, tripApiModel.s) && Intrinsics.d(this.t, tripApiModel.t) && Intrinsics.d(this.u, tripApiModel.u) && Intrinsics.d(this.v, tripApiModel.v);
    }

    public final int hashCode() {
        String str = this.f9486a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        StopApiModel stopApiModel = this.b;
        int iHashCode2 = (((iHashCode + (stopApiModel == null ? 0 : stopApiModel.hashCode())) * 31) + this.c) * 31;
        Boolean bool = this.d;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        StopApiModel stopApiModel2 = this.e;
        int iHashCode4 = (iHashCode3 + (stopApiModel2 == null ? 0 : stopApiModel2.hashCode())) * 31;
        List list = this.f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        StopApiModel stopApiModel3 = this.i;
        int iE = nf1.e((iHashCode7 + (stopApiModel3 == null ? 0 : stopApiModel3.hashCode())) * 31, 31, this.j);
        String str2 = this.k;
        int iHashCode8 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.m;
        int iE2 = nf1.e(nf1.e((iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.n), 31, this.o);
        Integer num = this.p;
        int iHashCode10 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.q;
        int iHashCode11 = (((iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.r) * 31;
        String str3 = this.s;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.t;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.v;
        return iHashCode14 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripApiModel(agencyName=");
        sb.append(this.f9486a);
        sb.append(", directionStop=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", extrapolated=");
        sb.append(this.d);
        sb.append(", firstStop=");
        sb.append(this.e);
        sb.append(", frequencyDataArray=");
        sb.append(this.f);
        sb.append(", isFrequencyTrip=");
        hq0.u(sb, this.g, ", isShortTrip=", this.h, ", lastStop=");
        sb.append(this.i);
        sb.append(", routeId=");
        sb.append(this.j);
        sb.append(", routeName=");
        pk0.w(this.k, ", specialFeatures=", ", spf=", sb, this.l);
        cb0.s(", transportType=", this.n, ", tripId=", sb, this.m);
        xs.u(this.p, this.o, ", ttSid=", ", ttStatus=", sb);
        sb.append(this.q);
        sb.append(", ttType=");
        sb.append(this.r);
        sb.append(", platform=");
        cb0.t(sb, this.s, ", availabilityLevel=", this.t, ", via=");
        return r30.i(sb, this.u, ", routeNamingScheme=", this.v, ")");
    }
}
