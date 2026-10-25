package defpackage;

import com.inmobi.media.C2459ea;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class or1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18668a;
    public final /* synthetic */ C2459ea b;

    public /* synthetic */ or1(C2459ea c2459ea, int i) {
        this.f18668a = i;
        this.b = c2459ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18668a) {
            case 0:
                C2459ea.a(this.b);
                break;
            default:
                C2459ea.b(this.b);
                break;
        }
    }
}
