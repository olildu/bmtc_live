package app.cash.sqldelight.driver.android;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidPreparedStatement;", "Lapp/cash/sqldelight/driver/android/AndroidStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidPreparedStatement implements AndroidStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportSQLiteStatement f709a;

    public AndroidPreparedStatement(SupportSQLiteStatement statement) {
        Intrinsics.i(statement, "statement");
        this.f709a = statement;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final Object a(Function1 mapper) {
        Intrinsics.i(mapper, "mapper");
        throw new UnsupportedOperationException();
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void b(int i, Boolean bool) {
        SupportSQLiteStatement supportSQLiteStatement = this.f709a;
        if (bool == null) {
            supportSQLiteStatement.bindNull(i + 1);
        } else {
            supportSQLiteStatement.bindLong(i + 1, bool.booleanValue() ? 1L : 0L);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindString(int i, String str) {
        SupportSQLiteStatement supportSQLiteStatement = this.f709a;
        int i2 = i + 1;
        if (str == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindString(i2, str);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void c(int i, Double d) {
        SupportSQLiteStatement supportSQLiteStatement = this.f709a;
        int i2 = i + 1;
        if (d == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindDouble(i2, d.doubleValue());
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void close() throws IOException {
        this.f709a.close();
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void d(int i, Long l) {
        SupportSQLiteStatement supportSQLiteStatement = this.f709a;
        int i2 = i + 1;
        if (l == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindLong(i2, l.longValue());
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final long execute() {
        return this.f709a.executeUpdateDelete();
    }
}
