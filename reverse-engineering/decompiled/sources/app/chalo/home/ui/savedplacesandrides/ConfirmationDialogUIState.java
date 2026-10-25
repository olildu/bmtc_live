package app.chalo.home.ui.savedplacesandrides;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/ConfirmationDialogUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmationDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3673a;
    public final ButtonUIState b;
    public final ButtonUIState c;
    public final ImageUIState d;

    public ConfirmationDialogUIState(ButtonUIState confirmBtnUIState, ButtonUIState buttonUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState messageText) {
        Intrinsics.i(messageText, "messageText");
        Intrinsics.i(confirmBtnUIState, "confirmBtnUIState");
        this.f3673a = messageText;
        this.b = confirmBtnUIState;
        this.c = buttonUIState;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationDialogUIState)) {
            return false;
        }
        ConfirmationDialogUIState confirmationDialogUIState = (ConfirmationDialogUIState) obj;
        return Intrinsics.d(this.f3673a, confirmationDialogUIState.f3673a) && Intrinsics.d(this.b, confirmationDialogUIState.b) && Intrinsics.d(this.c, confirmationDialogUIState.c) && Intrinsics.d(this.d, confirmationDialogUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.d(this.c, r30.d(this.b, this.f3673a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ConfirmationDialogUIState(messageText=" + this.f3673a + ", confirmBtnUIState=" + this.b + ", cancelBtnUIState=" + this.c + ", closeIconUIState=" + this.d + ")";
    }
}
