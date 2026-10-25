package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.OndcMetroTicketEntityMapper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.ondc.model.app.MetroJourneyOverview;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
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
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/metro/dao/ondc/OndcMetroTicketEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.OndcMetroTicketDaoImpl$getMetroTicket$2", f = "OndcMetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OndcMetroTicketDaoImpl$getMetroTicket$2 extends SuspendLambda implements Function1<Continuation<? super OndcMetroTicketEntity>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ OndcMetroTicketDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.OndcMetroTicketDaoImpl$getMetroTicket$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function20<String, String, Long, Long, OndcMetroTicketStatus, Long, String, String, List<? extends TicketValidationInfoEntity>, String, Long, Map<String, ? extends Integer>, String, String, String, RefundInfoAppModel, List<? extends MetroJourneyOverview>, PaymentInfoEntityModel, String, String, OndcMetroTicketEntity> {
        @Override // kotlin.jvm.functions.Function20
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            OndcMetroTicketStatus p4 = (OndcMetroTicketStatus) obj5;
            String p6 = (String) obj7;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p6, "p6");
            ((OndcMetroTicketEntityMapper) this.receiver).getClass();
            return OndcMetroTicketEntityMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, (Long) obj6, p6, (String) obj8, (List) obj9, (String) obj10, (Long) obj11, (Map) obj12, (String) obj13, (String) obj14, (String) obj15, (RefundInfoAppModel) obj16, (List) obj17, (PaymentInfoEntityModel) obj18, (String) obj19, (String) obj20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcMetroTicketDaoImpl$getMetroTicket$2(OndcMetroTicketDaoImpl ondcMetroTicketDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ondcMetroTicketDaoImpl;
        this.$bookingId = str;
        this.$userId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OndcMetroTicketDaoImpl$getMetroTicket$2(this.this$0, this.$bookingId, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((OndcMetroTicketDaoImpl$getMetroTicket$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2064a.Z(this.$bookingId, this.$userId, new AnonymousClass1(20, OndcMetroTicketEntityMapper.f2093a, OndcMetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/ondc/model/app/OndcMetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/PaymentInfoEntityModel;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/metro/dao/ondc/OndcMetroTicketEntity;", 0)).d();
    }
}
