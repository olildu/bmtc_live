package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"app/cash/sqldelight/async/coroutines/SynchronousKt$synchronous$1", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "sqldelight-async-extensions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SynchronousKt$synchronous$1 implements SqlSchema<QueryResult.Value<Unit>> {
    @Override // app.cash.sqldelight.db.SqlSchema
    public final QueryResult.Value a(SqlDriver driver, long j, long j2, AfterVersion[] callbacks) {
        Intrinsics.i(driver, "driver");
        Intrinsics.i(callbacks, "callbacks");
        return new QueryResult.Value(BuildersKt.e(EmptyCoroutineContext.f17583a, new SynchronousKt$synchronous$1$migrate$1(null, driver, j, j2, callbacks, null)));
    }

    @Override // app.cash.sqldelight.db.SqlSchema
    public final QueryResult.Value b(SqlDriver driver) {
        Intrinsics.i(driver, "driver");
        return new QueryResult.Value(BuildersKt.e(EmptyCoroutineContext.f17583a, new SynchronousKt$synchronous$1$create$1(null, driver, null)));
    }

    @Override // app.cash.sqldelight.db.SqlSchema
    public final long getVersion() {
        return 0L;
    }
}
