package app.chalo.uistate.components.map;

import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/components/map/ChaloMapUIEventHandler$Companion$NO_OP$2$1", "Lapp/chalo/uistate/components/map/ChaloMapUIEventHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloMapUIEventHandler$Companion$NO_OP$2$1 implements ChaloMapUIEventHandler {
    @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
    public final void a(MapCameraUpdate data) {
        Intrinsics.i(data, "data");
    }

    @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
    public final void c(ChaloMapCameraPositionStateData data) {
        Intrinsics.i(data, "data");
    }

    @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
    public final void d(LatLng latLng) {
        Intrinsics.i(latLng, "latLng");
    }

    @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
    public final void b() {
    }
}
