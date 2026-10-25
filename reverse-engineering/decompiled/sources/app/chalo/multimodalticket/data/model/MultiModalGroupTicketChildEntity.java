package app.chalo.multimodalticket.data.model;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketChildEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiModalGroupTicketChildEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5791a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public MultiModalGroupTicketChildEntity(String groupId, int i, String subTicketId, String productType, String productSubType) {
        Intrinsics.i(groupId, "groupId");
        Intrinsics.i(subTicketId, "subTicketId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f5791a = groupId;
        this.b = i;
        this.c = subTicketId;
        this.d = productType;
        this.e = productSubType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalGroupTicketChildEntity)) {
            return false;
        }
        MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity = (MultiModalGroupTicketChildEntity) obj;
        return Intrinsics.d(this.f5791a, multiModalGroupTicketChildEntity.f5791a) && this.b == multiModalGroupTicketChildEntity.b && Intrinsics.d(this.c, multiModalGroupTicketChildEntity.c) && Intrinsics.d(this.d, multiModalGroupTicketChildEntity.d) && Intrinsics.d(this.e, multiModalGroupTicketChildEntity.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(nf1.e(((this.f5791a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "MultiModalGroupTicketChildEntity(groupId=", this.f5791a, ", sequence=", ", subTicketId=");
        cb0.t(sbM, this.c, ", productType=", this.d, ", productSubType=");
        return vo1.p(sbM, this.e, ")");
    }
}
