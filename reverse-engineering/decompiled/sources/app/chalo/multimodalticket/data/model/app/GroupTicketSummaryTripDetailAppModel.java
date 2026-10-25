package app.chalo.multimodalticket.data.model.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSummaryTripDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryTripDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5873a;
    public final GroupTicketSummaryStopAppModel b;
    public final GroupTicketSummaryStopAppModel c;
    public final List d;

    public GroupTicketSummaryTripDetailAppModel(String str, GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModel, GroupTicketSummaryStopAppModel groupTicketSummaryStopAppModel2, ArrayList arrayList) {
        this.f5873a = str;
        this.b = groupTicketSummaryStopAppModel;
        this.c = groupTicketSummaryStopAppModel2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryTripDetailAppModel)) {
            return false;
        }
        GroupTicketSummaryTripDetailAppModel groupTicketSummaryTripDetailAppModel = (GroupTicketSummaryTripDetailAppModel) obj;
        return Intrinsics.d(this.f5873a, groupTicketSummaryTripDetailAppModel.f5873a) && Intrinsics.d(this.b, groupTicketSummaryTripDetailAppModel.b) && Intrinsics.d(this.c, groupTicketSummaryTripDetailAppModel.c) && Intrinsics.d(this.d, groupTicketSummaryTripDetailAppModel.d);
    }

    public final int hashCode() {
        String str = this.f5873a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GroupTicketSummaryTripDetailAppModel(routeId=" + this.f5873a + ", startStop=" + this.b + ", endStop=" + this.c + ", journeyOverview=" + this.d + ")";
    }
}
