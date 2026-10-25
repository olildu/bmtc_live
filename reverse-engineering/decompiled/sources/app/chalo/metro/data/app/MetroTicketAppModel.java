package app.chalo.metro.data.app;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5431a;
    public final String b;
    public final long c;
    public final long d;
    public final MetroTicketStatus e;
    public final Long f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final long k;
    public final Map l;
    public final String m;
    public final MetroTicketStopDetails n;
    public final MetroTicketStopDetails o;
    public final RefundInfoAppModel p;

    public MetroTicketAppModel(String bookingId, String userId, long j, long j2, MetroTicketStatus status, Long l, String city, String str, ArrayList arrayList, String str2, long j3, Map map, String str3, MetroTicketStopDetails metroTicketStopDetails, MetroTicketStopDetails metroTicketStopDetails2, RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f5431a = bookingId;
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
        this.n = metroTicketStopDetails;
        this.o = metroTicketStopDetails2;
        this.p = refundInfoAppModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MetroTicketStopDetails getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RefundInfoAppModel getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getM() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketAppModel)) {
            return false;
        }
        MetroTicketAppModel metroTicketAppModel = (MetroTicketAppModel) obj;
        return Intrinsics.d(this.f5431a, metroTicketAppModel.f5431a) && Intrinsics.d(this.b, metroTicketAppModel.b) && this.c == metroTicketAppModel.c && this.d == metroTicketAppModel.d && this.e == metroTicketAppModel.e && Intrinsics.d(this.f, metroTicketAppModel.f) && Intrinsics.d(this.g, metroTicketAppModel.g) && Intrinsics.d(this.h, metroTicketAppModel.h) && Intrinsics.d(this.i, metroTicketAppModel.i) && Intrinsics.d(this.j, metroTicketAppModel.j) && this.k == metroTicketAppModel.k && Intrinsics.d(this.l, metroTicketAppModel.l) && Intrinsics.d(this.m, metroTicketAppModel.m) && Intrinsics.d(this.n, metroTicketAppModel.n) && Intrinsics.d(this.o, metroTicketAppModel.o) && Intrinsics.d(this.p, metroTicketAppModel.p);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final MetroTicketStopDetails getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MetroTicketStatus getE() {
        return this.e;
    }

    public final boolean h(long j) {
        MetroTicketStatus metroTicketStatus = MetroTicketStatus.ACTIVE;
        MetroTicketStatus metroTicketStatus2 = this.e;
        return (metroTicketStatus2 == metroTicketStatus || metroTicketStatus2 == MetroTicketStatus.TAPPED_IN) && j <= this.k;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5431a.hashCode() * 31, 31, this.b);
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
        MetroTicketStopDetails metroTicketStopDetails = this.n;
        int iHashCode7 = (iHashCode6 + (metroTicketStopDetails == null ? 0 : metroTicketStopDetails.hashCode())) * 31;
        MetroTicketStopDetails metroTicketStopDetails2 = this.o;
        int iHashCode8 = (iHashCode7 + (metroTicketStopDetails2 == null ? 0 : metroTicketStopDetails2.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.p;
        return iHashCode8 + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroTicketAppModel(bookingId=", this.f5431a, ", userId=", this.b, ", bookingTime=");
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
