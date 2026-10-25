package app.chalo.ridefeedback.domain;

import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError;", "", "SubmitFailed", "Unexpected", "Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError$SubmitFailed;", "Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError$Unexpected;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RetryPendingRideFeedbackError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError$SubmitFailed;", "Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitFailed extends RetryPendingRideFeedbackError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingDataSourceError f9084a;

        public SubmitFailed(ProductBookingDataSourceError error) {
            Intrinsics.i(error, "error");
            this.f9084a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitFailed) && Intrinsics.d(this.f9084a, ((SubmitFailed) obj).f9084a);
        }

        public final int hashCode() {
            return this.f9084a.hashCode();
        }

        public final String toString() {
            return "SubmitFailed(error=" + this.f9084a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError$Unexpected;", "Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unexpected extends RetryPendingRideFeedbackError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9085a;

        public Unexpected(String str) {
            this.f9085a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unexpected) && Intrinsics.d(this.f9085a, ((Unexpected) obj).f9085a);
        }

        public final int hashCode() {
            String str = this.f9085a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unexpected(message=", this.f9085a, ")");
        }
    }
}
