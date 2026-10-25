package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.constants.Source;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopsMapState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3165a;
    public final boolean b;
    public final ChaloTransitMode c;
    public final LatLng d;
    public final NearbyStopsDataInfo e;
    public final boolean f;
    public final MapCameraViewState g;
    public final ChaloMapCameraPositionStateData h;
    public final NearbyStopAndTripsUiModel i;
    public final ChaloMapOverlayConfig j;
    public final boolean k;
    public final Source l;
    public final MapCameraUpdate m;
    public final boolean n;

    public /* synthetic */ NearbyStopsMapState() {
        this(false, false, null, null, null, false, MapCameraViewState.InitialState.NoState.f1881a, null, null, null, true, null, null, false);
    }

    public static NearbyStopsMapState a(NearbyStopsMapState nearbyStopsMapState, boolean z, ChaloTransitMode chaloTransitMode, LatLng latLng, NearbyStopsDataInfo nearbyStopsDataInfo, boolean z2, MapCameraViewState mapCameraViewState, ChaloMapCameraPositionStateData chaloMapCameraPositionStateData, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, ChaloMapOverlayConfig.AdaptiveRadius adaptiveRadius, Source source, MapCameraUpdate mapCameraUpdate, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? nearbyStopsMapState.f3165a : z;
        boolean z5 = (i & 2) != 0 ? nearbyStopsMapState.b : true;
        ChaloTransitMode chaloTransitMode2 = (i & 4) != 0 ? nearbyStopsMapState.c : chaloTransitMode;
        LatLng latLng2 = (i & 8) != 0 ? nearbyStopsMapState.d : latLng;
        NearbyStopsDataInfo nearbyStopsDataInfo2 = (i & 16) != 0 ? nearbyStopsMapState.e : nearbyStopsDataInfo;
        boolean z6 = (i & 32) != 0 ? nearbyStopsMapState.f : z2;
        MapCameraViewState mapCameraState = (i & 64) != 0 ? nearbyStopsMapState.g : mapCameraViewState;
        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData2 = (i & 128) != 0 ? nearbyStopsMapState.h : chaloMapCameraPositionStateData;
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = (i & 256) != 0 ? nearbyStopsMapState.i : nearbyStopAndTripsUiModel;
        nearbyStopsMapState.getClass();
        ChaloMapOverlayConfig chaloMapOverlayConfig = (i & 1024) != 0 ? nearbyStopsMapState.j : adaptiveRadius;
        boolean z7 = (i & 2048) != 0 ? nearbyStopsMapState.k : false;
        Source source2 = (i & 4096) != 0 ? nearbyStopsMapState.l : source;
        MapCameraUpdate mapCameraUpdate2 = (i & 8192) != 0 ? nearbyStopsMapState.m : mapCameraUpdate;
        boolean z8 = (i & 16384) != 0 ? nearbyStopsMapState.n : z3;
        nearbyStopsMapState.getClass();
        Intrinsics.i(mapCameraState, "mapCameraState");
        return new NearbyStopsMapState(z4, z5, chaloTransitMode2, latLng2, nearbyStopsDataInfo2, z6, mapCameraState, chaloMapCameraPositionStateData2, nearbyStopAndTripsUiModel2, chaloMapOverlayConfig, z7, source2, mapCameraUpdate2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsMapState)) {
            return false;
        }
        NearbyStopsMapState nearbyStopsMapState = (NearbyStopsMapState) obj;
        return this.f3165a == nearbyStopsMapState.f3165a && this.b == nearbyStopsMapState.b && this.c == nearbyStopsMapState.c && Intrinsics.d(this.d, nearbyStopsMapState.d) && Intrinsics.d(this.e, nearbyStopsMapState.e) && this.f == nearbyStopsMapState.f && Intrinsics.d(this.g, nearbyStopsMapState.g) && Intrinsics.d(this.h, nearbyStopsMapState.h) && Intrinsics.d(this.i, nearbyStopsMapState.i) && Intrinsics.d(this.j, nearbyStopsMapState.j) && this.k == nearbyStopsMapState.k && this.l == nearbyStopsMapState.l && Intrinsics.d(this.m, nearbyStopsMapState.m) && this.n == nearbyStopsMapState.n;
    }

    public final int hashCode() {
        int i = (((this.f3165a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        ChaloTransitMode chaloTransitMode = this.c;
        int iHashCode = (i + (chaloTransitMode == null ? 0 : chaloTransitMode.hashCode())) * 31;
        LatLng latLng = this.d;
        int iHashCode2 = (iHashCode + (latLng == null ? 0 : latLng.hashCode())) * 31;
        NearbyStopsDataInfo nearbyStopsDataInfo = this.e;
        int iHashCode3 = (this.g.hashCode() + ((((iHashCode2 + (nearbyStopsDataInfo == null ? 0 : nearbyStopsDataInfo.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31)) * 31;
        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = this.h;
        int iHashCode4 = (iHashCode3 + (chaloMapCameraPositionStateData == null ? 0 : chaloMapCameraPositionStateData.hashCode())) * 31;
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = this.i;
        int iHashCode5 = (iHashCode4 + (nearbyStopAndTripsUiModel == null ? 0 : nearbyStopAndTripsUiModel.hashCode())) * 961;
        ChaloMapOverlayConfig chaloMapOverlayConfig = this.j;
        int iHashCode6 = (((iHashCode5 + (chaloMapOverlayConfig == null ? 0 : chaloMapOverlayConfig.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31;
        Source source = this.l;
        int iHashCode7 = (iHashCode6 + (source == null ? 0 : source.hashCode())) * 31;
        MapCameraUpdate mapCameraUpdate = this.m;
        return ((iHashCode7 + (mapCameraUpdate != null ? mapCameraUpdate.hashCode() : 0)) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("NearbyStopsMapState(isLoadingStops=", ", isMapLoaded=", ", mode=", this.f3165a, this.b);
        sbR.append(this.c);
        sbR.append(", requestedLatLng=");
        sbR.append(this.d);
        sbR.append(", nearbyDataInfo=");
        sbR.append(this.e);
        sbR.append(", isLocationEnabled=");
        sbR.append(this.f);
        sbR.append(", mapCameraState=");
        sbR.append(this.g);
        sbR.append(", currentCameraPosition=");
        sbR.append(this.h);
        sbR.append(", selectedSummary=");
        sbR.append(this.i);
        sbR.append(", promptActionType=null, mapOverlayConfig=");
        sbR.append(this.j);
        sbR.append(", shouldHandleInitialisationIntent=");
        sbR.append(this.k);
        sbR.append(", previousScreenSource=");
        sbR.append(this.l);
        sbR.append(", lastMapCameraUpdate=");
        sbR.append(this.m);
        sbR.append(", shouldShowSummary=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }

    public NearbyStopsMapState(boolean z, boolean z2, ChaloTransitMode chaloTransitMode, LatLng latLng, NearbyStopsDataInfo nearbyStopsDataInfo, boolean z3, MapCameraViewState mapCameraViewState, ChaloMapCameraPositionStateData chaloMapCameraPositionStateData, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, ChaloMapOverlayConfig chaloMapOverlayConfig, boolean z4, Source source, MapCameraUpdate mapCameraUpdate, boolean z5) {
        this.f3165a = z;
        this.b = z2;
        this.c = chaloTransitMode;
        this.d = latLng;
        this.e = nearbyStopsDataInfo;
        this.f = z3;
        this.g = mapCameraViewState;
        this.h = chaloMapCameraPositionStateData;
        this.i = nearbyStopAndTripsUiModel;
        this.j = chaloMapOverlayConfig;
        this.k = z4;
        this.l = source;
        this.m = mapCameraUpdate;
        this.n = z5;
    }
}
