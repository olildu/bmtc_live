package app.chalo.home.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, RunPreActivationChecksUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(MTicketUtilsHelper.class), null, null);
        Object objD4 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        return new RunPreActivationChecksUseCase((GetValidationProcessFlowDetailsForValidationProductUseCase) objD, (BasicInfoContract) objD2, (MTicketUtilsHelper) objD3, (CoroutineContextProvider) objD4, (TicketRepository) scope.d(Reflection.a(TicketRepository.class), null, null), (GetProductConfigFromProductIdUseCase) scope.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null));
    }
}
