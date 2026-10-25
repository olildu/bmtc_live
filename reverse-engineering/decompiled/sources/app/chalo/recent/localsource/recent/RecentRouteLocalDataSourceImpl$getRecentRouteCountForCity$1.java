package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl", f = "RecentRouteLocalDataSourceImpl.kt", l = {170}, m = "getRecentRouteCountForCity", v = 1)
final class RecentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentRouteLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1(RecentRouteLocalDataSourceImpl recentRouteLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentRouteLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1 recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentRouteLocalDataSourceImpl recentRouteLocalDataSourceImpl = this.this$0;
        recentRouteLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1 = this;
        } else {
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1 = new RecentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1(recentRouteLocalDataSourceImpl, this);
        }
        Object objC = recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            RouteRecentCityItineraryDao routeRecentCityItineraryDao = recentRouteLocalDataSourceImpl.f8968a;
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1.label = 1;
            objC = routeRecentCityItineraryDao.c(recentRouteLocalDataSourceImpl$getRecentRouteCountForCity$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((Number) objC).intValue() != 0);
    }
}
