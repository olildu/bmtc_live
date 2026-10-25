package app.chalo.recent.localsource.recent;

import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentStopBasedTripLocalDataSource;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RecentStopBasedTripLocalDataSource {
    Object a(String str, String str2, long j, Continuation continuation);

    Object b(String str, String str2, Continuation continuation);

    Object c(RecentStopBasedTripAppModel recentStopBasedTripAppModel, boolean z, ContinuationImpl continuationImpl);

    Flow d(String str, Set set);

    Serializable e(String str, ContinuationImpl continuationImpl);

    RecentStopBasedTripLocalDataSourceImpl$getLimitedStopBasedTripRecentForCity$$inlined$map$1 f(int i, String str, boolean z);
}
