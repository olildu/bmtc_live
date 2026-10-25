package defpackage;

import in.juspay.hypersdk.analytics.LogSessioniser;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19031a;
    public final /* synthetic */ LogSessioniser b;

    public /* synthetic */ pf0(LogSessioniser logSessioniser, int i) {
        this.f19031a = i;
        this.b = logSessioniser;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19031a) {
            case 0:
                this.b.lambda$pushLogsToPusher$2();
                break;
            case 1:
                this.b.lambda$stopLogSessioniserOnTerminate$3();
                break;
            case 2:
                this.b.lambda$startLogSessioniserOnLogCount$1();
                break;
            default:
                this.b.lambda$startLogSessioniser$0();
                break;
        }
    }
}
