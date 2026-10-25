package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "", "NotFetched", "ExpectedTime", "LiveEta", "BusPassedPickupStop", "LiveEtaNotAvailable", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$BusPassedPickupStop;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$ExpectedTime;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$LiveEta;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$LiveEtaNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$NotFetched;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBookingTripTimeInfoState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusTripScheduleTag f7414a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$BusPassedPickupStop;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BusPassedPickupStop extends PremiumBusBookingTripTimeInfoState {
        public static final BusPassedPickupStop b = new BusPassedPickupStop(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BusPassedPickupStop);
        }

        public final int hashCode() {
            return 541131496;
        }

        public final String toString() {
            return "BusPassedPickupStop";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$ExpectedTime;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpectedTime extends PremiumBusBookingTripTimeInfoState {
        public final String b;
        public final PremiumBusTripScheduleTag c;
        public final long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpectedTime(String timeString, PremiumBusTripScheduleTag premiumBusTripScheduleTag, long j) {
            super(premiumBusTripScheduleTag);
            Intrinsics.i(timeString, "timeString");
            this.b = timeString;
            this.c = premiumBusTripScheduleTag;
            this.d = j;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PremiumBusTripScheduleTag getF7414a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpectedTime)) {
                return false;
            }
            ExpectedTime expectedTime = (ExpectedTime) obj;
            return Intrinsics.d(this.b, expectedTime.b) && this.c == expectedTime.c && this.d == expectedTime.d;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            PremiumBusTripScheduleTag premiumBusTripScheduleTag = this.c;
            int iHashCode2 = premiumBusTripScheduleTag == null ? 0 : premiumBusTripScheduleTag.hashCode();
            long j = this.d;
            return ((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExpectedTime(timeString=");
            sb.append(this.b);
            sb.append(", tripScheduleTag=");
            sb.append(this.c);
            sb.append(", updatedTripStartTimeInMillisFromPolling=");
            return uf0.m(this.d, ")", sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$LiveEta;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEta extends PremiumBusBookingTripTimeInfoState {
        public final String b;
        public final String c;
        public final PremiumBusTripScheduleTag d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveEta(String etaString, String str, PremiumBusTripScheduleTag premiumBusTripScheduleTag) {
            super(premiumBusTripScheduleTag);
            Intrinsics.i(etaString, "etaString");
            this.b = etaString;
            this.c = str;
            this.d = premiumBusTripScheduleTag;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PremiumBusTripScheduleTag getF7414a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveEta)) {
                return false;
            }
            LiveEta liveEta = (LiveEta) obj;
            return Intrinsics.d(this.b, liveEta.b) && Intrinsics.d(this.c, liveEta.c) && this.d == liveEta.d;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PremiumBusTripScheduleTag premiumBusTripScheduleTag = this.d;
            return iHashCode2 + (premiumBusTripScheduleTag != null ? premiumBusTripScheduleTag.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("LiveEta(etaString=", this.b, ", etaLastUpdatedAtStatus=", this.c, ", tripScheduleTag=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$LiveEtaNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEtaNotAvailable extends PremiumBusBookingTripTimeInfoState {
        public static final LiveEtaNotAvailable b = new LiveEtaNotAvailable(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiveEtaNotAvailable);
        }

        public final int hashCode() {
            return 574273654;
        }

        public final String toString() {
            return "LiveEtaNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingTripTimeInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotFetched extends PremiumBusBookingTripTimeInfoState {
        public static final NotFetched b = new NotFetched(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFetched);
        }

        public final int hashCode() {
            return 1580931628;
        }

        public final String toString() {
            return "NotFetched";
        }
    }

    public PremiumBusBookingTripTimeInfoState(PremiumBusTripScheduleTag premiumBusTripScheduleTag) {
        this.f7414a = premiumBusTripScheduleTag;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public PremiumBusTripScheduleTag getF7414a() {
        return this.f7414a;
    }
}
