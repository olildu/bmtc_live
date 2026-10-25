package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ads/ShowResolution;", "", "Blocked", "Expired", "Ready", "Lapp/chalo/ads/ShowResolution$Blocked;", "Lapp/chalo/ads/ShowResolution$Expired;", "Lapp/chalo/ads/ShowResolution$Ready;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ShowResolution {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ShowResolution$Blocked;", "Lapp/chalo/ads/ShowResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Blocked implements ShowResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blocked f823a = new Blocked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Blocked);
        }

        public final int hashCode() {
            return 897697249;
        }

        public final String toString() {
            return "Blocked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ShowResolution$Expired;", "Lapp/chalo/ads/ShowResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expired implements ShowResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExitInterstitialLoadedAd f824a;

        public Expired(ExitInterstitialLoadedAd ad) {
            Intrinsics.i(ad, "ad");
            this.f824a = ad;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Expired) && Intrinsics.d(this.f824a, ((Expired) obj).f824a);
        }

        public final int hashCode() {
            return this.f824a.hashCode();
        }

        public final String toString() {
            return "Expired(ad=" + this.f824a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ShowResolution$Ready;", "Lapp/chalo/ads/ShowResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ready implements ShowResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExitInterstitialLoadedAd f825a;

        public Ready(ExitInterstitialLoadedAd ad) {
            Intrinsics.i(ad, "ad");
            this.f825a = ad;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && Intrinsics.d(this.f825a, ((Ready) obj).f825a);
        }

        public final int hashCode() {
            return this.f825a.hashCode();
        }

        public final String toString() {
            return "Ready(ad=" + this.f825a + ")";
        }
    }
}
