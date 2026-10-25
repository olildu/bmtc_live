package app.chalo.metro.dao;

import app.chalo.data.RefundInfoAppModel;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/dao/MetroTicketEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5400a;
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

    public MetroTicketEntity(String bookingId, String userId, long j, long j2, MetroTicketStatus status, Long l, String city, String str, List list, String str2, Long l2, Map map, String str3, MetroTicketStopDetailsEntity metroTicketStopDetailsEntity, MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2, RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f5400a = bookingId;
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
        if (!(obj instanceof MetroTicketEntity)) {
            return false;
        }
        MetroTicketEntity metroTicketEntity = (MetroTicketEntity) obj;
        return Intrinsics.d(this.f5400a, metroTicketEntity.f5400a) && Intrinsics.d(this.b, metroTicketEntity.b) && this.c == metroTicketEntity.c && this.d == metroTicketEntity.d && this.e == metroTicketEntity.e && Intrinsics.d(this.f, metroTicketEntity.f) && Intrinsics.d(this.g, metroTicketEntity.g) && Intrinsics.d(this.h, metroTicketEntity.h) && Intrinsics.d(this.i, metroTicketEntity.i) && Intrinsics.d(this.j, metroTicketEntity.j) && Intrinsics.d(this.k, metroTicketEntity.k) && Intrinsics.d(this.l, metroTicketEntity.l) && Intrinsics.d(this.m, metroTicketEntity.m) && Intrinsics.d(this.n, metroTicketEntity.n) && Intrinsics.d(this.o, metroTicketEntity.o) && Intrinsics.d(this.p, metroTicketEntity.p);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5400a.hashCode() * 31, 31, this.b);
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
        StringBuilder sbE = dd.e("MetroTicketEntity(bookingId=", this.f5400a, ", userId=", this.b, ", bookingTime=");
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
