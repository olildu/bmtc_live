package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.vault.Wallet_tableQueries;
import app.chalo.walletframework.wallet.data.model.WalletType;
import defpackage.ac;
import defpackage.hp1;
import java.util.Locale;
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
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$updateWalletBalance$4", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$updateWalletBalance$4 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $agency;
    final /* synthetic */ int $balance;
    final /* synthetic */ WalletType $type;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$updateWalletBalance$4(WalletDaoImpl walletDaoImpl, int i, String str, WalletType walletType, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$balance = i;
        this.$userId = str;
        this.$type = walletType;
        this.$agency = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$updateWalletBalance$4(this.this$0, this.$balance, this.$userId, this.$type, this.$agency, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WalletDaoImpl$updateWalletBalance$4) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Wallet_tableQueries wallet_tableQueriesZ = this.this$0.z();
        long j = this.$balance;
        String userId = this.$userId;
        String type = this.$type.name();
        String lowerCase = this.$agency.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        wallet_tableQueriesZ.getClass();
        Intrinsics.i(userId, "userId");
        Intrinsics.i(type, "type");
        QueryResult queryResultA0 = wallet_tableQueriesZ.f697a.A0(1901214009, "UPDATE wallet_table\nSET balance = ?\nWHERE userId = ?\nAND type = ?\nAND agency = ?", new ac(j, userId, type, lowerCase, 5));
        wallet_tableQueriesZ.T(1901214009, new hp1(9));
        return queryResultA0;
    }
}
