package app.chalo.livetracking.ui.routedetailsscreen.routemap;

import app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.location.LatLng;
import defpackage.b3;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteDetailsMapStopMarkerInfo;", "Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteDetailsMapMarker;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsMapStopMarkerInfo implements RouteDetailsMapMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4900a;
    public final String b;
    public final StopEtaStatus c;
    public final StopEtaUiModel d;
    public final boolean e;
    public final MarkerStopType f;
    public final LatLng g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public RouteDetailsMapStopMarkerInfo(String stopId, String stopName, StopEtaStatus etaStatus, StopEtaUiModel stopEtaUiModel, boolean z, MarkerStopType markerStopType, LatLng latLng, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(etaStatus, "etaStatus");
        Intrinsics.i(markerStopType, "markerStopType");
        Intrinsics.i(latLng, "latLng");
        this.f4900a = stopId;
        this.b = stopName;
        this.c = etaStatus;
        this.d = stopEtaUiModel;
        this.e = z;
        this.f = markerStopType;
        this.g = latLng;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public static RouteDetailsMapStopMarkerInfo a(RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfo, StopEtaStatus stopEtaStatus, StopEtaUiModel stopEtaUiModel, MarkerStopType markerStopType, boolean z, int i) {
        String stopId = routeDetailsMapStopMarkerInfo.f4900a;
        String stopName = routeDetailsMapStopMarkerInfo.b;
        if ((i & 4) != 0) {
            stopEtaStatus = routeDetailsMapStopMarkerInfo.c;
        }
        StopEtaStatus etaStatus = stopEtaStatus;
        if ((i & 8) != 0) {
            stopEtaUiModel = routeDetailsMapStopMarkerInfo.d;
        }
        StopEtaUiModel etaUiModel = stopEtaUiModel;
        boolean z2 = routeDetailsMapStopMarkerInfo.e;
        MarkerStopType markerStopType2 = (i & 32) != 0 ? routeDetailsMapStopMarkerInfo.f : markerStopType;
        LatLng latLng = routeDetailsMapStopMarkerInfo.g;
        boolean z3 = (i & 128) != 0 ? routeDetailsMapStopMarkerInfo.h : z;
        boolean z4 = routeDetailsMapStopMarkerInfo.i;
        boolean z5 = routeDetailsMapStopMarkerInfo.j;
        boolean z6 = routeDetailsMapStopMarkerInfo.k;
        routeDetailsMapStopMarkerInfo.getClass();
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(etaStatus, "etaStatus");
        Intrinsics.i(etaUiModel, "etaUiModel");
        Intrinsics.i(markerStopType2, "markerStopType");
        Intrinsics.i(latLng, "latLng");
        return new RouteDetailsMapStopMarkerInfo(stopId, stopName, etaStatus, etaUiModel, z2, markerStopType2, latLng, z3, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsMapStopMarkerInfo)) {
            return false;
        }
        RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfo = (RouteDetailsMapStopMarkerInfo) obj;
        return Intrinsics.d(this.f4900a, routeDetailsMapStopMarkerInfo.f4900a) && Intrinsics.d(this.b, routeDetailsMapStopMarkerInfo.b) && this.c == routeDetailsMapStopMarkerInfo.c && Intrinsics.d(this.d, routeDetailsMapStopMarkerInfo.d) && this.e == routeDetailsMapStopMarkerInfo.e && this.f == routeDetailsMapStopMarkerInfo.f && Intrinsics.d(this.g, routeDetailsMapStopMarkerInfo.g) && this.h == routeDetailsMapStopMarkerInfo.h && this.i == routeDetailsMapStopMarkerInfo.i && this.j == routeDetailsMapStopMarkerInfo.j && this.k == routeDetailsMapStopMarkerInfo.k;
    }

    public final int hashCode() {
        return ((((((i71.d(this.g, (this.f.hashCode() + ((((this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f4900a.hashCode() * 31, 31, this.b)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31, 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteDetailsMapStopMarkerInfo(stopId=", this.f4900a, ", stopName=", this.b, ", etaStatus=");
        sbE.append(this.c);
        sbE.append(", etaUiModel=");
        sbE.append(this.d);
        sbE.append(", isFirstStop=");
        sbE.append(this.e);
        sbE.append(", markerStopType=");
        sbE.append(this.f);
        sbE.append(", latLng=");
        sbE.append(this.g);
        sbE.append(", isStopSelected=");
        sbE.append(this.h);
        sbE.append(", showBusIconForEta=");
        z40.r(sbE, this.i, ", showEtaHeading=", this.j, ", showBonnetNumber=");
        return b3.g(")", sbE, this.k);
    }
}
