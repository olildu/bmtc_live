package app.chalo.core;

import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Premium_reserve_trip_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1987a;
    public final String b;
    public final String c;
    public final PremiumBusTripStatus d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1988a;

        public Adapter(EnumColumnAdapter enumColumnAdapter) {
            this.f1988a = enumColumnAdapter;
        }
    }

    public Premium_reserve_trip_table(String cityId, String bookingId, String tripId, PremiumBusTripStatus tripStatus, boolean z) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(tripStatus, "tripStatus");
        this.f1987a = cityId;
        this.b = bookingId;
        this.c = tripId;
        this.d = tripStatus;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Premium_reserve_trip_table)) {
            return false;
        }
        Premium_reserve_trip_table premium_reserve_trip_table = (Premium_reserve_trip_table) obj;
        return Intrinsics.d(this.f1987a, premium_reserve_trip_table.f1987a) && Intrinsics.d(this.b, premium_reserve_trip_table.b) && Intrinsics.d(this.c, premium_reserve_trip_table.c) && this.d == premium_reserve_trip_table.d && this.e == premium_reserve_trip_table.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + nf1.e(nf1.e(this.f1987a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Premium_reserve_trip_table(cityId=", this.f1987a, ", bookingId=", this.b, ", tripId=");
        sbE.append(this.c);
        sbE.append(", tripStatus=");
        sbE.append(this.d);
        sbE.append(", userTripEnded=");
        return b3.g(")", sbE, this.e);
    }
}
