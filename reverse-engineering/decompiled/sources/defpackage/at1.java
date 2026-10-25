package defpackage;

import com.inmobi.media.C2705w5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class at1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11142a;
    public final /* synthetic */ C2705w5 b;

    public /* synthetic */ at1(C2705w5 c2705w5, int i) {
        this.f11142a = i;
        this.b = c2705w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11142a) {
            case 0:
                C2705w5.b(this.b);
                break;
            case 1:
                C2705w5.c(this.b);
                break;
            case 2:
                C2705w5.d(this.b);
                break;
            default:
                C2705w5.e(this.b);
                break;
        }
    }
}
