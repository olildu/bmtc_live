package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.constants.Source;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.rw0;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent$handleInitializationIntent$2", f = "SlotSelectionListComponent.kt", l = {148}, m = "invokeSuspend", v = 1)
final class SlotSelectionListComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotListScreenData $nearBySlots;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ SlotSelectionListComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotSelectionListComponent$handleInitializationIntent$2(SlotSelectionListComponent slotSelectionListComponent, PremiumBusSlotListScreenData premiumBusSlotListScreenData, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = slotSelectionListComponent;
        this.$nearBySlots = premiumBusSlotListScreenData;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlotSelectionListComponent$handleInitializationIntent$2(this.this$0, this.$nearBySlots, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotSelectionListComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.label = 1;
            obj = this.this$0.l.b(StringEnum.CHOOSE_PICKUP_TIME, new Object[0], this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        int i2 = 11;
        this.this$0.E0(new rw0(i2, this.$nearBySlots, (String) obj, this.$source));
        return Unit.f17538a;
    }
}
