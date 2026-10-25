package app.chalo.domain;

import app.chalo.constants.Source;
import app.chalo.models.remoteconfig.ProductPurchaseMinProfileUpdateRemoteConfigModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecisionHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPurchaseMinProfileDecisionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MinProfileAnalyticsHelper f2519a;

    public ProductPurchaseMinProfileDecisionHelper(MinProfileAnalyticsHelper minProfileAnalyticsHelper) {
        this.f2519a = minProfileAnalyticsHelper;
    }

    public final Object a(ProductPurchaseMinProfileDecision target, Source source, Function1 function1, Function1 function2, ContinuationImpl continuationImpl) {
        Intrinsics.i(target, "target");
        Intrinsics.i(source, "source");
        ProductPurchaseMinProfileDecision.ProfileDetailsSatisfied profileDetailsSatisfied = ProductPurchaseMinProfileDecision.ProfileDetailsSatisfied.f2516a;
        boolean zEquals = target.equals(profileDetailsSatisfied);
        ProductPurchaseMinProfileDecision.NotApplicable notApplicable = ProductPurchaseMinProfileDecision.NotApplicable.f2515a;
        ProductPurchaseMinProfileDecision.RuleNotEligible ruleNotEligible = ProductPurchaseMinProfileDecision.RuleNotEligible.f2518a;
        MinProfileAnalyticsHelper minProfileAnalyticsHelper = this.f2519a;
        if (zEquals) {
            minProfileAnalyticsHelper.b(source, true, false, false, false);
        } else if (target instanceof ProductPurchaseMinProfileDecision.RequireProfileDetails) {
            ProductPurchaseMinProfileUpdateRemoteConfigModel productPurchaseMinProfileUpdateRemoteConfigModel = ((ProductPurchaseMinProfileDecision.RequireProfileDetails) target).f2517a;
            minProfileAnalyticsHelper.b(source, false, productPurchaseMinProfileUpdateRemoteConfigModel.f, productPurchaseMinProfileUpdateRemoteConfigModel.c && productPurchaseMinProfileUpdateRemoteConfigModel.e, false);
        } else {
            if (!target.equals(ruleNotEligible) && !target.equals(notApplicable)) {
                throw new NoWhenBranchMatchedException();
            }
            minProfileAnalyticsHelper.b(source, false, false, false, true);
        }
        if (!target.equals(profileDetailsSatisfied) && !target.equals(ruleNotEligible) && !target.equals(notApplicable)) {
            if (!(target instanceof ProductPurchaseMinProfileDecision.RequireProfileDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductPurchaseMinProfileUpdateRemoteConfigModel productPurchaseMinProfileUpdateRemoteConfigModel2 = ((ProductPurchaseMinProfileDecision.RequireProfileDetails) target).f2517a;
            if (productPurchaseMinProfileUpdateRemoteConfigModel2.c && productPurchaseMinProfileUpdateRemoteConfigModel2.e) {
                return CoroutineScopeKt.c(new ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2(function1, productPurchaseMinProfileUpdateRemoteConfigModel2.f, function2, null), continuationImpl);
            }
        }
        return Boolean.TRUE;
    }
}
