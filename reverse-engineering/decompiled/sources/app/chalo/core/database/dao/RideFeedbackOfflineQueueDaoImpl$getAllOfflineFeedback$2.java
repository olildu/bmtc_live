package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RideFeedbackOfflineQueueEntityMapper;
import app.chalo.network.config.ChaloJson;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import defpackage.hq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/ridefeedback/data/dao/RideFeedbackOfflineQueueEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2", f = "RideFeedbackOfflineQueueDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RideFeedbackOfflineQueueEntity>>, Object> {
    final /* synthetic */ String $productSubType;
    final /* synthetic */ String $productType;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ RideFeedbackOfflineQueueDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function11<String, String, String, String, String, Long, String, String, String, Long, Long, RideFeedbackOfflineQueueEntity> {
        @Override // kotlin.jvm.functions.Function11
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            String str = (String) obj;
            String str2 = (String) obj2;
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            String p4 = (String) obj5;
            Long l = (Long) obj6;
            String str3 = (String) obj7;
            String p7 = (String) obj8;
            String str4 = (String) obj9;
            long jLongValue = ((Number) obj10).longValue();
            long jB = hq0.b((Number) obj11, str, "p0", str2, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p7, "p7");
            ((RideFeedbackOfflineQueueEntityMapper) this.receiver).getClass();
            Integer numValueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
            Json json = ChaloJson.b;
            json.getClass();
            return new RideFeedbackOfflineQueueEntity(str, str2, p2, p3, p4, numValueOf, str3, (List) json.b(p7, new ArrayListSerializer(StringSerializer.f18170a)), str4, jLongValue == 1, jB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2(RideFeedbackOfflineQueueDaoImpl rideFeedbackOfflineQueueDaoImpl, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = rideFeedbackOfflineQueueDaoImpl;
        this.$productType = str;
        this.$productSubType = str2;
        this.$userId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2(this.this$0, this.$productType, this.$productSubType, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RideFeedbackOfflineQueueDaoImpl$getAllOfflineFeedback$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2078a.W(this.$productType, this.$productSubType, this.$userId, new AnonymousClass1(11, RideFeedbackOfflineQueueEntityMapper.f2105a, RideFeedbackOfflineQueueEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lapp/chalo/ridefeedback/data/dao/RideFeedbackOfflineQueueEntity;", 0)).b();
    }
}
