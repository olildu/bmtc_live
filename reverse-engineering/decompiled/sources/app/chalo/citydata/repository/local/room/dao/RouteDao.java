package app.chalo.citydata.repository.local.room.dao;

import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/local/room/dao/RouteDao;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RouteDao {
    Object a(List list, Continuation continuation);

    Object b(String str, String str2, long j, Continuation continuation);

    Object c(RouteEntity routeEntity, ContinuationImpl continuationImpl);

    Object d(String str, Continuation continuation);

    Object e(String str, String str2, ContinuationImpl continuationImpl);

    Object f(String str, List list, Continuation continuation);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(long j, String str, Continuation continuation);

    Object i(String str, ContinuationImpl continuationImpl);

    Object j(String str, ArrayList arrayList, Continuation continuation);

    Object k(String str, String str2, RouteEntityLiveDataDetails routeEntityLiveDataDetails, Continuation continuation);

    Object l(String str, String str2, Continuation continuation);

    Object m(String str, String str2, Continuation continuation);
}
