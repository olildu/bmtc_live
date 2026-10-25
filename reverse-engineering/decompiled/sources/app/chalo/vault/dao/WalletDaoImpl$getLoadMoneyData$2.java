package app.chalo.vault.dao;

import app.chalo.vault.mapper.LoadMoneyEntityMapper;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/walletframework/wallet/data/repository/entity/LoadMoneyEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$getLoadMoneyData$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$getLoadMoneyData$2 extends SuspendLambda implements Function1<Continuation<? super LoadMoneyEntity>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $transactionId;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.WalletDaoImpl$getLoadMoneyData$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function8<String, Long, Long, String, String, String, String, String, LoadMoneyEntity> {
        @Override // kotlin.jvm.functions.Function8
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String p0 = (String) obj;
            long jLongValue = ((Number) obj2).longValue();
            long jLongValue2 = ((Number) obj3).longValue();
            String p3 = (String) obj4;
            String p4 = (String) obj5;
            String p6 = (String) obj7;
            String p7 = (String) obj8;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p7, "p7");
            ((LoadMoneyEntityMapper) this.receiver).getClass();
            return new LoadMoneyEntity(p0, (int) jLongValue, jLongValue2, p3, LoadMoneyOrderStatus.valueOf(p4), (String) obj6, p6, p7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$getLoadMoneyData$2(WalletDaoImpl walletDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$orderId = str;
        this.$transactionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$getLoadMoneyData$2(this.this$0, this.$orderId, this.$transactionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$getLoadMoneyData$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.y().X(this.$orderId, this.$transactionId, new AnonymousClass1(8, LoadMoneyEntityMapper.f10760a, LoadMoneyEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/walletframework/wallet/data/repository/entity/LoadMoneyEntity;", 0)).d();
    }
}
