package app.chalo.ncmc.ui.ncmconlinerecharge;

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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent$listenForCheckoutResult$1", f = "NCMCOnlineRechargeComponent.kt", l = {378}, m = "invokeSuspend", v = 1)
final class NcmcOnlineRechargeComponent$listenForCheckoutResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ NcmcOnlineRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcmcOnlineRechargeComponent$listenForCheckoutResult$1(NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ncmcOnlineRechargeComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NcmcOnlineRechargeComponent$listenForCheckoutResult$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NcmcOnlineRechargeComponent$listenForCheckoutResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent = this.this$0;
            Flow flowB = ncmcOnlineRechargeComponent.u.b(this.$requestId);
            this.label = 1;
            obj = ncmcOnlineRechargeComponent.b.v(flowB, this);
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
        NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent2 = this.this$0;
        ncmcOnlineRechargeComponent2.x = null;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (!z) {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (checkoutResultState instanceof CheckoutResultState.Success) {
                ncmcOnlineRechargeComponent2.G0(NCMCOnlineRechargeIntent.OnlineRechargeSuccessful.f6405a);
            } else if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
            Job job = this.this$0.w;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
        }
        return unit;
    }
}
