package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import com.adster.sdk.mediation.imavideo.IMABannerVideoAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m90 implements AdsLoader.Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18381a;
    public final /* synthetic */ IMABannerVideoAd b;

    public /* synthetic */ m90(IMABannerVideoAd iMABannerVideoAd, int i) {
        this.f18381a = i;
        this.b = iMABannerVideoAd;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader.Provider
    public final AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration) {
        switch (this.f18381a) {
            case 0:
                return IMABannerVideoAd.a(this.b, adsConfiguration);
            default:
                return IMABannerVideoAd.b(this.b, adsConfiguration);
        }
    }
}
