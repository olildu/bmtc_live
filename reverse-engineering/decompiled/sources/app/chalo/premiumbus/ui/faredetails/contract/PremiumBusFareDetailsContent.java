package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "", "InitialLoading", "Error", "FreshPurchase", "ThroughPass", "PassUpsellNudge", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$Error;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$FreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$InitialLoading;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$PassUpsellNudge;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$ThroughPass;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsContent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$Error;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends PremiumBusFareDetailsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SnackbarUIState f7573a;
        public final PremiumBusFareDetailsErrorScreenUiState b;

        public Error(SnackbarUIState snackbarUIState, PremiumBusFareDetailsErrorScreenUiState premiumBusFareDetailsErrorScreenUiState, int i) {
            snackbarUIState = (i & 1) != 0 ? null : snackbarUIState;
            premiumBusFareDetailsErrorScreenUiState = (i & 2) != 0 ? null : premiumBusFareDetailsErrorScreenUiState;
            this.f7573a = snackbarUIState;
            this.b = premiumBusFareDetailsErrorScreenUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.d(this.f7573a, error.f7573a) && Intrinsics.d(this.b, error.b);
        }

        public final int hashCode() {
            SnackbarUIState snackbarUIState = this.f7573a;
            int iHashCode = (snackbarUIState == null ? 0 : snackbarUIState.hashCode()) * 31;
            PremiumBusFareDetailsErrorScreenUiState premiumBusFareDetailsErrorScreenUiState = this.b;
            return iHashCode + (premiumBusFareDetailsErrorScreenUiState != null ? premiumBusFareDetailsErrorScreenUiState.hashCode() : 0);
        }

        public final String toString() {
            return "Error(snackbar=" + this.f7573a + ", errorScreen=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$FreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FreshPurchase extends PremiumBusFareDetailsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusOffersSectionUiState f7574a;
        public final PremiumBusSectionNoteUiState b;
        public final PremiumBusPassengerDetailsSectionUiState c;
        public final PremiumBusFareSplitSectionUiState d;
        public final PremiumBusFareDetailsTermsUiState e;
        public final PremiumBusFareDetailsFooterUiState f;
        public final LoadingDialogUIState g;
        public final ConfirmationDialogUiState h;
        public final PremiumBusFareDetailsBottomSheetUiState i;

        public FreshPurchase(PremiumBusOffersSectionUiState premiumBusOffersSectionUiState, PremiumBusSectionNoteUiState premiumBusSectionNoteUiState, PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState, PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState, PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState, PremiumBusFareDetailsFooterUiState footer, LoadingDialogUIState loadingDialogUIState, ConfirmationDialogUiState confirmationDialogUiState, PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState) {
            Intrinsics.i(footer, "footer");
            this.f7574a = premiumBusOffersSectionUiState;
            this.b = premiumBusSectionNoteUiState;
            this.c = premiumBusPassengerDetailsSectionUiState;
            this.d = premiumBusFareSplitSectionUiState;
            this.e = premiumBusFareDetailsTermsUiState;
            this.f = footer;
            this.g = loadingDialogUIState;
            this.h = confirmationDialogUiState;
            this.i = premiumBusFareDetailsBottomSheetUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshPurchase)) {
                return false;
            }
            FreshPurchase freshPurchase = (FreshPurchase) obj;
            return Intrinsics.d(this.f7574a, freshPurchase.f7574a) && Intrinsics.d(this.b, freshPurchase.b) && Intrinsics.d(this.c, freshPurchase.c) && Intrinsics.d(this.d, freshPurchase.d) && Intrinsics.d(this.e, freshPurchase.e) && Intrinsics.d(this.f, freshPurchase.f) && Intrinsics.d(this.g, freshPurchase.g) && Intrinsics.d(this.h, freshPurchase.h) && Intrinsics.d(this.i, freshPurchase.i);
        }

        public final int hashCode() {
            PremiumBusOffersSectionUiState premiumBusOffersSectionUiState = this.f7574a;
            int iHashCode = (premiumBusOffersSectionUiState == null ? 0 : premiumBusOffersSectionUiState.hashCode()) * 31;
            PremiumBusSectionNoteUiState premiumBusSectionNoteUiState = this.b;
            int iHashCode2 = (iHashCode + (premiumBusSectionNoteUiState == null ? 0 : premiumBusSectionNoteUiState.hashCode())) * 31;
            PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState = this.c;
            int iHashCode3 = (iHashCode2 + (premiumBusPassengerDetailsSectionUiState == null ? 0 : premiumBusPassengerDetailsSectionUiState.hashCode())) * 31;
            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState = this.d;
            int iHashCode4 = (iHashCode3 + (premiumBusFareSplitSectionUiState == null ? 0 : premiumBusFareSplitSectionUiState.hashCode())) * 31;
            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState = this.e;
            int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (premiumBusFareDetailsTermsUiState == null ? 0 : premiumBusFareDetailsTermsUiState.hashCode())) * 31)) * 31;
            LoadingDialogUIState loadingDialogUIState = this.g;
            int iHashCode6 = (iHashCode5 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
            ConfirmationDialogUiState confirmationDialogUiState = this.h;
            int iHashCode7 = (iHashCode6 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
            PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState = this.i;
            return iHashCode7 + (premiumBusFareDetailsBottomSheetUiState != null ? premiumBusFareDetailsBottomSheetUiState.hashCode() : 0);
        }

        public final String toString() {
            return "FreshPurchase(offersSection=" + this.f7574a + ", passengerSelectionNote=" + this.b + ", passengerDetails=" + this.c + ", fareSplit=" + this.d + ", termsAndConditions=" + this.e + ", footer=" + this.f + ", loadingDialogUIState=" + this.g + ", orderCreationErrorDialogUiState=" + this.h + ", bottomSheet=" + this.i + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$InitialLoading;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialLoading extends PremiumBusFareDetailsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialLoading f7575a = new InitialLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        public final int hashCode() {
            return -2057871001;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$PassUpsellNudge;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassUpsellNudge extends PremiumBusFareDetailsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7576a;
        public final PremiumBusIncludedInPassBannerUiState b;
        public final PassUpsellOfferCardUiState c;
        public final PremiumBusFareSplitSectionUiState d;
        public final LoadingDialogUIState e;
        public final PremiumBusFareDetailsTermsUiState f;
        public final PremiumBusFareDetailsBottomSheetUiState g;
        public final ButtonUIState h;
        public final ButtonUIState i;

        public PassUpsellNudge(TextUIState.ChaloTextUIState offersTitleTextUIState, PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState, PassUpsellOfferCardUiState offerCard, PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState, LoadingDialogUIState loadingDialogUIState, PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState, PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState, ButtonUIState payButtonUIState, ButtonUIState removeUpsellButtonUIState) {
            Intrinsics.i(offersTitleTextUIState, "offersTitleTextUIState");
            Intrinsics.i(offerCard, "offerCard");
            Intrinsics.i(payButtonUIState, "payButtonUIState");
            Intrinsics.i(removeUpsellButtonUIState, "removeUpsellButtonUIState");
            this.f7576a = offersTitleTextUIState;
            this.b = premiumBusIncludedInPassBannerUiState;
            this.c = offerCard;
            this.d = premiumBusFareSplitSectionUiState;
            this.e = loadingDialogUIState;
            this.f = premiumBusFareDetailsTermsUiState;
            this.g = premiumBusFareDetailsBottomSheetUiState;
            this.h = payButtonUIState;
            this.i = removeUpsellButtonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassUpsellNudge)) {
                return false;
            }
            PassUpsellNudge passUpsellNudge = (PassUpsellNudge) obj;
            return Intrinsics.d(this.f7576a, passUpsellNudge.f7576a) && Intrinsics.d(this.b, passUpsellNudge.b) && Intrinsics.d(this.c, passUpsellNudge.c) && Intrinsics.d(this.d, passUpsellNudge.d) && Intrinsics.d(this.e, passUpsellNudge.e) && Intrinsics.d(this.f, passUpsellNudge.f) && Intrinsics.d(this.g, passUpsellNudge.g) && Intrinsics.d(this.h, passUpsellNudge.h) && Intrinsics.d(this.i, passUpsellNudge.i);
        }

        public final int hashCode() {
            int iHashCode = this.f7576a.hashCode() * 31;
            PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (premiumBusIncludedInPassBannerUiState == null ? 0 : premiumBusIncludedInPassBannerUiState.hashCode())) * 31)) * 31;
            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState = this.d;
            int iHashCode3 = (iHashCode2 + (premiumBusFareSplitSectionUiState == null ? 0 : premiumBusFareSplitSectionUiState.hashCode())) * 31;
            LoadingDialogUIState loadingDialogUIState = this.e;
            int iHashCode4 = (iHashCode3 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState = this.f;
            int iHashCode5 = (iHashCode4 + (premiumBusFareDetailsTermsUiState == null ? 0 : premiumBusFareDetailsTermsUiState.hashCode())) * 31;
            PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState = this.g;
            return this.i.hashCode() + r30.d(this.h, (iHashCode5 + (premiumBusFareDetailsBottomSheetUiState != null ? premiumBusFareDetailsBottomSheetUiState.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PassUpsellNudge(offersTitleTextUIState=");
            sb.append(this.f7576a);
            sb.append(", includedInPassBanner=");
            sb.append(this.b);
            sb.append(", offerCard=");
            sb.append(this.c);
            sb.append(", fareSplit=");
            sb.append(this.d);
            sb.append(", loadingDialogUIState=");
            sb.append(this.e);
            sb.append(", termsAndConditions=");
            sb.append(this.f);
            sb.append(", bottomSheet=");
            sb.append(this.g);
            sb.append(", payButtonUIState=");
            sb.append(this.h);
            sb.append(", removeUpsellButtonUIState=");
            return hq0.j(sb, this.i, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent$ThroughPass;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThroughPass extends PremiumBusFareDetailsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusTotalBookingsUiState f7577a;
        public final ButtonUIState b;
        public final LoadingDialogUIState c;
        public final PremiumBusFareDetailsBottomSheetUiState d;
        public final ConfirmationDialogUiState e;
        public final PremiumBusThroughPassUISpecs f;

        public ThroughPass(PremiumBusTotalBookingsUiState totalBookings, ButtonUIState payButtonUIState, LoadingDialogUIState loadingDialogUIState, PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState, ConfirmationDialogUiState confirmationDialogUiState) {
            PremiumBusThroughPassUISpecs premiumBusThroughPassUISpecs = new PremiumBusThroughPassUISpecs();
            Intrinsics.i(totalBookings, "totalBookings");
            Intrinsics.i(payButtonUIState, "payButtonUIState");
            this.f7577a = totalBookings;
            this.b = payButtonUIState;
            this.c = loadingDialogUIState;
            this.d = premiumBusFareDetailsBottomSheetUiState;
            this.e = confirmationDialogUiState;
            this.f = premiumBusThroughPassUISpecs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThroughPass)) {
                return false;
            }
            ThroughPass throughPass = (ThroughPass) obj;
            return Intrinsics.d(this.f7577a, throughPass.f7577a) && Intrinsics.d(this.b, throughPass.b) && Intrinsics.d(this.c, throughPass.c) && Intrinsics.d(this.d, throughPass.d) && Intrinsics.d(this.e, throughPass.e) && Intrinsics.d(this.f, throughPass.f);
        }

        public final int hashCode() {
            int iD = r30.d(this.b, this.f7577a.hashCode() * 31, 31);
            LoadingDialogUIState loadingDialogUIState = this.c;
            int iHashCode = (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
            PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState = this.d;
            int iHashCode2 = (iHashCode + (premiumBusFareDetailsBottomSheetUiState == null ? 0 : premiumBusFareDetailsBottomSheetUiState.hashCode())) * 31;
            ConfirmationDialogUiState confirmationDialogUiState = this.e;
            return this.f.hashCode() + ((iHashCode2 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ThroughPass(totalBookings=" + this.f7577a + ", payButtonUIState=" + this.b + ", loadingDialogUIState=" + this.c + ", bottomSheet=" + this.d + ", orderCreationErrorDialogUiState=" + this.e + ", specs=" + this.f + ")";
        }
    }
}
