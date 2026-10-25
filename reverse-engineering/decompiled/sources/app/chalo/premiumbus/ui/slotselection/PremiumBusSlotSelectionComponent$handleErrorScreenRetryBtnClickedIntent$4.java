package app.chalo.premiumbus.ui.slotselection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4", f = "PremiumBusSlotSelectionComponent.kt", l = {TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PBODPairWithSlotSectionListUiModel $section;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$section = pBODPairWithSlotSectionListUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4(this.this$0, this.$section, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleErrorScreenRetryBtnClickedIntent$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
            this.label = 1;
            obj = PremiumBusSlotSelectionComponent.J0(premiumBusSlotSelectionComponent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!((List) obj).isEmpty()) {
            this.this$0.V0(this.$section);
        }
        return Unit.f17538a;
    }
}
