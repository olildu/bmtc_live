package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.ui.DefaultTimeBar;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.CompositionLayer;
import java.util.HashSet;
import so.plotline.insights.FlowViews.c;
import so.plotline.insights.FlowViews.d;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ey implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15596a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ey(Object obj, int i) {
        this.f15596a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f15596a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DefaultTimeBar) obj).lambda$new$1(valueAnimator);
                break;
            case 1:
                LottieDrawable lottieDrawable = (LottieDrawable) obj;
                boolean z = LottieDrawable.V;
                AsyncUpdates asyncUpdates = lottieDrawable.P;
                if (asyncUpdates == null) {
                    asyncUpdates = L.f12119a;
                }
                if (asyncUpdates != AsyncUpdates.ENABLED) {
                    CompositionLayer compositionLayer = lottieDrawable.s;
                    if (compositionLayer != null) {
                        compositionLayer.s(lottieDrawable.b.d());
                    }
                } else {
                    lottieDrawable.invalidateSelf();
                }
                break;
            case 2:
                PlotlineWidget plotlineWidget = (PlotlineWidget) obj;
                HashSet hashSet = PlotlineWidget.p;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = plotlineWidget.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iIntValue;
                    plotlineWidget.setLayoutParams(layoutParams);
                }
                if (plotlineWidget.l != null) {
                    d.a(plotlineWidget.getWidth());
                    d.a(iIntValue);
                    DebugHelper.b();
                    plotlineWidget.l.a();
                }
                break;
            case 3:
                c cVar = (c) obj;
                int i2 = c.t;
                cVar.getClass();
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                WindowManager.LayoutParams attributes = cVar.getWindow().getAttributes();
                attributes.x = iIntValue2;
                cVar.getWindow().setAttributes(attributes);
                break;
            case 4:
                ((View) obj).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((AppCompatTextView) obj).setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
