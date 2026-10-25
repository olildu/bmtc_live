package app.chalo.multimodalticket.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.n21;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketMetroTripDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketMetroTripDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopAppModel f5863a;
    public final StopAppModel b;
    public final ArrayList c;

    public GroupTicketMetroTripDetailsAppModel(StopAppModel startStop, StopAppModel endStop, ArrayList arrayList) {
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        this.f5863a = startStop;
        this.b = endStop;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketMetroTripDetailsAppModel)) {
            return false;
        }
        GroupTicketMetroTripDetailsAppModel groupTicketMetroTripDetailsAppModel = (GroupTicketMetroTripDetailsAppModel) obj;
        return Intrinsics.d(this.f5863a, groupTicketMetroTripDetailsAppModel.f5863a) && Intrinsics.d(this.b, groupTicketMetroTripDetailsAppModel.b) && this.c.equals(groupTicketMetroTripDetailsAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n21.b(this.b, this.f5863a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GroupTicketMetroTripDetailsAppModel(startStop=" + this.f5863a + ", endStop=" + this.b + ", journeyOverviewList=" + this.c + ")";
    }
}
