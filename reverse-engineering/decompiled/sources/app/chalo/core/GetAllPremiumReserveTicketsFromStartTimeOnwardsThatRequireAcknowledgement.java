package app.chalo.core;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement {
    public final long A;
    public final long B;
    public final FirstBookingAppModel C;
    public final PremiumReserveTicketStatus D;
    public final RefundInfoAppModel E;
    public final List F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final PremiumReserveTicketAckType K;
    public final boolean L;
    public final String M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1956a;
    public final long b;
    public final long c;
    public final PremiumReserveTicketStatus d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final long n;
    public final long o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final PremiumStopDetailsInfo u;
    public final PremiumStopDetailsInfo v;
    public final boolean w;
    public final List x;
    public final String y;
    public final Long z;

    public GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement(String str, long j, long j2, PremiumReserveTicketStatus premiumReserveTicketStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j3, long j4, long j5, String str10, String str11, String str12, String str13, String str14, PremiumStopDetailsInfo premiumStopDetailsInfo, PremiumStopDetailsInfo premiumStopDetailsInfo2, boolean z, List list, String str15, Long l, long j6, long j7, FirstBookingAppModel firstBookingAppModel, PremiumReserveTicketStatus premiumReserveTicketStatus2, RefundInfoAppModel refundInfoAppModel, List list2, String str16, String str17, String str18, String str19, PremiumReserveTicketAckType premiumReserveTicketAckType, boolean z2, String str20) {
        this.f1956a = str;
        this.b = j;
        this.c = j2;
        this.d = premiumReserveTicketStatus;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = j3;
        this.n = j4;
        this.o = j5;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = str14;
        this.u = premiumStopDetailsInfo;
        this.v = premiumStopDetailsInfo2;
        this.w = z;
        this.x = list;
        this.y = str15;
        this.z = l;
        this.A = j6;
        this.B = j7;
        this.C = firstBookingAppModel;
        this.D = premiumReserveTicketStatus2;
        this.E = refundInfoAppModel;
        this.F = list2;
        this.G = str16;
        this.H = str17;
        this.I = str18;
        this.J = str19;
        this.K = premiumReserveTicketAckType;
        this.L = z2;
        this.M = str20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement)) {
            return false;
        }
        GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement = (GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement) obj;
        return Intrinsics.d(this.f1956a, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.f1956a) && this.b == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.b && this.c == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.c && this.d == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.d && Intrinsics.d(this.e, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.e) && Intrinsics.d(this.f, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.f) && Intrinsics.d(this.g, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.g) && Intrinsics.d(this.h, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.h) && Intrinsics.d(this.i, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.i) && Intrinsics.d(this.j, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.j) && Intrinsics.d(this.k, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.k) && Intrinsics.d(this.l, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.l) && this.m == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.m && this.n == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.n && this.o == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.o && Intrinsics.d(this.p, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.p) && Intrinsics.d(this.q, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.q) && Intrinsics.d(this.r, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.r) && Intrinsics.d(this.s, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.s) && Intrinsics.d(this.t, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.t) && Intrinsics.d(this.u, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.u) && Intrinsics.d(this.v, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.v) && this.w == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.w && Intrinsics.d(this.x, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.x) && Intrinsics.d(this.y, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.y) && Intrinsics.d(this.z, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.z) && this.A == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.A && this.B == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.B && Intrinsics.d(this.C, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.C) && this.D == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.D && Intrinsics.d(this.E, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.E) && Intrinsics.d(this.F, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.F) && Intrinsics.d(this.G, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.G) && Intrinsics.d(this.H, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.H) && Intrinsics.d(this.I, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.I) && Intrinsics.d(this.J, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.J) && this.K == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.K && this.L == getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.L && Intrinsics.d(this.M, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement.M);
    }

    public final int hashCode() {
        int iHashCode = this.f1956a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e((this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iE2 = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        long j3 = this.m;
        int i2 = (iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.n;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.o;
        int iB = r30.b((((this.v.hashCode() + ((this.u.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t)) * 31)) * 31) + (this.w ? 1231 : 1237)) * 31, 31, this.x);
        String str3 = this.y;
        int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.z;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        long j6 = this.A;
        int i4 = (((iHashCode3 + iHashCode4) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.B;
        int i5 = (i4 + ((int) ((j7 >>> 32) ^ j7))) * 31;
        FirstBookingAppModel firstBookingAppModel = this.C;
        int iHashCode5 = (i5 + (firstBookingAppModel == null ? 0 : firstBookingAppModel.hashCode())) * 31;
        PremiumReserveTicketStatus premiumReserveTicketStatus = this.D;
        int iHashCode6 = (iHashCode5 + (premiumReserveTicketStatus == null ? 0 : premiumReserveTicketStatus.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.E;
        int iHashCode7 = (iHashCode6 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list = this.F;
        int iHashCode8 = (((this.K.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31, this.G), 31, this.H), 31, this.I), 31, this.J)) * 31) + (this.L ? 1231 : 1237)) * 31;
        String str4 = this.M;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement(bookingId=", this.f1956a, ", bookingTime=");
        xs.r(this.c, ", amount=", ", ticketStatus=", sbM);
        sbM.append(this.d);
        sbM.append(", paymentMode=");
        sbM.append(this.e);
        sbM.append(", passIdUsedToPurchaseTicket=");
        cb0.t(sbM, this.f, ", firstBookingId=", this.g, ", city=");
        cb0.t(sbM, this.h, ", tone=", this.i, ", qrCode=");
        cb0.t(sbM, this.j, ", configurationId=", this.k, ", tripId=");
        n21.p(this.m, this.l, ", tripStaticSlotTime=", sbM);
        xs.r(this.n, ", expectedTripStartTime=", ", expectedTripEndTime=", sbM);
        dd.k(this.o, ", routeId=", this.p, sbM);
        cb0.t(sbM, ", routeName=", this.q, ", userId=", this.r);
        cb0.t(sbM, ", productType=", this.s, ", productSubType=", this.t);
        sbM.append(", fromStopDetails=");
        sbM.append(this.u);
        sbM.append(", toStopDetails=");
        sbM.append(this.v);
        sbM.append(", isTripFeedbackCollected=");
        sbM.append(this.w);
        sbM.append(", passengerCategoryDetails=");
        sbM.append(this.x);
        sbM.append(", fareNote=");
        sbM.append(this.y);
        sbM.append(", punchTime=");
        sbM.append(this.z);
        xs.r(this.A, ", expiryTime=", ", validationStartTime=", sbM);
        sbM.append(this.B);
        sbM.append(", firstBooking=");
        sbM.append(this.C);
        sbM.append(", prevBookingStatus=");
        sbM.append(this.D);
        sbM.append(", refundInfo=");
        sbM.append(this.E);
        sbM.append(", seats=");
        sbM.append(this.F);
        sbM.append(", bookingId_=");
        sbM.append(this.G);
        cb0.t(sbM, ", productType_=", this.H, ", productSubType_=", this.I);
        sbM.append(", userId_=");
        sbM.append(this.J);
        sbM.append(", ackNeededFor=");
        sbM.append(this.K);
        sbM.append(", hasAcknowledged=");
        sbM.append(this.L);
        sbM.append(", firstBookingId_=");
        sbM.append(this.M);
        sbM.append(")");
        return sbM.toString();
    }
}
