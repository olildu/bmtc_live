package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$13 implements Function2<Scope, ParametersHolder, TriggerPremiumBusBookingBookingEventsUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(AdjustManager.class), null, null);
        return new TriggerPremiumBusBookingBookingEventsUseCase((PremiumBusRepository) objD, (GetPremiumBusCurrentCityConfigUseCase) objD2, (GetPremiumReserveTicketByIdUseCase) objD3, (CityProvider) objD4, (AnalyticsContract) objD5, (AdjustManager) objD6, (PremiumBusDataStoreWrapper) scope.d(Reflection.a(PremiumBusDataStoreWrapper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
