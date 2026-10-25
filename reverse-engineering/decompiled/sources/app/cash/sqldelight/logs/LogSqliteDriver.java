package app.cash.sqldelight.logs;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/logs/LogSqliteDriver;", "Lapp/cash/sqldelight/db/SqlDriver;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogSqliteDriver implements SqlDriver {
    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult A0(Integer num, String sql, Function1 function1) {
        Intrinsics.i(sql, "sql");
        "EXECUTE\n ".concat(sql);
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final Transacter.Transaction N() {
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult N0() {
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult P(Integer num, String sql, Function1 mapper, int i, Function1 function1) {
        Intrinsics.i(sql, "sql");
        Intrinsics.i(mapper, "mapper");
        "QUERY\n ".concat(sql);
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void P0(String[] queryKeys, Query.Listener listener) {
        Intrinsics.i(queryKeys, "queryKeys");
        Intrinsics.i(listener, "listener");
        listener.toString();
        ArraysKt.V(null, 63, queryKeys);
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void c1(String... queryKeys) {
        Intrinsics.i(queryKeys, "queryKeys");
        ArraysKt.V(null, 63, queryKeys);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void h1(String[] queryKeys, Query.Listener listener) {
        Intrinsics.i(queryKeys, "queryKeys");
        Intrinsics.i(listener, "listener");
        listener.toString();
        ArraysKt.V(null, 63, queryKeys);
        throw null;
    }
}
