package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import defpackage.q7;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_ride_details_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ride_based_super_pass_ride_details_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2004a;
    public final List b;
    public final boolean c;
    public final long d;
    public final boolean e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_ride_details_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2005a;

        public Adapter(ColumnAdapter previous_ride_time_stampsAdapter) {
            Intrinsics.i(previous_ride_time_stampsAdapter, "previous_ride_time_stampsAdapter");
            this.f2005a = previous_ride_time_stampsAdapter;
        }
    }

    public Ride_based_super_pass_ride_details_table(String pass_id, List previous_ride_time_stamps, boolean z, long j, boolean z2, long j2, long j3) {
        Intrinsics.i(pass_id, "pass_id");
        Intrinsics.i(previous_ride_time_stamps, "previous_ride_time_stamps");
        this.f2004a = pass_id;
        this.b = previous_ride_time_stamps;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ride_based_super_pass_ride_details_table)) {
            return false;
        }
        Ride_based_super_pass_ride_details_table ride_based_super_pass_ride_details_table = (Ride_based_super_pass_ride_details_table) obj;
        return Intrinsics.d(this.f2004a, ride_based_super_pass_ride_details_table.f2004a) && Intrinsics.d(this.b, ride_based_super_pass_ride_details_table.b) && this.c == ride_based_super_pass_ride_details_table.c && this.d == ride_based_super_pass_ride_details_table.d && this.e == ride_based_super_pass_ride_details_table.e && this.f == ride_based_super_pass_ride_details_table.f && this.g == ride_based_super_pass_ride_details_table.g;
    }

    public final int hashCode() {
        int iB = r30.b(this.f2004a.hashCode() * 31, 31, this.b);
        int i = this.c ? 1231 : 1237;
        long j = this.d;
        int i2 = (((((iB + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1231 : 1237)) * 31;
        long j2 = this.f;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        return i3 + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sbH = q7.h("Ride_based_super_pass_ride_details_table(pass_id=", this.f2004a, ", previous_ride_time_stamps=", ", is_activation_allowed_in_current_session=", this.b);
        sbH.append(this.c);
        sbH.append(", oldest_history_call_time_stamp=");
        sbH.append(this.d);
        sbH.append(", should_check_app_reclaim=");
        sbH.append(this.e);
        sbH.append(", last_activation_time_stamp=");
        sbH.append(this.f);
        return t10.g(this.g, ", last_punch_time_stamp=", ")", sbH);
    }
}
