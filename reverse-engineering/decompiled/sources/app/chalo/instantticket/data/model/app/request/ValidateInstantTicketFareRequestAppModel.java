package app.chalo.instantticket.data.model.app.request;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/request/ValidateInstantTicketFareRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidateInstantTicketFareRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3889a;
    public final long b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;

    public ValidateInstantTicketFareRequestAppModel(long j, String str, String routeId, String startStopId, String endStopId, List passengerDetails) {
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopId, "endStopId");
        this.f3889a = str;
        this.b = j;
        this.c = passengerDetails;
        this.d = routeId;
        this.e = startStopId;
        this.f = endStopId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateInstantTicketFareRequestAppModel)) {
            return false;
        }
        ValidateInstantTicketFareRequestAppModel validateInstantTicketFareRequestAppModel = (ValidateInstantTicketFareRequestAppModel) obj;
        return Intrinsics.d(this.f3889a, validateInstantTicketFareRequestAppModel.f3889a) && this.b == validateInstantTicketFareRequestAppModel.b && Intrinsics.d(this.c, validateInstantTicketFareRequestAppModel.c) && Intrinsics.d(this.d, validateInstantTicketFareRequestAppModel.d) && Intrinsics.d(this.e, validateInstantTicketFareRequestAppModel.e) && Intrinsics.d(this.f, validateInstantTicketFareRequestAppModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f3889a.hashCode() * 31;
        long j = this.b;
        return this.f.hashCode() + nf1.e(nf1.e(r30.b((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "ValidateInstantTicketFareRequestAppModel(cityName=", this.f3889a, ", totalFare=");
        sbM.append(", passengerDetails=");
        sbM.append(this.c);
        sbM.append(", routeId=");
        sbM.append(this.d);
        cb0.t(sbM, ", startStopId=", this.e, ", endStopId=", this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
