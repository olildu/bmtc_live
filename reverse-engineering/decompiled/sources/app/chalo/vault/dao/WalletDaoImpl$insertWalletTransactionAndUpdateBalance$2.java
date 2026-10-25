package app.chalo.vault.dao;

import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.l4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ int $balance;
    final /* synthetic */ WalletTransactionEntity $lWalletTransaction;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2(WalletDaoImpl walletDaoImpl, WalletTransactionEntity walletTransactionEntity, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$lWalletTransaction = walletTransactionEntity;
        this.$balance = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2(this.this$0, this.$lWalletTransaction, this.$balance, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2 walletDaoImpl$insertWalletTransactionAndUpdateBalance$2 = (WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        walletDaoImpl$insertWalletTransactionAndUpdateBalance$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.A().V(new l4(this.this$0, this.$lWalletTransaction, this.$balance, 9));
        return Unit.f17538a;
    }
}
