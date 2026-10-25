package app.chalo.core;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
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
final class Magic_super_pass_tableQueries$getAllMagicSuperPassesBookedWithDistinctUserNamesForCityList$2 implements FunctionN<Magic_super_pass_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 56) {
            throw new IllegalArgumentException("Expected 56 arguments");
        }
        String super_pass_properties_qr_code = (String) objArr[0];
        String str = (String) objArr[1];
        String super_pass_properties_pass_id = (String) objArr[2];
        String super_pass_properties_product_type = (String) objArr[3];
        SuperPassSubType super_pass_properties_product_sub_type = (SuperPassSubType) objArr[4];
        String super_pass_properties_city_name_ = (String) objArr[5];
        String super_pass_properties_agency_name = (String) objArr[6];
        SuperPassStatus super_pass_validation_properties_super_pass_status = (SuperPassStatus) objArr[7];
        long jLongValue = ((Number) objArr[8]).longValue();
        long jLongValue2 = ((Number) objArr[9]).longValue();
        long jLongValue3 = ((Number) objArr[10]).longValue();
        long jLongValue4 = ((Number) objArr[11]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[12]).booleanValue();
        List super_pass_validation_properties_service_type = (List) objArr[13];
        long jLongValue5 = ((Number) objArr[14]).longValue();
        long jLongValue6 = ((Number) objArr[15]).longValue();
        List super_pass_ui_properties_special_features = (List) objArr[16];
        Map super_pass_ui_properties_proofs = (Map) objArr[17];
        long jLongValue7 = ((Number) objArr[18]).longValue();
        String super_pass_ui_properties_pass_name = (String) objArr[19];
        String super_pass_ui_properties_category_name = (String) objArr[20];
        String super_pass_ui_properties_fare_mapping_display_name = (String) objArr[21];
        String super_pass_ui_properties_super_pass_user_details_user_id = (String) objArr[22];
        String super_pass_ui_properties_super_pass_user_details_mobile_number = (String) objArr[23];
        String super_pass_ui_properties_super_pass_user_details_full_name = (String) objArr[24];
        Gender super_pass_ui_properties_super_pass_user_details_gender = (Gender) objArr[25];
        String super_pass_ui_properties_super_pass_user_details_date_of_birth = (String) objArr[26];
        String super_pass_ui_properties_super_pass_user_details_email_id = (String) objArr[27];
        String super_pass_ui_properties_super_pass_user_details_profile_photo = (String) objArr[28];
        long jLongValue8 = ((Number) objArr[29]).longValue();
        double dDoubleValue = ((Number) objArr[30]).doubleValue();
        double dDoubleValue2 = ((Number) objArr[31]).doubleValue();
        boolean zBooleanValue2 = ((Boolean) objArr[32]).booleanValue();
        double dDoubleValue3 = ((Number) objArr[33]).doubleValue();
        List super_pass_ui_properties_fare_infofareBreakupComponentList = (List) objArr[34];
        boolean zBooleanValue3 = ((Boolean) objArr[35]).booleanValue();
        String super_pass_repurchase_properties_config_id = (String) objArr[36];
        String super_pass_repurchase_properties_category_id = (String) objArr[37];
        long jLongValue9 = ((Number) objArr[38]).longValue();
        long jLongValue10 = ((Number) objArr[39]).longValue();
        boolean zBooleanValue4 = ((Boolean) objArr[40]).booleanValue();
        boolean zBooleanValue5 = ((Boolean) objArr[41]).booleanValue();
        String super_pass_transaction_details_transaction_id = (String) objArr[42];
        String super_pass_transaction_details_payment_mode = (String) objArr[43];
        String str2 = (String) objArr[44];
        String str3 = (String) objArr[45];
        String str4 = (String) objArr[46];
        String str5 = (String) objArr[47];
        String str6 = (String) objArr[48];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[49];
        PassTierType super_pass_validation_properties_tier_type = (PassTierType) objArr[50];
        Long l = (Long) objArr[51];
        Long l2 = (Long) objArr[52];
        Boolean bool = (Boolean) objArr[53];
        PremiumBusMeta premiumBusMeta = (PremiumBusMeta) objArr[54];
        Boolean bool2 = (Boolean) objArr[55];
        Intrinsics.i(super_pass_properties_qr_code, "super_pass_properties_qr_code");
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        Intrinsics.i(super_pass_properties_product_type, "super_pass_properties_product_type");
        Intrinsics.i(super_pass_properties_product_sub_type, "super_pass_properties_product_sub_type");
        Intrinsics.i(super_pass_properties_city_name_, "super_pass_properties_city_name_");
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
        return new Magic_super_pass_table(super_pass_properties_qr_code, str, super_pass_properties_pass_id, super_pass_properties_product_type, super_pass_properties_product_sub_type, super_pass_properties_city_name_, super_pass_properties_agency_name, super_pass_validation_properties_super_pass_status, jLongValue, jLongValue2, jLongValue3, jLongValue4, zBooleanValue, super_pass_validation_properties_service_type, jLongValue5, jLongValue6, super_pass_ui_properties_special_features, super_pass_ui_properties_proofs, jLongValue7, super_pass_ui_properties_pass_name, super_pass_ui_properties_category_name, super_pass_ui_properties_fare_mapping_display_name, super_pass_ui_properties_super_pass_user_details_user_id, super_pass_ui_properties_super_pass_user_details_mobile_number, super_pass_ui_properties_super_pass_user_details_full_name, super_pass_ui_properties_super_pass_user_details_gender, super_pass_ui_properties_super_pass_user_details_date_of_birth, super_pass_ui_properties_super_pass_user_details_email_id, super_pass_ui_properties_super_pass_user_details_profile_photo, jLongValue8, dDoubleValue, dDoubleValue2, zBooleanValue2, dDoubleValue3, super_pass_ui_properties_fare_infofareBreakupComponentList, zBooleanValue3, super_pass_repurchase_properties_config_id, super_pass_repurchase_properties_category_id, jLongValue9, jLongValue10, zBooleanValue4, zBooleanValue5, super_pass_transaction_details_transaction_id, super_pass_transaction_details_payment_mode, str2, str3, str4, str5, str6, refundInfoEntityModel, super_pass_validation_properties_tier_type, l, l2, bool, premiumBusMeta, bool2);
    }
}
