package app.chalo.multimodalticket.data.model.app;

import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegFareDetailAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegFareDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5860a;
    public final FareBreakupAppModel b;
    public final List c;

    public GroupTicketLegFareDetailAppModel(int i, FareBreakupAppModel fareBreakupAppModel, List legFareBreakup) {
        Intrinsics.i(legFareBreakup, "legFareBreakup");
        this.f5860a = i;
        this.b = fareBreakupAppModel;
        this.c = legFareBreakup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegFareDetailAppModel)) {
            return false;
        }
        GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModel = (GroupTicketLegFareDetailAppModel) obj;
        return this.f5860a == groupTicketLegFareDetailAppModel.f5860a && Intrinsics.d(this.b, groupTicketLegFareDetailAppModel.b) && Intrinsics.d(this.c, groupTicketLegFareDetailAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5860a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketLegFareDetailAppModel(sequence=");
        sb.append(this.f5860a);
        sb.append(", legFare=");
        sb.append(this.b);
        sb.append(", legFareBreakup=");
        return xs.l(sb, this.c, ")");
    }
}
