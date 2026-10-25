package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsTripSummaryUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsTripSummaryUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRouteDetailsUiState f7613a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final PremiumBusIconWithTextUiState d;
    public final PremiumBusSelectedSeatsUiState e;
    public final PremiumBusTripSummaryUISpecs f;

    public PremiumBusFareDetailsTripSummaryUiState(PremiumBusRouteDetailsUiState routeDetails, TextUIState.ChaloTextUIState startStopNameTextUIState, TextUIState.ChaloTextUIState endStopNameTextUIState, PremiumBusIconWithTextUiState premiumBusIconWithTextUiState, PremiumBusSelectedSeatsUiState premiumBusSelectedSeatsUiState) {
        PremiumBusTripSummaryUISpecs premiumBusTripSummaryUISpecs = new PremiumBusTripSummaryUISpecs();
        Intrinsics.i(routeDetails, "routeDetails");
        Intrinsics.i(startStopNameTextUIState, "startStopNameTextUIState");
        Intrinsics.i(endStopNameTextUIState, "endStopNameTextUIState");
        this.f7613a = routeDetails;
        this.b = startStopNameTextUIState;
        this.c = endStopNameTextUIState;
        this.d = premiumBusIconWithTextUiState;
        this.e = premiumBusSelectedSeatsUiState;
        this.f = premiumBusTripSummaryUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsTripSummaryUiState)) {
            return false;
        }
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState = (PremiumBusFareDetailsTripSummaryUiState) obj;
        return Intrinsics.d(this.f7613a, premiumBusFareDetailsTripSummaryUiState.f7613a) && Intrinsics.d(this.b, premiumBusFareDetailsTripSummaryUiState.b) && Intrinsics.d(this.c, premiumBusFareDetailsTripSummaryUiState.c) && Intrinsics.d(this.d, premiumBusFareDetailsTripSummaryUiState.d) && Intrinsics.d(this.e, premiumBusFareDetailsTripSummaryUiState.e) && Intrinsics.d(this.f, premiumBusFareDetailsTripSummaryUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f7613a.hashCode() * 31, 31), 31);
        PremiumBusIconWithTextUiState premiumBusIconWithTextUiState = this.d;
        int iHashCode = (iF + (premiumBusIconWithTextUiState == null ? 0 : premiumBusIconWithTextUiState.hashCode())) * 31;
        PremiumBusSelectedSeatsUiState premiumBusSelectedSeatsUiState = this.e;
        return this.f.hashCode() + ((iHashCode + (premiumBusSelectedSeatsUiState != null ? premiumBusSelectedSeatsUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PremiumBusFareDetailsTripSummaryUiState(routeDetails=" + this.f7613a + ", startStopNameTextUIState=" + this.b + ", endStopNameTextUIState=" + this.c + ", departureTime=" + this.d + ", selectedSeats=" + this.e + ", specs=" + this.f + ")";
    }
}
