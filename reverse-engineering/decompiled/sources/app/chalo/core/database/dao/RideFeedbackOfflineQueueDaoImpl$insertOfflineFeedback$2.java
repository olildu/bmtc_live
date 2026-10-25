package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Ride_feedback_offline_queue_table;
import app.chalo.core.Ride_feedback_offline_queue_tableQueries;
import app.chalo.network.config.ChaloJson;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import defpackage.x21;
import defpackage.z21;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2", f = "RideFeedbackOfflineQueueDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ RideFeedbackOfflineQueueEntity $entity;
    int label;
    final /* synthetic */ RideFeedbackOfflineQueueDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2(RideFeedbackOfflineQueueDaoImpl rideFeedbackOfflineQueueDaoImpl, RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = rideFeedbackOfflineQueueDaoImpl;
        this.$entity = rideFeedbackOfflineQueueEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2(this.this$0, this.$entity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RideFeedbackOfflineQueueDaoImpl$insertOfflineFeedback$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Ride_feedback_offline_queue_tableQueries ride_feedback_offline_queue_tableQueries = this.this$0.f2078a;
        RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity = this.$entity;
        Intrinsics.i(rideFeedbackOfflineQueueEntity, "<this>");
        String str = rideFeedbackOfflineQueueEntity.f9072a;
        String str2 = rideFeedbackOfflineQueueEntity.b;
        String str3 = rideFeedbackOfflineQueueEntity.c;
        String str4 = rideFeedbackOfflineQueueEntity.d;
        String str5 = rideFeedbackOfflineQueueEntity.e;
        Integer num = rideFeedbackOfflineQueueEntity.f;
        Long lValueOf = num != null ? Long.valueOf(num.intValue()) : null;
        String str6 = rideFeedbackOfflineQueueEntity.g;
        Json json = ChaloJson.b;
        List list = rideFeedbackOfflineQueueEntity.h;
        json.getClass();
        Ride_feedback_offline_queue_table ride_feedback_offline_queue_table = new Ride_feedback_offline_queue_table(str, str2, str3, str4, str5, lValueOf, str6, json.a(new ArrayListSerializer(StringSerializer.f18170a), list), rideFeedbackOfflineQueueEntity.i, rideFeedbackOfflineQueueEntity.j ? 1L : 0L, rideFeedbackOfflineQueueEntity.k);
        ride_feedback_offline_queue_tableQueries.getClass();
        QueryResult queryResultA0 = ride_feedback_offline_queue_tableQueries.f697a.A0(73035951, "INSERT OR REPLACE INTO ride_feedback_offline_queue_table(bookingId, userId, cityId, productType, productSubType, rating, feedbackTag, feedbackSubtag, comment, skipped, submissionTimestamp)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new z21(ride_feedback_offline_queue_table, 3));
        ride_feedback_offline_queue_tableQueries.T(73035951, new x21(16));
        return queryResultA0;
    }
}
