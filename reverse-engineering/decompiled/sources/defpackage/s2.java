package defpackage;

import com.adster.sdk.mediation.adster.AdsterVideoPlayerView;
import com.adster.sdk.mediation.imavideo.IMABannerVideoAd;
import com.adster.sdk.mediation.imavideo.IMAVideoAd;
import com.google.ads.interactivemedia.v3.api.AdEvent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s2 implements AdEvent.AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19263a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i) {
        this.f19263a = i;
        this.b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        switch (this.f19263a) {
            case 0:
                AdsterVideoPlayerView.a((AdsterVideoPlayerView) this.b, adEvent);
                break;
            case 1:
                IMABannerVideoAd.a((IMABannerVideoAd) this.b, adEvent);
                break;
            default:
                IMAVideoAd.a((IMAVideoAd) this.b, adEvent);
                break;
        }
    }
}
