package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolveWalletPolicyUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveWalletPolicyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PolicyResolutionContextProvider f1067a;
    public final PolicyConfigFetcher b;
    public final WalletPolicyOverride c;
    public final PolicyResolverCache d;

    public ResolveWalletPolicyUseCase(PolicyResolutionContextProvider policyResolutionContextProvider, PolicyConfigFetcher policyConfigFetcher, WalletPolicyOverride walletPolicyOverride, PolicyResolverCache policyResolverCache) {
        this.f1067a = policyResolutionContextProvider;
        this.b = policyConfigFetcher;
        this.c = walletPolicyOverride;
        this.d = policyResolverCache;
    }

    public final Object a(Continuation continuation) {
        PolicyResolutionContext policyResolutionContextA = this.f1067a.a();
        String str = policyResolutionContextA.b;
        if (str == null) {
            str = "default_no_city";
        }
        return this.d.b(str, new ResolveWalletPolicyUseCase$invoke$2(this, null), new b(policyResolutionContextA, this, 5), continuation);
    }
}
