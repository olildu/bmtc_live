package app.chalo.multimodalticket.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketBusTripDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketBusTripDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5850a;
    public final StopAppModel b;
    public final StopAppModel c;

    public GroupTicketBusTripDetailsAppModel(String routeId, StopAppModel startStop, StopAppModel endStop) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        this.f5850a = routeId;
        this.b = startStop;
        this.c = endStop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBusTripDetailsAppModel)) {
            return false;
        }
        GroupTicketBusTripDetailsAppModel groupTicketBusTripDetailsAppModel = (GroupTicketBusTripDetailsAppModel) obj;
        return Intrinsics.d(this.f5850a, groupTicketBusTripDetailsAppModel.f5850a) && Intrinsics.d(this.b, groupTicketBusTripDetailsAppModel.b) && Intrinsics.d(this.c, groupTicketBusTripDetailsAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n21.b(this.b, this.f5850a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GroupTicketBusTripDetailsAppModel(routeId=" + this.f5850a + ", startStop=" + this.b + ", endStop=" + this.c + ")";
    }
}
