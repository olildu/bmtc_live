package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import defpackage.ej0;
import defpackage.et0;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1", f = "PremiumBusProductModificationReasonsComponent.kt", l = {250}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusProductModificationReasonsIntent.SlotClickedIntent $intent;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, PremiumBusProductModificationReasonsIntent.SlotClickedIntent slotClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$intent = slotClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (((PremiumBusProductModificationReasonsViewState) this.this$0.f.getValue()).e instanceof PremiumBusBottomSheetTypeUIState.ViewAllSlots) {
                PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent = this.this$0;
                PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel = this.$intent.b;
                String str = ((PremiumBusProductModificationReasonsViewState) premiumBusProductModificationReasonsComponent.f.getValue()).n;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.$intent.f7349a;
                this.label = 1;
                obj = premiumBusProductModificationReasonsComponent.L0(pBAvailableSlotsInfoAppModel, str, pBAvailableSlotsTripAppModel, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.this$0.E0(new et0(this.$intent, 14));
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new ej0(29, (PremiumBusBottomSheetTypeUIState.ViewAllSlots) obj, this.$intent));
        return Unit.f17538a;
    }
}
