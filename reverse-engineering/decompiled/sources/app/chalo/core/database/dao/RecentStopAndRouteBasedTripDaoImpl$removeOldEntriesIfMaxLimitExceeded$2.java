package app.chalo.core.database.dao;

import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import defpackage.xa;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2", f = "RecentStopAndRouteBasedTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ int $maxAllowed;
    int label;
    final /* synthetic */ RecentStopAndRouteBasedTripDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2(RecentStopAndRouteBasedTripDaoImpl recentStopAndRouteBasedTripDaoImpl, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopAndRouteBasedTripDaoImpl;
        this.$cityId = str;
        this.$maxAllowed = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2(this.this$0, this.$cityId, this.$maxAllowed, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2 recentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2 = (RecentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        recentStopAndRouteBasedTripDaoImpl$removeOldEntriesIfMaxLimitExceeded$2.invokeSuspend(unit);
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
        String cityId = this.$cityId;
        long j = this.$maxAllowed;
        recent_stop_and_route_based_trip_tableQueries.getClass();
        Intrinsics.i(cityId, "cityId");
        recent_stop_and_route_based_trip_tableQueries.f697a.A0(907478456, "DELETE FROM recent_stop_and_route_based_trip_table WHERE id IN (\nSELECT id FROM recent_stop_and_route_based_trip_table\nWHERE city_id = ?\nORDER BY access_time ASC\nLIMIT CASE\nWHEN (SELECT COUNT(*) FROM recent_stop_and_route_based_trip_table WHERE city_id = ?) > ?\nTHEN (SELECT COUNT(*) FROM recent_stop_and_route_based_trip_table WHERE city_id = ?) - ?\nELSE 0 END)", new xa(cityId, j, 8));
        recent_stop_and_route_based_trip_tableQueries.T(907478456, new z01(2));
        return Unit.f17538a;
    }
}
