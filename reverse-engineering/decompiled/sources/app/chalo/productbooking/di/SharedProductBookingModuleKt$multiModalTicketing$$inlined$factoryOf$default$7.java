package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.login.LoginAuthGuard;
import app.chalo.multimodalticket.domain.FetchGroupTicketBookingFareDetailsUseCase;
import app.chalo.multimodalticket.domain.NormalizeGroupTicketJourneyLegsUseCase;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
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
public final class SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$7 implements Function2<Scope, ParametersHolder, GroupTicketLegSelectionComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(GroupTicketLegSelectionArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(GroupTicketSelectionUIStateFactory.class), null, null);
        Object objD4 = scope.d(Reflection.a(NormalizeGroupTicketJourneyLegsUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchGroupTicketBookingFareDetailsUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(FetchCompleteProductConfigByIdWithLocalCacheUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(TicketPurchaseSceneResolverUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(ProductBookingHelper.class), null, null);
        Object objD9 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(StringProvider.class), null, null);
        return new GroupTicketLegSelectionComponent((ComponentContext) objD, (GroupTicketLegSelectionArgs) objD2, (GroupTicketSelectionUIStateFactory) objD3, (NormalizeGroupTicketJourneyLegsUseCase) objD4, (FetchGroupTicketBookingFareDetailsUseCase) objD5, (FetchCompleteProductConfigByIdWithLocalCacheUseCase) objD6, (TicketPurchaseSceneResolverUseCase) objD7, (ProductBookingHelper) objD8, (ChaloNavigationManager) objD9, (KotlinToastManager) objD10, (StringProvider) objD11, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (LoginAuthGuard) scope.d(Reflection.a(LoginAuthGuard.class), null, null));
    }
}
