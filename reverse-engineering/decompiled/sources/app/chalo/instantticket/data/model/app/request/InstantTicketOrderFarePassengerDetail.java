package app.chalo.instantticket.data.model.app.request;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/request/InstantTicketOrderFarePassengerDetail;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketOrderFarePassengerDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3886a;
    public final String b;

    public InstantTicketOrderFarePassengerDetail(int i, String passengerId) {
        Intrinsics.i(passengerId, "passengerId");
        this.f3886a = i;
        this.b = passengerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketOrderFarePassengerDetail)) {
            return false;
        }
        InstantTicketOrderFarePassengerDetail instantTicketOrderFarePassengerDetail = (InstantTicketOrderFarePassengerDetail) obj;
        return this.f3886a == instantTicketOrderFarePassengerDetail.f3886a && Intrinsics.d(this.b, instantTicketOrderFarePassengerDetail.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3886a * 31);
    }

    public final String toString() {
        return hq0.d(this.f3886a, "InstantTicketOrderFarePassengerDetail(passengerCount=", ", passengerId=", this.b, ")");
    }
}
