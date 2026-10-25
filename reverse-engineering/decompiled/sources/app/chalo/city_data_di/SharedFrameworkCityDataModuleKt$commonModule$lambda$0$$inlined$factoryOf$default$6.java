package app.chalo.city_data_di;

import app.chalo.citydata.domain.FetchStopImagesUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.providers.cityprovider.CityProvider;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6 implements Function2<Scope, ParametersHolder, FetchStopImagesUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new FetchStopImagesUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null), (CityDataRepository) scope.d(Reflection.a(CityDataRepository.class), null, null));
    }
}
