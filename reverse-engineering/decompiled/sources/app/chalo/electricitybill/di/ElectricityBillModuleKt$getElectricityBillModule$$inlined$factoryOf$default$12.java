package app.chalo.electricitybill.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessComponent;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillPaymentSuccessArgs;
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
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$12 implements Function2<Scope, ParametersHolder, EBillPaymentSuccessComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(EBillPaymentSuccessArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD6 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new EBillPaymentSuccessComponent((ComponentContext) objD, (EBillPaymentSuccessArgs) objD2, (StringProvider) objD3, (AnalyticsContract) objD4, (ChaloNavigationManager) objD5, (CityProvider) objD6, (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
