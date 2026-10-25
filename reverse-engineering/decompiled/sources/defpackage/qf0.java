package defpackage;

import in.juspay.hypersdk.analytics.LogSessioniserExp;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19117a;
    public final /* synthetic */ LogSessioniserExp b;

    public /* synthetic */ qf0(LogSessioniserExp logSessioniserExp, int i) {
        this.f19117a = i;
        this.b = logSessioniserExp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19117a) {
            case 0:
                this.b.updatePushFile();
                break;
            case 1:
                this.b.lambda$startPushing$2();
                break;
            default:
                this.b.lambda$stopLogSessioniserOnTerminate$0();
                break;
        }
    }
}
