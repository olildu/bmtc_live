package app.chalo.ridefeedback.data;

import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackRepositoryKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable a(RideFeedbackRepository rideFeedbackRepository, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RideFeedbackRepositoryKt$pendingBookingIds$1 rideFeedbackRepositoryKt$pendingBookingIds$1;
        if (continuationImpl instanceof RideFeedbackRepositoryKt$pendingBookingIds$1) {
            rideFeedbackRepositoryKt$pendingBookingIds$1 = (RideFeedbackRepositoryKt$pendingBookingIds$1) continuationImpl;
            int i = rideFeedbackRepositoryKt$pendingBookingIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackRepositoryKt$pendingBookingIds$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackRepositoryKt$pendingBookingIds$1 = new RideFeedbackRepositoryKt$pendingBookingIds$1(continuationImpl);
            }
        } else {
            rideFeedbackRepositoryKt$pendingBookingIds$1 = new RideFeedbackRepositoryKt$pendingBookingIds$1(continuationImpl);
        }
        Object objJ = rideFeedbackRepositoryKt$pendingBookingIds$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackRepositoryKt$pendingBookingIds$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            rideFeedbackRepositoryKt$pendingBookingIds$1.label = 1;
            objJ = rideFeedbackRepository.j(str, str2, str3, rideFeedbackRepositoryKt$pendingBookingIds$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((Iterable) objJ).iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((RideFeedbackOfflineQueueEntity) it.next()).f9072a);
        }
        return linkedHashSet;
    }
}
