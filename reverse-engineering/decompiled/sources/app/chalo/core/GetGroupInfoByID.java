package app.chalo.core;

import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/GetGroupInfoByID;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetGroupInfoByID {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1957a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final MultiModalGroupTicketStatus g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final MultiModalGroupTicketStopDetails l;
    public final MultiModalGroupTicketStopDetails m;
    public final List n;
    public final RefundInfoEntityModel o;
    public final List p;
    public final List q;
    public final long r;
    public final Long s;
    public final String t;
    public final String u;
    public final String v;

    public GetGroupInfoByID(String str, String str2, String str3, String str4, long j, long j2, MultiModalGroupTicketStatus status, String str5, String str6, String str7, long j3, MultiModalGroupTicketStopDetails fromStopDetails, MultiModalGroupTicketStopDetails toStopDetails, List passengerDetails, RefundInfoEntityModel refundInfoEntityModel, List sequenceInfo, List fareDetails, long j4, Long l, String str8, String str9, String str10) {
        Intrinsics.i(status, "status");
        Intrinsics.i(fromStopDetails, "fromStopDetails");
        Intrinsics.i(toStopDetails, "toStopDetails");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(sequenceInfo, "sequenceInfo");
        Intrinsics.i(fareDetails, "fareDetails");
        this.f1957a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = status;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = j3;
        this.l = fromStopDetails;
        this.m = toStopDetails;
        this.n = passengerDetails;
        this.o = refundInfoEntityModel;
        this.p = sequenceInfo;
        this.q = fareDetails;
        this.r = j4;
        this.s = l;
        this.t = str8;
        this.u = str9;
        this.v = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGroupInfoByID)) {
            return false;
        }
        GetGroupInfoByID getGroupInfoByID = (GetGroupInfoByID) obj;
        return Intrinsics.d(this.f1957a, getGroupInfoByID.f1957a) && Intrinsics.d(this.b, getGroupInfoByID.b) && Intrinsics.d(this.c, getGroupInfoByID.c) && Intrinsics.d(this.d, getGroupInfoByID.d) && this.e == getGroupInfoByID.e && this.f == getGroupInfoByID.f && this.g == getGroupInfoByID.g && Intrinsics.d(this.h, getGroupInfoByID.h) && Intrinsics.d(this.i, getGroupInfoByID.i) && Intrinsics.d(this.j, getGroupInfoByID.j) && this.k == getGroupInfoByID.k && Intrinsics.d(this.l, getGroupInfoByID.l) && Intrinsics.d(this.m, getGroupInfoByID.m) && Intrinsics.d(this.n, getGroupInfoByID.n) && Intrinsics.d(this.o, getGroupInfoByID.o) && Intrinsics.d(this.p, getGroupInfoByID.p) && Intrinsics.d(this.q, getGroupInfoByID.q) && this.r == getGroupInfoByID.r && Intrinsics.d(this.s, getGroupInfoByID.s) && Intrinsics.d(this.t, getGroupInfoByID.t) && Intrinsics.d(this.u, getGroupInfoByID.u) && Intrinsics.d(this.v, getGroupInfoByID.v);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f1957a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int iE2 = nf1.e(nf1.e(nf1.e((this.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        long j3 = this.k;
        int iB = r30.b((this.m.hashCode() + ((this.l.hashCode() + ((iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.n);
        RefundInfoEntityModel refundInfoEntityModel = this.o;
        int iB2 = r30.b(r30.b((iB + (refundInfoEntityModel == null ? 0 : refundInfoEntityModel.hashCode())) * 31, 31, this.p), 31, this.q);
        long j4 = this.r;
        int i2 = (iB2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        Long l = this.s;
        int iHashCode = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.t;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.u;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GetGroupInfoByID(groupId=", this.f1957a, ", productName=", this.b, ", productType=");
        cb0.t(sbE, this.c, ", productSubType=", this.d, ", bookingTime=");
        sbE.append(this.e);
        xs.r(this.f, ", amount=", ", status=", sbE);
        sbE.append(this.g);
        sbE.append(", userId=");
        sbE.append(this.h);
        sbE.append(", city=");
        cb0.t(sbE, this.i, ", configurationId=", this.j, ", expiryTime=");
        sbE.append(this.k);
        sbE.append(", fromStopDetails=");
        sbE.append(this.l);
        sbE.append(", toStopDetails=");
        sbE.append(this.m);
        sbE.append(", passengerDetails=");
        sbE.append(this.n);
        sbE.append(", refundInfo=");
        sbE.append(this.o);
        sbE.append(", sequenceInfo=");
        sbE.append(this.p);
        sbE.append(", fareDetails=");
        sbE.append(this.q);
        sbE.append(", expectedChildCount=");
        sbE.append(this.r);
        sbE.append(", childSequence=");
        sbE.append(this.s);
        cb0.t(sbE, ", childSubTicketId=", this.t, ", childProductType=", this.u);
        return z40.h(sbE, ", childProductSubType=", this.v, ")");
    }
}
