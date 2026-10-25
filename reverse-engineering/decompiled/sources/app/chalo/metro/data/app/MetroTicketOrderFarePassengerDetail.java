package app.chalo.metro.data.app;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketOrderFarePassengerDetail;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketOrderFarePassengerDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5432a;
    public final String b;

    public MetroTicketOrderFarePassengerDetail(int i, String passengerId) {
        Intrinsics.i(passengerId, "passengerId");
        this.f5432a = i;
        this.b = passengerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketOrderFarePassengerDetail)) {
            return false;
        }
        MetroTicketOrderFarePassengerDetail metroTicketOrderFarePassengerDetail = (MetroTicketOrderFarePassengerDetail) obj;
        return this.f5432a == metroTicketOrderFarePassengerDetail.f5432a && Intrinsics.d(this.b, metroTicketOrderFarePassengerDetail.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5432a * 31);
    }

    public final String toString() {
        return hq0.d(this.f5432a, "MetroTicketOrderFarePassengerDetail(passengerCount=", ", passengerId=", this.b, ")");
    }
}
