package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.location.LatLng;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_place_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_place_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1992a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final LatLng f;
    public final RecentsSpecialEntityStatus g;
    public final long h;
    public final long i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_place_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1993a;
        public final EnumColumnAdapter b;

        public Adapter(ColumnAdapter lat_lngAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(lat_lngAdapter, "lat_lngAdapter");
            this.f1993a = lat_lngAdapter;
            this.b = enumColumnAdapter;
        }
    }

    public Recent_place_table(String place_id, String search_partner, String city_id, String str, String location_title, LatLng lat_lng, RecentsSpecialEntityStatus recents_special_entity_status, long j, long j2, String str2) {
        Intrinsics.i(place_id, "place_id");
        Intrinsics.i(search_partner, "search_partner");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(location_title, "location_title");
        Intrinsics.i(lat_lng, "lat_lng");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        this.f1992a = place_id;
        this.b = search_partner;
        this.c = city_id;
        this.d = str;
        this.e = location_title;
        this.f = lat_lng;
        this.g = recents_special_entity_status;
        this.h = j;
        this.i = j2;
        this.j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_place_table)) {
            return false;
        }
        Recent_place_table recent_place_table = (Recent_place_table) obj;
        return Intrinsics.d(this.f1992a, recent_place_table.f1992a) && Intrinsics.d(this.b, recent_place_table.b) && Intrinsics.d(this.c, recent_place_table.c) && Intrinsics.d(this.d, recent_place_table.d) && Intrinsics.d(this.e, recent_place_table.e) && Intrinsics.d(this.f, recent_place_table.f) && this.g == recent_place_table.g && this.h == recent_place_table.h && this.i == recent_place_table.i && Intrinsics.d(this.j, recent_place_table.j);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f1992a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.g.hashCode() + i71.d(this.f, nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31)) * 31;
        long j = this.h;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.j;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_place_table(place_id=", this.f1992a, ", search_partner=", this.b, ", city_id=");
        cb0.t(sbE, this.c, ", location_description=", this.d, ", location_title=");
        sbE.append(this.e);
        sbE.append(", lat_lng=");
        sbE.append(this.f);
        sbE.append(", recents_special_entity_status=");
        sbE.append(this.g);
        sbE.append(", access_time=");
        sbE.append(this.h);
        xs.r(this.i, ", access_count=", ", label=", sbE);
        return vo1.p(sbE, this.j, ")");
    }
}
