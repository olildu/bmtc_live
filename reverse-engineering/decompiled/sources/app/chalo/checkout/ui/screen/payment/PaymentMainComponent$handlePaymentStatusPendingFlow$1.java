package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.n3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handlePaymentStatusPendingFlow$1", f = "PaymentMainComponent.kt", l = {2312, 2313, 2314}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handlePaymentStatusPendingFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PaymentStatusCTAActionType> $positiveBtnAction;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handlePaymentStatusPendingFlow$1(PaymentMainComponent paymentMainComponent, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
        this.$positiveBtnAction = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$handlePaymentStatusPendingFlow$1(this.this$0, this.$positiveBtnAction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handlePaymentStatusPendingFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object objB;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.label = 1;
            obj = this.this$0.A.b(StringEnum.PAYMENT_FAILED, new Object[0], this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                str = (String) this.L$0;
                ResultKt.b(obj);
                str2 = (String) obj;
                this.L$0 = str;
                this.L$1 = str2;
                this.label = 3;
                objB = this.this$0.A.b(StringEnum.OKAY, new Object[0], this);
                if (objB != coroutineSingletons) {
                    str3 = str2;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) this.L$1;
            str = (String) this.L$0;
            ResultKt.b(obj);
            str3 = str4;
        }
        this.this$0.E0(new n3(str, str3, (String) obj, this.$positiveBtnAction, 18));
        return Unit.f17538a;
        String str5 = (String) obj;
        this.L$0 = str5;
        this.label = 2;
        Object objB2 = this.this$0.A.b(StringEnum.PAYMENT_FAILED_ERROR, new Object[0], this);
        if (objB2 != coroutineSingletons) {
            str = str5;
            obj = objB2;
            str2 = (String) obj;
            this.L$0 = str;
            this.L$1 = str2;
            this.label = 3;
            objB = this.this$0.A.b(StringEnum.OKAY, new Object[0], this);
            if (objB != coroutineSingletons) {
                str3 = str2;
                obj = objB;
                this.this$0.E0(new n3(str, str3, (String) obj, this.$positiveBtnAction, 18));
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
