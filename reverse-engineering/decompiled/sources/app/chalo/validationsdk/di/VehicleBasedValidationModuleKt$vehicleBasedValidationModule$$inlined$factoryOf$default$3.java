package app.chalo.validationsdk.di;

import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationUiStateFactory;
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
public final class VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, QRScannerValidationComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(ValidationArgs.QrScannerValidationArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(ProductValidationConfigProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(ValidateONDCTicketAndFetchReceiptUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(ProductsSyncContract.class), null, null);
        Object objD7 = scope.d(Reflection.a(QRScannerValidationUiStateFactory.class), null, null);
        return new QRScannerValidationComponent((ComponentContext) objD, (ValidationArgs.QrScannerValidationArgs) objD2, (StringProvider) objD3, (ProductValidationConfigProvider) objD4, (ValidateONDCTicketAndFetchReceiptUseCase) objD5, (ProductsSyncContract) objD6, (QRScannerValidationUiStateFactory) objD7, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (NavigationContract) scope.d(Reflection.a(NavigationContract.class), null, null));
    }
}
