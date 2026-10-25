package app.chalo.multimodalticket.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketJourneyOverviewItemAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketJourneyOverviewItemAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5858a;
    public final String b;
    public final List c;

    public GroupTicketJourneyOverviewItemAppModel(String str, String str2, List stopsList) {
        Intrinsics.i(stopsList, "stopsList");
        this.f5858a = str;
        this.b = str2;
        this.c = stopsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketJourneyOverviewItemAppModel)) {
            return false;
        }
        GroupTicketJourneyOverviewItemAppModel groupTicketJourneyOverviewItemAppModel = (GroupTicketJourneyOverviewItemAppModel) obj;
        return Intrinsics.d(this.f5858a, groupTicketJourneyOverviewItemAppModel.f5858a) && Intrinsics.d(this.b, groupTicketJourneyOverviewItemAppModel.b) && Intrinsics.d(this.c, groupTicketJourneyOverviewItemAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5858a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(dd.e("GroupTicketJourneyOverviewItemAppModel(lineName=", this.f5858a, ", lineColor=", this.b, ", stopsList="), this.c, ")");
    }
}
