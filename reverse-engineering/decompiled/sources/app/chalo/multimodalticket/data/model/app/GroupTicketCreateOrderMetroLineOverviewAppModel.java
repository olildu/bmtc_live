package app.chalo.multimodalticket.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCreateOrderMetroLineOverviewAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCreateOrderMetroLineOverviewAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5853a;
    public final String b;
    public final ArrayList c;

    public GroupTicketCreateOrderMetroLineOverviewAppModel(String lineName, String lineColor, ArrayList arrayList) {
        Intrinsics.i(lineName, "lineName");
        Intrinsics.i(lineColor, "lineColor");
        this.f5853a = lineName;
        this.b = lineColor;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderMetroLineOverviewAppModel)) {
            return false;
        }
        GroupTicketCreateOrderMetroLineOverviewAppModel groupTicketCreateOrderMetroLineOverviewAppModel = (GroupTicketCreateOrderMetroLineOverviewAppModel) obj;
        return Intrinsics.d(this.f5853a, groupTicketCreateOrderMetroLineOverviewAppModel.f5853a) && Intrinsics.d(this.b, groupTicketCreateOrderMetroLineOverviewAppModel.b) && this.c.equals(groupTicketCreateOrderMetroLineOverviewAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5853a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketCreateOrderMetroLineOverviewAppModel(lineName=", this.f5853a, ", lineColor=", this.b, ", stops=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
