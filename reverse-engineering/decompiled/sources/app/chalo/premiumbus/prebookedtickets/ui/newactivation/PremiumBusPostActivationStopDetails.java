package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PremiumBusPostActivationStopDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPostActivationStopDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7403a;
    public final String b;
    public final boolean c;
    public final StopLiveEtaUiModel d;
    public final BusPassedDetails e;

    public PremiumBusPostActivationStopDetails(String stopId, String stopName, boolean z, StopLiveEtaUiModel stopLiveEtaUiModel, BusPassedDetails busPassedDetails) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f7403a = stopId;
        this.b = stopName;
        this.c = z;
        this.d = stopLiveEtaUiModel;
        this.e = busPassedDetails;
    }

    public static PremiumBusPostActivationStopDetails a(PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails, boolean z, StopLiveEtaUiModel stopLiveEtaUiModel, BusPassedDetails busPassedDetails, int i) {
        String stopId = premiumBusPostActivationStopDetails.f7403a;
        String stopName = premiumBusPostActivationStopDetails.b;
        if ((i & 4) != 0) {
            z = premiumBusPostActivationStopDetails.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            stopLiveEtaUiModel = premiumBusPostActivationStopDetails.d;
        }
        StopLiveEtaUiModel stopLiveEtaUiModel2 = stopLiveEtaUiModel;
        if ((i & 16) != 0) {
            busPassedDetails = premiumBusPostActivationStopDetails.e;
        }
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        return new PremiumBusPostActivationStopDetails(stopId, stopName, z2, stopLiveEtaUiModel2, busPassedDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPostActivationStopDetails)) {
            return false;
        }
        PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails = (PremiumBusPostActivationStopDetails) obj;
        return Intrinsics.d(this.f7403a, premiumBusPostActivationStopDetails.f7403a) && Intrinsics.d(this.b, premiumBusPostActivationStopDetails.b) && this.c == premiumBusPostActivationStopDetails.c && Intrinsics.d(this.d, premiumBusPostActivationStopDetails.d) && Intrinsics.d(this.e, premiumBusPostActivationStopDetails.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((nf1.e(this.f7403a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusPostActivationStopDetails(stopId=", this.f7403a, ", stopName=", this.b, ", isSelectedToViewETA=");
        sbE.append(this.c);
        sbE.append(", etaUiModel=");
        sbE.append(this.d);
        sbE.append(", busPassedDetails=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
