package app.chalo.core.chalomap;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsStopMarkerUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopMarkerUIState;
import app.chalo.premiumbus.ui.changestop.ChangeStopMapMarkerUIState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapMarkerUIState;
import app.chalo.titoridedetail.ui.compose.TitoRideDetailsScreenStopMarker;
import defpackage.sk;
import defpackage.tk;
import defpackage.uk;
import defpackage.vk;
import defpackage.wk;
import defpackage.xk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/chalomap/ChaloMapMarkerInfoWindowProviderAndroid;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerInfoWindowProvider;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloMapMarkerInfoWindowProviderAndroid implements ChaloMapMarkerInfoWindowProvider {
    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider
    public final ChaloMapMarkerInfoWindow a(ChaloMapInfoWindowData data) {
        Intrinsics.i(data, "data");
        if (data instanceof RouteDetailsStopMarkerUIState.StopMarkerInfoWindowUIState) {
            return new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(-442102498, true, new sk((RouteDetailsStopMarkerUIState.StopMarkerInfoWindowUIState) data, 0)));
        }
        if (data instanceof LiveVehiclesMarkerUIState.VehicleNumberViewUIState) {
            return new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(1836777993, true, new xk((LiveVehiclesMarkerUIState.VehicleNumberViewUIState) data, 0)));
        }
        if (data instanceof PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState) {
            return new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(-520444330, true, new uk((PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState) data, 1)));
        }
        if (data instanceof TitoRideDetailsScreenStopMarker.TitoRideDetailsScreenStopMarkerInfoWindowData) {
            return new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(-1951138488, true, new tk((TitoRideDetailsScreenStopMarker.TitoRideDetailsScreenStopMarkerInfoWindowData) data, 1)));
        }
        if (data instanceof PremiumBusStopMarkerUIState.PBStopMarkerInfoWindowData) {
            return new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(-1048041448, true, new vk((PremiumBusStopMarkerUIState.PBStopMarkerInfoWindowData) data, 0)));
        }
        return data instanceof ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState ? new ChaloMapMarkerInfoWindow(ComposableLambdaKt.composableLambdaInstance(-1900956271, true, new wk((ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState) data, 0))) : new ChaloMapMarkerInfoWindow(ComposableSingletons$ChaloMapMarkerInfoWindowProvider_androidKt.f2028a);
    }
}
