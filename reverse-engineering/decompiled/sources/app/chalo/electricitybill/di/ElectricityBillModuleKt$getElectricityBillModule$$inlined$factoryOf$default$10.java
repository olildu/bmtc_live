package app.chalo.electricitybill.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
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
public final class ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$10 implements Function2<Scope, ParametersHolder, ElectricityBillPaymentHistoryComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(EBillHistoryScreenArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(EBillFetchPaymentHistoryUseCase.class), null, null);
        return new ElectricityBillPaymentHistoryComponent((ComponentContext) objD, (EBillHistoryScreenArgs) objD2, (AnalyticsContract) objD3, (EBillFetchPaymentHistoryUseCase) objD4, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
    }
}
