package defpackage;

import in.juspay.hypersdk.analytics.LogManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class mf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18394a;
    public final /* synthetic */ LogManager b;

    public /* synthetic */ mf0(LogManager logManager, int i) {
        this.f18394a = i;
        this.b = logManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18394a) {
            case 0:
                LogManager.initialize$lambda$0(this.b);
                break;
            case 1:
                LogManager.initialize$lambda$1(this.b);
                break;
            case 2:
                LogManager.initialize$lambda$2(this.b);
                break;
            case 3:
                LogManager.stopLogPusherOnTerminate$lambda$5(this.b);
                break;
            default:
                LogManager.startLogPusherTimer$lambda$4(this.b);
                break;
        }
    }
}
