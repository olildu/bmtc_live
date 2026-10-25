package app.chalo.ondc.model.app;

import app.chalo.data.RefundInfoAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/OndcTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6771a;
    public final String b;
    public final long c;
    public final long d;
    public final OndcTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final Map k;
    public final String l;
    public final String m;
    public final String n;
    public final RefundInfoAppModel o;
    public final List p;
    public final List q;
    public final String r;

    public OndcTicketAppModel(String bookingId, String userId, long j, long j2, OndcTicketStatus status, Long l, String city, String str, String str2, long j3, Map map, String str3, String str4, String str5, RefundInfoAppModel refundInfoAppModel, List list, List fareBreakup, String str6) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        Intrinsics.i(fareBreakup, "fareBreakup");
        this.f6771a = bookingId;
        this.b = userId;
        this.c = j;
        this.d = j2;
        this.e = status;
        this.f = l;
        this.g = city;
        this.h = str;
        this.i = str2;
        this.j = j3;
        this.k = map;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = refundInfoAppModel;
        this.p = list;
        this.q = fareBreakup;
        this.r = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RefundInfoAppModel getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getL() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketAppModel)) {
            return false;
        }
        OndcTicketAppModel ondcTicketAppModel = (OndcTicketAppModel) obj;
        return Intrinsics.d(this.f6771a, ondcTicketAppModel.f6771a) && Intrinsics.d(this.b, ondcTicketAppModel.b) && this.c == ondcTicketAppModel.c && this.d == ondcTicketAppModel.d && this.e == ondcTicketAppModel.e && Intrinsics.d(this.f, ondcTicketAppModel.f) && Intrinsics.d(this.g, ondcTicketAppModel.g) && Intrinsics.d(this.h, ondcTicketAppModel.h) && Intrinsics.d(this.i, ondcTicketAppModel.i) && this.j == ondcTicketAppModel.j && Intrinsics.d(this.k, ondcTicketAppModel.k) && Intrinsics.d(this.l, ondcTicketAppModel.l) && Intrinsics.d(this.m, ondcTicketAppModel.m) && Intrinsics.d(this.n, ondcTicketAppModel.n) && Intrinsics.d(this.o, ondcTicketAppModel.o) && Intrinsics.d(this.p, ondcTicketAppModel.p) && Intrinsics.d(this.q, ondcTicketAppModel.q) && Intrinsics.d(this.r, ondcTicketAppModel.r);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getM() {
        return this.m;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final OndcTicketStatus getE() {
        return this.e;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6771a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = (this.e.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Long l = this.f;
        int iE2 = nf1.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        long j3 = this.j;
        int i2 = (((iHashCode2 + iHashCode3) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        Map map = this.k;
        int iHashCode4 = (i2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.o;
        int iHashCode8 = (iHashCode7 + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31;
        List list = this.p;
        int iB = r30.b((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31, this.q);
        String str6 = this.r;
        return iB + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcTicketAppModel(bookingId=", this.f6771a, ", userId=", this.b, ", bookingTime=");
        sbE.append(this.c);
        xs.r(this.d, ", amount=", ", status=", sbE);
        sbE.append(this.e);
        sbE.append(", punchTime=");
        sbE.append(this.f);
        sbE.append(", city=");
        cb0.t(sbE, this.g, ", qrCode=", this.h, ", tone=");
        n21.p(this.j, this.i, ", activationExpiryTime=", sbE);
        sbE.append(", passengerDetails=");
        sbE.append(this.k);
        sbE.append(", routeName=");
        sbE.append(this.l);
        cb0.t(sbE, ", startStopName=", this.m, ", endStopName=", this.n);
        sbE.append(", refundInfo=");
        sbE.append(this.o);
        sbE.append(", validationInfoList=");
        sbE.append(this.p);
        sbE.append(", fareBreakup=");
        sbE.append(this.q);
        sbE.append(", ticketColorHex=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }
}
