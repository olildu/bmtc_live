package defpackage;

import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15495a;
    public final /* synthetic */ DTBAdRequest b;

    public /* synthetic */ dv(DTBAdRequest dTBAdRequest, int i) {
        this.f15495a = i;
        this.b = dTBAdRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15495a) {
            case 0:
                this.b.lambda$new$0();
                break;
            default:
                this.b.lambda$internalLoadAd$1();
                break;
        }
    }
}
