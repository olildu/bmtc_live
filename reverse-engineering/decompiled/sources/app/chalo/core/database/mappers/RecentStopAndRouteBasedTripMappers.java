package app.chalo.core.database.mappers;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/RecentStopAndRouteBasedTripMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentStopAndRouteBasedTripMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentStopAndRouteBasedTripMappers f2100a = new RecentStopAndRouteBasedTripMappers();

    public static RecentStopAndRouteBasedTripEntity a(String id, String cityId, String routeId, String routeName, RecentAdditionalRouteInfoEntity additionRouteInfo, RecentStopInfoEntity originStop, RecentStopInfoEntity destinationStop, ChaloTransitMode transitMode, long j, long j2) {
        Intrinsics.i(id, "id");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(additionRouteInfo, "additionRouteInfo");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        return new RecentStopAndRouteBasedTripEntity(id, cityId, routeId, routeName, additionRouteInfo, originStop, destinationStop, transitMode, j, (int) j2);
    }
}
