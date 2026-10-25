package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.domain.CheckIfMultiSeatSelectionAllowedUseCase;
import app.chalo.premiumbus.domain.FetchAggregatedSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.FetchSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.GetSeatDisplayTypeUseCase;
import app.chalo.premiumbus.domain.ProcessSeatChangeRequestUseCase;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.managers.SeatSelectionResultStateManager;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory;
import app.chalo.premiumbus.ui.seatselection.SeatToggleDecisionHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.userprofile.domain.FetchUserProfileUseCase;
import app.chalo.userprofile.domain.UpdateUserProfileUseCase;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$25 implements Function2<Scope, ParametersHolder, PremiumBusSeatSelectionComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusArgs.PremiumBusSeatSelectionArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchSeatSelectionLayoutUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchAggregatedSeatSelectionLayoutUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(PremiumBusPurchaseInfoManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(ProcessSeatChangeRequestUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(SeatSelectionResultStateManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD13 = scope.d(Reflection.a(PremiumBusDataStoreWrapper.class), null, null);
        Object objD14 = scope.d(Reflection.a(UpdateUserProfileUseCase.class), null, null);
        Object objD15 = scope.d(Reflection.a(FetchUserProfileUseCase.class), null, null);
        Object objD16 = scope.d(Reflection.a(GetSeatDisplayTypeUseCase.class), null, null);
        Object objD17 = scope.d(Reflection.a(SeatToggleDecisionHelper.class), null, null);
        return new PremiumBusSeatSelectionComponent((PremiumBusArgs.PremiumBusSeatSelectionArgs) objD, (ComponentContext) objD2, (FetchSeatSelectionLayoutUseCase) objD3, (FetchAggregatedSeatSelectionLayoutUseCase) objD4, (StringProvider) objD5, (PremiumBusPurchaseInfoManager) objD6, (ProcessSeatChangeRequestUseCase) objD7, (AnalyticsContract) objD8, (KotlinToastManager) objD9, (ChaloNavigationManager) objD10, (SeatSelectionResultStateManager) objD11, (UserProfileDetailsProvider) objD12, (PremiumBusDataStoreWrapper) objD13, (UpdateUserProfileUseCase) objD14, (FetchUserProfileUseCase) objD15, (GetSeatDisplayTypeUseCase) objD16, (SeatToggleDecisionHelper) objD17, (PremiumBusSeatSelectionUiStateFactory) scope.d(Reflection.a(PremiumBusSeatSelectionUiStateFactory.class), null, null), (CheckIfMultiSeatSelectionAllowedUseCase) scope.d(Reflection.a(CheckIfMultiSeatSelectionAllowedUseCase.class), null, null));
    }
}
