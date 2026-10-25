package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Recent_place_tableQueries;
import defpackage.e01;
import defpackage.yi0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RecentPlacesCityItineraryDaoImpl$updateLabel$2", f = "RecentPlacesCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentPlacesCityItineraryDaoImpl$updateLabel$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $newLabel;
    final /* synthetic */ String $placeId;
    int label;
    final /* synthetic */ RecentPlacesCityItineraryDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPlacesCityItineraryDaoImpl$updateLabel$2(RecentPlacesCityItineraryDaoImpl recentPlacesCityItineraryDaoImpl, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentPlacesCityItineraryDaoImpl;
        this.$newLabel = str;
        this.$placeId = str2;
        this.$cityId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentPlacesCityItineraryDaoImpl$updateLabel$2(this.this$0, this.$newLabel, this.$placeId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentPlacesCityItineraryDaoImpl$updateLabel$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Recent_place_tableQueries recent_place_tableQueries = this.this$0.f2072a;
        String str = this.$newLabel;
        String place_id = this.$placeId;
        String city_id = this.$cityId;
        recent_place_tableQueries.getClass();
        Intrinsics.i(place_id, "place_id");
        Intrinsics.i(city_id, "city_id");
        QueryResult queryResultA0 = recent_place_tableQueries.f697a.A0(-2029553012, "UPDATE recent_place_table SET label = ? WHERE place_id = ? AND city_id = ?", new yi0(str, place_id, city_id, 5));
        recent_place_tableQueries.T(-2029553012, new e01(15));
        return queryResultA0;
    }
}
