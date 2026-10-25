package app.chalo.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdEvent;", "", "Opened", "Closed", "Lapp/chalo/ads/ExitInterstitialAdEvent$Closed;", "Lapp/chalo/ads/ExitInterstitialAdEvent$Opened;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExitInterstitialAdEvent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdEvent$Closed;", "Lapp/chalo/ads/ExitInterstitialAdEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Closed implements ExitInterstitialAdEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Closed f772a = new Closed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return 689678503;
        }

        public final String toString() {
            return "Closed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdEvent$Opened;", "Lapp/chalo/ads/ExitInterstitialAdEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Opened implements ExitInterstitialAdEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Opened f773a = new Opened();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Opened);
        }

        public final int hashCode() {
            return 1036619684;
        }

        public final String toString() {
            return "Opened";
        }
    }
}
