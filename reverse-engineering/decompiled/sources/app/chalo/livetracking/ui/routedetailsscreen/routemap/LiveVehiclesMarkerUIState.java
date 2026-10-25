package app.chalo.livetracking.ui.routedetailsscreen.routemap;

import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.location.LatLng;
import defpackage.i71;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/LiveVehiclesMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "VehicleNumberViewUIState", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveVehiclesMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4897a;
    public final LatLng b;
    public final ChaloMapMarkerIconType.BitmapRes c;
    public final MapOffset d;
    public final ChaloMapMarkerInfoWindow e;
    public final ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 f;
    public final MapOffset g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/LiveVehiclesMarkerUIState$VehicleNumberViewUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleNumberViewUIState implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4898a;
        public final VehicleNumberViewUISpec b;

        public VehicleNumberViewUIState(List vehicleInfo, VehicleNumberViewUISpec vehicleNumberViewUISpec) {
            Intrinsics.i(vehicleInfo, "vehicleInfo");
            this.f4898a = vehicleInfo;
            this.b = vehicleNumberViewUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VehicleNumberViewUIState)) {
                return false;
            }
            VehicleNumberViewUIState vehicleNumberViewUIState = (VehicleNumberViewUIState) obj;
            return Intrinsics.d(this.f4898a, vehicleNumberViewUIState.f4898a) && Intrinsics.d(this.b, vehicleNumberViewUIState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4898a.hashCode() * 31);
        }

        public final String toString() {
            return "VehicleNumberViewUIState(vehicleInfo=" + this.f4898a + ", spec=" + this.b + ")";
        }
    }

    public LiveVehiclesMarkerUIState(String vehicleNumber, LatLng latLng, ChaloMapMarkerIconType.BitmapRes bitmapRes, MapOffset mapOffset, ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow, ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 chaloMapMarkerUIEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4897a = vehicleNumber;
        this.b = latLng;
        this.c = bitmapRes;
        this.d = mapOffset;
        this.e = chaloMapMarkerInfoWindow;
        this.f = chaloMapMarkerUIEventHandler$Companion$fromLambda$1;
        this.g = new MapOffset(0.5f, 0.0f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
        return this.f;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChaloMapMarkerInfoWindow getE() {
        return this.e;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: c, reason: from getter */
    public final MapOffset getG() {
        return this.g;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: d, reason: from getter */
    public final MapOffset getD() {
        return this.d;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: e */
    public final boolean getG() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVehiclesMarkerUIState)) {
            return false;
        }
        LiveVehiclesMarkerUIState liveVehiclesMarkerUIState = (LiveVehiclesMarkerUIState) obj;
        return Intrinsics.d(this.f4897a, liveVehiclesMarkerUIState.f4897a) && this.b.equals(liveVehiclesMarkerUIState.b) && this.c.equals(liveVehiclesMarkerUIState.c) && this.d.equals(liveVehiclesMarkerUIState.d) && Intrinsics.d(this.e, liveVehiclesMarkerUIState.e) && equals(liveVehiclesMarkerUIState.f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return this.c;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF4897a() {
        return this.f4897a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final float getZIndex() {
        return 1.0f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.f1866a.hashCode() + i71.d(this.b, this.f4897a.hashCode() * 31, 31)) * 31)) * 31;
        ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = this.e;
        return hashCode() + ((iHashCode + (chaloMapMarkerInfoWindow == null ? 0 : chaloMapMarkerInfoWindow.hashCode())) * 31);
    }

    public final String toString() {
        return "LiveVehiclesMarkerUIState(vehicleNumber=" + this.f4897a + ", position=" + this.b + ", icon=" + this.c + ", markerAnchor=" + this.d + ", infoWindow=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
