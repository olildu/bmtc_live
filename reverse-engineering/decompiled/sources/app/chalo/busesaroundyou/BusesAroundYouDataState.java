package app.chalo.busesaroundyou;

import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.location.LatLng;
import defpackage.b3;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusesAroundYouDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1175a;
    public final boolean b;
    public final NearbyBusesMapData c;
    public final ChaloMapOverlayConfig d;
    public final boolean e;
    public final LatLng f;
    public final GeoQueryCityConfigModel g;
    public final boolean h;
    public final long i;
    public final long j;
    public final boolean k;

    public BusesAroundYouDataState(boolean z, boolean z2, NearbyBusesMapData nearbyBusesMapData, ChaloMapOverlayConfig chaloMapOverlayConfig, boolean z3, LatLng latLng, GeoQueryCityConfigModel geoQueryCityConfigModel, boolean z4, long j, long j2, boolean z5) {
        this.f1175a = z;
        this.b = z2;
        this.c = nearbyBusesMapData;
        this.d = chaloMapOverlayConfig;
        this.e = z3;
        this.f = latLng;
        this.g = geoQueryCityConfigModel;
        this.h = z4;
        this.i = j;
        this.j = j2;
        this.k = z5;
    }

    public static BusesAroundYouDataState a(BusesAroundYouDataState busesAroundYouDataState, boolean z, boolean z2, NearbyBusesMapData nearbyBusesMapData, ChaloMapOverlayConfig.AdaptiveRadius adaptiveRadius, LatLng latLng, GeoQueryCityConfigModel geoQueryCityConfigModel, long j, long j2, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? busesAroundYouDataState.f1175a : z;
        boolean z5 = (i & 2) != 0 ? busesAroundYouDataState.b : z2;
        NearbyBusesMapData nearbyBusesMapData2 = (i & 4) != 0 ? busesAroundYouDataState.c : nearbyBusesMapData;
        ChaloMapOverlayConfig chaloMapOverlayConfig = (i & 8) != 0 ? busesAroundYouDataState.d : adaptiveRadius;
        boolean z6 = (i & 16) != 0 ? busesAroundYouDataState.e : false;
        LatLng latLng2 = (i & 32) != 0 ? busesAroundYouDataState.f : latLng;
        GeoQueryCityConfigModel geoQueryCityConfigModel2 = (i & 64) != 0 ? busesAroundYouDataState.g : geoQueryCityConfigModel;
        boolean z7 = (i & 128) != 0 ? busesAroundYouDataState.h : true;
        long j3 = (i & 256) != 0 ? busesAroundYouDataState.i : j;
        long j4 = (i & 512) != 0 ? busesAroundYouDataState.j : j2;
        boolean z8 = (i & 1024) != 0 ? busesAroundYouDataState.k : z3;
        busesAroundYouDataState.getClass();
        return new BusesAroundYouDataState(z4, z5, nearbyBusesMapData2, chaloMapOverlayConfig, z6, latLng2, geoQueryCityConfigModel2, z7, j3, j4, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusesAroundYouDataState)) {
            return false;
        }
        BusesAroundYouDataState busesAroundYouDataState = (BusesAroundYouDataState) obj;
        return this.f1175a == busesAroundYouDataState.f1175a && this.b == busesAroundYouDataState.b && Intrinsics.d(this.c, busesAroundYouDataState.c) && Intrinsics.d(this.d, busesAroundYouDataState.d) && this.e == busesAroundYouDataState.e && Intrinsics.d(this.f, busesAroundYouDataState.f) && Intrinsics.d(this.g, busesAroundYouDataState.g) && this.h == busesAroundYouDataState.h && this.i == busesAroundYouDataState.i && this.j == busesAroundYouDataState.j && this.k == busesAroundYouDataState.k;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((((this.f1175a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
        ChaloMapOverlayConfig chaloMapOverlayConfig = this.d;
        int iHashCode2 = (((iHashCode + (chaloMapOverlayConfig == null ? 0 : chaloMapOverlayConfig.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        LatLng latLng = this.f;
        int iHashCode3 = (iHashCode2 + (latLng == null ? 0 : latLng.hashCode())) * 31;
        GeoQueryCityConfigModel geoQueryCityConfigModel = this.g;
        int iHashCode4 = (iHashCode3 + (geoQueryCityConfigModel != null ? geoQueryCityConfigModel.hashCode() : 0)) * 31;
        int i = this.h ? 1231 : 1237;
        long j = this.i;
        int i2 = (((iHashCode4 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("BusesAroundYouDataState(isLocationEnabled=", ", showNoInternetConnectionSnackBar=", ", nearbyBusesMapData=", this.f1175a, this.b);
        sbR.append(this.c);
        sbR.append(", mapOverlay=");
        sbR.append(this.d);
        sbR.append(", shouldFetchInitialDataWithGeoQuery=");
        sbR.append(this.e);
        sbR.append(", currentGeoQueryCenter=");
        sbR.append(this.f);
        sbR.append(", geoQueryConfig=");
        sbR.append(this.g);
        sbR.append(", isBusListFetchedOnce=");
        sbR.append(this.h);
        sbR.append(", activityCreationTime=");
        sbR.append(this.i);
        xs.r(this.j, ", markerFetchedTime=", ", showGrantLocationPermissionThroughSettingDialog=", sbR);
        return b3.g(")", sbR, this.k);
    }
}
