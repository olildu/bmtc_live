package defpackage;

import in.juspay.hypersdk.analytics.LogPusherExp;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class of0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18593a;
    public final /* synthetic */ LogPusherExp b;

    public /* synthetic */ of0(LogPusherExp logPusherExp, int i) {
        this.f18593a = i;
        this.b = logPusherExp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18593a) {
            case 0:
                this.b.lambda$pushAllLogs$6();
                break;
            case 1:
                this.b.pushCrashLogFile();
                break;
            case 2:
                this.b.lambda$clearBacklog$1();
                break;
            default:
                this.b.stopLogPusherOnTerminate();
                break;
        }
    }
}
