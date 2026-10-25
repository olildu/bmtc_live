package app.chalo.di;

import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.utils.CommonContext;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.plotline.HandleCustomActionUseCase;
import app.chalo.plotline.PlotlineContractImpl;
import app.chalo.plotline.PlotlineTrackContextProvider;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedBaseModuleKt$plotline$$inlined$singleOf$1 implements Function2<Scope, ParametersHolder, PlotlineContractImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CommonContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
        Object objD6 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(Function2.class), null, null);
        Object objD8 = scope.d(Reflection.a(Function1.class), null, null);
        Object objD9 = scope.d(Reflection.a(HandleCustomActionUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(PlotlineTrackContextProvider.class), null, null);
        Object objD11 = scope.d(Reflection.a(ActiveSceneInStackResolver.class), null, null);
        return new PlotlineContractImpl((CommonContext) objD, (BasicInfoContract) objD2, (UserProfileDetailsProvider) objD3, (CityProvider) objD4, (ChaloBuildConfig) objD5, (CoroutineContextProvider) objD6, (Function2) objD7, (Function1) objD8, (HandleCustomActionUseCase) objD9, (PlotlineTrackContextProvider) objD10, (ActiveSceneInStackResolver) objD11, (ApplicationForegroundManager) scope.d(Reflection.a(ApplicationForegroundManager.class), null, null), (SdkIntegrationPolicyManager) scope.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
    }
}
