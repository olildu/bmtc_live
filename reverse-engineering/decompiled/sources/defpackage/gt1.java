package defpackage;

import com.inmobi.media.C2733y5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gt1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15766a;
    public final /* synthetic */ C2733y5 b;

    public /* synthetic */ gt1(C2733y5 c2733y5, int i) {
        this.f15766a = i;
        this.b = c2733y5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15766a) {
            case 0:
                C2733y5.b(this.b);
                break;
            case 1:
                C2733y5.a(this.b);
                break;
            default:
                C2733y5.c(this.b);
                break;
        }
    }
}
