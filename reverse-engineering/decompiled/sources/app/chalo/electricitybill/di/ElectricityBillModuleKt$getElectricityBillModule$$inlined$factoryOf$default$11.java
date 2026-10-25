package app.chalo.electricitybill.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.domain.EBillCreateOrderUseCase;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$11 implements Function2<Scope, ParametersHolder, EBillPaymentConfirmationComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(EBillPaymentConfirmationArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(EBillCreateOrderUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD8 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD10 = scope.d(Reflection.a(NetworkStateManager.class), null, null);
        return new EBillPaymentConfirmationComponent((ComponentContext) objD, (EBillPaymentConfirmationArgs) objD2, (ChaloNavigationManager) objD3, (AnalyticsContract) objD4, (EBillCreateOrderUseCase) objD5, (KotlinToastManager) objD6, (UserProfileDetailsProvider) objD7, (TimeUtilsContract) objD8, (StringProvider) objD9, (NetworkStateManager) objD10, (CheckoutResultStateManager) scope.d(Reflection.a(CheckoutResultStateManager.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null));
    }
}
