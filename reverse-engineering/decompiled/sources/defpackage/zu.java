package defpackage;

import com.amazon.device.ads.DTBAdMRAIDBannerController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20232a;
    public final /* synthetic */ DTBAdMRAIDBannerController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zu(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i, boolean z, int i2) {
        this.f20232a = i2;
        this.b = dTBAdMRAIDBannerController;
        this.c = i;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20232a) {
            case 0:
                this.b.lambda$moveResizedToDefault$0(this.c, this.d);
                break;
            default:
                this.b.lambda$moveExpandedToDefault$2(this.c, this.d);
                break;
        }
    }
}
