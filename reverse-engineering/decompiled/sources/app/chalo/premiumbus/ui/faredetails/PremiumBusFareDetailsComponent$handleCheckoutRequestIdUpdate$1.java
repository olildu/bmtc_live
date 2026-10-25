package app.chalo.premiumbus.ui.faredetails;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1", f = "PremiumBusFareDetailsComponent.kt", l = {487}, m = "invokeSuspend", v = 1)
final class PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsDelegate $delegate;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ PremiumBusFareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, String str, PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusFareDetailsComponent;
        this.$requestId = str;
        this.$delegate = premiumBusFareDetailsDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1(this.this$0, this.$requestId, this.$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = this.this$0;
            Flow flowB = premiumBusFareDetailsComponent.l.b(this.$requestId);
            this.label = 1;
            obj = premiumBusFareDetailsComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        if (resultStateData instanceof ResultStateData.Success) {
            PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate = this.this$0.r;
            PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate2 = this.$delegate;
            if (premiumBusFareDetailsDelegate == premiumBusFareDetailsDelegate2) {
                premiumBusFareDetailsDelegate2.d((CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a);
            }
        }
        if (Intrinsics.d(this.this$0.x, this.$requestId)) {
            this.this$0.x = null;
        }
        this.this$0.w.remove(this.$delegate);
        return Unit.f17538a;
    }
}
