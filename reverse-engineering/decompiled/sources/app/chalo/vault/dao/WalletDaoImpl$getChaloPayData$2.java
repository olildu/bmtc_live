package app.chalo.vault.dao;

import app.chalo.vault.mapper.ChaloPayEntityMapper;
import app.chalo.walletframework.wallet.data.repository.entity.ChaloPayEntity;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/walletframework/wallet/data/repository/entity/ChaloPayEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$getChaloPayData$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$getChaloPayData$2 extends SuspendLambda implements Function1<Continuation<? super ChaloPayEntity>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $transactionId;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.WalletDaoImpl$getChaloPayData$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function8<String, Long, String, Long, String, String, String, String, ChaloPayEntity> {
        @Override // kotlin.jvm.functions.Function8
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String p0 = (String) obj;
            String p2 = (String) obj3;
            String p4 = (String) obj5;
            String p7 = (String) obj8;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p7, "p7");
            ((ChaloPayEntityMapper) this.receiver).getClass();
            return ChaloPayEntityMapper.a(((Number) obj2).longValue(), ((Number) obj4).longValue(), p0, p2, p4, (String) obj6, (String) obj7, p7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$getChaloPayData$2(WalletDaoImpl walletDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$orderId = str;
        this.$transactionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$getChaloPayData$2(this.this$0, this.$orderId, this.$transactionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$getChaloPayData$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.x().X(this.$orderId, this.$transactionId, new AnonymousClass1(8, ChaloPayEntityMapper.f10759a, ChaloPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/walletframework/wallet/data/repository/entity/ChaloPayEntity;", 0)).d();
    }
}
