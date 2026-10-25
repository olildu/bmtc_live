package defpackage;

import com.adster.sdk.mediation.imavideo.IMABannerVideoAd;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18292a;
    public final /* synthetic */ IMABannerVideoAd b;

    public /* synthetic */ l90(IMABannerVideoAd iMABannerVideoAd, int i) {
        this.f18292a = i;
        this.b = iMABannerVideoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18292a) {
            case 0:
                IMABannerVideoAd.e(this.b);
                break;
            case 1:
                IMABannerVideoAd.f(this.b);
                break;
            default:
                IMABannerVideoAd.d(this.b);
                break;
        }
    }
}
