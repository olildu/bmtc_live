package app.chalo.core;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_child_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Multi_modal_group_ticket_child_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1969a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public Multi_modal_group_ticket_child_table(String groupId, String subTicketId, String productType, String productSubType, long j) {
        Intrinsics.i(groupId, "groupId");
        Intrinsics.i(subTicketId, "subTicketId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f1969a = groupId;
        this.b = j;
        this.c = subTicketId;
        this.d = productType;
        this.e = productSubType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Multi_modal_group_ticket_child_table)) {
            return false;
        }
        Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table = (Multi_modal_group_ticket_child_table) obj;
        return Intrinsics.d(this.f1969a, multi_modal_group_ticket_child_table.f1969a) && this.b == multi_modal_group_ticket_child_table.b && Intrinsics.d(this.c, multi_modal_group_ticket_child_table.c) && Intrinsics.d(this.d, multi_modal_group_ticket_child_table.d) && Intrinsics.d(this.e, multi_modal_group_ticket_child_table.e);
    }

    public final int hashCode() {
        int iHashCode = this.f1969a.hashCode() * 31;
        long j = this.b;
        return this.e.hashCode() + nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Multi_modal_group_ticket_child_table(groupId=", this.f1969a, ", sequence=");
        cb0.t(sbM, ", subTicketId=", this.c, ", productType=", this.d);
        return z40.h(sbM, ", productSubType=", this.e, ")");
    }
}
