package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.ui.unit.Density;
import defpackage.h5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {595}, m = "invokeSuspend", v = 1)
final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Dp$-velocityThreshold$0, reason: not valid java name */
    final /* synthetic */ float f128$$v$c$androidxcomposeuiunitDp$velocityThreshold$0;
    final /* synthetic */ Map<Float, Object> $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ SwipeableState<Object> $state;
    final /* synthetic */ Function2<Object, Object, ThresholdConfig> $thresholds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$3$1(SwipeableState swipeableState, Map map, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f, Continuation continuation) {
        super(2, continuation);
        this.$state = swipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$density = density;
        this.$thresholds = function2;
        this.f128$$v$c$androidxcomposeuiunitDp$velocityThreshold$0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableKt$swipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.f128$$v$c$androidxcomposeuiunitDp$velocityThreshold$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$3$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Map mapC = this.$state.c();
            SwipeableState<Object> swipeableState = this.$state;
            Map<Float, Object> map = this.$anchors;
            swipeableState.getClass();
            Intrinsics.i(map, "<set-?>");
            swipeableState.i.setValue(map);
            SwipeableState<Object> swipeableState2 = this.$state;
            swipeableState2.o.setValue(this.$resistance);
            SwipeableState<Object> swipeableState3 = this.$state;
            h5 h5Var = new h5(this.$anchors, this.$thresholds, this.$density, false, 9);
            swipeableState3.getClass();
            swipeableState3.m.setValue(h5Var);
            Density density = this.$density;
            this.$state.n.setValue(Float.valueOf(density.mo404toPx0680j_4(this.f128$$v$c$androidxcomposeuiunitDp$velocityThreshold$0)));
            SwipeableState<Object> swipeableState4 = this.$state;
            Map<Float, Object> map2 = this.$anchors;
            this.label = 1;
            if (swipeableState4.g(mapC, map2, this) == coroutineSingletons) {
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
