package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/TicketValidationInfoUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketValidationInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QRCodeUIState f10659a;
    public final TextUIState b;

    public TicketValidationInfoUIState(QRCodeUIState qrCodeUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(qrCodeUIState, "qrCodeUIState");
        this.f10659a = qrCodeUIState;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketValidationInfoUIState)) {
            return false;
        }
        TicketValidationInfoUIState ticketValidationInfoUIState = (TicketValidationInfoUIState) obj;
        return Intrinsics.d(this.f10659a, ticketValidationInfoUIState.f10659a) && Intrinsics.d(this.b, ticketValidationInfoUIState.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10659a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return iHashCode + (textUIState == null ? 0 : textUIState.hashCode());
    }

    public final String toString() {
        return "TicketValidationInfoUIState(qrCodeUIState=" + this.f10659a + ", ticketNumberTextUIState=" + this.b + ")";
    }
}
