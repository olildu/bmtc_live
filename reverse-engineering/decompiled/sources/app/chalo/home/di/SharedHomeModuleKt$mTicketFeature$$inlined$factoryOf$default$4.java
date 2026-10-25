package app.chalo.home.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.mticket.domain.CheckIfFreeRideAvailableUseCase;
import app.chalo.mticket.domain.FreeRideHelpUrlUseCase;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIStateFactory;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.domain.FetchFreeRideCountForUserUseCase;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.utils.SystemHelper;
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
public final class SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, MTicketTripInfoComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(TicketPurchaseArgs.MTicketTripInfoArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(CheckIfFreeRideAvailableUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchFreeRideCountForUserUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(ProductPurchaseRepository.class), null, null);
        Object objD7 = scope.d(Reflection.a(FetchProductConfigsUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD9 = scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(FreeRideHelpUrlUseCase.class), null, null);
        return new MTicketTripInfoComponent((ComponentContext) objD, (TicketPurchaseArgs.MTicketTripInfoArgs) objD2, (AnalyticsContract) objD3, (CheckIfFreeRideAvailableUseCase) objD4, (FetchFreeRideCountForUserUseCase) objD5, (ProductPurchaseRepository) objD6, (FetchProductConfigsUseCase) objD7, (StringProvider) objD8, (RouteSearchResultStateManager) objD9, (ChaloNavigationManager) objD10, (KotlinToastManager) objD11, (FreeRideHelpUrlUseCase) objD12, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (MTicketTripInfoUIStateFactory) scope.d(Reflection.a(MTicketTripInfoUIStateFactory.class), null, null));
    }
}
