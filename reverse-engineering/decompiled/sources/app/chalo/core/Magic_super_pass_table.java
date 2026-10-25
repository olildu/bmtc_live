package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$fareBreakupListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$premiumBusMetaAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofsMapAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$serviceTypeListAdapter$2$1;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Magic_super_pass_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Magic_super_pass_table {
    public final String A;
    public final String B;
    public final String C;
    public final long D;
    public final double E;
    public final double F;
    public final boolean G;
    public final double H;
    public final List I;
    public final boolean J;
    public final String K;
    public final String L;
    public final long M;
    public final long N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final RefundInfoEntityModel X;
    public final PassTierType Y;
    public final Long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1964a;
    public final Long a0;
    public final String b;
    public final Boolean b0;
    public final String c;
    public final PremiumBusMeta c0;
    public final String d;
    public final Boolean d0;
    public final SuperPassSubType e;
    public final String f;
    public final String g;
    public final SuperPassStatus h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final boolean m;
    public final List n;
    public final long o;
    public final long p;
    public final List q;
    public final Map r;
    public final long s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final Gender z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Magic_super_pass_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f1965a;
        public final EnumColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final ColumnAdapter e;
        public final EnumColumnAdapter f;
        public final ColumnAdapter g;
        public final ColumnAdapter h;
        public final EnumColumnAdapter i;
        public final ColumnAdapter j;

        public Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, SuperPassTableAdapters$serviceTypeListAdapter$2$1 super_pass_validation_properties_service_typeAdapter, ColumnAdapter super_pass_ui_properties_special_featuresAdapter, SuperPassTableAdapters$proofsMapAdapter$2$1 super_pass_ui_properties_proofsAdapter, EnumColumnAdapter enumColumnAdapter3, SuperPassTableAdapters$fareBreakupListAdapter$2$1 super_pass_ui_properties_fare_infofareBreakupComponentListAdapter, ColumnAdapter super_pass_transaction_details_refund_infoAdapter, EnumColumnAdapter enumColumnAdapter4, SuperPassTableAdapters$premiumBusMetaAdapter$2$1 super_pass_properties_premium_bus_metaAdapter) {
            Intrinsics.i(super_pass_validation_properties_service_typeAdapter, "super_pass_validation_properties_service_typeAdapter");
            Intrinsics.i(super_pass_ui_properties_special_featuresAdapter, "super_pass_ui_properties_special_featuresAdapter");
            Intrinsics.i(super_pass_ui_properties_proofsAdapter, "super_pass_ui_properties_proofsAdapter");
            Intrinsics.i(super_pass_ui_properties_fare_infofareBreakupComponentListAdapter, "super_pass_ui_properties_fare_infofareBreakupComponentListAdapter");
            Intrinsics.i(super_pass_transaction_details_refund_infoAdapter, "super_pass_transaction_details_refund_infoAdapter");
            Intrinsics.i(super_pass_properties_premium_bus_metaAdapter, "super_pass_properties_premium_bus_metaAdapter");
            this.f1965a = enumColumnAdapter;
            this.b = enumColumnAdapter2;
            this.c = super_pass_validation_properties_service_typeAdapter;
            this.d = super_pass_ui_properties_special_featuresAdapter;
            this.e = super_pass_ui_properties_proofsAdapter;
            this.f = enumColumnAdapter3;
            this.g = super_pass_ui_properties_fare_infofareBreakupComponentListAdapter;
            this.h = super_pass_transaction_details_refund_infoAdapter;
            this.i = enumColumnAdapter4;
            this.j = super_pass_properties_premium_bus_metaAdapter;
        }
    }

    public Magic_super_pass_table(String super_pass_properties_qr_code, String str, String super_pass_properties_pass_id, String super_pass_properties_product_type, SuperPassSubType super_pass_properties_product_sub_type, String str2, String super_pass_properties_agency_name, SuperPassStatus super_pass_validation_properties_super_pass_status, long j, long j2, long j3, long j4, boolean z, List super_pass_validation_properties_service_type, long j5, long j6, List super_pass_ui_properties_special_features, Map super_pass_ui_properties_proofs, long j7, String super_pass_ui_properties_pass_name, String super_pass_ui_properties_category_name, String super_pass_ui_properties_fare_mapping_display_name, String super_pass_ui_properties_super_pass_user_details_user_id, String super_pass_ui_properties_super_pass_user_details_mobile_number, String super_pass_ui_properties_super_pass_user_details_full_name, Gender super_pass_ui_properties_super_pass_user_details_gender, String super_pass_ui_properties_super_pass_user_details_date_of_birth, String super_pass_ui_properties_super_pass_user_details_email_id, String super_pass_ui_properties_super_pass_user_details_profile_photo, long j8, double d, double d2, boolean z2, double d3, List super_pass_ui_properties_fare_infofareBreakupComponentList, boolean z3, String super_pass_repurchase_properties_config_id, String super_pass_repurchase_properties_category_id, long j9, long j10, boolean z4, boolean z5, String super_pass_transaction_details_transaction_id, String super_pass_transaction_details_payment_mode, String str3, String str4, String str5, String str6, String str7, RefundInfoEntityModel refundInfoEntityModel, PassTierType super_pass_validation_properties_tier_type, Long l, Long l2, Boolean bool, PremiumBusMeta premiumBusMeta, Boolean bool2) {
        Intrinsics.i(super_pass_properties_qr_code, "super_pass_properties_qr_code");
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        Intrinsics.i(super_pass_properties_product_type, "super_pass_properties_product_type");
        Intrinsics.i(super_pass_properties_product_sub_type, "super_pass_properties_product_sub_type");
        Intrinsics.i(super_pass_properties_agency_name, "super_pass_properties_agency_name");
        Intrinsics.i(super_pass_validation_properties_super_pass_status, "super_pass_validation_properties_super_pass_status");
        Intrinsics.i(super_pass_validation_properties_service_type, "super_pass_validation_properties_service_type");
        Intrinsics.i(super_pass_ui_properties_special_features, "super_pass_ui_properties_special_features");
        Intrinsics.i(super_pass_ui_properties_proofs, "super_pass_ui_properties_proofs");
        Intrinsics.i(super_pass_ui_properties_pass_name, "super_pass_ui_properties_pass_name");
        Intrinsics.i(super_pass_ui_properties_category_name, "super_pass_ui_properties_category_name");
        Intrinsics.i(super_pass_ui_properties_fare_mapping_display_name, "super_pass_ui_properties_fare_mapping_display_name");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_user_id, "super_pass_ui_properties_super_pass_user_details_user_id");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_mobile_number, "super_pass_ui_properties_super_pass_user_details_mobile_number");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_full_name, "super_pass_ui_properties_super_pass_user_details_full_name");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_gender, "super_pass_ui_properties_super_pass_user_details_gender");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_date_of_birth, "super_pass_ui_properties_super_pass_user_details_date_of_birth");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_email_id, "super_pass_ui_properties_super_pass_user_details_email_id");
        Intrinsics.i(super_pass_ui_properties_super_pass_user_details_profile_photo, "super_pass_ui_properties_super_pass_user_details_profile_photo");
        Intrinsics.i(super_pass_ui_properties_fare_infofareBreakupComponentList, "super_pass_ui_properties_fare_infofareBreakupComponentList");
        Intrinsics.i(super_pass_repurchase_properties_config_id, "super_pass_repurchase_properties_config_id");
        Intrinsics.i(super_pass_repurchase_properties_category_id, "super_pass_repurchase_properties_category_id");
        Intrinsics.i(super_pass_transaction_details_transaction_id, "super_pass_transaction_details_transaction_id");
        Intrinsics.i(super_pass_transaction_details_payment_mode, "super_pass_transaction_details_payment_mode");
        Intrinsics.i(super_pass_validation_properties_tier_type, "super_pass_validation_properties_tier_type");
        this.f1964a = super_pass_properties_qr_code;
        this.b = str;
        this.c = super_pass_properties_pass_id;
        this.d = super_pass_properties_product_type;
        this.e = super_pass_properties_product_sub_type;
        this.f = str2;
        this.g = super_pass_properties_agency_name;
        this.h = super_pass_validation_properties_super_pass_status;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = z;
        this.n = super_pass_validation_properties_service_type;
        this.o = j5;
        this.p = j6;
        this.q = super_pass_ui_properties_special_features;
        this.r = super_pass_ui_properties_proofs;
        this.s = j7;
        this.t = super_pass_ui_properties_pass_name;
        this.u = super_pass_ui_properties_category_name;
        this.v = super_pass_ui_properties_fare_mapping_display_name;
        this.w = super_pass_ui_properties_super_pass_user_details_user_id;
        this.x = super_pass_ui_properties_super_pass_user_details_mobile_number;
        this.y = super_pass_ui_properties_super_pass_user_details_full_name;
        this.z = super_pass_ui_properties_super_pass_user_details_gender;
        this.A = super_pass_ui_properties_super_pass_user_details_date_of_birth;
        this.B = super_pass_ui_properties_super_pass_user_details_email_id;
        this.C = super_pass_ui_properties_super_pass_user_details_profile_photo;
        this.D = j8;
        this.E = d;
        this.F = d2;
        this.G = z2;
        this.H = d3;
        this.I = super_pass_ui_properties_fare_infofareBreakupComponentList;
        this.J = z3;
        this.K = super_pass_repurchase_properties_config_id;
        this.L = super_pass_repurchase_properties_category_id;
        this.M = j9;
        this.N = j10;
        this.O = z4;
        this.P = z5;
        this.Q = super_pass_transaction_details_transaction_id;
        this.R = super_pass_transaction_details_payment_mode;
        this.S = str3;
        this.T = str4;
        this.U = str5;
        this.V = str6;
        this.W = str7;
        this.X = refundInfoEntityModel;
        this.Y = super_pass_validation_properties_tier_type;
        this.Z = l;
        this.a0 = l2;
        this.b0 = bool;
        this.c0 = premiumBusMeta;
        this.d0 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Magic_super_pass_table)) {
            return false;
        }
        Magic_super_pass_table magic_super_pass_table = (Magic_super_pass_table) obj;
        return Intrinsics.d(this.f1964a, magic_super_pass_table.f1964a) && Intrinsics.d(this.b, magic_super_pass_table.b) && Intrinsics.d(this.c, magic_super_pass_table.c) && Intrinsics.d(this.d, magic_super_pass_table.d) && this.e == magic_super_pass_table.e && Intrinsics.d(this.f, magic_super_pass_table.f) && Intrinsics.d(this.g, magic_super_pass_table.g) && this.h == magic_super_pass_table.h && this.i == magic_super_pass_table.i && this.j == magic_super_pass_table.j && this.k == magic_super_pass_table.k && this.l == magic_super_pass_table.l && this.m == magic_super_pass_table.m && Intrinsics.d(this.n, magic_super_pass_table.n) && this.o == magic_super_pass_table.o && this.p == magic_super_pass_table.p && Intrinsics.d(this.q, magic_super_pass_table.q) && Intrinsics.d(this.r, magic_super_pass_table.r) && this.s == magic_super_pass_table.s && Intrinsics.d(this.t, magic_super_pass_table.t) && Intrinsics.d(this.u, magic_super_pass_table.u) && Intrinsics.d(this.v, magic_super_pass_table.v) && Intrinsics.d(this.w, magic_super_pass_table.w) && Intrinsics.d(this.x, magic_super_pass_table.x) && Intrinsics.d(this.y, magic_super_pass_table.y) && this.z == magic_super_pass_table.z && Intrinsics.d(this.A, magic_super_pass_table.A) && Intrinsics.d(this.B, magic_super_pass_table.B) && Intrinsics.d(this.C, magic_super_pass_table.C) && this.D == magic_super_pass_table.D && Double.compare(this.E, magic_super_pass_table.E) == 0 && Double.compare(this.F, magic_super_pass_table.F) == 0 && this.G == magic_super_pass_table.G && Double.compare(this.H, magic_super_pass_table.H) == 0 && Intrinsics.d(this.I, magic_super_pass_table.I) && this.J == magic_super_pass_table.J && Intrinsics.d(this.K, magic_super_pass_table.K) && Intrinsics.d(this.L, magic_super_pass_table.L) && this.M == magic_super_pass_table.M && this.N == magic_super_pass_table.N && this.O == magic_super_pass_table.O && this.P == magic_super_pass_table.P && Intrinsics.d(this.Q, magic_super_pass_table.Q) && Intrinsics.d(this.R, magic_super_pass_table.R) && Intrinsics.d(this.S, magic_super_pass_table.S) && Intrinsics.d(this.T, magic_super_pass_table.T) && Intrinsics.d(this.U, magic_super_pass_table.U) && Intrinsics.d(this.V, magic_super_pass_table.V) && Intrinsics.d(this.W, magic_super_pass_table.W) && Intrinsics.d(this.X, magic_super_pass_table.X) && this.Y == magic_super_pass_table.Y && Intrinsics.d(this.Z, magic_super_pass_table.Z) && Intrinsics.d(this.a0, magic_super_pass_table.a0) && Intrinsics.d(this.b0, magic_super_pass_table.b0) && Intrinsics.d(this.c0, magic_super_pass_table.c0) && Intrinsics.d(this.d0, magic_super_pass_table.d0);
    }

    public final int hashCode() {
        int iHashCode = this.f1964a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.h.hashCode() + nf1.e(nf1.e((this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31;
        long j = this.i;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.k;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.l;
        int iB = r30.b((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.m ? 1231 : 1237)) * 31, 31, this.n);
        long j5 = this.o;
        int i4 = (iB + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.p;
        int iF = defpackage.d.f(this.r, r30.b((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31, this.q), 31);
        long j7 = this.s;
        int iE = nf1.e(nf1.e(nf1.e((this.z.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iF + ((int) (j7 ^ (j7 >>> 32)))) * 31, 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y)) * 31, 31, this.A), 31, this.B), 31, this.C);
        long j8 = this.D;
        int i5 = (iE + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.E);
        int i6 = (i5 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.F);
        int i7 = (i6 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        int i8 = this.G ? 1231 : 1237;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.H);
        int iE2 = nf1.e(nf1.e((r30.b((((i7 + i8) * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31, 31, this.I) + (this.J ? 1231 : 1237)) * 31, 31, this.K), 31, this.L);
        long j9 = this.M;
        int i9 = (iE2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.N;
        int iE3 = nf1.e(nf1.e((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.O ? 1231 : 1237)) * 31) + (this.P ? 1231 : 1237)) * 31, 31, this.Q), 31, this.R);
        String str2 = this.S;
        int iHashCode3 = (iE3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.T;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.U;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.V;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.W;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.X;
        int iHashCode8 = (this.Y.hashCode() + ((iHashCode7 + (refundInfoEntityModel == null ? 0 : refundInfoEntityModel.hashCode())) * 31)) * 31;
        Long l = this.Z;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.a0;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.b0;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        PremiumBusMeta premiumBusMeta = this.c0;
        int iHashCode12 = (iHashCode11 + (premiumBusMeta == null ? 0 : premiumBusMeta.hashCode())) * 31;
        Boolean bool2 = this.d0;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Magic_super_pass_table(super_pass_properties_qr_code=", this.f1964a, ", super_pass_properties_tone=", this.b, ", super_pass_properties_pass_id=");
        cb0.t(sbE, this.c, ", super_pass_properties_product_type=", this.d, ", super_pass_properties_product_sub_type=");
        sbE.append(this.e);
        sbE.append(", super_pass_properties_city_name=");
        sbE.append(this.f);
        sbE.append(", super_pass_properties_agency_name=");
        sbE.append(this.g);
        sbE.append(", super_pass_validation_properties_super_pass_status=");
        sbE.append(this.h);
        sbE.append(", super_pass_validation_properties_start_time=");
        sbE.append(this.i);
        xs.r(this.j, ", super_pass_validation_properties_expiry_time=", ", super_pass_validation_properties_active_duration=", sbE);
        sbE.append(this.k);
        xs.r(this.l, ", super_pass_validation_properties_ride_details_last_activation_time_stamp=", ", super_pass_validation_properties_is_hailing_supported=", sbE);
        hq0.w(sbE, this.m, ", super_pass_validation_properties_service_type=", this.n, ", super_pass_validation_properties_ride_details_last_punch_time_stamp=");
        sbE.append(this.o);
        xs.r(this.p, ", super_pass_ui_properties_num_of_days=", ", super_pass_ui_properties_special_features=", sbE);
        sbE.append(this.q);
        sbE.append(", super_pass_ui_properties_proofs=");
        sbE.append(this.r);
        sbE.append(", super_pass_ui_properties_booking_time=");
        dd.k(this.s, ", super_pass_ui_properties_pass_name=", this.t, sbE);
        cb0.t(sbE, ", super_pass_ui_properties_category_name=", this.u, ", super_pass_ui_properties_fare_mapping_display_name=", this.v);
        cb0.t(sbE, ", super_pass_ui_properties_super_pass_user_details_user_id=", this.w, ", super_pass_ui_properties_super_pass_user_details_mobile_number=", this.x);
        sbE.append(", super_pass_ui_properties_super_pass_user_details_full_name=");
        sbE.append(this.y);
        sbE.append(", super_pass_ui_properties_super_pass_user_details_gender=");
        sbE.append(this.z);
        cb0.t(sbE, ", super_pass_ui_properties_super_pass_user_details_date_of_birth=", this.A, ", super_pass_ui_properties_super_pass_user_details_email_id=", this.B);
        defpackage.d.t(sbE, ", super_pass_ui_properties_super_pass_user_details_profile_photo=", this.C, ", super_pass_ui_properties_super_pass_user_details_dob_in_millis=");
        sbE.append(this.D);
        pk0.z(sbE, ", super_pass_ui_properties_fare_infopayableAmount=", this.E, ", super_pass_ui_properties_fare_infoactualFare=");
        sbE.append(this.F);
        sbE.append(", super_pass_ui_properties_fare_infoisDiscountApplicable=");
        sbE.append(this.G);
        pk0.z(sbE, ", super_pass_ui_properties_fare_infodiscountedFare=", this.H, ", super_pass_ui_properties_fare_infofareBreakupComponentList=");
        sbE.append(this.I);
        sbE.append(", super_pass_ui_properties_product_brandingis_visible=");
        sbE.append(this.J);
        sbE.append(", super_pass_repurchase_properties_config_id=");
        cb0.t(sbE, this.K, ", super_pass_repurchase_properties_category_id=", this.L, ", super_pass_repurchase_properties_fare_mapping_id=");
        sbE.append(this.M);
        xs.r(this.N, ", super_pass_repurchase_properties_verification_expiry_time=", ", super_pass_repurchase_properties_verification_flag=", sbE);
        z40.r(sbE, this.O, ", super_pass_repurchase_properties_is_renewable=", this.P, ", super_pass_transaction_details_transaction_id=");
        cb0.t(sbE, this.Q, ", super_pass_transaction_details_payment_mode=", this.R, ", super_pass_trip_preferences_route_id=");
        cb0.t(sbE, this.S, ", super_pass_trip_preferences_start_stop_id=", this.T, ", super_pass_trip_preferences_start_stop_name=");
        cb0.t(sbE, this.U, ", super_pass_trip_preferences_end_stop_id=", this.V, ", super_pass_trip_preferences_end_stop_name=");
        sbE.append(this.W);
        sbE.append(", super_pass_transaction_details_refund_info=");
        sbE.append(this.X);
        sbE.append(", super_pass_validation_properties_tier_type=");
        sbE.append(this.Y);
        sbE.append(", super_pass_validation_properties_advance_booking_window=");
        sbE.append(this.Z);
        sbE.append(", super_pass_validation_properties_allowed_number_of_days_for_bulk_booking=");
        sbE.append(this.a0);
        sbE.append(", super_pass_validation_properties_bulk_booking_allowed=");
        sbE.append(this.b0);
        sbE.append(", super_pass_properties_premium_bus_meta=");
        sbE.append(this.c0);
        sbE.append(", super_pass_ui_properties_mark_as_unlimited=");
        sbE.append(this.d0);
        sbE.append(")");
        return sbE.toString();
    }
}
