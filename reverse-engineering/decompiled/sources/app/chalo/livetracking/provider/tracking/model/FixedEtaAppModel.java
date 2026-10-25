package app.chalo.livetracking.provider.tracking.model;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/FixedEtaAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FixedEtaAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4367a;
    public final boolean b;
    public final String c;
    public final LiveBusDelayedState d;
    public final SeatAvailabilityLevel e;

    public FixedEtaAppModel(long j, boolean z, String vehicleNumber, LiveBusDelayedState delayedState, SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(delayedState, "delayedState");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        this.f4367a = j;
        this.b = z;
        this.c = vehicleNumber;
        this.d = delayedState;
        this.e = seatAvailabilityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedEtaAppModel)) {
            return false;
        }
        FixedEtaAppModel fixedEtaAppModel = (FixedEtaAppModel) obj;
        return this.f4367a == fixedEtaAppModel.f4367a && this.b == fixedEtaAppModel.b && Intrinsics.d(this.c, fixedEtaAppModel.c) && Intrinsics.d(this.d, fixedEtaAppModel.d) && this.e == fixedEtaAppModel.e;
    }

    public final int hashCode() {
        long j = this.f4367a;
        return this.e.hashCode() + ((this.d.hashCode() + nf1.e(((((int) (j ^ (j >>> 32))) * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "FixedEtaAppModel(eta=" + this.f4367a + ", isBusHalted=" + this.b + ", vehicleNumber=" + this.c + ", delayedState=" + this.d + ", seatAvailabilityLevel=" + this.e + ")";
    }
}
