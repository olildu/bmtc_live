package app.chalo.uistate.dialog;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ConfirmationDialogUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmationDialogUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationDialogUISpec f9974a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ConfirmationDialogActionCtaContainerUiState d;
    public final DialogUIEventHandler e;

    public ConfirmationDialogUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ConfirmationDialogActionCtaContainerUiState confirmationDialogActionCtaContainerUiState, DialogUIEventHandler dialogUIEventHandler, int i) {
        ConfirmationDialogUISpec confirmationDialogUISpec = new ConfirmationDialogUISpec();
        chaloTextUIState = (i & 2) != 0 ? null : chaloTextUIState;
        chaloTextUIState2 = (i & 4) != 0 ? null : chaloTextUIState2;
        dialogUIEventHandler = (i & 16) != 0 ? DialogUIEventHandler.d : dialogUIEventHandler;
        Intrinsics.i(dialogUIEventHandler, "dialogUIEventHandler");
        this.f9974a = confirmationDialogUISpec;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = confirmationDialogActionCtaContainerUiState;
        this.e = dialogUIEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationDialogUiState)) {
            return false;
        }
        ConfirmationDialogUiState confirmationDialogUiState = (ConfirmationDialogUiState) obj;
        return Intrinsics.d(this.f9974a, confirmationDialogUiState.f9974a) && Intrinsics.d(this.b, confirmationDialogUiState.b) && Intrinsics.d(this.c, confirmationDialogUiState.c) && Intrinsics.d(this.d, confirmationDialogUiState.d) && Intrinsics.d(this.e, confirmationDialogUiState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f9974a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ConfirmationDialogUiState(spec=" + this.f9974a + ", title=" + this.b + ", description=" + this.c + ", actionCtaContainerUiState=" + this.d + ", dialogUIEventHandler=" + this.e + ")";
    }
}
