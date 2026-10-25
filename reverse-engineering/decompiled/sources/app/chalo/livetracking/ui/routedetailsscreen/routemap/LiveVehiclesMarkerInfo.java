package app.chalo.livetracking.ui.routedetailsscreen.routemap;

import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.livetracking.routedetails.data.model.ui.BusMapInfoWindowUiModel;
import app.chalo.location.LatLng;
import defpackage.i71;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/LiveVehiclesMarkerInfo;", "Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteDetailsMapMarker;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveVehiclesMarkerInfo implements RouteDetailsMapMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4896a;
    public final LatLng b;
    public final boolean c;
    public final ChaloMapMarkerIconType.BitmapRes d;
    public final boolean e;
    public final boolean f;
    public final BusMapInfoWindowUiModel g;

    public LiveVehiclesMarkerInfo(String vehicleNumber, LatLng latLng, boolean z, ChaloMapMarkerIconType.BitmapRes bitmapRes, boolean z2, boolean z3, BusMapInfoWindowUiModel busMapInfoWindowUiModel) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4896a = vehicleNumber;
        this.b = latLng;
        this.c = z;
        this.d = bitmapRes;
        this.e = z2;
        this.f = z3;
        this.g = busMapInfoWindowUiModel;
    }

    public static LiveVehiclesMarkerInfo a(LiveVehiclesMarkerInfo liveVehiclesMarkerInfo, boolean z, BusMapInfoWindowUiModel busMapInfoWindowUiModel) {
        String vehicleNumber = liveVehiclesMarkerInfo.f4896a;
        LatLng latLng = liveVehiclesMarkerInfo.b;
        ChaloMapMarkerIconType.BitmapRes bitmapRes = liveVehiclesMarkerInfo.d;
        boolean z2 = liveVehiclesMarkerInfo.e;
        boolean z3 = liveVehiclesMarkerInfo.f;
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        return new LiveVehiclesMarkerInfo(vehicleNumber, latLng, z, bitmapRes, z2, z3, busMapInfoWindowUiModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVehiclesMarkerInfo)) {
            return false;
        }
        LiveVehiclesMarkerInfo liveVehiclesMarkerInfo = (LiveVehiclesMarkerInfo) obj;
        return Intrinsics.d(this.f4896a, liveVehiclesMarkerInfo.f4896a) && Intrinsics.d(this.b, liveVehiclesMarkerInfo.b) && this.c == liveVehiclesMarkerInfo.c && Intrinsics.d(this.d, liveVehiclesMarkerInfo.d) && this.e == liveVehiclesMarkerInfo.e && this.f == liveVehiclesMarkerInfo.f && Intrinsics.d(this.g, liveVehiclesMarkerInfo.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.d.f1866a.hashCode() + ((i71.d(this.b, this.f4896a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        BusMapInfoWindowUiModel busMapInfoWindowUiModel = this.g;
        return iHashCode + (busMapInfoWindowUiModel == null ? 0 : busMapInfoWindowUiModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveVehiclesMarkerInfo(vehicleNumber=");
        sb.append(this.f4896a);
        sb.append(", latLng=");
        sb.append(this.b);
        sb.append(", isSelected=");
        sb.append(this.c);
        sb.append(", iconImage=");
        sb.append(this.d);
        sb.append(", isHalted=");
        z40.r(sb, this.e, ", isDelayed=", this.f, ", busMapInfoWindowUiModel=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
