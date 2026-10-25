package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/ItineraryLegItemUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryLegItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItineraryLegItemSpecs f4585a;
    public final LegCardHeaderUiState b;
    public final RouteDetailsUiState c;
    public final AlertTextWithIconUiState d;
    public final EtaAndFareInfoCardUiState e;
    public final BusInfoCardUiState f;
    public final StepCardUIState g;
    public final UiEventHandler$Companion$fromLambda$1 h;

    public ItineraryLegItemUiState(LegCardHeaderUiState legCardHeaderUiState, RouteDetailsUiState routeDetailsUiState, AlertTextWithIconUiState alertTextWithIconUiState, EtaAndFareInfoCardUiState etaAndFareInfoCard, BusInfoCardUiState busInfo, StepCardUIState stepCardUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ItineraryLegItemSpecs itineraryLegItemSpecs = new ItineraryLegItemSpecs();
        Intrinsics.i(etaAndFareInfoCard, "etaAndFareInfoCard");
        Intrinsics.i(busInfo, "busInfo");
        this.f4585a = itineraryLegItemSpecs;
        this.b = legCardHeaderUiState;
        this.c = routeDetailsUiState;
        this.d = alertTextWithIconUiState;
        this.e = etaAndFareInfoCard;
        this.f = busInfo;
        this.g = stepCardUIState;
        this.h = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryLegItemUiState)) {
            return false;
        }
        ItineraryLegItemUiState itineraryLegItemUiState = (ItineraryLegItemUiState) obj;
        return Intrinsics.d(this.f4585a, itineraryLegItemUiState.f4585a) && Intrinsics.d(this.b, itineraryLegItemUiState.b) && Intrinsics.d(this.c, itineraryLegItemUiState.c) && Intrinsics.d(this.d, itineraryLegItemUiState.d) && Intrinsics.d(this.e, itineraryLegItemUiState.e) && Intrinsics.d(this.f, itineraryLegItemUiState.f) && Intrinsics.d(this.g, itineraryLegItemUiState.g) && Intrinsics.d(this.h, itineraryLegItemUiState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f4585a.hashCode() * 31;
        LegCardHeaderUiState legCardHeaderUiState = this.b;
        int iHashCode2 = (iHashCode + (legCardHeaderUiState == null ? 0 : legCardHeaderUiState.hashCode())) * 31;
        RouteDetailsUiState routeDetailsUiState = this.c;
        int iHashCode3 = (iHashCode2 + (routeDetailsUiState == null ? 0 : routeDetailsUiState.hashCode())) * 31;
        AlertTextWithIconUiState alertTextWithIconUiState = this.d;
        int iHashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (alertTextWithIconUiState == null ? 0 : alertTextWithIconUiState.hashCode())) * 31)) * 31)) * 31;
        StepCardUIState stepCardUIState = this.g;
        int iHashCode5 = (iHashCode4 + (stepCardUIState == null ? 0 : stepCardUIState.hashCode())) * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.h;
        return iHashCode5 + (uiEventHandler$Companion$fromLambda$1 != null ? uiEventHandler$Companion$fromLambda$1.hashCode() : 0);
    }

    public final String toString() {
        return "ItineraryLegItemUiState(specs=" + this.f4585a + ", cardHeader=" + this.b + ", routeDetails=" + this.c + ", busLiveUpdateDisclaimer=" + this.d + ", etaAndFareInfoCard=" + this.e + ", busInfo=" + this.f + ", stepCard=" + this.g + ", clickHandler=" + this.h + ")";
    }
}
