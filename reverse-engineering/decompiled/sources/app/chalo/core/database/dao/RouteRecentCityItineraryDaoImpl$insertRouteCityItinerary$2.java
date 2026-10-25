package app.chalo.core.database.dao;

import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.recent.database.entities.RecentRouteEntity;
import defpackage.e01;
import defpackage.t01;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2", f = "RouteRecentCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ RecentRouteEntity $routeRecent;
    int label;
    final /* synthetic */ RouteRecentCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2(RouteRecentCityItineraryDaoImpl routeRecentCityItineraryDaoImpl, RecentRouteEntity recentRouteEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeRecentCityItineraryDaoImpl;
        this.$routeRecent = recentRouteEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2(this.this$0, this.$routeRecent, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2 routeRecentCityItineraryDaoImpl$insertRouteCityItinerary$2 = (RouteRecentCityItineraryDaoImpl$insertRouteCityItinerary$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        routeRecentCityItineraryDaoImpl$insertRouteCityItinerary$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_route_tableQueries recent_route_tableQueries = this.this$0.f2080a;
        RecentRouteEntity recentRouteEntity = this.$routeRecent;
        Intrinsics.i(recentRouteEntity, "<this>");
        Recent_route_table recent_route_table = new Recent_route_table(recentRouteEntity.f8942a, recentRouteEntity.b, recentRouteEntity.c, recentRouteEntity.d, recentRouteEntity.e, recentRouteEntity.f, recentRouteEntity.g, recentRouteEntity.h, recentRouteEntity.i, recentRouteEntity.j, recentRouteEntity.k, recentRouteEntity.l, recentRouteEntity.m, recentRouteEntity.n, recentRouteEntity.o);
        recent_route_tableQueries.getClass();
        recent_route_tableQueries.f697a.A0(-1580954063, "INSERT OR REPLACE INTO recent_route_table (route_id, city_id, route_name, start_stop_name, end_stop_name, agency, isAcBus, special_feature_list, is_free_ride_available, transit_mode, recents_special_entity_status, access_time, access_count, via, routeNamingScheme) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t01(3, recent_route_table, recent_route_tableQueries));
        recent_route_tableQueries.T(-1580954063, new e01(27));
        return Unit.f17538a;
    }
}
