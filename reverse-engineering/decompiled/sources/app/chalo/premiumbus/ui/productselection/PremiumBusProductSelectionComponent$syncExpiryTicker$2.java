package app.chalo.premiumbus.ui.productselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PremiumBusProductSelectionComponent$syncExpiryTicker$2 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, SuspendFunction {
    public final Object a(Continuation continuation) {
        PremiumBusProductSelectionComponent premiumBusProductSelectionComponent = (PremiumBusProductSelectionComponent) this.receiver;
        Job job = premiumBusProductSelectionComponent.E;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            premiumBusProductSelectionComponent.E = BuildersKt.d(premiumBusProductSelectionComponent.j, null, null, new PremiumBusProductSelectionComponent$triggerProductsRefetchAfterRuleExpiry$1(premiumBusProductSelectionComponent, null), 3);
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Continuation) obj);
        return Unit.f17538a;
    }
}
