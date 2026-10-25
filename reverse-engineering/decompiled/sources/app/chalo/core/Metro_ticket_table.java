package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.MetroTicketTableAdapter$stopDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.MetroTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.MetroTicketStopDetailsEntity;
import app.chalo.metro.data.app.MetroTicketStatus;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Metro_ticket_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Metro_ticket_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1966a;
    public final String b;
    public final long c;
    public final long d;
    public final MetroTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final Long k;
    public final Map l;
    public final String m;
    public final MetroTicketStopDetailsEntity n;
    public final MetroTicketStopDetailsEntity o;
    public final RefundInfoAppModel p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Metro_ticket_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1967a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final ColumnAdapter e;
        public final ColumnAdapter f;

        public Adapter(EnumColumnAdapter enumColumnAdapter, MetroTicketTableAdapter$validationInfoEntityListAdapter$2$1 validationInfoEntityListAdapter, ColumnAdapter passengerDetailsAdapter, MetroTicketTableAdapter$stopDetailsAdapter$2$1 startStopDetailsAdapter, MetroTicketTableAdapter$stopDetailsAdapter$2$1 endStopDetailsAdapter, ColumnAdapter refundInfoAdapter) {
            Intrinsics.i(validationInfoEntityListAdapter, "validationInfoEntityListAdapter");
            Intrinsics.i(passengerDetailsAdapter, "passengerDetailsAdapter");
            Intrinsics.i(startStopDetailsAdapter, "startStopDetailsAdapter");
            Intrinsics.i(endStopDetailsAdapter, "endStopDetailsAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            this.f1967a = enumColumnAdapter;
            this.b = validationInfoEntityListAdapter;
            this.c = passengerDetailsAdapter;
            this.d = startStopDetailsAdapter;
            this.e = endStopDetailsAdapter;
            this.f = refundInfoAdapter;
        }
    }

    public Metro_ticket_table(String bookingId, String userId, long j, long j2, MetroTicketStatus status, Long l, String city, String str, List list, String str2, Long l2, Map map, String str3, MetroTicketStopDetailsEntity metroTicketStopDetailsEntity, MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2, RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f1966a = bookingId;
        this.b = userId;
        this.c = j;
        this.d = j2;
        this.e = status;
        this.f = l;
        this.g = city;
        this.h = str;
        this.i = list;
        this.j = str2;
        this.k = l2;
        this.l = map;
        this.m = str3;
        this.n = metroTicketStopDetailsEntity;
        this.o = metroTicketStopDetailsEntity2;
        this.p = refundInfoAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metro_ticket_table)) {
            return false;
        }
        Metro_ticket_table metro_ticket_table = (Metro_ticket_table) obj;
        return Intrinsics.d(this.f1966a, metro_ticket_table.f1966a) && Intrinsics.d(this.b, metro_ticket_table.b) && this.c == metro_ticket_table.c && this.d == metro_ticket_table.d && this.e == metro_ticket_table.e && Intrinsics.d(this.f, metro_ticket_table.f) && Intrinsics.d(this.g, metro_ticket_table.g) && Intrinsics.d(this.h, metro_ticket_table.h) && Intrinsics.d(this.i, metro_ticket_table.i) && Intrinsics.d(this.j, metro_ticket_table.j) && Intrinsics.d(this.k, metro_ticket_table.k) && Intrinsics.d(this.l, metro_ticket_table.l) && Intrinsics.d(this.m, metro_ticket_table.m) && Intrinsics.d(this.n, metro_ticket_table.n) && Intrinsics.d(this.o, metro_ticket_table.o) && Intrinsics.d(this.p, metro_ticket_table.p);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1966a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = (this.e.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Long l = this.f;
        int iE2 = nf1.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.l;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MetroTicketStopDetailsEntity metroTicketStopDetailsEntity = this.n;
        int iHashCode8 = (iHashCode7 + (metroTicketStopDetailsEntity == null ? 0 : metroTicketStopDetailsEntity.hashCode())) * 31;
        MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2 = this.o;
        int iHashCode9 = (iHashCode8 + (metroTicketStopDetailsEntity2 == null ? 0 : metroTicketStopDetailsEntity2.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.p;
        return iHashCode9 + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Metro_ticket_table(bookingId=", this.f1966a, ", userId=", this.b, ", bookingTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", status=", sbE);
        sbE.append(this.e);
        sbE.append(", punchTime=");
        sbE.append(this.f);
        sbE.append(", city=");
        cb0.t(sbE, this.g, ", qrCode=", this.h, ", validationInfoEntityList=");
        cb0.s(", tone=", this.j, ", activationExpiryTime=", sbE, this.i);
        sbE.append(this.k);
        sbE.append(", passengerDetails=");
        sbE.append(this.l);
        sbE.append(", routeName=");
        sbE.append(this.m);
        sbE.append(", startStopDetails=");
        sbE.append(this.n);
        sbE.append(", endStopDetails=");
        sbE.append(this.o);
        sbE.append(", refundInfo=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }
}
