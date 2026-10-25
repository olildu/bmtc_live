package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusBookingCardData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBookingCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7413a;
    public final String b;
    public final String c;
    public final String d;
    public final PremiumBusBookingVehicleInfoState e;
    public final PremiumBusPostBookingStopSchedule f;
    public final PremiumBusPostBookingStopSchedule g;
    public final PremiumBusBookingTripTimeInfoState h;
    public final String i;
    public final PremiumReserveTicketStatus j;
    public final String k;
    public final String l;
    public final String m;
    public final PremiumReserveTicketStopDirectionsInfoState n;
    public final NewPremiumReserveTicketDetailsScreenType o;
    public final String p;

    public PremiumBusBookingCardData(String productType, String productSubType, String bookingId, PremiumBusBookingVehicleInfoState vehicleInfo, PremiumBusPostBookingStopSchedule pickupStopScheduledTime, PremiumBusPostBookingStopSchedule dropStopScheduledTime, PremiumBusBookingTripTimeInfoState tripTimeInfo, String timezoneId, PremiumReserveTicketStatus ticketStatus, String str, String str2, String str3, PremiumReserveTicketStopDirectionsInfoState stopDirectionsInfo, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, String str4, int i) {
        String str5 = (i & 65536) != 0 ? null : str4;
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleInfo, "vehicleInfo");
        Intrinsics.i(pickupStopScheduledTime, "pickupStopScheduledTime");
        Intrinsics.i(dropStopScheduledTime, "dropStopScheduledTime");
        Intrinsics.i(tripTimeInfo, "tripTimeInfo");
        Intrinsics.i(timezoneId, "timezoneId");
        Intrinsics.i(ticketStatus, "ticketStatus");
        Intrinsics.i(stopDirectionsInfo, "stopDirectionsInfo");
        this.f7413a = true;
        this.b = productType;
        this.c = productSubType;
        this.d = bookingId;
        this.e = vehicleInfo;
        this.f = pickupStopScheduledTime;
        this.g = dropStopScheduledTime;
        this.h = tripTimeInfo;
        this.i = timezoneId;
        this.j = ticketStatus;
        this.k = str;
        this.l = str2;
        this.m = str3;
        this.n = stopDirectionsInfo;
        this.o = newPremiumReserveTicketDetailsScreenType;
        this.p = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingCardData)) {
            return false;
        }
        PremiumBusBookingCardData premiumBusBookingCardData = (PremiumBusBookingCardData) obj;
        return this.f7413a == premiumBusBookingCardData.f7413a && Intrinsics.d(this.b, premiumBusBookingCardData.b) && Intrinsics.d(this.c, premiumBusBookingCardData.c) && Intrinsics.d(this.d, premiumBusBookingCardData.d) && Intrinsics.d(this.e, premiumBusBookingCardData.e) && Intrinsics.d(this.f, premiumBusBookingCardData.f) && Intrinsics.d(this.g, premiumBusBookingCardData.g) && Intrinsics.d(this.h, premiumBusBookingCardData.h) && Intrinsics.d(this.i, premiumBusBookingCardData.i) && this.j == premiumBusBookingCardData.j && Intrinsics.d(this.k, premiumBusBookingCardData.k) && Intrinsics.d(this.l, premiumBusBookingCardData.l) && Intrinsics.d(this.m, premiumBusBookingCardData.m) && this.n.equals(premiumBusBookingCardData.n) && this.o == premiumBusBookingCardData.o && Intrinsics.d(this.p, premiumBusBookingCardData.p);
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + nf1.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.e(nf1.e((this.f7413a ? 1231 : 1237) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31, 31, this.i)) * 961;
        String str = this.k;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode4 = (this.n.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = this.o;
        int iHashCode5 = (iHashCode4 + (newPremiumReserveTicketDetailsScreenType == null ? 0 : newPremiumReserveTicketDetailsScreenType.hashCode())) * 31;
        String str4 = this.p;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusBookingCardData(showChaloBusIcon=");
        sb.append(this.f7413a);
        sb.append(", productType=");
        sb.append(this.b);
        sb.append(", productSubType=");
        cb0.t(sb, this.c, ", bookingId=", this.d, ", vehicleInfo=");
        sb.append(this.e);
        sb.append(", pickupStopScheduledTime=");
        sb.append(this.f);
        sb.append(", dropStopScheduledTime=");
        sb.append(this.g);
        sb.append(", tripTimeInfo=");
        sb.append(this.h);
        sb.append(", timezoneId=");
        sb.append(this.i);
        sb.append(", ticketStatus=");
        sb.append(this.j);
        sb.append(", tripStatus=null, fromStopName=");
        cb0.t(sb, this.k, ", toStopName=", this.l, ", routeName=");
        sb.append(this.m);
        sb.append(", stopDirectionsInfo=");
        sb.append(this.n);
        sb.append(", ticketDetailsScreenType=");
        sb.append(this.o);
        sb.append(", originalBookingTimeStringIfRescheduled=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
