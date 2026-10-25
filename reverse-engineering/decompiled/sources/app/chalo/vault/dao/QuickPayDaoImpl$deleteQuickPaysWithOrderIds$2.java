package app.chalo.vault.dao;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.vault.Quick_pay_tableQueries;
import defpackage.kz0;
import defpackage.l;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.vault.dao.QuickPayDaoImpl$deleteQuickPaysWithOrderIds$2", f = "QuickPayDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class QuickPayDaoImpl$deleteQuickPaysWithOrderIds$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ List<String> $orderIds;
    int label;
    final /* synthetic */ QuickPayDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayDaoImpl$deleteQuickPaysWithOrderIds$2(QuickPayDaoImpl quickPayDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = quickPayDaoImpl;
        this.$orderIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QuickPayDaoImpl$deleteQuickPaysWithOrderIds$2(this.this$0, this.$orderIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QuickPayDaoImpl$deleteQuickPaysWithOrderIds$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Quick_pay_tableQueries quick_pay_tableQueriesG = this.this$0.f10755a.g();
        List<String> orderId = this.$orderIds;
        quick_pay_tableQueriesG.getClass();
        Intrinsics.i(orderId, "orderId");
        String strS = BaseTransacterImpl.S(orderId.size());
        SqlDriver sqlDriver = quick_pay_tableQueriesG.f697a;
        String strConcat = "DELETE FROM quick_pay_table WHERE orderId IN ".concat(strS);
        orderId.size();
        QueryResult queryResultA0 = sqlDriver.A0(null, strConcat, new l(orderId, 7));
        quick_pay_tableQueriesG.T(-2081096978, new kz0(18));
        return queryResultA0;
    }
}
