package app.chalo.validationsdk.di;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase;
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
public final class SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
        Object objD2 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
        Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase((ChaloBuildConfig) objD2, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloConfigFeature) objD, (CityProvider) objD3);
    }
}
