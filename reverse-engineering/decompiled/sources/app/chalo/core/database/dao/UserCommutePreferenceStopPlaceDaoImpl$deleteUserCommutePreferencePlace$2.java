package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.User_commute_preference_place_tableQueries;
import defpackage.qn1;
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
@DebugMetadata(c = "app.chalo.core.database.dao.UserCommutePreferenceStopPlaceDaoImpl$deleteUserCommutePreferencePlace$2", f = "UserCommutePreferenceStopPlaceDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class UserCommutePreferenceStopPlaceDaoImpl$deleteUserCommutePreferencePlace$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $id;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ UserCommutePreferenceStopPlaceDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCommutePreferenceStopPlaceDaoImpl$deleteUserCommutePreferencePlace$2(UserCommutePreferenceStopPlaceDaoImpl userCommutePreferenceStopPlaceDaoImpl, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = userCommutePreferenceStopPlaceDaoImpl;
        this.$id = str;
        this.$userId = str2;
        this.$cityId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UserCommutePreferenceStopPlaceDaoImpl$deleteUserCommutePreferencePlace$2(this.this$0, this.$id, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UserCommutePreferenceStopPlaceDaoImpl$deleteUserCommutePreferencePlace$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        User_commute_preference_place_tableQueries user_commute_preference_place_tableQueries = this.this$0.f2086a;
        String id = this.$id;
        String userId = this.$userId;
        String cityId = this.$cityId;
        user_commute_preference_place_tableQueries.getClass();
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        QueryResult queryResultA0 = user_commute_preference_place_tableQueries.f697a.A0(-940479945, "DELETE FROM user_commute_preference_place_table WHERE id = ? AND userId = ? AND cityId = ?", new yi0(id, userId, cityId, 8));
        user_commute_preference_place_tableQueries.T(-940479945, new qn1(2));
        return queryResultA0;
    }
}
