package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.InstantTicketEntityMapper;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketPassengerDetailsEntity;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/instantticket/data/model/InstantTicketEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.InstantTicketDaoImpl$getAllInstantTickets$2", f = "InstantTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstantTicketDaoImpl$getAllInstantTickets$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstantTicketEntity>>, Object> {
    final /* synthetic */ List<String> $cityIdList;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ InstantTicketDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.InstantTicketDaoImpl$getAllInstantTickets$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function19<String, String, String, Long, Long, InstantTicketStatus, Long, String, String, String, Long, String, String, String, String, String, String, List<? extends InstantTicketPassengerDetailsEntity>, RefundInfoEntityModel, InstantTicketEntity> {
        @Override // kotlin.jvm.functions.Function19
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            InstantTicketStatus p5 = (InstantTicketStatus) obj6;
            String p7 = (String) obj8;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p7, "p7");
            ((InstantTicketEntityMapper) this.receiver).getClass();
            return InstantTicketEntityMapper.a(p0, p1, p2, ((Number) obj4).longValue(), ((Number) obj5).longValue(), p5, (Long) obj7, p7, (String) obj9, (String) obj10, (Long) obj11, (String) obj12, (String) obj13, (String) obj14, (String) obj15, (String) obj16, (String) obj17, (List) obj18, (RefundInfoEntityModel) obj19);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketDaoImpl$getAllInstantTickets$2(InstantTicketDaoImpl instantTicketDaoImpl, List list, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = instantTicketDaoImpl;
        this.$cityIdList = list;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InstantTicketDaoImpl$getAllInstantTickets$2(this.this$0, this.$cityIdList, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InstantTicketDaoImpl$getAllInstantTickets$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2051a.Y(this.$cityIdList, this.$userId, new AnonymousClass1(19, InstantTicketEntityMapper.f2088a, InstantTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/instantticket/data/model/InstantTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/instantticket/data/model/InstantTicketEntity;", 0)).b();
    }
}
