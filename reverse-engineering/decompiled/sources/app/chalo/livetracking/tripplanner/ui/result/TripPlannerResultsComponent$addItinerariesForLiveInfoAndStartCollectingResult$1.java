package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1", f = "TripPlannerResultsComponent.kt", l = {993}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isFirstEmission;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1(TripPlannerResultsComponent tripPlannerResultsComponent, Ref.BooleanRef booleanRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$isFirstEmission = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1(this.this$0, this.$isFirstEmission, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
            StateFlow stateFlow = tripPlannerResultsComponent.m.l;
            final Ref.BooleanRef booleanRef = this.$isFirstEmission;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Map map;
                    List list = (List) obj2;
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    boolean z = booleanRef2.element;
                    TripPlannerResultsComponent tripPlannerResultsComponent2 = tripPlannerResultsComponent;
                    if (z) {
                        booleanRef2.element = false;
                        ArrayList arrayList = tripPlannerResultsComponent2.T;
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : list) {
                            if (((ItineraryLiveInfoResult) t).b != null) {
                                arrayList2.add(t);
                            }
                        }
                        AnalyticsContract.DefaultImpls.a(tripPlannerResultsComponent2.w, "trip planner result screen eta availability", Source.TRIP_PLANNER.getSourceName(), MapsKt.i(new Pair("itineraryCountWithEtaAvailable", Integer.valueOf(arrayList2.size())), new Pair("totalItineraries", Integer.valueOf(arrayList.size()))), null, false, 24);
                        map = tripPlannerResultsComponent2.S;
                    } else {
                        List<ItineraryLiveInfoResult> list2 = list;
                        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
                        if (iG < 16) {
                            iG = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                        for (ItineraryLiveInfoResult itineraryLiveInfoResult : list2) {
                            linkedHashMap.put(itineraryLiveInfoResult.f4701a.getF4700a(), itineraryLiveInfoResult);
                        }
                        map = linkedHashMap;
                    }
                    tripPlannerResultsComponent2.S = map;
                    Object objM0 = TripPlannerResultsComponent.M0(tripPlannerResultsComponent2, continuation);
                    return objM0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM0 : Unit.f17538a;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
