package app.chalo.productsummary.ui.ticket;

import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType;", "", InitializationStatus.SUCCESS, "Error", "Loading", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Error;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Loading;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TicketSummaryScreenType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Error;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends TicketSummaryScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f8822a;

        public Error(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f8822a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f8822a, ((Error) obj).f8822a);
        }

        public final int hashCode() {
            return this.f8822a.hashCode();
        }

        public final String toString() {
            return "Error(errorUIState=" + this.f8822a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Loading;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends TicketSummaryScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadingDialogUIState f8823a;

        public Loading(LoadingDialogUIState loadingDialogUIState) {
            this.f8823a = loadingDialogUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.d(this.f8823a, ((Loading) obj).f8823a);
        }

        public final int hashCode() {
            return this.f8823a.hashCode();
        }

        public final String toString() {
            return "Loading(loadingDialogUIState=" + this.f8823a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType;", "CommonReceipt", "BMTCReceipt", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success$BMTCReceipt;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success$CommonReceipt;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Success extends TicketSummaryScreenType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success$BMTCReceipt;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BMTCReceipt extends Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TicketSummaryReceiptScreenUIState f8824a;

            public BMTCReceipt(TicketSummaryReceiptScreenUIState receiptScreenUIState) {
                Intrinsics.i(receiptScreenUIState, "receiptScreenUIState");
                this.f8824a = receiptScreenUIState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BMTCReceipt) && Intrinsics.d(this.f8824a, ((BMTCReceipt) obj).f8824a);
            }

            public final int hashCode() {
                return this.f8824a.hashCode();
            }

            public final String toString() {
                return "BMTCReceipt(receiptScreenUIState=" + this.f8824a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success$CommonReceipt;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryScreenType$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommonReceipt extends Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TicketSummarySuccessScreenUIState f8825a;
            public final FullScreenImageUIState b;
            public final TextUIState.ChaloTextUIState c;
            public final ImageUrlUIState d;
            public final ImageUIState e;

            public CommonReceipt(TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState, FullScreenImageUIState fullScreenImageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUrlUIState imageUrlUIState, ImageUIState imageUIState) {
                Intrinsics.i(ticketSummarySuccessScreenUIState, "ticketSummarySuccessScreenUIState");
                this.f8825a = ticketSummarySuccessScreenUIState;
                this.b = fullScreenImageUIState;
                this.c = chaloTextUIState;
                this.d = imageUrlUIState;
                this.e = imageUIState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CommonReceipt)) {
                    return false;
                }
                CommonReceipt commonReceipt = (CommonReceipt) obj;
                return Intrinsics.d(this.f8825a, commonReceipt.f8825a) && Intrinsics.d(this.b, commonReceipt.b) && Intrinsics.d(this.c, commonReceipt.c) && Intrinsics.d(this.d, commonReceipt.d) && Intrinsics.d(this.e, commonReceipt.e);
            }

            public final int hashCode() {
                int iHashCode = this.f8825a.hashCode() * 31;
                FullScreenImageUIState fullScreenImageUIState = this.b;
                int iHashCode2 = (iHashCode + (fullScreenImageUIState == null ? 0 : fullScreenImageUIState.hashCode())) * 31;
                TextUIState.ChaloTextUIState chaloTextUIState = this.c;
                int iHashCode3 = (iHashCode2 + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
                ImageUrlUIState imageUrlUIState = this.d;
                int iHashCode4 = (iHashCode3 + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31;
                ImageUIState imageUIState = this.e;
                return iHashCode4 + (imageUIState != null ? imageUIState.hashCode() : 0);
            }

            public final String toString() {
                return "CommonReceipt(ticketSummarySuccessScreenUIState=" + this.f8825a + ", fullScreenImageUIState=" + this.b + ", brandingImageTitleUIState=" + this.c + ", brandingImageUrlUIState=" + this.d + ", brandingImageUIState=" + this.e + ")";
            }

            public /* synthetic */ CommonReceipt(TicketSummarySuccessScreenUIState ticketSummarySuccessScreenUIState, FullScreenImageUIState fullScreenImageUIState, ImageUIState imageUIState, int i) {
                this(ticketSummarySuccessScreenUIState, (i & 2) != 0 ? null : fullScreenImageUIState, null, null, (i & 16) != 0 ? null : imageUIState);
            }
        }
    }
}
