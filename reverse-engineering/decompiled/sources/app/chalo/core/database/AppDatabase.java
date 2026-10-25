package app.chalo.core.database;

import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.core.app_db;
import app.chalo.providers.CoroutineContextProvider;
import defpackage.i4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/AppDatabase;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f2047a;
    public final Lazy b = LazyKt.b(new i4(this, 7));

    public AppDatabase(CoroutineContextProvider coroutineContextProvider) {
        this.f2047a = coroutineContextProvider;
    }

    public abstract AndroidSqliteDriver a();

    public final app_db b() {
        return (app_db) this.b.getValue();
    }
}
