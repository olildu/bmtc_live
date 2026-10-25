package app.chalo.ads;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.utils.chalologger.ChaloLog;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultUnifiedAdFailureReporter;", "Lapp/chalo/ads/UnifiedAdFailureReporter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultUnifiedAdFailureReporter implements UnifiedAdFailureReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f766a;

    public DefaultUnifiedAdFailureReporter(AnalyticsContract analyticsContract) {
        this.f766a = analyticsContract;
    }

    @Override // app.chalo.ads.UnifiedAdFailureReporter
    public final void a(UnifiedAdTerminalFailureReport unifiedAdTerminalFailureReport, Function1 function1, Function1 onCrashLoggingRequired) {
        int i;
        Object objA;
        String str = unifiedAdTerminalFailureReport.g;
        String str2 = unifiedAdTerminalFailureReport.f;
        int i2 = unifiedAdTerminalFailureReport.c;
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        try {
            AnalyticsContract analyticsContract = this.f766a;
            UnifiedAdTelemetrySemantics unifiedAdTelemetrySemantics = unifiedAdTerminalFailureReport.b;
            Source source = unifiedAdTelemetrySemantics.f854a;
            i = i2;
            try {
                LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("adUnitId", unifiedAdTerminalFailureReport.f855a), new Pair("placement", LogConstants.DEFAULT_CHANNEL), new Pair(PaymentConstants.Event.SCREEN, unifiedAdTelemetrySemantics.b), new Pair("adSdk", "adster"), new Pair("adType", unifiedAdTerminalFailureReport.e), new Pair("errorCode", Integer.valueOf(i)), new Pair("errorMessage", unifiedAdTerminalFailureReport.d));
                linkedHashMapK.putAll(unifiedAdTerminalFailureReport.k);
                AnalyticsContractImplKt.b(analyticsContract, "ad load failed", source, linkedHashMapK, false, 8);
                objA = Unit.f17538a;
            } catch (Throwable th) {
                th = th;
                objA = ResultKt.a(th);
            }
        } catch (Throwable th2) {
            th = th2;
            i = i2;
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            String strF = Reflection.a(thA.getClass()).f();
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            ChaloLog.c(str2, str + " analytics_report_failed:" + strF + ":" + message, thA);
        }
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        onCrashLoggingRequired.invoke(new CrashlyticsLog(unifiedAdTerminalFailureReport.h, unifiedAdTerminalFailureReport.i));
        ChaloLog.c(str2, str, unifiedAdTerminalFailureReport.j);
    }
}
