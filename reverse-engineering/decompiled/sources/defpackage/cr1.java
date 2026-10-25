package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class cr1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15400a;
    public final /* synthetic */ GradientDrawable b;

    public /* synthetic */ cr1(GradientDrawable gradientDrawable, int i) {
        this.f15400a = i;
        this.b = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15400a) {
            case 0:
                this.b.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
