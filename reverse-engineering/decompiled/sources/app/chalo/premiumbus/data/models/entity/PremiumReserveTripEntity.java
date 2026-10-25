package app.chalo.premiumbus.data.models.entity;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTripEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTripEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7141a;
    public final String b;
    public final String c;
    public final PremiumBusTripStatus d;
    public final boolean e;

    public PremiumReserveTripEntity(String cityId, String bookingId, String tripId, PremiumBusTripStatus tripStatus, boolean z) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(tripStatus, "tripStatus");
        this.f7141a = cityId;
        this.b = bookingId;
        this.c = tripId;
        this.d = tripStatus;
        this.e = z;
    }

    public final PremiumReserveTripAppModel a() {
        return new PremiumReserveTripAppModel(this.f7141a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTripEntity)) {
            return false;
        }
        PremiumReserveTripEntity premiumReserveTripEntity = (PremiumReserveTripEntity) obj;
        return Intrinsics.d(this.f7141a, premiumReserveTripEntity.f7141a) && Intrinsics.d(this.b, premiumReserveTripEntity.b) && Intrinsics.d(this.c, premiumReserveTripEntity.c) && this.d == premiumReserveTripEntity.d && this.e == premiumReserveTripEntity.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + nf1.e(nf1.e(this.f7141a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTripEntity(cityId=", this.f7141a, ", bookingId=", this.b, ", tripId=");
        sbE.append(this.c);
        sbE.append(", tripStatus=");
        sbE.append(this.d);
        sbE.append(", userTripEnded=");
        return b3.g(")", sbE, this.e);
    }
}
