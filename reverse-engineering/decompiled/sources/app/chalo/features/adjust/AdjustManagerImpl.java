package app.chalo.features.adjust;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.KUUID;
import defpackage.f1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/adjust/AdjustManagerImpl;", "Lapp/chalo/features/adjust/AdjustManager;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdjustManagerImpl implements AdjustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBuildConfig f2623a;
    public final ApplicationForegroundManager b;
    public final AnalyticsContract c;
    public final BasicInfoContract d;
    public final UserProfileDetailsProvider e;
    public final IUserPreferencesDataStore f;
    public final CoroutineContextProvider g;
    public final AdjustSdkDelegate h;
    public final SdkIntegrationPolicyManager i;
    public Object j = MapsKt.d();
    public final ContextScope k;

    public AdjustManagerImpl(ChaloBuildConfig chaloBuildConfig, ApplicationForegroundManager applicationForegroundManager, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, IUserPreferencesDataStore iUserPreferencesDataStore, CoroutineContextProvider coroutineContextProvider, AdjustSdkDelegate adjustSdkDelegate, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f2623a = chaloBuildConfig;
        this.b = applicationForegroundManager;
        this.c = analyticsContract;
        this.d = basicInfoContract;
        this.e = userProfileDetailsProvider;
        this.f = iUserPreferencesDataStore;
        this.g = coroutineContextProvider;
        this.h = adjustSdkDelegate;
        this.i = sdkIntegrationPolicyManager;
        this.k = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    @Override // app.chalo.features.adjust.AdjustManager
    public final void a(double d, String eventToken) {
        Intrinsics.i(eventToken, "eventToken");
        if (this.i.f1078a.f1073a) {
            this.h.c(d, eventToken);
        }
    }

    @Override // app.chalo.features.adjust.AdjustManager
    public final void b(String str) {
        if (this.i.f1078a.f1073a) {
            this.h.b(str);
        }
    }

    @Override // app.chalo.features.adjust.AdjustManager
    public final void c() {
        if (this.i.f1078a.f1073a) {
            this.h.a(new CommonAdjustConfig(this.f2623a.getJ(), AdjustLogLevel.SUPPRESS, new AdjustUrlStrategyConfig(AdjustUrlStrategy.URL_STRATEGY_INDIA), new f1(4), new a(this)));
            AdjustManagerImpl$adjustForegroundListener$1 adjustManagerImpl$adjustForegroundListener$1 = new AdjustManagerImpl$adjustForegroundListener$1();
            KUUID.a();
            this.b.a(adjustManagerImpl$adjustForegroundListener$1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.features.adjust.AdjustManager
    public final Map d() {
        return this.j;
    }
}
