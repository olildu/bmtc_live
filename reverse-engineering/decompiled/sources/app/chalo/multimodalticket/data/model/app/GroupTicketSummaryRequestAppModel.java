package app.chalo.multimodalticket.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSummaryRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5870a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public GroupTicketSummaryRequestAppModel(String str, String transactionId, String journeyConfigId, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(journeyConfigId, "journeyConfigId");
        this.f5870a = str;
        this.b = transactionId;
        this.c = journeyConfigId;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryRequestAppModel)) {
            return false;
        }
        GroupTicketSummaryRequestAppModel groupTicketSummaryRequestAppModel = (GroupTicketSummaryRequestAppModel) obj;
        return this.f5870a.equals(groupTicketSummaryRequestAppModel.f5870a) && Intrinsics.d(this.b, groupTicketSummaryRequestAppModel.b) && Intrinsics.d(this.c, groupTicketSummaryRequestAppModel.c) && this.d.equals(groupTicketSummaryRequestAppModel.d) && this.e.equals(groupTicketSummaryRequestAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xs.e(this.d, nf1.e(nf1.e(this.f5870a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketSummaryRequestAppModel(city=", this.f5870a, ", transactionId=", this.b, ", journeyConfigId=");
        sbE.append(this.c);
        sbE.append(", passengerDetails=");
        sbE.append(this.d);
        sbE.append(", legs=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
