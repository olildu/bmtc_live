package app.chalo.checkout.di;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiModelToAppModelForInaiUseCase;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForPhonePeUseCase;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForRazorpayUseCase;
import app.chalo.checkout.domain.GetPaymentMethodsUseCase;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14 implements Function2<Scope, ParametersHolder, GetPaymentMethodsUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ICheckoutRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null);
        Object objD3 = scope.d(Reflection.a(ICheckoutProductDataResolver.class), null, null);
        Object objD4 = scope.d(Reflection.a(ConvertPaymentMethodsApiToAppModelForRazorpayUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(ConvertPaymentMethodsApiModelToAppModelForInaiUseCase.class), null, null);
        return new GetPaymentMethodsUseCase((ICheckoutRepository) objD, (CheckoutPaymentDataResolver) objD2, (ICheckoutProductDataResolver) objD3, (ConvertPaymentMethodsApiToAppModelForRazorpayUseCase) objD4, (ConvertPaymentMethodsApiModelToAppModelForInaiUseCase) objD5, (ConvertPaymentMethodsApiToAppModelForPhonePeUseCase) scope.d(Reflection.a(ConvertPaymentMethodsApiToAppModelForPhonePeUseCase.class), null, null), (ICheckoutAnalyticsHelper) scope.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null));
    }
}
