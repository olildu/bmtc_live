package defpackage;

import com.inmobi.media.C2485g8;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19597a;
    public final /* synthetic */ C2485g8 b;

    public /* synthetic */ sr1(C2485g8 c2485g8, int i) {
        this.f19597a = i;
        this.b = c2485g8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19597a) {
            case 0:
                C2485g8.a(this.b);
                break;
            case 1:
                C2485g8.c(this.b);
                break;
            default:
                C2485g8.b(this.b);
                break;
        }
    }
}
