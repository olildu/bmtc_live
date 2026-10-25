package app.chalo.core.init;

import android.app.Application;
import android.content.Context;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.utils.CommonContext;
import app.chalo.crashlytics.CrashlyticsLoggerUtils;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import co.touchlab.crashkios.core.ThreadSafeVar;
import co.touchlab.crashkios.crashlytics.CrashlyticsCallsActual;
import co.touchlab.crashkios.crashlytics.CrashlyticsKotlin;
import defpackage.w6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import so.plotline.insights.ActivityCallback;
import so.plotline.insights.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/init/ApplicationInitManager;", "", "Companion", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ApplicationInitManager {
    public static final Object t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonContext f2155a;
    public final CityProvider b;
    public final AnalyticsContract c;
    public final ChaloBuildConfig d;
    public final SdkIntegrationPolicyManager e;
    public final GCMReceiver f;
    public final FcmTokenFeature g;
    public final ThoughtNudgeContract h;
    public final CityChangeOperationTracker i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/init/ApplicationInitManager$Companion;", "Lorg/koin/core/component/KoinComponent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements KoinComponent {
        @Override // org.koin.core.component.KoinComponent
        public final Koin L() {
            return GlobalContext.f18817a.a();
        }
    }

    static {
        final Companion companion = new Companion();
        t = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<ApplicationInitManager>() { // from class: app.chalo.core.init.ApplicationInitManager$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = companion;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ApplicationInitManager.class), null, null);
            }
        });
    }

    public ApplicationInitManager(CommonContext commonContext, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, AnalyticsContract analyticsContract, ChaloBuildConfig chaloBuildConfig, SdkIntegrationPolicyManager sdkIntegrationPolicyManager, GCMReceiver gCMReceiver, FcmTokenFeature fcmTokenFeature, ThoughtNudgeContract thoughtNudgeContract, CityChangeOperationTracker cityChangeOperationTracker, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9) {
        this.f2155a = commonContext;
        this.b = cityProvider;
        this.c = analyticsContract;
        this.d = chaloBuildConfig;
        this.e = sdkIntegrationPolicyManager;
        this.f = gCMReceiver;
        this.g = fcmTokenFeature;
        this.h = thoughtNudgeContract;
        this.i = cityChangeOperationTracker;
        this.j = lazy6;
        this.k = lazy8;
        this.l = lazy9;
        this.m = lazy5;
        this.n = lazy3;
        this.o = lazy4;
        this.p = lazy7;
        this.q = lazy2;
        this.r = lazy;
        this.s = LazyKt.b(new w6(coroutineContextProvider, 0));
    }

    public final CoroutineScope a() {
        return (CoroutineScope) this.s.getValue();
    }

    public final void b() {
        CrashlyticsKotlin crashlyticsKotlin = CrashlyticsKotlin.f11351a;
        CrashlyticsCallsActual crashlyticsCallsActual = new CrashlyticsCallsActual();
        crashlyticsKotlin.getClass();
        ThreadSafeVar threadSafeVar = CrashlyticsKotlin.c;
        KProperty property = CrashlyticsKotlin.b[0];
        threadSafeVar.getClass();
        Intrinsics.i(property, "property");
        threadSafeVar.f11350a = crashlyticsCallsActual;
        CrashlyticsLoggerUtils.a().c();
        this.c.y();
        d();
        if (this.e.f1078a.c) {
            BuildersKt.d(a(), null, null, new ApplicationInitManager$init$1(this, null), 3);
        }
        BuildersKt.d(a(), null, null, new ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1(this, null), 3);
        if (this.e.f1078a.b) {
            Context context = this.f2155a.f1927a;
            if (context != null) {
                Application application = context instanceof Application ? (Application) context : null;
                if (application != null) {
                    ActivityCallback activityCallback = new ActivityCallback();
                    Plotline.s0 = activityCallback;
                    application.registerActivityLifecycleCallbacks(activityCallback);
                    application.registerComponentCallbacks(Plotline.s0);
                }
            }
            BuildersKt.d(a(), null, null, new ApplicationInitManager$initialisePlotline$2(this, null), 3);
        }
        BuildersKt.d(a(), null, null, new ApplicationInitManager$init$2(this, null), 3);
        BuildersKt.d(a(), null, null, new ApplicationInitManager$checkIfMetaPropsAvailableAndRefreshChaloConfig$1(this, null), 3);
        BuildersKt.d(a(), null, null, new ApplicationInitManager$validateChaloTimeInCache$1(this, null), 3);
        c();
        BuildersKt.d(a(), null, null, new ApplicationInitManager$setupWorkers$1(this, "home_activity_new", null), 3);
        this.c.q();
        if (this.e.f1078a.f1073a) {
            BuildersKt.d(a(), null, null, new ApplicationInitManager$init$3(this, null), 3);
        }
    }

    public abstract void c();

    public abstract void d();
}
