package app.chalo.login.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.login.domain.FetchDpdpaUserConsentUseCase;
import app.chalo.login.domain.UpdateUserConsentUseCase;
import app.chalo.login.manager.DpdpaConsentManagerImpl;
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
public final class SharedLoginModuleKt$dpdpa$$inlined$singleOf$1 implements Function2<Scope, ParametersHolder, DpdpaConsentManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", FetchDpdpaUserConsentUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(UpdateUserConsentUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(LoginRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        return new DpdpaConsentManagerImpl((FetchDpdpaUserConsentUseCase) objD, (UpdateUserConsentUseCase) objD2, (LoginRepository) objD3, (CrashlyticsLogger) objD4, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null));
    }
}
