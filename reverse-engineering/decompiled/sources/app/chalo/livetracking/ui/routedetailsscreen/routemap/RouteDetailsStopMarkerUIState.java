package app.chalo.livetracking.ui.routedetailsscreen.routemap;

import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardCtaUIState;
import app.chalo.location.LatLng;
import app.chalo.uistate.text.TextUIState;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteDetailsStopMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "StopMarkerInfoWindowUIState", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsStopMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4901a;
    public final LatLng b;
    public final ChaloMapMarkerIconType c;
    public final MapOffset d;
    public final ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 e;
    public final ChaloMapMarkerInfoWindow f;
    public final MapOffset g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteDetailsStopMarkerUIState$StopMarkerInfoWindowUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopMarkerInfoWindowUIState implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f4902a;
        public final RouteEtaStatusUIState b;
        public final StopCardCtaUIState c;
        public final StopMarkerInfoWindowUISpec d;

        public StopMarkerInfoWindowUIState(TextUIState stopName, RouteEtaStatusUIState routeEtaStatusUIState, StopCardCtaUIState stopCardCtaUIState, StopMarkerInfoWindowUISpec stopMarkerInfoWindowUISpec) {
            Intrinsics.i(stopName, "stopName");
            this.f4902a = stopName;
            this.b = routeEtaStatusUIState;
            this.c = stopCardCtaUIState;
            this.d = stopMarkerInfoWindowUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopMarkerInfoWindowUIState)) {
                return false;
            }
            StopMarkerInfoWindowUIState stopMarkerInfoWindowUIState = (StopMarkerInfoWindowUIState) obj;
            return Intrinsics.d(this.f4902a, stopMarkerInfoWindowUIState.f4902a) && Intrinsics.d(this.b, stopMarkerInfoWindowUIState.b) && Intrinsics.d(this.c, stopMarkerInfoWindowUIState.c) && Intrinsics.d(this.d, stopMarkerInfoWindowUIState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f4902a.hashCode() * 31;
            RouteEtaStatusUIState routeEtaStatusUIState = this.b;
            int iHashCode2 = (iHashCode + (routeEtaStatusUIState == null ? 0 : routeEtaStatusUIState.hashCode())) * 31;
            StopCardCtaUIState stopCardCtaUIState = this.c;
            return this.d.hashCode() + ((iHashCode2 + (stopCardCtaUIState != null ? stopCardCtaUIState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "StopMarkerInfoWindowUIState(stopName=" + this.f4902a + ", etaStatus=" + this.b + ", stopActionCta=" + this.c + ", spec=" + this.d + ")";
        }
    }

    public RouteDetailsStopMarkerUIState(String stopId, LatLng position, ChaloMapMarkerIconType.DrawableRes icon, MapOffset markerAnchor, ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 chaloMapMarkerUIEventHandler$Companion$fromLambda$1, ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(position, "position");
        Intrinsics.i(icon, "icon");
        Intrinsics.i(markerAnchor, "markerAnchor");
        this.f4901a = stopId;
        this.b = position;
        this.c = icon;
        this.d = markerAnchor;
        this.e = chaloMapMarkerUIEventHandler$Companion$fromLambda$1;
        this.f = chaloMapMarkerInfoWindow;
        this.g = new MapOffset(0.5f, 0.0f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getE() {
        return this.e;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChaloMapMarkerInfoWindow getF() {
        return this.f;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsStopMarkerUIState)) {
            return false;
        }
        RouteDetailsStopMarkerUIState routeDetailsStopMarkerUIState = (RouteDetailsStopMarkerUIState) obj;
        return Intrinsics.d(this.f4901a, routeDetailsStopMarkerUIState.f4901a) && Intrinsics.d(this.b, routeDetailsStopMarkerUIState.b) && Intrinsics.d(this.c, routeDetailsStopMarkerUIState.c) && Intrinsics.d(this.d, routeDetailsStopMarkerUIState.d) && equals(routeDetailsStopMarkerUIState.e) && Intrinsics.d(this.f, routeDetailsStopMarkerUIState.f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final ChaloMapMarkerIconType getC() {
        return this.c;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF4901a() {
        return this.f4901a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        int iHashCode = (hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + i71.d(this.b, this.f4901a.hashCode() * 31, 31)) * 31)) * 31)) * 31;
        ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = this.f;
        return iHashCode + (chaloMapMarkerInfoWindow == null ? 0 : chaloMapMarkerInfoWindow.hashCode());
    }

    public final String toString() {
        return "RouteDetailsStopMarkerUIState(stopId=" + this.f4901a + ", position=" + this.b + ", icon=" + this.c + ", markerAnchor=" + this.d + ", eventHandler=" + this.e + ", infoWindow=" + this.f + ")";
    }
}
