package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
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
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1", f = "RouteDetailsStopAndMapScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $bottomCornerCtaBottomPaddingForAdDp$delegate;
    final /* synthetic */ MutableIntState $bottomCornerCtaExtraBottomPaddingDp$delegate;
    final /* synthetic */ boolean $showBottomCornerCta;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1(boolean z, State state, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$showBottomCornerCta = z;
        this.$bottomCornerCtaBottomPaddingForAdDp$delegate = state;
        this.$bottomCornerCtaExtraBottomPaddingDp$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1(this.$showBottomCornerCta, this.$bottomCornerCtaBottomPaddingForAdDp$delegate, this.$bottomCornerCtaExtraBottomPaddingDp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1 routeDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1 = (RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        routeDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (this.$showBottomCornerCta) {
            this.$bottomCornerCtaExtraBottomPaddingDp$delegate.setIntValue(this.$bottomCornerCtaBottomPaddingForAdDp$delegate.getValue().intValue());
        }
        return Unit.f17538a;
    }
}
