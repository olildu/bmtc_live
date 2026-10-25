package app.chalo.metro.dao.ondc;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/dao/ondc/OndcMetroTicketEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcMetroTicketEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5403a;
    public final String b;
    public final long c;
    public final long d;
    public final OndcMetroTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final Long k;
    public final Map l;
    public final String m;
    public final String n;
    public final String o;
    public final RefundInfoAppModel p;
    public final List q;
    public final PaymentInfoEntityModel r;
    public final String s;
    public final String t;

    public OndcMetroTicketEntity(String bookingId, String userId, long j, long j2, OndcMetroTicketStatus status, Long l, String city, String str, List list, String str2, Long l2, Map map, String str3, String str4, String str5, RefundInfoAppModel refundInfoAppModel, List list2, PaymentInfoEntityModel paymentInfoEntityModel, String str6, String str7) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f5403a = bookingId;
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
        this.n = str4;
        this.o = str5;
        this.p = refundInfoAppModel;
        this.q = list2;
        this.r = paymentInfoEntityModel;
        this.s = str6;
        this.t = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcMetroTicketEntity)) {
            return false;
        }
        OndcMetroTicketEntity ondcMetroTicketEntity = (OndcMetroTicketEntity) obj;
        return Intrinsics.d(this.f5403a, ondcMetroTicketEntity.f5403a) && Intrinsics.d(this.b, ondcMetroTicketEntity.b) && this.c == ondcMetroTicketEntity.c && this.d == ondcMetroTicketEntity.d && this.e == ondcMetroTicketEntity.e && Intrinsics.d(this.f, ondcMetroTicketEntity.f) && Intrinsics.d(this.g, ondcMetroTicketEntity.g) && Intrinsics.d(this.h, ondcMetroTicketEntity.h) && Intrinsics.d(this.i, ondcMetroTicketEntity.i) && Intrinsics.d(this.j, ondcMetroTicketEntity.j) && Intrinsics.d(this.k, ondcMetroTicketEntity.k) && Intrinsics.d(this.l, ondcMetroTicketEntity.l) && Intrinsics.d(this.m, ondcMetroTicketEntity.m) && Intrinsics.d(this.n, ondcMetroTicketEntity.n) && Intrinsics.d(this.o, ondcMetroTicketEntity.o) && Intrinsics.d(this.p, ondcMetroTicketEntity.p) && Intrinsics.d(this.q, ondcMetroTicketEntity.q) && Intrinsics.d(this.r, ondcMetroTicketEntity.r) && Intrinsics.d(this.s, ondcMetroTicketEntity.s) && Intrinsics.d(this.t, ondcMetroTicketEntity.t);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5403a.hashCode() * 31, 31, this.b);
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
        String str4 = this.n;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.p;
        int iHashCode10 = (iHashCode9 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list2 = this.q;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PaymentInfoEntityModel paymentInfoEntityModel = this.r;
        int iHashCode12 = (iHashCode11 + (paymentInfoEntityModel == null ? 0 : paymentInfoEntityModel.f8243a.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.t;
        return iHashCode13 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcMetroTicketEntity(bookingId=", this.f5403a, ", userId=", this.b, ", bookingTime=");
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
        cb0.t(sbE, this.m, ", startStopName=", this.n, ", endStopName=");
        sbE.append(this.o);
        sbE.append(", refundInfo=");
        sbE.append(this.p);
        sbE.append(", journeyOverview=");
        sbE.append(this.q);
        sbE.append(", paymentInfo=");
        sbE.append(this.r);
        sbE.append(", paymentMode=");
        return r30.i(sbE, this.s, ", sellerBookingId=", this.t, ")");
    }
}
