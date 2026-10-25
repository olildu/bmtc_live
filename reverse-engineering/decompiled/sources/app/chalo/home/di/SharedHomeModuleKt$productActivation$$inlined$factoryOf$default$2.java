package app.chalo.home.di;

import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.productactivation.domain.GetActivationProductDataUseCase;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, GetActivationProductDataUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(QuickPayRepository.class), null, null);
        Object objD3 = scope.d(Reflection.a(InstantTicketRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(TicketRepository.class), null, null);
        Object objD5 = scope.d(Reflection.a(OndcRepository.class), null, null);
        Object objD6 = scope.d(Reflection.a(MetroRepository.class), null, null);
        Object objD7 = scope.d(Reflection.a(PremiumBusRepository.class), null, null);
        return new GetActivationProductDataUseCase((SuperPassRepository) objD, (QuickPayRepository) objD2, (InstantTicketRepository) objD3, (TicketRepository) objD4, (OndcRepository) objD5, (MetroRepository) objD6, (PremiumBusRepository) objD7, (MultiModalGroupTicketRepository) scope.d(Reflection.a(MultiModalGroupTicketRepository.class), null, null), (CheckIfContinueWithBulkBookingFlowUseCase) scope.d(Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, null));
    }
}
