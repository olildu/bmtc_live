package app.chalo.ridefeedback.data;

import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/RideFeedbackRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RideFeedbackRepository {
    Object a(Continuation continuation);

    Object b(RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity, Continuation continuation);

    Object c(String str, RideFeedbackFillStatus rideFeedbackFillStatus, String str2, String str3, ContinuationImpl continuationImpl);

    Object d(long j, String str, String str2, String str3, ContinuationImpl continuationImpl);

    Flow e(String str, String str2);

    Object f(String str, String str2, Continuation continuation);

    Object g(Continuation continuation);

    Object h(List list, String str, String str2, Continuation continuation);

    Object i(List list, String str, String str2, SuspendLambda suspendLambda);

    Object j(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object k(PostRideFeedbackEntity postRideFeedbackEntity, Continuation continuation);

    Object l(String str, String str2, String str3, Continuation continuation);

    Serializable m(List list, ContinuationImpl continuationImpl);
}
