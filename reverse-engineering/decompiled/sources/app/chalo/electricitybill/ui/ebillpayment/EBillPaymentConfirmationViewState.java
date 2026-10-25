package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillPaymentConfirmationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillPaymentConfirmationUISpecs f2578a;
    public final ToolbarUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final CustomerInfoUIState d;
    public final TransactionInfoUIState e;
    public final TotalAmountUIState f;
    public final DividerUIState g;
    public final LoadingDialogUIState h;
    public final TnCDialogUIState i;
    public final SnackbarUIState j;

    public EBillPaymentConfirmationViewState(ToolbarUIState toolbar, TextUIState.ChaloTextUIState title, CustomerInfoUIState customerInfoUIState, TransactionInfoUIState transactionInfoUIState, TotalAmountUIState totalAmountCard, LoadingDialogUIState loadingDialogUIState, TnCDialogUIState tnCDialogUIState, SnackbarUIState snackbarUIState) {
        EBillPaymentConfirmationUISpecs eBillPaymentConfirmationUISpecs = new EBillPaymentConfirmationUISpecs();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.NewActivityColor.f9827a, null, 4);
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(title, "title");
        Intrinsics.i(totalAmountCard, "totalAmountCard");
        this.f2578a = eBillPaymentConfirmationUISpecs;
        this.b = toolbar;
        this.c = title;
        this.d = customerInfoUIState;
        this.e = transactionInfoUIState;
        this.f = totalAmountCard;
        this.g = dividerUIState;
        this.h = loadingDialogUIState;
        this.i = tnCDialogUIState;
        this.j = snackbarUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillPaymentConfirmationViewState)) {
            return false;
        }
        EBillPaymentConfirmationViewState eBillPaymentConfirmationViewState = (EBillPaymentConfirmationViewState) obj;
        return Intrinsics.d(this.f2578a, eBillPaymentConfirmationViewState.f2578a) && Intrinsics.d(this.b, eBillPaymentConfirmationViewState.b) && Intrinsics.d(this.c, eBillPaymentConfirmationViewState.c) && Intrinsics.d(this.d, eBillPaymentConfirmationViewState.d) && Intrinsics.d(this.e, eBillPaymentConfirmationViewState.e) && Intrinsics.d(this.f, eBillPaymentConfirmationViewState.f) && Intrinsics.d(this.g, eBillPaymentConfirmationViewState.g) && Intrinsics.d(this.h, eBillPaymentConfirmationViewState.h) && Intrinsics.d(this.i, eBillPaymentConfirmationViewState.i) && Intrinsics.d(this.j, eBillPaymentConfirmationViewState.j);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, t8.d(this.b, this.f2578a.hashCode() * 31, 31), 31);
        CustomerInfoUIState customerInfoUIState = this.d;
        int iHashCode = (iF + (customerInfoUIState == null ? 0 : customerInfoUIState.hashCode())) * 31;
        TransactionInfoUIState transactionInfoUIState = this.e;
        int iC = py.c(this.g, (this.f.hashCode() + ((iHashCode + (transactionInfoUIState == null ? 0 : transactionInfoUIState.hashCode())) * 31)) * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.h;
        int iHashCode2 = (iC + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        TnCDialogUIState tnCDialogUIState = this.i;
        int iHashCode3 = (iHashCode2 + (tnCDialogUIState == null ? 0 : tnCDialogUIState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.j;
        return iHashCode3 + (snackbarUIState != null ? snackbarUIState.hashCode() : 0);
    }

    public final String toString() {
        return "EBillPaymentConfirmationViewState(specs=" + this.f2578a + ", toolbar=" + this.b + ", title=" + this.c + ", consumerInfo=" + this.d + ", billInfo=" + this.e + ", totalAmountCard=" + this.f + ", divider=" + this.g + ", loader=" + this.h + ", tnCDialog=" + this.i + ", snackbar=" + this.j + ")";
    }
}
