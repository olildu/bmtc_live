package app.chalo.ads;

import app.chalo.constants.Source;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdSlotSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdSlotSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedAdSlot f852a;
    public final UnifiedAdHostMode b;
    public final Source c;
    public final String d;
    public final UnifiedAdVisualTreatment e;
    public final UnifiedAdLayoutContract f;
    public final UnifiedAdBannerSize g;

    public UnifiedAdSlotSpec(UnifiedAdSlot slot, UnifiedAdHostMode hostMode, Source analyticsSource, String analyticsScreen, UnifiedAdVisualTreatment visualTreatment, UnifiedAdLayoutContract unifiedAdLayoutContract, UnifiedAdBannerSize unifiedAdBannerSize) {
        Intrinsics.i(slot, "slot");
        Intrinsics.i(hostMode, "hostMode");
        Intrinsics.i(analyticsSource, "analyticsSource");
        Intrinsics.i(analyticsScreen, "analyticsScreen");
        Intrinsics.i(visualTreatment, "visualTreatment");
        this.f852a = slot;
        this.b = hostMode;
        this.c = analyticsSource;
        this.d = analyticsScreen;
        this.e = visualTreatment;
        this.f = unifiedAdLayoutContract;
        this.g = unifiedAdBannerSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdSlotSpec)) {
            return false;
        }
        UnifiedAdSlotSpec unifiedAdSlotSpec = (UnifiedAdSlotSpec) obj;
        return this.f852a == unifiedAdSlotSpec.f852a && this.b == unifiedAdSlotSpec.b && this.c == unifiedAdSlotSpec.c && Intrinsics.d(this.d, unifiedAdSlotSpec.d) && this.e == unifiedAdSlotSpec.e && Intrinsics.d(this.f, unifiedAdSlotSpec.f) && Intrinsics.d(this.g, unifiedAdSlotSpec.g);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.f(this.c, (this.b.hashCode() + (this.f852a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31)) * 31) + (this.g == null ? 0 : 9550);
    }

    public final String toString() {
        return "UnifiedAdSlotSpec(slot=" + this.f852a + ", hostMode=" + this.b + ", analyticsSource=" + this.c + ", analyticsScreen=" + this.d + ", visualTreatment=" + this.e + ", layoutContract=" + this.f + ", bannerBootstrapSize=" + this.g + ")";
    }
}
