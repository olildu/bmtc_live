package app.chalo.multimodalticket.data.model;

import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiModalGroupTicketEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5792a;
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
    public final int r;
    public final List s;

    public MultiModalGroupTicketEntity(String groupId, String productName, String productType, String productSubType, long j, long j2, MultiModalGroupTicketStatus status, String userId, String str, String configurationId, long j3, MultiModalGroupTicketStopDetails fromStopDetails, MultiModalGroupTicketStopDetails toStopDetails, List passengerDetails, RefundInfoEntityModel refundInfoEntityModel, List sequenceInfo, List fareDetails, int i, List children) {
        Intrinsics.i(groupId, "groupId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(status, "status");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(configurationId, "configurationId");
        Intrinsics.i(fromStopDetails, "fromStopDetails");
        Intrinsics.i(toStopDetails, "toStopDetails");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(sequenceInfo, "sequenceInfo");
        Intrinsics.i(fareDetails, "fareDetails");
        Intrinsics.i(children, "children");
        this.f5792a = groupId;
        this.b = productName;
        this.c = productType;
        this.d = productSubType;
        this.e = j;
        this.f = j2;
        this.g = status;
        this.h = userId;
        this.i = str;
        this.j = configurationId;
        this.k = j3;
        this.l = fromStopDetails;
        this.m = toStopDetails;
        this.n = passengerDetails;
        this.o = refundInfoEntityModel;
        this.p = sequenceInfo;
        this.q = fareDetails;
        this.r = i;
        this.s = children;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalGroupTicketEntity)) {
            return false;
        }
        MultiModalGroupTicketEntity multiModalGroupTicketEntity = (MultiModalGroupTicketEntity) obj;
        return Intrinsics.d(this.f5792a, multiModalGroupTicketEntity.f5792a) && Intrinsics.d(this.b, multiModalGroupTicketEntity.b) && Intrinsics.d(this.c, multiModalGroupTicketEntity.c) && Intrinsics.d(this.d, multiModalGroupTicketEntity.d) && this.e == multiModalGroupTicketEntity.e && this.f == multiModalGroupTicketEntity.f && this.g == multiModalGroupTicketEntity.g && Intrinsics.d(this.h, multiModalGroupTicketEntity.h) && Intrinsics.d(this.i, multiModalGroupTicketEntity.i) && Intrinsics.d(this.j, multiModalGroupTicketEntity.j) && this.k == multiModalGroupTicketEntity.k && Intrinsics.d(this.l, multiModalGroupTicketEntity.l) && Intrinsics.d(this.m, multiModalGroupTicketEntity.m) && Intrinsics.d(this.n, multiModalGroupTicketEntity.n) && Intrinsics.d(this.o, multiModalGroupTicketEntity.o) && Intrinsics.d(this.p, multiModalGroupTicketEntity.p) && Intrinsics.d(this.q, multiModalGroupTicketEntity.q) && this.r == multiModalGroupTicketEntity.r && Intrinsics.d(this.s, multiModalGroupTicketEntity.s);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f5792a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int iE2 = nf1.e(nf1.e(nf1.e((this.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        long j3 = this.k;
        int iB = r30.b((this.m.hashCode() + ((this.l.hashCode() + ((iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.n);
        RefundInfoEntityModel refundInfoEntityModel = this.o;
        return this.s.hashCode() + ((r30.b(r30.b((iB + (refundInfoEntityModel == null ? 0 : refundInfoEntityModel.hashCode())) * 31, 31, this.p), 31, this.q) + this.r) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MultiModalGroupTicketEntity(groupId=", this.f5792a, ", productName=", this.b, ", productType=");
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
        sbE.append(", children=");
        sbE.append(this.s);
        sbE.append(")");
        return sbE.toString();
    }
}
