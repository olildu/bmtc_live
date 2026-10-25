package app.chalo.uistate.components.map;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/map/TrafficLayerConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrafficLayerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9964a;
    public final boolean b;

    public TrafficLayerConfig(boolean z, boolean z2) {
        this.f9964a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficLayerConfig)) {
            return false;
        }
        TrafficLayerConfig trafficLayerConfig = (TrafficLayerConfig) obj;
        return this.f9964a == trafficLayerConfig.f9964a && this.b == trafficLayerConfig.b;
    }

    public final int hashCode() {
        return ((this.f9964a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "TrafficLayerConfig(shouldShowTrafficLayer=" + this.f9964a + ", shouldShowPolyline=" + this.b + ")";
    }

    public /* synthetic */ TrafficLayerConfig() {
        this(false, true);
    }
}
