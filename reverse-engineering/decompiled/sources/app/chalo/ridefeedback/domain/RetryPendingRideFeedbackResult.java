package app.chalo.ridefeedback.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackResult;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RetryPendingRideFeedbackResult {
    public static final RetryPendingRideFeedbackResult c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9086a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackResult$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EmptyList emptyList = EmptyList.f17557a;
        c = new RetryPendingRideFeedbackResult(emptyList, emptyList);
    }

    public RetryPendingRideFeedbackResult(List requestedBookingIds, List syncedBookingIds) {
        Intrinsics.i(requestedBookingIds, "requestedBookingIds");
        Intrinsics.i(syncedBookingIds, "syncedBookingIds");
        this.f9086a = requestedBookingIds;
        this.b = syncedBookingIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryPendingRideFeedbackResult)) {
            return false;
        }
        RetryPendingRideFeedbackResult retryPendingRideFeedbackResult = (RetryPendingRideFeedbackResult) obj;
        return Intrinsics.d(this.f9086a, retryPendingRideFeedbackResult.f9086a) && Intrinsics.d(this.b, retryPendingRideFeedbackResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9086a.hashCode() * 31);
    }

    public final String toString() {
        return "RetryPendingRideFeedbackResult(requestedBookingIds=" + this.f9086a + ", syncedBookingIds=" + this.b + ")";
    }
}
