package app.chalo.login.di;

import app.chalo.deeplink.DefaultDeepLinkConsentManager;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
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
public final class SharedLoginModuleKt$dpdpa$$inlined$singleOf$2 implements Function2<Scope, ParametersHolder, DefaultDeepLinkConsentManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", DpdpaConsentManager.class), null, null);
        Object objD2 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        return new DefaultDeepLinkConsentManager((DpdpaConsentManager) objD, (ChaloNavigationManager) objD2, (UserConsentResultStateManager) scope.d(Reflection.a(UserConsentResultStateManager.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
    }
}
