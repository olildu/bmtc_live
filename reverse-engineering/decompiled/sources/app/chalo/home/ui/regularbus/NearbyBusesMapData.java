package app.chalo.home.ui.regularbus;

import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import defpackage.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/NearbyBusesMapData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyBusesMapData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3616a;
    public final Map b;
    public final MapCameraViewState c;
    public final ChaloMapCameraPositionStateData d;

    public NearbyBusesMapData(List nearbyBusesMarkerList, Map map, MapCameraViewState mapCameraViewState, ChaloMapCameraPositionStateData chaloMapCameraPositionStateData) {
        Intrinsics.i(nearbyBusesMarkerList, "nearbyBusesMarkerList");
        this.f3616a = nearbyBusesMarkerList;
        this.b = map;
        this.c = mapCameraViewState;
        this.d = chaloMapCameraPositionStateData;
    }

    public static NearbyBusesMapData a(NearbyBusesMapData nearbyBusesMapData, List nearbyBusesMarkerList, MapCameraViewState mapCameraState, ChaloMapCameraPositionStateData chaloMapCameraPositionStateData, int i) {
        if ((i & 1) != 0) {
            nearbyBusesMarkerList = nearbyBusesMapData.f3616a;
        }
        Map bitmapCache = nearbyBusesMapData.b;
        if ((i & 4) != 0) {
            mapCameraState = nearbyBusesMapData.c;
        }
        if ((i & 8) != 0) {
            chaloMapCameraPositionStateData = nearbyBusesMapData.d;
        }
        nearbyBusesMapData.getClass();
        Intrinsics.i(nearbyBusesMarkerList, "nearbyBusesMarkerList");
        Intrinsics.i(bitmapCache, "bitmapCache");
        Intrinsics.i(mapCameraState, "mapCameraState");
        return new NearbyBusesMapData(nearbyBusesMarkerList, bitmapCache, mapCameraState, chaloMapCameraPositionStateData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyBusesMapData)) {
            return false;
        }
        NearbyBusesMapData nearbyBusesMapData = (NearbyBusesMapData) obj;
        return Intrinsics.d(this.f3616a, nearbyBusesMapData.f3616a) && Intrinsics.d(this.b, nearbyBusesMapData.b) && Intrinsics.d(this.c, nearbyBusesMapData.c) && Intrinsics.d(this.d, nearbyBusesMapData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + d.f(this.b, this.f3616a.hashCode() * 31, 31)) * 31;
        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = this.d;
        return iHashCode + (chaloMapCameraPositionStateData == null ? 0 : chaloMapCameraPositionStateData.hashCode());
    }

    public final String toString() {
        return "NearbyBusesMapData(nearbyBusesMarkerList=" + this.f3616a + ", bitmapCache=" + this.b + ", mapCameraState=" + this.c + ", currentCameraPosition=" + this.d + ")";
    }

    public NearbyBusesMapData() {
        this(EmptyList.f17557a, MapsKt.d(), MapCameraViewState.InitialState.NoState.f1881a, null);
    }
}
