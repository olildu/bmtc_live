package app.cash.sqldelight.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lapp/cash/sqldelight/db/SqlDriver;", "Ljava/io/Closeable;", "Lapp/cash/sqldelight/db/Closeable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SqlDriver extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    QueryResult A0(Integer num, String str, Function1 function1);

    Transacter.Transaction N();

    QueryResult N0();

    QueryResult P(Integer num, String str, Function1 function1, int i, Function1 function2);

    void P0(String[] strArr, Query.Listener listener);

    void c1(String... strArr);

    void h1(String[] strArr, Query.Listener listener);
}
