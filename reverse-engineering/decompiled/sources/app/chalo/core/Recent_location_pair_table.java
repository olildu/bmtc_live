package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.core.database.tableadapters.RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_location_pair_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_location_pair_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1990a;
    public final String b;
    public final RecentLocationPairEndpointEntity c;
    public final RecentLocationPairEndpointEntity d;
    public final long e;
    public final long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_location_pair_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1991a;
        public final ColumnAdapter b;

        public Adapter(RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1 from_endpointAdapter, RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1 to_endpointAdapter) {
            Intrinsics.i(from_endpointAdapter, "from_endpointAdapter");
            Intrinsics.i(to_endpointAdapter, "to_endpointAdapter");
            this.f1991a = from_endpointAdapter;
            this.b = to_endpointAdapter;
        }
    }

    public Recent_location_pair_table(String pair_id, String city_id, RecentLocationPairEndpointEntity from_endpoint, RecentLocationPairEndpointEntity to_endpoint, long j, long j2) {
        Intrinsics.i(pair_id, "pair_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(from_endpoint, "from_endpoint");
        Intrinsics.i(to_endpoint, "to_endpoint");
        this.f1990a = pair_id;
        this.b = city_id;
        this.c = from_endpoint;
        this.d = to_endpoint;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_location_pair_table)) {
            return false;
        }
        Recent_location_pair_table recent_location_pair_table = (Recent_location_pair_table) obj;
        return Intrinsics.d(this.f1990a, recent_location_pair_table.f1990a) && Intrinsics.d(this.b, recent_location_pair_table.b) && Intrinsics.d(this.c, recent_location_pair_table.c) && Intrinsics.d(this.d, recent_location_pair_table.d) && this.e == recent_location_pair_table.e && this.f == recent_location_pair_table.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f1990a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_location_pair_table(pair_id=", this.f1990a, ", city_id=", this.b, ", from_endpoint=");
        sbE.append(this.c);
        sbE.append(", to_endpoint=");
        sbE.append(this.d);
        sbE.append(", access_time=");
        sbE.append(this.e);
        return t10.g(this.f, ", access_count=", ")", sbE);
    }
}
