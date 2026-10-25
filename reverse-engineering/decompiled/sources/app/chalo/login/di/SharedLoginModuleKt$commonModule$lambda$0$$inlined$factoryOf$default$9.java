package app.chalo.login.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9 implements Function2<Scope, ParametersHolder, SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FcmTokenFeature.class), null, null);
        Object objD2 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(FreshchatUserInteractionContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(ThoughtNudgeContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(WalletSyncHelper.class), null, null);
        Object objD6 = scope.d(Reflection.a(ProductsSyncContract.class), null, null);
        Object objD7 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        return new SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase((FcmTokenFeature) objD, (AnalyticsContract) objD2, (FreshchatUserInteractionContract) objD3, (ThoughtNudgeContract) objD4, (WalletSyncHelper) objD5, (ProductsSyncContract) objD6, (UserProfileDetailsProvider) objD7, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (UserProfilingHooksRuleEngine) scope.d(Reflection.a(UserProfilingHooksRuleEngine.class), null, null));
    }
}
