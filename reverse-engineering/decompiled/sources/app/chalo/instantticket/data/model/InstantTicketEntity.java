package app.chalo.instantticket.data.model;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3840a;
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

    public InstantTicketEntity(String bookingId, String userId, String productName, long j, long j2, InstantTicketStatus status, Long l, String city, String str, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, List list, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f3840a = bookingId;
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
        if (!(obj instanceof InstantTicketEntity)) {
            return false;
        }
        InstantTicketEntity instantTicketEntity = (InstantTicketEntity) obj;
        return Intrinsics.d(this.f3840a, instantTicketEntity.f3840a) && Intrinsics.d(this.b, instantTicketEntity.b) && Intrinsics.d(this.c, instantTicketEntity.c) && this.d == instantTicketEntity.d && this.e == instantTicketEntity.e && this.f == instantTicketEntity.f && Intrinsics.d(this.g, instantTicketEntity.g) && Intrinsics.d(this.h, instantTicketEntity.h) && Intrinsics.d(this.i, instantTicketEntity.i) && Intrinsics.d(this.j, instantTicketEntity.j) && Intrinsics.d(this.k, instantTicketEntity.k) && Intrinsics.d(this.l, instantTicketEntity.l) && Intrinsics.d(this.m, instantTicketEntity.m) && Intrinsics.d(this.n, instantTicketEntity.n) && Intrinsics.d(this.o, instantTicketEntity.o) && Intrinsics.d(this.p, instantTicketEntity.p) && Intrinsics.d(this.q, instantTicketEntity.q) && Intrinsics.d(this.r, instantTicketEntity.r) && Intrinsics.d(this.s, instantTicketEntity.s);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f3840a.hashCode() * 31, 31, this.b), 31, this.c);
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
        StringBuilder sbE = dd.e("InstantTicketEntity(bookingId=", this.f3840a, ", userId=", this.b, ", productName=");
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
