package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteMapInfoWindowKt;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20028a;
    public final /* synthetic */ LiveVehiclesMarkerUIState.VehicleNumberViewUIState b;

    public /* synthetic */ xk(LiveVehiclesMarkerUIState.VehicleNumberViewUIState vehicleNumberViewUIState, int i) {
        this.f20028a = i;
        this.b = vehicleNumberViewUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20028a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1836777993, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getVehicleMapMarkerInfoWindow.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:58)");
                    }
                    InfoWindowKt.a(composer, 6, ComposableLambdaKt.rememberComposableLambda(-1025420836, true, new xk(this.b, 1), composer, 54));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1025420836, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getVehicleMapMarkerInfoWindow.<anonymous>.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:59)");
                    }
                    RouteMapInfoWindowKt.b(this.b, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
