package app.chalo.core;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Product_activation_details_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Product_activation_details_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1989a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public Product_activation_details_table(long j, String booking_id, long j2, String product_type, String product_sub_type, String city_name, String agency_name) {
        Intrinsics.i(booking_id, "booking_id");
        Intrinsics.i(product_type, "product_type");
        Intrinsics.i(product_sub_type, "product_sub_type");
        Intrinsics.i(city_name, "city_name");
        Intrinsics.i(agency_name, "agency_name");
        this.f1989a = j;
        this.b = booking_id;
        this.c = j2;
        this.d = product_type;
        this.e = product_sub_type;
        this.f = city_name;
        this.g = agency_name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product_activation_details_table)) {
            return false;
        }
        Product_activation_details_table product_activation_details_table = (Product_activation_details_table) obj;
        return this.f1989a == product_activation_details_table.f1989a && Intrinsics.d(this.b, product_activation_details_table.b) && this.c == product_activation_details_table.c && Intrinsics.d(this.d, product_activation_details_table.d) && Intrinsics.d(this.e, product_activation_details_table.e) && Intrinsics.d(this.f, product_activation_details_table.f) && Intrinsics.d(this.g, product_activation_details_table.g);
    }

    public final int hashCode() {
        long j = this.f1989a;
        int iE = nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b);
        long j2 = this.c;
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Product_activation_details_table(activation_time_stamp=");
        sb.append(this.f1989a);
        sb.append(", booking_id=");
        sb.append(this.b);
        xs.r(this.c, ", expiry_time=", ", product_type=", sb);
        cb0.t(sb, this.d, ", product_sub_type=", this.e, ", city_name=");
        return r30.i(sb, this.f, ", agency_name=", this.g, ")");
    }
}
