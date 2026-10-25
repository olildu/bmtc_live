package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_trip_tableQueries;
import defpackage.v01;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentTripCityItineraryDaoImpl$updateAccessTimeForTripRecentForCity$2", f = "RecentTripCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentTripCityItineraryDaoImpl$updateAccessTimeForTripRecentForCity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ long $accessTime;
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $tripId;
    int label;
    final /* synthetic */ RecentTripCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentTripCityItineraryDaoImpl$updateAccessTimeForTripRecentForCity$2(RecentTripCityItineraryDaoImpl recentTripCityItineraryDaoImpl, long j, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentTripCityItineraryDaoImpl;
        this.$accessTime = j;
        this.$tripId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentTripCityItineraryDaoImpl$updateAccessTimeForTripRecentForCity$2(this.this$0, this.$accessTime, this.$tripId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentTripCityItineraryDaoImpl$updateAccessTimeForTripRecentForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_trip_tableQueries recent_trip_tableQueries = this.this$0.f2076a;
        long j = this.$accessTime;
        String trip_id = this.$tripId;
        String city_id = this.$cityId;
        recent_trip_tableQueries.getClass();
        Intrinsics.i(trip_id, "trip_id");
        Intrinsics.i(city_id, "city_id");
        QueryResult queryResultA0 = recent_trip_tableQueries.f697a.A0(-940816468, "UPDATE recent_trip_table SET access_time = ? WHERE trip_id = ? AND city_id = ?", new v01(j, trip_id, city_id, 11));
        recent_trip_tableQueries.T(-940816468, new z01(27));
        return queryResultA0;
    }
}
