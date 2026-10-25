package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import com.adster.sdk.mediation.adster.AdsterVideoPlayerView;
import com.adster.sdk.mediation.imavideo.IMAVideoAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u2 implements AdsLoader.Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19708a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i) {
        this.f19708a = i;
        this.b = obj;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader.Provider
    public final AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration) {
        switch (this.f19708a) {
            case 0:
                return AdsterVideoPlayerView.a((AdsterVideoPlayerView) this.b, adsConfiguration);
            default:
                return IMAVideoAd.a((IMAVideoAd) this.b, adsConfiguration);
        }
    }
}
