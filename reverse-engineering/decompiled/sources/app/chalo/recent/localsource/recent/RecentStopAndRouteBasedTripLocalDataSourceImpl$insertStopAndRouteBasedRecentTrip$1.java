package app.chalo.recent.localsource.recent;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl", f = "RecentStopAndRouteBasedTripLocalDataSourceImpl.kt", l = {22, 29}, m = "insertStopAndRouteBasedRecentTrip", v = 1)
final class RecentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentStopAndRouteBasedTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1(RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentStopAndRouteBasedTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1 recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl = this.this$0;
        recentStopAndRouteBasedTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1 = this;
        } else {
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1 = new RecentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1(recentStopAndRouteBasedTripLocalDataSourceImpl, this);
        }
        Object obj2 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 == 1) {
            RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel = (RecentStopAndRouteBasedAppModel) recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1.L$0;
            ResultKt.b(obj2);
            long jLongValue = ((Number) obj2).longValue();
            RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntityA = recentStopAndRouteBasedAppModel.a();
            String id = recentStopAndRouteBasedTripEntityA.f8943a;
            String cityId = recentStopAndRouteBasedTripEntityA.b;
            String routeId = recentStopAndRouteBasedTripEntityA.c;
            String routeName = recentStopAndRouteBasedTripEntityA.d;
            RecentAdditionalRouteInfoEntity additionRouteInfo = recentStopAndRouteBasedTripEntityA.e;
            RecentStopInfoEntity originStop = recentStopAndRouteBasedTripEntityA.f;
            RecentStopInfoEntity destinationStop = recentStopAndRouteBasedTripEntityA.g;
            ChaloTransitMode transitMode = recentStopAndRouteBasedTripEntityA.h;
            Intrinsics.i(id, "id");
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(routeName, "routeName");
            Intrinsics.i(additionRouteInfo, "additionRouteInfo");
            Intrinsics.i(originStop, "originStop");
            Intrinsics.i(destinationStop, "destinationStop");
            Intrinsics.i(transitMode, "transitMode");
            RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity = new RecentStopAndRouteBasedTripEntity(id, cityId, routeId, routeName, additionRouteInfo, originStop, destinationStop, transitMode, jLongValue, 1);
            RecentStopAndRouteBasedTripDao recentStopAndRouteBasedTripDao = recentStopAndRouteBasedTripLocalDataSourceImpl.f8974a;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1.L$0 = null;
            recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1.label = 2;
            if (recentStopAndRouteBasedTripDao.f(recentStopAndRouteBasedTripEntity, recentStopAndRouteBasedTripLocalDataSourceImpl$insertStopAndRouteBasedRecentTrip$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
        }
        return Unit.f17538a;
    }
}
