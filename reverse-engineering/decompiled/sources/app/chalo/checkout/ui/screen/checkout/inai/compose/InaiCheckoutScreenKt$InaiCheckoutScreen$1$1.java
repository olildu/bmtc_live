package app.chalo.checkout.ui.screen.checkout.inai.compose;

import app.chalo.checkout.paymentprovider.inai.InaiPlatformContext;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutDelegate;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutSideEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.inai.compose.InaiCheckoutScreenKt$InaiCheckoutScreen$1$1", f = "InaiCheckoutScreen.kt", l = {19}, m = "invokeSuspend", v = 1)
final class InaiCheckoutScreenKt$InaiCheckoutScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InaiCheckoutComponent $component;
    final /* synthetic */ InaiPlatformContext $inaiContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InaiCheckoutScreenKt$InaiCheckoutScreen$1$1(InaiCheckoutComponent inaiCheckoutComponent, InaiPlatformContext inaiPlatformContext, Continuation continuation) {
        super(2, continuation);
        this.$component = inaiCheckoutComponent;
        this.$inaiContext = inaiPlatformContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InaiCheckoutScreenKt$InaiCheckoutScreen$1$1(this.$component, this.$inaiContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InaiCheckoutScreenKt$InaiCheckoutScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final InaiPlatformContext inaiPlatformContext = this.$inaiContext;
            final InaiCheckoutComponent inaiCheckoutComponent = this.$component;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.checkout.inai.compose.InaiCheckoutScreenKt$InaiCheckoutScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InaiCheckoutSideEffect inaiCheckoutSideEffect = (InaiCheckoutSideEffect) obj2;
                    if (!(inaiCheckoutSideEffect instanceof InaiCheckoutSideEffect.InitiatePayment)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InaiCheckoutSideEffect.InitiatePayment initiatePayment = (InaiCheckoutSideEffect.InitiatePayment) inaiCheckoutSideEffect;
                    initiatePayment.f1473a.b(initiatePayment.c, initiatePayment.b, inaiPlatformContext, (InaiSdkCheckoutDelegate) inaiCheckoutComponent.r.getValue());
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
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
