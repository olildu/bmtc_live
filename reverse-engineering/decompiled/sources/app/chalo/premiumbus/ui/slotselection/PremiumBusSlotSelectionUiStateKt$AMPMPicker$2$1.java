package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1", f = "PremiumBusSlotSelectionUiState.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $centerItemIndex;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ boolean $isScrollInProgress;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ MutableState<Integer> $lastFocusedItem$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onFocusItem;
    final /* synthetic */ LazyListState $state;
    int label;

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1$1", f = "PremiumBusSlotSelectionUiState.kt", l = {1809}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $centerIndex;
        final /* synthetic */ LazyListState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, int i, Continuation continuation) {
            super(2, continuation);
            this.$centerIndex = i;
            this.$state = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$state, this.$centerIndex, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = this.$centerIndex - 1;
                LazyListState lazyListState = this.$state;
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(lazyListState, i2, 0, this, 2, null) == coroutineSingletons) {
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
    public PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1(boolean z, State state, int i, Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$isScrollInProgress = z;
        this.$centerItemIndex = state;
        this.$itemCount = i;
        this.$onFocusItem = function1;
        this.$coroutineScope = coroutineScope;
        this.$lastFocusedItem$delegate = mutableState;
        this.$state = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1(this.$isScrollInProgress, this.$centerItemIndex, this.$itemCount, this.$onFocusItem, this.$coroutineScope, this.$lastFocusedItem$delegate, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1 premiumBusSlotSelectionUiStateKt$AMPMPicker$2$1 = (PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusSlotSelectionUiStateKt$AMPMPicker$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!this.$isScrollInProgress && (iIntValue2 = (iIntValue = this.$centerItemIndex.getValue().intValue()) - 1) >= 0 && iIntValue2 < this.$itemCount) {
            this.$lastFocusedItem$delegate.setValue(new Integer(iIntValue2));
            this.$onFocusItem.invoke(new Integer(iIntValue2));
            BuildersKt.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$state, iIntValue, null), 3);
        }
        return Unit.f17538a;
    }
}
