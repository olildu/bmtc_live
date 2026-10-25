package app.chalo.electricitybill.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.domain.EBillFetchUseCase;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillFetchScreenArgs;
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
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$8 implements Function2<Scope, ParametersHolder, EBillFetchComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(EBillFetchScreenArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(NetworkStateManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(EBillFetchUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        return new EBillFetchComponent((ComponentContext) objD, (EBillFetchScreenArgs) objD2, (NetworkStateManager) objD3, (EBillFetchUseCase) objD4, (ChaloNavigationManager) objD5, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
    }
}
