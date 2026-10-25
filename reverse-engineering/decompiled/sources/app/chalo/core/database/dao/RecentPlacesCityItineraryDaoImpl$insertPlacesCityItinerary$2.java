package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_place_tableQueries;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import defpackage.e01;
import defpackage.t01;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2", f = "RecentPlacesCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ RecentPlaceEntity $recentPlaceEntity;
    int label;
    final /* synthetic */ RecentPlacesCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2(RecentPlacesCityItineraryDaoImpl recentPlacesCityItineraryDaoImpl, RecentPlaceEntity recentPlaceEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentPlacesCityItineraryDaoImpl;
        this.$recentPlaceEntity = recentPlaceEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2(this.this$0, this.$recentPlaceEntity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentPlacesCityItineraryDaoImpl$insertPlacesCityItinerary$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_place_tableQueries recent_place_tableQueries = this.this$0.f2072a;
        RecentPlaceEntity recentPlaceEntity = this.$recentPlaceEntity;
        Intrinsics.i(recentPlaceEntity, "<this>");
        Recent_place_table recent_place_table = new Recent_place_table(recentPlaceEntity.f8940a, recentPlaceEntity.b, recentPlaceEntity.c, recentPlaceEntity.d, recentPlaceEntity.e, recentPlaceEntity.f, recentPlaceEntity.g, recentPlaceEntity.h, recentPlaceEntity.i, recentPlaceEntity.j);
        recent_place_tableQueries.getClass();
        QueryResult queryResultA0 = recent_place_tableQueries.f697a.A0(-1944116068, "INSERT OR REPLACE INTO recent_place_table (place_id, search_partner, city_id, location_description, location_title, lat_lng, recents_special_entity_status, access_time, access_count, label) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t01(2, recent_place_table, recent_place_tableQueries));
        recent_place_tableQueries.T(-1944116068, new e01(14));
        return queryResultA0;
    }
}
