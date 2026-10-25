package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.contract.BasicInfoContract;
import defpackage.rw0;
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
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleInitializationIntent$1", f = "StopTripPlannerResultsComponent.kt", l = {407}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopTripPlannerLocationType $from;
    final /* synthetic */ StopTripPlannerResultIntent.InitializationIntent $intent;
    final /* synthetic */ StopTripPlannerLocationType $to;
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleInitializationIntent$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, StopTripPlannerResultIntent.InitializationIntent initializationIntent, StopTripPlannerLocationType stopTripPlannerLocationType, StopTripPlannerLocationType stopTripPlannerLocationType2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
        this.$intent = initializationIntent;
        this.$from = stopTripPlannerLocationType;
        this.$to = stopTripPlannerLocationType2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$handleInitializationIntent$1(this.this$0, this.$intent, this.$from, this.$to, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BasicInfoContract basicInfoContract = this.this$0.n;
            this.label = 1;
            obj = basicInfoContract.c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        this.this$0.v = new Long(jLongValue);
        this.this$0.E0(new rw0(15, this.$intent, this.$from, this.$to));
        this.this$0.M0(false);
        return Unit.f17538a;
    }
}
