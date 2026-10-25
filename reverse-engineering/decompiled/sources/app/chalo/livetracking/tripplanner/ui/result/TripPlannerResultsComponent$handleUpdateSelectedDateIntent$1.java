package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.extensions.KotlinDateTimeExtensionsKt;
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
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1", f = "TripPlannerResultsComponent.kt", l = {696}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.UpdateSelectedDateIntent $intent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.UpdateSelectedDateIntent updateSelectedDateIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = updateSelectedDateIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        String strB;
        TimeZone timeZone;
        long jA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            strB = this.this$0.p.b();
            TimeZone.INSTANCE.getClass();
            TimeZone timeZoneA = TimeZone.Companion.a(strB);
            BasicInfoContract basicInfoContract = this.this$0.n;
            this.L$0 = strB;
            this.L$1 = timeZoneA;
            this.label = 1;
            Object objC = basicInfoContract.c(this);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            timeZone = timeZoneA;
            obj = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            timeZone = (TimeZone) this.L$1;
            strB = (String) this.L$0;
            ResultKt.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        Long l = this.$intent.f4784a;
        if (l != null) {
            TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
            long jLongValue2 = l.longValue();
            Long l2 = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
            long jLongValue3 = l2 != null ? l2.longValue() : jLongValue;
            Instant.INSTANCE.getClass();
            jA = KotlinDateTimeExtensionsKt.a(new LocalDateTime(TimeZoneKt.c(Instant.Companion.a(jLongValue2), timeZone).a(), TimeZoneKt.c(Instant.Companion.a(jLongValue3), timeZone).m()), strB);
        } else {
            jA = jLongValue;
        }
        long jMax = Math.max(jA, jLongValue);
        TripPlannerResultsComponent tripPlannerResultsComponent2 = this.this$0;
        AnalyticsContract.DefaultImpls.a(tripPlannerResultsComponent2.w, "trip planner date changed", Source.TRIP_PLANNER.getSourceName(), MapsKt.k(new Pair("dateDifferenceFromCurrentDate", tripPlannerResultsComponent2.p.n(jMax - jLongValue))), null, false, 24);
        TripPlannerResultsComponent tripPlannerResultsComponent3 = this.this$0;
        tripPlannerResultsComponent3.E0(new rl1(tripPlannerResultsComponent3, jMax, 0));
        this.this$0.W0();
        return Unit.f17538a;
    }
}
