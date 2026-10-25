package app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler;

import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/livetrackinghandler/PremiumBusTrafficSignalMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTrafficSignalMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f7411a;
    public final IconType b;

    public PremiumBusTrafficSignalMarkerUIState(LatLng location, IconType markerIcon) {
        Intrinsics.i(location, "location");
        Intrinsics.i(markerIcon, "markerIcon");
        this.f7411a = location;
        this.b = markerIcon;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
        ChaloMapMarkerUIEventHandler.f1869a.getClass();
        return (ChaloMapMarkerUIEventHandler) ChaloMapMarkerUIEventHandler.Companion.b.getValue();
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
        return new MapOffset(0.5f, 1.0f);
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
        if (!(obj instanceof PremiumBusTrafficSignalMarkerUIState)) {
            return false;
        }
        PremiumBusTrafficSignalMarkerUIState premiumBusTrafficSignalMarkerUIState = (PremiumBusTrafficSignalMarkerUIState) obj;
        return Intrinsics.d(this.f7411a, premiumBusTrafficSignalMarkerUIState.f7411a) && this.b == premiumBusTrafficSignalMarkerUIState.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return new ChaloMapMarkerIconType.DrawableRes(this.b);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId */
    public final String getF3163a() {
        LatLng latLng = this.f7411a;
        return latLng.f5134a + "_" + latLng.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getF7411a() {
        return this.f7411a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7411a.hashCode() * 31);
    }

    public final String toString() {
        return "PremiumBusTrafficSignalMarkerUIState(location=" + this.f7411a + ", markerIcon=" + this.b + ")";
    }
}
