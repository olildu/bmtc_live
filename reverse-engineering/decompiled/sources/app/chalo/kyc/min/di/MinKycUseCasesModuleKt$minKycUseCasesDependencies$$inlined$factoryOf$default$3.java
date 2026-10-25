package app.chalo.kyc.min.di;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.kyc.min.data.exceptions.ErrorMessageToStringMapper;
import app.chalo.kyc.min.data.repository.MinKycRepository;
import app.chalo.kyc.min.domain.SubmitKycUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
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
public final class MinKycUseCasesModuleKt$minKycUseCasesDependencies$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, SubmitKycUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(MinKycRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new SubmitKycUseCase((CityProvider) objD, (StringProvider) objD2, (MinKycRepository) objD3, (UserProfileDetailsProvider) objD4, (ErrorMessageToStringMapper) scope.d(Reflection.a(ErrorMessageToStringMapper.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
    }
}
