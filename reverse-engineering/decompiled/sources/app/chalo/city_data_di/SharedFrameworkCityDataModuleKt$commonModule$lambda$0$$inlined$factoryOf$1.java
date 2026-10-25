package app.chalo.city_data_di;

import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSourceImpl;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 implements Function2<Scope, ParametersHolder, StopTripDetailsRemoteDataSourceImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null);
        return new StopTripDetailsRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (ChaloUrlProvider) scope.d(Reflection.a(ChaloUrlProvider.class), null, null));
    }
}
