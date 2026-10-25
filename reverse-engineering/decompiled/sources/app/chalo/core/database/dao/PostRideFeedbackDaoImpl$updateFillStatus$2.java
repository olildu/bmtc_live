package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Post_ride_feedback_tableQueries;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import defpackage.ir0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.PostRideFeedbackDaoImpl$updateFillStatus$2", f = "PostRideFeedbackDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PostRideFeedbackDaoImpl$updateFillStatus$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $cityId;
    final /* synthetic */ RideFeedbackFillStatus $fillStatus;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ PostRideFeedbackDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostRideFeedbackDaoImpl$updateFillStatus$2(PostRideFeedbackDaoImpl postRideFeedbackDaoImpl, RideFeedbackFillStatus rideFeedbackFillStatus, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = postRideFeedbackDaoImpl;
        this.$fillStatus = rideFeedbackFillStatus;
        this.$bookingId = str;
        this.$userId = str2;
        this.$cityId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PostRideFeedbackDaoImpl$updateFillStatus$2(this.this$0, this.$fillStatus, this.$bookingId, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PostRideFeedbackDaoImpl$updateFillStatus$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Post_ride_feedback_tableQueries post_ride_feedback_tableQueries = this.this$0.f2066a;
        String fillStatus = this.$fillStatus.name();
        String bookingId = this.$bookingId;
        String userId = this.$userId;
        String cityId = this.$cityId;
        post_ride_feedback_tableQueries.getClass();
        Intrinsics.i(fillStatus, "fillStatus");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        QueryResult queryResultA0 = post_ride_feedback_tableQueries.f697a.A0(418463335, "UPDATE post_ride_feedback_table SET fillStatus = ? WHERE bookingId = ? AND userId = ? AND cityId = ?", new n3(fillStatus, bookingId, userId, cityId, 19));
        post_ride_feedback_tableQueries.T(418463335, new ir0(27));
        return queryResultA0;
    }
}
