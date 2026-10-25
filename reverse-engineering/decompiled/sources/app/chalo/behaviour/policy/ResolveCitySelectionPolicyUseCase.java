package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolveCitySelectionPolicyUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveCitySelectionPolicyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PolicyConfigFetcher f1038a;
    public final PolicyResolutionContextProvider b;
    public final CitySelectionPolicyOverride c;
    public final PolicyResolverCache d;

    public ResolveCitySelectionPolicyUseCase(PolicyConfigFetcher policyConfigFetcher, PolicyResolutionContextProvider policyResolutionContextProvider, CitySelectionPolicyOverride citySelectionPolicyOverride, PolicyResolverCache policyResolverCache) {
        this.f1038a = policyConfigFetcher;
        this.b = policyResolutionContextProvider;
        this.c = citySelectionPolicyOverride;
        this.d = policyResolverCache;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        PolicyResolutionContext policyResolutionContextA = this.b.a();
        String str = policyResolutionContextA.b;
        if (str == null) {
            str = "default_no_city";
        }
        return this.d.b(str, new ResolveCitySelectionPolicyUseCase$invoke$2(this, null), new a(policyResolutionContextA, this, str, 0), continuationImpl);
    }
}
