package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$fareBreakupListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofsMapAdapter$2$1;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Pending_super_pass_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Pending_super_pass_table {
    public final List A;
    public final boolean B;
    public final String C;
    public final String D;
    public final long E;
    public final long F;
    public final long G;
    public final boolean H;
    public final String I;
    public final String J;
    public final String K;
    public final RefundInfoEntityModel L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassStatus f1978a;
    public final String b;
    public final String c;
    public final SuperPassSubType d;
    public final String e;
    public final String f;
    public final double g;
    public final String h;
    public final long i;
    public final List j;
    public final Map k;
    public final long l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final Gender s;
    public final String t;
    public final String u;
    public final String v;
    public final double w;
    public final double x;
    public final boolean y;
    public final double z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Pending_super_pass_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1979a;
        public final EnumColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final EnumColumnAdapter e;
        public final ColumnAdapter f;
        public final ColumnAdapter g;

        public Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, ColumnAdapter pending_super_pass_ui_properties_special_featuresAdapter, SuperPassTableAdapters$proofsMapAdapter$2$1 pending_super_pass_ui_properties_proofsAdapter, EnumColumnAdapter enumColumnAdapter3, SuperPassTableAdapters$fareBreakupListAdapter$2$1 pending_super_pass_ui_properties_fare_infofareBreakupComponentListAdapter, ColumnAdapter pending_super_pass_transaction_details_refund_infoAdapter) {
            Intrinsics.i(pending_super_pass_ui_properties_special_featuresAdapter, "pending_super_pass_ui_properties_special_featuresAdapter");
            Intrinsics.i(pending_super_pass_ui_properties_proofsAdapter, "pending_super_pass_ui_properties_proofsAdapter");
            Intrinsics.i(pending_super_pass_ui_properties_fare_infofareBreakupComponentListAdapter, "pending_super_pass_ui_properties_fare_infofareBreakupComponentListAdapter");
            Intrinsics.i(pending_super_pass_transaction_details_refund_infoAdapter, "pending_super_pass_transaction_details_refund_infoAdapter");
            this.f1979a = enumColumnAdapter;
            this.b = enumColumnAdapter2;
            this.c = pending_super_pass_ui_properties_special_featuresAdapter;
            this.d = pending_super_pass_ui_properties_proofsAdapter;
            this.e = enumColumnAdapter3;
            this.f = pending_super_pass_ui_properties_fare_infofareBreakupComponentListAdapter;
            this.g = pending_super_pass_transaction_details_refund_infoAdapter;
        }
    }

    public Pending_super_pass_table(SuperPassStatus pending_super_pass_properties_super_pass_status, String pending_super_pass_properties_pass_id, String pending_super_pass_properties_product_type, SuperPassSubType pending_super_pass_properties_product_sub_type, String str, String pending_super_pass_properties_agency_name, double d, String str2, long j, List pending_super_pass_ui_properties_special_features, Map pending_super_pass_ui_properties_proofs, long j2, String pending_super_pass_ui_properties_pass_name, String pending_super_pass_ui_properties_category_name, String pending_super_pass_ui_properties_fare_mapping_display_name, String pending_super_pass_ui_properties_super_pass_user_details_user_id, String pending_super_pass_ui_properties_super_pass_user_details_mobile_number, String pending_super_pass_ui_properties_super_pass_user_details_full_name, Gender pending_super_pass_ui_properties_super_pass_user_details_gender, String pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, String pending_super_pass_ui_properties_super_pass_user_details_email_id, String pending_super_pass_ui_properties_super_pass_user_details_profile_photo, double d2, double d3, boolean z, double d4, List pending_super_pass_ui_properties_fare_infofareBreakupComponentList, boolean z2, String pending_super_pass_repurchase_properties_config_id, String pending_super_pass_repurchase_properties_category_id, long j3, long j4, long j5, boolean z3, String pending_super_pass_transaction_details_payment_mode, String pending_super_pass_transaction_details_transaction_id, String str3, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(pending_super_pass_properties_super_pass_status, "pending_super_pass_properties_super_pass_status");
        Intrinsics.i(pending_super_pass_properties_pass_id, "pending_super_pass_properties_pass_id");
        Intrinsics.i(pending_super_pass_properties_product_type, "pending_super_pass_properties_product_type");
        Intrinsics.i(pending_super_pass_properties_product_sub_type, "pending_super_pass_properties_product_sub_type");
        Intrinsics.i(pending_super_pass_properties_agency_name, "pending_super_pass_properties_agency_name");
        Intrinsics.i(pending_super_pass_ui_properties_special_features, "pending_super_pass_ui_properties_special_features");
        Intrinsics.i(pending_super_pass_ui_properties_proofs, "pending_super_pass_ui_properties_proofs");
        Intrinsics.i(pending_super_pass_ui_properties_pass_name, "pending_super_pass_ui_properties_pass_name");
        Intrinsics.i(pending_super_pass_ui_properties_category_name, "pending_super_pass_ui_properties_category_name");
        Intrinsics.i(pending_super_pass_ui_properties_fare_mapping_display_name, "pending_super_pass_ui_properties_fare_mapping_display_name");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_user_id, "pending_super_pass_ui_properties_super_pass_user_details_user_id");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_mobile_number, "pending_super_pass_ui_properties_super_pass_user_details_mobile_number");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_full_name, "pending_super_pass_ui_properties_super_pass_user_details_full_name");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_gender, "pending_super_pass_ui_properties_super_pass_user_details_gender");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, "pending_super_pass_ui_properties_super_pass_user_details_date_of_birth");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_email_id, "pending_super_pass_ui_properties_super_pass_user_details_email_id");
        Intrinsics.i(pending_super_pass_ui_properties_super_pass_user_details_profile_photo, "pending_super_pass_ui_properties_super_pass_user_details_profile_photo");
        Intrinsics.i(pending_super_pass_ui_properties_fare_infofareBreakupComponentList, "pending_super_pass_ui_properties_fare_infofareBreakupComponentList");
        Intrinsics.i(pending_super_pass_repurchase_properties_config_id, "pending_super_pass_repurchase_properties_config_id");
        Intrinsics.i(pending_super_pass_repurchase_properties_category_id, "pending_super_pass_repurchase_properties_category_id");
        Intrinsics.i(pending_super_pass_transaction_details_payment_mode, "pending_super_pass_transaction_details_payment_mode");
        Intrinsics.i(pending_super_pass_transaction_details_transaction_id, "pending_super_pass_transaction_details_transaction_id");
        this.f1978a = pending_super_pass_properties_super_pass_status;
        this.b = pending_super_pass_properties_pass_id;
        this.c = pending_super_pass_properties_product_type;
        this.d = pending_super_pass_properties_product_sub_type;
        this.e = str;
        this.f = pending_super_pass_properties_agency_name;
        this.g = d;
        this.h = str2;
        this.i = j;
        this.j = pending_super_pass_ui_properties_special_features;
        this.k = pending_super_pass_ui_properties_proofs;
        this.l = j2;
        this.m = pending_super_pass_ui_properties_pass_name;
        this.n = pending_super_pass_ui_properties_category_name;
        this.o = pending_super_pass_ui_properties_fare_mapping_display_name;
        this.p = pending_super_pass_ui_properties_super_pass_user_details_user_id;
        this.q = pending_super_pass_ui_properties_super_pass_user_details_mobile_number;
        this.r = pending_super_pass_ui_properties_super_pass_user_details_full_name;
        this.s = pending_super_pass_ui_properties_super_pass_user_details_gender;
        this.t = pending_super_pass_ui_properties_super_pass_user_details_date_of_birth;
        this.u = pending_super_pass_ui_properties_super_pass_user_details_email_id;
        this.v = pending_super_pass_ui_properties_super_pass_user_details_profile_photo;
        this.w = d2;
        this.x = d3;
        this.y = z;
        this.z = d4;
        this.A = pending_super_pass_ui_properties_fare_infofareBreakupComponentList;
        this.B = z2;
        this.C = pending_super_pass_repurchase_properties_config_id;
        this.D = pending_super_pass_repurchase_properties_category_id;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = z3;
        this.I = pending_super_pass_transaction_details_payment_mode;
        this.J = pending_super_pass_transaction_details_transaction_id;
        this.K = str3;
        this.L = refundInfoEntityModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pending_super_pass_table)) {
            return false;
        }
        Pending_super_pass_table pending_super_pass_table = (Pending_super_pass_table) obj;
        return this.f1978a == pending_super_pass_table.f1978a && Intrinsics.d(this.b, pending_super_pass_table.b) && Intrinsics.d(this.c, pending_super_pass_table.c) && this.d == pending_super_pass_table.d && Intrinsics.d(this.e, pending_super_pass_table.e) && Intrinsics.d(this.f, pending_super_pass_table.f) && Double.compare(this.g, pending_super_pass_table.g) == 0 && Intrinsics.d(this.h, pending_super_pass_table.h) && this.i == pending_super_pass_table.i && Intrinsics.d(this.j, pending_super_pass_table.j) && Intrinsics.d(this.k, pending_super_pass_table.k) && this.l == pending_super_pass_table.l && Intrinsics.d(this.m, pending_super_pass_table.m) && Intrinsics.d(this.n, pending_super_pass_table.n) && Intrinsics.d(this.o, pending_super_pass_table.o) && Intrinsics.d(this.p, pending_super_pass_table.p) && Intrinsics.d(this.q, pending_super_pass_table.q) && Intrinsics.d(this.r, pending_super_pass_table.r) && this.s == pending_super_pass_table.s && Intrinsics.d(this.t, pending_super_pass_table.t) && Intrinsics.d(this.u, pending_super_pass_table.u) && Intrinsics.d(this.v, pending_super_pass_table.v) && Double.compare(this.w, pending_super_pass_table.w) == 0 && Double.compare(this.x, pending_super_pass_table.x) == 0 && this.y == pending_super_pass_table.y && Double.compare(this.z, pending_super_pass_table.z) == 0 && Intrinsics.d(this.A, pending_super_pass_table.A) && this.B == pending_super_pass_table.B && Intrinsics.d(this.C, pending_super_pass_table.C) && Intrinsics.d(this.D, pending_super_pass_table.D) && this.E == pending_super_pass_table.E && this.F == pending_super_pass_table.F && this.G == pending_super_pass_table.G && this.H == pending_super_pass_table.H && Intrinsics.d(this.I, pending_super_pass_table.I) && Intrinsics.d(this.J, pending_super_pass_table.J) && Intrinsics.d(this.K, pending_super_pass_table.K) && Intrinsics.d(this.L, pending_super_pass_table.L);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((this.d.hashCode() + nf1.e(nf1.e(this.f1978a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        long jDoubleToLongBits = Double.doubleToLongBits(this.g);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str = this.h;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.i;
        int iF = defpackage.d.f(this.k, r30.b((((i + iHashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.j), 31);
        long j2 = this.l;
        int iE2 = nf1.e(nf1.e(nf1.e((this.s.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iF + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r)) * 31, 31, this.t), 31, this.u), 31, this.v);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.w);
        int i2 = (iE2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.x);
        int i3 = (i2 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        int i4 = this.y ? 1231 : 1237;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.z);
        int iE3 = nf1.e(nf1.e((r30.b((((i3 + i4) * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31, 31, this.A) + (this.B ? 1231 : 1237)) * 31, 31, this.C), 31, this.D);
        long j3 = this.E;
        int i5 = (iE3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.F;
        int i6 = (i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.G;
        int iE4 = nf1.e(nf1.e((((i6 + ((int) ((j5 >>> 32) ^ j5))) * 31) + (this.H ? 1231 : 1237)) * 31, 31, this.I), 31, this.J);
        String str2 = this.K;
        int iHashCode2 = (iE4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.L;
        return iHashCode2 + (refundInfoEntityModel != null ? refundInfoEntityModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pending_super_pass_table(pending_super_pass_properties_super_pass_status=");
        sb.append(this.f1978a);
        sb.append(", pending_super_pass_properties_pass_id=");
        sb.append(this.b);
        sb.append(", pending_super_pass_properties_product_type=");
        sb.append(this.c);
        sb.append(", pending_super_pass_properties_product_sub_type=");
        sb.append(this.d);
        sb.append(", pending_super_pass_properties_city_name=");
        cb0.t(sb, this.e, ", pending_super_pass_properties_agency_name=", this.f, ", pending_super_pass_ui_properties_max_price_per_trip=");
        sb.append(this.g);
        sb.append(", pending_super_pass_ui_properties_fare_mapping_description=");
        sb.append(this.h);
        xs.r(this.i, ", pending_super_pass_ui_properties_num_of_days=", ", pending_super_pass_ui_properties_special_features=", sb);
        sb.append(this.j);
        sb.append(", pending_super_pass_ui_properties_proofs=");
        sb.append(this.k);
        sb.append(", pending_super_pass_ui_properties_booking_time=");
        dd.k(this.l, ", pending_super_pass_ui_properties_pass_name=", this.m, sb);
        cb0.t(sb, ", pending_super_pass_ui_properties_category_name=", this.n, ", pending_super_pass_ui_properties_fare_mapping_display_name=", this.o);
        cb0.t(sb, ", pending_super_pass_ui_properties_super_pass_user_details_user_id=", this.p, ", pending_super_pass_ui_properties_super_pass_user_details_mobile_number=", this.q);
        sb.append(", pending_super_pass_ui_properties_super_pass_user_details_full_name=");
        sb.append(this.r);
        sb.append(", pending_super_pass_ui_properties_super_pass_user_details_gender=");
        sb.append(this.s);
        cb0.t(sb, ", pending_super_pass_ui_properties_super_pass_user_details_date_of_birth=", this.t, ", pending_super_pass_ui_properties_super_pass_user_details_email_id=", this.u);
        defpackage.d.t(sb, ", pending_super_pass_ui_properties_super_pass_user_details_profile_photo=", this.v, ", pending_super_pass_ui_properties_fare_infopayableAmount=");
        sb.append(this.w);
        pk0.z(sb, ", pending_super_pass_ui_properties_fare_infoactualFare=", this.x, ", pending_super_pass_ui_properties_fare_infoisDiscountApplicable=");
        sb.append(this.y);
        sb.append(", pending_super_pass_ui_properties_fare_infodiscountedFare=");
        sb.append(this.z);
        sb.append(", pending_super_pass_ui_properties_fare_infofareBreakupComponentList=");
        sb.append(this.A);
        sb.append(", pending_super_pass_ui_properties_product_brandingis_visible=");
        sb.append(this.B);
        cb0.t(sb, ", pending_super_pass_repurchase_properties_config_id=", this.C, ", pending_super_pass_repurchase_properties_category_id=", this.D);
        xs.r(this.E, ", pending_super_pass_repurchase_properties_fare_mapping_id=", ", pending_super_pass_repurchase_properties_start_time=", sb);
        sb.append(this.F);
        xs.r(this.G, ", pending_super_pass_repurchase_properties_verification_expiry_time=", ", pending_super_pass_repurchase_properties_verification_flag=", sb);
        pk0.x(", pending_super_pass_transaction_details_payment_mode=", this.I, ", pending_super_pass_transaction_details_transaction_id=", sb, this.H);
        cb0.t(sb, this.J, ", pending_super_pass_transaction_details_order_id=", this.K, ", pending_super_pass_transaction_details_refund_info=");
        sb.append(this.L);
        sb.append(")");
        return sb.toString();
    }
}
