package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_stop_and_route_based_trip_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1996a;
    public final String b;
    public final String c;
    public final String d;
    public final RecentAdditionalRouteInfoEntity e;
    public final RecentStopInfoEntity f;
    public final RecentStopInfoEntity g;
    public final ChaloTransitMode h;
    public final long i;
    public final long j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_stop_and_route_based_trip_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1997a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final EnumColumnAdapter d;

        public Adapter(ColumnAdapter additional_route_infoAdapter, ColumnAdapter origin_stopAdapter, ColumnAdapter destination_stopAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(additional_route_infoAdapter, "additional_route_infoAdapter");
            Intrinsics.i(origin_stopAdapter, "origin_stopAdapter");
            Intrinsics.i(destination_stopAdapter, "destination_stopAdapter");
            this.f1997a = additional_route_infoAdapter;
            this.b = origin_stopAdapter;
            this.c = destination_stopAdapter;
            this.d = enumColumnAdapter;
        }
    }

    public Recent_stop_and_route_based_trip_table(String id, String city_id, String route_id, String route_name, RecentAdditionalRouteInfoEntity additional_route_info, RecentStopInfoEntity origin_stop, RecentStopInfoEntity destination_stop, ChaloTransitMode transit_mode, long j, long j2) {
        Intrinsics.i(id, "id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(route_name, "route_name");
        Intrinsics.i(additional_route_info, "additional_route_info");
        Intrinsics.i(origin_stop, "origin_stop");
        Intrinsics.i(destination_stop, "destination_stop");
        Intrinsics.i(transit_mode, "transit_mode");
        this.f1996a = id;
        this.b = city_id;
        this.c = route_id;
        this.d = route_name;
        this.e = additional_route_info;
        this.f = origin_stop;
        this.g = destination_stop;
        this.h = transit_mode;
        this.i = j;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_stop_and_route_based_trip_table)) {
            return false;
        }
        Recent_stop_and_route_based_trip_table recent_stop_and_route_based_trip_table = (Recent_stop_and_route_based_trip_table) obj;
        return Intrinsics.d(this.f1996a, recent_stop_and_route_based_trip_table.f1996a) && Intrinsics.d(this.b, recent_stop_and_route_based_trip_table.b) && Intrinsics.d(this.c, recent_stop_and_route_based_trip_table.c) && Intrinsics.d(this.d, recent_stop_and_route_based_trip_table.d) && Intrinsics.d(this.e, recent_stop_and_route_based_trip_table.e) && Intrinsics.d(this.f, recent_stop_and_route_based_trip_table.f) && Intrinsics.d(this.g, recent_stop_and_route_based_trip_table.g) && this.h == recent_stop_and_route_based_trip_table.h && this.i == recent_stop_and_route_based_trip_table.i && this.j == recent_stop_and_route_based_trip_table.j;
    }

    public final int hashCode() {
        int iC = n21.c(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f1996a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31);
        long j = this.i;
        long j2 = this.j;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_stop_and_route_based_trip_table(id=", this.f1996a, ", city_id=", this.b, ", route_id=");
        cb0.t(sbE, this.c, ", route_name=", this.d, ", additional_route_info=");
        sbE.append(this.e);
        sbE.append(", origin_stop=");
        sbE.append(this.f);
        sbE.append(", destination_stop=");
        sbE.append(this.g);
        sbE.append(", transit_mode=");
        sbE.append(this.h);
        sbE.append(", access_time=");
        sbE.append(this.i);
        return t10.g(this.j, ", access_count=", ")", sbE);
    }
}
