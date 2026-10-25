package app.chalo.recent.localsource.recent;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
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
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl", f = "RecentStopBasedTripLocalDataSourceImpl.kt", l = {22, 29}, m = "insertStopBasedTripRecent", v = 1)
final class RecentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentStopBasedTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1(RecentStopBasedTripLocalDataSourceImpl recentStopBasedTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentStopBasedTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1 recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentStopBasedTripLocalDataSourceImpl recentStopBasedTripLocalDataSourceImpl = this.this$0;
        recentStopBasedTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1 = this;
        } else {
            recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1 = new RecentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1(recentStopBasedTripLocalDataSourceImpl, this);
        }
        Object obj2 = recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 == 1) {
            RecentStopBasedTripAppModel recentStopBasedTripAppModel = (RecentStopBasedTripAppModel) recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1.L$0;
            ResultKt.b(obj2);
            long jLongValue = ((Number) obj2).longValue();
            RecentStopBasedTripEntity recentStopBasedTripEntityB = recentStopBasedTripAppModel.b();
            String stopBasedTripId = recentStopBasedTripEntityB.f8945a;
            String cityId = recentStopBasedTripEntityB.b;
            RecentStopInfoEntity originStop = recentStopBasedTripEntityB.c;
            RecentStopInfoEntity destinationStop = recentStopBasedTripEntityB.d;
            ChaloTransitMode transitMode = recentStopBasedTripEntityB.e;
            Intrinsics.i(stopBasedTripId, "stopBasedTripId");
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(originStop, "originStop");
            Intrinsics.i(destinationStop, "destinationStop");
            Intrinsics.i(transitMode, "transitMode");
            RecentStopBasedTripEntity recentStopBasedTripEntity = new RecentStopBasedTripEntity(stopBasedTripId, cityId, originStop, destinationStop, transitMode, jLongValue, 1);
            RecentStopBasedTripCityItineraryDao recentStopBasedTripCityItineraryDao = recentStopBasedTripLocalDataSourceImpl.f8977a;
            recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1.L$0 = null;
            recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1.label = 2;
            if (recentStopBasedTripCityItineraryDao.d(recentStopBasedTripEntity, recentStopBasedTripLocalDataSourceImpl$insertStopBasedTripRecent$1) == coroutineSingletons) {
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
