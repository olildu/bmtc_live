package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_stop_tableQueries;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopCityItineraryEntityDaoImpl$removeOldestAccessedRecentStopForCity$2", f = "RecentStopCityItineraryEntityDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopCityItineraryEntityDaoImpl$removeOldestAccessedRecentStopForCity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ RecentStopCityItineraryEntityDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopCityItineraryEntityDaoImpl$removeOldestAccessedRecentStopForCity$2(RecentStopCityItineraryEntityDaoImpl recentStopCityItineraryEntityDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopCityItineraryEntityDaoImpl;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopCityItineraryEntityDaoImpl$removeOldestAccessedRecentStopForCity$2(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopCityItineraryEntityDaoImpl$removeOldestAccessedRecentStopForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_stop_tableQueries recent_stop_tableQueries = this.this$0.f2075a;
        String city_id = this.$cityId;
        recent_stop_tableQueries.getClass();
        Intrinsics.i(city_id, "city_id");
        QueryResult queryResultA0 = recent_stop_tableQueries.f697a.A0(1480525005, "DELETE FROM recent_stop_table WHERE city_id = ? AND access_time = (SELECT access_time FROM recent_stop_table ORDER BY access_time LIMIT 1)", new eu0(city_id, 27));
        recent_stop_tableQueries.T(1480525005, new z01(21));
        return queryResultA0;
    }
}
