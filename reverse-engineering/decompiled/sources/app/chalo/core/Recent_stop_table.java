package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Recent_stop_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recent_stop_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2000a;
    public final String b;
    public final RecentStopInfoEntity c;
    public final RecentsSpecialEntityStatus d;
    public final long e;
    public final long f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Recent_stop_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2001a;
        public final EnumColumnAdapter b;

        public Adapter(ColumnAdapter stopAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(stopAdapter, "stopAdapter");
            this.f2001a = stopAdapter;
            this.b = enumColumnAdapter;
        }
    }

    public Recent_stop_table(String stop_id, String city_id, RecentStopInfoEntity stop, RecentsSpecialEntityStatus recents_special_entity_status, long j, long j2, String str) {
        Intrinsics.i(stop_id, "stop_id");
        Intrinsics.i(city_id, "city_id");
        Intrinsics.i(stop, "stop");
        Intrinsics.i(recents_special_entity_status, "recents_special_entity_status");
        this.f2000a = stop_id;
        this.b = city_id;
        this.c = stop;
        this.d = recents_special_entity_status;
        this.e = j;
        this.f = j2;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent_stop_table)) {
            return false;
        }
        Recent_stop_table recent_stop_table = (Recent_stop_table) obj;
        return Intrinsics.d(this.f2000a, recent_stop_table.f2000a) && Intrinsics.d(this.b, recent_stop_table.b) && Intrinsics.d(this.c, recent_stop_table.c) && this.d == recent_stop_table.d && this.e == recent_stop_table.e && this.f == recent_stop_table.f && Intrinsics.d(this.g, recent_stop_table.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f2000a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        long j = this.e;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.g;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Recent_stop_table(stop_id=", this.f2000a, ", city_id=", this.b, ", stop=");
        sbE.append(this.c);
        sbE.append(", recents_special_entity_status=");
        sbE.append(this.d);
        sbE.append(", access_time=");
        sbE.append(this.e);
        xs.r(this.f, ", access_count=", ", label=", sbE);
        return vo1.p(sbE, this.g, ")");
    }
}
