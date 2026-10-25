package app.chalo.home.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/manager/AppRatingProcessManagerInstanceHandler;", "Lapp/chalo/home/manager/AppRatingProcessManagerProvider;", "Lapp/chalo/home/manager/AppRatingProcessManagerSetter;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppRatingProcessManagerInstanceHandler implements AppRatingProcessManagerProvider, AppRatingProcessManagerSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f3109a;
    public final CrashlyticsLogger b;
    public Lazy c;
    public final Lazy d = LazyKt.b(new Function0() { // from class: app.chalo.home.manager.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppRatingProcessManagerInstanceHandler appRatingProcessManagerInstanceHandler = this.f3113a;
            return new DefaultAppRatingProcessManager(appRatingProcessManagerInstanceHandler.f3109a, appRatingProcessManagerInstanceHandler.b);
        }
    });

    public AppRatingProcessManagerInstanceHandler(AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger) {
        this.f3109a = analyticsContract;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.home.manager.AppRatingProcessManagerSetter
    public final void a(Lazy manager) {
        Intrinsics.i(manager, "manager");
        this.c = manager;
    }

    @Override // app.chalo.home.manager.AppRatingProcessManagerProvider
    public final AppRatingProcessManager b() {
        AppRatingProcessManager appRatingProcessManager;
        Lazy lazy = this.c;
        return (lazy == null || (appRatingProcessManager = (AppRatingProcessManager) lazy.getValue()) == null) ? (DefaultAppRatingProcessManager) this.d.getValue() : appRatingProcessManager;
    }

    @Override // app.chalo.home.manager.AppRatingProcessManagerSetter
    public final void c() {
        this.c = null;
    }
}
