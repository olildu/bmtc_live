package app.chalo.multimodalticket.data.model.app;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiModalGroupTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5874a;
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
    public final RefundInfoAppModel o;
    public final List p;
    public final List q;
    public final List r;

    public MultiModalGroupTicketAppModel(String groupId, String productName, String productType, String productSubType, long j, long j2, MultiModalGroupTicketStatus status, String userId, String str, String configurationId, long j3, MultiModalGroupTicketStopDetails fromStopDetails, MultiModalGroupTicketStopDetails toStopDetails, List passengerDetails, RefundInfoAppModel refundInfoAppModel, List sequenceInfo, List fareDetails, List children) {
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
        this.f5874a = groupId;
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
        this.o = refundInfoAppModel;
        this.p = sequenceInfo;
        this.q = fareDetails;
        this.r = children;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MultiModalGroupTicketStopDetails getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RefundInfoAppModel getO() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalGroupTicketAppModel)) {
            return false;
        }
        MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = (MultiModalGroupTicketAppModel) obj;
        return Intrinsics.d(this.f5874a, multiModalGroupTicketAppModel.f5874a) && Intrinsics.d(this.b, multiModalGroupTicketAppModel.b) && Intrinsics.d(this.c, multiModalGroupTicketAppModel.c) && Intrinsics.d(this.d, multiModalGroupTicketAppModel.d) && this.e == multiModalGroupTicketAppModel.e && this.f == multiModalGroupTicketAppModel.f && this.g == multiModalGroupTicketAppModel.g && Intrinsics.d(this.h, multiModalGroupTicketAppModel.h) && Intrinsics.d(this.i, multiModalGroupTicketAppModel.i) && Intrinsics.d(this.j, multiModalGroupTicketAppModel.j) && this.k == multiModalGroupTicketAppModel.k && Intrinsics.d(this.l, multiModalGroupTicketAppModel.l) && Intrinsics.d(this.m, multiModalGroupTicketAppModel.m) && Intrinsics.d(this.n, multiModalGroupTicketAppModel.n) && Intrinsics.d(this.o, multiModalGroupTicketAppModel.o) && Intrinsics.d(this.p, multiModalGroupTicketAppModel.p) && Intrinsics.d(this.q, multiModalGroupTicketAppModel.q) && Intrinsics.d(this.r, multiModalGroupTicketAppModel.r);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MultiModalGroupTicketStatus getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final MultiModalGroupTicketStopDetails getM() {
        return this.m;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f5874a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int iE2 = nf1.e(nf1.e(nf1.e((this.g.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        long j3 = this.k;
        int iB = r30.b((this.m.hashCode() + ((this.l.hashCode() + ((iE2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.n);
        RefundInfoAppModel refundInfoAppModel = this.o;
        return this.r.hashCode() + r30.b(r30.b((iB + (refundInfoAppModel == null ? 0 : refundInfoAppModel.hashCode())) * 31, 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MultiModalGroupTicketAppModel(groupId=", this.f5874a, ", productName=", this.b, ", productType=");
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
        sbE.append(", children=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }
}
