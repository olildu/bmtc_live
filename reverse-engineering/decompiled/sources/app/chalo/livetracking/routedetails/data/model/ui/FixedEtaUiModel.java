package app.chalo.livetracking.routedetails.data.model.ui;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/FixedEtaUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FixedEtaUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4400a;
    public final boolean b;
    public final String c;
    public final Long d;
    public final SeatAvailabilityLevel e;

    public FixedEtaUiModel(String etaInMins, boolean z, String vehicleNumber, Long l, SeatAvailabilityLevel vehicleSeatAvailabilityLevel) {
        Intrinsics.i(etaInMins, "etaInMins");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(vehicleSeatAvailabilityLevel, "vehicleSeatAvailabilityLevel");
        this.f4400a = etaInMins;
        this.b = z;
        this.c = vehicleNumber;
        this.d = l;
        this.e = vehicleSeatAvailabilityLevel;
    }

    public static FixedEtaUiModel a(FixedEtaUiModel fixedEtaUiModel, SeatAvailabilityLevel vehicleSeatAvailabilityLevel) {
        String etaInMins = fixedEtaUiModel.f4400a;
        boolean z = fixedEtaUiModel.b;
        String vehicleNumber = fixedEtaUiModel.c;
        Long l = fixedEtaUiModel.d;
        fixedEtaUiModel.getClass();
        Intrinsics.i(etaInMins, "etaInMins");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(vehicleSeatAvailabilityLevel, "vehicleSeatAvailabilityLevel");
        return new FixedEtaUiModel(etaInMins, z, vehicleNumber, l, vehicleSeatAvailabilityLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedEtaUiModel)) {
            return false;
        }
        FixedEtaUiModel fixedEtaUiModel = (FixedEtaUiModel) obj;
        return Intrinsics.d(this.f4400a, fixedEtaUiModel.f4400a) && this.b == fixedEtaUiModel.b && Intrinsics.d(this.c, fixedEtaUiModel.c) && Intrinsics.d(this.d, fixedEtaUiModel.d) && this.e == fixedEtaUiModel.e;
    }

    public final int hashCode() {
        int iE = nf1.e(((this.f4400a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
        Long l = this.d;
        return this.e.hashCode() + ((iE + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("FixedEtaUiModel(etaInMins=", this.f4400a, ", isBusHalted=", ", vehicleNumber=", this.b);
        cb0.r(this.d, this.c, ", minutesSinceLastUpdated=", ", vehicleSeatAvailabilityLevel=", sbM);
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
