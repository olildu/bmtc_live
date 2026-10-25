package app.chalo.livetracking.provider.tracking.model;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import defpackage.i71;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/EstimatedEtaAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EstimatedEtaAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4365a;
    public final long b;
    public final boolean c;
    public final String d;
    public final SeatAvailabilityLevel e;

    public EstimatedEtaAppModel(long j, long j2, boolean z, String vehicleNumber, SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        this.f4365a = j;
        this.b = j2;
        this.c = z;
        this.d = vehicleNumber;
        this.e = seatAvailabilityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedEtaAppModel)) {
            return false;
        }
        EstimatedEtaAppModel estimatedEtaAppModel = (EstimatedEtaAppModel) obj;
        return this.f4365a == estimatedEtaAppModel.f4365a && this.b == estimatedEtaAppModel.b && this.c == estimatedEtaAppModel.c && Intrinsics.d(this.d, estimatedEtaAppModel.d) && this.e == estimatedEtaAppModel.e;
    }

    public final int hashCode() {
        long j = this.f4365a;
        long j2 = this.b;
        return this.e.hashCode() + nf1.e(((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f4365a, "EstimatedEtaAppModel(minEta=", ", maxEta=");
        sbG.append(this.b);
        sbG.append(", isBusHalted=");
        sbG.append(this.c);
        sbG.append(", vehicleNumber=");
        sbG.append(this.d);
        sbG.append(", seatAvailabilityLevel=");
        sbG.append(this.e);
        sbG.append(")");
        return sbG.toString();
    }
}
