package app.chalo.home.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$21 implements Function2<Scope, ParametersHolder, PassSummaryUIStateFactory> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetProductStatusUIForSummaryScreen.class), null, null);
        Object objD4 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        return new PassSummaryUIStateFactory((StringProvider) objD, (TimeUtilsContract) objD2, (GetProductStatusUIForSummaryScreen) objD3, (CurrencyFeature) objD4, (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
    }
}
