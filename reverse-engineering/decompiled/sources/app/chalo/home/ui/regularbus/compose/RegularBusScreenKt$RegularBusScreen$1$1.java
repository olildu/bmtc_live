package app.chalo.home.ui.regularbus.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.State;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.common.ScrollRestorationExtensionsKt;
import app.chalo.home.ui.regularbus.RegularBusViewState;
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
@DebugMetadata(c = "app.chalo.home.ui.regularbus.compose.RegularBusScreenKt$RegularBusScreen$1$1", f = "RegularBusScreen.kt", l = {48}, m = "invokeSuspend", v = 1)
final class RegularBusScreenKt$RegularBusScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isTabVisible$delegate;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ State<RegularBusViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusScreenKt$RegularBusScreen$1$1(ScrollState scrollState, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$isTabVisible$delegate = state;
        this.$viewState$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusScreenKt$RegularBusScreen$1$1(this.$scrollState, this.$isTabVisible$delegate, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusScreenKt$RegularBusScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        if (RegularBusScreenKt.b(this.$isTabVisible$delegate)) {
            HomeTabScreensRetainedData.RegularScreen regularScreen = this.$viewState$delegate.getValue().o;
            int i2 = regularScreen != null ? regularScreen.f3174a : 0;
            ScrollState scrollState = this.$scrollState;
            this.label = 1;
            if (ScrollRestorationExtensionsKt.b(scrollState, i2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
