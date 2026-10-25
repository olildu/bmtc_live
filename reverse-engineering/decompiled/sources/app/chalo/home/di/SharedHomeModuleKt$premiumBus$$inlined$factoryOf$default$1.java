package app.chalo.home.di;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.CancelPremiumReserveTicketUseCase;
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
public final class SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, CancelPremiumReserveTicketUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new CancelPremiumReserveTicketUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null), (FetchPremiumReserveTicketAndStoreLocallyUseCase) scope.d(Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, null));
    }
}
