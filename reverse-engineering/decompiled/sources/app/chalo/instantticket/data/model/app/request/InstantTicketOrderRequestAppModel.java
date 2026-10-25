package app.chalo.instantticket.data.model.app.request;

import app.chalo.instantticket.data.model.app.InstantTicketTripDetails;
import defpackage.r30;
import defpackage.t10;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/request/InstantTicketOrderRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketOrderRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3887a;
    public final long b;
    public final List c;
    public final InstantTicketTripDetails d;
    public final String e;

    public InstantTicketOrderRequestAppModel(String productConfigId, long j, List passengerDetails, InstantTicketTripDetails instantTicketTripDetails, String str) {
        Intrinsics.i(productConfigId, "productConfigId");
        Intrinsics.i(passengerDetails, "passengerDetails");
        this.f3887a = productConfigId;
        this.b = j;
        this.c = passengerDetails;
        this.d = instantTicketTripDetails;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketOrderRequestAppModel)) {
            return false;
        }
        InstantTicketOrderRequestAppModel instantTicketOrderRequestAppModel = (InstantTicketOrderRequestAppModel) obj;
        return Intrinsics.d(this.f3887a, instantTicketOrderRequestAppModel.f3887a) && this.b == instantTicketOrderRequestAppModel.b && Intrinsics.d(this.c, instantTicketOrderRequestAppModel.c) && Intrinsics.d(this.d, instantTicketOrderRequestAppModel.d) && Intrinsics.d(this.e, instantTicketOrderRequestAppModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3887a.hashCode() * 31;
        long j = this.b;
        int iB = r30.b((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
        InstantTicketTripDetails instantTicketTripDetails = this.d;
        return this.e.hashCode() + ((iB + (instantTicketTripDetails == null ? 0 : instantTicketTripDetails.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "InstantTicketOrderRequestAppModel(productConfigId=", this.f3887a, ", totalFare=");
        sbM.append(", passengerDetails=");
        sbM.append(this.c);
        sbM.append(", tripDetails=");
        sbM.append(this.d);
        return z40.h(sbM, ", city=", this.e, ")");
    }
}
