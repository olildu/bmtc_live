package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1", f = "PremiumBusSlotSelectionUiState.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Integer, Integer, String, Unit> $onTimeChanged;
    final /* synthetic */ MutableState<String> $selectedAmPm$delegate;
    final /* synthetic */ MutableIntState $selectedHour$delegate;
    final /* synthetic */ MutableIntState $selectedMinute$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1(Function3 function3, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$onTimeChanged = function3;
        this.$selectedHour$delegate = mutableIntState;
        this.$selectedMinute$delegate = mutableIntState2;
        this.$selectedAmPm$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1(this.$onTimeChanged, this.$selectedHour$delegate, this.$selectedMinute$delegate, this.$selectedAmPm$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1 premiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1 = (PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.$onTimeChanged.invoke(new Integer(this.$selectedHour$delegate.getIntValue()), new Integer(this.$selectedMinute$delegate.getIntValue()), this.$selectedAmPm$delegate.getValue());
        return Unit.f17538a;
    }
}
