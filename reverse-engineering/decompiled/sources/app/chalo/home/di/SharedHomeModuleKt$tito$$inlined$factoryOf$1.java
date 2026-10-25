package app.chalo.home.di;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetTitoTapIdForUnifiedFlowUseCase;
import app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.wallet.domain.GetQuickpayTransactionIdsForOrderIdUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
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
public final class SharedHomeModuleKt$tito$$inlined$factoryOf$1 implements Function2<Scope, ParametersHolder, TITOUnifiedFlowValidationDataManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(GetTitoTapIdForUnifiedFlowUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchTitoValidationConfigUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(GetQuickpayTransactionIdsForOrderIdUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(IDigitalTripReceiptFeature.class), null, null);
        return new TITOUnifiedFlowValidationDataManagerImpl((TITOValidationDataRepository) objD, (GetTitoTapIdForUnifiedFlowUseCase) objD2, (UserProfileDetailsProvider) objD3, (FetchTitoValidationConfigUseCase) objD4, (GetQuickpayTransactionIdsForOrderIdUseCase) objD5, (IDigitalTripReceiptFeature) objD6, (WalletSyncOrchestrator) scope.d(Reflection.a(WalletSyncOrchestrator.class), null, null), (InitiateProductHistorySyncCallUseCase) scope.d(Reflection.a(InitiateProductHistorySyncCallUseCase.class), null, null));
    }
}
