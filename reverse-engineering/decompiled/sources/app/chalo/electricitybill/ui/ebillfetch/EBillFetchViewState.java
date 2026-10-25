package app.chalo.electricitybill.ui.ebillfetch;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillFetchViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillFetchUISpecs f2568a;
    public final ToolbarUIState b;
    public final LoadingDialogUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final BaseTextFieldUIState.TextFieldUIState f;
    public final TextUIState.ChaloTextUIState g;
    public final ButtonUIState h;
    public final ClickableTextUiState i;
    public final ConfirmationDialogUiState j;
    public final SnackbarUIState k;

    public EBillFetchViewState(EBillFetchUISpecs specs, ToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState subTitle, BaseTextFieldUIState.TextFieldUIState textFieldUIState, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState proceedButton, ClickableTextUiState viewHistoryBtn, ConfirmationDialogUiState confirmationDialogUiState, SnackbarUIState snackbarUIState) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(title, "title");
        Intrinsics.i(subTitle, "subTitle");
        Intrinsics.i(textFieldUIState, "textFieldUIState");
        Intrinsics.i(proceedButton, "proceedButton");
        Intrinsics.i(viewHistoryBtn, "viewHistoryBtn");
        this.f2568a = specs;
        this.b = toolbarUIState;
        this.c = loadingDialogUIState;
        this.d = title;
        this.e = subTitle;
        this.f = textFieldUIState;
        this.g = chaloTextUIState;
        this.h = proceedButton;
        this.i = viewHistoryBtn;
        this.j = confirmationDialogUiState;
        this.k = snackbarUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillFetchViewState)) {
            return false;
        }
        EBillFetchViewState eBillFetchViewState = (EBillFetchViewState) obj;
        return Intrinsics.d(this.f2568a, eBillFetchViewState.f2568a) && Intrinsics.d(this.b, eBillFetchViewState.b) && Intrinsics.d(this.c, eBillFetchViewState.c) && Intrinsics.d(this.d, eBillFetchViewState.d) && Intrinsics.d(this.e, eBillFetchViewState.e) && Intrinsics.d(this.f, eBillFetchViewState.f) && Intrinsics.d(this.g, eBillFetchViewState.g) && Intrinsics.d(this.h, eBillFetchViewState.h) && Intrinsics.d(this.i, eBillFetchViewState.i) && Intrinsics.d(this.j, eBillFetchViewState.j) && Intrinsics.d(this.k, eBillFetchViewState.k);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f2568a.hashCode() * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.c;
        int iHashCode = (this.f.hashCode() + r30.f(this.e, r30.f(this.d, (iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31), 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.g;
        int iHashCode2 = (this.i.hashCode() + r30.d(this.h, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31)) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.j;
        int iHashCode3 = (iHashCode2 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.k;
        return iHashCode3 + (snackbarUIState != null ? snackbarUIState.hashCode() : 0);
    }

    public final String toString() {
        return "EBillFetchViewState(specs=" + this.f2568a + ", toolbarUIState=" + this.b + ", loader=" + this.c + ", title=" + this.d + ", subTitle=" + this.e + ", textFieldUIState=" + this.f + ", errorText=" + this.g + ", proceedButton=" + this.h + ", viewHistoryBtn=" + this.i + ", paymentDialogUIState=" + this.j + ", snackbarUIState=" + this.k + ")";
    }
}
