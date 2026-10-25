package app.chalo.home.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.home.helper.HomeScreenConfigDataHelper;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
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
public final class SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, ProductActivationUIStateBuilder> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(MTicketUtilsHelper.class), null, null);
        Object objD6 = scope.d(Reflection.a(HomeScreenConfigDataHelper.class), null, null);
        return new ProductActivationUIStateBuilder((StringProvider) objD, (CurrencyFeature) objD2, (TimeUtilsContract) objD3, (BasicInfoContract) objD4, (MTicketUtilsHelper) objD5, (HomeScreenConfigDataHelper) objD6, (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (StepTicketModeBasedInfoUIStateFactory) scope.d(Reflection.a(StepTicketModeBasedInfoUIStateFactory.class), null, null));
    }
}
