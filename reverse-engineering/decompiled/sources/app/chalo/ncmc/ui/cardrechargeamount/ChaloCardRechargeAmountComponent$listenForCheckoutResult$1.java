package app.chalo.ncmc.ui.cardrechargeamount;

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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$listenForCheckoutResult$1", f = "ChaloCardRechargeAmountComponent.kt", l = {935}, m = "invokeSuspend", v = 1)
final class ChaloCardRechargeAmountComponent$listenForCheckoutResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountComponent$listenForCheckoutResult$1(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardRechargeAmountComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardRechargeAmountComponent$listenForCheckoutResult$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardRechargeAmountComponent$listenForCheckoutResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this.this$0;
            Flow flowB = chaloCardRechargeAmountComponent.y.b(this.$requestId);
            this.label = 1;
            obj = chaloCardRechargeAmountComponent.b.v(flowB, this);
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
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (!z) {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (checkoutResultState instanceof CheckoutResultState.Success) {
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent2 = this.this$0;
                BuildersKt.d(chaloCardRechargeAmountComponent2.j, null, null, new ChaloCardRechargeAmountComponent$handlePaymentCompleted$1(chaloCardRechargeAmountComponent2, ((CheckoutResultState.Success) checkoutResultState).f9055a, null), 3);
            } else if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent3 = this.this$0;
            chaloCardRechargeAmountComponent3.B = null;
            Job job = chaloCardRechargeAmountComponent3.A;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
        }
        return unit;
    }
}
