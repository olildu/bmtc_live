package app.chalo.login.domain;

import app.chalo.constants.Source;
import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.login.data.models.app.OnboardingMinProfileUpdateRemoteConfigModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/domain/FetchOnboardingMinProfileUpdateConfigUseCase;", "", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchOnboardingMinProfileUpdateConfigUseCase {
    public static final OnboardingMinProfileUpdateRemoteConfigModel d = new OnboardingMinProfileUpdateRemoteConfigModel("005", "User profiling", "baseline", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigFetcherContract f5233a;
    public final CoroutineContextProvider b;
    public final ABTestAnalyticsContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/domain/FetchOnboardingMinProfileUpdateConfigUseCase$Companion;", "", "", "ONBOARDING_MIN_PROFILE_UPDATE_CONFIG_KEY", "Ljava/lang/String;", "ENABLED_VARIANT", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchOnboardingMinProfileUpdateConfigUseCase(RemoteConfigFetcherContract remoteConfigFetcherContract, CoroutineContextProvider coroutineContextProvider, ABTestAnalyticsContract aBTestAnalyticsContract) {
        this.f5233a = remoteConfigFetcherContract;
        this.b = coroutineContextProvider;
        this.c = aBTestAnalyticsContract;
    }

    public final Object a(Source source, Continuation continuation) {
        return BuildersKt.g(this.b.b(), new FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2(this, (OnboardingMinProfileUpdateRemoteConfigModel) this.f5233a.a("showMinProfileUpdateDuringOnboarding", Reflection.a(OnboardingMinProfileUpdateRemoteConfigModel.class), d), source, null), continuation);
    }
}
