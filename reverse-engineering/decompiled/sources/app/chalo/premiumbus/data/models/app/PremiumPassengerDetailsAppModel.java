package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumPassengerDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumPassengerDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7111a;
    public final String b;
    public final int c;
    public final long d;
    public final List e;

    public PremiumPassengerDetailsAppModel(String id, String name, int i, long j, List fareBreakup) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(fareBreakup, "fareBreakup");
        this.f7111a = id;
        this.b = name;
        this.c = i;
        this.d = j;
        this.e = fareBreakup;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumPassengerDetailsAppModel)) {
            return false;
        }
        PremiumPassengerDetailsAppModel premiumPassengerDetailsAppModel = (PremiumPassengerDetailsAppModel) obj;
        return Intrinsics.d(this.f7111a, premiumPassengerDetailsAppModel.f7111a) && Intrinsics.d(this.b, premiumPassengerDetailsAppModel.b) && this.c == premiumPassengerDetailsAppModel.c && this.d == premiumPassengerDetailsAppModel.d && Intrinsics.d(this.e, premiumPassengerDetailsAppModel.e);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f7111a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        return this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumPassengerDetailsAppModel(id=", this.f7111a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualFare=");
        sbE.append(this.d);
        sbE.append(", fareBreakup=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
