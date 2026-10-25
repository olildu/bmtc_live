package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.search.StopTripPlannerResultStateManager;
import app.chalo.livetracking.search.StopTripResultAction;
import app.chalo.livetracking.search.StopTripResultState;
import app.chalo.scenes.ChaloNavigationManagerKt;
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
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleOnBackPressedIntent$1", f = "StopTripPlannerResultsComponent.kt", l = {1193}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleOnBackPressedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4562a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4562a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleOnBackPressedIntent$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$handleOnBackPressedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleOnBackPressedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StopTripPlannerResultStateManager stopTripPlannerResultStateManager;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (WhenMappings.f4562a[((StopTripPlannerResultsDataState) this.this$0.f.getValue()).b.ordinal()] == 1) {
                StopTripPlannerResultsComponent stopTripPlannerResultsComponent = this.this$0;
                stopTripPlannerResultStateManager = stopTripPlannerResultsComponent.p;
                String str2 = ((StopTripPlannerResultsDataState) stopTripPlannerResultsComponent.f.getValue()).f4565a;
                BasicInfoContract basicInfoContract = this.this$0.n;
                this.L$0 = stopTripPlannerResultStateManager;
                this.L$1 = str2;
                this.label = 1;
                Object objC = basicInfoContract.c(this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
                obj = objC;
            } else {
                ChaloNavigationManagerKt.c(this.this$0.r);
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        stopTripPlannerResultStateManager = (StopTripPlannerResultStateManager) this.L$0;
        ResultKt.b(obj);
        stopTripPlannerResultStateManager.c(new StopTripResultState(((Number) obj).longValue(), StopTripResultAction.Back), str);
        ChaloNavigationManagerKt.c(this.this$0.r);
        return Unit.f17538a;
    }
}
