package app.chalo.ads;

import android.app.Activity;
import com.adster.sdk.mediation.MediationInterstitialAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/SdkExitInterstitialLoadedAd;", "Lapp/chalo/ads/ExitInterstitialLoadedAd;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SdkExitInterstitialLoadedAd implements ExitInterstitialLoadedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialAd f822a;

    public SdkExitInterstitialLoadedAd(MediationInterstitialAd mediationInterstitialAd) {
        this.f822a = mediationInterstitialAd;
    }

    @Override // app.chalo.ads.ExitInterstitialLoadedAd
    public final void a(Activity activity) {
        Intrinsics.i(activity, "activity");
        this.f822a.showAd(activity);
    }

    @Override // app.chalo.ads.ExitInterstitialLoadedAd
    public final void destroy() {
        this.f822a.destroy();
    }
}
