package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import defpackage.sh1;
import defpackage.vo1;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1", f = "TripPlannerResultsComponent.kt", l = {832}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.QuickFilterTabClickedIntent $intent;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.QuickFilterTabClickedIntent quickFilterTabClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = quickFilterTabClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
            sh1 sh1Var = new sh1(this.$intent, 11);
            List list = TripPlannerResultsComponent.Z;
            tripPlannerResultsComponent.E0(sh1Var);
            if (this.this$0.R.get(TripPlannerResultsComponent.H0(this.this$0).b) != null) {
                TripPlannerResultsComponent tripPlannerResultsComponent2 = this.this$0;
                this.label = 1;
                if (TripPlannerResultsComponent.M0(tripPlannerResultsComponent2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.this$0.T0(new TripPlannerResultIntent.ProceedClickedIntent(true));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        AnalyticsContract.DefaultImpls.a(this.this$0.w, "trip planner quick tab clicked", Source.TRIP_PLANNER.getSourceName(), vo1.s("type", this.$intent.f4776a.f4685a), null, false, 24);
        return Unit.f17538a;
    }
}
