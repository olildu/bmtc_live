package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultDialogType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1", f = "TripPlannerResultsComponent.kt", l = {762}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final long jLongValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContract.DefaultImpls.a(this.this$0.w, "trip planner time edit option clicked", Source.TRIP_PLANNER.getSourceName(), MapsKt.d(), null, false, 24);
            Long l = ((TripPlannerResultsState) this.this$0.f.getValue()).p;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                BasicInfoContract basicInfoContract = this.this$0.n;
                this.label = 1;
                obj = basicInfoContract.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            final int iN = this.this$0.p.N(jLongValue);
            final int iH = this.this$0.p.H(jLongValue);
            this.this$0.E0(new Function1() { // from class: ql1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TripPlannerResultsState.a((TripPlannerResultsState) obj2, null, null, null, null, false, null, false, null, null, null, null, new TripPlannerResultDialogType.TimeEditOptionDialog(iN, iH), null, null, false, Long.valueOf(jLongValue), false, false, false, false, 1013759);
                }
            });
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        jLongValue = ((Number) obj).longValue();
        final int iN2 = this.this$0.p.N(jLongValue);
        final int iH2 = this.this$0.p.H(jLongValue);
        this.this$0.E0(new Function1() { // from class: ql1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TripPlannerResultsState.a((TripPlannerResultsState) obj2, null, null, null, null, false, null, false, null, null, null, null, new TripPlannerResultDialogType.TimeEditOptionDialog(iN2, iH2), null, null, false, Long.valueOf(jLongValue), false, false, false, false, 1013759);
            }
        });
        return Unit.f17538a;
    }
}
