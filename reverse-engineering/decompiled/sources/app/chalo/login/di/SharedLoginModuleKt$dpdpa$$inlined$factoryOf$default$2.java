package app.chalo.login.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.login.domain.CheckIfSkipConsentOptionAvailableUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
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
public final class SharedLoginModuleKt$dpdpa$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, CheckIfSkipConsentOptionAvailableUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", LoginRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new CheckIfSkipConsentOptionAvailableUseCase((LoginRepository) objD, (UserProfileDetailsProvider) objD2, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null));
    }
}
