package app.chalo.metro.data.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketUpdateRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketUpdateRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5435a;
    public final MetroTicketPaymentStatus b;

    public MetroTicketUpdateRequestAppModel(String bookingId, MetroTicketPaymentStatus paymentStatus) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(paymentStatus, "paymentStatus");
        this.f5435a = bookingId;
        this.b = paymentStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketUpdateRequestAppModel)) {
            return false;
        }
        MetroTicketUpdateRequestAppModel metroTicketUpdateRequestAppModel = (MetroTicketUpdateRequestAppModel) obj;
        return Intrinsics.d(this.f5435a, metroTicketUpdateRequestAppModel.f5435a) && this.b == metroTicketUpdateRequestAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5435a.hashCode() * 31);
    }

    public final String toString() {
        return "MetroTicketUpdateRequestAppModel(bookingId=" + this.f5435a + ", paymentStatus=" + this.b + ")";
    }
}
