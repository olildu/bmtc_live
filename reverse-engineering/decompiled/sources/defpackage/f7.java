package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.DragStartHelper;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdMRAIDExpandedController;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f7 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15615a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f7(Object obj, int i) {
        this.f15615a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15615a) {
            case 0:
                return ApsAdViewImpl.m7721initWebView$lambda3((ApsAdViewImpl) this.b, view, motionEvent);
            case 1:
                return ApsInterstitialActivity.m7713prepareCloseButtonRegion$lambda10$lambda9((ApsInterstitialActivity) this.b, view, motionEvent);
            case 2:
                return ((DTBAdMRAIDController) this.b).lambda$setCloseIndicatorContent$3(view, motionEvent);
            case 3:
                return ((DTBAdMRAIDExpandedController) this.b).lambda$addCloseIndicator$0(view, motionEvent);
            default:
                return ((DragStartHelper) this.b).onTouch(view, motionEvent);
        }
    }
}
