package defpackage;

import com.inmobi.media.C2428c7;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15669a;
    public final /* synthetic */ C2428c7 b;

    public /* synthetic */ fr1(C2428c7 c2428c7, int i) {
        this.f15669a = i;
        this.b = c2428c7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15669a) {
            case 0:
                C2428c7.a(this.b);
                break;
            case 1:
                C2428c7.d(this.b);
                break;
            case 2:
                C2428c7.b(this.b);
                break;
            default:
                C2428c7.e(this.b);
                break;
        }
    }
}
