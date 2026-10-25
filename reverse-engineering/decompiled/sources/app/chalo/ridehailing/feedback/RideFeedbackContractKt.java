package app.chalo.ridehailing.feedback;

import app.chalo.ridehailing.data.app.PostRideFeedbackSubtagConfigData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackContractKt {
    public static final boolean a(UserFeedbackReasonData userFeedbackReasonData, Set selectedSubtagIds) {
        Intrinsics.i(selectedSubtagIds, "selectedSubtagIds");
        if (userFeedbackReasonData == null) {
            return false;
        }
        if (userFeedbackReasonData.d) {
            return true;
        }
        List<PostRideFeedbackSubtagConfigData> list = userFeedbackReasonData.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (PostRideFeedbackSubtagConfigData postRideFeedbackSubtagConfigData : list) {
            if (Intrinsics.d(postRideFeedbackSubtagConfigData.c, Boolean.TRUE) && selectedSubtagIds.contains(postRideFeedbackSubtagConfigData.f9104a)) {
                return true;
            }
        }
        return false;
    }

    public static final int b(int i, List list) {
        Integer num;
        Intrinsics.i(list, "<this>");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((UserFeedbackRatingData) it.next()).b.getId());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((UserFeedbackRatingData) it.next()).b.getId());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i;
    }
}
