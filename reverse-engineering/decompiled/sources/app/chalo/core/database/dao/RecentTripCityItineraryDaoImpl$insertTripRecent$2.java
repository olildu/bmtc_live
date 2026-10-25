package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Recent_trip_tableQueries;
import app.chalo.recent.database.entities.RecentTripEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentTripCityItineraryDaoImpl$insertTripRecent$2", f = "RecentTripCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentTripCityItineraryDaoImpl$insertTripRecent$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ RecentTripEntity $recentTripEntity;
    int label;
    final /* synthetic */ RecentTripCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentTripCityItineraryDaoImpl$insertTripRecent$2(RecentTripCityItineraryDaoImpl recentTripCityItineraryDaoImpl, RecentTripEntity recentTripEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentTripCityItineraryDaoImpl;
        this.$recentTripEntity = recentTripEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentTripCityItineraryDaoImpl$insertTripRecent$2(this.this$0, this.$recentTripEntity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentTripCityItineraryDaoImpl$insertTripRecent$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_trip_tableQueries recent_trip_tableQueries = this.this$0.f2076a;
        RecentTripEntity recentTripEntity = this.$recentTripEntity;
        Intrinsics.i(recentTripEntity, "<this>");
        Recent_trip_table recent_trip_table = new Recent_trip_table(recentTripEntity.f8949a, recentTripEntity.b, recentTripEntity.c, recentTripEntity.d, recentTripEntity.e, recentTripEntity.f, recentTripEntity.g);
        recent_trip_tableQueries.getClass();
        QueryResult queryResultA0 = recent_trip_tableQueries.f697a.A0(-970860672, "INSERT OR REPLACE INTO recent_trip_table (trip_id, city_id, from_location, to_location, transit_mode, access_time, access_count) VALUES (?, ?, ?, ?, ?, ?, ?)", new t01(7, recent_trip_table, recent_trip_tableQueries));
        recent_trip_tableQueries.T(-970860672, new z01(23));
        return queryResultA0;
    }
}
