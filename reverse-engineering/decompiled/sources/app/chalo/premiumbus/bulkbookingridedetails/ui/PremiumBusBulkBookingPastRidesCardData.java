package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PremiumBusBulkBookingPastRidesCardData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBulkBookingPastRidesCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6938a;
    public final String b;
    public final RouteInfo c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final PremiumReserveTicketStatus i;
    public final long j;
    public final long k;
    public final long l;

    public PremiumBusBulkBookingPastRidesCardData(String str, String validOrExpiryTime, RouteInfo routeInfo, String ctaText, String productType, String productSubType, String bookingId, String timezoneId, PremiumReserveTicketStatus ticketStatus, long j, long j2, long j3) {
        Intrinsics.i(validOrExpiryTime, "validOrExpiryTime");
        Intrinsics.i(ctaText, "ctaText");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(timezoneId, "timezoneId");
        Intrinsics.i(ticketStatus, "ticketStatus");
        this.f6938a = str;
        this.b = validOrExpiryTime;
        this.c = routeInfo;
        this.d = ctaText;
        this.e = productType;
        this.f = productSubType;
        this.g = bookingId;
        this.h = timezoneId;
        this.i = ticketStatus;
        this.j = j;
        this.k = j2;
        this.l = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBulkBookingPastRidesCardData)) {
            return false;
        }
        PremiumBusBulkBookingPastRidesCardData premiumBusBulkBookingPastRidesCardData = (PremiumBusBulkBookingPastRidesCardData) obj;
        return Intrinsics.d(this.f6938a, premiumBusBulkBookingPastRidesCardData.f6938a) && Intrinsics.d(this.b, premiumBusBulkBookingPastRidesCardData.b) && Intrinsics.d(this.c, premiumBusBulkBookingPastRidesCardData.c) && Intrinsics.d(this.d, premiumBusBulkBookingPastRidesCardData.d) && Intrinsics.d(this.e, premiumBusBulkBookingPastRidesCardData.e) && Intrinsics.d(this.f, premiumBusBulkBookingPastRidesCardData.f) && Intrinsics.d(this.g, premiumBusBulkBookingPastRidesCardData.g) && Intrinsics.d(this.h, premiumBusBulkBookingPastRidesCardData.h) && this.i == premiumBusBulkBookingPastRidesCardData.i && this.j == premiumBusBulkBookingPastRidesCardData.j && this.k == premiumBusBulkBookingPastRidesCardData.k && this.l == premiumBusBulkBookingPastRidesCardData.l;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6938a.hashCode() * 31, 31, this.b);
        RouteInfo routeInfo = this.c;
        int iHashCode = (this.i.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iE + (routeInfo == null ? 0 : routeInfo.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        long j = this.j;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.l;
        return i2 + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusBulkBookingPastRidesCardData(configurationId=", this.f6938a, ", validOrExpiryTime=", this.b, ", routeInfo=");
        sbE.append(this.c);
        sbE.append(", ctaText=");
        sbE.append(this.d);
        sbE.append(", productType=");
        cb0.t(sbE, this.e, ", productSubType=", this.f, ", bookingId=");
        cb0.t(sbE, this.g, ", timezoneId=", this.h, ", ticketStatus=");
        sbE.append(this.i);
        sbE.append(", tripSlotStartTime=");
        sbE.append(this.j);
        xs.r(this.k, ", expiryTime=", ", bookingTime=", sbE);
        return uf0.m(this.l, ")", sbE);
    }
}
