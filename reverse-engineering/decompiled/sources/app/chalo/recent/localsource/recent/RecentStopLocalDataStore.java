package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentStopLocalDataStore;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RecentStopLocalDataStore {
    Object a(String str, String str2, long j, Continuation continuation);

    Object b(String str, String str2, String str3, Continuation continuation);

    Object c(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl);

    RecentStopLocalDataStoreImpl$getRecentStopCityItineraryForCity$$inlined$map$1 d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str);

    Object e(RecentStopAppModel recentStopAppModel, boolean z, ContinuationImpl continuationImpl);

    Flow f(String str, Set set);

    Object g(String str, Continuation continuation);

    RecentStopLocalDataStoreImpl$getStopRecentsForCity$$inlined$map$1 h(String str);

    Object i(String str, String str2, ContinuationImpl continuationImpl);

    Object j(String str, String str2, SuspendLambda suspendLambda);

    Serializable k(int i, String str, ContinuationImpl continuationImpl);
}
