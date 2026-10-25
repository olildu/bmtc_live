package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.vault.Wallet_tableQueries;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import defpackage.hp1;
import defpackage.yi0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$updateCachedWalletStatus$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$updateCachedWalletStatus$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ CachedWalletStatus $newCachedWalletStatus;
    final /* synthetic */ String $userId;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$updateCachedWalletStatus$2(WalletDaoImpl walletDaoImpl, CachedWalletStatus cachedWalletStatus, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$newCachedWalletStatus = cachedWalletStatus;
        this.$userId = str;
        this.$walletId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$updateCachedWalletStatus$2(this.this$0, this.$newCachedWalletStatus, this.$userId, this.$walletId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$updateCachedWalletStatus$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Wallet_tableQueries wallet_tableQueriesZ = this.this$0.z();
        String newCachedWalletStatus = this.$newCachedWalletStatus.name();
        String userId = this.$userId;
        String walletId = this.$walletId;
        wallet_tableQueriesZ.getClass();
        Intrinsics.i(newCachedWalletStatus, "newCachedWalletStatus");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        QueryResult queryResultA0 = wallet_tableQueriesZ.f697a.A0(-1934165616, "UPDATE wallet_table SET walletStatus = ? WHERE userId = ? AND walletId = ?", new yi0(newCachedWalletStatus, userId, walletId, 10));
        wallet_tableQueriesZ.T(-1934165616, new hp1(10));
        return queryResultA0;
    }
}
