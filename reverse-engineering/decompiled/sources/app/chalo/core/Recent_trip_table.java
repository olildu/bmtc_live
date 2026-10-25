package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.ChaloDescriptiveLocationEntityModel;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_trip_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_trip_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2002a;
    public final String b;
    public final ChaloDescriptiveLocationEntityModel c;
    public final ChaloDescriptiveLocationEntityModel d;
    public final ChaloTransitMode e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_trip_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2003a;
        public final ColumnAdapter b;
        public final EnumColumnAdapter c;

        public Adapter(ColumnAdapter from_locationAdapter, ColumnAdapter to_locationAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(from_locationAdapter, "from_locationAdapter");
            Intrinsics.i(to_locationAdapter, "to_locationAdapter");
            this.f2003a = from_locationAdapter;
            this.b = to_locationAdapter;
            this.c = enumColumnAdapter;
        }
    }

    public Recent_trip_table(String trip_id, String city_id, ChaloDescriptiveLocationEntityModel from_location, ChaloDescriptiveLocationEntityModel to_location, ChaloTransitMode chaloTransitMode, long j, long j2) {
        Intrinsics.i(trip_id, "trip_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(from_location, "from_location");
        Intrinsics.i(to_location, "to_location");
        this.f2002a = trip_id;
        this.b = city_id;
        this.c = from_location;
        this.d = to_location;
        this.e = chaloTransitMode;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_trip_table)) {
            return false;
        }
        Recent_trip_table recent_trip_table = (Recent_trip_table) obj;
        return Intrinsics.d(this.f2002a, recent_trip_table.f2002a) && Intrinsics.d(this.b, recent_trip_table.b) && Intrinsics.d(this.c, recent_trip_table.c) && Intrinsics.d(this.d, recent_trip_table.d) && this.e == recent_trip_table.e && this.f == recent_trip_table.f && this.g == recent_trip_table.g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f2002a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        ChaloTransitMode chaloTransitMode = this.e;
        int iHashCode2 = (iHashCode + (chaloTransitMode == null ? 0 : chaloTransitMode.hashCode())) * 31;
        long j = this.f;
        long j2 = this.g;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_trip_table(trip_id=", this.f2002a, ", city_id=", this.b, ", from_location=");
        sbE.append(this.c);
        sbE.append(", to_location=");
        sbE.append(this.d);
        sbE.append(", transit_mode=");
        sbE.append(this.e);
        sbE.append(", access_time=");
        sbE.append(this.f);
        return t10.g(this.g, ", access_count=", ")", sbE);
    }
}
