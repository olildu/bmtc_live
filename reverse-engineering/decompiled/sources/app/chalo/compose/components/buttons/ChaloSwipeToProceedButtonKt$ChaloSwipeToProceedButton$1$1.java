package app.chalo.compose.components.buttons;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.j3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.buttons.ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1", f = "ChaloSwipeToProceedButton.kt", l = {91}, m = "invokeSuspend", v = 1)
final class ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<ConfirmationState> $anchoredDraggableState;
    final /* synthetic */ MutableState<Boolean> $hasTriggered$delegate;
    final /* synthetic */ Function0<Unit> $onSwipe;
    final /* synthetic */ double $percentageOnWhichOnSwipeCalled;
    final /* synthetic */ float $sizePx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1(AnchoredDraggableState anchoredDraggableState, float f, double d, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$sizePx = f;
        this.$percentageOnWhichOnSwipeCalled = d;
        this.$onSwipe = function0;
        this.$hasTriggered$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1(this.$anchoredDraggableState, this.$sizePx, this.$percentageOnWhichOnSwipeCalled, this.$onSwipe, this.$hasTriggered$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new j3(this.$anchoredDraggableState, 2));
            final float f = this.$sizePx;
            final double d = this.$percentageOnWhichOnSwipeCalled;
            final Function0<Unit> function0 = this.$onSwipe;
            final AnchoredDraggableState<ConfirmationState> anchoredDraggableState = this.$anchoredDraggableState;
            final MutableState<Boolean> mutableState = this.$hasTriggered$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.compose.components.buttons.ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    float f2 = fFloatValue != 0.0f ? fFloatValue / f : 0.0f;
                    MutableState mutableState2 = mutableState;
                    if (f2 < 0.1f) {
                        mutableState2.setValue(Boolean.FALSE);
                    }
                    if (f2 >= d && !((Boolean) mutableState2.getValue()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                        function0.invoke();
                        Object objAnimateTo = AnchoredDraggableKt.animateTo(anchoredDraggableState, ConfirmationState.DEFAULT, AnimationSpecKt.tween$default(1500, 0, null, 6, null), continuation);
                        if (objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return objAnimateTo;
                        }
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
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
