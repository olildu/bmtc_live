package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureRequest;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdDebugFixtureRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f831a;
    public final UnifiedAdRenderConfig b;
    public final UnifiedAdDebugFixtureSelection c;

    public UnifiedAdDebugFixtureRequest(String placementName, UnifiedAdRenderConfig config, UnifiedAdDebugFixtureSelection selection) {
        Intrinsics.i(placementName, "placementName");
        Intrinsics.i(config, "config");
        Intrinsics.i(selection, "selection");
        this.f831a = placementName;
        this.b = config;
        this.c = selection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdDebugFixtureRequest)) {
            return false;
        }
        UnifiedAdDebugFixtureRequest unifiedAdDebugFixtureRequest = (UnifiedAdDebugFixtureRequest) obj;
        return Intrinsics.d(this.f831a, unifiedAdDebugFixtureRequest.f831a) && Intrinsics.d(this.b, unifiedAdDebugFixtureRequest.b) && Intrinsics.d(this.c, unifiedAdDebugFixtureRequest.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f831a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UnifiedAdDebugFixtureRequest(placementName=" + this.f831a + ", config=" + this.b + ", selection=" + this.c + ")";
    }
}
