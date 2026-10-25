package defpackage;

import androidx.room.QueryInterceptorDatabase;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vz0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19878a;
    public final /* synthetic */ QueryInterceptorDatabase b;

    public /* synthetic */ vz0(QueryInterceptorDatabase queryInterceptorDatabase, int i) {
        this.f19878a = i;
        this.b = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19878a) {
            case 0:
                QueryInterceptorDatabase.endTransaction$lambda$4(this.b);
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(this.b);
                break;
            case 2:
                QueryInterceptorDatabase.beginTransaction$lambda$0(this.b);
                break;
            case 3:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.b);
                break;
            case 4:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.b);
                break;
            default:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.b);
                break;
        }
    }
}
