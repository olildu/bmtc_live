package app.chalo.uistate.dialog;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ConfirmationDialogActionCtaContainerUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmationDialogActionCtaContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationDialogActionCtaContainerUISpec f9972a;
    public final DialogueCtaUiState b;
    public final DialogueCtaUiState c;

    public ConfirmationDialogActionCtaContainerUiState(DialogueCtaUiState positiveBtn, DialogueCtaUiState dialogueCtaUiState, int i) {
        ConfirmationDialogActionCtaContainerUISpec confirmationDialogActionCtaContainerUISpec = new ConfirmationDialogActionCtaContainerUISpec();
        dialogueCtaUiState = (i & 4) != 0 ? null : dialogueCtaUiState;
        Intrinsics.i(positiveBtn, "positiveBtn");
        this.f9972a = confirmationDialogActionCtaContainerUISpec;
        this.b = positiveBtn;
        this.c = dialogueCtaUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationDialogActionCtaContainerUiState)) {
            return false;
        }
        ConfirmationDialogActionCtaContainerUiState confirmationDialogActionCtaContainerUiState = (ConfirmationDialogActionCtaContainerUiState) obj;
        return Intrinsics.d(this.f9972a, confirmationDialogActionCtaContainerUiState.f9972a) && Intrinsics.d(this.b, confirmationDialogActionCtaContainerUiState.b) && Intrinsics.d(this.c, confirmationDialogActionCtaContainerUiState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f9972a.hashCode() * 31)) * 31;
        DialogueCtaUiState dialogueCtaUiState = this.c;
        return iHashCode + (dialogueCtaUiState == null ? 0 : dialogueCtaUiState.hashCode());
    }

    public final String toString() {
        return "ConfirmationDialogActionCtaContainerUiState(spec=" + this.f9972a + ", positiveBtn=" + this.b + ", negativeBtn=" + this.c + ")";
    }
}
