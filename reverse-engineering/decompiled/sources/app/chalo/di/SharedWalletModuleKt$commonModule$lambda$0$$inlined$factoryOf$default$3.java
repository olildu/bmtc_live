package app.chalo.di;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
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
public final class SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, GetBannerForWalletScreenUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(ChaloConfigFeature.class), null, null);
        Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD4 = scope.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null);
        return new GetBannerForWalletScreenUseCase((CityProvider) objD, (ChaloConfigFeature) objD2, (CrashlyticsLogger) objD3, (GetWalletStatusWithoutSyncUseCase) objD4, (GetWalletAndAllTransactionsWithoutSyncUseCase) scope.d(Reflection.a(GetWalletAndAllTransactionsWithoutSyncUseCase.class), null, null), (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null));
    }
}
