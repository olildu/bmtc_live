package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.helper.FeedbackFeature;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, ActivateProductIfRequiredUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null);
        Object objD2 = scope.d(Reflection.a(SuperPassRepository.class), null, null);
        Object objD3 = scope.d(Reflection.a(IDigitalTripReceiptFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(TicketRepository.class), null, null);
        Object objD7 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        Object objD8 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(FeedbackFeature.class), null, null);
        return new ActivateProductIfRequiredUseCase((AnalyticsContract) objD, (SuperPassRepository) objD2, (IDigitalTripReceiptFeature) objD3, (BasicInfoContract) objD4, (GetValidationProcessFlowDetailsForValidationProductUseCase) objD5, (TicketRepository) objD6, (CoroutineContextProvider) objD7, (TimeUtilsContract) objD8, (GetProductConfigFromProductIdUseCase) objD9, (FeedbackFeature) objD10, (MTicketUtilsHelper) scope.d(Reflection.a(MTicketUtilsHelper.class), null, null), (MobileTicketingConverters) scope.d(Reflection.a(MobileTicketingConverters.class), null, null));
    }
}
