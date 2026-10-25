package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import defpackage.r1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState;", "", "NotFetched", "VehicleNotAssigned", "VehicleAssigned", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$VehicleAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$VehicleNotAssigned;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBookingVehicleInfoState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7415a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotFetched extends PremiumBusBookingVehicleInfoState {
        public final List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotFetched(List seats) {
            super(seats);
            Intrinsics.i(seats, "seats");
            this.b = seats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotFetched) && Intrinsics.d(this.b, ((NotFetched) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("NotFetched(seats=", ")", this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$VehicleAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleAssigned extends PremiumBusBookingVehicleInfoState {
        public final String b;
        public final PremiumBusTripStatus c;
        public final List d;
        public final List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VehicleAssigned(String vehicleNumber, PremiumBusTripStatus premiumBusTripStatus, List assignedSeats, List seats) {
            super(seats);
            Intrinsics.i(vehicleNumber, "vehicleNumber");
            Intrinsics.i(assignedSeats, "assignedSeats");
            Intrinsics.i(seats, "seats");
            this.b = vehicleNumber;
            this.c = premiumBusTripStatus;
            this.d = assignedSeats;
            this.e = seats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VehicleAssigned)) {
                return false;
            }
            VehicleAssigned vehicleAssigned = (VehicleAssigned) obj;
            return Intrinsics.d(this.b, vehicleAssigned.b) && this.c == vehicleAssigned.c && Intrinsics.d(this.d, vehicleAssigned.d) && Intrinsics.d(this.e, vehicleAssigned.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + r30.b((this.c.hashCode() + (this.b.hashCode() * 29791)) * 31, 31, this.d);
        }

        public final String toString() {
            return "VehicleAssigned(vehicleNumber=" + this.b + ", vehicleName=null, vehicleImageUrl=null, tripStatus=" + this.c + ", assignedSeats=" + this.d + ", seats=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState$VehicleNotAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingVehicleInfoState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleNotAssigned extends PremiumBusBookingVehicleInfoState {
        public final List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VehicleNotAssigned(List seats) {
            super(seats);
            Intrinsics.i(seats, "seats");
            this.b = seats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VehicleNotAssigned) && Intrinsics.d(this.b, ((VehicleNotAssigned) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("VehicleNotAssigned(seats=", ")", this.b);
        }
    }

    public PremiumBusBookingVehicleInfoState(List list) {
        this.f7415a = list;
    }
}
