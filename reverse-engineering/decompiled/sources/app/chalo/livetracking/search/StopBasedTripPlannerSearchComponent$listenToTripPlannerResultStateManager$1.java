package app.chalo.livetracking.search;

import app.chalo.resultstatemanager.ResultStateData;
import defpackage.ab1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1", f = "StopBasedTripPlannerSearchComponent.kt", l = {565}, m = "invokeSuspend", v = 1)
final class StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4489a;

        static {
            int[] iArr = new int[StopTripResultAction.values().length];
            try {
                iArr[StopTripResultAction.Back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripResultAction.EditFrom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopTripResultAction.EditTo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4489a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedTripPlannerSearchComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent = this.this$0;
            Flow flowB = stopBasedTripPlannerSearchComponent.r.b("stop_trip_planner_result_manager_request_id");
            this.label = 1;
            obj = stopBasedTripPlannerSearchComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.f4489a[((StopTripResultState) ((ResultStateData.Success) resultStateData).f9039a).b.ordinal()];
        if (i2 == 1) {
            this.this$0.E0(new ab1(28));
        } else if (i2 == 2) {
            this.this$0.M0(StopBasedTripPlannerSearchViewIntent.OnFromLocationClick.f4493a);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.M0(StopBasedTripPlannerSearchViewIntent.OnToLocationClick.f4500a);
        }
        return unit;
    }
}
