package app.chalo.multimodalticket.data.model.app;

import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCreateOrderRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCreateOrderRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5855a;
    public final String b;
    public final String c;
    public final long d;
    public final ArrayList e;
    public final ArrayList f;

    public GroupTicketCreateOrderRequestAppModel(String str, String journeyConfigurationId, String transactionId, long j, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(journeyConfigurationId, "journeyConfigurationId");
        Intrinsics.i(transactionId, "transactionId");
        this.f5855a = str;
        this.b = journeyConfigurationId;
        this.c = transactionId;
        this.d = j;
        this.e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderRequestAppModel)) {
            return false;
        }
        GroupTicketCreateOrderRequestAppModel groupTicketCreateOrderRequestAppModel = (GroupTicketCreateOrderRequestAppModel) obj;
        return this.f5855a.equals(groupTicketCreateOrderRequestAppModel.f5855a) && Intrinsics.d(this.b, groupTicketCreateOrderRequestAppModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderRequestAppModel.c) && this.d == groupTicketCreateOrderRequestAppModel.d && this.e.equals(groupTicketCreateOrderRequestAppModel.e) && this.f.equals(groupTicketCreateOrderRequestAppModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5855a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.f.hashCode() + xs.e(this.e, (iE + ((int) (j ^ (j >>> 32)))) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketCreateOrderRequestAppModel(city=", this.f5855a, ", journeyConfigurationId=", this.b, ", transactionId=");
        n21.p(this.d, this.c, ", amount=", sbE);
        sbE.append(", passengerDetails=");
        sbE.append(this.e);
        sbE.append(", legs=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
