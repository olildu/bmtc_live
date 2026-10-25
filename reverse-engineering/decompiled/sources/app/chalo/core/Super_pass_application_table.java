package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofsMapAdapter$2$1;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Super_pass_application_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Super_pass_application_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2013a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final SuperPassApplicationStatus j;
    public final Map k;
    public final PassApplicationActionRequired l;
    public final String m;
    public final String n;
    public final String o;
    public final Gender p;
    public final String q;
    public final String r;
    public final String s;
    public final long t;
    public final Double u;
    public final String v;
    public final List w;
    public final List x;
    public final List y;
    public final RefundInfoEntityModel z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Super_pass_application_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f2014a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final EnumColumnAdapter d;
        public final ColumnAdapter e;
        public final ColumnAdapter f;
        public final ColumnAdapter g;
        public final ColumnAdapter h;

        public Adapter(EnumColumnAdapter enumColumnAdapter, SuperPassTableAdapters$proofsMapAdapter$2$1 proofsAdapter, SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1 pass_application_action_requiredAdapter, EnumColumnAdapter enumColumnAdapter2, SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1 pass_application_rejection_reasons_proofRejectionReasonsListAdapter, SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1 pass_application_rejection_reasons_profileRejectionReasonsListAdapter, ColumnAdapter pass_application_rejection_reasons_generalRejectionReasonsListAdapter, ColumnAdapter refundInfoAdapter) {
            Intrinsics.i(proofsAdapter, "proofsAdapter");
            Intrinsics.i(pass_application_action_requiredAdapter, "pass_application_action_requiredAdapter");
            Intrinsics.i(pass_application_rejection_reasons_proofRejectionReasonsListAdapter, "pass_application_rejection_reasons_proofRejectionReasonsListAdapter");
            Intrinsics.i(pass_application_rejection_reasons_profileRejectionReasonsListAdapter, "pass_application_rejection_reasons_profileRejectionReasonsListAdapter");
            Intrinsics.i(pass_application_rejection_reasons_generalRejectionReasonsListAdapter, "pass_application_rejection_reasons_generalRejectionReasonsListAdapter");
            Intrinsics.i(refundInfoAdapter, "refundInfoAdapter");
            this.f2014a = enumColumnAdapter;
            this.b = proofsAdapter;
            this.c = pass_application_action_requiredAdapter;
            this.d = enumColumnAdapter2;
            this.e = pass_application_rejection_reasons_proofRejectionReasonsListAdapter;
            this.f = pass_application_rejection_reasons_profileRejectionReasonsListAdapter;
            this.g = pass_application_rejection_reasons_generalRejectionReasonsListAdapter;
            this.h = refundInfoAdapter;
        }
    }

    public Super_pass_application_table(String city_name, String agency_name, String config_id, String category_id, long j, String fare_mapping_display_name, String pass_name, long j2, long j3, SuperPassApplicationStatus super_pass_application_status, Map proofs, PassApplicationActionRequired passApplicationActionRequired, String super_pass_user_details_user_id, String super_pass_user_details_mobile_number, String super_pass_user_details_full_name, Gender super_pass_user_details_gender, String super_pass_user_details_date_of_birth, String super_pass_user_details_email_id, String super_pass_user_details_profile_photo, long j4, Double d, String str, List list, List list2, List list3, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(city_name, "city_name");
        Intrinsics.i(agency_name, "agency_name");
        Intrinsics.i(config_id, "config_id");
        Intrinsics.i(category_id, "category_id");
        Intrinsics.i(fare_mapping_display_name, "fare_mapping_display_name");
        Intrinsics.i(pass_name, "pass_name");
        Intrinsics.i(super_pass_application_status, "super_pass_application_status");
        Intrinsics.i(proofs, "proofs");
        Intrinsics.i(super_pass_user_details_user_id, "super_pass_user_details_user_id");
        Intrinsics.i(super_pass_user_details_mobile_number, "super_pass_user_details_mobile_number");
        Intrinsics.i(super_pass_user_details_full_name, "super_pass_user_details_full_name");
        Intrinsics.i(super_pass_user_details_gender, "super_pass_user_details_gender");
        Intrinsics.i(super_pass_user_details_date_of_birth, "super_pass_user_details_date_of_birth");
        Intrinsics.i(super_pass_user_details_email_id, "super_pass_user_details_email_id");
        Intrinsics.i(super_pass_user_details_profile_photo, "super_pass_user_details_profile_photo");
        this.f2013a = city_name;
        this.b = agency_name;
        this.c = config_id;
        this.d = category_id;
        this.e = j;
        this.f = fare_mapping_display_name;
        this.g = pass_name;
        this.h = j2;
        this.i = j3;
        this.j = super_pass_application_status;
        this.k = proofs;
        this.l = passApplicationActionRequired;
        this.m = super_pass_user_details_user_id;
        this.n = super_pass_user_details_mobile_number;
        this.o = super_pass_user_details_full_name;
        this.p = super_pass_user_details_gender;
        this.q = super_pass_user_details_date_of_birth;
        this.r = super_pass_user_details_email_id;
        this.s = super_pass_user_details_profile_photo;
        this.t = j4;
        this.u = d;
        this.v = str;
        this.w = list;
        this.x = list2;
        this.y = list3;
        this.z = refundInfoEntityModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Super_pass_application_table)) {
            return false;
        }
        Super_pass_application_table super_pass_application_table = (Super_pass_application_table) obj;
        return Intrinsics.d(this.f2013a, super_pass_application_table.f2013a) && Intrinsics.d(this.b, super_pass_application_table.b) && Intrinsics.d(this.c, super_pass_application_table.c) && Intrinsics.d(this.d, super_pass_application_table.d) && this.e == super_pass_application_table.e && Intrinsics.d(this.f, super_pass_application_table.f) && Intrinsics.d(this.g, super_pass_application_table.g) && this.h == super_pass_application_table.h && this.i == super_pass_application_table.i && this.j == super_pass_application_table.j && Intrinsics.d(this.k, super_pass_application_table.k) && this.l == super_pass_application_table.l && Intrinsics.d(this.m, super_pass_application_table.m) && Intrinsics.d(this.n, super_pass_application_table.n) && Intrinsics.d(this.o, super_pass_application_table.o) && this.p == super_pass_application_table.p && Intrinsics.d(this.q, super_pass_application_table.q) && Intrinsics.d(this.r, super_pass_application_table.r) && Intrinsics.d(this.s, super_pass_application_table.s) && this.t == super_pass_application_table.t && Intrinsics.d(this.u, super_pass_application_table.u) && Intrinsics.d(this.v, super_pass_application_table.v) && Intrinsics.d(this.w, super_pass_application_table.w) && Intrinsics.d(this.x, super_pass_application_table.x) && Intrinsics.d(this.y, super_pass_application_table.y) && Intrinsics.d(this.z, super_pass_application_table.z);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f2013a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int iE2 = nf1.e(nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f), 31, this.g);
        long j2 = this.h;
        int i = (iE2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iF = defpackage.d.f(this.k, (this.j.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31);
        PassApplicationActionRequired passApplicationActionRequired = this.l;
        int iE3 = nf1.e(nf1.e(nf1.e((this.p.hashCode() + nf1.e(nf1.e(nf1.e((iF + (passApplicationActionRequired == null ? 0 : passApplicationActionRequired.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o)) * 31, 31, this.q), 31, this.r), 31, this.s);
        long j4 = this.t;
        int i2 = (iE3 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        Double d = this.u;
        int iHashCode = (i2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.v;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.w;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.x;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.y;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.z;
        return iHashCode5 + (refundInfoEntityModel != null ? refundInfoEntityModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Super_pass_application_table(city_name=", this.f2013a, ", agency_name=", this.b, ", config_id=");
        cb0.t(sbE, this.c, ", category_id=", this.d, ", fare_mapping_id=");
        dd.k(this.e, ", fare_mapping_display_name=", this.f, sbE);
        defpackage.d.t(sbE, ", pass_name=", this.g, ", pass_start_date=");
        sbE.append(this.h);
        xs.r(this.i, ", verification_expiry_time=", ", super_pass_application_status=", sbE);
        sbE.append(this.j);
        sbE.append(", proofs=");
        sbE.append(this.k);
        sbE.append(", pass_application_action_required=");
        sbE.append(this.l);
        sbE.append(", super_pass_user_details_user_id=");
        sbE.append(this.m);
        sbE.append(", super_pass_user_details_mobile_number=");
        cb0.t(sbE, this.n, ", super_pass_user_details_full_name=", this.o, ", super_pass_user_details_gender=");
        sbE.append(this.p);
        sbE.append(", super_pass_user_details_date_of_birth=");
        sbE.append(this.q);
        sbE.append(", super_pass_user_details_email_id=");
        cb0.t(sbE, this.r, ", super_pass_user_details_profile_photo=", this.s, ", super_pass_user_details_dob_in_millis=");
        sbE.append(this.t);
        sbE.append(", cash_payment_pending_transaction_details_pending_fare=");
        sbE.append(this.u);
        sbE.append(", cash_payment_pending_transaction_details_reference_id=");
        sbE.append(this.v);
        sbE.append(", pass_application_rejection_reasons_proofRejectionReasonsList=");
        sbE.append(this.w);
        sbE.append(", pass_application_rejection_reasons_profileRejectionReasonsList=");
        sbE.append(this.x);
        sbE.append(", pass_application_rejection_reasons_generalRejectionReasonsList=");
        sbE.append(this.y);
        sbE.append(", refundInfo=");
        sbE.append(this.z);
        sbE.append(")");
        return sbE.toString();
    }
}
