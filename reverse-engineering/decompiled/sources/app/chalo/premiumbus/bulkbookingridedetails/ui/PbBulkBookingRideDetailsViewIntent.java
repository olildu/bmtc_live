package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import defpackage.b3;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "", "ViewCreatedIntent", "BookSingleRideClickIntent", "RetryClickIntent", "OnRidesCardCtaClickIntent", "OnDirectionsCtaClickIntent", "OnBackToHomeScreenClickIntent", "OnTabClickIntent", "BookAgainClickedIntent", "ViewReceiptClickedIntent", "DismissAlertDialogIntent", "FragmentStopIntent", "FragmentStartedIntent", "OnPassInfoBannerCtaClickIntent", "DismissDialogIntent", "DateSelectedIntent", "PassDateChangeConfirmationDialog", "RenewPassClickIntent", "FaqClickedIntent", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$BookAgainClickedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$BookSingleRideClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DateSelectedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DismissAlertDialogIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DismissDialogIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FaqClickedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FragmentStartedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FragmentStopIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnBackToHomeScreenClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnDirectionsCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnPassInfoBannerCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnRidesCardCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnTabClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$PassDateChangeConfirmationDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$RenewPassClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$RetryClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$ViewCreatedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$ViewReceiptClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PbBulkBookingRideDetailsViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$BookAgainClickedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookAgainClickedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusBulkBookingPastRidesCardData f6916a;

        public BookAgainClickedIntent(PremiumBusBulkBookingPastRidesCardData premiumBusBulkBookingPastRidesCardData) {
            this.f6916a = premiumBusBulkBookingPastRidesCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookAgainClickedIntent) && Intrinsics.d(this.f6916a, ((BookAgainClickedIntent) obj).f6916a);
        }

        public final int hashCode() {
            return this.f6916a.hashCode();
        }

        public final String toString() {
            return "BookAgainClickedIntent(premiumBusBulkBookingPastRidesCardData=" + this.f6916a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$BookSingleRideClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BookSingleRideClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BookSingleRideClickIntent f6917a = new BookSingleRideClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DateSelectedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateSelectedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f6918a;

        public DateSelectedIntent(Long l) {
            this.f6918a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateSelectedIntent) && Intrinsics.d(this.f6918a, ((DateSelectedIntent) obj).f6918a);
        }

        public final int hashCode() {
            Long l = this.f6918a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "DateSelectedIntent(selectedDateInMillis=" + this.f6918a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DismissAlertDialogIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissAlertDialogIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissAlertDialogIntent f6919a = new DismissAlertDialogIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$DismissDialogIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissDialogIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialogIntent f6920a = new DismissDialogIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FaqClickedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FaqClickedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6921a;

        public FaqClickedIntent(String faqImageUrl) {
            Intrinsics.i(faqImageUrl, "faqImageUrl");
            this.f6921a = faqImageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaqClickedIntent) && Intrinsics.d(this.f6921a, ((FaqClickedIntent) obj).f6921a);
        }

        public final int hashCode() {
            return this.f6921a.hashCode();
        }

        public final String toString() {
            return vo1.B("FaqClickedIntent(faqImageUrl=", this.f6921a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FragmentStartedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStartedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartedIntent f6922a = new FragmentStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$FragmentStopIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStopIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStopIntent f6923a = new FragmentStopIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnBackToHomeScreenClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackToHomeScreenClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackToHomeScreenClickIntent f6924a = new OnBackToHomeScreenClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnDirectionsCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnDirectionsCtaClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumReserveTicketStopDirectionsInfoState f6925a;

        public OnDirectionsCtaClickIntent(PremiumReserveTicketStopDirectionsInfoState premiumReserveTicketStopDirectionsInfoState) {
            Intrinsics.i(premiumReserveTicketStopDirectionsInfoState, "premiumReserveTicketStopDirectionsInfoState");
            this.f6925a = premiumReserveTicketStopDirectionsInfoState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDirectionsCtaClickIntent) && Intrinsics.d(this.f6925a, ((OnDirectionsCtaClickIntent) obj).f6925a);
        }

        public final int hashCode() {
            return this.f6925a.hashCode();
        }

        public final String toString() {
            return "OnDirectionsCtaClickIntent(premiumReserveTicketStopDirectionsInfoState=" + this.f6925a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnPassInfoBannerCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassInfoBannerCtaClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PbPassInfoBannerCtaType f6926a;

        public OnPassInfoBannerCtaClickIntent(PbPassInfoBannerCtaType pbPassInfoBannerCtaType) {
            this.f6926a = pbPassInfoBannerCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassInfoBannerCtaClickIntent) && Intrinsics.d(this.f6926a, ((OnPassInfoBannerCtaClickIntent) obj).f6926a);
        }

        public final int hashCode() {
            PbPassInfoBannerCtaType pbPassInfoBannerCtaType = this.f6926a;
            if (pbPassInfoBannerCtaType == null) {
                return 0;
            }
            return pbPassInfoBannerCtaType.hashCode();
        }

        public final String toString() {
            return "OnPassInfoBannerCtaClickIntent(passInfoBannerCtaType=" + this.f6926a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnRidesCardCtaClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRidesCardCtaClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusBulkBookingUpcomingRidesCardData f6927a;

        public OnRidesCardCtaClickIntent(PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData) {
            this.f6927a = premiumBusBulkBookingUpcomingRidesCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRidesCardCtaClickIntent) && Intrinsics.d(this.f6927a, ((OnRidesCardCtaClickIntent) obj).f6927a);
        }

        public final int hashCode() {
            return this.f6927a.hashCode();
        }

        public final String toString() {
            return "OnRidesCardCtaClickIntent(cardData=" + this.f6927a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$OnTabClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTabClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PbBulkBookingRideDetailsTabType f6928a;

        public OnTabClickIntent(PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType) {
            Intrinsics.i(pbBulkBookingRideDetailsTabType, "pbBulkBookingRideDetailsTabType");
            this.f6928a = pbBulkBookingRideDetailsTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTabClickIntent) && this.f6928a == ((OnTabClickIntent) obj).f6928a;
        }

        public final int hashCode() {
            return this.f6928a.hashCode();
        }

        public final String toString() {
            return "OnTabClickIntent(pbBulkBookingRideDetailsTabType=" + this.f6928a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$PassDateChangeConfirmationDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassDateChangeConfirmationDialog extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6929a;

        public PassDateChangeConfirmationDialog(long j) {
            this.f6929a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassDateChangeConfirmationDialog) && this.f6929a == ((PassDateChangeConfirmationDialog) obj).f6929a;
        }

        public final int hashCode() {
            long j = this.f6929a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f6929a, "PassDateChangeConfirmationDialog(newStartDateInMillis=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$RenewPassClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RenewPassClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RenewPassClickIntent f6930a = new RenewPassClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$RetryClickIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryClickIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryClickIntent f6931a = new RetryClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$ViewCreatedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6932a;
        public final SuperPassSubTypes b;
        public final boolean c;
        public final String d;
        public final int e;

        public ViewCreatedIntent(String passId, SuperPassSubTypes superPassSubType, boolean z, String configId, int i) {
            Intrinsics.i(passId, "passId");
            Intrinsics.i(superPassSubType, "superPassSubType");
            Intrinsics.i(configId, "configId");
            this.f6932a = passId;
            this.b = superPassSubType;
            this.c = z;
            this.d = configId;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCreatedIntent)) {
                return false;
            }
            ViewCreatedIntent viewCreatedIntent = (ViewCreatedIntent) obj;
            return Intrinsics.d(this.f6932a, viewCreatedIntent.f6932a) && this.b == viewCreatedIntent.b && this.c == viewCreatedIntent.c && Intrinsics.d(this.d, viewCreatedIntent.d) && this.e == viewCreatedIntent.e;
        }

        public final int hashCode() {
            return nf1.e((((this.b.hashCode() + (this.f6932a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewCreatedIntent(passId=");
            sb.append(this.f6932a);
            sb.append(", superPassSubType=");
            sb.append(this.b);
            sb.append(", isNewPurchaseFlow=");
            pk0.x(", configId=", this.d, ", fareMappingId=", sb, this.c);
            return b3.f(")", this.e, sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent$ViewReceiptClickedIntent;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewReceiptClickedIntent extends PbBulkBookingRideDetailsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6933a;
        public final String b;
        public final String c;

        public ViewReceiptClickedIntent(String bookingId, String productType, String productSubType) {
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.f6933a = bookingId;
            this.b = productType;
            this.c = productSubType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewReceiptClickedIntent)) {
                return false;
            }
            ViewReceiptClickedIntent viewReceiptClickedIntent = (ViewReceiptClickedIntent) obj;
            return Intrinsics.d(this.f6933a, viewReceiptClickedIntent.f6933a) && Intrinsics.d(this.b, viewReceiptClickedIntent.b) && Intrinsics.d(this.c, viewReceiptClickedIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6933a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("ViewReceiptClickedIntent(bookingId=", this.f6933a, ", productType=", this.b, ", productSubType="), this.c, ")");
        }
    }
}
