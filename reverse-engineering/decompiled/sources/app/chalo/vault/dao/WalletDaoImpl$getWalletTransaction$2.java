package app.chalo.vault.dao;

import app.chalo.vault.mapper.WalletTransactionEntityMapper;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.hq0;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$getWalletTransaction$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$getWalletTransaction$2 extends SuspendLambda implements Function1<Continuation<? super WalletTransactionEntity>, Object> {
    final /* synthetic */ String $transactionId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.WalletDaoImpl$getWalletTransaction$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function8<String, String, String, String, String, Long, String, Long, WalletTransactionEntity> {
        @Override // kotlin.jvm.functions.Function8
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String str = (String) obj;
            String str2 = (String) obj2;
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            String p4 = (String) obj5;
            long jLongValue = ((Number) obj6).longValue();
            String p6 = (String) obj7;
            long jB = hq0.b((Number) obj8, str, "p0", str2, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p6, "p6");
            ((WalletTransactionEntityMapper) this.receiver).getClass();
            return WalletTransactionEntityMapper.a(jLongValue, jB, str, str2, p2, p3, p4, p6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$getWalletTransaction$2(WalletDaoImpl walletDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$userId = str;
        this.$transactionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$getWalletTransaction$2(this.this$0, this.$userId, this.$transactionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$getWalletTransaction$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.A().a0(this.$userId, this.$transactionId, new AnonymousClass1(8, WalletTransactionEntityMapper.f10764a, WalletTransactionEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;", 0)).d();
    }
}
