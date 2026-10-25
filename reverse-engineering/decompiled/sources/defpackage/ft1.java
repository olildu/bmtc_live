package defpackage;

import com.inmobi.media.C2729y1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ft1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15675a;
    public final /* synthetic */ C2729y1 b;

    public /* synthetic */ ft1(C2729y1 c2729y1, int i) {
        this.f15675a = i;
        this.b = c2729y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15675a) {
            case 0:
                C2729y1.d(this.b);
                break;
            case 1:
                C2729y1.g(this.b);
                break;
            case 2:
                C2729y1.e(this.b);
                break;
            case 3:
                C2729y1.f(this.b);
                break;
            default:
                C2729y1.c(this.b);
                break;
        }
    }
}
