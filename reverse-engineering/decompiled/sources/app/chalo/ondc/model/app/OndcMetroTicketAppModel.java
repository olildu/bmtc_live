package app.chalo.ondc.model.app;

import app.chalo.data.RefundInfoAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/OndcMetroTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcMetroTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6769a;
    public final String b;
    public final long c;
    public final long d;
    public final OndcMetroTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final long k;
    public final Map l;
    public final String m;
    public final String n;
    public final String o;
    public final RefundInfoAppModel p;
    public final List q;
    public final PaymentInfoAppModel r;
    public final String s;
    public final String t;

    public OndcMetroTicketAppModel(String bookingId, String userId, long j, long j2, OndcMetroTicketStatus status, Long l, String city, String str, ArrayList arrayList, String str2, long j3, Map map, String str3, String str4, String str5, RefundInfoAppModel refundInfoAppModel, List list, PaymentInfoAppModel paymentInfoAppModel, String str6, String str7) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f6769a = bookingId;
        this.b = userId;
        this.c = j;
        this.d = j2;
        this.e = status;
        this.f = l;
        this.g = city;
        this.h = str;
        this.i = arrayList;
        this.j = str2;
        this.k = j3;
        this.l = map;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = refundInfoAppModel;
        this.q = list;
        this.r = paymentInfoAppModel;
        this.s = str6;
        this.t = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RefundInfoAppModel getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OndcMetroTicketStatus getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcMetroTicketAppModel)) {
            return false;
        }
        OndcMetroTicketAppModel ondcMetroTicketAppModel = (OndcMetroTicketAppModel) obj;
        return Intrinsics.d(this.f6769a, ondcMetroTicketAppModel.f6769a) && Intrinsics.d(this.b, ondcMetroTicketAppModel.b) && this.c == ondcMetroTicketAppModel.c && this.d == ondcMetroTicketAppModel.d && this.e == ondcMetroTicketAppModel.e && Intrinsics.d(this.f, ondcMetroTicketAppModel.f) && Intrinsics.d(this.g, ondcMetroTicketAppModel.g) && Intrinsics.d(this.h, ondcMetroTicketAppModel.h) && Intrinsics.d(this.i, ondcMetroTicketAppModel.i) && Intrinsics.d(this.j, ondcMetroTicketAppModel.j) && this.k == ondcMetroTicketAppModel.k && Intrinsics.d(this.l, ondcMetroTicketAppModel.l) && Intrinsics.d(this.m, ondcMetroTicketAppModel.m) && Intrinsics.d(this.n, ondcMetroTicketAppModel.n) && Intrinsics.d(this.o, ondcMetroTicketAppModel.o) && Intrinsics.d(this.p, ondcMetroTicketAppModel.p) && Intrinsics.d(this.q, ondcMetroTicketAppModel.q) && Intrinsics.d(this.r, ondcMetroTicketAppModel.r) && Intrinsics.d(this.s, ondcMetroTicketAppModel.s) && Intrinsics.d(this.t, ondcMetroTicketAppModel.t);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6769a.hashCode() * 31, 31, this.b);
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
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        long j3 = this.k;
        int i2 = (((iHashCode3 + iHashCode4) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        Map map = this.l;
        int iHashCode5 = (i2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.p;
        int iHashCode9 = (iHashCode8 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list2 = this.q;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PaymentInfoAppModel paymentInfoAppModel = this.r;
        int iHashCode11 = (iHashCode10 + (paymentInfoAppModel == null ? 0 : paymentInfoAppModel.f6774a.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.t;
        return iHashCode12 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcMetroTicketAppModel(bookingId=", this.f6769a, ", userId=", this.b, ", bookingTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", status=", sbE);
        sbE.append(this.e);
        sbE.append(", punchTime=");
        sbE.append(this.f);
        sbE.append(", city=");
        cb0.t(sbE, this.g, ", qrCode=", this.h, ", validationInfoList=");
        cb0.s(", tone=", this.j, ", activationExpiryTime=", sbE, this.i);
        sbE.append(this.k);
        sbE.append(", passengerDetails=");
        sbE.append(this.l);
        cb0.t(sbE, ", routeName=", this.m, ", startStopName=", this.n);
        sbE.append(", endStopName=");
        sbE.append(this.o);
        sbE.append(", refundInfo=");
        sbE.append(this.p);
        sbE.append(", journeyOverview=");
        sbE.append(this.q);
        sbE.append(", paymentInfo=");
        sbE.append(this.r);
        cb0.t(sbE, ", paymentMode=", this.s, ", sellerBookingId=", this.t);
        sbE.append(")");
        return sbE.toString();
    }
}
