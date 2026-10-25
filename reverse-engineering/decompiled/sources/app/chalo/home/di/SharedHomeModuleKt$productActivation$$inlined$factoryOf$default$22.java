package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.productsummary.domain.PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase;
import app.chalo.productsummary.ui.pass.PassSummaryComponent;
import app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$22 implements Function2<Scope, ParametersHolder, PassSummaryComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TripSummaryArgs.PassSummaryScreen.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetRequestedBookedProductDataUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(ActivateProductIfRequiredUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD8 = scope.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(PassSummaryUIStateFactory.class), null, null);
        Object objD10 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(FetchProductInvoiceUseCase.class), null, null);
        return new PassSummaryComponent((TripSummaryArgs.PassSummaryScreen) objD, (ComponentContext) objD2, (GetRequestedBookedProductDataUseCase) objD3, (StringProvider) objD4, (ActivateProductIfRequiredUseCase) objD5, (GetValidationProcessFlowDetailsForValidationProductUseCase) objD6, (AnalyticsContract) objD7, (ValidationSceneResolverUseCase) objD8, (PassSummaryUIStateFactory) objD9, (KotlinToastManager) objD10, (ChaloNavigationManager) objD11, (FetchProductInvoiceUseCase) objD12, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase) scope.d(Reflection.a(PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase.class), null, null));
    }
}
