package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import defpackage.rl1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.Month;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1", f = "TripPlannerResultsComponent.kt", l = {731}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.UpdateSelectedTimeIntent $intent;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.UpdateSelectedTimeIntent updateSelectedTimeIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = updateSelectedTimeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
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
        Long l = ((TripPlannerResultsState) this.this$0.f.getValue()).p;
        long jLongValue2 = l != null ? l.longValue() : jLongValue;
        TimeZone.Companion companion = TimeZone.INSTANCE;
        String strB = this.this$0.p.b();
        companion.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a(strB);
        Instant.INSTANCE.getClass();
        LocalDate localDateA = TimeZoneKt.c(Instant.Companion.a(jLongValue2), timeZoneA).a();
        int iJ = localDateA.j();
        Month monthG = localDateA.g();
        int iC = localDateA.c();
        TripPlannerResultIntent.UpdateSelectedTimeIntent updateSelectedTimeIntent = this.$intent;
        long jMax = Math.max(TimeZoneKt.a(new LocalDateTime(iJ, monthG, iC, updateSelectedTimeIntent.f4785a, updateSelectedTimeIntent.b, 0), timeZoneA).f(), jLongValue);
        TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
        AnalyticsContract.DefaultImpls.a(tripPlannerResultsComponent.w, "trip planner time changed", Source.TRIP_PLANNER.getSourceName(), MapsKt.k(new Pair("timeDifferenceFromCurrentTime", tripPlannerResultsComponent.p.w(jMax - jLongValue))), null, false, 24);
        TripPlannerResultsComponent tripPlannerResultsComponent2 = this.this$0;
        tripPlannerResultsComponent2.E0(new rl1(tripPlannerResultsComponent2, jMax, i2));
        this.this$0.W0();
        return Unit.f17538a;
    }
}
