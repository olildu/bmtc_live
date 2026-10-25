package app.cash.sqldelight.driver.android;

import android.database.Cursor;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidCursor;", "Lapp/cash/sqldelight/db/SqlCursor;", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidCursor implements SqlCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f708a;

    public AndroidCursor(Cursor cursor) {
        Intrinsics.i(cursor, "cursor");
        this.f708a = cursor;
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final Boolean getBoolean(int i) {
        Cursor cursor = this.f708a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Boolean.valueOf(cursor.getLong(i) == 1);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final Double getDouble(int i) {
        Cursor cursor = this.f708a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final Long getLong(int i) {
        Cursor cursor = this.f708a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final String getString(int i) {
        Cursor cursor = this.f708a;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final QueryResult.Value next() {
        return new QueryResult.Value(Boolean.valueOf(this.f708a.moveToNext()));
    }
}
