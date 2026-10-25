package defpackage;

import com.inmobi.media.AbstractC2642rc;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ss1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19600a;
    public final /* synthetic */ AbstractC2642rc b;

    public /* synthetic */ ss1(AbstractC2642rc abstractC2642rc, int i) {
        this.f19600a = i;
        this.b = abstractC2642rc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19600a) {
            case 0:
                AbstractC2642rc.c(this.b);
                break;
            case 1:
                AbstractC2642rc.a(this.b);
                break;
            default:
                AbstractC2642rc.b(this.b);
                break;
        }
    }
}
