package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.MultipleOriginDestinationSelectionScreenUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "", "NoOriginDestinationPairsAvailable", "NewRouteSuggestion", "NewRouteSuggestionSubmitSuccess", "MultipleOriginDestinationSelection", "NoProductFoundBottomSheet", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$MultipleOriginDestinationSelection;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NewRouteSuggestion;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NewRouteSuggestionSubmitSuccess;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NoOriginDestinationPairsAvailable;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NoProductFoundBottomSheet;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBPassPurchaseLandingScreenBottomSheetTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$MultipleOriginDestinationSelection;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleOriginDestinationSelection extends PBPassPurchaseLandingScreenBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultipleOriginDestinationSelectionScreenUIState f7644a;

        public MultipleOriginDestinationSelection(MultipleOriginDestinationSelectionScreenUIState multipleOriginDestinationSelectionScreenUIState) {
            this.f7644a = multipleOriginDestinationSelectionScreenUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleOriginDestinationSelection) && Intrinsics.d(this.f7644a, ((MultipleOriginDestinationSelection) obj).f7644a);
        }

        public final int hashCode() {
            return this.f7644a.hashCode();
        }

        public final String toString() {
            return "MultipleOriginDestinationSelection(uiState=" + this.f7644a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NewRouteSuggestion;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestion extends PBPassPurchaseLandingScreenBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewRouteSuggestionUIState f7645a;

        public NewRouteSuggestion(NewRouteSuggestionUIState newRouteSuggestionUIState) {
            this.f7645a = newRouteSuggestionUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewRouteSuggestion) && Intrinsics.d(this.f7645a, ((NewRouteSuggestion) obj).f7645a);
        }

        public final int hashCode() {
            return this.f7645a.hashCode();
        }

        public final String toString() {
            return "NewRouteSuggestion(uiState=" + this.f7645a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NewRouteSuggestionSubmitSuccess;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionSubmitSuccess extends PBPassPurchaseLandingScreenBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f7646a;

        public NewRouteSuggestionSubmitSuccess(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f7646a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewRouteSuggestionSubmitSuccess) && Intrinsics.d(this.f7646a, ((NewRouteSuggestionSubmitSuccess) obj).f7646a);
        }

        public final int hashCode() {
            return this.f7646a.hashCode();
        }

        public final String toString() {
            return "NewRouteSuggestionSubmitSuccess(uiState=" + this.f7646a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NoOriginDestinationPairsAvailable;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoOriginDestinationPairsAvailable extends PBPassPurchaseLandingScreenBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f7647a;

        public NoOriginDestinationPairsAvailable(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f7647a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoOriginDestinationPairsAvailable) && Intrinsics.d(this.f7647a, ((NoOriginDestinationPairsAvailable) obj).f7647a);
        }

        public final int hashCode() {
            return this.f7647a.hashCode();
        }

        public final String toString() {
            return "NoOriginDestinationPairsAvailable(uiState=" + this.f7647a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState$NoProductFoundBottomSheet;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PBPassPurchaseLandingScreenBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoProductFoundBottomSheet extends PBPassPurchaseLandingScreenBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f7648a;

        public NoProductFoundBottomSheet(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f7648a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoProductFoundBottomSheet) && Intrinsics.d(this.f7648a, ((NoProductFoundBottomSheet) obj).f7648a);
        }

        public final int hashCode() {
            return this.f7648a.hashCode();
        }

        public final String toString() {
            return "NoProductFoundBottomSheet(uiState=" + this.f7648a + ")";
        }
    }
}
