package app.chalo.livetracking.tripplanner.ui.details.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1", f = "TripPlannerDetailsScreen.kt", l = {105, 106, 108, 109}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $bottomSheetState;
    final /* synthetic */ State<TripPlannerDetailsState> $state$delegate;
    final /* synthetic */ BottomSheetScaffoldState $tripPlannerMainContentBottomSheetScaffoldState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1(BottomSheetScaffoldState bottomSheetScaffoldState, SheetState sheetState, State state, Continuation continuation) {
        super(2, continuation);
        this.$tripPlannerMainContentBottomSheetScaffoldState = bottomSheetScaffoldState;
        this.$bottomSheetState = sheetState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1(this.$tripPlannerMainContentBottomSheetScaffoldState, this.$bottomSheetState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsScreenKt$TripPlannerDetailsScreenMain$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SheetState sheetState;
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.b(obj);
                        BottomSheetState bottomSheetState = this.$tripPlannerMainContentBottomSheetScaffoldState.f4447a;
                        this.label = 4;
                        bottomSheetState.getClass();
                        objB = SwipeableState.b(bottomSheetState, BottomSheetValue.Expanded, this);
                        if (objB != coroutineSingletons) {
                            objB = unit;
                        }
                        if (objB != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                sheetState = this.$bottomSheetState;
                this.label = 2;
                if (sheetState.show(this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        ResultKt.b(obj);
        if (this.$state$delegate.getValue().h != null) {
            BottomSheetState bottomSheetState2 = this.$tripPlannerMainContentBottomSheetScaffoldState.f4447a;
            this.label = 1;
            bottomSheetState2.getClass();
            Object objB2 = SwipeableState.b(bottomSheetState2, BottomSheetValue.Collapsed, this);
            if (objB2 != coroutineSingletons) {
                objB2 = unit;
            }
            if (objB2 != coroutineSingletons) {
                sheetState = this.$bottomSheetState;
                this.label = 2;
                if (sheetState.show(this) != coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            SheetState sheetState2 = this.$bottomSheetState;
            this.label = 3;
            if (sheetState2.hide(this) != coroutineSingletons) {
                BottomSheetState bottomSheetState3 = this.$tripPlannerMainContentBottomSheetScaffoldState.f4447a;
                this.label = 4;
                bottomSheetState3.getClass();
                objB = SwipeableState.b(bottomSheetState3, BottomSheetValue.Expanded, this);
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB != coroutineSingletons) {
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }
}
