package app.chalo.features.adjust;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/adjust/AdjustUrlStrategyConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AdjustUrlStrategyConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdjustUrlStrategy f2624a;

    public AdjustUrlStrategyConfig(AdjustUrlStrategy strategy) {
        Intrinsics.i(strategy, "strategy");
        this.f2624a = strategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdjustUrlStrategyConfig) && this.f2624a == ((AdjustUrlStrategyConfig) obj).f2624a;
    }

    public final int hashCode() {
        return (((this.f2624a.hashCode() * 31) + 1231) * 31) + 1237;
    }

    public final String toString() {
        return "AdjustUrlStrategyConfig(strategy=" + this.f2624a + ", useSubDomains=true, isDataResidency=false)";
    }
}
