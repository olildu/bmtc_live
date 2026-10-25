package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveProductPurchasePolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ProductPurchasePolicy, ProductPurchasePolicyOverride, ProductPurchasePolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveProductPurchasePolicyUseCase$invoke$3$1 f1053a = new ResolveProductPurchasePolicyUseCase$invoke$3$1();

    public ResolveProductPurchasePolicyUseCase$invoke$3$1() {
        super(2, ProductPurchasePolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ProductPurchasePolicy;Lapp/chalo/behaviour/policy/ProductPurchasePolicyOverride;)Lapp/chalo/behaviour/policy/ProductPurchasePolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductPurchasePolicy p0 = (ProductPurchasePolicy) obj;
        ProductPurchasePolicyOverride productPurchasePolicyOverride = (ProductPurchasePolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (productPurchasePolicyOverride == null) {
            return p0;
        }
        Boolean bool = productPurchasePolicyOverride.f1027a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : p0.f1026a;
        Boolean bool2 = productPurchasePolicyOverride.b;
        return new ProductPurchasePolicy(zBooleanValue, bool2 != null ? bool2.booleanValue() : p0.b);
    }
}
