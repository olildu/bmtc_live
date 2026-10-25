package app.chalo.instantticket.ui.faredetails.contract;

import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0018\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "", "InitialIntent", "IncreasePassengerCountClicked", "DecreasePassengerCountClicked", "OnPayButtonClicked", "RetryFareFetchClicked", "InitiateOnlinePaymentIntent", "OnStoppedIntent", "CancelOrderApiIntent", "OnPaymentCompletedIntent", "NavigateToHomeScreenIntent", "TermsAndConditionsTextClickedIntent", "OnReadMoreFareNoteIntent", "OrderCreationErrorDialogOkClickedIntent", "UserBillingInfoNameChangedIntent", "UserBillingInfoMobileNumberChangedIntent", "UserBillingInfoBottomSheetProceedClickedIntent", "FinalFareBottomSheetPayButtonClickedIntent", "FinalFareBottomSheetTermsAndConditionsTextClickedIntent", "FinalFareBottomSheetCancelButtonClickedIntent", "OnTncDialoguePositiveBtnClickedIntent", "OnStartIntent", "OnPassengerCategorySelectedIntent", "FareValidationFailedBottomSheetPayButtonClickedIntent", "FareValidationFailedDismissButtonClickedIntent", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$CancelOrderApiIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$DecreasePassengerCountClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FareValidationFailedBottomSheetPayButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FareValidationFailedDismissButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetCancelButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetPayButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetTermsAndConditionsTextClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$IncreasePassengerCountClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$InitialIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$InitiateOnlinePaymentIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$NavigateToHomeScreenIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPassengerCategorySelectedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPayButtonClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPaymentCompletedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnReadMoreFareNoteIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnStartIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnStoppedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnTncDialoguePositiveBtnClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OrderCreationErrorDialogOkClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$RetryFareFetchClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$TermsAndConditionsTextClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoBottomSheetProceedClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoMobileNumberChangedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoNameChangedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FareDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$CancelOrderApiIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancelOrderApiIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelOrderApiIntent f3925a = new CancelOrderApiIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$DecreasePassengerCountClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecreasePassengerCountClicked extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3926a;

        public DecreasePassengerCountClicked(String passengerType) {
            Intrinsics.i(passengerType, "passengerType");
            this.f3926a = passengerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DecreasePassengerCountClicked) && Intrinsics.d(this.f3926a, ((DecreasePassengerCountClicked) obj).f3926a);
        }

        public final int hashCode() {
            return this.f3926a.hashCode();
        }

        public final String toString() {
            return vo1.B("DecreasePassengerCountClicked(passengerType=", this.f3926a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FareValidationFailedBottomSheetPayButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FareValidationFailedBottomSheetPayButtonClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareValidationFailedBottomSheetPayButtonClickedIntent f3927a = new FareValidationFailedBottomSheetPayButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FareValidationFailedDismissButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FareValidationFailedDismissButtonClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FareValidationFailedDismissButtonClickedIntent f3928a = new FareValidationFailedDismissButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetCancelButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinalFareBottomSheetCancelButtonClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinalFareBottomSheetCancelButtonClickedIntent f3929a = new FinalFareBottomSheetCancelButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetPayButtonClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinalFareBottomSheetPayButtonClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinalFareBottomSheetPayButtonClickedIntent f3930a = new FinalFareBottomSheetPayButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$FinalFareBottomSheetTermsAndConditionsTextClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinalFareBottomSheetTermsAndConditionsTextClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinalFareBottomSheetTermsAndConditionsTextClickedIntent f3931a = new FinalFareBottomSheetTermsAndConditionsTextClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$IncreasePassengerCountClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncreasePassengerCountClicked extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3932a;

        public IncreasePassengerCountClicked(String passengerType) {
            Intrinsics.i(passengerType, "passengerType");
            this.f3932a = passengerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncreasePassengerCountClicked) && Intrinsics.d(this.f3932a, ((IncreasePassengerCountClicked) obj).f3932a);
        }

        public final int hashCode() {
            return this.f3932a.hashCode();
        }

        public final String toString() {
            return vo1.B("IncreasePassengerCountClicked(passengerType=", this.f3932a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$InitialIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FareDetailsData f3933a;
        public final FareDetailsScreenType b;
        public final ProductBookingNavigation c;
        public final String d;

        public InitialIntent(FareDetailsData fareDetails, FareDetailsScreenType screenType, ProductBookingNavigation productBookingFlowType, String str) {
            Intrinsics.i(fareDetails, "fareDetails");
            Intrinsics.i(screenType, "screenType");
            Intrinsics.i(productBookingFlowType, "productBookingFlowType");
            this.f3933a = fareDetails;
            this.b = screenType;
            this.c = productBookingFlowType;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialIntent)) {
                return false;
            }
            InitialIntent initialIntent = (InitialIntent) obj;
            return Intrinsics.d(this.f3933a, initialIntent.f3933a) && Intrinsics.d(this.b, initialIntent.b) && Intrinsics.d(this.c, initialIntent.c) && Intrinsics.d(this.d, initialIntent.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f3933a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "InitialIntent(fareDetails=" + this.f3933a + ", screenType=" + this.b + ", productBookingFlowType=" + this.c + ", configurationId=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$InitiateOnlinePaymentIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitiateOnlinePaymentIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitiateOnlinePaymentIntent f3934a = new InitiateOnlinePaymentIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$NavigateToHomeScreenIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToHomeScreenIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToHomeScreenIntent f3935a = new NavigateToHomeScreenIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPassengerCategorySelectedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerCategorySelectedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3936a;

        public OnPassengerCategorySelectedIntent(String passengerId) {
            Intrinsics.i(passengerId, "passengerId");
            this.f3936a = passengerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerCategorySelectedIntent) && Intrinsics.d(this.f3936a, ((OnPassengerCategorySelectedIntent) obj).f3936a);
        }

        public final int hashCode() {
            return this.f3936a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerCategorySelectedIntent(passengerId=", this.f3936a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPayButtonClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPayButtonClicked extends FareDetailsIntent {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnPaymentCompletedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPaymentCompletedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3937a;

        public OnPaymentCompletedIntent(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f3937a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPaymentCompletedIntent) && Intrinsics.d(this.f3937a, ((OnPaymentCompletedIntent) obj).f3937a);
        }

        public final int hashCode() {
            return this.f3937a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPaymentCompletedIntent(bookingId=", this.f3937a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnReadMoreFareNoteIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnReadMoreFareNoteIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnReadMoreFareNoteIntent f3938a = new OnReadMoreFareNoteIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnStartIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStartIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStartIntent f3939a = new OnStartIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnStoppedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStoppedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStoppedIntent f3940a = new OnStoppedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OnTncDialoguePositiveBtnClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTncDialoguePositiveBtnClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTncDialoguePositiveBtnClickedIntent f3941a = new OnTncDialoguePositiveBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$OrderCreationErrorDialogOkClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OrderCreationErrorDialogOkClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderCreationErrorDialogOkClickedIntent f3942a = new OrderCreationErrorDialogOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$RetryFareFetchClicked;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryFareFetchClicked extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFareFetchClicked f3943a = new RetryFareFetchClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$TermsAndConditionsTextClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TermsAndConditionsTextClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsAndConditionsTextClickedIntent f3944a = new TermsAndConditionsTextClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoBottomSheetProceedClickedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserBillingInfoBottomSheetProceedClickedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserBillingInfoBottomSheetProceedClickedIntent f3945a = new UserBillingInfoBottomSheetProceedClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoMobileNumberChangedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserBillingInfoMobileNumberChangedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3946a;

        public UserBillingInfoMobileNumberChangedIntent(String str) {
            this.f3946a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserBillingInfoMobileNumberChangedIntent) && Intrinsics.d(this.f3946a, ((UserBillingInfoMobileNumberChangedIntent) obj).f3946a);
        }

        public final int hashCode() {
            return this.f3946a.hashCode();
        }

        public final String toString() {
            return vo1.B("UserBillingInfoMobileNumberChangedIntent(newMobileNumber=", this.f3946a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent$UserBillingInfoNameChangedIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserBillingInfoNameChangedIntent extends FareDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3947a;

        public UserBillingInfoNameChangedIntent(String newName) {
            Intrinsics.i(newName, "newName");
            this.f3947a = newName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserBillingInfoNameChangedIntent) && Intrinsics.d(this.f3947a, ((UserBillingInfoNameChangedIntent) obj).f3947a);
        }

        public final int hashCode() {
            return this.f3947a.hashCode();
        }

        public final String toString() {
            return vo1.B("UserBillingInfoNameChangedIntent(newName=", this.f3947a, ")");
        }
    }
}
