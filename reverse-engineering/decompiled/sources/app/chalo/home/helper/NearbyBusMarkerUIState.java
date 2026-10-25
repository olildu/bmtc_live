package app.chalo.home.helper;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/NearbyBusMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyBusMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3107a;
    public final LatLng b;
    public final PlatformMapMarkerBitmap c;
    public final ChaloMapMarkerUIEventHandler d;
    public final LatLng e;
    public final ChaloMapMarkerIconType.BitmapRes f;
    public final boolean g;

    public NearbyBusMarkerUIState(String id, LatLng latLng, PlatformMapMarkerBitmap iconBitmap, ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler) {
        Intrinsics.i(id, "id");
        Intrinsics.i(iconBitmap, "iconBitmap");
        this.f3107a = id;
        this.b = latLng;
        this.c = iconBitmap;
        this.d = chaloMapMarkerUIEventHandler;
        this.e = latLng;
        this.f = new ChaloMapMarkerIconType.BitmapRes(iconBitmap);
        this.g = true;
    }

    public static NearbyBusMarkerUIState f(NearbyBusMarkerUIState nearbyBusMarkerUIState, LatLng latLng) {
        String id = nearbyBusMarkerUIState.f3107a;
        PlatformMapMarkerBitmap iconBitmap = nearbyBusMarkerUIState.c;
        ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler = nearbyBusMarkerUIState.d;
        nearbyBusMarkerUIState.getClass();
        Intrinsics.i(id, "id");
        Intrinsics.i(iconBitmap, "iconBitmap");
        return new NearbyBusMarkerUIState(id, latLng, iconBitmap, chaloMapMarkerUIEventHandler);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChaloMapMarkerUIEventHandler getD() {
        return this.d;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ /* synthetic */ ChaloMapMarkerInfoWindow b() {
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
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyBusMarkerUIState)) {
            return false;
        }
        NearbyBusMarkerUIState nearbyBusMarkerUIState = (NearbyBusMarkerUIState) obj;
        return Intrinsics.d(this.f3107a, nearbyBusMarkerUIState.f3107a) && Intrinsics.d(this.b, nearbyBusMarkerUIState.b) && Intrinsics.d(this.c, nearbyBusMarkerUIState.c) && Intrinsics.d(this.d, nearbyBusMarkerUIState.d);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return this.f;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF3107a() {
        return this.f3107a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getE() {
        return this.e;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + i71.d(this.b, this.f3107a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "NearbyBusMarkerUIState(id=" + this.f3107a + ", latLng=" + this.b + ", iconBitmap=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
