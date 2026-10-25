package app.chalo.productactivation.ui.uistate;

import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketFooterUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketFooterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationTicketFooterUISpecs f8060a;
    public final AlertTextWithIconUiState b;
    public final AlertTextWithIconUiState c;
    public final TextUIState.StyledTextUIState d;
    public final List e;

    public ActivationTicketFooterUIState(AlertTextWithIconUiState alertTextWithIconUiState, AlertTextWithIconUiState alertTextWithIconUiState2, TextUIState.StyledTextUIState styledTextUIState, List ctaButtonUIStateList, int i) {
        ActivationTicketFooterUISpecs activationTicketFooterUISpecs = new ActivationTicketFooterUISpecs();
        alertTextWithIconUiState = (i & 2) != 0 ? null : alertTextWithIconUiState;
        alertTextWithIconUiState2 = (i & 4) != 0 ? null : alertTextWithIconUiState2;
        Intrinsics.i(ctaButtonUIStateList, "ctaButtonUIStateList");
        this.f8060a = activationTicketFooterUISpecs;
        this.b = alertTextWithIconUiState;
        this.c = alertTextWithIconUiState2;
        this.d = styledTextUIState;
        this.e = ctaButtonUIStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketFooterUIState)) {
            return false;
        }
        ActivationTicketFooterUIState activationTicketFooterUIState = (ActivationTicketFooterUIState) obj;
        return Intrinsics.d(this.f8060a, activationTicketFooterUIState.f8060a) && Intrinsics.d(this.b, activationTicketFooterUIState.b) && Intrinsics.d(this.c, activationTicketFooterUIState.c) && Intrinsics.d(this.d, activationTicketFooterUIState.d) && Intrinsics.d(this.e, activationTicketFooterUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8060a.hashCode() * 31;
        AlertTextWithIconUiState alertTextWithIconUiState = this.b;
        int iHashCode2 = (iHashCode + (alertTextWithIconUiState == null ? 0 : alertTextWithIconUiState.hashCode())) * 31;
        AlertTextWithIconUiState alertTextWithIconUiState2 = this.c;
        int iHashCode3 = (iHashCode2 + (alertTextWithIconUiState2 == null ? 0 : alertTextWithIconUiState2.hashCode())) * 31;
        TextUIState.StyledTextUIState styledTextUIState = this.d;
        return this.e.hashCode() + ((iHashCode3 + (styledTextUIState != null ? styledTextUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationTicketFooterUIState(specs=");
        sb.append(this.f8060a);
        sb.append(", validityInfoUIState=");
        sb.append(this.b);
        sb.append(", validityDurationInfoUIState=");
        sb.append(this.c);
        sb.append(", expirationInfoTextUIState=");
        sb.append(this.d);
        sb.append(", ctaButtonUIStateList=");
        return xs.l(sb, this.e, ")");
    }
}
