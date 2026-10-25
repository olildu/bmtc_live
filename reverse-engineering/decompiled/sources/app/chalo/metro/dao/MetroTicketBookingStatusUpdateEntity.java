package app.chalo.metro.dao;

import app.chalo.metro.data.app.MetroTicketStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/dao/MetroTicketBookingStatusUpdateEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketBookingStatusUpdateEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5399a;
    public final MetroTicketStatus b;

    public MetroTicketBookingStatusUpdateEntity(String bookingId, MetroTicketStatus metroTicketStatus) {
        Intrinsics.i(bookingId, "bookingId");
        this.f5399a = bookingId;
        this.b = metroTicketStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketBookingStatusUpdateEntity)) {
            return false;
        }
        MetroTicketBookingStatusUpdateEntity metroTicketBookingStatusUpdateEntity = (MetroTicketBookingStatusUpdateEntity) obj;
        return Intrinsics.d(this.f5399a, metroTicketBookingStatusUpdateEntity.f5399a) && this.b == metroTicketBookingStatusUpdateEntity.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5399a.hashCode() * 31);
    }

    public final String toString() {
        return "MetroTicketBookingStatusUpdateEntity(bookingId=" + this.f5399a + ", status=" + this.b + ")";
    }
}
