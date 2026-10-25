package app.chalo.livetracking.routedetails.data.model.app.request;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/request/GetSeatAvailabilityRequestAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSeatAvailabilityRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4394a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;

    public GetSeatAvailabilityRequestAppModel(String deviceId, String cityName, int i, int i2, int i3, ArrayList arrayList) {
        Intrinsics.i(deviceId, "deviceId");
        Intrinsics.i(cityName, "cityName");
        this.f4394a = deviceId;
        this.b = cityName;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSeatAvailabilityRequestAppModel)) {
            return false;
        }
        GetSeatAvailabilityRequestAppModel getSeatAvailabilityRequestAppModel = (GetSeatAvailabilityRequestAppModel) obj;
        return Intrinsics.d(this.f4394a, getSeatAvailabilityRequestAppModel.f4394a) && Intrinsics.d(this.b, getSeatAvailabilityRequestAppModel.b) && this.c == getSeatAvailabilityRequestAppModel.c && this.d == getSeatAvailabilityRequestAppModel.d && this.e == getSeatAvailabilityRequestAppModel.e && this.f.equals(getSeatAvailabilityRequestAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((nf1.e(this.f4394a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GetSeatAvailabilityRequestAppModel(deviceId=", this.f4394a, ", cityName=", this.b, ", maxDelay=");
        hq0.p(this.c, this.d, ", seatAvailabilityId=", ", seatOccupancyFactor=", sbE);
        sbE.append(this.e);
        sbE.append(", vehicleDetails=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
