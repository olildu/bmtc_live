package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.core.database.tableadapters.LastRideInfoTableAdapter$lastRideInfoAdapter$2$1;
import app.chalo.models.LastRideInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Last_ride_info_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Last_ride_info_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1962a;
    public final LastRideInfo b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Last_ride_info_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f1963a;

        public Adapter(LastRideInfoTableAdapter$lastRideInfoAdapter$2$1 lastRideInfoAdapter) {
            Intrinsics.i(lastRideInfoAdapter, "lastRideInfoAdapter");
            this.f1963a = lastRideInfoAdapter;
        }
    }

    public Last_ride_info_table(String city, LastRideInfo lastRideInfo) {
        Intrinsics.i(city, "city");
        Intrinsics.i(lastRideInfo, "lastRideInfo");
        this.f1962a = city;
        this.b = lastRideInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Last_ride_info_table)) {
            return false;
        }
        Last_ride_info_table last_ride_info_table = (Last_ride_info_table) obj;
        return Intrinsics.d(this.f1962a, last_ride_info_table.f1962a) && Intrinsics.d(this.b, last_ride_info_table.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1962a.hashCode() * 31);
    }

    public final String toString() {
        return "Last_ride_info_table(city=" + this.f1962a + ", lastRideInfo=" + this.b + ")";
    }
}
