package defpackage;

import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.location.LatLngBounds;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q31 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19087a;
    public final /* synthetic */ LatLngBounds b;

    public /* synthetic */ q31(LatLngBounds latLngBounds, int i) {
        this.f19087a = i;
        this.b = latLngBounds;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteDetailsDataState it = (RouteDetailsDataState) obj;
        switch (this.f19087a) {
            case 0:
                Intrinsics.i(it, "it");
                break;
            default:
                Intrinsics.i(it, "it");
                break;
        }
        return RouteDetailsDataState.a(it, false, null, null, null, null, null, null, null, null, null, null, RouteDetailsMapUiModel.a(it.m, null, false, new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(this.b, 300)), 3), null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -4097, 127);
    }
}
