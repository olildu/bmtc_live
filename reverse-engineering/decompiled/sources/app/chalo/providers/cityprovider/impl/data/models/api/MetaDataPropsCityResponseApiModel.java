package app.chalo.providers.cityprovider.impl.data.models.api;

import app.chalo.constants.AppConstants;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.sg0;
import defpackage.t10;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsCityResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetaDataPropsCityResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8848a;
    public final String b;
    public final MetaDataCityBoundsResponseApiModel c;
    public final MetaDataCityCenterBoundResponseApiModel d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    public final List p;
    public final String q;
    public final String r;
    public final long s;
    public final String t;
    public final List u;
    public final List v;
    public final boolean w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsCityResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsCityResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetaDataPropsCityResponseApiModel> serializer() {
            return MetaDataPropsCityResponseApiModel$$serializer.f8849a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        x = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(12)), LazyKt.a(lazyThreadSafetyMode, new sg0(13)), null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(14)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(15)), LazyKt.a(lazyThreadSafetyMode, new sg0(16)), null};
    }

    public MetaDataPropsCityResponseApiModel(int i, String str, String str2, MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel, MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel, List list, List list2, String str3, boolean z, boolean z2, boolean z3, String str4, int i2, String str5, String str6, String str7, List list3, String str8, String str9, long j, String str10, List list4, List list5, boolean z4) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(MetaDataPropsCityResponseApiModel$$serializer.f8849a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8848a = str;
        this.b = str2;
        this.c = metaDataCityBoundsResponseApiModel;
        this.d = metaDataCityCenterBoundResponseApiModel;
        this.e = list;
        this.f = list2;
        this.g = str3;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z3;
        }
        if ((i & 1024) == 0) {
            this.k = "Asia/Kolkata";
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = 0;
        } else {
            this.l = i2;
        }
        this.m = (i & 4096) == 0 ? "IND" : str5;
        this.n = (i & 8192) == 0 ? "India" : str6;
        this.o = (i & 16384) == 0 ? "+91" : str7;
        this.p = (32768 & i) == 0 ? AppConstants.f1940a : list3;
        this.q = (65536 & i) == 0 ? "INR" : str8;
        this.r = (131072 & i) == 0 ? "₹" : str9;
        this.s = (262144 & i) == 0 ? 100L : j;
        this.t = (524288 & i) == 0 ? "" : str10;
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = list5;
        }
        if ((i & 4194304) == 0) {
            this.w = false;
        } else {
            this.w = z4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaDataPropsCityResponseApiModel)) {
            return false;
        }
        MetaDataPropsCityResponseApiModel metaDataPropsCityResponseApiModel = (MetaDataPropsCityResponseApiModel) obj;
        return Intrinsics.d(this.f8848a, metaDataPropsCityResponseApiModel.f8848a) && Intrinsics.d(this.b, metaDataPropsCityResponseApiModel.b) && Intrinsics.d(this.c, metaDataPropsCityResponseApiModel.c) && Intrinsics.d(this.d, metaDataPropsCityResponseApiModel.d) && Intrinsics.d(this.e, metaDataPropsCityResponseApiModel.e) && Intrinsics.d(this.f, metaDataPropsCityResponseApiModel.f) && Intrinsics.d(this.g, metaDataPropsCityResponseApiModel.g) && this.h == metaDataPropsCityResponseApiModel.h && this.i == metaDataPropsCityResponseApiModel.i && this.j == metaDataPropsCityResponseApiModel.j && Intrinsics.d(this.k, metaDataPropsCityResponseApiModel.k) && this.l == metaDataPropsCityResponseApiModel.l && Intrinsics.d(this.m, metaDataPropsCityResponseApiModel.m) && Intrinsics.d(this.n, metaDataPropsCityResponseApiModel.n) && Intrinsics.d(this.o, metaDataPropsCityResponseApiModel.o) && Intrinsics.d(this.p, metaDataPropsCityResponseApiModel.p) && Intrinsics.d(this.q, metaDataPropsCityResponseApiModel.q) && Intrinsics.d(this.r, metaDataPropsCityResponseApiModel.r) && this.s == metaDataPropsCityResponseApiModel.s && Intrinsics.d(this.t, metaDataPropsCityResponseApiModel.t) && Intrinsics.d(this.u, metaDataPropsCityResponseApiModel.u) && Intrinsics.d(this.v, metaDataPropsCityResponseApiModel.v) && this.w == metaDataPropsCityResponseApiModel.w;
    }

    public final int hashCode() {
        String str = this.f8848a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel = this.c;
        int iHashCode3 = (iHashCode2 + (metaDataCityBoundsResponseApiModel == null ? 0 : metaDataCityBoundsResponseApiModel.hashCode())) * 31;
        MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel = this.d;
        int iHashCode4 = (iHashCode3 + (metaDataCityCenterBoundResponseApiModel == null ? 0 : metaDataCityCenterBoundResponseApiModel.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.g;
        int iE = nf1.e(nf1.e(r30.b(nf1.e(nf1.e(nf1.e((nf1.e((((((((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31, 31, this.k) + this.l) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        long j = this.s;
        int iE2 = nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.t);
        List list3 = this.u;
        int iHashCode7 = (iE2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.v;
        return ((iHashCode7 + (list4 != null ? list4.hashCode() : 0)) * 31) + (this.w ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetaDataPropsCityResponseApiModel(cityName=", this.f8848a, ", cityDisplayName=", this.b, ", bound=");
        sbE.append(this.c);
        sbE.append(", cityCenter=");
        sbE.append(this.d);
        sbE.append(", stationType=");
        dd.o(sbE, this.e, ", lineMaps=", this.f, ", busMapsUrl=");
        t10.s(this.g, ", isBetaCity=", ", isComingSoonCity=", sbE, this.h);
        z40.r(sbE, this.i, ", isCityDiscontinued=", this.j, ", timezoneId=");
        cb0.o(this.l, this.k, ", minAppVersionForLogin=", ", countryId=", sbE);
        cb0.t(sbE, this.m, ", countryName=", this.n, ", countryCallingCode=");
        pk0.w(this.o, ", phoneNumberPossibleLengths=", ", currency=", sbE, this.p);
        cb0.t(sbE, this.q, ", currencySymbol=", this.r, ", currencyFactor=");
        dd.k(this.s, ", chaloBaseDomain=", this.t, sbE);
        sbE.append(", modesMap=");
        sbE.append(this.u);
        sbE.append(", polyBound=");
        sbE.append(this.v);
        sbE.append(", isMultiModalGroupTicketingEnabled=");
        sbE.append(this.w);
        sbE.append(")");
        return sbE.toString();
    }
}
