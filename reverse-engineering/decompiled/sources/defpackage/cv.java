package defpackage;

import com.amazon.device.ads.DTBAdMRAIDInterstitialController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15407a;
    public final /* synthetic */ DTBAdMRAIDInterstitialController b;

    public /* synthetic */ cv(DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController, int i) {
        this.f15407a = i;
        this.b = dTBAdMRAIDInterstitialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15407a) {
            case 0:
                this.b.lambda$onAdFailedToLoad$3();
                break;
            case 1:
                this.b.lambda$onAdClicked$1();
                break;
            case 2:
                this.b.lambda$onAdError$4();
                break;
            case 3:
                this.b.lambda$onAdLoaded$2();
                break;
            case 4:
                this.b.lambda$impressionFired$6();
                break;
            case 5:
                this.b.lambda$onAdLeftApplication$5();
                break;
            case 6:
                this.b.lambda$onVideoCompleted$7();
                break;
            default:
                this.b.lambda$executeClose$0();
                break;
        }
    }
}
