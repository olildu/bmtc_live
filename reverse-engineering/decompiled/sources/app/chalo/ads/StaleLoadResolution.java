package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/StaleLoadResolution;", "", "Stale", "Accepted", "Lapp/chalo/ads/StaleLoadResolution$Accepted;", "Lapp/chalo/ads/StaleLoadResolution$Stale;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface StaleLoadResolution {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/StaleLoadResolution$Accepted;", "Lapp/chalo/ads/StaleLoadResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Accepted implements StaleLoadResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExitInterstitialLoadedAd f826a;

        public Accepted(ExitInterstitialLoadedAd exitInterstitialLoadedAd) {
            this.f826a = exitInterstitialLoadedAd;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Accepted) && Intrinsics.d(this.f826a, ((Accepted) obj).f826a);
        }

        public final int hashCode() {
            ExitInterstitialLoadedAd exitInterstitialLoadedAd = this.f826a;
            if (exitInterstitialLoadedAd == null) {
                return 0;
            }
            return exitInterstitialLoadedAd.hashCode();
        }

        public final String toString() {
            return "Accepted(previousAd=" + this.f826a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/StaleLoadResolution$Stale;", "Lapp/chalo/ads/StaleLoadResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Stale implements StaleLoadResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stale f827a = new Stale();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Stale);
        }

        public final int hashCode() {
            return 1095994940;
        }

        public final String toString() {
            return "Stale";
        }
    }
}
