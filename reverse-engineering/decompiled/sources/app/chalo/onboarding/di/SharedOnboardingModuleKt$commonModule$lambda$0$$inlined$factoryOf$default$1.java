package app.chalo.onboarding.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.LanguageSelectionArgs;
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
public final class SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, LanguageSelectionComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(LanguageSelectionArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(LanguageFeature.class), null, null);
        Object objD5 = scope.d(Reflection.a(CheckIfCanLaunchHomeScreenUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(LanguagePlatformHelper.class), null, null);
        Object objD7 = scope.d(Reflection.a(SplitInstallHandler.class), null, null);
        Object objD8 = scope.d(Reflection.a(OnboardingBackgroundOperationManager.class), null, null);
        Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD10 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(HomeScreenConfigManager.class), null, null);
        return new LanguageSelectionComponent((ComponentContext) objD, (LanguageSelectionArgs) objD2, (AnalyticsContract) objD3, (LanguageFeature) objD4, (CheckIfCanLaunchHomeScreenUseCase) objD5, (LanguagePlatformHelper) objD6, (SplitInstallHandler) objD7, (OnboardingBackgroundOperationManager) objD8, (StringProvider) objD9, (ChaloNavigationManager) objD10, (HomeScreenConfigManager) objD11, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (ResolveSupportPolicyUseCase) scope.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null));
    }
}
