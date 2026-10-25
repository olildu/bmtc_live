package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.MetroTicketEntityMapper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.MetroTicketEntity;
import app.chalo.metro.dao.MetroTicketStopDetailsEntity;
import app.chalo.metro.data.app.MetroTicketStatus;
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
import kotlin.jvm.functions.Function16;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/metro/dao/MetroTicketEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.MetroTicketDaoImpl$getAllMetroTickets$2", f = "MetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MetroTicketDaoImpl$getAllMetroTickets$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends MetroTicketEntity>>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ MetroTicketDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.MetroTicketDaoImpl$getAllMetroTickets$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function16<String, String, Long, Long, MetroTicketStatus, Long, String, String, List<? extends TicketValidationInfoEntity>, String, Long, Map<String, ? extends Integer>, String, MetroTicketStopDetailsEntity, MetroTicketStopDetailsEntity, RefundInfoAppModel, MetroTicketEntity> {
        @Override // kotlin.jvm.functions.Function16
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            MetroTicketStatus p4 = (MetroTicketStatus) obj5;
            String p6 = (String) obj7;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p6, "p6");
            ((MetroTicketEntityMapper) this.receiver).getClass();
            return MetroTicketEntityMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, (Long) obj6, p6, (String) obj8, (List) obj9, (String) obj10, (Long) obj11, (Map) obj12, (String) obj13, (MetroTicketStopDetailsEntity) obj14, (MetroTicketStopDetailsEntity) obj15, (RefundInfoAppModel) obj16);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroTicketDaoImpl$getAllMetroTickets$2(MetroTicketDaoImpl metroTicketDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = metroTicketDaoImpl;
        this.$cityName = str;
        this.$userId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetroTicketDaoImpl$getAllMetroTickets$2(this.this$0, this.$cityName, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MetroTicketDaoImpl$getAllMetroTickets$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2054a.W(this.$cityName, this.$userId, new AnonymousClass1(16, MetroTicketEntityMapper.f2090a, MetroTicketEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLapp/chalo/metro/data/app/MetroTicketStatus;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/metro/dao/MetroTicketStopDetailsEntity;Lapp/chalo/data/RefundInfoAppModel;)Lapp/chalo/metro/dao/MetroTicketEntity;", 0)).b();
    }
}
