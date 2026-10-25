package app.chalo.quickpay.ui.tripamount;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState;", "", "PrerequisitesBottomSheetUIState", "QuickpayConfirmationBottomSheetUIState", "Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState$PrerequisitesBottomSheetUIState;", "Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState$QuickpayConfirmationBottomSheetUIState;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickpayBottomSheetUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState$PrerequisitesBottomSheetUIState;", "Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrerequisitesBottomSheetUIState extends QuickpayBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetUiState f8895a;
        public final BottomSheetStandardContentUiState b;

        public PrerequisitesBottomSheetUIState(BottomSheetUiState bottomSheetUiState, BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            this.f8895a = bottomSheetUiState;
            this.b = bottomSheetStandardContentUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrerequisitesBottomSheetUIState)) {
                return false;
            }
            PrerequisitesBottomSheetUIState prerequisitesBottomSheetUIState = (PrerequisitesBottomSheetUIState) obj;
            return Intrinsics.d(this.f8895a, prerequisitesBottomSheetUIState.f8895a) && Intrinsics.d(this.b, prerequisitesBottomSheetUIState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8895a.hashCode() * 31);
        }

        public final String toString() {
            return "PrerequisitesBottomSheetUIState(bottomSheetState=" + this.f8895a + ", state=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState$QuickpayConfirmationBottomSheetUIState;", "Lapp/chalo/quickpay/ui/tripamount/QuickpayBottomSheetUIState;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickpayConfirmationBottomSheetUIState extends QuickpayBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetUiState f8896a;
        public final QuickpayConfirmationBottomSheetUISpecs b;
        public final QuickpayConfirmationBottomSheetContentUIState c;
        public final CircularProgressIndicatorUIState d;

        public QuickpayConfirmationBottomSheetUIState(BottomSheetUiState bottomSheetUiState, QuickpayConfirmationBottomSheetContentUIState quickpayConfirmationBottomSheetContentUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState) {
            QuickpayConfirmationBottomSheetUISpecs quickpayConfirmationBottomSheetUISpecs = new QuickpayConfirmationBottomSheetUISpecs();
            this.f8896a = bottomSheetUiState;
            this.b = quickpayConfirmationBottomSheetUISpecs;
            this.c = quickpayConfirmationBottomSheetContentUIState;
            this.d = circularProgressIndicatorUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickpayConfirmationBottomSheetUIState)) {
                return false;
            }
            QuickpayConfirmationBottomSheetUIState quickpayConfirmationBottomSheetUIState = (QuickpayConfirmationBottomSheetUIState) obj;
            return Intrinsics.d(this.f8896a, quickpayConfirmationBottomSheetUIState.f8896a) && Intrinsics.d(this.b, quickpayConfirmationBottomSheetUIState.b) && Intrinsics.d(this.c, quickpayConfirmationBottomSheetUIState.c) && Intrinsics.d(this.d, quickpayConfirmationBottomSheetUIState.d);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f8896a.hashCode() * 31)) * 31;
            QuickpayConfirmationBottomSheetContentUIState quickpayConfirmationBottomSheetContentUIState = this.c;
            int iHashCode2 = (iHashCode + (quickpayConfirmationBottomSheetContentUIState == null ? 0 : quickpayConfirmationBottomSheetContentUIState.hashCode())) * 31;
            CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.d;
            return iHashCode2 + (circularProgressIndicatorUIState != null ? circularProgressIndicatorUIState.hashCode() : 0);
        }

        public final String toString() {
            return "QuickpayConfirmationBottomSheetUIState(bottomSheetState=" + this.f8896a + ", specs=" + this.b + ", content=" + this.c + ", progressBar=" + this.d + ")";
        }
    }
}
