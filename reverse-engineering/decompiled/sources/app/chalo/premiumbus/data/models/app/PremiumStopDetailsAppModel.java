package app.chalo.premiumbus.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumStopDetailsAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumStopDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7121a;
    public final String b;

    public PremiumStopDetailsAppModel(String stopId, String stopName) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f7121a = stopId;
        this.b = stopName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumStopDetailsAppModel)) {
            return false;
        }
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = (PremiumStopDetailsAppModel) obj;
        return Intrinsics.d(this.f7121a, premiumStopDetailsAppModel.f7121a) && Intrinsics.d(this.b, premiumStopDetailsAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7121a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("PremiumStopDetailsAppModel(stopId=", this.f7121a, ", stopName=", this.b, ")");
    }
}
