package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.premiumbus.domain.FetchEligibleStopChangesUseCase;
import app.chalo.premiumbus.domain.ProcessStopChangeRequestUseCase;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$33 implements Function2<Scope, ParametersHolder, PremiumBusChangeStopComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(PremiumBusChangeStopArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchEligibleStopChangesUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(ProcessStopChangeRequestUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(TripPlannerItineraryLiveInfoManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(LiveTrackingDataManager.class), null, null);
        Object objD8 = scope.d(Reflection.a(LatLngBoundsUtils.class), null, null);
        Object objD9 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD11 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD12 = scope.d(Reflection.a(SystemHelper.class), null, null);
        return new PremiumBusChangeStopComponent((ComponentContext) objD, (PremiumBusChangeStopArgs) objD2, (FetchEligibleStopChangesUseCase) objD3, (ProcessStopChangeRequestUseCase) objD4, (FetchRouteDataFromRemoteUseCase) objD5, (TripPlannerItineraryLiveInfoManager) objD6, (LiveTrackingDataManager) objD7, (LatLngBoundsUtils) objD8, (KotlinToastManager) objD9, (StringProvider) objD10, (ChaloNavigationManager) objD11, (SystemHelper) objD12, (PremiumBusChangeStopUIStateFactory) scope.d(Reflection.a(PremiumBusChangeStopUIStateFactory.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
    }
}
