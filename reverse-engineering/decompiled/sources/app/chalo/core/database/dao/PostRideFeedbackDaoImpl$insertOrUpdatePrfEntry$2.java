package app.chalo.core.database.dao;

import app.chalo.core.Post_ride_feedback_table;
import app.chalo.core.Post_ride_feedback_tableQueries;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import defpackage.et0;
import defpackage.gt0;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2", f = "PostRideFeedbackDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ PostRideFeedbackEntity $entity;
    int label;
    final /* synthetic */ PostRideFeedbackDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2(PostRideFeedbackDaoImpl postRideFeedbackDaoImpl, PostRideFeedbackEntity postRideFeedbackEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = postRideFeedbackDaoImpl;
        this.$entity = postRideFeedbackEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2(this.this$0, this.$entity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2 postRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2 = (PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        postRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Post_ride_feedback_tableQueries post_ride_feedback_tableQueries = this.this$0.f2066a;
        PostRideFeedbackEntity postRideFeedbackEntity = this.$entity;
        Intrinsics.i(postRideFeedbackEntity, "<this>");
        Post_ride_feedback_table post_ride_feedback_table = new Post_ride_feedback_table(postRideFeedbackEntity.f9071a, postRideFeedbackEntity.b, postRideFeedbackEntity.c, postRideFeedbackEntity.d, postRideFeedbackEntity.e, postRideFeedbackEntity.f, postRideFeedbackEntity.g, postRideFeedbackEntity.h, postRideFeedbackEntity.i, postRideFeedbackEntity.j.getValue(), postRideFeedbackEntity.k, postRideFeedbackEntity.l, postRideFeedbackEntity.m.name(), postRideFeedbackEntity.n);
        post_ride_feedback_tableQueries.getClass();
        post_ride_feedback_tableQueries.f697a.A0(1686245468, "INSERT OR IGNORE INTO post_ride_feedback_table(bookingId, userId, cityId, tripId, routeId, fromStopName, toStopName, tripStartTimestamp, tripEndTimestamp, triggerType, productType, productSubType, fillStatus, prfSubmittedAt)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new et0(post_ride_feedback_table, 1));
        post_ride_feedback_tableQueries.T(1686245468, new gt0(0));
        return Unit.f17538a;
    }
}
