package app.chalo.ncmc.di;

import app.chalo.ncmc.domain.FetchChaloCardTransactionsUseCase;
import app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.providers.cityprovider.CityProvider;
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
public final class NcmcModuleKt$ncmcUseCaseFactory$$inlined$factoryOf$default$19 implements Function2<Scope, ParametersHolder, FetchChaloCardTransactionsUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", INcmcCardRepository.class), null, null);
        return new FetchChaloCardTransactionsUseCase((INcmcCardRepository) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (GetChaloCardExpOptionsUseCase) scope.d(Reflection.a(GetChaloCardExpOptionsUseCase.class), null, null));
    }
}
