package app.chalo.uistate.components;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusTicketContainerUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketDetailsContainerSpec f9948a;
    public final DividerUIState b;
    public final RegularBusPickupScheduleUiState c;
    public final RegularBusTicketTripDetailsUiState d;
    public final RegularBusTicketAmountDetailsUiState e;
    public final RegularBusTicketReferenceNumberUiState f;

    /* JADX WARN: Multi-variable type inference failed */
    public RegularBusTicketContainerUiState(DividerUIState dividerUIState, RegularBusPickupScheduleUiState regularBusPickupScheduleUiState, RegularBusTicketTripDetailsUiState regularBusTicketTripDetailsUiState, RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState, RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState, int i) {
        ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec = new ChaloTicketDetailsContainerSpec();
        ChaloColorToken chaloColorToken = null;
        Object[] objArr = 0;
        if ((i & 2) != 0) {
            dividerUIState = new DividerUIState(0.0f, chaloColorToken, objArr == true ? 1 : 0, 7);
        }
        regularBusTicketReferenceNumberUiState = (i & 32) != 0 ? null : regularBusTicketReferenceNumberUiState;
        this.f9948a = chaloTicketDetailsContainerSpec;
        this.b = dividerUIState;
        this.c = regularBusPickupScheduleUiState;
        this.d = regularBusTicketTripDetailsUiState;
        this.e = regularBusTicketAmountDetailsUiState;
        this.f = regularBusTicketReferenceNumberUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketContainerUiState)) {
            return false;
        }
        RegularBusTicketContainerUiState regularBusTicketContainerUiState = (RegularBusTicketContainerUiState) obj;
        return Intrinsics.d(this.f9948a, regularBusTicketContainerUiState.f9948a) && Intrinsics.d(this.b, regularBusTicketContainerUiState.b) && Intrinsics.d(this.c, regularBusTicketContainerUiState.c) && Intrinsics.d(this.d, regularBusTicketContainerUiState.d) && Intrinsics.d(this.e, regularBusTicketContainerUiState.e) && Intrinsics.d(this.f, regularBusTicketContainerUiState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f9948a.hashCode() * 31;
        DividerUIState dividerUIState = this.b;
        int iHashCode2 = (iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        RegularBusPickupScheduleUiState regularBusPickupScheduleUiState = this.c;
        int iHashCode3 = (iHashCode2 + (regularBusPickupScheduleUiState == null ? 0 : regularBusPickupScheduleUiState.hashCode())) * 31;
        RegularBusTicketTripDetailsUiState regularBusTicketTripDetailsUiState = this.d;
        int iHashCode4 = (iHashCode3 + (regularBusTicketTripDetailsUiState == null ? 0 : regularBusTicketTripDetailsUiState.hashCode())) * 31;
        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState = this.e;
        int iHashCode5 = (iHashCode4 + (regularBusTicketAmountDetailsUiState == null ? 0 : regularBusTicketAmountDetailsUiState.hashCode())) * 31;
        RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState = this.f;
        return iHashCode5 + (regularBusTicketReferenceNumberUiState != null ? regularBusTicketReferenceNumberUiState.hashCode() : 0);
    }

    public final String toString() {
        return "RegularBusTicketContainerUiState(spec=" + this.f9948a + ", dividerState=" + this.b + ", ticketSchedule=" + this.c + ", ticketTripDetails=" + this.d + ", ticketAmountDetails=" + this.e + ", ticketReferenceNumberUiState=" + this.f + ")";
    }
}
