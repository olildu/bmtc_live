package app.chalo.ads;

import defpackage.cb0;
import defpackage.nf1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleContext;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdLifecycleContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f844a;
    public final UnifiedAdTelemetrySemantics b;
    public final String c;
    public final String d;
    public final Map e;

    public UnifiedAdLifecycleContext(String adUnitId, UnifiedAdTelemetrySemantics unifiedAdTelemetrySemantics, String logContext) {
        Map mapD = MapsKt.d();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(logContext, "logContext");
        this.f844a = adUnitId;
        this.b = unifiedAdTelemetrySemantics;
        this.c = "AdsterUnifiedAd";
        this.d = logContext;
        this.e = mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdLifecycleContext)) {
            return false;
        }
        UnifiedAdLifecycleContext unifiedAdLifecycleContext = (UnifiedAdLifecycleContext) obj;
        return Intrinsics.d(this.f844a, unifiedAdLifecycleContext.f844a) && Intrinsics.d(this.b, unifiedAdLifecycleContext.b) && Intrinsics.d(this.c, unifiedAdLifecycleContext.c) && Intrinsics.d(this.d, unifiedAdLifecycleContext.d) && Intrinsics.d(this.e, unifiedAdLifecycleContext.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(nf1.e((this.b.hashCode() + (this.f844a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnifiedAdLifecycleContext(adUnitId=");
        sb.append(this.f844a);
        sb.append(", telemetry=");
        sb.append(this.b);
        sb.append(", logTag=");
        cb0.t(sb, this.c, ", logContext=", this.d, ", additionalAnalyticsProperties=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
