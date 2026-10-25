package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.GetCurrentCityAgencyNameUseCase;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.features.DigitalTripReceiptFeature;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
import app.chalo.tripreceipt.domain.FetchSuperPassTripHistoryDataUseCase;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$20 implements Function2<Scope, ParametersHolder, RideReceiptComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TripSummaryArgs.RideReceiptScreen.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchSuperPassBookingFromPassIdUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(FetchSuperPassTripHistoryDataUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(RunPreActivationChecksUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(ActivateProductIfRequiredUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD11 = scope.d(Reflection.a(GetCurrentCityAgencyNameUseCase.class), null, null);
        Object objD12 = scope.d(Reflection.a(DigitalTripReceiptFeature.class), null, null);
        Object objD13 = scope.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null);
        Object objD14 = scope.d(Reflection.a(SystemHelper.class), null, null);
        return new RideReceiptComponent((TripSummaryArgs.RideReceiptScreen) objD, (ComponentContext) objD2, (TimeUtilsContract) objD3, (StringProvider) objD4, (FetchSuperPassBookingFromPassIdUseCase) objD5, (FetchSuperPassTripHistoryDataUseCase) objD6, (RunPreActivationChecksUseCase) objD7, (ActivateProductIfRequiredUseCase) objD8, (GetValidationProcessFlowDetailsForValidationProductUseCase) objD9, (AnalyticsContract) objD10, (GetCurrentCityAgencyNameUseCase) objD11, (DigitalTripReceiptFeature) objD12, (ValidationSceneResolverUseCase) objD13, (SystemHelper) objD14, (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
    }
}
