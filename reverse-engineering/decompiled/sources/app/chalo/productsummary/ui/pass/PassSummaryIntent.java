package app.chalo.productsummary.ui.pass;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.productsummary.ui.ticket.ProductSummaryBannerCtaType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "", "InitializationIntent", "OnBannerCtaClickIntent", "OnFullScreenImageDismissBtnClickIntent", "OnImageClickIntent", "OnErrorScreenActionBtnOnClick", "OnViewTripHistoryClickedIntent", "OnBackPressedIntent", "DownloadInvoiceBtnClicked", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$DownloadInvoiceBtnClicked;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$InitializationIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnBackPressedIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnBannerCtaClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnErrorScreenActionBtnOnClick;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnFullScreenImageDismissBtnClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnImageClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnViewTripHistoryClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassSummaryIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$DownloadInvoiceBtnClicked;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadInvoiceBtnClicked extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8769a;

        public DownloadInvoiceBtnClicked(String passId) {
            Intrinsics.i(passId, "passId");
            this.f8769a = passId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DownloadInvoiceBtnClicked) && Intrinsics.d(this.f8769a, ((DownloadInvoiceBtnClicked) obj).f8769a);
        }

        public final int hashCode() {
            return this.f8769a.hashCode();
        }

        public final String toString() {
            return vo1.B("DownloadInvoiceBtnClicked(passId=", this.f8769a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$InitializationIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f8770a;
        public final BookingsRequestType b;

        static {
            BookingsRequestType.Companion companion = BookingsRequestType.INSTANCE;
        }

        public InitializationIntent(Source source, BookingsRequestType requestType) {
            Intrinsics.i(source, "source");
            Intrinsics.i(requestType, "requestType");
            this.f8770a = source;
            this.b = requestType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f8770a == initializationIntent.f8770a && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8770a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f8770a + ", requestType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnBackPressedIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressedIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassSummaryScreenType f8771a;

        public OnBackPressedIntent(PassSummaryScreenType screenType) {
            Intrinsics.i(screenType, "screenType");
            this.f8771a = screenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBackPressedIntent) && Intrinsics.d(this.f8771a, ((OnBackPressedIntent) obj).f8771a);
        }

        public final int hashCode() {
            return this.f8771a.hashCode();
        }

        public final String toString() {
            return "OnBackPressedIntent(screenType=" + this.f8771a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnBannerCtaClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBannerCtaClickIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSummaryBannerCtaType f8772a;

        public OnBannerCtaClickIntent(ProductSummaryBannerCtaType productSummaryBannerCtaType) {
            Intrinsics.i(productSummaryBannerCtaType, "productSummaryBannerCtaType");
            this.f8772a = productSummaryBannerCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBannerCtaClickIntent) && this.f8772a == ((OnBannerCtaClickIntent) obj).f8772a;
        }

        public final int hashCode() {
            return this.f8772a.hashCode();
        }

        public final String toString() {
            return "OnBannerCtaClickIntent(productSummaryBannerCtaType=" + this.f8772a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnErrorScreenActionBtnOnClick;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnErrorScreenActionBtnOnClick extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnErrorScreenActionBtnOnClick f8773a = new OnErrorScreenActionBtnOnClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnErrorScreenActionBtnOnClick);
        }

        public final int hashCode() {
            return -362308227;
        }

        public final String toString() {
            return "OnErrorScreenActionBtnOnClick";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnFullScreenImageDismissBtnClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFullScreenImageDismissBtnClickIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnFullScreenImageDismissBtnClickIntent f8774a = new OnFullScreenImageDismissBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnImageClickIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnImageClickIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8775a;

        public OnImageClickIntent(String imageUrl) {
            Intrinsics.i(imageUrl, "imageUrl");
            this.f8775a = imageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnImageClickIntent) && Intrinsics.d(this.f8775a, ((OnImageClickIntent) obj).f8775a);
        }

        public final int hashCode() {
            return this.f8775a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnImageClickIntent(imageUrl=", this.f8775a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryIntent$OnViewTripHistoryClickedIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnViewTripHistoryClickedIntent extends PassSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8776a;

        public OnViewTripHistoryClickedIntent(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f8776a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnViewTripHistoryClickedIntent) && Intrinsics.d(this.f8776a, ((OnViewTripHistoryClickedIntent) obj).f8776a);
        }

        public final int hashCode() {
            return this.f8776a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnViewTripHistoryClickedIntent(bookingId=", this.f8776a, ")");
        }
    }
}
