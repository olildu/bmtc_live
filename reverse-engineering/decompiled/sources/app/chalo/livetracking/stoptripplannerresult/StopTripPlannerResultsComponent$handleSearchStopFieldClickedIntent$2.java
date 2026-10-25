package app.chalo.livetracking.stoptripplannerresult;

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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2", f = "StopTripPlannerResultsComponent.kt", l = {560, 571, 583}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopTripPlannerStopEditTarget $editTarget;
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4563a;

        static {
            int[] iArr = new int[StopTripPlannerStopEditTarget.values().length];
            try {
                iArr[StopTripPlannerStopEditTarget.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4563a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2(StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget, StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.$editTarget = stopTripPlannerStopEditTarget;
        this.this$0 = stopTripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2(this.$editTarget, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StopTripPlannerResultsComponent stopTripPlannerResultsComponent;
        StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        int i2 = WhenMappings.f4563a[this.$editTarget.ordinal()];
        if (i2 == 1) {
            StopTripPlannerLocationType stopTripPlannerLocationType = ((StopTripPlannerResultsDataState) this.this$0.f.getValue()).c;
            if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
                this.label = 1;
                if (StopTripPlannerResultsComponent.F0(this.this$0, this.$editTarget, (StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
            stopTripPlannerResultsComponent = this.this$0;
            stopTripPlannerStopEditTarget = this.$editTarget;
            this.label = 3;
            if (StopTripPlannerResultsComponent.G0(stopTripPlannerResultsComponent, stopTripPlannerStopEditTarget, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 == 2) {
            StopTripPlannerLocationType stopTripPlannerLocationType2 = ((StopTripPlannerResultsDataState) this.this$0.f.getValue()).d;
            if (stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
                this.label = 2;
                if (StopTripPlannerResultsComponent.F0(this.this$0, this.$editTarget, (StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        stopTripPlannerResultsComponent = this.this$0;
        stopTripPlannerStopEditTarget = this.$editTarget;
        this.label = 3;
        if (StopTripPlannerResultsComponent.G0(stopTripPlannerResultsComponent, stopTripPlannerStopEditTarget, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
