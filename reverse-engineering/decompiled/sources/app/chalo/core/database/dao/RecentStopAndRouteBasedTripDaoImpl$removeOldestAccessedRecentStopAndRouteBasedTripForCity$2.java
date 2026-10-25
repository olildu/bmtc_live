package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import defpackage.eu0;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl$removeOldestAccessedRecentStopAndRouteBasedTripForCity$2", f = "RecentStopAndRouteBasedTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopAndRouteBasedTripDaoImpl$removeOldestAccessedRecentStopAndRouteBasedTripForCity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ RecentStopAndRouteBasedTripDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripDaoImpl$removeOldestAccessedRecentStopAndRouteBasedTripForCity$2(RecentStopAndRouteBasedTripDaoImpl recentStopAndRouteBasedTripDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopAndRouteBasedTripDaoImpl;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopAndRouteBasedTripDaoImpl$removeOldestAccessedRecentStopAndRouteBasedTripForCity$2(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopAndRouteBasedTripDaoImpl$removeOldestAccessedRecentStopAndRouteBasedTripForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries = this.this$0.f2073a;
        String city_id = this.$cityId;
        recent_stop_and_route_based_trip_tableQueries.getClass();
        Intrinsics.i(city_id, "city_id");
        QueryResult queryResultA0 = recent_stop_and_route_based_trip_tableQueries.f697a.A0(-736917003, "DELETE FROM recent_stop_and_route_based_trip_table WHERE city_id = ? AND access_time = (SELECT access_time FROM recent_stop_and_route_based_trip_table ORDER BY access_time LIMIT 1)", new eu0(city_id, 25));
        recent_stop_and_route_based_trip_tableQueries.T(-736917003, new z01(5));
        return queryResultA0;
    }
}
