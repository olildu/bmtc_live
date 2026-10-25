package app.chalo.ads;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdTerminalFailureReport;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdTerminalFailureReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f855a;
    public final UnifiedAdTelemetrySemantics b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Throwable j;
    public final Map k;

    public UnifiedAdTerminalFailureReport(String adUnitId, UnifiedAdTelemetrySemantics unifiedAdTelemetrySemantics, int i, String errorMessage, String adType, String logMessage, String crashlyticsMessage, Throwable th, int i2) {
        th = (i2 & 512) != 0 ? null : th;
        Map mapD = MapsKt.d();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(errorMessage, "errorMessage");
        Intrinsics.i(adType, "adType");
        Intrinsics.i(logMessage, "logMessage");
        Intrinsics.i(crashlyticsMessage, "crashlyticsMessage");
        this.f855a = adUnitId;
        this.b = unifiedAdTelemetrySemantics;
        this.c = i;
        this.d = errorMessage;
        this.e = adType;
        this.f = "AdsterUnifiedAd";
        this.g = logMessage;
        this.h = "AdsterUnifiedAd";
        this.i = crashlyticsMessage;
        this.j = th;
        this.k = mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdTerminalFailureReport)) {
            return false;
        }
        UnifiedAdTerminalFailureReport unifiedAdTerminalFailureReport = (UnifiedAdTerminalFailureReport) obj;
        return Intrinsics.d(this.f855a, unifiedAdTerminalFailureReport.f855a) && Intrinsics.d(this.b, unifiedAdTerminalFailureReport.b) && this.c == unifiedAdTerminalFailureReport.c && Intrinsics.d(this.d, unifiedAdTerminalFailureReport.d) && Intrinsics.d(this.e, unifiedAdTerminalFailureReport.e) && Intrinsics.d(this.f, unifiedAdTerminalFailureReport.f) && Intrinsics.d(this.g, unifiedAdTerminalFailureReport.g) && Intrinsics.d(this.h, unifiedAdTerminalFailureReport.h) && Intrinsics.d(this.i, unifiedAdTerminalFailureReport.i) && Intrinsics.d(this.j, unifiedAdTerminalFailureReport.j) && Intrinsics.d(this.k, unifiedAdTerminalFailureReport.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((((this.b.hashCode() + (this.f855a.hashCode() * 31)) * 31) + this.c) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Throwable th = this.j;
        return this.k.hashCode() + ((iE + (th == null ? 0 : th.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnifiedAdTerminalFailureReport(adUnitId=");
        sb.append(this.f855a);
        sb.append(", telemetry=");
        sb.append(this.b);
        sb.append(", errorCode=");
        pk0.t(this.c, ", errorMessage=", this.d, ", adType=", sb);
        cb0.t(sb, this.e, ", logTag=", this.f, ", logMessage=");
        cb0.t(sb, this.g, ", crashlyticsTag=", this.h, ", crashlyticsMessage=");
        sb.append(this.i);
        sb.append(", logThrowable=");
        sb.append(this.j);
        sb.append(", additionalAnalyticsProperties=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
