package app.chalo.recent.localsource.recent;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl", f = "RecentRouteLocalDataSourceImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_HD}, m = "getRouteRecentSortedByMostRecentAccessForCity", v = 1)
final class RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentRouteLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1(RecentRouteLocalDataSourceImpl recentRouteLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentRouteLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1 recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentRouteLocalDataSourceImpl recentRouteLocalDataSourceImpl = this.this$0;
        recentRouteLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1 = this;
        } else {
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1 = new RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1(recentRouteLocalDataSourceImpl, this);
        }
        Object objB = recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            RouteRecentCityItineraryDao routeRecentCityItineraryDao = recentRouteLocalDataSourceImpl.f8968a;
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1.label = 1;
            objB = routeRecentCityItineraryDao.b(recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCity$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        Iterable iterable = (Iterable) objB;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
        }
        return arrayList;
    }
}
