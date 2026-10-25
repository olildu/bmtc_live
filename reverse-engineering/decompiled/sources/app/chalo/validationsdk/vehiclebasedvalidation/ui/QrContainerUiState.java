package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QrContainerUiState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f10733a;
    public final QrContainerSpec b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final QrUistate e;
    public final TicketExpiryContainer f;

    public QrContainerUiState(CardUISpec cardSpec, QrContainerSpec spec, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, QrUistate qr, TicketExpiryContainer ticketExpiryContainer) {
        Intrinsics.i(cardSpec, "cardSpec");
        Intrinsics.i(spec, "spec");
        Intrinsics.i(title, "title");
        Intrinsics.i(qr, "qr");
        this.f10733a = cardSpec;
        this.b = spec;
        this.c = title;
        this.d = chaloTextUIState;
        this.e = qr;
        this.f = ticketExpiryContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrContainerUiState)) {
            return false;
        }
        QrContainerUiState qrContainerUiState = (QrContainerUiState) obj;
        return Intrinsics.d(this.f10733a, qrContainerUiState.f10733a) && Intrinsics.d(this.b, qrContainerUiState.b) && Intrinsics.d(this.c, qrContainerUiState.c) && Intrinsics.d(this.d, qrContainerUiState.d) && Intrinsics.d(this.e, qrContainerUiState.e) && Intrinsics.d(this.f, qrContainerUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, (this.b.hashCode() + (this.f10733a.hashCode() * 31)) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode = (this.e.hashCode() + ((iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
        TicketExpiryContainer ticketExpiryContainer = this.f;
        return iHashCode + (ticketExpiryContainer != null ? ticketExpiryContainer.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrContainerUiState(cardSpec=");
        sb.append(this.f10733a);
        sb.append(", spec=");
        sb.append(this.b);
        sb.append(", title=");
        r30.p(sb, this.c, ", description=", this.d, ", qr=");
        sb.append(this.e);
        sb.append(", expiryTime=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
