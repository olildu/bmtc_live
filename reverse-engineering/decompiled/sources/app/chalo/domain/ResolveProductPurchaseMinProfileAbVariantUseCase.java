package app.chalo.domain;

import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.models.remoteconfig.ProductPurchaseMinProfileUpdateRemoteConfigModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/domain/ResolveProductPurchaseMinProfileAbVariantUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveProductPurchaseMinProfileAbVariantUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigFetcherContract f2520a;
    public final CheckIfExperimentEnabledUseCase b;
    public final CoroutineContextProvider c;
    public final ABTestAnalyticsContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/domain/ResolveProductPurchaseMinProfileAbVariantUseCase$Companion;", "", "", "PRODUCT_PURCHASE_MIN_PROFILE_UPDATE_CONFIG_KEY", "Ljava/lang/String;", "BASELINE_VARIANT", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ResolveProductPurchaseMinProfileAbVariantUseCase(RemoteConfigFetcherContract remoteConfigFetcherContract, CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase, CoroutineContextProvider coroutineContextProvider, ABTestAnalyticsContract aBTestAnalyticsContract) {
        this.f2520a = remoteConfigFetcherContract;
        this.b = checkIfExperimentEnabledUseCase;
        this.c = coroutineContextProvider;
        this.d = aBTestAnalyticsContract;
    }

    public static final ProductPurchaseMinProfileUpdateRemoteConfigModel a(ResolveProductPurchaseMinProfileAbVariantUseCase resolveProductPurchaseMinProfileAbVariantUseCase, ProductPurchaseMinProfileUpdateRemoteConfigModel productPurchaseMinProfileUpdateRemoteConfigModel) {
        resolveProductPurchaseMinProfileAbVariantUseCase.getClass();
        String expId = productPurchaseMinProfileUpdateRemoteConfigModel.f5686a;
        String expName = productPurchaseMinProfileUpdateRemoteConfigModel.b;
        Intrinsics.i(expId, "expId");
        Intrinsics.i(expName, "expName");
        return new ProductPurchaseMinProfileUpdateRemoteConfigModel(expId, expName, false, "baseline", false, false);
    }
}
