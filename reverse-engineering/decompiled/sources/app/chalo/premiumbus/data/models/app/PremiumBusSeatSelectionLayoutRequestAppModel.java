package app.chalo.premiumbus.data.models.app;

import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusSeatSelectionLayoutRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionLayoutRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7105a;
    public final String b;
    public final String c;
    public final String d;

    public PremiumBusSeatSelectionLayoutRequestAppModel(String str, String fromStopId, String toStopId, List list) {
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        this.f7105a = list;
        this.b = str;
        this.c = fromStopId;
        this.d = toStopId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionLayoutRequestAppModel)) {
            return false;
        }
        PremiumBusSeatSelectionLayoutRequestAppModel premiumBusSeatSelectionLayoutRequestAppModel = (PremiumBusSeatSelectionLayoutRequestAppModel) obj;
        return Intrinsics.d(this.f7105a, premiumBusSeatSelectionLayoutRequestAppModel.f7105a) && Intrinsics.d(this.b, premiumBusSeatSelectionLayoutRequestAppModel.b) && Intrinsics.d(this.c, premiumBusSeatSelectionLayoutRequestAppModel.c) && Intrinsics.d(this.d, premiumBusSeatSelectionLayoutRequestAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f7105a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusSeatSelectionLayoutRequestAppModel(tripIds=");
        sb.append(this.f7105a);
        sb.append(", city=");
        sb.append(this.b);
        sb.append(", fromStopId=");
        return r30.i(sb, this.c, ", toStopId=", this.d, ")");
    }
}
