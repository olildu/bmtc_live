package app.chalo.livetracking.provider.tracking;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteTrackingDataProvider;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RouteTrackingDataProvider {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(boolean z);

    RouteTrackingManagerInitState b(String str);

    StateFlow c();

    Flow d(List list, boolean z, boolean z2);

    Flow e(String str, List list);

    Flow f(long j, String str);
}
