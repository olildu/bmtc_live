package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.vault.Quick_pay_tableQueries;
import defpackage.kz0;
import defpackage.xa;
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
@DebugMetadata(c = "app.chalo.vault.dao.QuickPayDaoImpl$updateQuickpayExpiryTime$2", f = "QuickPayDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class QuickPayDaoImpl$updateQuickpayExpiryTime$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ long $updatedExpiryTime;
    int label;
    final /* synthetic */ QuickPayDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayDaoImpl$updateQuickpayExpiryTime$2(QuickPayDaoImpl quickPayDaoImpl, long j, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = quickPayDaoImpl;
        this.$updatedExpiryTime = j;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QuickPayDaoImpl$updateQuickpayExpiryTime$2(this.this$0, this.$updatedExpiryTime, this.$orderId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QuickPayDaoImpl$updateQuickpayExpiryTime$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Quick_pay_tableQueries quick_pay_tableQueriesG = this.this$0.f10755a.g();
        long j = this.$updatedExpiryTime;
        String orderId = this.$orderId;
        quick_pay_tableQueriesG.getClass();
        Intrinsics.i(orderId, "orderId");
        QueryResult queryResultA0 = quick_pay_tableQueriesG.f697a.A0(1541740275, "UPDATE quick_pay_table\nSET expiryTime = ?\nWHERE orderId = ?", new xa(j, orderId, 7));
        quick_pay_tableQueriesG.T(1541740275, new kz0(25));
        return queryResultA0;
    }
}
