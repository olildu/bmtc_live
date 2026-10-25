package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/FixedBannerAdAnalyticsMetadata;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FixedBannerAdAnalyticsMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f784a;
    public final BannerAdSlot b;

    public FixedBannerAdAnalyticsMetadata(String adUnitId, BannerAdSlot slot) {
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        this.f784a = adUnitId;
        this.b = slot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedBannerAdAnalyticsMetadata)) {
            return false;
        }
        FixedBannerAdAnalyticsMetadata fixedBannerAdAnalyticsMetadata = (FixedBannerAdAnalyticsMetadata) obj;
        return Intrinsics.d(this.f784a, fixedBannerAdAnalyticsMetadata.f784a) && this.b == fixedBannerAdAnalyticsMetadata.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f784a.hashCode() * 31);
    }

    public final String toString() {
        return "FixedBannerAdAnalyticsMetadata(adUnitId=" + this.f784a + ", slot=" + this.b + ")";
    }
}
