package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.UserCommutePreferenceSavedRideDaoImpl$deleteAllSavedRides$2", f = "UserCommutePreferenceSavedRideDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class UserCommutePreferenceSavedRideDaoImpl$deleteAllSavedRides$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ UserCommutePreferenceSavedRideDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCommutePreferenceSavedRideDaoImpl$deleteAllSavedRides$2(UserCommutePreferenceSavedRideDaoImpl userCommutePreferenceSavedRideDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = userCommutePreferenceSavedRideDaoImpl;
        this.$userId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UserCommutePreferenceSavedRideDaoImpl$deleteAllSavedRides$2(this.this$0, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UserCommutePreferenceSavedRideDaoImpl$deleteAllSavedRides$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2085a.W(this.$userId, this.$cityId);
    }
}
