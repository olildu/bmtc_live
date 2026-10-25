package app.chalo.multimodalticket.data.model.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegBreakupFareDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegBreakupFareDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5859a;
    public final ChaloTransitMode b;
    public final String c;
    public final String d;
    public final long e;
    public final Long f;
    public final ArrayList g;

    public GroupTicketLegBreakupFareDetailsAppModel(int i, ChaloTransitMode chaloTransitMode, String str, String str2, long j, Long l, ArrayList arrayList) {
        this.f5859a = i;
        this.b = chaloTransitMode;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = l;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegBreakupFareDetailsAppModel)) {
            return false;
        }
        GroupTicketLegBreakupFareDetailsAppModel groupTicketLegBreakupFareDetailsAppModel = (GroupTicketLegBreakupFareDetailsAppModel) obj;
        return this.f5859a == groupTicketLegBreakupFareDetailsAppModel.f5859a && this.b == groupTicketLegBreakupFareDetailsAppModel.b && this.c.equals(groupTicketLegBreakupFareDetailsAppModel.c) && this.d.equals(groupTicketLegBreakupFareDetailsAppModel.d) && this.e == groupTicketLegBreakupFareDetailsAppModel.e && Intrinsics.d(this.f, groupTicketLegBreakupFareDetailsAppModel.f) && this.g.equals(groupTicketLegBreakupFareDetailsAppModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(n21.c(this.b, this.f5859a * 31, 31), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f;
        return this.g.hashCode() + ((i + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketLegBreakupFareDetailsAppModel(sequenceNumber=");
        sb.append(this.f5859a);
        sb.append(", transitMode=");
        sb.append(this.b);
        sb.append(", productId=");
        cb0.t(sb, this.c, ", categoryId=", this.d, ", payableAmount=");
        sb.append(this.e);
        sb.append(", actualAmount=");
        sb.append(this.f);
        sb.append(", legFareBreakup=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
