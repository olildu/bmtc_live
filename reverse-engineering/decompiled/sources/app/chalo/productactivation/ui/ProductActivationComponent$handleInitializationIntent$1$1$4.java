package app.chalo.productactivation.ui;

import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$handleInitializationIntent$1$1$4", f = "ProductActivationComponent.kt", l = {265}, m = "invokeSuspend", v = 1)
final class ProductActivationComponent$handleInitializationIntent$1$1$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductActivationIntent.InitializationIntent $this_with;
    int label;
    final /* synthetic */ ProductActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationComponent$handleInitializationIntent$1$1$4(ProductActivationComponent productActivationComponent, ProductActivationIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productActivationComponent;
        this.$this_with = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationComponent$handleInitializationIntent$1$1$4(this.this$0, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationComponent$handleInitializationIntent$1$1$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        final ProductActivationComponent productActivationComponent = this.this$0;
        String str = ((PremiumBusUpsellRideOutcome.Booked) this.$this_with.j).b;
        this.label = 1;
        Object objCollect = ((PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1) productActivationComponent.L.a(str)).collect(new FlowCollector() { // from class: app.chalo.productactivation.ui.ProductActivationComponent$startCollectingUpsellRideTicket$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                productActivationComponent.E0(new vw0((PremiumReserveTicketAppModel) obj2, 3));
                return Unit.f17538a;
            }
        }, this);
        if (objCollect != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
