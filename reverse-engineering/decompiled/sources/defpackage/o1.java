package defpackage;

import android.view.View;
import com.adster.sdk.mediation.adster.AdSterBannerAdView;
import com.adster.sdk.mediation.adster.AdsterInterstitialAdView;
import com.adster.sdk.mediation.adster.view.AdSterMediaView;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o1 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18559a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f18559a) {
            case 0:
                return AdSterBannerAdView.a(view);
            case 1:
                return AdSterMediaView.a(view);
            case 2:
                return AdSterMediaView.b(view);
            case 3:
                return AdsterInterstitialAdView.a(view);
            case 4:
                return AdsterInterstitialAdView.c(view);
            default:
                return AdsterInterstitialAdView.b(view);
        }
    }
}
