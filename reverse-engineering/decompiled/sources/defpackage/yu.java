package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.amazon.device.ads.DTBAdMRAIDBannerController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yu implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20143a;
    public final /* synthetic */ DTBAdMRAIDBannerController b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ yu(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z, int i) {
        this.f20143a = i;
        this.b = dTBAdMRAIDBannerController;
        this.c = viewGroup;
        this.d = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20143a) {
            case 0:
                this.b.lambda$moveExpandedToDefaultImpl$3(this.c, this.d, valueAnimator);
                break;
            default:
                this.b.lambda$moveResizedToDefaultImpl$1(this.c, this.d, valueAnimator);
                break;
        }
    }
}
