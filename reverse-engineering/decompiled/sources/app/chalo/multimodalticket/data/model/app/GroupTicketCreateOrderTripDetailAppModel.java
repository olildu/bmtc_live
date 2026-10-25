package app.chalo.multimodalticket.data.model.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCreateOrderTripDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCreateOrderTripDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5857a;
    public final GroupTicketCreateOrderStopAppModel b;
    public final GroupTicketCreateOrderStopAppModel c;
    public final List d;

    public GroupTicketCreateOrderTripDetailAppModel(String str, GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModel, GroupTicketCreateOrderStopAppModel groupTicketCreateOrderStopAppModel2, ArrayList arrayList) {
        this.f5857a = str;
        this.b = groupTicketCreateOrderStopAppModel;
        this.c = groupTicketCreateOrderStopAppModel2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderTripDetailAppModel)) {
            return false;
        }
        GroupTicketCreateOrderTripDetailAppModel groupTicketCreateOrderTripDetailAppModel = (GroupTicketCreateOrderTripDetailAppModel) obj;
        return Intrinsics.d(this.f5857a, groupTicketCreateOrderTripDetailAppModel.f5857a) && Intrinsics.d(this.b, groupTicketCreateOrderTripDetailAppModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderTripDetailAppModel.c) && Intrinsics.d(this.d, groupTicketCreateOrderTripDetailAppModel.d);
    }

    public final int hashCode() {
        String str = this.f5857a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GroupTicketCreateOrderTripDetailAppModel(routeId=" + this.f5857a + ", startStop=" + this.b + ", endStop=" + this.c + ", journeyOverview=" + this.d + ")";
    }
}
