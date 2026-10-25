package defpackage;

import com.inmobi.media.C2714x0;
import com.inmobi.media.E0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18992a;
    public final /* synthetic */ E0 b;

    public /* synthetic */ p00(E0 e0, int i) {
        this.f18992a = i;
        this.b = e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18992a) {
            case 0:
                E0.d(this.b);
                break;
            case 1:
                C2714x0.b(this.b);
                break;
            default:
                C2714x0.a(this.b);
                break;
        }
    }
}
