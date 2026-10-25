package app.chalo.walletframework.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.usecase.GetChaloTimeUseCase;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase;
import app.chalo.walletframework.wallet.domain.CheckIsWalletTimedOutUseCase;
import app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncUseCase;
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
public final class SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$6 implements Function2<Scope, ParametersHolder, WalletSyncUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", WalletRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(QuickPayRepository.class), null, null);
        Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(MergeCachedWalletAndFetchedWalletUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(GetChaloTimeUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(CheckIsWalletTimedOutUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(CheckIsWalletInAppReclaimUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new WalletSyncUseCase((WalletRepository) objD, (QuickPayRepository) objD2, (UserProfileDetailsProvider) objD3, (MergeCachedWalletAndFetchedWalletUseCase) objD4, (GetChaloTimeUseCase) objD5, (CheckIsWalletTimedOutUseCase) objD6, (CheckIsWalletInAppReclaimUseCase) objD7, (AnalyticsContract) objD8, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
