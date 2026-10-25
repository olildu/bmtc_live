package app.cash.sqldelight.logs;

import androidx.compose.ui.spatial.RectListKt;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.QueryResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/Transacter$Transaction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$1", f = "LogSqliteDriver.kt", l = {RectListKt.BitOffsetForGesturable}, m = "invokeSuspend")
final class LogSqliteDriver$newTransaction$1 extends SuspendLambda implements Function1<Continuation<? super Transacter.Transaction>, Object> {
    final /* synthetic */ QueryResult<Transacter.Transaction> $queryResult;
    int label;
    final /* synthetic */ LogSqliteDriver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogSqliteDriver$newTransaction$1(QueryResult queryResult, LogSqliteDriver logSqliteDriver, Continuation continuation) {
        super(1, continuation);
        this.$queryResult = queryResult;
        this.this$0 = logSqliteDriver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LogSqliteDriver$newTransaction$1(this.$queryResult, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LogSqliteDriver$newTransaction$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ?? r5 = ((QueryResult.AsyncValue) this.$queryResult).b;
            this.label = 1;
            obj = r5.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        final LogSqliteDriver logSqliteDriver = this.this$0;
        Transacter.Transaction transaction = (Transacter.Transaction) obj;
        logSqliteDriver.getClass();
        final int i2 = 0;
        Function0 function0 = new Function0() { // from class: rf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        logSqliteDriver.getClass();
                        throw null;
                    default:
                        logSqliteDriver.getClass();
                        throw null;
                }
            }
        };
        transaction.getClass();
        transaction.a();
        transaction.b.add(function0);
        final int i3 = 1;
        Function0 function1 = new Function0() { // from class: rf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        logSqliteDriver.getClass();
                        throw null;
                    default:
                        logSqliteDriver.getClass();
                        throw null;
                }
            }
        };
        transaction.a();
        transaction.c.add(function1);
        return obj;
    }
}
