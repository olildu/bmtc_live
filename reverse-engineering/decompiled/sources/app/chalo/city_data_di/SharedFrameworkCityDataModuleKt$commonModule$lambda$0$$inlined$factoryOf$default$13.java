package app.chalo.city_data_di;

import app.chalo.citydata.domain.FetchCityIdFromLatLngUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.features.language.LanguageFeature;
import app.chalo.usecase.GetDistinctIdUseCase;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13 implements Function2<Scope, ParametersHolder, FetchCityIdFromLatLngUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityDataRepository.class), null, null);
        return new FetchCityIdFromLatLngUseCase((CityDataRepository) objD, (GetDistinctIdUseCase) scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null), (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null));
    }
}
