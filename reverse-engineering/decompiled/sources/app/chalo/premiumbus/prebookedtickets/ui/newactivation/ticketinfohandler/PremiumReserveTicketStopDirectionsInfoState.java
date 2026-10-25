package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.location.LatLng;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState;", "", "StopLocationAvailable", "StopLocationNotAvailable", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState$StopLocationAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState$StopLocationNotAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumReserveTicketStopDirectionsInfoState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState$StopLocationAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopLocationAvailable extends PremiumReserveTicketStopDirectionsInfoState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7474a;
        public final String b;
        public final LatLng c;

        public StopLocationAvailable(String stopId, String stopName, LatLng stopLocation) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(stopName, "stopName");
            Intrinsics.i(stopLocation, "stopLocation");
            this.f7474a = stopId;
            this.b = stopName;
            this.c = stopLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopLocationAvailable)) {
                return false;
            }
            StopLocationAvailable stopLocationAvailable = (StopLocationAvailable) obj;
            return Intrinsics.d(this.f7474a, stopLocationAvailable.f7474a) && Intrinsics.d(this.b, stopLocationAvailable.b) && Intrinsics.d(this.c, stopLocationAvailable.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f7474a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("StopLocationAvailable(stopId=", this.f7474a, ", stopName=", this.b, ", stopLocation=");
            sbE.append(this.c);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState$StopLocationNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketStopDirectionsInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopLocationNotAvailable extends PremiumReserveTicketStopDirectionsInfoState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopLocationNotAvailable f7475a = new StopLocationNotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StopLocationNotAvailable);
        }

        public final int hashCode() {
            return 328951494;
        }

        public final String toString() {
            return "StopLocationNotAvailable";
        }
    }
}
