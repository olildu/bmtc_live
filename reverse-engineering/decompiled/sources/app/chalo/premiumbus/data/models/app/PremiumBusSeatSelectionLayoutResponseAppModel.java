package app.chalo.premiumbus.data.models.app;

import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusSeatSelectionLayoutResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionLayoutResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7106a;
    public final int b;
    public final int c;
    public final List d;
    public final ArrayList e;

    public PremiumBusSeatSelectionLayoutResponseAppModel(String tripId, int i, int i2, List availableSeatIds, ArrayList arrayList) {
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(availableSeatIds, "availableSeatIds");
        this.f7106a = tripId;
        this.b = i;
        this.c = i2;
        this.d = availableSeatIds;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionLayoutResponseAppModel)) {
            return false;
        }
        PremiumBusSeatSelectionLayoutResponseAppModel premiumBusSeatSelectionLayoutResponseAppModel = (PremiumBusSeatSelectionLayoutResponseAppModel) obj;
        return Intrinsics.d(this.f7106a, premiumBusSeatSelectionLayoutResponseAppModel.f7106a) && this.b == premiumBusSeatSelectionLayoutResponseAppModel.b && this.c == premiumBusSeatSelectionLayoutResponseAppModel.c && Intrinsics.d(this.d, premiumBusSeatSelectionLayoutResponseAppModel.d) && this.e.equals(premiumBusSeatSelectionLayoutResponseAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.b(((((this.f7106a.hashCode() * 31) + this.b) * 31) + this.c) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "PremiumBusSeatSelectionLayoutResponseAppModel(tripId=", this.f7106a, ", capacity=", ", availableSeats=");
        sbM.append(this.c);
        sbM.append(", availableSeatIds=");
        sbM.append(this.d);
        sbM.append(", seats=");
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
