package app.chalo.premiumbus.ui.faredetails.contract;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "", "InitializationIntent", "OnPayButtonClicked", "RetryFareFetchClicked", "OnStoppedIntent", "CancelOrderApiIntent", "OnPaymentCompletedIntent", "NavigateToHomeScreenIntent", "TermsAndConditionsTextClickedIntent", "OnReadMoreFareNoteIntent", "OrderCreationErrorDialogOkClickedIntent", "FareValidationFailedBottomSheetPayButtonClickedIntent", "FareValidationFailedDismissButtonClickedIntent", "OnChangeSeatClickedIntent", "IncreasePassengerCountClicked", "DecreasePassengerCountClicked", "OnPassengerCategorySelectedIntent", "SelectPassUpsellOfferIntent", "RemoveUpsellPassIntent", "SeeUpsellDetailsClickedIntent", "BottomSheetDismissedIntent", "SwitchErrorDismissedIntent", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$BottomSheetDismissedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$CancelOrderApiIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$DecreasePassengerCountClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$FareValidationFailedBottomSheetPayButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$FareValidationFailedDismissButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$IncreasePassengerCountClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$NavigateToHomeScreenIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnChangeSeatClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPassengerCategorySelectedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPayButtonClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPaymentCompletedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnReadMoreFareNoteIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnStoppedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OrderCreationErrorDialogOkClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$RemoveUpsellPassIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$RetryFareFetchClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SeeUpsellDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SelectPassUpsellOfferIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SwitchErrorDismissedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$TermsAndConditionsTextClickedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$BottomSheetDismissedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetDismissedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissedIntent f7586a = new BottomSheetDismissedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BottomSheetDismissedIntent);
        }

        public final int hashCode() {
            return -996125527;
        }

        public final String toString() {
            return "BottomSheetDismissedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$CancelOrderApiIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelOrderApiIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelOrderApiIntent f7587a = new CancelOrderApiIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelOrderApiIntent);
        }

        public final int hashCode() {
            return -675007142;
        }

        public final String toString() {
            return "CancelOrderApiIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$DecreasePassengerCountClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecreasePassengerCountClicked extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7588a;

        public DecreasePassengerCountClicked(String str) {
            this.f7588a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DecreasePassengerCountClicked) && Intrinsics.d(this.f7588a, ((DecreasePassengerCountClicked) obj).f7588a);
        }

        public final int hashCode() {
            return this.f7588a.hashCode();
        }

        public final String toString() {
            return vo1.B("DecreasePassengerCountClicked(passengerType=", this.f7588a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$FareValidationFailedBottomSheetPayButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareValidationFailedBottomSheetPayButtonClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareValidationFailedBottomSheetPayButtonClickedIntent f7589a = new FareValidationFailedBottomSheetPayButtonClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareValidationFailedBottomSheetPayButtonClickedIntent);
        }

        public final int hashCode() {
            return 1551334209;
        }

        public final String toString() {
            return "FareValidationFailedBottomSheetPayButtonClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$FareValidationFailedDismissButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareValidationFailedDismissButtonClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareValidationFailedDismissButtonClickedIntent f7590a = new FareValidationFailedDismissButtonClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareValidationFailedDismissButtonClickedIntent);
        }

        public final int hashCode() {
            return -687025469;
        }

        public final String toString() {
            return "FareValidationFailedDismissButtonClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$IncreasePassengerCountClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncreasePassengerCountClicked extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7591a;

        public IncreasePassengerCountClicked(String str) {
            this.f7591a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncreasePassengerCountClicked) && Intrinsics.d(this.f7591a, ((IncreasePassengerCountClicked) obj).f7591a);
        }

        public final int hashCode() {
            return this.f7591a.hashCode();
        }

        public final String toString() {
            return vo1.B("IncreasePassengerCountClicked(passengerType=", this.f7591a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f7592a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return 580299252;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$NavigateToHomeScreenIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToHomeScreenIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToHomeScreenIntent f7593a = new NavigateToHomeScreenIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToHomeScreenIntent);
        }

        public final int hashCode() {
            return -1289114325;
        }

        public final String toString() {
            return "NavigateToHomeScreenIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnChangeSeatClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnChangeSeatClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnChangeSeatClickedIntent f7594a = new OnChangeSeatClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnChangeSeatClickedIntent);
        }

        public final int hashCode() {
            return -393755305;
        }

        public final String toString() {
            return "OnChangeSeatClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPassengerCategorySelectedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerCategorySelectedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7595a;

        public OnPassengerCategorySelectedIntent(String str) {
            this.f7595a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerCategorySelectedIntent) && Intrinsics.d(this.f7595a, ((OnPassengerCategorySelectedIntent) obj).f7595a);
        }

        public final int hashCode() {
            return this.f7595a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerCategorySelectedIntent(passengerId=", this.f7595a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPayButtonClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPayButtonClicked extends PremiumBusFareDetailsIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPayButtonClicked);
        }

        public final int hashCode() {
            return 1237;
        }

        public final String toString() {
            return "OnPayButtonClicked(isAutoRetryingAfterLoginAttempt=false)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnPaymentCompletedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPaymentCompletedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7596a;

        public OnPaymentCompletedIntent(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f7596a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPaymentCompletedIntent) && Intrinsics.d(this.f7596a, ((OnPaymentCompletedIntent) obj).f7596a);
        }

        public final int hashCode() {
            return this.f7596a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPaymentCompletedIntent(bookingId=", this.f7596a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnReadMoreFareNoteIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnReadMoreFareNoteIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnReadMoreFareNoteIntent f7597a = new OnReadMoreFareNoteIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnReadMoreFareNoteIntent);
        }

        public final int hashCode() {
            return -532543938;
        }

        public final String toString() {
            return "OnReadMoreFareNoteIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OnStoppedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStoppedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStoppedIntent f7598a = new OnStoppedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnStoppedIntent);
        }

        public final int hashCode() {
            return -621705838;
        }

        public final String toString() {
            return "OnStoppedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$OrderCreationErrorDialogOkClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderCreationErrorDialogOkClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderCreationErrorDialogOkClickedIntent f7599a = new OrderCreationErrorDialogOkClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrderCreationErrorDialogOkClickedIntent);
        }

        public final int hashCode() {
            return 158247468;
        }

        public final String toString() {
            return "OrderCreationErrorDialogOkClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$RemoveUpsellPassIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveUpsellPassIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoveUpsellPassIntent f7600a = new RemoveUpsellPassIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveUpsellPassIntent);
        }

        public final int hashCode() {
            return -429982826;
        }

        public final String toString() {
            return "RemoveUpsellPassIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$RetryFareFetchClicked;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFareFetchClicked extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFareFetchClicked f7601a = new RetryFareFetchClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFareFetchClicked);
        }

        public final int hashCode() {
            return -535480693;
        }

        public final String toString() {
            return "RetryFareFetchClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SeeUpsellDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeUpsellDetailsClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeUpsellDetailsClickedIntent f7602a = new SeeUpsellDetailsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeUpsellDetailsClickedIntent);
        }

        public final int hashCode() {
            return -2011647575;
        }

        public final String toString() {
            return "SeeUpsellDetailsClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SelectPassUpsellOfferIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectPassUpsellOfferIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7603a;

        public SelectPassUpsellOfferIntent(String offerId) {
            Intrinsics.i(offerId, "offerId");
            this.f7603a = offerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPassUpsellOfferIntent) && Intrinsics.d(this.f7603a, ((SelectPassUpsellOfferIntent) obj).f7603a);
        }

        public final int hashCode() {
            return this.f7603a.hashCode();
        }

        public final String toString() {
            return vo1.B("SelectPassUpsellOfferIntent(offerId=", this.f7603a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$SwitchErrorDismissedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwitchErrorDismissedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwitchErrorDismissedIntent f7604a = new SwitchErrorDismissedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchErrorDismissedIntent);
        }

        public final int hashCode() {
            return 1626609513;
        }

        public final String toString() {
            return "SwitchErrorDismissedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent$TermsAndConditionsTextClickedIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TermsAndConditionsTextClickedIntent extends PremiumBusFareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsAndConditionsTextClickedIntent f7605a = new TermsAndConditionsTextClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsAndConditionsTextClickedIntent);
        }

        public final int hashCode() {
            return 937700118;
        }

        public final String toString() {
            return "TermsAndConditionsTextClickedIntent";
        }
    }
}
