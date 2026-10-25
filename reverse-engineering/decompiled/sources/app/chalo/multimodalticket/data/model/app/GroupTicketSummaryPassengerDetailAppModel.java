package app.chalo.multimodalticket.data.model.app;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSummaryPassengerDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryPassengerDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5869a;
    public final int b;

    public GroupTicketSummaryPassengerDetailAppModel(String id, int i) {
        Intrinsics.i(id, "id");
        this.f5869a = id;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryPassengerDetailAppModel)) {
            return false;
        }
        GroupTicketSummaryPassengerDetailAppModel groupTicketSummaryPassengerDetailAppModel = (GroupTicketSummaryPassengerDetailAppModel) obj;
        return Intrinsics.d(this.f5869a, groupTicketSummaryPassengerDetailAppModel.f5869a) && this.b == groupTicketSummaryPassengerDetailAppModel.b;
    }

    public final int hashCode() {
        return (this.f5869a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return xs.i(this.b, "GroupTicketSummaryPassengerDetailAppModel(id=", this.f5869a, ", count=", ")");
    }
}
