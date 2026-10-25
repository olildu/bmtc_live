package app.chalo.ads;

import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/FetchExitInterstitialConfigUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchExitInterstitialConfigUseCase {
    public static final ExitInterstitialAdConfig e = new ExitInterstitialAdConfig(55).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigFetcherContract f783a;
    public final CheckIfExperimentEnabledUseCase b;
    public final ABTestAnalyticsContract c;
    public final CoroutineContextProvider d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/FetchExitInterstitialConfigUseCase$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchExitInterstitialConfigUseCase(RemoteConfigFetcherContract remoteConfigFetcherContract, CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase, CoroutineContextProvider coroutineContextProvider, ABTestAnalyticsContract aBTestAnalyticsContract) {
        this.f783a = remoteConfigFetcherContract;
        this.b = checkIfExperimentEnabledUseCase;
        this.c = aBTestAnalyticsContract;
        this.d = coroutineContextProvider;
    }
}
