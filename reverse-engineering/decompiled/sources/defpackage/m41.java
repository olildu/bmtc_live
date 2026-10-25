package defpackage;

import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class m41 {
    public static void a(SQLiteStatement sQLiteStatement, int i, boolean z) {
        sQLiteStatement.bindLong(i, z ? 1L : 0L);
    }

    public static void b(SQLiteStatement sQLiteStatement, int i, float f) {
        sQLiteStatement.bindDouble(i, f);
    }

    public static void c(SQLiteStatement sQLiteStatement, int i, int i2) {
        sQLiteStatement.bindLong(i, i2);
    }

    public static boolean d(SQLiteStatement sQLiteStatement, int i) {
        return sQLiteStatement.getLong(i) != 0;
    }

    public static List e(SQLiteStatement sQLiteStatement) {
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        return arrayList;
    }

    public static float f(SQLiteStatement sQLiteStatement, int i) {
        return (float) sQLiteStatement.getDouble(i);
    }

    public static int g(SQLiteStatement sQLiteStatement, int i) {
        return (int) sQLiteStatement.getLong(i);
    }
}
