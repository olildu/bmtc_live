package app.chalo.behaviour.policy;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1093a;
    public final /* synthetic */ PolicyResolutionContext b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(PolicyResolutionContext policyResolutionContext, Object obj, int i) {
        this.f1093a = i;
        this.b = policyResolutionContext;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1093a) {
            case 0:
                JuspayPolicyOverride juspayPolicyOverride = ((ResolveJuspayPolicyUseCase) this.c).c;
                ResolveJuspayPolicyUseCase$invoke$3$1 resolveJuspayPolicyUseCase$invoke$3$1 = ResolveJuspayPolicyUseCase$invoke$3$1.f1042a;
                return (JuspayPolicy) PolicyResolverHelper.b(JuspayPolicy.b, (PolicyRemoteConfig) obj, this.b, juspayPolicyOverride, resolveJuspayPolicyUseCase$invoke$3$1);
            case 1:
                LocationPermissionPolicyOverride locationPermissionPolicyOverride = ((ResolveLocationPermissionPolicyUseCase) this.c).c;
                ResolveLocationPermissionPolicyUseCase$invoke$3$1 resolveLocationPermissionPolicyUseCase$invoke$3$1 = ResolveLocationPermissionPolicyUseCase$invoke$3$1.f1050a;
                return (LocationPermissionPolicy) PolicyResolverHelper.b(LocationPermissionPolicy.b, (PolicyRemoteConfig) obj, this.b, locationPermissionPolicyOverride, resolveLocationPermissionPolicyUseCase$invoke$3$1);
            case 2:
                ProfilePolicyOverride profilePolicyOverride = ((ResolveProfilePolicyUseCase) this.c).c;
                ResolveProfilePolicyUseCase$invoke$3$1 resolveProfilePolicyUseCase$invoke$3$1 = ResolveProfilePolicyUseCase$invoke$3$1.f1056a;
                return (ProfilePolicy) PolicyResolverHelper.b(ProfilePolicy.h, (PolicyRemoteConfig) obj, this.b, profilePolicyOverride, resolveProfilePolicyUseCase$invoke$3$1);
            case 3:
                ResourceUrlPolicyOverride resourceUrlPolicyOverride = ((ResolveResourceUrlPolicyUseCase) this.c).c;
                ResolveResourceUrlPolicyUseCase$invoke$3$1 resolveResourceUrlPolicyUseCase$invoke$3$1 = ResolveResourceUrlPolicyUseCase$invoke$3$1.f1059a;
                return (ResolvedResourceUrlPolicy) PolicyResolverHelper.b(ResolvedResourceUrlPolicy.d, (PolicyRemoteConfig) obj, this.b, resourceUrlPolicyOverride, resolveResourceUrlPolicyUseCase$invoke$3$1);
            case 4:
                ResolveSupportPolicyUseCase resolveSupportPolicyUseCase = (ResolveSupportPolicyUseCase) this.c;
                return (ResolvedSupportPolicy) PolicyResolverHelper.b(ResolvedSupportPolicy.d, (PolicyRemoteConfig) obj, this.b, resolveSupportPolicyUseCase.c, ResolveSupportPolicyUseCase$invoke$3$1.f1065a);
            default:
                WalletPolicyOverride walletPolicyOverride = ((ResolveWalletPolicyUseCase) this.c).c;
                ResolveWalletPolicyUseCase$invoke$3$1 resolveWalletPolicyUseCase$invoke$3$1 = ResolveWalletPolicyUseCase$invoke$3$1.f1068a;
                return (WalletPolicy) PolicyResolverHelper.b(WalletPolicy.b, (PolicyRemoteConfig) obj, this.b, walletPolicyOverride, resolveWalletPolicyUseCase$invoke$3$1);
        }
    }
}
