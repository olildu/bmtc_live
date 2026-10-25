package defpackage;

import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.location.LocationUpdateResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class td implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19648a;
    public final /* synthetic */ LocationUpdateResult b;

    public /* synthetic */ td(LocationUpdateResult locationUpdateResult, int i) {
        this.f19648a = i;
        this.b = locationUpdateResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19648a) {
            case 0:
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, this.b instanceof LocationUpdateResult.LocationReceived, false, null, null, null, null, 0L, 0L, false, 2046);
            default:
                NearbyStopsMapState it2 = (NearbyStopsMapState) obj;
                Intrinsics.i(it2, "it");
                return NearbyStopsMapState.a(it2, false, null, null, null, false, new MapCameraViewState.UpdatedState.ZoomToLatLng(((LocationUpdateResult.LocationReceived) this.b).f5154a.a(), 16.0f, true), null, null, null, null, null, false, 32703);
        }
    }
}
