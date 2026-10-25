package defpackage;

import so.plotline.insights.Modal.e;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class jr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17433a;
    public final /* synthetic */ e b;

    public /* synthetic */ jr1(e eVar, int i) {
        this.f17433a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17433a;
        e eVar = this.b;
        switch (i) {
            case 0:
                e.a(eVar);
                break;
            default:
                int i2 = e.e;
                eVar.dismiss();
                break;
        }
    }
}
