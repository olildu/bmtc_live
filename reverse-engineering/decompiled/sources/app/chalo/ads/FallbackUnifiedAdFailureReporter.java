package app.chalo.ads;

import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.utils.chalologger.ChaloLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/FallbackUnifiedAdFailureReporter;", "Lapp/chalo/ads/UnifiedAdFailureReporter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FallbackUnifiedAdFailureReporter implements UnifiedAdFailureReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FallbackUnifiedAdFailureReporter f782a = new FallbackUnifiedAdFailureReporter();

    @Override // app.chalo.ads.UnifiedAdFailureReporter
    public final void a(UnifiedAdTerminalFailureReport unifiedAdTerminalFailureReport, Function1 function1, Function1 onCrashLoggingRequired) {
        String str = unifiedAdTerminalFailureReport.f;
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        onCrashLoggingRequired.invoke(new CrashlyticsLog("UnifiedAdFailureReporter", "fallback_reporter_used:runtime_failure_analytics_not_emitted"));
        if (function1 != null) {
            function1.invoke(Integer.valueOf(unifiedAdTerminalFailureReport.c));
        }
        onCrashLoggingRequired.invoke(new CrashlyticsLog(unifiedAdTerminalFailureReport.h, unifiedAdTerminalFailureReport.i));
        ChaloLog.c("UnifiedAdFailureReporter", "fallback_reporter_used:runtime_failure_analytics_not_emitted originalTag=" + str, null);
        ChaloLog.c(str, unifiedAdTerminalFailureReport.g, unifiedAdTerminalFailureReport.j);
    }
}
