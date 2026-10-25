package app.chalo.vault.dao;

import app.chalo.vault.mapper.QuickPayEntityMapper;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.QuickPayDaoImpl$getQuickPaysForOrderIds$2", f = "QuickPayDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class QuickPayDaoImpl$getQuickPaysForOrderIds$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends QuickPayEntity>>, Object> {
    final /* synthetic */ List<String> $orderIds;
    int label;
    final /* synthetic */ QuickPayDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.QuickPayDaoImpl$getQuickPaysForOrderIds$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function11<String, String, String, String, String, Long, Long, Long, String, Long, String, QuickPayEntity> {
        @Override // kotlin.jvm.functions.Function11
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            String p8 = (String) obj9;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p8, "p8");
            ((QuickPayEntityMapper) this.receiver).getClass();
            return QuickPayEntityMapper.a(p0, p1, p2, (String) obj4, (String) obj5, ((Number) obj6).longValue(), (Long) obj7, ((Number) obj8).longValue(), p8, (Long) obj10, (String) obj11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayDaoImpl$getQuickPaysForOrderIds$2(QuickPayDaoImpl quickPayDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = quickPayDaoImpl;
        this.$orderIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QuickPayDaoImpl$getQuickPaysForOrderIds$2(this.this$0, this.$orderIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QuickPayDaoImpl$getQuickPaysForOrderIds$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f10755a.g().d0(this.$orderIds, new AnonymousClass1(11, QuickPayEntityMapper.f10761a, QuickPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;", 0)).b();
    }
}
