package defpackage;

import android.animation.ValueAnimator;
import androidx.core.view.insets.Protection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class az0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11154a;
    public final /* synthetic */ Protection b;

    public /* synthetic */ az0(Protection protection, int i) {
        this.f11154a = i;
        this.b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11154a) {
            case 0:
                this.b.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                this.b.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
