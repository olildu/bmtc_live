package app.chalo.sos;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SosScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SosScreenTypeUIState f9421a;
    public final SendSosConfirmationDialog b;
    public final boolean c;

    public SosScreenUIState(SosScreenTypeUIState screen, SendSosConfirmationDialog sendSosConfirmationDialog, boolean z) {
        Intrinsics.i(screen, "screen");
        this.f9421a = screen;
        this.b = sendSosConfirmationDialog;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosScreenUIState)) {
            return false;
        }
        SosScreenUIState sosScreenUIState = (SosScreenUIState) obj;
        return Intrinsics.d(this.f9421a, sosScreenUIState.f9421a) && Intrinsics.d(this.b, sosScreenUIState.b) && this.c == sosScreenUIState.c;
    }

    public final int hashCode() {
        int iHashCode = this.f9421a.hashCode() * 31;
        SendSosConfirmationDialog sendSosConfirmationDialog = this.b;
        return ((iHashCode + (sendSosConfirmationDialog == null ? 0 : sendSosConfirmationDialog.hashCode())) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SosScreenUIState(screen=");
        sb.append(this.f9421a);
        sb.append(", sendSosConfirmationDialog=");
        sb.append(this.b);
        sb.append(", isSOSConfirmationDialogClicked=");
        return b3.g(")", sb, this.c);
    }
}
