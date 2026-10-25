package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentPlaceLocalDataSource;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RecentPlaceLocalDataSource {
    Object b(String str, String str2, String str3, Continuation continuation);

    Object c(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl);

    Flow d(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str);

    Object e(String str, String str2, ContinuationImpl continuationImpl);

    Object f(String str, String str2, SuspendLambda suspendLambda);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(int i, String str, Continuation continuation);

    Object i(String str, String str2, long j, Continuation continuation);

    Object j(RecentPlaceAppModel recentPlaceAppModel, boolean z, ContinuationImpl continuationImpl);

    RecentPlaceLocalDataSourceImpl$getAllPlacesRecentForCity$$inlined$map$1 k(String str);
}
