package defpackage;

import com.adster.sdk.mediation.gam.GAMUnifiedAdLoader;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z50 implements NativeAd.OnNativeAdLoadedListener, OnAdManagerAdViewLoadedListener, NativeCustomFormatAd.OnCustomFormatAdLoadedListener, OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20167a;
    public final /* synthetic */ GAMUnifiedAdLoader b;

    public /* synthetic */ z50(GAMUnifiedAdLoader gAMUnifiedAdLoader, int i) {
        this.f20167a = i;
        this.b = gAMUnifiedAdLoader;
    }

    @Override // com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener
    public void onAdManagerAdViewLoaded(AdManagerAdView adManagerAdView) {
        GAMUnifiedAdLoader.loadUnifiedAd$lambda$9(this.b, adManagerAdView);
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
    public void onCustomFormatAdLoaded(NativeCustomFormatAd nativeCustomFormatAd) {
        GAMUnifiedAdLoader.loadUnifiedAd$lambda$13$lambda$12$lambda$11(this.b, nativeCustomFormatAd);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        GAMUnifiedAdLoader.loadUnifiedAd$lambda$5(this.b, nativeAd);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        switch (this.f20167a) {
            case 3:
                GAMUnifiedAdLoader.loadUnifiedAd$lambda$9$lambda$8(this.b, adValue);
                break;
            default:
                GAMUnifiedAdLoader.loadUnifiedAd$lambda$5$lambda$4(this.b, adValue);
                break;
        }
    }
}
