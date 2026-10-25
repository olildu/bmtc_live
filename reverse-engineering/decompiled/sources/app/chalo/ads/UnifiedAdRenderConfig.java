package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdRenderConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdRenderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedAdSlotSpec f851a;
    public final UnifiedAdHostMode b;

    public UnifiedAdRenderConfig(UnifiedAdSlotSpec spec, UnifiedAdHostMode hostMode) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(hostMode, "hostMode");
        this.f851a = spec;
        this.b = hostMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdRenderConfig)) {
            return false;
        }
        UnifiedAdRenderConfig unifiedAdRenderConfig = (UnifiedAdRenderConfig) obj;
        return Intrinsics.d(this.f851a, unifiedAdRenderConfig.f851a) && this.b == unifiedAdRenderConfig.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f851a.hashCode() * 31);
    }

    public final String toString() {
        return "UnifiedAdRenderConfig(spec=" + this.f851a + ", hostMode=" + this.b + ")";
    }
}
