package app.chalo.productsummary.ui.ticket;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "", "InitializationIntent", "OnBannerCtaClickIntent", "OnFullScreenImageDismissBtnClickIntent", "OnImageClickIntent", "OnSupportClicked", "OnBackPressedIntent", "OnErrorScreenActionBtnClickIntent", "DownloadInvoiceBtnClickedIntent", "OnMultiModalFareLegClicked", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$DownloadInvoiceBtnClickedIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$InitializationIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnBackPressedIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnBannerCtaClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnErrorScreenActionBtnClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnFullScreenImageDismissBtnClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnImageClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnMultiModalFareLegClicked;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnSupportClicked;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TicketSummaryIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$DownloadInvoiceBtnClickedIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadInvoiceBtnClickedIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8805a;
        public final String b;

        public DownloadInvoiceBtnClickedIntent(String bookingId, String str) {
            Intrinsics.i(bookingId, "bookingId");
            this.f8805a = bookingId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadInvoiceBtnClickedIntent)) {
                return false;
            }
            DownloadInvoiceBtnClickedIntent downloadInvoiceBtnClickedIntent = (DownloadInvoiceBtnClickedIntent) obj;
            return Intrinsics.d(this.f8805a, downloadInvoiceBtnClickedIntent.f8805a) && Intrinsics.d(this.b, downloadInvoiceBtnClickedIntent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8805a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.o("DownloadInvoiceBtnClickedIntent(bookingId=", this.f8805a, ", passIdUsedToPurchaseTicket=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$InitializationIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingsRequestType f8806a;
        public final Source b;

        static {
            BookingsRequestType.Companion companion = BookingsRequestType.INSTANCE;
        }

        public InitializationIntent(Source source, BookingsRequestType requestType) {
            Intrinsics.i(requestType, "requestType");
            Intrinsics.i(source, "source");
            this.f8806a = requestType;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f8806a, initializationIntent.f8806a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8806a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(requestType=" + this.f8806a + ", source=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnBackPressedIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressedIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketSummaryScreenType f8807a;

        public OnBackPressedIntent(TicketSummaryScreenType ticketSummaryScreenType) {
            this.f8807a = ticketSummaryScreenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBackPressedIntent) && Intrinsics.d(this.f8807a, ((OnBackPressedIntent) obj).f8807a);
        }

        public final int hashCode() {
            TicketSummaryScreenType ticketSummaryScreenType = this.f8807a;
            if (ticketSummaryScreenType == null) {
                return 0;
            }
            return ticketSummaryScreenType.hashCode();
        }

        public final String toString() {
            return "OnBackPressedIntent(screenType=" + this.f8807a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnBannerCtaClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBannerCtaClickIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSummaryBannerCtaType f8808a;

        public OnBannerCtaClickIntent(ProductSummaryBannerCtaType productSummaryBannerCtaType) {
            Intrinsics.i(productSummaryBannerCtaType, "productSummaryBannerCtaType");
            this.f8808a = productSummaryBannerCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBannerCtaClickIntent) && this.f8808a == ((OnBannerCtaClickIntent) obj).f8808a;
        }

        public final int hashCode() {
            return this.f8808a.hashCode();
        }

        public final String toString() {
            return "OnBannerCtaClickIntent(productSummaryBannerCtaType=" + this.f8808a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnErrorScreenActionBtnClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnErrorScreenActionBtnClickIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnErrorScreenActionBtnClickIntent f8809a = new OnErrorScreenActionBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnErrorScreenActionBtnClickIntent);
        }

        public final int hashCode() {
            return -1870779656;
        }

        public final String toString() {
            return "OnErrorScreenActionBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnFullScreenImageDismissBtnClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFullScreenImageDismissBtnClickIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnFullScreenImageDismissBtnClickIntent f8810a = new OnFullScreenImageDismissBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnImageClickIntent;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnImageClickIntent extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8811a;

        public OnImageClickIntent(String imageUrl) {
            Intrinsics.i(imageUrl, "imageUrl");
            this.f8811a = imageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnImageClickIntent) && Intrinsics.d(this.f8811a, ((OnImageClickIntent) obj).f8811a);
        }

        public final int hashCode() {
            return this.f8811a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnImageClickIntent(imageUrl=", this.f8811a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnMultiModalFareLegClicked;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMultiModalFareLegClicked extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8812a;

        public OnMultiModalFareLegClicked(int i) {
            this.f8812a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMultiModalFareLegClicked) && this.f8812a == ((OnMultiModalFareLegClicked) obj).f8812a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF8812a() {
            return this.f8812a;
        }

        public final String toString() {
            return b3.d(this.f8812a, "OnMultiModalFareLegClicked(sequence=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent$OnSupportClicked;", "Lapp/chalo/productsummary/ui/ticket/TicketSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSupportClicked extends TicketSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f8813a;

        public OnSupportClicked(ChaloUserBookingType bookingType) {
            Intrinsics.i(bookingType, "bookingType");
            this.f8813a = bookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSupportClicked) && Intrinsics.d(this.f8813a, ((OnSupportClicked) obj).f8813a);
        }

        public final int hashCode() {
            return this.f8813a.hashCode();
        }

        public final String toString() {
            return "OnSupportClicked(bookingType=" + this.f8813a + ")";
        }
    }
}
