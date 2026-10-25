package defpackage;

import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.location.LatLng;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19292a;
    public final /* synthetic */ LatLng b;

    public /* synthetic */ sd(int i, LatLng latLng) {
        this.f19292a = i;
        this.b = latLng;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19292a) {
            case 0:
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, false, false, null, null, this.b, null, 0L, 0L, false, 2015);
            case 1:
                BusesAroundYouDataState busesAroundYouDataState = (BusesAroundYouDataState) obj;
                return BusesAroundYouDataState.a(busesAroundYouDataState, false, false, NearbyBusesMapData.a(busesAroundYouDataState.c, null, new MapCameraViewState.UpdatedState.ZoomToLatLng(this.b, 16.0f, true), null, 11), null, null, null, 0L, 0L, false, 2043);
            default:
                RegularBusViewState it2 = (RegularBusViewState) obj;
                Intrinsics.i(it2, "it");
                return RegularBusViewState.a(it2, false, null, null, null, false, NearbyBusesMapData.a(it2.f, null, new MapCameraViewState.UpdatedState.ZoomToLatLng(this.b, 0.0f, 6), null, 11), null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4194239);
        }
    }
}
