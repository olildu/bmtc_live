package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Premium_reserve_ticket_table {
    public final long A;
    public final long B;
    public final FirstBookingAppModel C;
    public final PremiumReserveTicketStatus D;
    public final RefundInfoAppModel E;
    public final List F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1985a;
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1986a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final ColumnAdapter e;
        public final EnumColumnAdapter f;
        public final ColumnAdapter g;
        public final ColumnAdapter h;

        public Adapter(EnumColumnAdapter enumColumnAdapter, PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1 fromStopDetailsAdapter, PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1 toStopDetailsAdapter, PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1 passengerCategoryDetailsAdapter, PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1 firstBookingAdapter, EnumColumnAdapter enumColumnAdapter2, PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1 refundInfoAdapter, PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1 seatsAdapter) {
            Intrinsics.i(fromStopDetailsAdapter, "fromStopDetailsAdapter");
            Intrinsics.i(toStopDetailsAdapter, "toStopDetailsAdapter");
            Intrinsics.i(passengerCategoryDetailsAdapter, "passengerCategoryDetailsAdapter");
            Intrinsics.i(firstBookingAdapter, "firstBookingAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            Intrinsics.i(seatsAdapter, "seatsAdapter");
            this.f1986a = enumColumnAdapter;
            this.b = fromStopDetailsAdapter;
            this.c = toStopDetailsAdapter;
            this.d = passengerCategoryDetailsAdapter;
            this.e = firstBookingAdapter;
            this.f = enumColumnAdapter2;
            this.g = refundInfoAdapter;
            this.h = seatsAdapter;
        }
    }

    public Premium_reserve_ticket_table(String str, long j, long j2, PremiumReserveTicketStatus premiumReserveTicketStatus, String str2, String str3, String str4, String city, String str5, String str6, String str7, String str8, long j3, long j4, long j5, String routeId, String str9, String userId, String productType, String productSubType, PremiumStopDetailsInfo premiumStopDetailsInfo, PremiumStopDetailsInfo premiumStopDetailsInfo2, boolean z, List list, String str10, Long l, long j6, long j7, FirstBookingAppModel firstBookingAppModel, PremiumReserveTicketStatus premiumReserveTicketStatus2, RefundInfoAppModel refundInfoAppModel, List list2) {
        Intrinsics.i(city, "city");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f1985a = str;
        this.b = j;
        this.c = j2;
        this.d = premiumReserveTicketStatus;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = city;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = j3;
        this.n = j4;
        this.o = j5;
        this.p = routeId;
        this.q = str9;
        this.r = userId;
        this.s = productType;
        this.t = productSubType;
        this.u = premiumStopDetailsInfo;
        this.v = premiumStopDetailsInfo2;
        this.w = z;
        this.x = list;
        this.y = str10;
        this.z = l;
        this.A = j6;
        this.B = j7;
        this.C = firstBookingAppModel;
        this.D = premiumReserveTicketStatus2;
        this.E = refundInfoAppModel;
        this.F = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Premium_reserve_ticket_table)) {
            return false;
        }
        Premium_reserve_ticket_table premium_reserve_ticket_table = (Premium_reserve_ticket_table) obj;
        return Intrinsics.d(this.f1985a, premium_reserve_ticket_table.f1985a) && this.b == premium_reserve_ticket_table.b && this.c == premium_reserve_ticket_table.c && this.d == premium_reserve_ticket_table.d && Intrinsics.d(this.e, premium_reserve_ticket_table.e) && Intrinsics.d(this.f, premium_reserve_ticket_table.f) && Intrinsics.d(this.g, premium_reserve_ticket_table.g) && Intrinsics.d(this.h, premium_reserve_ticket_table.h) && Intrinsics.d(this.i, premium_reserve_ticket_table.i) && Intrinsics.d(this.j, premium_reserve_ticket_table.j) && Intrinsics.d(this.k, premium_reserve_ticket_table.k) && Intrinsics.d(this.l, premium_reserve_ticket_table.l) && this.m == premium_reserve_ticket_table.m && this.n == premium_reserve_ticket_table.n && this.o == premium_reserve_ticket_table.o && Intrinsics.d(this.p, premium_reserve_ticket_table.p) && Intrinsics.d(this.q, premium_reserve_ticket_table.q) && Intrinsics.d(this.r, premium_reserve_ticket_table.r) && Intrinsics.d(this.s, premium_reserve_ticket_table.s) && Intrinsics.d(this.t, premium_reserve_ticket_table.t) && Intrinsics.d(this.u, premium_reserve_ticket_table.u) && Intrinsics.d(this.v, premium_reserve_ticket_table.v) && this.w == premium_reserve_ticket_table.w && Intrinsics.d(this.x, premium_reserve_ticket_table.x) && Intrinsics.d(this.y, premium_reserve_ticket_table.y) && Intrinsics.d(this.z, premium_reserve_ticket_table.z) && this.A == premium_reserve_ticket_table.A && this.B == premium_reserve_ticket_table.B && Intrinsics.d(this.C, premium_reserve_ticket_table.C) && this.D == premium_reserve_ticket_table.D && Intrinsics.d(this.E, premium_reserve_ticket_table.E) && Intrinsics.d(this.F, premium_reserve_ticket_table.F);
    }

    public final int hashCode() {
        int iHashCode = this.f1985a.hashCode() * 31;
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
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Premium_reserve_ticket_table(bookingId=", this.f1985a, ", bookingTime=");
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
        sbM.append(")");
        return sbM.toString();
    }
}
