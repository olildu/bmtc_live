package app.chalo.premiumbus.data.models.app;

import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTripAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTripAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7119a;
    public final String b;
    public final String c;
    public final PremiumBusTripStatus d;
    public final boolean e;

    public PremiumReserveTripAppModel(String cityId, String bookingId, String tripId, PremiumBusTripStatus tripStatus, boolean z) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(tripStatus, "tripStatus");
        this.f7119a = cityId;
        this.b = bookingId;
        this.c = tripId;
        this.d = tripStatus;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTripAppModel)) {
            return false;
        }
        PremiumReserveTripAppModel premiumReserveTripAppModel = (PremiumReserveTripAppModel) obj;
        return Intrinsics.d(this.f7119a, premiumReserveTripAppModel.f7119a) && Intrinsics.d(this.b, premiumReserveTripAppModel.b) && Intrinsics.d(this.c, premiumReserveTripAppModel.c) && this.d == premiumReserveTripAppModel.d && this.e == premiumReserveTripAppModel.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + nf1.e(nf1.e(this.f7119a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTripAppModel(cityId=", this.f7119a, ", bookingId=", this.b, ", tripId=");
        sbE.append(this.c);
        sbE.append(", tripStatus=");
        sbE.append(this.d);
        sbE.append(", userTripEnded=");
        return b3.g(")", sbE, this.e);
    }
}
