package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.v20;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1", f = "RouteDetailsMainScreen.kt", l = {115}, m = "invokeSuspend", v = 1)
final class RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $livePassengerIndicatorModalBottomSheetState;
    final /* synthetic */ MutableState<Boolean> $shouldShowLivePassengerBottomSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1(SheetState sheetState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$livePassengerIndicatorModalBottomSheetState = sheetState;
        this.$shouldShowLivePassengerBottomSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1(this.$livePassengerIndicatorModalBottomSheetState, this.$shouldShowLivePassengerBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowM = FlowKt.m(SnapshotStateKt.snapshotFlow(new v20(this.$livePassengerIndicatorModalBottomSheetState, 1)));
            final MutableState<Boolean> mutableState = this.$shouldShowLivePassengerBottomSheet$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Boolean bool = (Boolean) obj2;
                    bool.booleanValue();
                    mutableState.setValue(bool);
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowM.collect(flowCollector, this) == coroutineSingletons) {
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
