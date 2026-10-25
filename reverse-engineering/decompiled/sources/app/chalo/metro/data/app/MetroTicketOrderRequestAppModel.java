package app.chalo.metro.data.app;

import app.chalo.metro.data.api.MetroTicketTripDetails;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketOrderRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketOrderRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketBookingMode f5433a;
    public final String b;
    public final long c;
    public final List d;
    public final MetroTicketTripDetails e;
    public final String f;

    public MetroTicketOrderRequestAppModel(ChaloTicketBookingMode bookingMode, String productConfigId, long j, List passengerDetails, MetroTicketTripDetails metroTicketTripDetails, String str) {
        Intrinsics.i(bookingMode, "bookingMode");
        Intrinsics.i(productConfigId, "productConfigId");
        Intrinsics.i(passengerDetails, "passengerDetails");
        this.f5433a = bookingMode;
        this.b = productConfigId;
        this.c = j;
        this.d = passengerDetails;
        this.e = metroTicketTripDetails;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketOrderRequestAppModel)) {
            return false;
        }
        MetroTicketOrderRequestAppModel metroTicketOrderRequestAppModel = (MetroTicketOrderRequestAppModel) obj;
        return this.f5433a == metroTicketOrderRequestAppModel.f5433a && Intrinsics.d(this.b, metroTicketOrderRequestAppModel.b) && this.c == metroTicketOrderRequestAppModel.c && Intrinsics.d(this.d, metroTicketOrderRequestAppModel.d) && Intrinsics.d(this.e, metroTicketOrderRequestAppModel.e) && Intrinsics.d(this.f, metroTicketOrderRequestAppModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5433a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int iB = r30.b((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d);
        MetroTicketTripDetails metroTicketTripDetails = this.e;
        return this.f.hashCode() + ((iB + (metroTicketTripDetails == null ? 0 : metroTicketTripDetails.hashCode())) * 31);
    }

    public final String toString() {
        return "MetroTicketOrderRequestAppModel(bookingMode=" + this.f5433a + ", productConfigId=" + this.b + ", totalFare=" + this.c + ", passengerDetails=" + this.d + ", tripDetails=" + this.e + ", city=" + this.f + ")";
    }
}
