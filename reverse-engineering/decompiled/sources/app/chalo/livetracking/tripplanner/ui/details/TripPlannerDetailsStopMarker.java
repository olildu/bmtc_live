package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsStopMarker;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerDetailsStopMarker implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4740a;
    public final LatLng b;
    public final IconType c;
    public final ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 d;
    public final LatLng e;
    public final ChaloMapMarkerIconType.DrawableRes f;

    public TripPlannerDetailsStopMarker(String str, LatLng latLng, IconType markerBitmapDescriptor, ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 chaloMapMarkerUIEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(markerBitmapDescriptor, "markerBitmapDescriptor");
        this.f4740a = str;
        this.b = latLng;
        this.c = markerBitmapDescriptor;
        this.d = chaloMapMarkerUIEventHandler$Companion$fromLambda$1;
        this.e = latLng;
        this.f = new ChaloMapMarkerIconType.DrawableRes(markerBitmapDescriptor);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
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
    /* JADX INFO: renamed from: e */
    public final /* bridge */ boolean getG() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerDetailsStopMarker)) {
            return false;
        }
        TripPlannerDetailsStopMarker tripPlannerDetailsStopMarker = (TripPlannerDetailsStopMarker) obj;
        return this.f4740a.equals(tripPlannerDetailsStopMarker.f4740a) && Intrinsics.d(this.b, tripPlannerDetailsStopMarker.b) && this.c == tripPlannerDetailsStopMarker.c && equals(tripPlannerDetailsStopMarker.d);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return this.f;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF4740a() {
        return this.f4740a;
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
        return hashCode() + ((this.c.hashCode() + i71.d(this.b, this.f4740a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "TripPlannerDetailsStopMarker(id=" + this.f4740a + ", latLng=" + this.b + ", markerBitmapDescriptor=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
