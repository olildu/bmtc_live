package defpackage;

import com.amazon.device.ads.DTBAdMRAIDController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11232a;
    public final /* synthetic */ DTBAdMRAIDController b;

    public /* synthetic */ bv(DTBAdMRAIDController dTBAdMRAIDController, int i) {
        this.f11232a = i;
        this.b = dTBAdMRAIDController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11232a) {
            case 0:
                this.b.lambda$onMRAIDUnload$2();
                break;
            default:
                this.b.lambda$setState$1();
                break;
        }
    }
}
