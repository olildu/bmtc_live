package app.chalo.multimodalticket.data.model.app;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCreateOrderPassengerDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCreateOrderPassengerDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5854a;
    public final int b;

    public GroupTicketCreateOrderPassengerDetailAppModel(String id, int i) {
        Intrinsics.i(id, "id");
        this.f5854a = id;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderPassengerDetailAppModel)) {
            return false;
        }
        GroupTicketCreateOrderPassengerDetailAppModel groupTicketCreateOrderPassengerDetailAppModel = (GroupTicketCreateOrderPassengerDetailAppModel) obj;
        return Intrinsics.d(this.f5854a, groupTicketCreateOrderPassengerDetailAppModel.f5854a) && this.b == groupTicketCreateOrderPassengerDetailAppModel.b;
    }

    public final int hashCode() {
        return (this.f5854a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return xs.i(this.b, "GroupTicketCreateOrderPassengerDetailAppModel(id=", this.f5854a, ", count=", ")");
    }
}
