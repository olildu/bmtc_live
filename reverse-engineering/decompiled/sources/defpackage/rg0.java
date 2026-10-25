package defpackage;

import com.inmobi.media.M5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19209a;
    public final /* synthetic */ M5 b;

    public /* synthetic */ rg0(M5 m5, int i) {
        this.f19209a = i;
        this.b = m5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19209a) {
            case 0:
                M5.c(this.b);
                break;
            case 1:
                M5.a(this.b);
                break;
            default:
                M5.b(this.b);
                break;
        }
    }
}
