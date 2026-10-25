package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.e01;
import defpackage.n3;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2", f = "RouteRecentCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ RecentsSpecialEntityStatus $newSpecialEntityStatus;
    final /* synthetic */ String $routeId;
    int label;
    final /* synthetic */ RouteRecentCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2(RouteRecentCityItineraryDaoImpl routeRecentCityItineraryDaoImpl, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeRecentCityItineraryDaoImpl;
        this.$newSpecialEntityStatus = recentsSpecialEntityStatus;
        this.$routeId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2(this.this$0, this.$newSpecialEntityStatus, this.$routeId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RouteRecentCityItineraryDaoImpl$updateSpecialStatus$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_route_tableQueries recent_route_tableQueries = this.this$0.f2080a;
        RecentsSpecialEntityStatus recents_special_entity_status = this.$newSpecialEntityStatus;
        String route_id = this.$routeId;
        String city_id = this.$cityId;
        recent_route_tableQueries.getClass();
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(city_id, "city_id");
        QueryResult queryResultA0 = recent_route_tableQueries.f697a.A0(-1857243231, "UPDATE recent_route_table\nSET recents_special_entity_status = ?\nWHERE route_id = ? AND city_id = ?", new n3(recent_route_tableQueries, recents_special_entity_status, route_id, city_id, 28));
        recent_route_tableQueries.T(-1857243231, new e01(25));
        return queryResultA0;
    }
}
