package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModelKt;
import defpackage.xj1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleInitializationIntent$1", f = "TripPlannerDetailsComponent.kt", l = {542, 546, 547}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerDetailsIntent.InitializationIntent $intent;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleInitializationIntent$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerDetailsIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        TripPlannerDetailsComponent tripPlannerDetailsComponent;
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel;
        long j2;
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel2;
        long j3;
        TripPlannerDetailsComponent tripPlannerDetailsComponent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Job job = this.this$0.G;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            Job job2 = this.this$0.H;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            TripPlannerDetailsComponent tripPlannerDetailsComponent3 = this.this$0;
            tripPlannerDetailsComponent3.J = null;
            tripPlannerDetailsComponent3.I = null;
            tripPlannerDetailsComponent3.L = null;
            tripPlannerDetailsComponent3.M = null;
            TripPlannerDetailsIntent.InitializationIntent initializationIntent = this.$intent;
            tripPlannerDetailsComponent3.K = initializationIntent.f4732a;
            tripPlannerDetailsComponent3.P = new Long(initializationIntent.b);
            TripPlannerDetailsComponent tripPlannerDetailsComponent4 = this.this$0;
            j = tripPlannerDetailsComponent4.N + 1;
            tripPlannerDetailsComponent4.N = j;
            tripPlannerDetailsComponent4.E0(new xj1(8));
            TripPlannerDetailsComponent tripPlannerDetailsComponent5 = this.this$0;
            this.J$0 = j;
            this.label = 1;
            if (TripPlannerDetailsComponent.L0(tripPlannerDetailsComponent5, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                j2 = this.J$0;
                tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) this.L$1;
                tripPlannerDetailsComponent = (TripPlannerDetailsComponent) this.L$0;
                ResultKt.b(obj);
                this.L$0 = tripPlannerDetailsComponent;
                this.L$1 = tripPlannerItineraryAppResponseModel;
                this.J$0 = j2;
                this.label = 3;
                if (tripPlannerDetailsComponent.X0(TripPlannerPurchaseHooksUiState.Loading.f4741a, this) != coroutineSingletons) {
                    tripPlannerItineraryAppResponseModel2 = tripPlannerItineraryAppResponseModel;
                    j3 = j2;
                    tripPlannerDetailsComponent2 = tripPlannerDetailsComponent;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = this.J$0;
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel3 = (TripPlannerItineraryAppResponseModel) this.L$1;
            TripPlannerDetailsComponent tripPlannerDetailsComponent6 = (TripPlannerDetailsComponent) this.L$0;
            ResultKt.b(obj);
            j3 = j4;
            tripPlannerItineraryAppResponseModel2 = tripPlannerItineraryAppResponseModel3;
            tripPlannerDetailsComponent2 = tripPlannerDetailsComponent6;
        }
        tripPlannerDetailsComponent2.H = BuildersKt.d(tripPlannerDetailsComponent2.j, null, null, new TripPlannerDetailsComponent$handleInitializationIntent$1$2$1(tripPlannerDetailsComponent2, tripPlannerItineraryAppResponseModel2, j3, null), 3);
        this.this$0.V0();
        return Unit.f17538a;
        TripPlannerDetailsComponent tripPlannerDetailsComponent7 = this.this$0;
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel4 = tripPlannerDetailsComponent7.K;
        if (tripPlannerItineraryAppResponseModel4 != null) {
            AnalyticsContract.DefaultImpls.a(tripPlannerDetailsComponent7.l, "trip planner details page opened", Source.TRIP_PLANNER_DETAILS.getSourceName(), TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel4), null, false, 24);
            this.L$0 = tripPlannerDetailsComponent7;
            this.L$1 = tripPlannerItineraryAppResponseModel4;
            this.J$0 = j;
            this.label = 2;
            if (TripPlannerDetailsComponent.M0(tripPlannerDetailsComponent7, tripPlannerItineraryAppResponseModel4, this) != coroutineSingletons) {
                long j5 = j;
                tripPlannerDetailsComponent = tripPlannerDetailsComponent7;
                tripPlannerItineraryAppResponseModel = tripPlannerItineraryAppResponseModel4;
                j2 = j5;
                this.L$0 = tripPlannerDetailsComponent;
                this.L$1 = tripPlannerItineraryAppResponseModel;
                this.J$0 = j2;
                this.label = 3;
                if (tripPlannerDetailsComponent.X0(TripPlannerPurchaseHooksUiState.Loading.f4741a, this) != coroutineSingletons) {
                    tripPlannerItineraryAppResponseModel2 = tripPlannerItineraryAppResponseModel;
                    j3 = j2;
                    tripPlannerDetailsComponent2 = tripPlannerDetailsComponent;
                    tripPlannerDetailsComponent2.H = BuildersKt.d(tripPlannerDetailsComponent2.j, null, null, new TripPlannerDetailsComponent$handleInitializationIntent$1$2$1(tripPlannerDetailsComponent2, tripPlannerItineraryAppResponseModel2, j3, null), 3);
                }
            }
            return coroutineSingletons;
        }
        this.this$0.V0();
        return Unit.f17538a;
    }
}
