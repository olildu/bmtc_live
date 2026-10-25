package app.chalo.ncmc.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.ncmc.domain.ConfirmNcmcOfflineRechargeUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.PlaceNcmcOfflineRechargeAndGetOrderIdUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
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
public final class NcmcModuleKt$viewModels$$inlined$factoryOf$default$7 implements Function2<Scope, ParametersHolder, OfflineCardRechargeComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NcmcOfflineRechargeArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(LoadMoneyAmountValidationUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(GetNcmcCardAndRechargeConfigUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(GetMaskedCardNoFromCardNoUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(PlaceNcmcOfflineRechargeAndGetOrderIdUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(ConfirmNcmcOfflineRechargeUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(GenerateUvikIntentHashUseCase.class), null, null);
        Object objD11 = scope.d(Reflection.a(ProcessUvikResultUseCase.class), null, null);
        Object objD12 = scope.d(Reflection.a(UvikSdkHelper.class), null, null);
        Object objD13 = scope.d(Reflection.a(FetchChaloCardInfoToShowUseCase.class), null, null);
        Object objD14 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new OfflineCardRechargeComponent((NcmcOfflineRechargeArgs) objD, (ComponentContext) objD2, (CurrencyFeature) objD3, (LoadMoneyAmountValidationUseCase) objD4, (StringProvider) objD5, (GetNcmcCardAndRechargeConfigUseCase) objD6, (GetMaskedCardNoFromCardNoUseCase) objD7, (PlaceNcmcOfflineRechargeAndGetOrderIdUseCase) objD8, (ConfirmNcmcOfflineRechargeUseCase) objD9, (GenerateUvikIntentHashUseCase) objD10, (ProcessUvikResultUseCase) objD11, (UvikSdkHelper) objD12, (FetchChaloCardInfoToShowUseCase) objD13, (AnalyticsContract) objD14, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
