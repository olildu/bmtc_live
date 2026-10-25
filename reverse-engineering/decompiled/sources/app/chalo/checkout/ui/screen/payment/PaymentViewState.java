package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentScreenUiSpec f1577a;
    public final ToolbarUIState b;
    public final ConfirmationDialogUiState c;
    public final List d;
    public final NoUpiAppsErrorUiState e;
    public final PaymentBottomSheetUiType f;
    public final BottomSheetUiState g;
    public final LoadingDialogUIState h;
    public final CircularProgressIndicatorUIState i;
    public final SnackbarUIState j;
    public final StandardErrorScreenUIState k;
    public final UiEventHandler l;

    public PaymentViewState(ToolbarUIState toolbarUIState, ConfirmationDialogUiState confirmationDialogUiState, List paymentCardListUiState, NoUpiAppsErrorUiState noUpiAppsErrorUiState, PaymentBottomSheetUiType paymentBottomSheetUiType, BottomSheetUiState bottomSheetUiState, LoadingDialogUIState loadingDialogUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, SnackbarUIState snackbarUIState, StandardErrorScreenUIState standardErrorScreenUIState, UiEventHandler backPressedEventHandler) {
        PaymentScreenUiSpec paymentScreenUiSpec = new PaymentScreenUiSpec();
        Intrinsics.i(paymentCardListUiState, "paymentCardListUiState");
        Intrinsics.i(bottomSheetUiState, "bottomSheetUiState");
        Intrinsics.i(backPressedEventHandler, "backPressedEventHandler");
        this.f1577a = paymentScreenUiSpec;
        this.b = toolbarUIState;
        this.c = confirmationDialogUiState;
        this.d = paymentCardListUiState;
        this.e = noUpiAppsErrorUiState;
        this.f = paymentBottomSheetUiType;
        this.g = bottomSheetUiState;
        this.h = loadingDialogUIState;
        this.i = circularProgressIndicatorUIState;
        this.j = snackbarUIState;
        this.k = standardErrorScreenUIState;
        this.l = backPressedEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentViewState)) {
            return false;
        }
        PaymentViewState paymentViewState = (PaymentViewState) obj;
        return Intrinsics.d(this.f1577a, paymentViewState.f1577a) && Intrinsics.d(this.b, paymentViewState.b) && Intrinsics.d(this.c, paymentViewState.c) && Intrinsics.d(this.d, paymentViewState.d) && Intrinsics.d(this.e, paymentViewState.e) && Intrinsics.d(this.f, paymentViewState.f) && Intrinsics.d(this.g, paymentViewState.g) && Intrinsics.d(this.h, paymentViewState.h) && Intrinsics.d(this.i, paymentViewState.i) && Intrinsics.d(this.j, paymentViewState.j) && Intrinsics.d(this.k, paymentViewState.k) && Intrinsics.d(this.l, paymentViewState.l);
    }

    public final int hashCode() {
        int iHashCode = this.f1577a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iHashCode2 = (iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.c;
        int iB = r30.b((iHashCode2 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31, 31, this.d);
        NoUpiAppsErrorUiState noUpiAppsErrorUiState = this.e;
        int iHashCode3 = (iB + (noUpiAppsErrorUiState == null ? 0 : noUpiAppsErrorUiState.hashCode())) * 31;
        PaymentBottomSheetUiType paymentBottomSheetUiType = this.f;
        int iHashCode4 = (this.g.hashCode() + ((iHashCode3 + (paymentBottomSheetUiType == null ? 0 : paymentBottomSheetUiType.hashCode())) * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.h;
        int iHashCode5 = (iHashCode4 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.i;
        int iHashCode6 = (iHashCode5 + (circularProgressIndicatorUIState == null ? 0 : circularProgressIndicatorUIState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.j;
        int iHashCode7 = (iHashCode6 + (snackbarUIState == null ? 0 : snackbarUIState.hashCode())) * 31;
        StandardErrorScreenUIState standardErrorScreenUIState = this.k;
        return (this.l.hashCode() + ((iHashCode7 + (standardErrorScreenUIState != null ? standardErrorScreenUIState.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "PaymentViewState(paymentScreenUiSpec=" + this.f1577a + ", toolbarUiState=" + this.b + ", confirmationDialogUiState=" + this.c + ", paymentCardListUiState=" + this.d + ", noUpiAppsErrorUiState=" + this.e + ", bottomSheetContentUiType=" + this.f + ", bottomSheetUiState=" + this.g + ", loaderUiState=" + this.h + ", fullScreenLoaderUiState=" + this.i + ", snackbarUIState=" + this.j + ", fullScreenErrorUiState=" + this.k + ", backPressedEventHandler=" + this.l + ", paymentNativeAdUiState=null)";
    }
}
