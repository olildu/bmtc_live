package app.chalo.checkout.ui.screen.checkout.customurl;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.webview.WebViewUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomUrlCheckoutUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f1456a;
    public final LoadingDialogUIState b;
    public final WebViewUIState c;
    public final ConfirmationDialogUiState d;

    public CustomUrlCheckoutUiState(ToolbarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, WebViewUIState webViewUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        this.f1456a = toolbarUIState;
        this.b = loadingDialogUIState;
        this.c = webViewUIState;
        this.d = confirmationDialogUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUrlCheckoutUiState)) {
            return false;
        }
        CustomUrlCheckoutUiState customUrlCheckoutUiState = (CustomUrlCheckoutUiState) obj;
        return Intrinsics.d(this.f1456a, customUrlCheckoutUiState.f1456a) && Intrinsics.d(this.b, customUrlCheckoutUiState.b) && Intrinsics.d(this.c, customUrlCheckoutUiState.c) && Intrinsics.d(this.d, customUrlCheckoutUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f1456a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iHashCode2 = (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        WebViewUIState webViewUIState = this.c;
        int iHashCode3 = (iHashCode2 + (webViewUIState == null ? 0 : webViewUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.d;
        return iHashCode3 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0);
    }

    public final String toString() {
        return "CustomUrlCheckoutUiState(toolbarUIState=" + this.f1456a + ", loadingDialogueUiState=" + this.b + ", webViewUiState=" + this.c + ", cancelConfirmationDialogUiState=" + this.d + ")";
    }
}
