package app.cash.sqldelight.driver.android;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import app.cash.sqldelight.db.QueryResult;
import defpackage.k4;
import defpackage.r4;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Lapp/cash/sqldelight/driver/android/AndroidStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidQuery implements SupportSQLiteQuery, AndroidStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f710a;
    public final SupportSQLiteDatabase b;
    public final int c;
    public final ArrayList d;

    public AndroidQuery(String sql, SupportSQLiteDatabase database, int i) {
        Intrinsics.i(sql, "sql");
        Intrinsics.i(database, "database");
        this.f710a = sql;
        this.b = database;
        this.c = i;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.d = arrayList;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final Object a(Function1 mapper) throws IOException {
        Intrinsics.i(mapper, "mapper");
        Cursor cursorQuery = this.b.query(this);
        try {
            Object b = ((QueryResult) mapper.invoke(new AndroidCursor(cursorQuery))).getB();
            cursorQuery.close();
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(cursorQuery, th);
                throw th2;
            }
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void b(int i, Boolean bool) {
        this.d.set(i, new k4(bool, i, 1));
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindString(int i, String str) {
        this.d.set(i, new r4(str, i, 0));
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.i(statement, "statement");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Function1 function1 = (Function1) obj;
            Intrinsics.f(function1);
            function1.invoke(statement);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void c(int i, Double d) {
        this.d.set(i, new k4(d, i, 2));
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void d(int i, Long l) {
        this.d.set(i, new k4(l, i, 3));
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final long execute() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: getArgCount, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: getSql, reason: from getter */
    public final String getF710a() {
        return this.f710a;
    }

    public final String toString() {
        return this.f710a;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void close() {
    }
}
