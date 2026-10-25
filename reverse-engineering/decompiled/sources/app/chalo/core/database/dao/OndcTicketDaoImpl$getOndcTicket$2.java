package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.OndcTicketEntityMapper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ondc/dao/OndcTicketEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.OndcTicketDaoImpl$getOndcTicket$2", f = "OndcTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OndcTicketDaoImpl$getOndcTicket$2 extends SuspendLambda implements Function1<Continuation<? super OndcTicketEntity>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ OndcTicketDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.OndcTicketDaoImpl$getOndcTicket$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function18<String, String, Long, Long, OndcTicketStatus, Long, String, String, String, Long, Map<String, ? extends Integer>, String, String, String, RefundInfoAppModel, List<? extends FareBreakupEntityModel>, List<? extends TicketValidationInfoEntity>, String, OndcTicketEntity> {
        @Override // kotlin.jvm.functions.Function18
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            OndcTicketStatus p4 = (OndcTicketStatus) obj5;
            String p6 = (String) obj7;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p6, "p6");
            ((OndcTicketEntityMapper) this.receiver).getClass();
            return OndcTicketEntityMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, (Long) obj6, p6, (String) obj8, (String) obj9, (Long) obj10, (Map) obj11, (String) obj12, (String) obj13, (String) obj14, (RefundInfoAppModel) obj15, (List) obj16, (List) obj17, (String) obj18);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcTicketDaoImpl$getOndcTicket$2(OndcTicketDaoImpl ondcTicketDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ondcTicketDaoImpl;
        this.$bookingId = str;
        this.$userId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OndcTicketDaoImpl$getOndcTicket$2(this.this$0, this.$bookingId, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((OndcTicketDaoImpl$getOndcTicket$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2065a.Y(this.$bookingId, this.$userId, new AnonymousClass1(18, OndcTicketEntityMapper.f2094a, OndcTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lapp/chalo/ondc/dao/OndcTicketEntity;", 0)).d();
    }
}
