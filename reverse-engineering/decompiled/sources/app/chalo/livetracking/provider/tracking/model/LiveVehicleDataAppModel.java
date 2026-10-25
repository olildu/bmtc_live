package app.chalo.livetracking.provider.tracking.model;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.i71;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/LiveVehicleDataAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveVehicleDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4369a;
    public final long b;
    public final long c;
    public final LatLng d;
    public final boolean e;
    public final String f;
    public final String g;
    public final LiveBusDelayedState h;
    public final String i;
    public final String j;
    public final Long k;

    public LiveVehicleDataAppModel(String vehicleNumber, long j, long j2, LatLng position, boolean z, String nextStopId, String lastStopId, LiveBusDelayedState delayedState, String str, String str2, Long l) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(position, "position");
        Intrinsics.i(nextStopId, "nextStopId");
        Intrinsics.i(lastStopId, "lastStopId");
        Intrinsics.i(delayedState, "delayedState");
        this.f4369a = vehicleNumber;
        this.b = j;
        this.c = j2;
        this.d = position;
        this.e = z;
        this.f = nextStopId;
        this.g = lastStopId;
        this.h = delayedState;
        this.i = str;
        this.j = str2;
        this.k = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVehicleDataAppModel)) {
            return false;
        }
        LiveVehicleDataAppModel liveVehicleDataAppModel = (LiveVehicleDataAppModel) obj;
        return Intrinsics.d(this.f4369a, liveVehicleDataAppModel.f4369a) && this.b == liveVehicleDataAppModel.b && this.c == liveVehicleDataAppModel.c && Intrinsics.d(this.d, liveVehicleDataAppModel.d) && this.e == liveVehicleDataAppModel.e && Intrinsics.d(this.f, liveVehicleDataAppModel.f) && Intrinsics.d(this.g, liveVehicleDataAppModel.g) && Intrinsics.d(this.h, liveVehicleDataAppModel.h) && Intrinsics.d(this.i, liveVehicleDataAppModel.i) && Intrinsics.d(this.j, liveVehicleDataAppModel.j) && Intrinsics.d(this.k, liveVehicleDataAppModel.k);
    }

    public final int hashCode() {
        int iHashCode = this.f4369a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iHashCode2 = (this.h.hashCode() + nf1.e(nf1.e((i71.d(this.d, (i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.k;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "LiveVehicleDataAppModel(vehicleNumber=", this.f4369a, ", etaInSecs=");
        xs.r(this.c, ", lastUpdatedAt=", ", position=", sbM);
        sbM.append(this.d);
        sbM.append(", isBusHalted=");
        sbM.append(this.e);
        sbM.append(", nextStopId=");
        cb0.t(sbM, this.f, ", lastStopId=", this.g, ", delayedState=");
        sbM.append(this.h);
        sbM.append(", passedStopId=");
        sbM.append(this.i);
        sbM.append(", passedStopName=");
        sbM.append(this.j);
        sbM.append(", passedStopPassingTime=");
        sbM.append(this.k);
        sbM.append(")");
        return sbM.toString();
    }
}
