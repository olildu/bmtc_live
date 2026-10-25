package app.chalo.uistate.components;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusTicketReferenceNumberUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketReferenceNumberUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegularBusTicketReferenceSpec f9949a = new RegularBusTicketReferenceSpec();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public RegularBusTicketReferenceNumberUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketReferenceNumberUiState)) {
            return false;
        }
        RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState = (RegularBusTicketReferenceNumberUiState) obj;
        return Intrinsics.d(this.f9949a, regularBusTicketReferenceNumberUiState.f9949a) && Intrinsics.d(this.b, regularBusTicketReferenceNumberUiState.b) && Intrinsics.d(this.c, regularBusTicketReferenceNumberUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f9949a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularBusTicketReferenceNumberUiState(spec=");
        sb.append(this.f9949a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        return py.f(sb, this.c, ")");
    }
}
