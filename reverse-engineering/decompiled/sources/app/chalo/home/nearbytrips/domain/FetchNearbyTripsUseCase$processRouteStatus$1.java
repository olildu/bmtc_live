package app.chalo.home.nearbytrips.domain;

import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.stoptripdetails.data.model.app.RouteStatusResponseAppModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.FetchNearbyTripsUseCase", f = "FetchNearbyTripsUseCase.kt", l = {118}, m = "processRouteStatus", v = 1)
final class FetchNearbyTripsUseCase$processRouteStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchNearbyTripsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchNearbyTripsUseCase$processRouteStatus$1(FetchNearbyTripsUseCase fetchNearbyTripsUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = fetchNearbyTripsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FetchNearbyTripsUseCase$processRouteStatus$1 fetchNearbyTripsUseCase$processRouteStatus$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        FetchNearbyTripsUseCase fetchNearbyTripsUseCase = this.this$0;
        fetchNearbyTripsUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            fetchNearbyTripsUseCase$processRouteStatus$1 = this;
        } else {
            fetchNearbyTripsUseCase$processRouteStatus$1 = new FetchNearbyTripsUseCase$processRouteStatus$1(fetchNearbyTripsUseCase, this);
        }
        Object obj2 = fetchNearbyTripsUseCase$processRouteStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyTripsUseCase$processRouteStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = (Iterator) fetchNearbyTripsUseCase$processRouteStatus$1.L$0;
        ResultKt.b(obj2);
        while (it.hasNext()) {
            RouteStatusResponseAppModel routeStatusResponseAppModel = (RouteStatusResponseAppModel) it.next();
            int i3 = FetchNearbyTripsUseCase.WhenMappings.b[routeStatusResponseAppModel.b.ordinal()];
            if (i3 == 1 || i3 == 2) {
                CityDataRepository cityDataRepository = fetchNearbyTripsUseCase.i;
                String str = routeStatusResponseAppModel.f9498a;
                fetchNearbyTripsUseCase$processRouteStatus$1.L$0 = it;
                fetchNearbyTripsUseCase$processRouteStatus$1.label = 1;
                if (cityDataRepository.m(str, fetchNearbyTripsUseCase$processRouteStatus$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f17538a;
    }
}
