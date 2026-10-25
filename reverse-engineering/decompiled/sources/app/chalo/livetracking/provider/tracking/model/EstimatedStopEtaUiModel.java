package app.chalo.livetracking.provider.tracking.model;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/EstimatedStopEtaUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EstimatedStopEtaUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4366a;
    public final String b;
    public final boolean c;
    public final String d;

    public EstimatedStopEtaUiModel(String minEtaInMins, String maxEtaInMins, String vehicleNumber, boolean z) {
        Intrinsics.i(minEtaInMins, "minEtaInMins");
        Intrinsics.i(maxEtaInMins, "maxEtaInMins");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4366a = minEtaInMins;
        this.b = maxEtaInMins;
        this.c = z;
        this.d = vehicleNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedStopEtaUiModel)) {
            return false;
        }
        EstimatedStopEtaUiModel estimatedStopEtaUiModel = (EstimatedStopEtaUiModel) obj;
        return Intrinsics.d(this.f4366a, estimatedStopEtaUiModel.f4366a) && Intrinsics.d(this.b, estimatedStopEtaUiModel.b) && this.c == estimatedStopEtaUiModel.c && Intrinsics.d(this.d, estimatedStopEtaUiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((nf1.e(this.f4366a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("EstimatedStopEtaUiModel(minEtaInMins=", this.f4366a, ", maxEtaInMins=", this.b, ", isBusHalted=");
        sbE.append(this.c);
        sbE.append(", vehicleNumber=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
