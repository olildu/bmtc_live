package app.chalo.kyc.min.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase;
import app.chalo.kyc.min.domain.RegisterUserUseCase;
import app.chalo.kyc.min.domain.SubmitKycUseCase;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIStateFactory;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.MinKycOtpArgs;
import app.chalo.walletframework.wallet.domain.FetchWalletStatusOnlineUseCase;
import com.arkivanov.decompose.ComponentContext;
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
public final class SharedKycModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7 implements Function2<Scope, ParametersHolder, MinKycOtpComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(MinKycOtpArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(SubmitKycUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(RegisterUserUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(CreateNoWalletStatusForKycUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(WalletSyncHelper.class), null, null);
        Object objD10 = scope.d(Reflection.a(FetchWalletStatusOnlineUseCase.class), null, null);
        Object objD11 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        return new MinKycOtpComponent((ComponentContext) objD, (MinKycOtpArgs) objD2, (StringProvider) objD3, (UserProfileDetailsProvider) objD4, (SubmitKycUseCase) objD5, (RegisterUserUseCase) objD6, (CreateNoWalletStatusForKycUseCase) objD7, (AnalyticsContract) objD8, (WalletSyncHelper) objD9, (FetchWalletStatusOnlineUseCase) objD10, (CoroutineContextProvider) objD11, (MinKycOtpUIStateFactory) scope.d(Reflection.a(MinKycOtpUIStateFactory.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
    }
}
