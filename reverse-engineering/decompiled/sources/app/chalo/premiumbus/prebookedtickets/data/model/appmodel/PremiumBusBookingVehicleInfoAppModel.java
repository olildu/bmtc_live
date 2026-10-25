package app.chalo.premiumbus.prebookedtickets.data.model.appmodel;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import defpackage.r1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel;", "", "NotFetched", "VehicleNotAssigned", "VehicleAssigned", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$VehicleAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$VehicleNotAssigned;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBookingVehicleInfoAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotFetched extends PremiumBusBookingVehicleInfoAppModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFetched);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NotFetched(seats=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$VehicleAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleAssigned extends PremiumBusBookingVehicleInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7291a;
        public final PremiumBusTripStatus b;
        public final List c;
        public final List d;

        public VehicleAssigned(String vehicleNumber, PremiumBusTripStatus premiumBusTripStatus, List assignedSeats, List seats) {
            Intrinsics.i(vehicleNumber, "vehicleNumber");
            Intrinsics.i(assignedSeats, "assignedSeats");
            Intrinsics.i(seats, "seats");
            this.f7291a = vehicleNumber;
            this.b = premiumBusTripStatus;
            this.c = assignedSeats;
            this.d = seats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VehicleAssigned)) {
                return false;
            }
            VehicleAssigned vehicleAssigned = (VehicleAssigned) obj;
            return Intrinsics.d(this.f7291a, vehicleAssigned.f7291a) && this.b == vehicleAssigned.b && Intrinsics.d(this.c, vehicleAssigned.c) && Intrinsics.d(this.d, vehicleAssigned.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.b((this.b.hashCode() + (this.f7291a.hashCode() * 29791)) * 31, 31, this.c);
        }

        public final String toString() {
            return "VehicleAssigned(vehicleNumber=" + this.f7291a + ", vehicleName=null, vehicleImageUrl=null, tripStatus=" + this.b + ", assignedSeats=" + this.c + ", seats=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel$VehicleNotAssigned;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingVehicleInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleNotAssigned extends PremiumBusBookingVehicleInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7292a;

        public VehicleNotAssigned(List seats) {
            Intrinsics.i(seats, "seats");
            this.f7292a = seats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VehicleNotAssigned) && Intrinsics.d(this.f7292a, ((VehicleNotAssigned) obj).f7292a);
        }

        public final int hashCode() {
            return this.f7292a.hashCode();
        }

        public final String toString() {
            return r1.d("VehicleNotAssigned(seats=", ")", this.f7292a);
        }
    }
}
