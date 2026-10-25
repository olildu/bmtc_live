package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.location.LatLng;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopsMapMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3163a;
    public final StopAppModel b;
    public final boolean c;
    public final float d;
    public final PlatformMapMarkerBitmap e;
    public final ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 f;
    public final ChaloMapMarkerIconType.BitmapRes g;

    public NearbyStopsMapMarkerUIState(String id, StopAppModel stopAppModel, boolean z, float f, PlatformMapMarkerBitmap iconBitmap, ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 chaloMapMarkerUIEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(id, "id");
        Intrinsics.i(iconBitmap, "iconBitmap");
        this.f3163a = id;
        this.b = stopAppModel;
        this.c = z;
        this.d = f;
        this.e = iconBitmap;
        this.f = chaloMapMarkerUIEventHandler$Companion$fromLambda$1;
        this.g = new ChaloMapMarkerIconType.BitmapRes(iconBitmap);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getD() {
        return this.f;
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
    /* JADX INFO: renamed from: e */
    public final /* bridge */ boolean getG() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopsMapMarkerUIState)) {
            return false;
        }
        NearbyStopsMapMarkerUIState nearbyStopsMapMarkerUIState = (NearbyStopsMapMarkerUIState) obj;
        return Intrinsics.d(this.f3163a, nearbyStopsMapMarkerUIState.f3163a) && this.b.equals(nearbyStopsMapMarkerUIState.b) && this.c == nearbyStopsMapMarkerUIState.c && Float.compare(this.d, nearbyStopsMapMarkerUIState.d) == 0 && Intrinsics.d(this.e, nearbyStopsMapMarkerUIState.e) && equals(nearbyStopsMapMarkerUIState.f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return this.g;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF3163a() {
        return this.f3163a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition */
    public final LatLng getE() {
        return this.b.c;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        return hashCode() + ((this.e.hashCode() + r30.a(this.d, (n21.b(this.b, this.f3163a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "NearbyStopsMapMarkerUIState(id=" + this.f3163a + ", stop=" + this.b + ", isSelected=" + this.c + ", currentMapZoom=" + this.d + ", iconBitmap=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
