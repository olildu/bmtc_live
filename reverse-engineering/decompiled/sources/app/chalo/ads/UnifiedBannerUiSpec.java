package app.chalo.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedBannerUiSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedBannerUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f856a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public UnifiedBannerUiSpec(int i, int i2, boolean z, boolean z2) {
        this.f856a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedBannerUiSpec)) {
            return false;
        }
        UnifiedBannerUiSpec unifiedBannerUiSpec = (UnifiedBannerUiSpec) obj;
        return this.f856a == unifiedBannerUiSpec.f856a && this.b == unifiedBannerUiSpec.b && this.c == unifiedBannerUiSpec.c && this.d == unifiedBannerUiSpec.d;
    }

    public final int hashCode() {
        return (((((this.f856a * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        return "UnifiedBannerUiSpec(fallbackHeightDp=" + this.f856a + ", usesServedHeight=" + this.b + ", fillContainer=" + this.c + ", gravity=" + this.d + ")";
    }
}
