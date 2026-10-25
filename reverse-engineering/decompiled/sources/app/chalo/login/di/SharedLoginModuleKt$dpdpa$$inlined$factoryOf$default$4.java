package app.chalo.login.di;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.login.domain.CheckIfSkipConsentOptionAvailableUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.userprofile.domain.LogoutUserUseCase;
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
public final class SharedLoginModuleKt$dpdpa$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, UserConsentComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserConsentScreenArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(DpdpaConsentManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(LogoutUserUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD8 = scope.d(Reflection.a(CheckIfSkipConsentOptionAvailableUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        return new UserConsentComponent((UserConsentScreenArgs) objD, (ComponentContext) objD2, (DpdpaConsentManager) objD3, (UserProfileDetailsProvider) objD4, (StringProvider) objD5, (LogoutUserUseCase) objD6, (CrashlyticsLogger) objD7, (CheckIfSkipConsentOptionAvailableUseCase) objD8, (KotlinToastManager) objD9, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (UserConsentResultStateManager) scope.d(Reflection.a(UserConsentResultStateManager.class), null, null));
    }
}
