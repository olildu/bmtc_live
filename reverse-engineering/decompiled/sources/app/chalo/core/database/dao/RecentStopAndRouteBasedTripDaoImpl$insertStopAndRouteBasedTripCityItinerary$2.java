package app.chalo.core.database.dao;

import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import defpackage.t01;
import defpackage.z01;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2", f = "RecentStopAndRouteBasedTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ RecentStopAndRouteBasedTripEntity $recentStopAndRouteBasedTripEntity;
    int label;
    final /* synthetic */ RecentStopAndRouteBasedTripDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2(RecentStopAndRouteBasedTripDaoImpl recentStopAndRouteBasedTripDaoImpl, RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopAndRouteBasedTripDaoImpl;
        this.$recentStopAndRouteBasedTripEntity = recentStopAndRouteBasedTripEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2(this.this$0, this.$recentStopAndRouteBasedTripEntity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2 recentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2 = (RecentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        recentStopAndRouteBasedTripDaoImpl$insertStopAndRouteBasedTripCityItinerary$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries = this.this$0.f2073a;
        RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity = this.$recentStopAndRouteBasedTripEntity;
        Intrinsics.i(recentStopAndRouteBasedTripEntity, "<this>");
        Recent_stop_and_route_based_trip_table recent_stop_and_route_based_trip_table = new Recent_stop_and_route_based_trip_table(recentStopAndRouteBasedTripEntity.f8943a, recentStopAndRouteBasedTripEntity.b, recentStopAndRouteBasedTripEntity.c, recentStopAndRouteBasedTripEntity.d, recentStopAndRouteBasedTripEntity.e, recentStopAndRouteBasedTripEntity.f, recentStopAndRouteBasedTripEntity.g, recentStopAndRouteBasedTripEntity.h, recentStopAndRouteBasedTripEntity.i, recentStopAndRouteBasedTripEntity.j);
        recent_stop_and_route_based_trip_tableQueries.getClass();
        recent_stop_and_route_based_trip_tableQueries.f697a.A0(810804793, "INSERT OR REPLACE INTO recent_stop_and_route_based_trip_table (id, city_id, route_id, route_name, additional_route_info, origin_stop, destination_stop, transit_mode, access_time, access_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t01(4, recent_stop_and_route_based_trip_table, recent_stop_and_route_based_trip_tableQueries));
        recent_stop_and_route_based_trip_tableQueries.T(810804793, new z01(1));
        return Unit.f17538a;
    }
}
