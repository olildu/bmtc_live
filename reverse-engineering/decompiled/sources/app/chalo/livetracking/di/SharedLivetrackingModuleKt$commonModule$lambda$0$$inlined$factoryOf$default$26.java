package app.chalo.livetracking.di;

import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.LivePassengerIndicatorUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26 implements Function2<Scope, ParametersHolder, RouteDetailsUIStateFactory> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(RouteTimeTableUIStateFactory.class), null, null);
        Object objD3 = scope.d(Reflection.a(LivePassengerIndicatorUIStateFactory.class), null, null);
        Object objD4 = scope.d(Reflection.a(RouteDetailsStopsListUIStateFactory.class), null, null);
        return new RouteDetailsUIStateFactory((StringProvider) objD, (RouteTimeTableUIStateFactory) objD2, (LivePassengerIndicatorUIStateFactory) objD3, (RouteDetailsStopsListUIStateFactory) objD4, (RouteStopCardUIStateFactory) scope.d(Reflection.a(RouteStopCardUIStateFactory.class), null, null), (ChaloMapMarkerInfoWindowProvider) scope.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null));
    }
}
