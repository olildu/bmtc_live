package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusEtaWithSeatAvailabilityAndBonnet;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusEtaWithSeatAvailabilityAndBonnet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteScreenBusNumberUIState f4905a;
    public final ImageUIState b;
    public final BusRealtimeIndicatorUIState c;
    public final TextUIState d;
    public final SeatAvailabilityUIState e;
    public final BusEtaWithSeatAvailabilityUISpec f;

    public BusEtaWithSeatAvailabilityAndBonnet(RouteScreenBusNumberUIState routeScreenBusNumberUIState, ImageUIState imageUIState, BusRealtimeIndicatorUIState busRealtimeIndicatorUIState, TextUIState.ChaloTextUIState etaText, SeatAvailabilityUIState seatAvailabilityUIState) {
        BusEtaWithSeatAvailabilityUISpec busEtaWithSeatAvailabilityUISpec = new BusEtaWithSeatAvailabilityUISpec();
        Intrinsics.i(etaText, "etaText");
        this.f4905a = routeScreenBusNumberUIState;
        this.b = imageUIState;
        this.c = busRealtimeIndicatorUIState;
        this.d = etaText;
        this.e = seatAvailabilityUIState;
        this.f = busEtaWithSeatAvailabilityUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusEtaWithSeatAvailabilityAndBonnet)) {
            return false;
        }
        BusEtaWithSeatAvailabilityAndBonnet busEtaWithSeatAvailabilityAndBonnet = (BusEtaWithSeatAvailabilityAndBonnet) obj;
        return Intrinsics.d(this.f4905a, busEtaWithSeatAvailabilityAndBonnet.f4905a) && Intrinsics.d(this.b, busEtaWithSeatAvailabilityAndBonnet.b) && Intrinsics.d(this.c, busEtaWithSeatAvailabilityAndBonnet.c) && Intrinsics.d(this.d, busEtaWithSeatAvailabilityAndBonnet.d) && Intrinsics.d(this.e, busEtaWithSeatAvailabilityAndBonnet.e) && Intrinsics.d(this.f, busEtaWithSeatAvailabilityAndBonnet.f);
    }

    public final int hashCode() {
        RouteScreenBusNumberUIState routeScreenBusNumberUIState = this.f4905a;
        int iHashCode = (routeScreenBusNumberUIState == null ? 0 : routeScreenBusNumberUIState.hashCode()) * 31;
        ImageUIState imageUIState = this.b;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        BusRealtimeIndicatorUIState busRealtimeIndicatorUIState = this.c;
        int iC = pk0.c(this.d, (iHashCode2 + (busRealtimeIndicatorUIState == null ? 0 : busRealtimeIndicatorUIState.hashCode())) * 31, 31);
        SeatAvailabilityUIState seatAvailabilityUIState = this.e;
        return this.f.hashCode() + ((iC + (seatAvailabilityUIState != null ? seatAvailabilityUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BusEtaWithSeatAvailabilityAndBonnet(busNumber=" + this.f4905a + ", busIcon=" + this.b + ", realIndicatorStatic=" + this.c + ", etaText=" + this.d + ", seatAvailability=" + this.e + ", spec=" + this.f + ")";
    }
}
