package defpackage;

import android.database.sqlite.SQLiteTransactionListener;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class rg1 {
    public static void a(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.beginTransaction();
    }

    public static void b(SupportSQLiteDatabase supportSQLiteDatabase, SQLiteTransactionListener transactionListener) {
        Intrinsics.i(transactionListener, "transactionListener");
        supportSQLiteDatabase.beginTransactionWithListener(transactionListener);
    }

    public static void c(SupportSQLiteDatabase supportSQLiteDatabase, String sql, Object[] objArr) {
        Intrinsics.i(sql, "sql");
        throw new UnsupportedOperationException();
    }

    public static boolean d(SupportSQLiteDatabase supportSQLiteDatabase) {
        return false;
    }
}
