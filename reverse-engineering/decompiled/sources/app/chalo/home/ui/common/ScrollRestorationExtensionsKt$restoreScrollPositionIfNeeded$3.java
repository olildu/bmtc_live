package app.chalo.home.ui.common;

import androidx.compose.foundation.ScrollState;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.DESTINATION, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.common.ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3", f = "ScrollRestorationExtensions.kt", l = {44}, m = "invokeSuspend", v = 1)
final class ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollState $this_restoreScrollPositionIfNeeded;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3(ScrollState scrollState, Continuation continuation) {
        super(2, continuation);
        this.$this_restoreScrollPositionIfNeeded = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3 scrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3 = new ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3(this.$this_restoreScrollPositionIfNeeded, continuation);
        scrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3.I$0 = ((Number) obj).intValue();
        return scrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollRestorationExtensionsKt$restoreScrollPositionIfNeeded$3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = this.I$0;
            ScrollState scrollState = this.$this_restoreScrollPositionIfNeeded;
            this.label = 1;
            if (scrollState.scrollTo(i2, this) == coroutineSingletons) {
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
