package app.chalo.premiumbus.data.models.app;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketBookingPropertiesAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketBookingPropertiesAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7114a;
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

    public PremiumReserveTicketBookingPropertiesAppModel(String str, long j, String str2, String productType, String productSubType, String city, String userId, PremiumReserveTicketStatus premiumReserveTicketStatus, String str3, String str4, String str5, FirstBookingAppModel firstBookingAppModel, PremiumReserveTicketStatus premiumReserveTicketStatus2, RefundInfoAppModel refundInfoAppModel, List seats) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(city, "city");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(seats, "seats");
        this.f7114a = str;
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
        this.o = seats;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RefundInfoAppModel getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PremiumReserveTicketStatus getH() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketBookingPropertiesAppModel)) {
            return false;
        }
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = (PremiumReserveTicketBookingPropertiesAppModel) obj;
        return Intrinsics.d(this.f7114a, premiumReserveTicketBookingPropertiesAppModel.f7114a) && this.b == premiumReserveTicketBookingPropertiesAppModel.b && Intrinsics.d(this.c, premiumReserveTicketBookingPropertiesAppModel.c) && Intrinsics.d(this.d, premiumReserveTicketBookingPropertiesAppModel.d) && Intrinsics.d(this.e, premiumReserveTicketBookingPropertiesAppModel.e) && Intrinsics.d(this.f, premiumReserveTicketBookingPropertiesAppModel.f) && Intrinsics.d(this.g, premiumReserveTicketBookingPropertiesAppModel.g) && this.h == premiumReserveTicketBookingPropertiesAppModel.h && Intrinsics.d(this.i, premiumReserveTicketBookingPropertiesAppModel.i) && Intrinsics.d(this.j, premiumReserveTicketBookingPropertiesAppModel.j) && Intrinsics.d(this.k, premiumReserveTicketBookingPropertiesAppModel.k) && Intrinsics.d(this.l, premiumReserveTicketBookingPropertiesAppModel.l) && this.m == premiumReserveTicketBookingPropertiesAppModel.m && Intrinsics.d(this.n, premiumReserveTicketBookingPropertiesAppModel.n) && Intrinsics.d(this.o, premiumReserveTicketBookingPropertiesAppModel.o);
    }

    public final int hashCode() {
        int iHashCode = this.f7114a.hashCode() * 31;
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
        return this.o.hashCode() + ((iHashCode5 + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketBookingPropertiesAppModel(bookingId=", this.f7114a, ", bookingTime=");
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
