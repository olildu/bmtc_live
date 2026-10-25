package app.chalo.checkout.ui.screen.checkout.customurl;

import androidx.compose.runtime.ComposerImplKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.ti;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent$processIntent$7", f = "CustomUrlCheckoutComponent.kt", l = {ComposerImplKt.nodeKey}, m = "invokeSuspend", v = 1)
final class CustomUrlCheckoutComponent$processIntent$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CustomUrlCheckoutComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomUrlCheckoutComponent$processIntent$7(CustomUrlCheckoutComponent customUrlCheckoutComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = customUrlCheckoutComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomUrlCheckoutComponent$processIntent$7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CustomUrlCheckoutComponent$processIntent$7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CustomUrlCheckoutComponent customUrlCheckoutComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CustomUrlCheckoutComponent customUrlCheckoutComponent2 = this.this$0;
            this.L$0 = customUrlCheckoutComponent2;
            this.label = 1;
            Object objB = customUrlCheckoutComponent2.p.b(StringEnum.CHECKOUT_PAYMENT_CANCELLED, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            customUrlCheckoutComponent = customUrlCheckoutComponent2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customUrlCheckoutComponent = (CustomUrlCheckoutComponent) this.L$0;
            ResultKt.b(obj);
        }
        customUrlCheckoutComponent.getClass();
        customUrlCheckoutComponent.q0(new ti(25, customUrlCheckoutComponent, (String) obj));
        return Unit.f17538a;
    }
}
