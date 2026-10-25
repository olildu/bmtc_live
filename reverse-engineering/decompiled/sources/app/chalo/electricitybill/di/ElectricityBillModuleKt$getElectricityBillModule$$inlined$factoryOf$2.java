package app.chalo.electricitybill.di;

import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper;
import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper;
import app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSourceImpl;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
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
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$2 implements Function2<Scope, ParametersHolder, ElectricityBillRemoteDataSourceImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper.class), null, null);
        return new ElectricityBillRemoteDataSourceImpl((NetworkManager) objD, (NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper) objD2, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper) scope.d(Reflection.a(NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper.class), null, null));
    }
}
