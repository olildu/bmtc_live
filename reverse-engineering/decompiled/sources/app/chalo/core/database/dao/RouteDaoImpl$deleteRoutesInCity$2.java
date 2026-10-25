package app.chalo.core.database.dao;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.core.Routes_tableQueries;
import defpackage.pn;
import defpackage.r31;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteDaoImpl$deleteRoutesInCity$2", f = "RouteDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDaoImpl$deleteRoutesInCity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ List<String> $routeIds;
    int label;
    final /* synthetic */ RouteDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDaoImpl$deleteRoutesInCity$2(RouteDaoImpl routeDaoImpl, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeDaoImpl;
        this.$routeIds = list;
        this.$cityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteDaoImpl$deleteRoutesInCity$2(this.this$0, this.$cityName, this.$routeIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RouteDaoImpl$deleteRoutesInCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Routes_tableQueries routes_tableQueries = this.this$0.f2079a;
        List<String> routeId = this.$routeIds;
        String cityId = this.$cityName;
        routes_tableQueries.getClass();
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        String strS = BaseTransacterImpl.S(routeId.size());
        SqlDriver sqlDriver = routes_tableQueries.f697a;
        String strY0 = StringsKt.y0("\n        |DELETE FROM routes_table\n        |WHERE routeId IN " + strS + " AND cityId = ?\n        ");
        routeId.size();
        QueryResult queryResultA0 = sqlDriver.A0(null, strY0, new pn(routeId, cityId, 3));
        routes_tableQueries.T(1217064779, new r31(20));
        return queryResultA0;
    }
}
