package app.chalo.multimodalticket.data.model.app;

import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCreateOrderLegAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCreateOrderLegAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5852a;
    public final String b;
    public final String c;
    public final long d;
    public final GroupTicketCreateOrderTripDetailAppModel e;

    public GroupTicketCreateOrderLegAppModel(int i, String transportMode, String configurationId, long j, GroupTicketCreateOrderTripDetailAppModel groupTicketCreateOrderTripDetailAppModel) {
        Intrinsics.i(transportMode, "transportMode");
        Intrinsics.i(configurationId, "configurationId");
        this.f5852a = i;
        this.b = transportMode;
        this.c = configurationId;
        this.d = j;
        this.e = groupTicketCreateOrderTripDetailAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderLegAppModel)) {
            return false;
        }
        GroupTicketCreateOrderLegAppModel groupTicketCreateOrderLegAppModel = (GroupTicketCreateOrderLegAppModel) obj;
        return this.f5852a == groupTicketCreateOrderLegAppModel.f5852a && Intrinsics.d(this.b, groupTicketCreateOrderLegAppModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderLegAppModel.c) && this.d == groupTicketCreateOrderLegAppModel.d && Intrinsics.d(this.e, groupTicketCreateOrderLegAppModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5852a * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f5852a, "GroupTicketCreateOrderLegAppModel(sequence=", ", transportMode=", this.b, ", configurationId=");
        n21.p(this.d, this.c, ", amount=", sbP);
        sbP.append(", tripDetail=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }
}
