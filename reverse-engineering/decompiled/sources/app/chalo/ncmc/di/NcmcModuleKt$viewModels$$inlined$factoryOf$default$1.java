package app.chalo.ncmc.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailComponent;
import app.chalo.scenes.args.CardTransactionDetailArgs;
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
public final class NcmcModuleKt$viewModels$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, CardTransactionDetailComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(CardTransactionDetailArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        return new CardTransactionDetailComponent((ComponentContext) objD, (CardTransactionDetailArgs) objD2, (TimeUtilsContract) objD3, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null));
    }
}
