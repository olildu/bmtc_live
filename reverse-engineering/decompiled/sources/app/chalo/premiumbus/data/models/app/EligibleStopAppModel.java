package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/EligibleStopAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EligibleStopAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7080a;
    public final String b;
    public final long c;

    public EligibleStopAppModel(String stopId, String stopName, long j) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f7080a = stopId;
        this.b = stopName;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibleStopAppModel)) {
            return false;
        }
        EligibleStopAppModel eligibleStopAppModel = (EligibleStopAppModel) obj;
        return Intrinsics.d(this.f7080a, eligibleStopAppModel.f7080a) && Intrinsics.d(this.b, eligibleStopAppModel.b) && this.c == eligibleStopAppModel.c;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7080a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return uf0.m(this.c, ")", dd.e("EligibleStopAppModel(stopId=", this.f7080a, ", stopName=", this.b, ", scheduledEta="));
    }
}
