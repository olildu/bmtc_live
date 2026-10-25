package app.chalo.premiumbus.data.models.app;

import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/UpcomingVehicleAppResponseModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpcomingVehicleAppResponseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7127a;
    public final int b;
    public final int c;
    public final String d;
    public final Long e;

    public UpcomingVehicleAppResponseModel(String vehicleNumber, int i, int i2, String tripId, Long l) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(tripId, "tripId");
        this.f7127a = vehicleNumber;
        this.b = i;
        this.c = i2;
        this.d = tripId;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingVehicleAppResponseModel)) {
            return false;
        }
        UpcomingVehicleAppResponseModel upcomingVehicleAppResponseModel = (UpcomingVehicleAppResponseModel) obj;
        return Intrinsics.d(this.f7127a, upcomingVehicleAppResponseModel.f7127a) && this.b == upcomingVehicleAppResponseModel.b && this.c == upcomingVehicleAppResponseModel.c && Intrinsics.d(this.d, upcomingVehicleAppResponseModel.d) && Intrinsics.d(this.e, upcomingVehicleAppResponseModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(((((this.f7127a.hashCode() * 31) + this.b) * 31) + this.c) * 31, 31, this.d);
        Long l = this.e;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "UpcomingVehicleAppResponseModel(vehicleNumber=", this.f7127a, ", bookingCount=", ", vehicleCapacity=");
        pk0.t(this.c, ", tripId=", this.d, ", etaToBreakdownLocation=", sbM);
        return pk0.l(sbM, this.e, ")");
    }
}
