package app.chalo.login.di;

import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.helper.ProductDataDeletionHelper;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.userprofile.data.repository.UserProfileRepository;
import app.chalo.userprofile.domain.LogoutUserUseCase;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14 implements Function2<Scope, ParametersHolder, LogoutUserUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ClearProductStoresUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(ProductDataDeletionHelper.class), null, null);
        Object objD3 = scope.d(Reflection.a(WalletSyncHelper.class), null, null);
        Object objD4 = scope.d(Reflection.a(LoginRepository.class), null, null);
        Object objD5 = scope.d(Reflection.a(UserProfileRepository.class), null, null);
        Object objD6 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD7 = scope.d(Reflection.a(Device.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(FcmTokenFeature.class), null, null);
        return new LogoutUserUseCase((ClearProductStoresUseCase) objD, (ProductDataDeletionHelper) objD2, (WalletSyncHelper) objD3, (LoginRepository) objD4, (UserProfileRepository) objD5, (CrashlyticsLogger) objD6, (Device) objD7, (AnalyticsContract) objD8, (FcmTokenFeature) objD9, (UserProfilingHooksRuleEngine) scope.d(Reflection.a(UserProfilingHooksRuleEngine.class), null, null), (ThoughtNudgeContract) scope.d(Reflection.a(ThoughtNudgeContract.class), null, null));
    }
}
