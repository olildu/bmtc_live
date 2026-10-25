package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Last_ride_info_table;
import app.chalo.core.Last_ride_info_tableQueries;
import app.chalo.models.LastRideInfo;
import defpackage.ib0;
import defpackage.t60;
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
@DebugMetadata(c = "app.chalo.core.database.dao.LastRideInfoDaoImpl$storeLastRideInfo$2", f = "LastRideInfoDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class LastRideInfoDaoImpl$storeLastRideInfo$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $city;
    final /* synthetic */ LastRideInfo $data;
    int label;
    final /* synthetic */ LastRideInfoDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastRideInfoDaoImpl$storeLastRideInfo$2(LastRideInfoDaoImpl lastRideInfoDaoImpl, LastRideInfo lastRideInfo, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = lastRideInfoDaoImpl;
        this.$data = lastRideInfo;
        this.$city = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LastRideInfoDaoImpl$storeLastRideInfo$2(this.this$0, this.$data, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LastRideInfoDaoImpl$storeLastRideInfo$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Last_ride_info_tableQueries last_ride_info_tableQueries = this.this$0.f2052a;
        LastRideInfo lastRideInfo = this.$data;
        String city = this.$city;
        Intrinsics.i(lastRideInfo, "<this>");
        Intrinsics.i(city, "city");
        Last_ride_info_table last_ride_info_table = new Last_ride_info_table(city, lastRideInfo);
        last_ride_info_tableQueries.getClass();
        QueryResult queryResultA0 = last_ride_info_tableQueries.f697a.A0(-1845646539, "INSERT OR REPLACE INTO last_ride_info_table (city, lastRideInfo) VALUES (?, ?)", new t60(15, last_ride_info_table, last_ride_info_tableQueries));
        last_ride_info_tableQueries.T(-1845646539, new ib0(29));
        return queryResultA0;
    }
}
