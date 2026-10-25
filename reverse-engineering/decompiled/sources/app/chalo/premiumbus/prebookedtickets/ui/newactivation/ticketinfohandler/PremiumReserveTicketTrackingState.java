package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "", "TrackingNotStarted", "GpsTrackingStarted", "EtaFetchStarted", "GpsTrackingNotAvailable", "Unknown", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$EtaFetchStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$GpsTrackingNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$GpsTrackingStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$TrackingNotStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumReserveTicketTrackingState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$EtaFetchStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EtaFetchStarted extends PremiumReserveTicketTrackingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtaFetchStarted f7476a = new EtaFetchStarted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EtaFetchStarted);
        }

        public final int hashCode() {
            return -84164019;
        }

        public final String toString() {
            return "EtaFetchStarted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$GpsTrackingNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GpsTrackingNotAvailable extends PremiumReserveTicketTrackingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7477a;

        public GpsTrackingNotAvailable(String infoMsg) {
            Intrinsics.i(infoMsg, "infoMsg");
            this.f7477a = infoMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GpsTrackingNotAvailable) && Intrinsics.d(this.f7477a, ((GpsTrackingNotAvailable) obj).f7477a);
        }

        public final int hashCode() {
            return this.f7477a.hashCode();
        }

        public final String toString() {
            return vo1.B("GpsTrackingNotAvailable(infoMsg=", this.f7477a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$GpsTrackingStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GpsTrackingStarted extends PremiumReserveTicketTrackingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7478a;

        public GpsTrackingStarted(String infoMsg) {
            Intrinsics.i(infoMsg, "infoMsg");
            this.f7478a = infoMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GpsTrackingStarted) && Intrinsics.d(this.f7478a, ((GpsTrackingStarted) obj).f7478a);
        }

        public final int hashCode() {
            return this.f7478a.hashCode();
        }

        public final String toString() {
            return vo1.B("GpsTrackingStarted(infoMsg=", this.f7478a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$TrackingNotStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingNotStarted extends PremiumReserveTicketTrackingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7479a;

        public TrackingNotStarted(String infoMsg) {
            Intrinsics.i(infoMsg, "infoMsg");
            this.f7479a = infoMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackingNotStarted) && Intrinsics.d(this.f7479a, ((TrackingNotStarted) obj).f7479a);
        }

        public final int hashCode() {
            return this.f7479a.hashCode();
        }

        public final String toString() {
            return vo1.B("TrackingNotStarted(infoMsg=", this.f7479a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState$Unknown;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketTrackingState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends PremiumReserveTicketTrackingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f7480a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 648160126;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
