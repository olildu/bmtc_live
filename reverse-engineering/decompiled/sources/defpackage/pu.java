package defpackage;

import com.inmobi.media.D5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19069a;
    public final /* synthetic */ D5 b;

    public /* synthetic */ pu(D5 d5, int i) {
        this.f19069a = i;
        this.b = d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19069a) {
            case 0:
                D5.b(this.b);
                break;
            case 1:
                D5.c(this.b);
                break;
            default:
                D5.a(this.b);
                break;
        }
    }
}
