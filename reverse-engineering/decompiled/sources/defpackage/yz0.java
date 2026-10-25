package defpackage;

import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.db.SupportSQLiteQuery;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yz0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20153a;
    public final /* synthetic */ QueryInterceptorDatabase b;
    public final /* synthetic */ SupportSQLiteQuery c;
    public final /* synthetic */ QueryInterceptorProgram d;

    public /* synthetic */ yz0(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, int i) {
        this.f20153a = i;
        this.b = queryInterceptorDatabase;
        this.c = supportSQLiteQuery;
        this.d = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20153a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$8(this.b, this.c, this.d);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$9(this.b, this.c, this.d);
                break;
        }
    }
}
