package app.chalo.livetracking.tripplanner.domain;

import app.chalo.utils.KUUID;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1", f = "TripPlannerItineraryLiveInfoManager.kt", l = {127}, m = "invokeSuspend", v = 1)
final class TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $etaDurationThreshold;
    final /* synthetic */ List<ItineraryLiveInfoRequest> $requests;
    int label;
    final /* synthetic */ TripPlannerItineraryLiveInfoManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1(TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, List list, Integer num, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerItineraryLiveInfoManager;
        this.$requests = list;
        this.$etaDurationThreshold = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1(this.this$0, this.$requests, this.$etaDurationThreshold, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerItineraryLiveInfoManager$addItinerariesRequests$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager = this.this$0;
            this.label = 1;
            if (TripPlannerItineraryLiveInfoManager.a(tripPlannerItineraryLiveInfoManager, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!Intrinsics.d(((ItineraryRequestHolder) this.this$0.i.getValue()).b, this.$requests)) {
            MutableStateFlow mutableStateFlow = this.this$0.j;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, EmptyList.f17557a));
        }
        TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager2 = this.this$0;
        tripPlannerItineraryLiveInfoManager2.p = this.$etaDurationThreshold;
        MutableStateFlow mutableStateFlow2 = tripPlannerItineraryLiveInfoManager2.i;
        List<ItineraryLiveInfoRequest> list = this.$requests;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.c(value, new ItineraryRequestHolder(KUUID.a(), list)));
        return Unit.f17538a;
    }
}
