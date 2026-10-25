package app.chalo.home.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/manager/DefaultAppRatingProcessManager;", "Lapp/chalo/home/manager/AppRatingProcessManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultAppRatingProcessManager implements AppRatingProcessManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f3111a;
    public final CrashlyticsLogger b;

    public DefaultAppRatingProcessManager(AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger) {
        this.f3111a = analyticsContract;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.home.manager.AppRatingProcessManager
    public final void a(Source source, Map map) {
        Intrinsics.i(source, "source");
        c(source, "launchInAppReviewFlow", map);
        this.b.i(new IllegalStateException("AppRatingProcessManager not setup"));
    }

    @Override // app.chalo.home.manager.AppRatingProcessManager
    public final boolean b(Source source, Map map) {
        Intrinsics.i(source, "source");
        c(source, "launchAppMarketPlace", map);
        this.b.i(new IllegalStateException("AppRatingProcessManager not setup"));
        return false;
    }

    public final void c(Source source, String str, Map map) {
        LinkedHashMap linkedHashMapU = MapsKt.u(map);
        linkedHashMapU.put("requestedBy", source.getSourceName());
        linkedHashMapU.put("methodCalled", str);
        AnalyticsContract.DefaultImpls.a(this.f3111a, "AppRatingProcessManager not setup", "DefaultManager", linkedHashMapU, null, false, 24);
    }
}
