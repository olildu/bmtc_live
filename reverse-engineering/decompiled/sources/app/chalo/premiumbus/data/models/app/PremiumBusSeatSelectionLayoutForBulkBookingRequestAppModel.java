package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7104a;
    public final String b;
    public final String c;
    public final List d;

    public PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel(String str, String fromStopId, String toStopId, List tripIds) {
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(tripIds, "tripIds");
        this.f7104a = str;
        this.b = fromStopId;
        this.c = toStopId;
        this.d = tripIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel)) {
            return false;
        }
        PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel = (PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel) obj;
        return Intrinsics.d(this.f7104a, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.f7104a) && Intrinsics.d(this.b, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.b) && Intrinsics.d(this.c, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.c) && Intrinsics.d(this.d, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f7104a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return uf0.p(this.c, ", tripIds=", ")", dd.e("PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel(city=", this.f7104a, ", fromStopId=", this.b, ", toStopId="), this.d);
    }
}
