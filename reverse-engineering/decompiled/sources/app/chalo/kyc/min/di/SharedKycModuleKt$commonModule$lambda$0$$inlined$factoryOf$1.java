package app.chalo.kyc.min.di;

import app.chalo.kyc.min.data.exceptions.NetworkResponseToRegisterUserApiExceptionMapper;
import app.chalo.kyc.min.data.exceptions.NetworkResponseToSubmitKycApiExceptionMapper;
import app.chalo.kyc.min.data.remote.MinKycRemoteDataSourceImpl;
import app.chalo.network.NetworkManager;
import app.chalo.providers.UserProfileDetailsProvider;
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
public final class SharedKycModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 implements Function2<Scope, ParametersHolder, MinKycRemoteDataSourceImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(NetworkResponseToRegisterUserApiExceptionMapper.class), null, null);
        return new MinKycRemoteDataSourceImpl((NetworkManager) objD, (NetworkResponseToRegisterUserApiExceptionMapper) objD2, (NetworkResponseToSubmitKycApiExceptionMapper) scope.d(Reflection.a(NetworkResponseToSubmitKycApiExceptionMapper.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
    }
}
