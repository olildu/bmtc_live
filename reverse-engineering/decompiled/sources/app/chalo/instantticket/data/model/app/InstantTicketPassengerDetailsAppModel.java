package app.chalo.instantticket.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/InstantTicketPassengerDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketPassengerDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3882a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final Integer f;
    public final Boolean g;

    public InstantTicketPassengerDetailsAppModel(String id, String name, int i, long j, long j2, Integer num, Boolean bool) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        this.f3882a = id;
        this.b = name;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = num;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketPassengerDetailsAppModel)) {
            return false;
        }
        InstantTicketPassengerDetailsAppModel instantTicketPassengerDetailsAppModel = (InstantTicketPassengerDetailsAppModel) obj;
        return Intrinsics.d(this.f3882a, instantTicketPassengerDetailsAppModel.f3882a) && Intrinsics.d(this.b, instantTicketPassengerDetailsAppModel.b) && this.c == instantTicketPassengerDetailsAppModel.c && this.d == instantTicketPassengerDetailsAppModel.d && this.e == instantTicketPassengerDetailsAppModel.e && Intrinsics.d(this.f, instantTicketPassengerDetailsAppModel.f) && Intrinsics.d(this.g, instantTicketPassengerDetailsAppModel.g);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f3882a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.f;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketPassengerDetailsAppModel(id=", this.f3882a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualAmount=");
        sbE.append(this.d);
        xs.r(this.e, ", payableAmount=", ", discountPercentage=", sbE);
        sbE.append(this.f);
        sbE.append(", isDiscountApplicable=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
