package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOneOrNull$2$1", f = "QueryExtensions.kt", l = {40, 42}, m = "invokeSuspend")
final class QueryExtensionsKt$awaitAsOneOrNull$2$1 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    final /* synthetic */ SqlCursor $cursor;
    final /* synthetic */ QueryResult<Boolean> $next;
    final /* synthetic */ ExecutableQuery<Object> $this_awaitAsOneOrNull;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryExtensionsKt$awaitAsOneOrNull$2$1(QueryResult queryResult, ExecutableQuery executableQuery, SqlCursor sqlCursor, Continuation continuation) {
        super(1, continuation);
        this.$next = queryResult;
        this.$this_awaitAsOneOrNull = executableQuery;
        this.$cursor = sqlCursor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QueryExtensionsKt$awaitAsOneOrNull$2$1(this.$next, this.$this_awaitAsOneOrNull, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QueryExtensionsKt$awaitAsOneOrNull$2$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0060, please report this as an issue */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean zBooleanValue;
        ExecutableQuery<Object> executableQuery;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ?? r5 = ((QueryResult.AsyncValue) this.$next).b;
            this.label = 1;
            obj = r5.invoke(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$0;
            ResultKt.b(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        executableQuery = this.$this_awaitAsOneOrNull;
        if (!zBooleanValue) {
            return obj2;
        }
        throw new IllegalStateException(("ResultSet returned more than 1 row for " + executableQuery).toString());
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        Object objInvoke = this.$this_awaitAsOneOrNull.f699a.invoke(this.$cursor);
        QueryResult.Value next = this.$cursor.next();
        this.L$0 = objInvoke;
        this.label = 2;
        Object obj3 = next.b;
        if (obj3 != coroutineSingletons) {
            obj2 = objInvoke;
            obj = obj3;
            zBooleanValue = ((Boolean) obj).booleanValue();
            executableQuery = this.$this_awaitAsOneOrNull;
            if (!zBooleanValue) {
                return obj2;
            }
            throw new IllegalStateException(("ResultSet returned more than 1 row for " + executableQuery).toString());
        }
        return coroutineSingletons;
    }
}
