package app.chalo.sos;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SendSosConfirmationDialog;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendSosConfirmationDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendSosConfirmationDialogUISpecs f9397a;
    public final DialogUIEventHandler b;
    public final ImageUIState c;
    public final TextUIState d;
    public final TextUIState e;
    public final ImageUIState f;
    public final ButtonUIState g;
    public final ButtonUIState h;

    public SendSosConfirmationDialog(DialogUIEventHandler dialogEventHandler, ImageUIState image, TextUIState title, TextUIState msg, ImageUIState closeBtn, ButtonUIState sendBtn, ButtonUIState buttonUIState) {
        SendSosConfirmationDialogUISpecs sendSosConfirmationDialogUISpecs = new SendSosConfirmationDialogUISpecs();
        Intrinsics.i(dialogEventHandler, "dialogEventHandler");
        Intrinsics.i(image, "image");
        Intrinsics.i(title, "title");
        Intrinsics.i(msg, "msg");
        Intrinsics.i(closeBtn, "closeBtn");
        Intrinsics.i(sendBtn, "sendBtn");
        this.f9397a = sendSosConfirmationDialogUISpecs;
        this.b = dialogEventHandler;
        this.c = image;
        this.d = title;
        this.e = msg;
        this.f = closeBtn;
        this.g = sendBtn;
        this.h = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSosConfirmationDialog)) {
            return false;
        }
        SendSosConfirmationDialog sendSosConfirmationDialog = (SendSosConfirmationDialog) obj;
        return Intrinsics.d(this.f9397a, sendSosConfirmationDialog.f9397a) && Intrinsics.d(this.b, sendSosConfirmationDialog.b) && Intrinsics.d(this.c, sendSosConfirmationDialog.c) && Intrinsics.d(this.d, sendSosConfirmationDialog.d) && Intrinsics.d(this.e, sendSosConfirmationDialog.e) && Intrinsics.d(this.f, sendSosConfirmationDialog.f) && Intrinsics.d(this.g, sendSosConfirmationDialog.g) && Intrinsics.d(this.h, sendSosConfirmationDialog.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + r30.d(this.g, r30.e(this.f, pk0.c(this.e, pk0.c(this.d, r30.e(this.c, (this.b.hashCode() + (this.f9397a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SendSosConfirmationDialog(sendSosConfirmationDialogUISpecs=" + this.f9397a + ", dialogEventHandler=" + this.b + ", image=" + this.c + ", title=" + this.d + ", msg=" + this.e + ", closeBtn=" + this.f + ", sendBtn=" + this.g + ", cancelBtn=" + this.h + ")";
    }
}
