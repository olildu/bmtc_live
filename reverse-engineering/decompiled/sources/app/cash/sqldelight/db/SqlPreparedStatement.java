package app.cash.sqldelight.db;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/db/SqlPreparedStatement;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SqlPreparedStatement {
    void b(int i, Boolean bool);

    void bindString(int i, String str);

    void c(int i, Double d);

    void d(int i, Long l);
}
