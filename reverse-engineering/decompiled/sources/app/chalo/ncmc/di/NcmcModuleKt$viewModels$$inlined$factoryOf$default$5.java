package app.chalo.ncmc.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.ncmc.domain.CreateCardRechargeOrderUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationUseCase;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class NcmcModuleKt$viewModels$$inlined$factoryOf$default$5 implements Function2<Scope, ParametersHolder, ChaloCardRechargeAmountComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CardRechargeEnterAmountArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchChaloCardInfoToShowUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(FetchChaloCardRechargeConfigurationUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(GetMaskedCardNoFromCardNoUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD8 = scope.d(Reflection.a(GetAvailableChaloCardOptionsUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(GetLinkCardConfigUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(CreateCardRechargeOrderUseCase.class), null, null);
        Object objD11 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD12 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD13 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD14 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD15 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        return new ChaloCardRechargeAmountComponent((CardRechargeEnterAmountArgs) objD, (ComponentContext) objD2, (CurrencyFeature) objD3, (FetchChaloCardInfoToShowUseCase) objD4, (FetchChaloCardRechargeConfigurationUseCase) objD5, (GetMaskedCardNoFromCardNoUseCase) objD6, (AnalyticsContract) objD7, (GetAvailableChaloCardOptionsUseCase) objD8, (GetLinkCardConfigUseCase) objD9, (CreateCardRechargeOrderUseCase) objD10, (UserProfileDetailsProvider) objD11, (TimeUtilsContract) objD12, (StringProvider) objD13, (ChaloNavigationManager) objD14, (KotlinToastManager) objD15, (CheckoutResultStateManager) scope.d(Reflection.a(CheckoutResultStateManager.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
