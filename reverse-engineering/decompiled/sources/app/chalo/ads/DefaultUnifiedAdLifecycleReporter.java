package app.chalo.ads;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.utils.chalologger.ChaloLog;
import defpackage.xj1;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultUnifiedAdLifecycleReporter;", "Lapp/chalo/ads/UnifiedAdLifecycleReporter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultUnifiedAdLifecycleReporter implements UnifiedAdLifecycleReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f767a;
    public final UnifiedAdFailureReporter b;

    public DefaultUnifiedAdLifecycleReporter(AnalyticsContract analyticsContract, UnifiedAdFailureReporter unifiedAdFailureReporter) {
        this.f767a = analyticsContract;
        this.b = unifiedAdFailureReporter;
    }

    public static String b(UnifiedAdLifecycleEvent unifiedAdLifecycleEvent) {
        if (unifiedAdLifecycleEvent.equals(UnifiedAdLifecycleEvent.Requested.f850a)) {
            return "ad requested";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Loaded) {
            return "ad loaded";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Rendered) {
            return "ad rendered";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Failed) {
            return "ad load failed";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Impression) {
            return "ad impression";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Click) {
            return "ad clicked";
        }
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.PaidImpression) {
            return "ad paid impression";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LinkedHashMap c(UnifiedAdLifecycleEvent unifiedAdLifecycleEvent, UnifiedAdLifecycleContext unifiedAdLifecycleContext) {
        UnifiedAdCreativeType unifiedAdCreativeType;
        long jG;
        Pair pair = new Pair("adUnitId", unifiedAdLifecycleContext.f844a);
        Pair pair2 = new Pair("placement", LogConstants.DEFAULT_CHANNEL);
        Pair pair3 = new Pair(PaymentConstants.Event.SCREEN, unifiedAdLifecycleContext.b.b);
        Pair pair4 = new Pair("adSdk", "adster");
        if (unifiedAdLifecycleEvent.equals(UnifiedAdLifecycleEvent.Requested.f850a)) {
            unifiedAdCreativeType = UnifiedAdCreativeType.UNIFIED;
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Loaded) {
            unifiedAdCreativeType = ((UnifiedAdLifecycleEvent.Loaded) unifiedAdLifecycleEvent).f847a;
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Rendered) {
            unifiedAdCreativeType = ((UnifiedAdLifecycleEvent.Rendered) unifiedAdLifecycleEvent).f849a;
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Failed) {
            unifiedAdCreativeType = null;
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Impression) {
            unifiedAdCreativeType = ((UnifiedAdLifecycleEvent.Impression) unifiedAdLifecycleEvent).f846a;
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Click) {
            unifiedAdCreativeType = ((UnifiedAdLifecycleEvent.Click) unifiedAdLifecycleEvent).f845a;
        } else {
            if (!(unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.PaidImpression)) {
                throw new NoWhenBranchMatchedException();
            }
            unifiedAdCreativeType = ((UnifiedAdLifecycleEvent.PaidImpression) unifiedAdLifecycleEvent).f848a;
        }
        LinkedHashMap linkedHashMapK = MapsKt.k(pair, pair2, pair3, pair4, new Pair("adType", unifiedAdCreativeType.getAnalyticsValue()));
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Loaded) {
            linkedHashMapK.put("adLoadTime", Long.valueOf(((UnifiedAdLifecycleEvent.Loaded) unifiedAdLifecycleEvent).b));
        } else if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.PaidImpression) {
            UnifiedAdLifecycleEvent.PaidImpression paidImpression = (UnifiedAdLifecycleEvent.PaidImpression) unifiedAdLifecycleEvent;
            double d = paidImpression.b * 1000000.0d;
            if (Math.abs(d) > Double.MAX_VALUE || d <= 0.0d) {
                jG = 0;
            } else {
                jG = MathKt.g(d);
                if (jG < 1) {
                    jG = 1;
                }
            }
            linkedHashMapK.put("valueMicros", Long.valueOf(jG));
            String str = paidImpression.d;
            if (StringsKt.F(str)) {
                str = "USD";
            }
            linkedHashMapK.put("currencyCode", str);
            linkedHashMapK.put("network", paidImpression.c);
        }
        linkedHashMapK.putAll(unifiedAdLifecycleContext.e);
        return linkedHashMapK;
    }

    @Override // app.chalo.ads.UnifiedAdLifecycleReporter
    public final void a(UnifiedAdLifecycleContext context, UnifiedAdLifecycleEvent unifiedAdLifecycleEvent, xj1 xj1Var) {
        Object objA;
        Intrinsics.i(context, "context");
        if (unifiedAdLifecycleEvent instanceof UnifiedAdLifecycleEvent.Failed) {
            throw null;
        }
        try {
            AnalyticsContractImplKt.b(this.f767a, b(unifiedAdLifecycleEvent), context.b.f854a, c(unifiedAdLifecycleEvent, context), false, 8);
            objA = Unit.f17538a;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            String str = context.c;
            String str2 = context.d;
            String strF = Reflection.a(thA.getClass()).f();
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            ChaloLog.c(str, str2 + " lifecycle analytics_report_failed:" + strF + ":" + message, thA);
        }
    }
}
