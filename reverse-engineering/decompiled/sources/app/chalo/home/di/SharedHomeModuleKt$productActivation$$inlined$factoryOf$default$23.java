package app.chalo.home.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.productdatasync.repository.IProductDataSyncRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$23 implements Function2<Scope, ParametersHolder, AutoLinkDeviceIdUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new AutoLinkDeviceIdUseCase((BasicInfoContract) objD, (UserProfileDetailsProvider) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (IProductDataSyncRepository) scope.d(Reflection.a(IProductDataSyncRepository.class), null, null));
    }
}
