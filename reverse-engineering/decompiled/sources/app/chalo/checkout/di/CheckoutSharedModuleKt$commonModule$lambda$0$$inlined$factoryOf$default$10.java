package app.chalo.checkout.di;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.checkout.domain.GetAdjustEventTokenRemoteConfigUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
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
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10 implements Function2<Scope, ParametersHolder, GetAdjustEventTokenRemoteConfigUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
        Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        return new GetAdjustEventTokenRemoteConfigUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD2, (ChaloConfigFeature) objD);
    }
}
