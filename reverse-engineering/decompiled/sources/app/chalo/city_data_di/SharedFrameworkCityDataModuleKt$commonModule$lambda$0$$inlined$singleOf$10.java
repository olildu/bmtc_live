package app.chalo.city_data_di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.recent.database.repository.recent.StopRecentRepositoryImpl;
import app.chalo.recent.localsource.recent.RecentStopLocalDataStore;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$10 implements Function2<Scope, ParametersHolder, StopRecentRepositoryImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", RecentStopLocalDataStore.class), null, null);
        return new StopRecentRepositoryImpl((RecentStopLocalDataStore) objD, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetClusterConfigForCityUseCase) scope.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null));
    }
}
