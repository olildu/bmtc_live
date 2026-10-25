package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.vault.Wallet_transaction_tableQueries;
import defpackage.hp1;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$deleteAllWalletTransactions$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$deleteAllWalletTransactions$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$deleteAllWalletTransactions$2(WalletDaoImpl walletDaoImpl, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$deleteAllWalletTransactions$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$deleteAllWalletTransactions$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Wallet_transaction_tableQueries wallet_transaction_tableQueriesA = this.this$0.A();
        QueryResult queryResultA0 = wallet_transaction_tableQueriesA.f697a.A0(680274091, "DELETE FROM wallet_transaction_table", null);
        wallet_transaction_tableQueriesA.T(680274091, new hp1(16));
        return queryResultA0;
    }
}
