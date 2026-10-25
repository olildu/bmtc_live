package app.chalo.home.ui.common;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", TypedValues.CycleType.S_WAVE_OFFSET}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.common.ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4", f = "ScrollRestorationExtensions.kt", l = {60}, m = "invokeSuspend", v = 1)
final class ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $this_restoreLazyListPositionIfNeeded;
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4(LazyListState lazyListState, Continuation continuation) {
        super(3, continuation);
        this.$this_restoreLazyListPositionIfNeeded = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4 scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4 = new ScrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4(this.$this_restoreLazyListPositionIfNeeded, (Continuation) obj3);
        scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4.I$0 = iIntValue;
        scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4.I$1 = iIntValue2;
        return scrollRestorationExtensionsKt$restoreLazyListPositionIfNeeded$4.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = this.I$0;
            int i3 = this.I$1;
            LazyListState lazyListState = this.$this_restoreLazyListPositionIfNeeded;
            this.label = 1;
            if (lazyListState.scrollToItem(i2, i3, this) == coroutineSingletons) {
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
