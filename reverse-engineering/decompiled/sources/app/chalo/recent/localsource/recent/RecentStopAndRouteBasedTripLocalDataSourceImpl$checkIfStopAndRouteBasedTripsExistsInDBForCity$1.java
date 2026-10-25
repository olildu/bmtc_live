package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl", f = "RecentStopAndRouteBasedTripLocalDataSourceImpl.kt", l = {127}, m = "checkIfStopAndRouteBasedTripsExistsInDBForCity", v = 1)
final class RecentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentStopAndRouteBasedTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1(RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentStopAndRouteBasedTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1 recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl = this.this$0;
        recentStopAndRouteBasedTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1 = this;
        } else {
            recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1 = new RecentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1(recentStopAndRouteBasedTripLocalDataSourceImpl, this);
        }
        Object objE = recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            RecentStopAndRouteBasedTripDao recentStopAndRouteBasedTripDao = recentStopAndRouteBasedTripLocalDataSourceImpl.f8974a;
            recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1.label = 1;
            objE = recentStopAndRouteBasedTripDao.e(null, null, recentStopAndRouteBasedTripLocalDataSourceImpl$checkIfStopAndRouteBasedTripsExistsInDBForCity$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        return Boolean.valueOf(objE != null);
    }
}
