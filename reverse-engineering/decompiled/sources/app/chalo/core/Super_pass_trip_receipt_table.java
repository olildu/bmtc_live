package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Super_pass_trip_receipt_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Super_pass_trip_receipt_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2017a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final String l;
    public final RouteNamingSchemeType m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Super_pass_trip_receipt_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2018a;
        public final EnumColumnAdapter b;

        public Adapter(ColumnAdapter special_features_listAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(special_features_listAdapter, "special_features_listAdapter");
            this.f2018a = special_features_listAdapter;
            this.b = enumColumnAdapter;
        }
    }

    public Super_pass_trip_receipt_table(String pass_id, String product_type, String product_sub_type, long j, long j2, String vehicle_no, String conductor_id, String start_stop_name, String end_stop_name, String route_name, List special_features_list, String str, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(pass_id, "pass_id");
        Intrinsics.i(product_type, "product_type");
        Intrinsics.i(product_sub_type, "product_sub_type");
        Intrinsics.i(vehicle_no, "vehicle_no");
        Intrinsics.i(conductor_id, "conductor_id");
        Intrinsics.i(start_stop_name, "start_stop_name");
        Intrinsics.i(end_stop_name, "end_stop_name");
        Intrinsics.i(route_name, "route_name");
        Intrinsics.i(special_features_list, "special_features_list");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f2017a = pass_id;
        this.b = product_type;
        this.c = product_sub_type;
        this.d = j;
        this.e = j2;
        this.f = vehicle_no;
        this.g = conductor_id;
        this.h = start_stop_name;
        this.i = end_stop_name;
        this.j = route_name;
        this.k = special_features_list;
        this.l = str;
        this.m = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Super_pass_trip_receipt_table)) {
            return false;
        }
        Super_pass_trip_receipt_table super_pass_trip_receipt_table = (Super_pass_trip_receipt_table) obj;
        return Intrinsics.d(this.f2017a, super_pass_trip_receipt_table.f2017a) && Intrinsics.d(this.b, super_pass_trip_receipt_table.b) && Intrinsics.d(this.c, super_pass_trip_receipt_table.c) && this.d == super_pass_trip_receipt_table.d && this.e == super_pass_trip_receipt_table.e && Intrinsics.d(this.f, super_pass_trip_receipt_table.f) && Intrinsics.d(this.g, super_pass_trip_receipt_table.g) && Intrinsics.d(this.h, super_pass_trip_receipt_table.h) && Intrinsics.d(this.i, super_pass_trip_receipt_table.i) && Intrinsics.d(this.j, super_pass_trip_receipt_table.j) && Intrinsics.d(this.k, super_pass_trip_receipt_table.k) && Intrinsics.d(this.l, super_pass_trip_receipt_table.l) && this.m == super_pass_trip_receipt_table.m;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f2017a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int iB = r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return this.m.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Super_pass_trip_receipt_table(pass_id=", this.f2017a, ", product_type=", this.b, ", product_sub_type=");
        n21.p(this.d, this.c, ", activation_time_stamp=", sbE);
        xs.r(this.e, ", punch_time_stamp=", ", vehicle_no=", sbE);
        cb0.t(sbE, this.f, ", conductor_id=", this.g, ", start_stop_name=");
        cb0.t(sbE, this.h, ", end_stop_name=", this.i, ", route_name=");
        pk0.w(this.j, ", special_features_list=", ", via=", sbE, this.k);
        sbE.append(this.l);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.m);
        sbE.append(")");
        return sbE.toString();
    }
}
