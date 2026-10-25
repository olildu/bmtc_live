package defpackage;

import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Pending_super_pass_tableQueries;
import app.chalo.core.database.dao.SuperPassDaoImpl;
import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.superpass.data.models.entities.FareInfo;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassTransactionDetails;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassUIProperties;
import app.chalo.userprofile.Gender;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sf1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19299a;
    public final /* synthetic */ List b;
    public final /* synthetic */ SuperPassDaoImpl c;

    public /* synthetic */ sf1(List list, SuperPassDaoImpl superPassDaoImpl, int i) {
        this.f19299a = i;
        this.b = list;
        this.c = superPassDaoImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19299a) {
            case 0:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.c.b.f0(SuperPassTableMappers.e((MagicSuperPass) it.next()));
                }
                break;
            case 1:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    PendingSuperPass pendingSuperPass = (PendingSuperPass) it2.next();
                    Pending_super_pass_tableQueries pending_super_pass_tableQueries = this.c.e;
                    Intrinsics.i(pendingSuperPass, "<this>");
                    PendingSuperPassProperties pendingSuperPassProperties = pendingSuperPass.f9583a;
                    SuperPassStatus superPassStatus = pendingSuperPassProperties.f;
                    String str = pendingSuperPassProperties.f9566a;
                    String str2 = pendingSuperPassProperties.b;
                    SuperPassSubType superPassSubType = pendingSuperPassProperties.c;
                    String str3 = pendingSuperPassProperties.d;
                    String str4 = pendingSuperPassProperties.e;
                    PendingSuperPassUIProperties pendingSuperPassUIProperties = pendingSuperPass.b;
                    double d = pendingSuperPassUIProperties.m;
                    String str5 = pendingSuperPassUIProperties.n;
                    long j = pendingSuperPassUIProperties.f9578a;
                    List list = pendingSuperPassUIProperties.b;
                    Iterator it3 = it2;
                    Map map = pendingSuperPassUIProperties.d;
                    long j2 = pendingSuperPassUIProperties.e;
                    String str6 = pendingSuperPassUIProperties.g;
                    String str7 = pendingSuperPassUIProperties.h;
                    String str8 = pendingSuperPassUIProperties.j;
                    SuperPassUserDetails superPassUserDetails = pendingSuperPassUIProperties.c;
                    String str9 = superPassUserDetails.f9580a;
                    String str10 = superPassUserDetails.b;
                    String str11 = superPassUserDetails.c;
                    Gender gender = superPassUserDetails.d;
                    String str12 = superPassUserDetails.e;
                    String str13 = superPassUserDetails.f;
                    String str14 = superPassUserDetails.g;
                    FareInfo fareInfo = pendingSuperPassUIProperties.f;
                    double d2 = fareInfo.f9545a;
                    double d3 = fareInfo.b;
                    boolean z = fareInfo.c;
                    double d4 = fareInfo.d;
                    List list2 = fareInfo.e;
                    boolean z2 = pendingSuperPassUIProperties.i.f5592a;
                    PendingSuperPassRepurchaseProperties pendingSuperPassRepurchaseProperties = pendingSuperPass.c;
                    String str15 = pendingSuperPassRepurchaseProperties.f9584a;
                    String str16 = pendingSuperPassRepurchaseProperties.b;
                    long j3 = pendingSuperPassRepurchaseProperties.c;
                    long j4 = pendingSuperPassRepurchaseProperties.d;
                    long j5 = pendingSuperPassRepurchaseProperties.e;
                    boolean z3 = pendingSuperPassRepurchaseProperties.f;
                    PendingSuperPassTransactionDetails pendingSuperPassTransactionDetails = pendingSuperPass.d;
                    Pending_super_pass_table pending_super_pass_table = new Pending_super_pass_table(superPassStatus, str, str2, superPassSubType, str3, str4, d, str5, j, list, map, j2, str6, str7, str8, str9, str10, str11, gender, str12, str13, str14, d2, d3, z, d4, list2, z2, str15, str16, j3, j4, j5, z3, pendingSuperPassTransactionDetails.f9585a, pendingSuperPassTransactionDetails.b, pendingSuperPassTransactionDetails.c, pendingSuperPassTransactionDetails.d);
                    pending_super_pass_tableQueries.getClass();
                    pending_super_pass_tableQueries.f697a.A0(35130951, "INSERT OR REPLACE INTO pending_super_pass_table (pending_super_pass_properties_super_pass_status, pending_super_pass_properties_pass_id, pending_super_pass_properties_product_type, pending_super_pass_properties_product_sub_type, pending_super_pass_properties_city_name, pending_super_pass_properties_agency_name, pending_super_pass_ui_properties_max_price_per_trip, pending_super_pass_ui_properties_fare_mapping_description, pending_super_pass_ui_properties_num_of_days, pending_super_pass_ui_properties_special_features, pending_super_pass_ui_properties_proofs, pending_super_pass_ui_properties_booking_time, pending_super_pass_ui_properties_pass_name, pending_super_pass_ui_properties_category_name, pending_super_pass_ui_properties_fare_mapping_display_name, pending_super_pass_ui_properties_super_pass_user_details_user_id, pending_super_pass_ui_properties_super_pass_user_details_mobile_number, pending_super_pass_ui_properties_super_pass_user_details_full_name, pending_super_pass_ui_properties_super_pass_user_details_gender, pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, pending_super_pass_ui_properties_super_pass_user_details_email_id, pending_super_pass_ui_properties_super_pass_user_details_profile_photo, pending_super_pass_ui_properties_fare_infopayableAmount, pending_super_pass_ui_properties_fare_infoactualFare, pending_super_pass_ui_properties_fare_infoisDiscountApplicable, pending_super_pass_ui_properties_fare_infodiscountedFare, pending_super_pass_ui_properties_fare_infofareBreakupComponentList, pending_super_pass_ui_properties_product_brandingis_visible, pending_super_pass_repurchase_properties_config_id, pending_super_pass_repurchase_properties_category_id, pending_super_pass_repurchase_properties_fare_mapping_id, pending_super_pass_repurchase_properties_start_time, pending_super_pass_repurchase_properties_verification_expiry_time, pending_super_pass_repurchase_properties_verification_flag, pending_super_pass_transaction_details_payment_mode, pending_super_pass_transaction_details_transaction_id, pending_super_pass_transaction_details_order_id, pending_super_pass_transaction_details_refund_info) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ej0(24, pending_super_pass_tableQueries, pending_super_pass_table));
                    pending_super_pass_tableQueries.T(35130951, new ir0(9));
                    it2 = it3;
                }
                break;
            case 2:
                Iterator it4 = this.b.iterator();
                while (it4.hasNext()) {
                    this.c.f2082a.c0(SuperPassTableMappers.f((RideBasedSuperPass) it4.next()));
                }
                break;
            default:
                Iterator it5 = this.b.iterator();
                while (it5.hasNext()) {
                    this.c.c.X(SuperPassTableMappers.g((SuperPassApplication) it5.next()));
                }
                break;
        }
        return Unit.f17538a;
    }
}
