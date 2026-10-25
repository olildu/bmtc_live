package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.MticketActivationStoreTableMapper;
import app.chalo.models.mticketing.entity.MTicketActivationInfoEntityModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/models/mticketing/entity/MTicketActivationInfoEntityModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2", f = "MTicketActivationStoreDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2 extends SuspendLambda implements Function1<Continuation<? super MTicketActivationInfoEntityModel>, Object> {
    final /* synthetic */ String $city;
    final /* synthetic */ String $ticketId;
    int label;
    final /* synthetic */ MTicketActivationStoreDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function4<String, String, Long, Boolean, MTicketActivationInfoEntityModel> {
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            long jLongValue = ((Number) obj3).longValue();
            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            ((MticketActivationStoreTableMapper) this.receiver).getClass();
            return new MTicketActivationInfoEntityModel(p0, p1, jLongValue, zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2(MTicketActivationStoreDaoImpl mTicketActivationStoreDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = mTicketActivationStoreDaoImpl;
        this.$city = str;
        this.$ticketId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2(this.this$0, this.$city, this.$ticketId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MTicketActivationStoreDaoImpl$getMTicketActivationInfo$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2053a.W(this.$city, this.$ticketId, new AnonymousClass1(4, MticketActivationStoreTableMapper.f2091a, MticketActivationStoreTableMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JZ)Lapp/chalo/models/mticketing/entity/MTicketActivationInfoEntityModel;", 0)).d();
    }
}
