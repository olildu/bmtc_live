package app.chalo.home.nearbytrips.domain;

import app.chalo.stoptripdetails.data.model.app.NearbyTripLiveInfoRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/stoptripdetails/data/model/app/NearbyTripLiveInfoRequest;", "accumulator", "value", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew$init$2", f = "NearbyTripsDataOrderManagerNew.kt", l = {}, m = "invokeSuspend", v = 1)
final class NearbyTripsDataOrderManagerNew$init$2 extends SuspendLambda implements Function3<List<? extends NearbyTripLiveInfoRequest>, Pair<? extends NearbyTripLiveInfoRequest, ? extends Boolean>, Continuation<? super List<? extends NearbyTripLiveInfoRequest>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NearbyTripsDataOrderManagerNew$init$2 nearbyTripsDataOrderManagerNew$init$2 = new NearbyTripsDataOrderManagerNew$init$2(3, (Continuation) obj3);
        nearbyTripsDataOrderManagerNew$init$2.L$0 = (List) obj;
        nearbyTripsDataOrderManagerNew$init$2.L$1 = (Pair) obj2;
        return nearbyTripsDataOrderManagerNew$init$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        Pair pair = (Pair) this.L$1;
        if (!((Boolean) pair.e()).booleanValue()) {
            return CollectionsKt.Z(list, pair.d());
        }
        return CollectionsKt.d0(pair.d(), list);
    }
}
