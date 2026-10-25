package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RecentLocationPairDao;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
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
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl", f = "RecentLocationPairLocalDataSourceImpl.kt", l = {30}, m = "getAllForCity", v = 1)
final class RecentLocationPairLocalDataSourceImpl$getAllForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentLocationPairLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentLocationPairLocalDataSourceImpl$getAllForCity$1(RecentLocationPairLocalDataSourceImpl recentLocationPairLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentLocationPairLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentLocationPairLocalDataSourceImpl$getAllForCity$1 recentLocationPairLocalDataSourceImpl$getAllForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentLocationPairLocalDataSourceImpl recentLocationPairLocalDataSourceImpl = this.this$0;
        recentLocationPairLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentLocationPairLocalDataSourceImpl$getAllForCity$1 = this;
        } else {
            recentLocationPairLocalDataSourceImpl$getAllForCity$1 = new RecentLocationPairLocalDataSourceImpl$getAllForCity$1(recentLocationPairLocalDataSourceImpl, this);
        }
        Object objH = recentLocationPairLocalDataSourceImpl$getAllForCity$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentLocationPairLocalDataSourceImpl$getAllForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            RecentLocationPairDao recentLocationPairDao = recentLocationPairLocalDataSourceImpl.f8962a;
            recentLocationPairLocalDataSourceImpl$getAllForCity$1.label = 1;
            objH = recentLocationPairDao.h();
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        List list = (List) objH;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.a((RecentLocationPairEntity) it.next()));
        }
        return arrayList;
    }
}
