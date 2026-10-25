package app.chalo.juspay;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayControllerFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspayControllerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateJusPaySDKRequestJsonUseCase f4028a;
    public final ProcessJuspayResultObjectUseCase b;
    public final BasicInfoContract c;
    public final AnalyticsContract d;
    public final CoroutineContextProvider e;
    public final CityProvider f;
    public final UserProfileDetailsProvider g;
    public final ResolveJuspayPolicyUseCase h;

    public JuspayControllerFactory(CreateJusPaySDKRequestJsonUseCase createJusPaySDKRequestJsonUseCase, ProcessJuspayResultObjectUseCase processJuspayResultObjectUseCase, BasicInfoContract basicInfoContract, AnalyticsContract analyticsContract, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, ResolveJuspayPolicyUseCase resolveJuspayPolicyUseCase) {
        this.f4028a = createJusPaySDKRequestJsonUseCase;
        this.b = processJuspayResultObjectUseCase;
        this.c = basicInfoContract;
        this.d = analyticsContract;
        this.e = coroutineContextProvider;
        this.f = cityProvider;
        this.g = userProfileDetailsProvider;
        this.h = resolveJuspayPolicyUseCase;
    }
}
