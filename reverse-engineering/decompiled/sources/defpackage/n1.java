package defpackage;

import com.adster.sdk.mediation.admob.AdMobRewardedInterstitialAd;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n1 implements OnUserEarnedRewardListener, OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdMobRewardedInterstitialAd f18443a;

    public /* synthetic */ n1(AdMobRewardedInterstitialAd adMobRewardedInterstitialAd) {
        this.f18443a = adMobRewardedInterstitialAd;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        AdMobRewardedInterstitialAd.AnonymousClass1.a(this.f18443a, adValue);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        AdMobRewardedInterstitialAd.showAd$lambda$2$lambda$1(this.f18443a, rewardItem);
    }
}
