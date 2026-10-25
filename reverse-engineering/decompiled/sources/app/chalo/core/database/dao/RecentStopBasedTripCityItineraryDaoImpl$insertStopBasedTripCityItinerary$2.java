package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_stop_based_trip_table;
import app.chalo.core.Recent_stop_based_trip_tableQueries;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2", f = "RecentStopBasedTripCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ RecentStopBasedTripEntity $recentStopBasedTripEntity;
    int label;
    final /* synthetic */ RecentStopBasedTripCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2(RecentStopBasedTripCityItineraryDaoImpl recentStopBasedTripCityItineraryDaoImpl, RecentStopBasedTripEntity recentStopBasedTripEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopBasedTripCityItineraryDaoImpl;
        this.$recentStopBasedTripEntity = recentStopBasedTripEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2(this.this$0, this.$recentStopBasedTripEntity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopBasedTripCityItineraryDaoImpl$insertStopBasedTripCityItinerary$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries = this.this$0.f2074a;
        RecentStopBasedTripEntity recentStopBasedTripEntity = this.$recentStopBasedTripEntity;
        Intrinsics.i(recentStopBasedTripEntity, "<this>");
        Recent_stop_based_trip_table recent_stop_based_trip_table = new Recent_stop_based_trip_table(recentStopBasedTripEntity.f8945a, recentStopBasedTripEntity.b, recentStopBasedTripEntity.c, recentStopBasedTripEntity.d, recentStopBasedTripEntity.e, recentStopBasedTripEntity.f, recentStopBasedTripEntity.g);
        recent_stop_based_trip_tableQueries.getClass();
        QueryResult queryResultA0 = recent_stop_based_trip_tableQueries.f697a.A0(-9233847, "INSERT OR REPLACE INTO recent_stop_based_trip_table (stop_based_trip_id, city_id, origin_stop, destination_stop, transit_mode, access_time, access_count) VALUES (?, ?, ?, ?, ?, ?, ?)", new t01(5, recent_stop_based_trip_table, recent_stop_based_trip_tableQueries));
        recent_stop_based_trip_tableQueries.T(-9233847, new z01(11));
        return queryResultA0;
    }
}
