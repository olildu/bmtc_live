package app.chalo.core.database.mappers;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/RouteRecentCityItineraryMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteRecentCityItineraryMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteRecentCityItineraryMappers f2106a = new RouteRecentCityItineraryMappers();

    public static RecentRouteEntity a(String routeId, String cityId, String routeName, String startStopName, String endStopName, String str, boolean z, List list, boolean z2, ChaloTransitMode transitMode, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, long j2, String str2, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        return new RecentRouteEntity(routeId, cityId, routeName, startStopName, endStopName, str, z, list, z2, transitMode, recentsSpecialEntityStatus, j, (int) j2, str2, routeNamingScheme);
    }
}
