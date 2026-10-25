package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.adster.sdk.mediation.adster.AdSterBannerAdView;
import com.adster.sdk.mediation.adster.AdsterInterstitialAdView;
import com.inmobi.media.C2710wa;
import com.inmobi.media.N6;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18994a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f18994a) {
            case 0:
                return AdSterBannerAdView.a(view, motionEvent);
            case 1:
                return AdsterInterstitialAdView.a(view, motionEvent);
            case 2:
                return N6.a(view, motionEvent);
            default:
                return C2710wa.a(view, motionEvent);
        }
    }
}
