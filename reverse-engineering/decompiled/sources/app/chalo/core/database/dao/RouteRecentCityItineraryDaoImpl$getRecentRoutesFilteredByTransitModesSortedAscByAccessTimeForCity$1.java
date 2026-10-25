package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RouteRecentCityItineraryMappers;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RouteRecentCityItineraryDaoImpl$getRecentRoutesFilteredByTransitModesSortedAscByAccessTimeForCity$1 extends FunctionReferenceImpl implements Function15<String, String, String, String, String, String, Boolean, List<? extends String>, Boolean, ChaloTransitMode, RecentsSpecialEntityStatus, Long, Long, String, RouteNamingSchemeType, RecentRouteEntity> {
    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p3 = (String) obj4;
        String p4 = (String) obj5;
        ChaloTransitMode p9 = (ChaloTransitMode) obj10;
        RecentsSpecialEntityStatus p10 = (RecentsSpecialEntityStatus) obj11;
        RouteNamingSchemeType p14 = (RouteNamingSchemeType) obj15;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p10, "p10");
        Intrinsics.i(p14, "p14");
        ((RouteRecentCityItineraryMappers) this.receiver).getClass();
        return RouteRecentCityItineraryMappers.a(p0, p1, p2, p3, p4, (String) obj6, ((Boolean) obj7).booleanValue(), (List) obj8, ((Boolean) obj9).booleanValue(), p9, p10, ((Number) obj12).longValue(), ((Number) obj13).longValue(), (String) obj14, p14);
    }
}
