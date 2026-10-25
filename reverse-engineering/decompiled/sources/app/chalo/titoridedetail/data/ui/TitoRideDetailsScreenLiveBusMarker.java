package app.chalo.titoridedetail.data.ui;

import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.location.LatLng;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TitoRideDetailsScreenLiveBusMarker;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitoRideDetailsScreenLiveBusMarker implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9692a;
    public final LatLng b;
    public final PlatformMapMarkerBitmap c;
    public final boolean d;
    public final boolean e;
    public final ChaloMapMarkerUIEventHandler f;
    public final ChaloMapMarkerIconType.BitmapRes g;

    public TitoRideDetailsScreenLiveBusMarker(String vehicleNumber, LatLng latLng, PlatformMapMarkerBitmap markerIcon, boolean z, boolean z2, ChaloMapMarkerUIEventHandler eventHandler) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(markerIcon, "markerIcon");
        Intrinsics.i(eventHandler, "eventHandler");
        this.f9692a = vehicleNumber;
        this.b = latLng;
        this.c = markerIcon;
        this.d = z;
        this.e = z2;
        this.f = eventHandler;
        this.g = new ChaloMapMarkerIconType.BitmapRes(markerIcon);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChaloMapMarkerUIEventHandler getF() {
        return this.f;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerInfoWindow b() {
        return null;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ MapOffset c() {
        return ChaloMapMarkerUIState.DefaultImpls.a();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final MapOffset d() {
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
        if (!(obj instanceof TitoRideDetailsScreenLiveBusMarker)) {
            return false;
        }
        TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker = (TitoRideDetailsScreenLiveBusMarker) obj;
        return Intrinsics.d(this.f9692a, titoRideDetailsScreenLiveBusMarker.f9692a) && Intrinsics.d(this.b, titoRideDetailsScreenLiveBusMarker.b) && Intrinsics.d(this.c, titoRideDetailsScreenLiveBusMarker.c) && this.d == titoRideDetailsScreenLiveBusMarker.d && this.e == titoRideDetailsScreenLiveBusMarker.e && Intrinsics.d(this.f, titoRideDetailsScreenLiveBusMarker.f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return this.g;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId */
    public final String getB() {
        return this.f9692a + " - " + this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getC() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((this.c.hashCode() + i71.d(this.b, this.f9692a.hashCode() * 31, 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TitoRideDetailsScreenLiveBusMarker(vehicleNumber=" + this.f9692a + ", position=" + this.b + ", markerIcon=" + this.c + ", isHalted=" + this.d + ", isDelayed=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
