package defpackage;

import com.adster.sdk.mediation.MediationAdConfiguration;
import com.adster.sdk.mediation.gam.GAMNativeAdLoader;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w50 implements NativeAd.OnNativeAdLoadedListener, NativeCustomFormatAd.OnCustomFormatAdLoadedListener, OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediationAdConfiguration f19894a;
    public final /* synthetic */ GAMNativeAdLoader b;

    public /* synthetic */ w50(MediationAdConfiguration mediationAdConfiguration, GAMNativeAdLoader gAMNativeAdLoader) {
        this.f19894a = mediationAdConfiguration;
        this.b = gAMNativeAdLoader;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
    public void onCustomFormatAdLoaded(NativeCustomFormatAd nativeCustomFormatAd) {
        GAMNativeAdLoader.loadNativeCustomFormatAd$lambda$8$lambda$7(this.f19894a, this.b, nativeCustomFormatAd);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        GAMNativeAdLoader.loadNativeAd$lambda$6(this.f19894a, this.b, nativeAd);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        GAMNativeAdLoader.loadNativeAd$lambda$6$lambda$4(this.b, this.f19894a, adValue);
    }

    public /* synthetic */ w50(GAMNativeAdLoader gAMNativeAdLoader, MediationAdConfiguration mediationAdConfiguration) {
        this.b = gAMNativeAdLoader;
        this.f19894a = mediationAdConfiguration;
    }
}
