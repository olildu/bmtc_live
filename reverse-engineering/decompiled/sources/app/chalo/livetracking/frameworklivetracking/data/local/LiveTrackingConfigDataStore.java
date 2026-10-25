package app.chalo.livetracking.frameworklivetracking.data.local;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/local/LiveTrackingConfigDataStore;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveTrackingConfigDataStore {
    Object a(Continuation continuation);

    Object b(String str, String str2, Continuation continuation);

    Object c(String str, ContinuationImpl continuationImpl, boolean z);

    Object d(String str, String str2, Continuation continuation);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(SuspendLambda suspendLambda);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(String str, Continuation continuation);

    Object i(String str, Continuation continuation);

    Object j(String str, ContinuationImpl continuationImpl);

    Object k(String str, ContinuationImpl continuationImpl);

    Object l(ContinuationImpl continuationImpl);

    Object m(String str, String str2, ContinuationImpl continuationImpl);

    Object n(String str, String str2, ContinuationImpl continuationImpl);
}
