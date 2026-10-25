package app.chalo.titoridedetail.ui.compose;

import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.b3;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/titoridedetail/ui/compose/TitoRideDetailsScreenStopMarker;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "TitoRideDetailsScreenStopMarkerInfoWindowData", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitoRideDetailsScreenStopMarker implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9730a;
    public final String b;
    public final String c;
    public final LatLng d;
    public final IconType e;
    public final StopLiveEtaUiModel f;
    public final boolean g;
    public final boolean h;
    public final ChaloMapMarkerUIEventHandler i;
    public final ChaloMapMarkerInfoWindowProvider j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/compose/TitoRideDetailsScreenStopMarker$TitoRideDetailsScreenStopMarkerInfoWindowData;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitoRideDetailsScreenStopMarkerInfoWindowData implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9731a;
        public final StopLiveEtaUiModel b;
        public final boolean c;

        public TitoRideDetailsScreenStopMarkerInfoWindowData(String stopName, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z) {
            Intrinsics.i(stopName, "stopName");
            this.f9731a = stopName;
            this.b = stopLiveEtaUiModel;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitoRideDetailsScreenStopMarkerInfoWindowData)) {
                return false;
            }
            TitoRideDetailsScreenStopMarkerInfoWindowData titoRideDetailsScreenStopMarkerInfoWindowData = (TitoRideDetailsScreenStopMarkerInfoWindowData) obj;
            return Intrinsics.d(this.f9731a, titoRideDetailsScreenStopMarkerInfoWindowData.f9731a) && this.b.equals(titoRideDetailsScreenStopMarkerInfoWindowData.b) && this.c == titoRideDetailsScreenStopMarkerInfoWindowData.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f9731a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TitoRideDetailsScreenStopMarkerInfoWindowData(stopName=");
            sb.append(this.f9731a);
            sb.append(", etaUiModel=");
            sb.append(this.b);
            sb.append(", isDropOffStop=");
            return b3.g(")", sb, this.c);
        }
    }

    public TitoRideDetailsScreenStopMarker(String routeId, String stopId, String stopName, LatLng latLng, IconType markerBitmapDescriptor, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, boolean z2, ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler, ChaloMapMarkerInfoWindowProvider infoWindowProvider) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(markerBitmapDescriptor, "markerBitmapDescriptor");
        Intrinsics.i(infoWindowProvider, "infoWindowProvider");
        this.f9730a = routeId;
        this.b = stopId;
        this.c = stopName;
        this.d = latLng;
        this.e = markerBitmapDescriptor;
        this.f = stopLiveEtaUiModel;
        this.g = z;
        this.h = z2;
        this.i = chaloMapMarkerUIEventHandler;
        this.j = infoWindowProvider;
    }

    public static TitoRideDetailsScreenStopMarker f(TitoRideDetailsScreenStopMarker titoRideDetailsScreenStopMarker, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, int i) {
        String routeId = titoRideDetailsScreenStopMarker.f9730a;
        String stopId = titoRideDetailsScreenStopMarker.b;
        String stopName = titoRideDetailsScreenStopMarker.c;
        LatLng latLng = titoRideDetailsScreenStopMarker.d;
        IconType markerBitmapDescriptor = titoRideDetailsScreenStopMarker.e;
        if ((i & 32) != 0) {
            stopLiveEtaUiModel = titoRideDetailsScreenStopMarker.f;
        }
        StopLiveEtaUiModel stopLiveEtaUiModel2 = stopLiveEtaUiModel;
        if ((i & 64) != 0) {
            z = titoRideDetailsScreenStopMarker.g;
        }
        boolean z2 = titoRideDetailsScreenStopMarker.h;
        ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler = titoRideDetailsScreenStopMarker.i;
        ChaloMapMarkerInfoWindowProvider infoWindowProvider = titoRideDetailsScreenStopMarker.j;
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(markerBitmapDescriptor, "markerBitmapDescriptor");
        Intrinsics.i(infoWindowProvider, "infoWindowProvider");
        return new TitoRideDetailsScreenStopMarker(routeId, stopId, stopName, latLng, markerBitmapDescriptor, stopLiveEtaUiModel2, z, z2, chaloMapMarkerUIEventHandler, infoWindowProvider);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChaloMapMarkerUIEventHandler getF() {
        return this.i;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b */
    public final ChaloMapMarkerInfoWindow getF() {
        if (!this.g) {
            return null;
        }
        return this.j.a(new TitoRideDetailsScreenStopMarkerInfoWindowData(this.c, this.f, this.h));
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: c */
    public final /* bridge */ MapOffset getG() {
        return ChaloMapMarkerUIState.DefaultImpls.a();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: d */
    public final MapOffset getD() {
        return new MapOffset(0.5f, 0.5f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: e */
    public final /* bridge */ boolean getG() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoRideDetailsScreenStopMarker)) {
            return false;
        }
        TitoRideDetailsScreenStopMarker titoRideDetailsScreenStopMarker = (TitoRideDetailsScreenStopMarker) obj;
        return Intrinsics.d(this.f9730a, titoRideDetailsScreenStopMarker.f9730a) && Intrinsics.d(this.b, titoRideDetailsScreenStopMarker.b) && Intrinsics.d(this.c, titoRideDetailsScreenStopMarker.c) && Intrinsics.d(this.d, titoRideDetailsScreenStopMarker.d) && this.e == titoRideDetailsScreenStopMarker.e && this.f.equals(titoRideDetailsScreenStopMarker.f) && this.g == titoRideDetailsScreenStopMarker.g && this.h == titoRideDetailsScreenStopMarker.h && this.i.equals(titoRideDetailsScreenStopMarker.i) && Intrinsics.d(this.j, titoRideDetailsScreenStopMarker.j);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getIcon */
    public final ChaloMapMarkerIconType getC() {
        return new ChaloMapMarkerIconType.DrawableRes(this.e);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId */
    public final String getF4901a() {
        return vo1.n(this.f9730a, " - ", this.b);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.d;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getZIndex */
    public final /* bridge */ float getH() {
        return 0.0f;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((((((this.f.hashCode() + ((this.e.hashCode() + i71.d(this.d, nf1.e(nf1.e(this.f9730a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TitoRideDetailsScreenStopMarker(routeId=", this.f9730a, ", stopId=", this.b, ", stopName=");
        sbE.append(this.c);
        sbE.append(", latLng=");
        sbE.append(this.d);
        sbE.append(", markerBitmapDescriptor=");
        sbE.append(this.e);
        sbE.append(", etaData=");
        sbE.append(this.f);
        sbE.append(", isSelectedToShowEta=");
        z40.r(sbE, this.g, ", isDropOffStop=", this.h, ", eventHandler=");
        sbE.append(this.i);
        sbE.append(", infoWindowProvider=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
