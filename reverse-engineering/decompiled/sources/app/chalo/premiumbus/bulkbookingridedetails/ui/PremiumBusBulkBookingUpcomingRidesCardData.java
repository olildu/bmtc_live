package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PremiumBusBulkBookingUpcomingRidesCardData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBulkBookingUpcomingRidesCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6939a;
    public final String b;
    public final String c;
    public final PremiumBusBookingVehicleInfoState d;
    public final PremiumBusPostBookingStopSchedule e;
    public final PremiumBusPostBookingStopSchedule f;
    public final PremiumBusBookingTripTimeInfoState g;
    public final String h;
    public final PremiumReserveTicketStatus i;
    public final String j;
    public final String k;
    public final String l;
    public final PremiumReserveTicketStopDirectionsInfoState m;
    public final NewPremiumReserveTicketDetailsScreenType n;
    public final long o;

    public PremiumBusBulkBookingUpcomingRidesCardData(String productType, String productSubType, String bookingId, PremiumBusBookingVehicleInfoState vehicleInfo, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2, PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, String timezoneId, PremiumReserveTicketStatus premiumReserveTicketStatus, String str, String str2, String str3, PremiumReserveTicketStopDirectionsInfoState stopDirectionsInfo, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, long j) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleInfo, "vehicleInfo");
        Intrinsics.i(timezoneId, "timezoneId");
        Intrinsics.i(stopDirectionsInfo, "stopDirectionsInfo");
        this.f6939a = productType;
        this.b = productSubType;
        this.c = bookingId;
        this.d = vehicleInfo;
        this.e = premiumBusPostBookingStopSchedule;
        this.f = premiumBusPostBookingStopSchedule2;
        this.g = premiumBusBookingTripTimeInfoState;
        this.h = timezoneId;
        this.i = premiumReserveTicketStatus;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = stopDirectionsInfo;
        this.n = newPremiumReserveTicketDetailsScreenType;
        this.o = j;
    }

    public static PremiumBusBulkBookingUpcomingRidesCardData a(PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData, PremiumBusBookingVehicleInfoState vehicleInfo, PremiumBusBookingTripTimeInfoState tripTimeInfo, PremiumReserveTicketStopDirectionsInfoState stopDirectionsInfo) {
        premiumBusBulkBookingUpcomingRidesCardData.getClass();
        String productType = premiumBusBulkBookingUpcomingRidesCardData.f6939a;
        String productSubType = premiumBusBulkBookingUpcomingRidesCardData.b;
        String bookingId = premiumBusBulkBookingUpcomingRidesCardData.c;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = premiumBusBulkBookingUpcomingRidesCardData.e;
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule2 = premiumBusBulkBookingUpcomingRidesCardData.f;
        String timezoneId = premiumBusBulkBookingUpcomingRidesCardData.h;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumBusBulkBookingUpcomingRidesCardData.i;
        premiumBusBulkBookingUpcomingRidesCardData.getClass();
        String str = premiumBusBulkBookingUpcomingRidesCardData.j;
        String str2 = premiumBusBulkBookingUpcomingRidesCardData.k;
        String str3 = premiumBusBulkBookingUpcomingRidesCardData.l;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = premiumBusBulkBookingUpcomingRidesCardData.n;
        long j = premiumBusBulkBookingUpcomingRidesCardData.o;
        premiumBusBulkBookingUpcomingRidesCardData.getClass();
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleInfo, "vehicleInfo");
        Intrinsics.i(tripTimeInfo, "tripTimeInfo");
        Intrinsics.i(timezoneId, "timezoneId");
        Intrinsics.i(stopDirectionsInfo, "stopDirectionsInfo");
        return new PremiumBusBulkBookingUpcomingRidesCardData(productType, productSubType, bookingId, vehicleInfo, premiumBusPostBookingStopSchedule, premiumBusPostBookingStopSchedule2, tripTimeInfo, timezoneId, premiumReserveTicketStatus, str, str2, str3, stopDirectionsInfo, newPremiumReserveTicketDetailsScreenType, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBulkBookingUpcomingRidesCardData)) {
            return false;
        }
        PremiumBusBulkBookingUpcomingRidesCardData premiumBusBulkBookingUpcomingRidesCardData = (PremiumBusBulkBookingUpcomingRidesCardData) obj;
        return Intrinsics.d(this.f6939a, premiumBusBulkBookingUpcomingRidesCardData.f6939a) && Intrinsics.d(this.b, premiumBusBulkBookingUpcomingRidesCardData.b) && Intrinsics.d(this.c, premiumBusBulkBookingUpcomingRidesCardData.c) && Intrinsics.d(this.d, premiumBusBulkBookingUpcomingRidesCardData.d) && this.e.equals(premiumBusBulkBookingUpcomingRidesCardData.e) && this.f.equals(premiumBusBulkBookingUpcomingRidesCardData.f) && this.g.equals(premiumBusBulkBookingUpcomingRidesCardData.g) && Intrinsics.d(this.h, premiumBusBulkBookingUpcomingRidesCardData.h) && this.i == premiumBusBulkBookingUpcomingRidesCardData.i && Intrinsics.d(this.j, premiumBusBulkBookingUpcomingRidesCardData.j) && Intrinsics.d(this.k, premiumBusBulkBookingUpcomingRidesCardData.k) && this.l.equals(premiumBusBulkBookingUpcomingRidesCardData.l) && Intrinsics.d(this.m, premiumBusBulkBookingUpcomingRidesCardData.m) && this.n == premiumBusBulkBookingUpcomingRidesCardData.n && this.o == premiumBusBulkBookingUpcomingRidesCardData.o;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + nf1.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + nf1.e(nf1.e(nf1.e(38161, 31, this.f6939a), 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 961;
        String str = this.j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode3 = (this.m.hashCode() + nf1.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l)) * 31;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = this.n;
        int iHashCode4 = newPremiumReserveTicketDetailsScreenType != null ? newPremiumReserveTicketDetailsScreenType.hashCode() : 0;
        long j = this.o;
        return ((iHashCode3 + iHashCode4) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusBulkBookingUpcomingRidesCardData(showChaloBusIcon=true, productType=", this.f6939a, ", productSubType=", this.b, ", bookingId=");
        sbE.append(this.c);
        sbE.append(", vehicleInfo=");
        sbE.append(this.d);
        sbE.append(", pickupStopScheduledTime=");
        sbE.append(this.e);
        sbE.append(", dropStopScheduledTime=");
        sbE.append(this.f);
        sbE.append(", tripTimeInfo=");
        sbE.append(this.g);
        sbE.append(", timezoneId=");
        sbE.append(this.h);
        sbE.append(", ticketStatus=");
        sbE.append(this.i);
        sbE.append(", tripStatus=null, fromStopName=");
        sbE.append(this.j);
        sbE.append(", toStopName=");
        cb0.t(sbE, this.k, ", routeName=", this.l, ", stopDirectionsInfo=");
        sbE.append(this.m);
        sbE.append(", ticketDetailsScreenType=");
        sbE.append(this.n);
        sbE.append(", tripSlotStartTime=");
        return uf0.m(this.o, ")", sbE);
    }
}
