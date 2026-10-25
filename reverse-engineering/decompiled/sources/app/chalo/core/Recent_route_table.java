package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_route_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_route_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1994a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final ChaloTransitMode j;
    public final RecentsSpecialEntityStatus k;
    public final long l;
    public final long m;
    public final String n;
    public final RouteNamingSchemeType o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_route_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1995a;
        public final EnumColumnAdapter b;
        public final EnumColumnAdapter c;
        public final EnumColumnAdapter d;

        public Adapter(ColumnAdapter special_feature_listAdapter, EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, EnumColumnAdapter enumColumnAdapter3) {
            Intrinsics.i(special_feature_listAdapter, "special_feature_listAdapter");
            this.f1995a = special_feature_listAdapter;
            this.b = enumColumnAdapter;
            this.c = enumColumnAdapter2;
            this.d = enumColumnAdapter3;
        }
    }

    public Recent_route_table(String route_id, String city_id, String route_name, String start_stop_name, String end_stop_name, String str, boolean z, List list, boolean z2, ChaloTransitMode transit_mode, RecentsSpecialEntityStatus recents_special_entity_status, long j, long j2, String str2, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(route_id, "route_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(route_name, "route_name");
        Intrinsics.i(start_stop_name, "start_stop_name");
        Intrinsics.i(end_stop_name, "end_stop_name");
        Intrinsics.i(transit_mode, "transit_mode");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f1994a = route_id;
        this.b = city_id;
        this.c = route_name;
        this.d = start_stop_name;
        this.e = end_stop_name;
        this.f = str;
        this.g = z;
        this.h = list;
        this.i = z2;
        this.j = transit_mode;
        this.k = recents_special_entity_status;
        this.l = j;
        this.m = j2;
        this.n = str2;
        this.o = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_route_table)) {
            return false;
        }
        Recent_route_table recent_route_table = (Recent_route_table) obj;
        return Intrinsics.d(this.f1994a, recent_route_table.f1994a) && Intrinsics.d(this.b, recent_route_table.b) && Intrinsics.d(this.c, recent_route_table.c) && Intrinsics.d(this.d, recent_route_table.d) && Intrinsics.d(this.e, recent_route_table.e) && Intrinsics.d(this.f, recent_route_table.f) && this.g == recent_route_table.g && Intrinsics.d(this.h, recent_route_table.h) && this.i == recent_route_table.i && this.j == recent_route_table.j && this.k == recent_route_table.k && this.l == recent_route_table.l && this.m == recent_route_table.m && Intrinsics.d(this.n, recent_route_table.n) && this.o == recent_route_table.o;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f1994a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
        List list = this.h;
        int iHashCode2 = (this.k.hashCode() + n21.c(this.j, (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31, 31)) * 31;
        long j = this.l;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.m;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.n;
        return this.o.hashCode() + ((i2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_route_table(route_id=", this.f1994a, ", city_id=", this.b, ", route_name=");
        cb0.t(sbE, this.c, ", start_stop_name=", this.d, ", end_stop_name=");
        cb0.t(sbE, this.e, ", agency=", this.f, ", isAcBus=");
        hq0.w(sbE, this.g, ", special_feature_list=", this.h, ", is_free_ride_available=");
        sbE.append(this.i);
        sbE.append(", transit_mode=");
        sbE.append(this.j);
        sbE.append(", recents_special_entity_status=");
        sbE.append(this.k);
        sbE.append(", access_time=");
        sbE.append(this.l);
        xs.r(this.m, ", access_count=", ", via=", sbE);
        sbE.append(this.n);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
