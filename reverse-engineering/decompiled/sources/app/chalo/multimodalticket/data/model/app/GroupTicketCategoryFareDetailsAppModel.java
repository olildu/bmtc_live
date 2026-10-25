package app.chalo.multimodalticket.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketCategoryFareDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketCategoryFareDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5851a;
    public final String b;
    public final long c;
    public final Long d;
    public final int e;
    public final int f;
    public final List g;

    public GroupTicketCategoryFareDetailsAppModel(String id, String name, long j, Long l, int i, int i2, List legBreakup) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(legBreakup, "legBreakup");
        this.f5851a = id;
        this.b = name;
        this.c = j;
        this.d = l;
        this.e = i;
        this.f = i2;
        this.g = legBreakup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCategoryFareDetailsAppModel)) {
            return false;
        }
        GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel = (GroupTicketCategoryFareDetailsAppModel) obj;
        return Intrinsics.d(this.f5851a, groupTicketCategoryFareDetailsAppModel.f5851a) && Intrinsics.d(this.b, groupTicketCategoryFareDetailsAppModel.b) && this.c == groupTicketCategoryFareDetailsAppModel.c && Intrinsics.d(this.d, groupTicketCategoryFareDetailsAppModel.d) && this.e == groupTicketCategoryFareDetailsAppModel.e && this.f == groupTicketCategoryFareDetailsAppModel.f && Intrinsics.d(this.g, groupTicketCategoryFareDetailsAppModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5851a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.d;
        return this.g.hashCode() + ((((((i + (l == null ? 0 : l.hashCode())) * 31) + this.e) * 31) + this.f) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketCategoryFareDetailsAppModel(id=", this.f5851a, ", name=", this.b, ", payableAmount=");
        sbE.append(this.c);
        sbE.append(", actualAmount=");
        sbE.append(this.d);
        z40.o(this.e, this.f, ", minIssueCount=", ", maxIssueCount=", sbE);
        sbE.append(", legBreakup=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
