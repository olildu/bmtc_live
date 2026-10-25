package app.chalo.geoquery.data.models.app;

import app.chalo.location.LatLng;
import defpackage.dd;
import defpackage.i71;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryBusInfoParametersResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeoQueryBusInfoParametersResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2813a;
    public final LatLng b;
    public final long c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final String g;

    public GeoQueryBusInfoParametersResponseAppModel(String str, LatLng latLng, long j, String str2, Integer num, Boolean bool, String str3) {
        this.f2813a = str;
        this.b = latLng;
        this.c = j;
        this.d = str2;
        this.e = num;
        this.f = bool;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoParametersResponseAppModel)) {
            return false;
        }
        GeoQueryBusInfoParametersResponseAppModel geoQueryBusInfoParametersResponseAppModel = (GeoQueryBusInfoParametersResponseAppModel) obj;
        return Intrinsics.d(this.f2813a, geoQueryBusInfoParametersResponseAppModel.f2813a) && Intrinsics.d(this.b, geoQueryBusInfoParametersResponseAppModel.b) && this.c == geoQueryBusInfoParametersResponseAppModel.c && Intrinsics.d(this.d, geoQueryBusInfoParametersResponseAppModel.d) && Intrinsics.d(this.e, geoQueryBusInfoParametersResponseAppModel.e) && Intrinsics.d(this.f, geoQueryBusInfoParametersResponseAppModel.f) && Intrinsics.d(this.g, geoQueryBusInfoParametersResponseAppModel.g);
    }

    public final int hashCode() {
        String str = this.f2813a;
        int iD = i71.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        long j = this.c;
        int i = (iD + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.d;
        int iHashCode = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoQueryBusInfoParametersResponseAppModel(nextStopId=");
        sb.append(this.f2813a);
        sb.append(", latLng=");
        sb.append(this.b);
        sb.append(", time=");
        dd.k(this.c, ", nextStopName=", this.d, sb);
        sb.append(", nextStopEta=");
        sb.append(this.e);
        sb.append(", isHalted=");
        sb.append(this.f);
        return z40.h(sb, ", via=", this.g, ")");
    }
}
