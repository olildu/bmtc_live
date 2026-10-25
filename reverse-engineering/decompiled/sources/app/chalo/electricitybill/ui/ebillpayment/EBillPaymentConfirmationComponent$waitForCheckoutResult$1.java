package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$waitForCheckoutResult$1", f = "EBillPaymentConfirmationComponent.kt", l = {228}, m = "invokeSuspend", v = 1)
final class EBillPaymentConfirmationComponent$waitForCheckoutResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ EBillPaymentConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillPaymentConfirmationComponent$waitForCheckoutResult$1(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eBillPaymentConfirmationComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EBillPaymentConfirmationComponent$waitForCheckoutResult$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EBillPaymentConfirmationComponent$waitForCheckoutResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = this.this$0;
            String str = this.$requestId;
            eBillPaymentConfirmationComponent.u = str;
            Flow flowB = eBillPaymentConfirmationComponent.s.b(str);
            this.label = 1;
            obj = eBillPaymentConfirmationComponent.b.v(flowB, this);
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
        if (!(resultStateData instanceof ResultStateData.Cancelled)) {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (checkoutResultState instanceof CheckoutResultState.Success) {
                this.this$0.K0(EBillPaymentConfirmationIntent.PaymentCompletedIntent.f2573a);
            } else if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent2 = this.this$0;
        eBillPaymentConfirmationComponent2.u = null;
        Job job = eBillPaymentConfirmationComponent2.v;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        return Unit.f17538a;
    }
}
