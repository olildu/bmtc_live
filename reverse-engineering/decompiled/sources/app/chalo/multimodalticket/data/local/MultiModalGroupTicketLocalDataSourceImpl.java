package app.chalo.multimodalticket.data.local;

import app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketPersistenceData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/local/MultiModalGroupTicketLocalDataSourceImpl;", "Lapp/chalo/multimodalticket/data/local/MultiModalGroupTicketLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketLocalDataSourceImpl implements MultiModalGroupTicketLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketDao f5788a;

    public MultiModalGroupTicketLocalDataSourceImpl(MultiModalGroupTicketDao multiModalGroupTicketDao) {
        this.f5788a = multiModalGroupTicketDao;
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Flow a(String subTicketId, String str) {
        Intrinsics.i(subTicketId, "subTicketId");
        return this.f5788a.a(subTicketId, str);
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Flow b() {
        return this.f5788a.b();
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Flow c(String groupId) {
        Intrinsics.i(groupId, "groupId");
        return this.f5788a.c(groupId);
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Object d(Continuation continuation) {
        Object objD = this.f5788a.d(continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Flow e(String userId, List cityIdsList) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityIdsList, "cityIdsList");
        return this.f5788a.e(userId, cityIdsList);
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Object f(MultiModalGroupTicketPersistenceData multiModalGroupTicketPersistenceData, Continuation continuation) {
        Object objG = this.f5788a.g(multiModalGroupTicketPersistenceData.f5878a, multiModalGroupTicketPersistenceData.b, multiModalGroupTicketPersistenceData.c, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource
    public final Object g(String str, List list, List list2, Continuation continuation) {
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiModalGroupTicketPersistenceData) it.next()).f5878a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            CollectionsKt.i(((MultiModalGroupTicketPersistenceData) it2.next()).b, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            CollectionsKt.i(((MultiModalGroupTicketPersistenceData) it3.next()).c, arrayList3);
        }
        Object objF = this.f5788a.f(str, list, arrayList, arrayList2, arrayList3, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }
}
