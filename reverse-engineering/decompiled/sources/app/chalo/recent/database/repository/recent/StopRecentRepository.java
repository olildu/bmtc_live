package app.chalo.recent.database.repository.recent;

import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.app.RecentStopAppModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/repository/recent/StopRecentRepository;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StopRecentRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object b(String str, String str2, SuspendLambda suspendLambda);

    Object c(String str, String str2, String str3, Continuation continuation);

    Object d(String str, String str2, Continuation continuation);

    Object e(RecentStopAppModel recentStopAppModel, boolean z, ContinuationImpl continuationImpl);

    Object f(String str, String str2, ContinuationImpl continuationImpl);

    Object g(RecentsSpecialEntityStatus recentsSpecialEntityStatus, String str, Continuation continuation);

    Object h(String str, Set set, Continuation continuation);

    Object i(String str, String str2, Continuation continuation);

    Object j(String str, Continuation continuation);
}
