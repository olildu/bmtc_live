package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2", f = "NewPremiumBusReserveTicketActivationComponent.kt", l = {916}, m = "invokeSuspend", v = 1)
final class NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NewPremiumBusReserveTicketActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = newPremiumBusReserveTicketActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            List listA = this.this$0.x.a();
            PermissionHandler permissionHandlerC = this.this$0.y.c();
            if (permissionHandlerC != null) {
                Flow flowA = permissionHandlerC.a(listA);
                final NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        List list = (List) obj2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (!PermissionStateKt.a((PermissionState) ((Pair) it.next()).e())) {
                                    AnalyticsContract.DefaultImpls.a(newPremiumBusReserveTicketActivationComponent.p, "BLE permission denied", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), null, null, false, 28);
                                    break;
                                }
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
