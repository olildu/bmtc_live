package app.chalo.checkout.ui.screen.payment.compose;

import app.chalo.checkout.paymentprovider.inai.InaiPlatformContext;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.PaymentSideEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt$PaymentMainScreen$1$1", f = "PaymentMainScreen.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
final class PaymentMainScreenKt$PaymentMainScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMainComponent $component;
    final /* synthetic */ InaiPlatformContext $inaiContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainScreenKt$PaymentMainScreen$1$1(PaymentMainComponent paymentMainComponent, InaiPlatformContext inaiPlatformContext, Continuation continuation) {
        super(2, continuation);
        this.$component = paymentMainComponent;
        this.$inaiContext = inaiPlatformContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainScreenKt$PaymentMainScreen$1$1(this.$component, this.$inaiContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainScreenKt$PaymentMainScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final InaiPlatformContext inaiPlatformContext = this.$inaiContext;
            final PaymentMainComponent paymentMainComponent = this.$component;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt$PaymentMainScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PaymentSideEffect paymentSideEffect = (PaymentSideEffect) obj2;
                    if (!(paymentSideEffect instanceof PaymentSideEffect.InaiFetchInstalledUpiAppsSideEffect)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = "sideeffect: " + paymentSideEffect;
                    Intrinsics.i(message, "message");
                    PaymentSideEffect.InaiFetchInstalledUpiAppsSideEffect inaiFetchInstalledUpiAppsSideEffect = (PaymentSideEffect.InaiFetchInstalledUpiAppsSideEffect) paymentSideEffect;
                    inaiFetchInstalledUpiAppsSideEffect.f1547a.a(inaiFetchInstalledUpiAppsSideEffect.b, inaiPlatformContext, paymentMainComponent.k0);
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
