package app.chalo.checkout.ui.screen.payment;

import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleFlowAfterRechargeIntent$1", f = "PaymentMainComponent.kt", l = {3019, 3023}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleFlowAfterRechargeIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleFlowAfterRechargeIntent$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$handleFlowAfterRechargeIntent$1 paymentMainComponent$handleFlowAfterRechargeIntent$1 = new PaymentMainComponent$handleFlowAfterRechargeIntent$1(this.this$0, continuation);
        paymentMainComponent$handleFlowAfterRechargeIntent$1.L$0 = obj;
        return paymentMainComponent$handleFlowAfterRechargeIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleFlowAfterRechargeIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PaymentMainComponent paymentMainComponent = this.this$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = paymentMainComponent.X.b(this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        WalletTypeIdentifier walletTypeIdentifier = (WalletTypeIdentifier) obj;
        if (walletTypeIdentifier == null) {
            this.this$0.l1();
            return unit;
        }
        ChaloPayManager chaloPayManager = this.this$0.x;
        this.L$0 = null;
        this.label = 2;
        return chaloPayManager.e(walletTypeIdentifier, this, false, false) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
