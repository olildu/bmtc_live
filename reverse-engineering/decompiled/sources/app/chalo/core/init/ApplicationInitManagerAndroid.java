package app.chalo.core.init;

import app.chalo.ads.AndroidAdsStartup;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.utils.CommonContext;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/init/ApplicationInitManagerAndroid;", "Lapp/chalo/core/init/ApplicationInitManager;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplicationInitManagerAndroid extends ApplicationInitManager {
    public final AndroidAdsStartup u;

    public ApplicationInitManagerAndroid(CommonContext commonContext, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, Lazy lazy, AnalyticsContract analyticsContract, Lazy lazy2, ChaloBuildConfig chaloBuildConfig, SdkIntegrationPolicyManager sdkIntegrationPolicyManager, Lazy lazy3, GCMReceiver gCMReceiver, FcmTokenFeature fcmTokenFeature, ThoughtNudgeContract thoughtNudgeContract, Lazy lazy4, Lazy lazy5, CityChangeOperationTracker cityChangeOperationTracker, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, AndroidAdsStartup androidAdsStartup) {
        super(commonContext, coroutineContextProvider, cityProvider, analyticsContract, chaloBuildConfig, sdkIntegrationPolicyManager, gCMReceiver, fcmTokenFeature, thoughtNudgeContract, cityChangeOperationTracker, lazy5, lazy3, lazy2, lazy4, lazy, lazy6, lazy7, lazy8, lazy9);
        this.u = androidAdsStartup;
    }

    @Override // app.chalo.core.init.ApplicationInitManager
    public final void c() {
        this.u.a(a());
    }

    @Override // app.chalo.core.init.ApplicationInitManager
    public final void d() {
        this.d.getG();
    }
}
