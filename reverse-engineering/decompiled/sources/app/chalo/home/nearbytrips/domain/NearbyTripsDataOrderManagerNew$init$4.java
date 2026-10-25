package app.chalo.home.nearbytrips.domain;

import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "requestSet", "", "Lapp/chalo/livetracking/tripplanner/domain/ItineraryLiveInfoRequest;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$4", f = "NearbyTripsDataOrderManagerNew.kt", l = {}, m = "invokeSuspend", v = 1)
final class NearbyTripsDataOrderManagerNew$init$4 extends SuspendLambda implements Function2<Set<? extends ItineraryLiveInfoRequest>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NearbyTripsDataOrderManagerNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyTripsDataOrderManagerNew$init$4(NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyTripsDataOrderManagerNew;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NearbyTripsDataOrderManagerNew$init$4 nearbyTripsDataOrderManagerNew$init$4 = new NearbyTripsDataOrderManagerNew$init$4(this.this$0, continuation);
        nearbyTripsDataOrderManagerNew$init$4.L$0 = obj;
        return nearbyTripsDataOrderManagerNew$init$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NearbyTripsDataOrderManagerNew$init$4 nearbyTripsDataOrderManagerNew$init$4 = (NearbyTripsDataOrderManagerNew$init$4) create((Set) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        nearbyTripsDataOrderManagerNew$init$4.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.f3123a.c(CollectionsKt.D0((Set) this.L$0), null);
        return Unit.f17538a;
    }
}
