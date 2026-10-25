package app.chalo.validationsdk.di;

import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import com.arkivanov.decompose.ComponentContext;
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
public final class SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11 implements Function2<Scope, ParametersHolder, QRValidationComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ValidationArgs.QrValidationScreenArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD5 = scope.d(Reflection.a(ProductValidationConfigProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(QRValidationLifecycleDelegate.class), null, null);
        Object objD7 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
        Object objD8 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD10 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD11 = scope.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null);
        Object objD12 = scope.d(Reflection.a(BookingHelpResultStateManager.class), null, null);
        Object objD13 = scope.d(Reflection.a(MakeTripPlannerCallUseCase.class), null, null);
        Object objD14 = scope.d(Reflection.a(ProcessTripPlannerItineraryForUiUseCase.class), null, null);
        Object objD15 = scope.d(Reflection.a(BookingHelpConfigHelper.class), null, null);
        Object objD16 = scope.d(Reflection.a(ProductsSyncContract.class), null, null);
        Object objD17 = scope.d(Reflection.a(GetProductCapabilitiesUseCase.class), null, null);
        Object objD18 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD19 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
        Object objD20 = scope.d(Reflection.a(GCMReceiver.class), null, null);
        return new QRValidationComponent((ValidationArgs.QrValidationScreenArgs) objD, (ComponentContext) objD2, (BasicInfoContract) objD3, (CrashlyticsLogger) objD4, (ProductValidationConfigProvider) objD5, (QRValidationLifecycleDelegate) objD6, (IReportProblemFeature) objD7, (ChaloNavigationManager) objD8, (StringProvider) objD9, (TimeUtilsContract) objD10, (IsNotificationPermissionGrantedUseCase) objD11, (BookingHelpResultStateManager) objD12, (MakeTripPlannerCallUseCase) objD13, (ProcessTripPlannerItineraryForUiUseCase) objD14, (BookingHelpConfigHelper) objD15, (ProductsSyncContract) objD16, (GetProductCapabilitiesUseCase) objD17, (KotlinToastManager) objD18, (PermissionHandlerProvider) objD19, (GCMReceiver) objD20, (IsBluetoothFeatureAvailableUseCase) scope.d(Reflection.a(IsBluetoothFeatureAvailableUseCase.class), null, null), (GetRegularBusProductValidationMethodUseCase) scope.d(Reflection.a(GetRegularBusProductValidationMethodUseCase.class), null, null));
    }
}
