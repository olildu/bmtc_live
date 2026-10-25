package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Instant_ticket_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Instant_ticket_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1960a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final InstantTicketStatus f;
    public final Long g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final List r;
    public final RefundInfoEntityModel s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Instant_ticket_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1961a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;

        public Adapter(EnumColumnAdapter enumColumnAdapter, InstantTicketTableAdapter$instantTicketPassengerDetailsAdapter$2$1 passengerDetailsAdapter, ColumnAdapter refundInfoAdapter) {
            Intrinsics.i(passengerDetailsAdapter, "passengerDetailsAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            this.f1961a = enumColumnAdapter;
            this.b = passengerDetailsAdapter;
            this.c = refundInfoAdapter;
        }
    }

    public Instant_ticket_table(String bookingId, String userId, String productName, long j, long j2, InstantTicketStatus status, Long l, String city, String str, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, List list, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f1960a = bookingId;
        this.b = userId;
        this.c = productName;
        this.d = j;
        this.e = j2;
        this.f = status;
        this.g = l;
        this.h = city;
        this.i = str;
        this.j = str2;
        this.k = l2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = list;
        this.s = refundInfoEntityModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant_ticket_table)) {
            return false;
        }
        Instant_ticket_table instant_ticket_table = (Instant_ticket_table) obj;
        return Intrinsics.d(this.f1960a, instant_ticket_table.f1960a) && Intrinsics.d(this.b, instant_ticket_table.b) && Intrinsics.d(this.c, instant_ticket_table.c) && this.d == instant_ticket_table.d && this.e == instant_ticket_table.e && this.f == instant_ticket_table.f && Intrinsics.d(this.g, instant_ticket_table.g) && Intrinsics.d(this.h, instant_ticket_table.h) && Intrinsics.d(this.i, instant_ticket_table.i) && Intrinsics.d(this.j, instant_ticket_table.j) && Intrinsics.d(this.k, instant_ticket_table.k) && Intrinsics.d(this.l, instant_ticket_table.l) && Intrinsics.d(this.m, instant_ticket_table.m) && Intrinsics.d(this.n, instant_ticket_table.n) && Intrinsics.d(this.o, instant_ticket_table.o) && Intrinsics.d(this.p, instant_ticket_table.p) && Intrinsics.d(this.q, instant_ticket_table.q) && Intrinsics.d(this.r, instant_ticket_table.r) && Intrinsics.d(this.s, instant_ticket_table.s);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f1960a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int iHashCode = (this.f.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Long l = this.g;
        int iE2 = nf1.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.q;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.r;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.s;
        return iHashCode11 + (refundInfoEntityModel != null ? refundInfoEntityModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Instant_ticket_table(bookingId=", this.f1960a, ", userId=", this.b, ", productName=");
        n21.p(this.d, this.c, ", bookingTime=", sbE);
        xs.r(this.e, ", amount=", ", status=", sbE);
        sbE.append(this.f);
        sbE.append(", punchTime=");
        sbE.append(this.g);
        sbE.append(", city=");
        cb0.t(sbE, this.h, ", qrCode=", this.i, ", tone=");
        cb0.r(this.k, this.j, ", activationExpiryTime=", ", routeId=", sbE);
        cb0.t(sbE, this.l, ", routeName=", this.m, ", startStopId=");
        cb0.t(sbE, this.n, ", startStopName=", this.o, ", endStopId=");
        cb0.t(sbE, this.p, ", endStopName=", this.q, ", passengerDetails=");
        sbE.append(this.r);
        sbE.append(", refundInfo=");
        sbE.append(this.s);
        sbE.append(")");
        return sbE.toString();
    }
}
