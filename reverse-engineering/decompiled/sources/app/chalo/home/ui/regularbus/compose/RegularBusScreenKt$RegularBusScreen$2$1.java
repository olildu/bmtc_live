package app.chalo.home.ui.regularbus.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.State;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.compose.RegularBusScreenKt$RegularBusScreen$2$1", f = "RegularBusScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class RegularBusScreenKt$RegularBusScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isTabVisible$delegate;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ Function1<RegularBusViewIntent, Unit> $sendIntent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusScreenKt$RegularBusScreen$2$1(Function1 function1, ScrollState scrollState, State state, Continuation continuation) {
        super(2, continuation);
        this.$sendIntent = function1;
        this.$scrollState = scrollState;
        this.$isTabVisible$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusScreenKt$RegularBusScreen$2$1(this.$sendIntent, this.$scrollState, this.$isTabVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RegularBusScreenKt$RegularBusScreen$2$1 regularBusScreenKt$RegularBusScreen$2$1 = (RegularBusScreenKt$RegularBusScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        regularBusScreenKt$RegularBusScreen$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!RegularBusScreenKt.b(this.$isTabVisible$delegate)) {
            this.$sendIntent.invoke(new RegularBusViewIntent.UpdatedRetainedStateIntent(new HomeTabScreensRetainedData.RegularScreen(this.$scrollState.getValue())));
        }
        return Unit.f17538a;
    }
}
