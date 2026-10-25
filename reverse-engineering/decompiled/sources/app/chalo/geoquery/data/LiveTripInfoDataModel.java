package app.chalo.geoquery.data;

import app.chalo.models.RealTimeRouteInfo;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/LiveTripInfoDataModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveTripInfoDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2791a;
    public final String b;
    public final LiveTripInfoGeoLocationAppModel c;
    public final RealTimeRouteInfo.GeoRealTimeInfo d;
    public final String e;
    public final String f;

    public LiveTripInfoDataModel(String streamId, String routeId, LiveTripInfoGeoLocationAppModel liveTripInfoGeoLocationAppModel, RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo, String id, String str) {
        Intrinsics.i(streamId, "streamId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(id, "id");
        this.f2791a = streamId;
        this.b = routeId;
        this.c = liveTripInfoGeoLocationAppModel;
        this.d = geoRealTimeInfo;
        this.e = id;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTripInfoDataModel)) {
            return false;
        }
        LiveTripInfoDataModel liveTripInfoDataModel = (LiveTripInfoDataModel) obj;
        return Intrinsics.d(this.f2791a, liveTripInfoDataModel.f2791a) && Intrinsics.d(this.b, liveTripInfoDataModel.b) && Intrinsics.d(this.c, liveTripInfoDataModel.c) && Intrinsics.d(this.d, liveTripInfoDataModel.d) && Intrinsics.d(this.e, liveTripInfoDataModel.e) && Intrinsics.d(this.f, liveTripInfoDataModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e((this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f2791a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LiveTripInfoDataModel(streamId=", this.f2791a, ", routeId=", this.b, ", geoLocation=");
        sbE.append(this.c);
        sbE.append(", geoRealTimeInfo=");
        sbE.append(this.d);
        sbE.append(", id=");
        return r30.i(sbE, this.e, ", via=", this.f, ")");
    }
}
