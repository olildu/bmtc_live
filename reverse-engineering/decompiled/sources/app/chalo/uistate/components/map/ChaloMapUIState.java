package app.chalo.uistate.components.map;

import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/map/ChaloMapUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloMapUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9962a;
    public final boolean b;
    public final MapCameraViewState c;
    public final List d;
    public final ChaloMapOverlayConfig e;
    public final TrafficLayerConfig f;
    public final ChaloMapUIEventHandler g;

    public ChaloMapUIState(List mapPolylinePoints, boolean z, MapCameraViewState mapCameraViewState, List markerList, ChaloMapOverlayConfig chaloMapOverlayConfig, TrafficLayerConfig trafficLayerConfig, ChaloMapUIEventHandler eventHandler) {
        Intrinsics.i(mapPolylinePoints, "mapPolylinePoints");
        Intrinsics.i(mapCameraViewState, "mapCameraViewState");
        Intrinsics.i(markerList, "markerList");
        Intrinsics.i(trafficLayerConfig, "trafficLayerConfig");
        Intrinsics.i(eventHandler, "eventHandler");
        this.f9962a = mapPolylinePoints;
        this.b = z;
        this.c = mapCameraViewState;
        this.d = markerList;
        this.e = chaloMapOverlayConfig;
        this.f = trafficLayerConfig;
        this.g = eventHandler;
    }

    public static ChaloMapUIState a(ChaloMapUIState chaloMapUIState, List list, boolean z, MapCameraViewState mapCameraViewState, ArrayList arrayList, TrafficLayerConfig trafficLayerConfig, ChaloMapUIEventHandler$Companion$fromLambda$4 chaloMapUIEventHandler$Companion$fromLambda$4, int i) {
        if ((i & 1) != 0) {
            list = chaloMapUIState.f9962a;
        }
        List mapPolylinePoints = list;
        if ((i & 2) != 0) {
            z = chaloMapUIState.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            mapCameraViewState = chaloMapUIState.c;
        }
        MapCameraViewState mapCameraViewState2 = mapCameraViewState;
        List list2 = arrayList;
        if ((i & 8) != 0) {
            list2 = chaloMapUIState.d;
        }
        List markerList = list2;
        ChaloMapOverlayConfig chaloMapOverlayConfig = chaloMapUIState.e;
        chaloMapUIState.getClass();
        if ((i & 64) != 0) {
            trafficLayerConfig = chaloMapUIState.f;
        }
        TrafficLayerConfig trafficLayerConfig2 = trafficLayerConfig;
        ChaloMapUIEventHandler chaloMapUIEventHandler = chaloMapUIEventHandler$Companion$fromLambda$4;
        if ((i & 128) != 0) {
            chaloMapUIEventHandler = chaloMapUIState.g;
        }
        ChaloMapUIEventHandler eventHandler = chaloMapUIEventHandler;
        chaloMapUIState.getClass();
        Intrinsics.i(mapPolylinePoints, "mapPolylinePoints");
        Intrinsics.i(mapCameraViewState2, "mapCameraViewState");
        Intrinsics.i(markerList, "markerList");
        Intrinsics.i(trafficLayerConfig2, "trafficLayerConfig");
        Intrinsics.i(eventHandler, "eventHandler");
        return new ChaloMapUIState(mapPolylinePoints, z2, mapCameraViewState2, markerList, chaloMapOverlayConfig, trafficLayerConfig2, eventHandler);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloMapUIState)) {
            return false;
        }
        ChaloMapUIState chaloMapUIState = (ChaloMapUIState) obj;
        return Intrinsics.d(this.f9962a, chaloMapUIState.f9962a) && this.b == chaloMapUIState.b && Intrinsics.d(this.c, chaloMapUIState.c) && Intrinsics.d(this.d, chaloMapUIState.d) && Intrinsics.d(this.e, chaloMapUIState.e) && Intrinsics.d(this.f, chaloMapUIState.f) && Intrinsics.d(this.g, chaloMapUIState.g);
    }

    public final int hashCode() {
        int iB = r30.b((this.c.hashCode() + (((this.f9962a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31, 31, this.d);
        ChaloMapOverlayConfig chaloMapOverlayConfig = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((((iB + (chaloMapOverlayConfig == null ? 0 : chaloMapOverlayConfig.hashCode())) * 31) + 1237) * 31)) * 31);
    }

    public final String toString() {
        return "ChaloMapUIState(mapPolylinePoints=" + this.f9962a + ", isUserLocationEnabled=" + this.b + ", mapCameraViewState=" + this.c + ", markerList=" + this.d + ", overlayConfig=" + this.e + ", shouldDisableMapInteraction=false, trafficLayerConfig=" + this.f + ", eventHandler=" + this.g + ")";
    }

    public /* synthetic */ ChaloMapUIState(List list, boolean z, MapCameraViewState mapCameraViewState, List list2, ChaloMapOverlayConfig chaloMapOverlayConfig, TrafficLayerConfig trafficLayerConfig, ChaloMapUIEventHandler chaloMapUIEventHandler, int i) {
        this(list, (i & 2) != 0 ? false : z, mapCameraViewState, list2, (i & 16) != 0 ? null : chaloMapOverlayConfig, (i & 64) != 0 ? new TrafficLayerConfig() : trafficLayerConfig, chaloMapUIEventHandler);
    }
}
