package app.chalo.ncmc.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationUseCase;
import app.chalo.ncmc.domain.FetchEligibleCardsUseCase;
import app.chalo.ncmc.domain.LinkChaloCardUseCase;
import app.chalo.ncmc.domain.ValidateCardNumberUseCase;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EnterCardDetailsArgs;
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
public final class NcmcModuleKt$viewModels$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, EnterCardDetailsComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", EnterCardDetailsArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchChaloCardRechargeConfigurationUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(ValidateCardNumberUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(FetchEligibleCardsUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(LinkChaloCardUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        return new EnterCardDetailsComponent((EnterCardDetailsArgs) objD, (ComponentContext) objD2, (AnalyticsContract) objD3, (FetchChaloCardRechargeConfigurationUseCase) objD4, (StringProvider) objD5, (ValidateCardNumberUseCase) objD6, (FetchEligibleCardsUseCase) objD7, (LinkChaloCardUseCase) objD8, (CrashlyticsLogger) objD9, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
