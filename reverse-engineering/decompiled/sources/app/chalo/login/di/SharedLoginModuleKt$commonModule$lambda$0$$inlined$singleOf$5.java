package app.chalo.login.di;

import app.chalo.login.userprofiling.domain.FetchUserProfilingHooksRulesConfigUseCase;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineImpl;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$singleOf$5 implements Function2<Scope, ParametersHolder, UserProfilingHooksRuleEngineImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfilingHooksRuleEngineDataStore.class), null, null);
        return new UserProfilingHooksRuleEngineImpl((UserProfileDetailsProvider) objD, (UserProfilingHooksRuleEngineDataStore) objD2, (FetchUserProfilingHooksRulesConfigUseCase) scope.d(Reflection.a(FetchUserProfilingHooksRulesConfigUseCase.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
    }
}
