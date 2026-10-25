package app.cash.sqldelight.driver.android;

import android.content.Context;
import androidx.collection.SieveCacheKt;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import defpackage.g0;
import defpackage.l3;
import defpackage.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidSqliteDriver;", "Lapp/cash/sqldelight/db/SqlDriver;", "Transaction", "Callback", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSqliteDriver implements SqlDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SupportSQLiteOpenHelper f711a;
    public final ThreadLocal b;
    public final Lazy c;
    public final AndroidSqliteDriver$statements$1 d;
    public final LinkedHashMap e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidSqliteDriver$Callback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Callback extends SupportSQLiteOpenHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SqlSchema f712a;
        public final AfterVersion[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Callback(SqlSchema sqlSchema, AfterVersion... afterVersionArr) {
            super((int) sqlSchema.getVersion());
            if (sqlSchema.getVersion() <= SieveCacheKt.NodeLinkMask) {
                this.f712a = sqlSchema;
                this.b = afterVersionArr;
            } else {
                throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + sqlSchema.getVersion() + FilenameUtils.EXTENSION_SEPARATOR).toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onCreate(SupportSQLiteDatabase db) {
            Intrinsics.i(db, "db");
            this.f712a.b(new AndroidSqliteDriver(db));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onUpgrade(SupportSQLiteDatabase db, int i, int i2) {
            Intrinsics.i(db, "db");
            AfterVersion[] afterVersionArr = this.b;
            this.f712a.a(new AndroidSqliteDriver(db), i, i2, (AfterVersion[]) Arrays.copyOf(afterVersionArr, afterVersionArr.length));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidSqliteDriver$Transaction;", "Lapp/cash/sqldelight/Transacter$Transaction;", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Transaction extends Transacter.Transaction {
        public final Transacter.Transaction h;

        public Transaction(Transacter.Transaction transaction) {
            this.h = transaction;
        }

        @Override // app.cash.sqldelight.Transacter.Transaction
        public final QueryResult.Value b(boolean z) {
            AndroidSqliteDriver androidSqliteDriver = AndroidSqliteDriver.this;
            Transacter.Transaction transaction = this.h;
            if (transaction == null) {
                if (z) {
                    androidSqliteDriver.b().setTransactionSuccessful();
                    androidSqliteDriver.b().endTransaction();
                } else {
                    androidSqliteDriver.b().endTransaction();
                }
            }
            androidSqliteDriver.b.set(transaction);
            QueryResult.f706a.getClass();
            return new QueryResult.Value(Unit.f17538a);
        }

        @Override // app.cash.sqldelight.Transacter.Transaction
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Transacter.Transaction getH() {
            return this.h;
        }
    }

    public /* synthetic */ AndroidSqliteDriver(SupportSQLiteDatabase supportSQLiteDatabase) {
        this(null, supportSQLiteDatabase, 1);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult A0(Integer num, final String sql, Function1 function1) {
        Intrinsics.i(sql, "sql");
        return new QueryResult.Value(a(num, new Function0() { // from class: app.cash.sqldelight.driver.android.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AndroidPreparedStatement(this.f713a.b().compileStatement(sql));
            }
        }, function1, new t(23)));
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final Transacter.Transaction N() {
        return (Transacter.Transaction) this.b.get();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult N0() {
        ThreadLocal threadLocal = this.b;
        Transacter.Transaction transaction = (Transacter.Transaction) threadLocal.get();
        Transaction transaction2 = new Transaction(transaction);
        threadLocal.set(transaction2);
        if (transaction == null) {
            b().beginTransactionNonExclusive();
        }
        return new QueryResult.Value(transaction2);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult P(Integer num, final String sql, Function1 mapper, final int i, Function1 function1) {
        Intrinsics.i(sql, "sql");
        Intrinsics.i(mapper, "mapper");
        return new QueryResult.Value(a(num, new Function0() { // from class: app.cash.sqldelight.driver.android.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AndroidQuery(sql, this.b(), i);
            }
        }, function1, new g0(mapper, 3)));
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void P0(String[] queryKeys, Query.Listener listener) {
        Intrinsics.i(queryKeys, "queryKeys");
        Intrinsics.i(listener, "listener");
        synchronized (this.e) {
            for (String str : queryKeys) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    set.remove(listener);
                }
            }
        }
    }

    public final Object a(Integer num, Function0 function0, Function1 function1, Function1 function2) {
        AndroidSqliteDriver$statements$1 androidSqliteDriver$statements$1 = this.d;
        AndroidStatement androidStatementRemove = num != null ? androidSqliteDriver$statements$1.remove(num) : null;
        if (androidStatementRemove == null) {
            androidStatementRemove = (AndroidStatement) function0.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(androidStatementRemove);
            } catch (Throwable th) {
                if (num != null) {
                    AndroidStatement androidStatementPut = androidSqliteDriver$statements$1.put(num, androidStatementRemove);
                    if (androidStatementPut != null) {
                        androidStatementPut.close();
                    }
                } else {
                    androidStatementRemove.close();
                }
                throw th;
            }
        }
        Object objInvoke = function2.invoke(androidStatementRemove);
        if (num == null) {
            androidStatementRemove.close();
            return objInvoke;
        }
        AndroidStatement androidStatementPut2 = androidSqliteDriver$statements$1.put(num, androidStatementRemove);
        if (androidStatementPut2 != null) {
            androidStatementPut2.close();
        }
        return objInvoke;
    }

    public final SupportSQLiteDatabase b() {
        return (SupportSQLiteDatabase) this.c.getValue();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void c1(String... queryKeys) {
        Intrinsics.i(queryKeys, "queryKeys");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.e) {
            for (String str : queryKeys) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Query.Listener) it.next()).a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f711a;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        } else {
            b().close();
        }
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void h1(String[] queryKeys, Query.Listener listener) {
        Intrinsics.i(queryKeys, "queryKeys");
        Intrinsics.i(listener, "listener");
        synchronized (this.e) {
            try {
                for (String str : queryKeys) {
                    LinkedHashMap linkedHashMap = this.e;
                    Object linkedHashSet = linkedHashMap.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(str, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(listener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AndroidSqliteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        this.f711a = supportSQLiteOpenHelper;
        if (!((supportSQLiteOpenHelper != null) ^ (supportSQLiteDatabase != null))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.b = new ThreadLocal();
        this.c = LazyKt.b(new l3(2, this, supportSQLiteDatabase));
        this.d = new AndroidSqliteDriver$statements$1(i);
        this.e = new LinkedHashMap();
    }

    public AndroidSqliteDriver(SqlSchema sqlSchema, Context context, String str, SupportOpenHelperFactory supportOpenHelperFactory, int i) {
        SupportSQLiteOpenHelper.Factory frameworkSQLiteOpenHelperFactory = (i & 8) != 0 ? new FrameworkSQLiteOpenHelperFactory() : supportOpenHelperFactory;
        Callback callback = new Callback(sqlSchema, new AfterVersion[0]);
        Intrinsics.i(context, "context");
        this(frameworkSQLiteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(context).callback(callback).name(str).noBackupDirectory(false).build()), null, 20);
    }
}
