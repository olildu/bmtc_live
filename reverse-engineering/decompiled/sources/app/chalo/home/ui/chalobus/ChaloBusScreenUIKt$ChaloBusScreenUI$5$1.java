package app.chalo.home.ui.chalobus;

import androidx.compose.foundation.ScrollState;
import app.chalo.home.ui.HomeTabScreensRetainedData;
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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ChaloBusScreenUI$5$1", f = "ChaloBusScreenUI.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloBusScreenUIKt$ChaloBusScreenUI$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTabVisible;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ Function1<ChaloBusViewIntent, Unit> $sendIntent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusScreenUIKt$ChaloBusScreenUI$5$1(boolean z, Function1 function1, ScrollState scrollState, Continuation continuation) {
        super(2, continuation);
        this.$isTabVisible = z;
        this.$sendIntent = function1;
        this.$scrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusScreenUIKt$ChaloBusScreenUI$5$1(this.$isTabVisible, this.$sendIntent, this.$scrollState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusScreenUIKt$ChaloBusScreenUI$5$1 chaloBusScreenUIKt$ChaloBusScreenUI$5$1 = (ChaloBusScreenUIKt$ChaloBusScreenUI$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloBusScreenUIKt$ChaloBusScreenUI$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!this.$isTabVisible) {
            this.$sendIntent.invoke(new ChaloBusViewIntent.UpdateScreenStateIntent(new HomeTabScreensRetainedData.ChaloBusScreen(this.$scrollState.getValue())));
        }
        return Unit.f17538a;
    }
}
