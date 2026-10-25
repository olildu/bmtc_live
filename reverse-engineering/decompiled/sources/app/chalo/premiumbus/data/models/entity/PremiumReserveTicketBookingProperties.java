package app.chalo.premiumbus.data.models.entity;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketBookingProperties;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketBookingProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7135a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final PremiumReserveTicketStatus h;
    public final String i;
    public final String j;
    public final String k;
    public final FirstBookingAppModel l;
    public final PremiumReserveTicketStatus m;
    public final RefundInfoAppModel n;
    public final List o;

    public PremiumReserveTicketBookingProperties(String str, long j, String str2, String productType, String productSubType, String city, String userId, PremiumReserveTicketStatus premiumReserveTicketStatus, String str3, String str4, String str5, FirstBookingAppModel firstBookingAppModel, PremiumReserveTicketStatus premiumReserveTicketStatus2, RefundInfoAppModel refundInfoAppModel, List list) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        this.f7135a = str;
        this.b = j;
        this.c = str2;
        this.d = productType;
        this.e = productSubType;
        this.f = city;
        this.g = userId;
        this.h = premiumReserveTicketStatus;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = firstBookingAppModel;
        this.m = premiumReserveTicketStatus2;
        this.n = refundInfoAppModel;
        this.o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketBookingProperties)) {
            return false;
        }
        PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties = (PremiumReserveTicketBookingProperties) obj;
        return Intrinsics.d(this.f7135a, premiumReserveTicketBookingProperties.f7135a) && this.b == premiumReserveTicketBookingProperties.b && Intrinsics.d(this.c, premiumReserveTicketBookingProperties.c) && Intrinsics.d(this.d, premiumReserveTicketBookingProperties.d) && Intrinsics.d(this.e, premiumReserveTicketBookingProperties.e) && Intrinsics.d(this.f, premiumReserveTicketBookingProperties.f) && Intrinsics.d(this.g, premiumReserveTicketBookingProperties.g) && this.h == premiumReserveTicketBookingProperties.h && Intrinsics.d(this.i, premiumReserveTicketBookingProperties.i) && Intrinsics.d(this.j, premiumReserveTicketBookingProperties.j) && Intrinsics.d(this.k, premiumReserveTicketBookingProperties.k) && Intrinsics.d(this.l, premiumReserveTicketBookingProperties.l) && this.m == premiumReserveTicketBookingProperties.m && Intrinsics.d(this.n, premiumReserveTicketBookingProperties.n) && Intrinsics.d(this.o, premiumReserveTicketBookingProperties.o);
    }

    public final int hashCode() {
        int iHashCode = this.f7135a.hashCode() * 31;
        long j = this.b;
        int iE = nf1.e((this.h.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
        String str = this.j;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FirstBookingAppModel firstBookingAppModel = this.l;
        int iHashCode4 = (iHashCode3 + (firstBookingAppModel == null ? 0 : firstBookingAppModel.hashCode())) * 31;
        PremiumReserveTicketStatus premiumReserveTicketStatus = this.m;
        int iHashCode5 = (iHashCode4 + (premiumReserveTicketStatus == null ? 0 : premiumReserveTicketStatus.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.n;
        int iHashCode6 = (iHashCode5 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list = this.o;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketBookingProperties(bookingId=", this.f7135a, ", bookingTime=");
        cb0.t(sbM, ", configurationId=", this.c, ", productType=", this.d);
        cb0.t(sbM, ", productSubType=", this.e, ", city=", this.f);
        sbM.append(", userId=");
        sbM.append(this.g);
        sbM.append(", ticketStatus=");
        sbM.append(this.h);
        cb0.t(sbM, ", paymentMode=", this.i, ", passIdUsedToPurchaseTicket=", this.j);
        sbM.append(", firstBookingId=");
        sbM.append(this.k);
        sbM.append(", firstBooking=");
        sbM.append(this.l);
        sbM.append(", prevBookingStatus=");
        sbM.append(this.m);
        sbM.append(", refundInfo=");
        sbM.append(this.n);
        sbM.append(", seats=");
        sbM.append(this.o);
        sbM.append(")");
        return sbM.toString();
    }
}
