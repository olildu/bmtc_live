package defpackage;

import com.adster.sdk.mediation.adster.AdsterVideoPlayerView;
import com.adster.sdk.mediation.imavideo.IMABannerVideoAd;
import com.adster.sdk.mediation.imavideo.IMAVideoAd;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t2 implements AdErrorEvent.AdErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19620a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i) {
        this.f19620a = i;
        this.b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        switch (this.f19620a) {
            case 0:
                AdsterVideoPlayerView.a((AdsterVideoPlayerView) this.b, adErrorEvent);
                break;
            case 1:
                IMABannerVideoAd.a((IMABannerVideoAd) this.b, adErrorEvent);
                break;
            default:
                IMAVideoAd.a((IMAVideoAd) this.b, adErrorEvent);
                break;
        }
    }
}
