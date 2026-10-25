package defpackage;

import so.plotline.insights.FlowViews.d;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class hr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15855a;
    public final /* synthetic */ d.b b;

    public /* synthetic */ hr1(d.b bVar, int i) {
        this.f15855a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15855a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
