package app.chalo.premiumbus.ui.seatselection;

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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1", f = "PremiumBusSeatSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSeatSelectionFlowType $flowType;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$flowType = premiumBusSeatSelectionFlowType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1(this.this$0, this.$flowType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1 premiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1 = (PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PremiumBusSeatSelectionComponent.I0(this.this$0, this.$flowType);
        return Unit.f17538a;
    }
}
