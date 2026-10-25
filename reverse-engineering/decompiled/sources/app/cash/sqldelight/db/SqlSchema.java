package app.cash.sqldelight.db;

import app.cash.sqldelight.db.QueryResult;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult;", "", "T", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SqlSchema<T extends QueryResult<Unit>> {
    QueryResult.Value a(SqlDriver sqlDriver, long j, long j2, AfterVersion... afterVersionArr);

    QueryResult.Value b(SqlDriver sqlDriver);

    long getVersion();
}
