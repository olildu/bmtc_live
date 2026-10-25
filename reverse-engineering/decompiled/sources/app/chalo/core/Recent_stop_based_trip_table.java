package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_stop_based_trip_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1998a;
    public final String b;
    public final RecentStopInfoEntity c;
    public final RecentStopInfoEntity d;
    public final ChaloTransitMode e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_stop_based_trip_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1999a;
        public final ColumnAdapter b;
        public final EnumColumnAdapter c;

        public Adapter(ColumnAdapter origin_stopAdapter, ColumnAdapter destination_stopAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(origin_stopAdapter, "origin_stopAdapter");
            Intrinsics.i(destination_stopAdapter, "destination_stopAdapter");
            this.f1999a = origin_stopAdapter;
            this.b = destination_stopAdapter;
            this.c = enumColumnAdapter;
        }
    }

    public Recent_stop_based_trip_table(String stop_based_trip_id, String city_id, RecentStopInfoEntity origin_stop, RecentStopInfoEntity destination_stop, ChaloTransitMode transit_mode, long j, long j2) {
        Intrinsics.i(stop_based_trip_id, "stop_based_trip_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(origin_stop, "origin_stop");
        Intrinsics.i(destination_stop, "destination_stop");
        Intrinsics.i(transit_mode, "transit_mode");
        this.f1998a = stop_based_trip_id;
        this.b = city_id;
        this.c = origin_stop;
        this.d = destination_stop;
        this.e = transit_mode;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_stop_based_trip_table)) {
            return false;
        }
        Recent_stop_based_trip_table recent_stop_based_trip_table = (Recent_stop_based_trip_table) obj;
        return Intrinsics.d(this.f1998a, recent_stop_based_trip_table.f1998a) && Intrinsics.d(this.b, recent_stop_based_trip_table.b) && Intrinsics.d(this.c, recent_stop_based_trip_table.c) && Intrinsics.d(this.d, recent_stop_based_trip_table.d) && this.e == recent_stop_based_trip_table.e && this.f == recent_stop_based_trip_table.f && this.g == recent_stop_based_trip_table.g;
    }

    public final int hashCode() {
        int iC = n21.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f1998a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        long j = this.f;
        long j2 = this.g;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_stop_based_trip_table(stop_based_trip_id=", this.f1998a, ", city_id=", this.b, ", origin_stop=");
        sbE.append(this.c);
        sbE.append(", destination_stop=");
        sbE.append(this.d);
        sbE.append(", transit_mode=");
        sbE.append(this.e);
        sbE.append(", access_time=");
        sbE.append(this.f);
        return t10.g(this.g, ", access_count=", ")", sbE);
    }
}
