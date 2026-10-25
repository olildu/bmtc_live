package app.chalo.multimodalticket.data.model.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSummaryLegAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryLegAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5867a;
    public final ChaloTransitMode b;
    public final String c;
    public final GroupTicketSummaryTripDetailAppModel d;

    public GroupTicketSummaryLegAppModel(int i, ChaloTransitMode transportMode, String configId, GroupTicketSummaryTripDetailAppModel groupTicketSummaryTripDetailAppModel) {
        Intrinsics.i(transportMode, "transportMode");
        Intrinsics.i(configId, "configId");
        this.f5867a = i;
        this.b = transportMode;
        this.c = configId;
        this.d = groupTicketSummaryTripDetailAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryLegAppModel)) {
            return false;
        }
        GroupTicketSummaryLegAppModel groupTicketSummaryLegAppModel = (GroupTicketSummaryLegAppModel) obj;
        return this.f5867a == groupTicketSummaryLegAppModel.f5867a && this.b == groupTicketSummaryLegAppModel.b && Intrinsics.d(this.c, groupTicketSummaryLegAppModel.c) && Intrinsics.d(this.d, groupTicketSummaryLegAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(n21.c(this.b, this.f5867a * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "GroupTicketSummaryLegAppModel(sequence=" + this.f5867a + ", transportMode=" + this.b + ", configId=" + this.c + ", tripDetail=" + this.d + ")";
    }
}
