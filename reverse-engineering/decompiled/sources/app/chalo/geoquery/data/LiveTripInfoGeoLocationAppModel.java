package app.chalo.geoquery.data;

import defpackage.n21;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/LiveTripInfoGeoLocationAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveTripInfoGeoLocationAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2792a;
    public final double b;
    public final String c;
    public final long d;
    public final String e;
    public final Integer f;
    public final Boolean g;

    public LiveTripInfoGeoLocationAppModel(double d, double d2, String str, long j, String str2, Integer num, Boolean bool) {
        this.f2792a = d;
        this.b = d2;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = num;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTripInfoGeoLocationAppModel)) {
            return false;
        }
        LiveTripInfoGeoLocationAppModel liveTripInfoGeoLocationAppModel = (LiveTripInfoGeoLocationAppModel) obj;
        return Double.compare(this.f2792a, liveTripInfoGeoLocationAppModel.f2792a) == 0 && Double.compare(this.b, liveTripInfoGeoLocationAppModel.b) == 0 && Intrinsics.d(this.c, liveTripInfoGeoLocationAppModel.c) && this.d == liveTripInfoGeoLocationAppModel.d && Intrinsics.d(this.e, liveTripInfoGeoLocationAppModel.e) && Intrinsics.d(this.f, liveTripInfoGeoLocationAppModel.f) && Intrinsics.d(this.g, liveTripInfoGeoLocationAppModel.g);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2792a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        long j = this.d;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.e;
        int iHashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f2792a, "LiveTripInfoGeoLocationAppModel(latitude=", ", longitude=");
        sbI.append(this.b);
        sbI.append(", nextStopId=");
        sbI.append(this.c);
        xs.r(this.d, ", time=", ", nextStopName=", sbI);
        xs.u(this.f, this.e, ", nextStopEta=", ", isHalted=", sbI);
        sbI.append(this.g);
        sbI.append(")");
        return sbI.toString();
    }
}
