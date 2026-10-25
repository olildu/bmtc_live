package app.chalo.behaviour.policy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1092a;
    public final /* synthetic */ PolicyResolutionContext b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(PolicyResolutionContext policyResolutionContext, Object obj, String str, int i) {
        this.f1092a = i;
        this.b = policyResolutionContext;
        this.d = obj;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1092a) {
            case 0:
                ResolvedCitySelectionPolicy resolvedCitySelectionPolicy = (ResolvedCitySelectionPolicy) PolicyResolverHelper.b(ResolvedCitySelectionPolicy.h, (PolicyRemoteConfig) obj, this.b, ((ResolveCitySelectionPolicyUseCase) this.d).c, ResolveCitySelectionPolicyUseCase$invoke$3$1.f1039a);
                String message = "resolved city policy for key=" + this.c + " = " + resolvedCitySelectionPolicy;
                Intrinsics.i(message, "message");
                return resolvedCitySelectionPolicy;
            case 1:
                ResolvedLanguagePolicy resolvedLanguagePolicy = (ResolvedLanguagePolicy) PolicyResolverHelper.b(ResolvedLanguagePolicy.b, (PolicyRemoteConfig) obj, this.b, ((ResolveLanguagePolicyUseCase) this.d).c, ResolveLanguagePolicyUseCase$invoke$3$1.f1047a);
                String message2 = "resolved language policy for key=" + this.c + " = " + resolvedLanguagePolicy;
                Intrinsics.i(message2, "message");
                return resolvedLanguagePolicy;
            case 2:
                ProductPurchasePolicy productPurchasePolicy = (ProductPurchasePolicy) PolicyResolverHelper.b(ProductPurchasePolicy.c, (PolicyRemoteConfig) obj, this.b, ((ResolveProductPurchasePolicyUseCase) this.d).c, ResolveProductPurchasePolicyUseCase$invoke$3$1.f1053a);
                String message3 = "resolved product purchase policy for key=" + this.c + " = " + productPurchasePolicy;
                Intrinsics.i(message3, "message");
                return productPurchasePolicy;
            default:
                ResolvedSplashPolicy resolvedSplashPolicy = (ResolvedSplashPolicy) PolicyResolverHelper.b(ResolvedSplashPolicy.c, (PolicyRemoteConfig) obj, this.b, ((ResolveSplashPolicyUseCase) this.d).c, ResolveSplashPolicyUseCase$invoke$3$1.f1062a);
                String message4 = "resolved splash policy for key=" + this.c + " = " + resolvedSplashPolicy;
                Intrinsics.i(message4, "message");
                return resolvedSplashPolicy;
        }
    }
}
