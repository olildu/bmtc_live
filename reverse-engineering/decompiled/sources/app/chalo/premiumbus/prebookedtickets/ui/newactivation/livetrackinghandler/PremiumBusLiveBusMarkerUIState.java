package app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler;

import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.location.LatLng;
import defpackage.i71;
import defpackage.kn0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/livetrackinghandler/PremiumBusLiveBusMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusLiveBusMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7407a;
    public final LatLng b;
    public final PlatformMapMarkerBitmap c;
    public final boolean d;
    public final boolean e;
    public final ChaloMapMarkerInfoWindowProvider f;
    public final ChaloMapMarkerUIEventHandler g;
    public final float h;
    public final Lazy i;

    public PremiumBusLiveBusMarkerUIState(String vehicleNumber, LatLng position, PlatformMapMarkerBitmap markerIcon, boolean z, boolean z2, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider) {
        ChaloMapMarkerUIEventHandler.f1869a.getClass();
        ChaloMapMarkerUIEventHandler premiumMarkerEventHandler = (ChaloMapMarkerUIEventHandler) ChaloMapMarkerUIEventHandler.Companion.b.getValue();
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(position, "position");
        Intrinsics.i(markerIcon, "markerIcon");
        Intrinsics.i(premiumMarkerEventHandler, "premiumMarkerEventHandler");
        this.f7407a = vehicleNumber;
        this.b = position;
        this.c = markerIcon;
        this.d = z;
        this.e = z2;
        this.f = chaloMapMarkerInfoWindowProvider;
        this.g = premiumMarkerEventHandler;
        this.h = 1.0f;
        this.i = LazyKt.b(new kn0(this, 20));
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
        return (ChaloMapMarkerUIEventHandler) this.i.getValue();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b */
    public final ChaloMapMarkerInfoWindow getF() {
        return null;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: c */
    public final /* bridge */ MapOffset getG() {
        return ChaloMapMarkerUIState.DefaultImpls.a();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: d */
    public final MapOffset getD() {
        return (this.d || this.e) ? new MapOffset(0.15f, 0.7f) : new MapOffset(0.5f, 0.5f);
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
        if (!(obj instanceof PremiumBusLiveBusMarkerUIState)) {
            return false;
        }
        PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) obj;
        return Intrinsics.d(this.f7407a, premiumBusLiveBusMarkerUIState.f7407a) && Intrinsics.d(this.b, premiumBusLiveBusMarkerUIState.b) && Intrinsics.d(this.c, premiumBusLiveBusMarkerUIState.c) && this.d == premiumBusLiveBusMarkerUIState.d && this.e == premiumBusLiveBusMarkerUIState.e && Intrinsics.d(this.f, premiumBusLiveBusMarkerUIState.f) && Intrinsics.d(this.g, premiumBusLiveBusMarkerUIState.g);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getIcon */
    public final ChaloMapMarkerIconType getC() {
        return new ChaloMapMarkerIconType.BitmapRes(this.c);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF7407a() {
        return this.f7407a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getZIndex, reason: from getter */
    public final float getH() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + i71.d(this.b, this.f7407a.hashCode() * 31, 31)) * 31) + (this.d ? 1231 : 1237)) * 31;
        int i = this.e ? 1231 : 1237;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "PremiumBusLiveBusMarkerUIState(vehicleNumber=" + this.f7407a + ", position=" + this.b + ", markerIcon=" + this.c + ", isHalted=" + this.d + ", isDelayed=" + this.e + ", infoWindowProvider=" + this.f + ", premiumMarkerEventHandler=" + this.g + ")";
    }
}
