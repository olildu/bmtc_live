package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

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
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1", f = "BottomSheetScaffold.kt", l = {323}, m = "invokeSuspend", v = 1)
final class BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation continuation) {
        super(2, continuation);
        this.$scaffoldState = bottomSheetScaffoldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1(this.$scaffoldState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            BottomSheetState bottomSheetState = this.$scaffoldState.f4447a;
            this.label = 1;
            bottomSheetState.getClass();
            Object objB = SwipeableState.b(bottomSheetState, BottomSheetValue.Collapsed, this);
            if (objB != coroutineSingletons) {
                objB = unit;
            }
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
