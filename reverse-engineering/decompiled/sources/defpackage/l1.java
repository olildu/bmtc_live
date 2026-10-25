package defpackage;

import com.adster.sdk.mediation.MediationAdConfiguration;
import com.adster.sdk.mediation.admob.AdMobNativeAdLoader;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l1 implements NativeAd.OnNativeAdLoadedListener, OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdMobNativeAdLoader f18271a;
    public final /* synthetic */ MediationAdConfiguration b;

    public /* synthetic */ l1(AdMobNativeAdLoader adMobNativeAdLoader, MediationAdConfiguration mediationAdConfiguration) {
        this.f18271a = adMobNativeAdLoader;
        this.b = mediationAdConfiguration;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        AdMobNativeAdLoader.loadNativeAd$lambda$5(this.f18271a, this.b, nativeAd);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        AdMobNativeAdLoader.loadNativeAd$lambda$5$lambda$3(this.f18271a, this.b, adValue);
    }
}
