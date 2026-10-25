package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsList$2$1", f = "QueryExtensions.kt", l = {14, 15}, m = "invokeSuspend")
final class QueryExtensionsKt$awaitAsList$2$1 extends SuspendLambda implements Function1<Continuation<? super List<Object>>, Object> {
    final /* synthetic */ SqlCursor $cursor;
    final /* synthetic */ QueryResult<Boolean> $first;
    final /* synthetic */ List<Object> $result;
    final /* synthetic */ ExecutableQuery<Object> $this_awaitAsList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryExtensionsKt$awaitAsList$2$1(QueryResult queryResult, List list, ExecutableQuery executableQuery, SqlCursor sqlCursor, Continuation continuation) {
        super(1, continuation);
        this.$first = queryResult;
        this.$result = list;
        this.$this_awaitAsList = executableQuery;
        this.$cursor = sqlCursor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QueryExtensionsKt$awaitAsList$2$1(this.$first, this.$result, this.$this_awaitAsList, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QueryExtensionsKt$awaitAsList$2$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L52
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r5)
            app.cash.sqldelight.db.QueryResult<java.lang.Boolean> r5 = r4.$first
            app.cash.sqldelight.db.QueryResult$AsyncValue r5 = (app.cash.sqldelight.db.QueryResult.AsyncValue) r5
            kotlin.coroutines.jvm.internal.SuspendLambda r5 = r5.b
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L2e
            goto L51
        L2e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6d
            java.util.List<java.lang.Object> r5 = r4.$result
            app.cash.sqldelight.ExecutableQuery<java.lang.Object> r1 = r4.$this_awaitAsList
            kotlin.jvm.functions.Function1 r1 = r1.f699a
            app.cash.sqldelight.db.SqlCursor r3 = r4.$cursor
            java.lang.Object r1 = r1.invoke(r3)
            r5.add(r1)
        L45:
            app.cash.sqldelight.db.SqlCursor r5 = r4.$cursor
            app.cash.sqldelight.db.QueryResult$Value r5 = r5.next()
            r4.label = r2
            java.lang.Object r5 = r5.b
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6a
            java.util.List<java.lang.Object> r5 = r4.$result
            app.cash.sqldelight.ExecutableQuery<java.lang.Object> r1 = r4.$this_awaitAsList
            kotlin.jvm.functions.Function1 r1 = r1.f699a
            app.cash.sqldelight.db.SqlCursor r3 = r4.$cursor
            java.lang.Object r1 = r1.invoke(r3)
            r5.add(r1)
            goto L45
        L6a:
            java.util.List<java.lang.Object> r5 = r4.$result
            return r5
        L6d:
            java.util.List<java.lang.Object> r5 = r4.$result
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsList$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
