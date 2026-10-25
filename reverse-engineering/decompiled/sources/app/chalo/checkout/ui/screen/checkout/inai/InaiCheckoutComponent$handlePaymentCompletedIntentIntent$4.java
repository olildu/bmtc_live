package app.chalo.checkout.ui.screen.checkout.inai;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import defpackage.ka0;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4", f = "InaiCheckoutViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 1)
final class InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InaiCheckoutComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4(InaiCheckoutComponent inaiCheckoutComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = inaiCheckoutComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            InaiCheckoutComponent inaiCheckoutComponent = this.this$0;
            KotlinToastManager kotlinToastManager2 = inaiCheckoutComponent.q;
            ExitReasonType exitReasonType = ExitReasonType.PAYMENT_CANCELLED_BY_USER;
            this.L$0 = kotlinToastManager2;
            this.label = 1;
            obj = inaiCheckoutComponent.G0(exitReasonType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        InaiCheckoutComponent inaiCheckoutComponent2 = this.this$0;
        inaiCheckoutComponent2.q0(new ka0(inaiCheckoutComponent2, 5));
        return Unit.f17538a;
    }
}
