package app.chalo.electricitybill.di;

import app.chalo.electricitybill.data.repository.ElectricityBillRepository;
import app.chalo.electricitybill.domain.EBillCreateOrderUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
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
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$5 implements Function2<Scope, ParametersHolder, EBillCreateOrderUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ElectricityBillRepository.class), null, null);
        return new EBillCreateOrderUseCase((ElectricityBillRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
    }
}
