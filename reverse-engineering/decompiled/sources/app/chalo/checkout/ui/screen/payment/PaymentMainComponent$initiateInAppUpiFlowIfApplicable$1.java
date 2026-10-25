package app.chalo.checkout.ui.screen.payment;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.juspay.JuspayController;
import app.chalo.providers.cityprovider.CityProviderKt;
import defpackage.mq0;
import defpackage.va;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1", f = "PaymentMainComponent.kt", l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 614}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1$2", f = "PaymentMainComponent.kt", l = {TypedValues.MotionType.TYPE_DRAW_PATH}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JuspayController $controller;
        int label;
        final /* synthetic */ PaymentMainComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PaymentMainComponent paymentMainComponent, JuspayController juspayController, Continuation continuation) {
            super(2, continuation);
            this.this$0 = paymentMainComponent;
            this.$controller = juspayController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$controller, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                PaymentMainComponent paymentMainComponent = this.this$0;
                JuspayController juspayController = this.$controller;
                this.label = 1;
                if (PaymentMainComponent.M0(paymentMainComponent, juspayController, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1 paymentMainComponent$initiateInAppUpiFlowIfApplicable$1 = new PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1(this.this$0, continuation);
        paymentMainComponent$initiateInAppUpiFlowIfApplicable$1.L$0 = obj;
        return paymentMainComponent$initiateInAppUpiFlowIfApplicable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$initiateInAppUpiFlowIfApplicable$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00fe A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JuspayController juspayControllerD;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            boolean zC0 = this.this$0.m.c0();
            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.t, "juspay sdk flow applicable", MapsKt.i(new Pair("isFlowApplicable", String.valueOf(zC0)), new Pair("productType", this.this$0.l.a().name()), new Pair("city", String.valueOf(CityProviderKt.b(this.this$0.v)))), 12);
            String message = "isJuspayApplicable " + zC0;
            Intrinsics.i(message, "message");
            if (zC0 && (juspayControllerD = this.this$0.R.d()) != null) {
                PaymentMainComponent paymentMainComponent = this.this$0;
                paymentMainComponent.Z = juspayControllerD;
                paymentMainComponent.E0(new mq0(6));
                BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, juspayControllerD, null), 3);
                PaymentMainComponent paymentMainComponent2 = this.this$0;
                paymentMainComponent2.getClass();
                paymentMainComponent2.E0(new va(true, 11));
                PaymentMainComponent paymentMainComponent3 = this.this$0;
                this.L$0 = juspayControllerD;
                this.label = 1;
                obj = PaymentMainComponent.K0(paymentMainComponent3, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        juspayControllerD = (JuspayController) this.L$0;
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            String strZ0 = this.this$0.Z0();
            this.L$0 = null;
            this.label = 2;
            if (juspayControllerD.c(strZ0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        PaymentMainComponent paymentMainComponent4 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        if (paymentMainComponent4.v1(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
