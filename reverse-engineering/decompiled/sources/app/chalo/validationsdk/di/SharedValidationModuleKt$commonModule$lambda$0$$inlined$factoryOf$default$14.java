package app.chalo.validationsdk.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchProductPunchDataForOngoingValidationOnlineUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchTitoTapinInfoForActivationUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetProductValidationDataFromDataReceivedOverBleConnectionUseCase;
import app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14 implements Function2<Scope, ParametersHolder, BleValidationProcessCompletionHelper> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(ProductValidationConfigProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetRegularBusProductValidationMethodUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchTitoTapinInfoForActivationUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchProductPunchDataForOngoingValidationOnlineUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(GetProductValidationDataFromDataReceivedOverBleConnectionUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null);
        return new BleValidationProcessCompletionHelper((CoroutineContextProvider) objD, (ProductValidationConfigProvider) objD2, (GetRegularBusProductValidationMethodUseCase) objD3, (FetchTitoTapinInfoForActivationUseCase) objD4, (FetchProductPunchDataForOngoingValidationOnlineUseCase) objD5, (GetProductValidationDataFromDataReceivedOverBleConnectionUseCase) objD6, (GetWalletSetupConfigurationUseCase) objD7, (TITOUnifiedFlowValidationDataManager) scope.d(Reflection.a(TITOUnifiedFlowValidationDataManager.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
