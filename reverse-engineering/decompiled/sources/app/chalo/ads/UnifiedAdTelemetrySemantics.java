package app.chalo.ads;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdTelemetrySemantics;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdTelemetrySemantics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f854a;
    public final String b;

    public UnifiedAdTelemetrySemantics(Source source, String screen) {
        Intrinsics.i(source, "source");
        Intrinsics.i(screen, "screen");
        this.f854a = source;
        this.b = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdTelemetrySemantics)) {
            return false;
        }
        UnifiedAdTelemetrySemantics unifiedAdTelemetrySemantics = (UnifiedAdTelemetrySemantics) obj;
        return this.f854a == unifiedAdTelemetrySemantics.f854a && Intrinsics.d(this.b, unifiedAdTelemetrySemantics.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f854a.hashCode() * 31);
    }

    public final String toString() {
        return "UnifiedAdTelemetrySemantics(source=" + this.f854a + ", screen=" + this.b + ")";
    }
}
