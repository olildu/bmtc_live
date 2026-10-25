package app.chalo.recent.database.dao.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/dao/recent/RouteRecentCityItineraryDao;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RouteRecentCityItineraryDao {
    Object a(String str, String str2, long j, Continuation continuation);

    Object b(Continuation continuation);

    Object c(Continuation continuation);

    Object d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation);

    Object e(String str, String str2, ContinuationImpl continuationImpl);

    Object f(String str, String str2, ContinuationImpl continuationImpl);

    Object g(RecentRouteEntity recentRouteEntity, Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 h(String str, List list);

    FlowQuery$mapToList$$inlined$map$1 i(String str);

    Object j(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation);

    Object k(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation);

    Object l(String str, Continuation continuation);

    Object m(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, Continuation continuation);

    Object n(int i, RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation);

    Object o(String str, List list, Continuation continuation);

    Object p(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, String str2, Continuation continuation);
}
