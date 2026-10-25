package app.chalo.multimodalticket.data.model.app;

import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketBookingFareResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketBookingFareResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5849a;
    public final int b;
    public final ArrayList c;

    public GroupTicketBookingFareResponseAppModel(int i, String transactionId, ArrayList arrayList) {
        Intrinsics.i(transactionId, "transactionId");
        this.f5849a = transactionId;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBookingFareResponseAppModel)) {
            return false;
        }
        GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel = (GroupTicketBookingFareResponseAppModel) obj;
        return Intrinsics.d(this.f5849a, groupTicketBookingFareResponseAppModel.f5849a) && this.b == groupTicketBookingFareResponseAppModel.b && this.c.equals(groupTicketBookingFareResponseAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f5849a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "GroupTicketBookingFareResponseAppModel(transactionId=", this.f5849a, ", maxTotalIssueCount=", ", categoryList=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
