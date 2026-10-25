package app.chalo.livetracking.frameworklivetracking;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManager;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveTrackingDataManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    LiveTrackingDataManagerImpl$getAllEtasForStop$$inlined$map$1 a(List list);

    Object b(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Flow c(String str, List list);

    Flow d(String str, String str2, Long l, Long l2);

    Flow e(int i, Function0 function0);

    Flow f(String str, String str2, List list);
}
