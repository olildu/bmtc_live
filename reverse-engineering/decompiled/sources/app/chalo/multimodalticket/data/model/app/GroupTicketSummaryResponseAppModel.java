package app.chalo.multimodalticket.data.model.app;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSummaryResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5871a;
    public final ArrayList b;

    public GroupTicketSummaryResponseAppModel(long j, ArrayList arrayList) {
        this.f5871a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryResponseAppModel)) {
            return false;
        }
        GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel = (GroupTicketSummaryResponseAppModel) obj;
        return this.f5871a == groupTicketSummaryResponseAppModel.f5871a && this.b.equals(groupTicketSummaryResponseAppModel.b);
    }

    public final int hashCode() {
        long j = this.f5871a;
        return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "GroupTicketSummaryResponseAppModel(totalAmount=" + this.f5871a + ", fareDetails=" + this.b + ")";
    }
}
