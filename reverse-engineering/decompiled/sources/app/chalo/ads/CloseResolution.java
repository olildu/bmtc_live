package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/CloseResolution;", "", "Ignored", "Accepted", "Lapp/chalo/ads/CloseResolution$Accepted;", "Lapp/chalo/ads/CloseResolution$Ignored;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface CloseResolution {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/CloseResolution$Accepted;", "Lapp/chalo/ads/CloseResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Accepted implements CloseResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExitInterstitialLoadedAd f755a;

        public Accepted(ExitInterstitialLoadedAd ad) {
            Intrinsics.i(ad, "ad");
            this.f755a = ad;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Accepted) && Intrinsics.d(this.f755a, ((Accepted) obj).f755a);
        }

        public final int hashCode() {
            return this.f755a.hashCode();
        }

        public final String toString() {
            return "Accepted(ad=" + this.f755a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/CloseResolution$Ignored;", "Lapp/chalo/ads/CloseResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ignored implements CloseResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ignored f756a = new Ignored();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ignored);
        }

        public final int hashCode() {
            return -1630228658;
        }

        public final String toString() {
            return "Ignored";
        }
    }
}
