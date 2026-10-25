package defpackage;

import androidx.room.QueryInterceptorStatement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zz0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20242a;
    public final /* synthetic */ QueryInterceptorStatement b;

    public /* synthetic */ zz0(QueryInterceptorStatement queryInterceptorStatement, int i) {
        this.f20242a = i;
        this.b = queryInterceptorStatement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20242a) {
            case 0:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(this.b);
                break;
            case 1:
                QueryInterceptorStatement.executeInsert$lambda$2(this.b);
                break;
            case 2:
                QueryInterceptorStatement.simpleQueryForString$lambda$4(this.b);
                break;
            case 3:
                QueryInterceptorStatement.execute$lambda$0(this.b);
                break;
            default:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(this.b);
                break;
        }
    }
}
