package app.chalo.ondc.di;

import app.chalo.contract.ProductsSyncContract;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationConfig;
import app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketValidationAnalyticManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketValidationData;
import app.chalo.ondc.validation.metro.OndcMetroTicketValidationNavigationManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketValidationReportProblemManager;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
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
public final class OndcMetroValidationModuleKt$ondcMetroValidationDependencies$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, OndcMetroTicketProductValidationConfig> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(OndcMetroTicketValidationData.class), null, null);
        Object objD3 = scope.d(Reflection.a(OndcMetroTicketProductValidationUIManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(OndcMetroTicketValidationAnalyticManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(OndcMetroTicketValidationNavigationManager.class), null, null);
        return new OndcMetroTicketProductValidationConfig((OndcRepository) objD, (OndcMetroTicketValidationData) objD2, (OndcMetroTicketProductValidationUIManager) objD3, (GetNumDigitsOfHashValueForEasyVerificationUseCase) objD4, (GenerateHashCodeForEasyVerificationUseCase) objD5, (OndcMetroTicketValidationAnalyticManager) objD6, (OndcMetroTicketValidationNavigationManager) objD7, (OndcMetroTicketValidationReportProblemManager) scope.d(Reflection.a(OndcMetroTicketValidationReportProblemManager.class), null, null), (ProductsSyncContract) scope.d(Reflection.a(ProductsSyncContract.class), null, null));
    }
}
