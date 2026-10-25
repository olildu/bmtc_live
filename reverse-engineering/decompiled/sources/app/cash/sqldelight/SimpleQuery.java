package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/cash/sqldelight/SimpleQuery;", "", "RowType", "Lapp/cash/sqldelight/Query;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SimpleQuery<RowType> extends Query<RowType> {
    public final int b;
    public final String[] c;
    public final SqlDriver d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleQuery(int i, String[] strArr, SqlDriver driver, String str, String str2, String str3, Function1 function1) {
        super(function1);
        Intrinsics.i(driver, "driver");
        this.b = i;
        this.c = strArr;
        this.d = driver;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult a(Function1 function1) {
        return this.d.P(Integer.valueOf(this.b), this.g, function1, 0, null);
    }

    @Override // app.cash.sqldelight.Query
    public final void e(i40 i40Var) {
        String[] strArr = this.c;
        this.d.h1((String[]) Arrays.copyOf(strArr, strArr.length), i40Var);
    }

    @Override // app.cash.sqldelight.Query
    public final void f(Query.Listener listener) {
        Intrinsics.i(listener, "listener");
        String[] strArr = this.c;
        this.d.P0((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    public final String toString() {
        return this.e + ':' + this.f;
    }
}
