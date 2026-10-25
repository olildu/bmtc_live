package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RecentStopAndRouteBasedTripDao;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl", f = "RecentStopAndRouteBasedTripLocalDataSourceImpl.kt", l = {70}, m = "getAllStopAndRouteBasedTripRecentForCity", v = 1)
final class RecentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentStopAndRouteBasedTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1(RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentStopAndRouteBasedTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1 recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentStopAndRouteBasedTripLocalDataSourceImpl recentStopAndRouteBasedTripLocalDataSourceImpl = this.this$0;
        recentStopAndRouteBasedTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1 = this;
        } else {
            recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1 = new RecentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1(recentStopAndRouteBasedTripLocalDataSourceImpl, this);
        }
        Object objD = recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            RecentStopAndRouteBasedTripDao recentStopAndRouteBasedTripDao = recentStopAndRouteBasedTripLocalDataSourceImpl.f8974a;
            recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1.label = 1;
            objD = recentStopAndRouteBasedTripDao.d(recentStopAndRouteBasedTripLocalDataSourceImpl$getAllStopAndRouteBasedTripRecentForCity$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        List list = (List) objD;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.c((RecentStopAndRouteBasedTripEntity) it.next()));
        }
        return arrayList;
    }
}
