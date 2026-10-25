package defpackage;

import androidx.room.QueryInterceptorDatabase;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wz0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19972a;
    public final /* synthetic */ QueryInterceptorDatabase b;
    public final /* synthetic */ String c;

    public /* synthetic */ wz0(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i) {
        this.f19972a = i;
        this.b = queryInterceptorDatabase;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19972a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$6(this.b, this.c);
                break;
            default:
                QueryInterceptorDatabase.execSQL$lambda$10(this.b, this.c);
                break;
        }
    }
}
