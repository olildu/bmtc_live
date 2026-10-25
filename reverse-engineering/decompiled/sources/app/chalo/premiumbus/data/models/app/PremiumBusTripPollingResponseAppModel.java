package app.chalo.premiumbus.data.models.app;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusTripPollingResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTripPollingResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7107a;
    public final PremiumReserveTicketStatus b;
    public final String c;
    public final String d;
    public final PremiumBusTripStatus e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final List j;
    public final List k;
    public final List l;
    public final long m;
    public final boolean n;
    public final VehicleBreakdownAppResponseModel o;

    public PremiumBusTripPollingResponseAppModel(String bookingId, PremiumReserveTicketStatus premiumReserveTicketStatus, String str, String tripId, PremiumBusTripStatus premiumBusTripStatus, String routeId, String stopId, long j, long j2, List tripCommunicationBanners, List assignedSeats, List seats, long j3, boolean z, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(assignedSeats, "assignedSeats");
        Intrinsics.i(seats, "seats");
        this.f7107a = bookingId;
        this.b = premiumReserveTicketStatus;
        this.c = str;
        this.d = tripId;
        this.e = premiumBusTripStatus;
        this.f = routeId;
        this.g = stopId;
        this.h = j;
        this.i = j2;
        this.j = tripCommunicationBanners;
        this.k = assignedSeats;
        this.l = seats;
        this.m = j3;
        this.n = z;
        this.o = vehicleBreakdownAppResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTripPollingResponseAppModel)) {
            return false;
        }
        PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel = (PremiumBusTripPollingResponseAppModel) obj;
        return Intrinsics.d(this.f7107a, premiumBusTripPollingResponseAppModel.f7107a) && this.b == premiumBusTripPollingResponseAppModel.b && Intrinsics.d(this.c, premiumBusTripPollingResponseAppModel.c) && Intrinsics.d(this.d, premiumBusTripPollingResponseAppModel.d) && this.e == premiumBusTripPollingResponseAppModel.e && Intrinsics.d(this.f, premiumBusTripPollingResponseAppModel.f) && Intrinsics.d(this.g, premiumBusTripPollingResponseAppModel.g) && this.h == premiumBusTripPollingResponseAppModel.h && this.i == premiumBusTripPollingResponseAppModel.i && Intrinsics.d(this.j, premiumBusTripPollingResponseAppModel.j) && Intrinsics.d(this.k, premiumBusTripPollingResponseAppModel.k) && Intrinsics.d(this.l, premiumBusTripPollingResponseAppModel.l) && this.m == premiumBusTripPollingResponseAppModel.m && this.n == premiumBusTripPollingResponseAppModel.n && Intrinsics.d(this.o, premiumBusTripPollingResponseAppModel.o);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f7107a.hashCode() * 31)) * 31;
        String str = this.c;
        int iE = nf1.e(nf1.e((this.e.hashCode() + nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        long j = this.h;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int iB = r30.b(r30.b(r30.b((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.j), 31, this.k), 31, this.l);
        long j3 = this.m;
        int i2 = (((iB + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.n ? 1231 : 1237)) * 31;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel = this.o;
        return i2 + (vehicleBreakdownAppResponseModel != null ? vehicleBreakdownAppResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusTripPollingResponseAppModel(bookingId=");
        sb.append(this.f7107a);
        sb.append(", bookingStatus=");
        sb.append(this.b);
        sb.append(", vehicleNo=");
        cb0.t(sb, this.c, ", tripId=", this.d, ", tripStatus=");
        sb.append(this.e);
        sb.append(", routeId=");
        sb.append(this.f);
        sb.append(", stopId=");
        n21.p(this.h, this.g, ", scheduledStopTime=", sb);
        xs.r(this.i, ", estimatedStopTime=", ", tripCommunicationBanners=", sb);
        dd.o(sb, this.j, ", assignedSeats=", this.k, ", seats=");
        sb.append(this.l);
        sb.append(", updatedTripStartTimeInMillisFromPolling=");
        sb.append(this.m);
        sb.append(", womenAdjacencyPromisedWhileBooking=");
        sb.append(this.n);
        sb.append(", vehicleBreakdown=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
