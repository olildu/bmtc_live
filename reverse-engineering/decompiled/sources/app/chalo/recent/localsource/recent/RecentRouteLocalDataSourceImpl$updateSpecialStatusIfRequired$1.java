package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao;
import app.chalo.recent.database.entities.RecentCityItineraryEntitiesKt;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl", f = "RecentRouteLocalDataSourceImpl.kt", l = {192, 198}, m = "updateSpecialStatusIfRequired", v = 1)
final class RecentRouteLocalDataSourceImpl$updateSpecialStatusIfRequired$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentRouteLocalDataSourceImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        RecentsSpecialStatus recentsSpecialStatus;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        RouteRecentCityItineraryDao routeRecentCityItineraryDao = this.this$0.f8968a;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = routeRecentCityItineraryDao.f(null, null, this);
            if (obj != coroutineSingletons) {
                str = null;
                str2 = null;
                recentsSpecialStatus = null;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        str = (String) this.L$2;
        str2 = (String) this.L$1;
        recentsSpecialStatus = (RecentsSpecialStatus) this.L$0;
        ResultKt.b(obj);
        RecentRouteEntity recentRouteEntity = (RecentRouteEntity) obj;
        if (recentRouteEntity != null) {
            RecentsAppModelKt.b(RecentCityItineraryEntitiesKt.a(recentRouteEntity.k), recentsSpecialStatus);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (routeRecentCityItineraryDao.m(recentsSpecialEntityStatusD, str2, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
