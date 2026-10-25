package defpackage;

import com.amazon.device.ads.DTBAdMRAIDBannerController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19961a;
    public final /* synthetic */ DTBAdMRAIDBannerController b;

    public /* synthetic */ wu(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i) {
        this.f19961a = i;
        this.b = dTBAdMRAIDBannerController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19961a) {
            case 0:
                this.b.lambda$passLoadError$18();
                break;
            case 1:
                this.b.lambda$onAdLoaded$16();
                break;
            case 2:
                this.b.lambda$onMRAIDUnload$4();
                break;
            case 3:
                this.b.lambda$onAdLeftApplication$15();
                break;
            case 4:
                this.b.lambda$onAdFailedToLoad$17();
                break;
            case 5:
                this.b.lambda$updateExpandedToDefaultListener$11();
                break;
            case 6:
                this.b.lambda$updateExpandedToDefaultListener$12();
                break;
            case 7:
                this.b.lambda$updateResizedToDefaultListener$9();
                break;
            case 8:
                this.b.lambda$updateResizedToDefaultListener$10();
                break;
            case 9:
                this.b.lambda$useCustomButtonUpdated$13();
                break;
            default:
                this.b.lambda$impressionFired$19();
                break;
        }
    }
}
