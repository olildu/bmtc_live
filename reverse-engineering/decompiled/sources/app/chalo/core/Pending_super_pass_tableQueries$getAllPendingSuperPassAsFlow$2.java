package app.chalo.core;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Pending_super_pass_tableQueries$getAllPendingSuperPassAsFlow$2 implements FunctionN<Pending_super_pass_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 38) {
            throw new IllegalArgumentException("Expected 38 arguments");
        }
        SuperPassStatus pending_super_pass_properties_super_pass_status = (SuperPassStatus) objArr[0];
        String pending_super_pass_properties_pass_id = (String) objArr[1];
        String pending_super_pass_properties_product_type = (String) objArr[2];
        SuperPassSubType pending_super_pass_properties_product_sub_type = (SuperPassSubType) objArr[3];
        String pending_super_pass_properties_city_name_ = (String) objArr[4];
        String pending_super_pass_properties_agency_name = (String) objArr[5];
        double dDoubleValue = ((Number) objArr[6]).doubleValue();
        String str = (String) objArr[7];
        long jLongValue = ((Number) objArr[8]).longValue();
        List pending_super_pass_ui_properties_special_features = (List) objArr[9];
        Map pending_super_pass_ui_properties_proofs = (Map) objArr[10];
        long jLongValue2 = ((Number) objArr[11]).longValue();
        String pending_super_pass_ui_properties_pass_name = (String) objArr[12];
        String pending_super_pass_ui_properties_category_name = (String) objArr[13];
        String pending_super_pass_ui_properties_fare_mapping_display_name = (String) objArr[14];
        String pending_super_pass_ui_properties_super_pass_user_details_user_id = (String) objArr[15];
        String pending_super_pass_ui_properties_super_pass_user_details_mobile_number = (String) objArr[16];
        String pending_super_pass_ui_properties_super_pass_user_details_full_name = (String) objArr[17];
        Gender pending_super_pass_ui_properties_super_pass_user_details_gender = (Gender) objArr[18];
        String pending_super_pass_ui_properties_super_pass_user_details_date_of_birth = (String) objArr[19];
        String pending_super_pass_ui_properties_super_pass_user_details_email_id = (String) objArr[20];
        String pending_super_pass_ui_properties_super_pass_user_details_profile_photo = (String) objArr[21];
        double dDoubleValue2 = ((Number) objArr[22]).doubleValue();
        double dDoubleValue3 = ((Number) objArr[23]).doubleValue();
        boolean zBooleanValue = ((Boolean) objArr[24]).booleanValue();
        double dDoubleValue4 = ((Number) objArr[25]).doubleValue();
        List pending_super_pass_ui_properties_fare_infofareBreakupComponentList = (List) objArr[26];
        boolean zBooleanValue2 = ((Boolean) objArr[27]).booleanValue();
        String pending_super_pass_repurchase_properties_config_id = (String) objArr[28];
        String pending_super_pass_repurchase_properties_category_id = (String) objArr[29];
        long jLongValue3 = ((Number) objArr[30]).longValue();
        long jLongValue4 = ((Number) objArr[31]).longValue();
        long jLongValue5 = ((Number) objArr[32]).longValue();
        boolean zBooleanValue3 = ((Boolean) objArr[33]).booleanValue();
        String pending_super_pass_transaction_details_payment_mode = (String) objArr[34];
        String pending_super_pass_transaction_details_transaction_id = (String) objArr[35];
        String str2 = (String) objArr[36];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[37];
        Intrinsics.i(pending_super_pass_properties_super_pass_status, "pending_super_pass_properties_super_pass_status");
        Intrinsics.i(pending_super_pass_properties_pass_id, "pending_super_pass_properties_pass_id");
        Intrinsics.i(pending_super_pass_properties_product_type, "pending_super_pass_properties_product_type");
        Intrinsics.i(pending_super_pass_properties_product_sub_type, "pending_super_pass_properties_product_sub_type");
        Intrinsics.i(pending_super_pass_properties_city_name_, "pending_super_pass_properties_city_name_");
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
        return new Pending_super_pass_table(pending_super_pass_properties_super_pass_status, pending_super_pass_properties_pass_id, pending_super_pass_properties_product_type, pending_super_pass_properties_product_sub_type, pending_super_pass_properties_city_name_, pending_super_pass_properties_agency_name, dDoubleValue, str, jLongValue, pending_super_pass_ui_properties_special_features, pending_super_pass_ui_properties_proofs, jLongValue2, pending_super_pass_ui_properties_pass_name, pending_super_pass_ui_properties_category_name, pending_super_pass_ui_properties_fare_mapping_display_name, pending_super_pass_ui_properties_super_pass_user_details_user_id, pending_super_pass_ui_properties_super_pass_user_details_mobile_number, pending_super_pass_ui_properties_super_pass_user_details_full_name, pending_super_pass_ui_properties_super_pass_user_details_gender, pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, pending_super_pass_ui_properties_super_pass_user_details_email_id, pending_super_pass_ui_properties_super_pass_user_details_profile_photo, dDoubleValue2, dDoubleValue3, zBooleanValue, dDoubleValue4, pending_super_pass_ui_properties_fare_infofareBreakupComponentList, zBooleanValue2, pending_super_pass_repurchase_properties_config_id, pending_super_pass_repurchase_properties_category_id, jLongValue3, jLongValue4, jLongValue5, zBooleanValue3, pending_super_pass_transaction_details_payment_mode, pending_super_pass_transaction_details_transaction_id, str2, refundInfoEntityModel);
    }
}
