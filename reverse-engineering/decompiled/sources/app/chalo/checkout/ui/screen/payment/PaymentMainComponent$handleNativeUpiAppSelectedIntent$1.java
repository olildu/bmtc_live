package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.utility.InstalledUpiAppsHelper;
import app.chalo.checkout.utility.UpiAppResult;
import app.chalo.checkout.utility.UpiIntentData;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.xm0;
import defpackage.xs;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleNativeUpiAppSelectedIntent$1", f = "PaymentMainComponent.kt", l = {2034, 2044}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleNativeUpiAppSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem $intent;
    final /* synthetic */ UpiIntentData $upiIntentData;
    Object L$0;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleNativeUpiAppSelectedIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "upiResult", "Lapp/chalo/checkout/utility/UpiAppResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleNativeUpiAppSelectedIntent$1$1", f = "PaymentMainComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<UpiAppResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaymentMainComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = paymentMainComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((UpiAppResult) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.this$0.s1(new PaymentViewIntent.HandleNativeUpiAppResultIntent((UpiAppResult) this.L$0));
            Job job = this.this$0.h0;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleNativeUpiAppSelectedIntent$1(PaymentMainComponent paymentMainComponent, CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem, UpiIntentData upiIntentData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
        this.$intent = uPIIntentPaymentItem;
        this.$upiIntentData = upiIntentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$handleNativeUpiAppSelectedIntent$1(this.this$0, this.$intent, this.$upiIntentData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleNativeUpiAppSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            InstalledUpiAppsHelper installedUpiAppsHelperB = this.this$0.F.b();
            ChaloUseCaseResult.Success successA = installedUpiAppsHelperB != null ? installedUpiAppsHelperB.a(this.$intent.c, this.$upiIntentData, new xm0(this.this$0, 2)) : null;
            if (xs.z(successA)) {
                PaymentMainComponent paymentMainComponent = this.this$0;
                Flow flow = (Flow) successA.f10419a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(paymentMainComponent, null);
                this.label = 1;
                if (paymentMainComponent.o0(flow, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (successA != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            KotlinToastManager kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager, (String) obj);
            Job job = this.this$0.h0;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
        }
        return Unit.f17538a;
    }
}
