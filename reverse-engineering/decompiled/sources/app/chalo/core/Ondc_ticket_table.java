package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$fareBreakupAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.model.app.OndcTicketStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ondc_ticket_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ondc_ticket_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1976a;
    public final String b;
    public final long c;
    public final long d;
    public final OndcTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Map k;
    public final String l;
    public final String m;
    public final String n;
    public final RefundInfoAppModel o;
    public final List p;
    public final List q;
    public final String r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ondc_ticket_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1977a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final ColumnAdapter e;

        public Adapter(EnumColumnAdapter enumColumnAdapter, ColumnAdapter passengerDetailsAdapter, ColumnAdapter refundInfoAdapter, OndcTicketTableAdapter$fareBreakupAdapter$2$1 fareBreakupAdapter, OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1 validationInfoEntityListAdapter) {
            Intrinsics.i(passengerDetailsAdapter, "passengerDetailsAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            Intrinsics.i(fareBreakupAdapter, "fareBreakupAdapter");
            Intrinsics.i(validationInfoEntityListAdapter, "validationInfoEntityListAdapter");
            this.f1977a = enumColumnAdapter;
            this.b = passengerDetailsAdapter;
            this.c = refundInfoAdapter;
            this.d = fareBreakupAdapter;
            this.e = validationInfoEntityListAdapter;
        }
    }

    public Ondc_ticket_table(String bookingId, String userId, long j, long j2, OndcTicketStatus status, Long l, String city, String str, String str2, Long l2, Map map, String str3, String str4, String str5, RefundInfoAppModel refundInfoAppModel, List list, List list2, String str6) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f1976a = bookingId;
        this.b = userId;
        this.c = j;
        this.d = j2;
        this.e = status;
        this.f = l;
        this.g = city;
        this.h = str;
        this.i = str2;
        this.j = l2;
        this.k = map;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = refundInfoAppModel;
        this.p = list;
        this.q = list2;
        this.r = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ondc_ticket_table)) {
            return false;
        }
        Ondc_ticket_table ondc_ticket_table = (Ondc_ticket_table) obj;
        return Intrinsics.d(this.f1976a, ondc_ticket_table.f1976a) && Intrinsics.d(this.b, ondc_ticket_table.b) && this.c == ondc_ticket_table.c && this.d == ondc_ticket_table.d && this.e == ondc_ticket_table.e && Intrinsics.d(this.f, ondc_ticket_table.f) && Intrinsics.d(this.g, ondc_ticket_table.g) && Intrinsics.d(this.h, ondc_ticket_table.h) && Intrinsics.d(this.i, ondc_ticket_table.i) && Intrinsics.d(this.j, ondc_ticket_table.j) && Intrinsics.d(this.k, ondc_ticket_table.k) && Intrinsics.d(this.l, ondc_ticket_table.l) && Intrinsics.d(this.m, ondc_ticket_table.m) && Intrinsics.d(this.n, ondc_ticket_table.n) && Intrinsics.d(this.o, ondc_ticket_table.o) && Intrinsics.d(this.p, ondc_ticket_table.p) && Intrinsics.d(this.q, ondc_ticket_table.q) && Intrinsics.d(this.r, ondc_ticket_table.r);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1976a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = (this.e.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Long l = this.f;
        int iE2 = nf1.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.j;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.k;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.o;
        int iHashCode9 = (iHashCode8 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list = this.p;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.q;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.r;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Ondc_ticket_table(bookingId=", this.f1976a, ", userId=", this.b, ", bookingTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", status=", sbE);
        sbE.append(this.e);
        sbE.append(", punchTime=");
        sbE.append(this.f);
        sbE.append(", city=");
        cb0.t(sbE, this.g, ", qrCode=", this.h, ", tone=");
        cb0.r(this.j, this.i, ", activationExpiryTime=", ", passengerDetails=", sbE);
        sbE.append(this.k);
        sbE.append(", routeName=");
        sbE.append(this.l);
        sbE.append(", startStopName=");
        cb0.t(sbE, this.m, ", endStopName=", this.n, ", refundInfo=");
        sbE.append(this.o);
        sbE.append(", fareBreakup=");
        sbE.append(this.p);
        sbE.append(", validationInfoEntityList=");
        sbE.append(this.q);
        sbE.append(", ticketColorHex=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }
}
