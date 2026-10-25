package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap;

import androidx.compose.material3.SheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsSideEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1", f = "RouteDetailsMainScreen.kt", l = {67}, m = "invokeSuspend", v = 1)
final class RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomSheetScaffoldState $bottomSheetScaffoldState;
    final /* synthetic */ RouteDetailsComponent $component;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SheetState $livePassengerIndicatorModalBottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1(RouteDetailsComponent routeDetailsComponent, CoroutineScope coroutineScope, BottomSheetScaffoldState bottomSheetScaffoldState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$component = routeDetailsComponent;
        this.$coroutineScope = coroutineScope;
        this.$bottomSheetScaffoldState = bottomSheetScaffoldState;
        this.$livePassengerIndicatorModalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1(this.$component, this.$coroutineScope, this.$bottomSheetScaffoldState, this.$livePassengerIndicatorModalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final BottomSheetScaffoldState bottomSheetScaffoldState = this.$bottomSheetScaffoldState;
            final SheetState sheetState = this.$livePassengerIndicatorModalBottomSheetState;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RouteDetailsSideEffect routeDetailsSideEffect = (RouteDetailsSideEffect) obj2;
                    if (!Intrinsics.d(routeDetailsSideEffect, RouteDetailsSideEffect.HandleLocationPermission.f4872a) && !(routeDetailsSideEffect instanceof RouteDetailsSideEffect.StartCheckin)) {
                        boolean zD = Intrinsics.d(routeDetailsSideEffect, RouteDetailsSideEffect.ShowLiveSeatAvailabilityBottomSheet.f4874a);
                        CoroutineScope coroutineScope2 = coroutineScope;
                        SheetState sheetState2 = sheetState;
                        if (zD) {
                            BuildersKt.d(coroutineScope2, null, null, new RouteDetailsMainScreenKt$sideEffectsHandler$1(sheetState2, null), 3);
                        } else if (Intrinsics.d(routeDetailsSideEffect, RouteDetailsSideEffect.DismissLiveSeatAvailabilityBottomSheet.f4871a)) {
                            BuildersKt.d(coroutineScope2, null, null, new RouteDetailsMainScreenKt$sideEffectsHandler$2(sheetState2, null), 3);
                        } else {
                            if (!Intrinsics.d(routeDetailsSideEffect, RouteDetailsSideEffect.HideStopListBottomSheet.f4873a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            BuildersKt.d(coroutineScope2, null, null, new RouteDetailsMainScreenKt$sideEffectsHandler$3(bottomSheetScaffoldState, null), 3);
                        }
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
