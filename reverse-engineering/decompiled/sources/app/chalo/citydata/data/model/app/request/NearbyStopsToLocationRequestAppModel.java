package app.chalo.citydata.data.model.app.request;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/NearbyStopsToLocationRequestAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopsToLocationRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1733a;
    public final double b;
    public final double c;
    public final ChaloTransitMode d;

    public NearbyStopsToLocationRequestAppModel(String cityId, double d, double d2, ChaloTransitMode transitMode) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(transitMode, "transitMode");
        this.f1733a = cityId;
        this.b = d;
        this.c = d2;
        this.d = transitMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsToLocationRequestAppModel)) {
            return false;
        }
        NearbyStopsToLocationRequestAppModel nearbyStopsToLocationRequestAppModel = (NearbyStopsToLocationRequestAppModel) obj;
        return Intrinsics.d(this.f1733a, nearbyStopsToLocationRequestAppModel.f1733a) && Double.compare(this.b, nearbyStopsToLocationRequestAppModel.b) == 0 && Double.compare(this.c, nearbyStopsToLocationRequestAppModel.c) == 0 && this.d == nearbyStopsToLocationRequestAppModel.d;
    }

    public final int hashCode() {
        int iHashCode = this.f1733a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        return this.d.hashCode() + ((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyStopsToLocationRequestAppModel(cityId=");
        sb.append(this.f1733a);
        sb.append(", latitude=");
        sb.append(this.b);
        pk0.z(sb, ", longitude=", this.c, ", transitMode=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
