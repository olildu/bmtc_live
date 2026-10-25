package defpackage;

import in.juspay.hypersdk.services.HyperPaymentsServices;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15803a;
    public final /* synthetic */ HyperPaymentsServices b;

    public /* synthetic */ h90(HyperPaymentsServices hyperPaymentsServices, int i) {
        this.f15803a = i;
        this.b = hyperPaymentsServices;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15803a) {
            case 0:
                this.b.lambda$runProcessWaitQueue$5();
                break;
            case 1:
                this.b.lambda$initiate$3();
                break;
            case 2:
                this.b.lambda$handleOnEvent$1();
                break;
            default:
                this.b.lambda$handleOnEvent$0();
                break;
        }
    }
}
