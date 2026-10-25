package defpackage;

import android.view.View;
import com.adster.sdk.mediation.adster.AdsterInterstitialAdView;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153a;
    public final /* synthetic */ AdsterInterstitialAdView b;

    public /* synthetic */ a2(AdsterInterstitialAdView adsterInterstitialAdView, int i) {
        this.f153a = i;
        this.b = adsterInterstitialAdView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f153a) {
            case 0:
                AdsterInterstitialAdView.b(this.b, view);
                break;
            default:
                AdsterInterstitialAdView.a(this.b, view);
                break;
        }
    }
}
