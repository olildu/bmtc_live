package app.chalo.ads;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureOverride;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdDebugFixtureOverride {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedAdDebugFixtureScenario f830a;
    public final UnifiedAdDebugRenderedContent b;
    public final int c;

    public UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario scenario, UnifiedAdDebugRenderedContent unifiedAdDebugRenderedContent, int i) {
        unifiedAdDebugRenderedContent = (i & 2) != 0 ? new UnifiedAdDebugRenderedContent("Test Ad : Chalo Fixture", "Install Now", "Ad subtext", Float.valueOf(4.0f), true, null) : unifiedAdDebugRenderedContent;
        Intrinsics.i(scenario, "scenario");
        this.f830a = scenario;
        this.b = unifiedAdDebugRenderedContent;
        this.c = -101;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdDebugFixtureOverride)) {
            return false;
        }
        UnifiedAdDebugFixtureOverride unifiedAdDebugFixtureOverride = (UnifiedAdDebugFixtureOverride) obj;
        return this.f830a == unifiedAdDebugFixtureOverride.f830a && Intrinsics.d(this.b, unifiedAdDebugFixtureOverride.b) && this.c == unifiedAdDebugFixtureOverride.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f830a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnifiedAdDebugFixtureOverride(scenario=");
        sb.append(this.f830a);
        sb.append(", renderedContent=");
        sb.append(this.b);
        sb.append(", failureErrorCode=");
        return b3.f(")", this.c, sb);
    }
}
