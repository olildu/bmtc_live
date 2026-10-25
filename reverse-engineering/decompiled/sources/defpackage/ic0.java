package defpackage;

import in.juspay.hypersdk.core.JBridge;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ic0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15901a;
    public final /* synthetic */ JBridge b;
    public final /* synthetic */ String c;

    public /* synthetic */ ic0(JBridge jBridge, String str, int i) {
        this.f15901a = i;
        this.b = jBridge;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15901a) {
            case 0:
                this.b.lambda$showJuspayLoader$0(this.c);
                break;
            default:
                this.b.lambda$hideJuspayLoader$1(this.c);
                break;
        }
    }
}
