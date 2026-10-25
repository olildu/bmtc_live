package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.ExecutableQuery;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sqldelight-async-extensions"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QueryExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ExecutableQuery executableQuery, ContinuationImpl continuationImpl) {
        QueryExtensionsKt$awaitAsOne$1 queryExtensionsKt$awaitAsOne$1;
        if (continuationImpl instanceof QueryExtensionsKt$awaitAsOne$1) {
            queryExtensionsKt$awaitAsOne$1 = (QueryExtensionsKt$awaitAsOne$1) continuationImpl;
            int i = queryExtensionsKt$awaitAsOne$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryExtensionsKt$awaitAsOne$1.label = i - Integer.MIN_VALUE;
            } else {
                queryExtensionsKt$awaitAsOne$1 = new QueryExtensionsKt$awaitAsOne$1(continuationImpl);
            }
        } else {
            queryExtensionsKt$awaitAsOne$1 = new QueryExtensionsKt$awaitAsOne$1(continuationImpl);
        }
        Object objA = queryExtensionsKt$awaitAsOne$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = queryExtensionsKt$awaitAsOne$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            queryExtensionsKt$awaitAsOne$1.L$0 = executableQuery;
            queryExtensionsKt$awaitAsOne$1.label = 1;
            objA = executableQuery.a(new a(executableQuery, 1)).a(queryExtensionsKt$awaitAsOne$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            executableQuery = (ExecutableQuery) queryExtensionsKt$awaitAsOne$1.L$0;
            ResultKt.b(objA);
        }
        if (objA != null) {
            return objA;
        }
        throw new NullPointerException("ResultSet returned null for " + executableQuery);
    }
}
