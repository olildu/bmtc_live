package app.chalo.walletframework.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSourceImpl;
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
public final class SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$7 implements Function2<Scope, ParametersHolder, WalletRemoteDataSourceImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new WalletRemoteDataSourceImpl((NetworkManager) objD, (CrashlyticsLogger) objD2, (CityProvider) objD3, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
