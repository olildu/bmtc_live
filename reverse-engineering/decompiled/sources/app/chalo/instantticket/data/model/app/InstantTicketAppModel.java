package app.chalo.instantticket.data.model.app;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/InstantTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3881a;
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
    public final RouteStopsInfo l;
    public final List m;
    public final RefundInfoAppModel n;

    public InstantTicketAppModel(String bookingId, String userId, String productName, long j, long j2, InstantTicketStatus status, Long l, String city, String str, String str2, Long l2, RouteStopsInfo routeStopsInfo, ArrayList arrayList, RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(status, "status");
        Intrinsics.i(city, "city");
        this.f3881a = bookingId;
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
        this.l = routeStopsInfo;
        this.m = arrayList;
        this.n = refundInfoAppModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getM() {
        return this.m;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RefundInfoAppModel getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RouteStopsInfo getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InstantTicketStatus getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketAppModel)) {
            return false;
        }
        InstantTicketAppModel instantTicketAppModel = (InstantTicketAppModel) obj;
        return Intrinsics.d(this.f3881a, instantTicketAppModel.f3881a) && Intrinsics.d(this.b, instantTicketAppModel.b) && Intrinsics.d(this.c, instantTicketAppModel.c) && this.d == instantTicketAppModel.d && this.e == instantTicketAppModel.e && this.f == instantTicketAppModel.f && Intrinsics.d(this.g, instantTicketAppModel.g) && Intrinsics.d(this.h, instantTicketAppModel.h) && Intrinsics.d(this.i, instantTicketAppModel.i) && Intrinsics.d(this.j, instantTicketAppModel.j) && Intrinsics.d(this.k, instantTicketAppModel.k) && Intrinsics.d(this.l, instantTicketAppModel.l) && Intrinsics.d(this.m, instantTicketAppModel.m) && Intrinsics.d(this.n, instantTicketAppModel.n);
    }

    public final boolean f(long j) {
        Long l;
        return this.f == InstantTicketStatus.ACTIVE && (l = this.k) != null && j <= l.longValue();
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f3881a.hashCode() * 31, 31, this.b), 31, this.c);
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
        RouteStopsInfo routeStopsInfo = this.l;
        int iHashCode5 = (iHashCode4 + (routeStopsInfo == null ? 0 : routeStopsInfo.hashCode())) * 31;
        List list = this.m;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        RefundInfoAppModel refundInfoAppModel = this.n;
        return iHashCode6 + (refundInfoAppModel != null ? refundInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketAppModel(bookingId=", this.f3881a, ", userId=", this.b, ", productName=");
        n21.p(this.d, this.c, ", bookingTime=", sbE);
        xs.r(this.e, ", amount=", ", status=", sbE);
        sbE.append(this.f);
        sbE.append(", punchTime=");
        sbE.append(this.g);
        sbE.append(", city=");
        cb0.t(sbE, this.h, ", qrCode=", this.i, ", tone=");
        cb0.r(this.k, this.j, ", activationExpiryTime=", ", routeDetails=", sbE);
        sbE.append(this.l);
        sbE.append(", passengerDetails=");
        sbE.append(this.m);
        sbE.append(", refundInfo=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
