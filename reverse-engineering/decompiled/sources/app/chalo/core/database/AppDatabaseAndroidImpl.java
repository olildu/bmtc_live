package app.chalo.core.database;

import android.content.Context;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.core.app_db;
import app.chalo.core.core.app_dbImpl;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/AppDatabaseAndroidImpl;", "Lapp/chalo/core/database/AppDatabase;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppDatabaseAndroidImpl extends AppDatabase {
    public final Context c;

    public AppDatabaseAndroidImpl(Context context, CoroutineContextProvider coroutineContextProvider) {
        super(coroutineContextProvider);
        this.c = context;
    }

    @Override // app.chalo.core.database.AppDatabase
    public final AndroidSqliteDriver a() {
        Reflection.a(app_db.class);
        return new AndroidSqliteDriver(app_dbImpl.Schema.f2045a, this.c, "app_db", null, 248);
    }
}
