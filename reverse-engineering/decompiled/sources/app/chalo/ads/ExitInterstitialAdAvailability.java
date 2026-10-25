package app.chalo.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdAvailability;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExitInterstitialAdAvailability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f769a;
    public final boolean b;

    public ExitInterstitialAdAvailability(boolean z, boolean z2) {
        this.f769a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInterstitialAdAvailability)) {
            return false;
        }
        ExitInterstitialAdAvailability exitInterstitialAdAvailability = (ExitInterstitialAdAvailability) obj;
        return this.f769a == exitInterstitialAdAvailability.f769a && this.b == exitInterstitialAdAvailability.b;
    }

    public final int hashCode() {
        return ((this.f769a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ExitInterstitialAdAvailability(isReady=" + this.f769a + ", isExpired=" + this.b + ")";
    }
}
