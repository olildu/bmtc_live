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
final class Ride_based_super_pass_tableQueries$getAllRideBasedSuperPasses$2 implements FunctionN<Ride_based_super_pass_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 65) {
            throw new IllegalArgumentException("Expected 65 arguments");
        }
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        SuperPassStatus super_pass_validation_properties_super_pass_status = (SuperPassStatus) objArr[2];
        long jLongValue3 = ((Number) objArr[3]).longValue();
        long jLongValue4 = ((Number) objArr[4]).longValue();
        long jLongValue5 = ((Number) objArr[5]).longValue();
        List super_pass_validation_properties_ride_details_previous_ride_time_stamps = (List) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        long jLongValue6 = ((Number) objArr[8]).longValue();
        long jLongValue7 = ((Number) objArr[9]).longValue();
        long jLongValue8 = ((Number) objArr[10]).longValue();
        boolean zBooleanValue2 = ((Boolean) objArr[11]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[12]).booleanValue();
        List super_pass_validation_properties_service_type = (List) objArr[13];
        long jLongValue9 = ((Number) objArr[14]).longValue();
        double dDoubleValue = ((Number) objArr[15]).doubleValue();
        String super_pass_ui_properties_fare_mapping_description = (String) objArr[16];
        long jLongValue10 = ((Number) objArr[17]).longValue();
        List super_pass_ui_properties_special_features = (List) objArr[18];
        Map super_pass_ui_properties_proofs = (Map) objArr[19];
        long jLongValue11 = ((Number) objArr[20]).longValue();
        String super_pass_ui_properties_pass_name = (String) objArr[21];
        String super_pass_ui_properties_category_name = (String) objArr[22];
        String super_pass_ui_properties_fare_mapping_display_name = (String) objArr[23];
        String super_pass_ui_properties_super_pass_user_details_user_id = (String) objArr[24];
        String super_pass_ui_properties_super_pass_user_details_mobile_number = (String) objArr[25];
        String super_pass_ui_properties_super_pass_user_details_full_name = (String) objArr[26];
        Gender super_pass_ui_properties_super_pass_user_details_gender = (Gender) objArr[27];
        String super_pass_ui_properties_super_pass_user_details_date_of_birth = (String) objArr[28];
        String super_pass_ui_properties_super_pass_user_details_email_id = (String) objArr[29];
        String super_pass_ui_properties_super_pass_user_details_profile_photo = (String) objArr[30];
        double dDoubleValue2 = ((Number) objArr[31]).doubleValue();
        double dDoubleValue3 = ((Number) objArr[32]).doubleValue();
        boolean zBooleanValue4 = ((Boolean) objArr[33]).booleanValue();
        double dDoubleValue4 = ((Number) objArr[34]).doubleValue();
        List super_pass_ui_properties_fare_infofareBreakupComponentList = (List) objArr[35];
        boolean zBooleanValue5 = ((Boolean) objArr[36]).booleanValue();
        long jLongValue12 = ((Number) objArr[37]).longValue();
        String super_pass_properties_qr_code = (String) objArr[38];
        String str = (String) objArr[39];
        String super_pass_properties_pass_id = (String) objArr[40];
        String super_pass_properties_product_type = (String) objArr[41];
        SuperPassSubType super_pass_properties_product_sub_type = (SuperPassSubType) objArr[42];
        String super_pass_properties_city_name_ = (String) objArr[43];
        String super_pass_properties_agency_name = (String) objArr[44];
        String super_pass_repurchase_properties_config_id = (String) objArr[45];
        String super_pass_repurchase_properties_category_id = (String) objArr[46];
        long jLongValue13 = ((Number) objArr[47]).longValue();
        long jLongValue14 = ((Number) objArr[48]).longValue();
        boolean zBooleanValue6 = ((Boolean) objArr[49]).booleanValue();
        boolean zBooleanValue7 = ((Boolean) objArr[50]).booleanValue();
        String super_pass_transaction_details_transaction_id = (String) objArr[51];
        String super_pass_transaction_details_payment_mode = (String) objArr[52];
        String str2 = (String) objArr[53];
        String str3 = (String) objArr[54];
        String str4 = (String) objArr[55];
        String str5 = (String) objArr[56];
        String str6 = (String) objArr[57];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[58];
        PassTierType super_pass_validation_properties_tier_type = (PassTierType) objArr[59];
        Long l = (Long) objArr[60];
        Long l2 = (Long) objArr[61];
        Boolean bool = (Boolean) objArr[62];
        PremiumBusMeta premiumBusMeta = (PremiumBusMeta) objArr[63];
        Boolean bool2 = (Boolean) objArr[64];
        Intrinsics.i(super_pass_validation_properties_super_pass_status, "super_pass_validation_properties_super_pass_status");
        Intrinsics.i(super_pass_validation_properties_ride_details_previous_ride_time_stamps, "super_pass_validation_properties_ride_details_previous_ride_time_stamps");
        Intrinsics.i(super_pass_validation_properties_service_type, "super_pass_validation_properties_service_type");
        Intrinsics.i(super_pass_ui_properties_fare_mapping_description, "super_pass_ui_properties_fare_mapping_description");
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
        Intrinsics.i(super_pass_properties_qr_code, "super_pass_properties_qr_code");
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        Intrinsics.i(super_pass_properties_product_type, "super_pass_properties_product_type");
        Intrinsics.i(super_pass_properties_product_sub_type, "super_pass_properties_product_sub_type");
        Intrinsics.i(super_pass_properties_city_name_, "super_pass_properties_city_name_");
        Intrinsics.i(super_pass_properties_agency_name, "super_pass_properties_agency_name");
        Intrinsics.i(super_pass_repurchase_properties_config_id, "super_pass_repurchase_properties_config_id");
        Intrinsics.i(super_pass_repurchase_properties_category_id, "super_pass_repurchase_properties_category_id");
        Intrinsics.i(super_pass_transaction_details_transaction_id, "super_pass_transaction_details_transaction_id");
        Intrinsics.i(super_pass_transaction_details_payment_mode, "super_pass_transaction_details_payment_mode");
        Intrinsics.i(super_pass_validation_properties_tier_type, "super_pass_validation_properties_tier_type");
        return new Ride_based_super_pass_table(jLongValue, jLongValue2, super_pass_validation_properties_super_pass_status, jLongValue3, jLongValue4, jLongValue5, super_pass_validation_properties_ride_details_previous_ride_time_stamps, zBooleanValue, jLongValue6, jLongValue7, jLongValue8, zBooleanValue2, zBooleanValue3, super_pass_validation_properties_service_type, jLongValue9, dDoubleValue, super_pass_ui_properties_fare_mapping_description, jLongValue10, super_pass_ui_properties_special_features, super_pass_ui_properties_proofs, jLongValue11, super_pass_ui_properties_pass_name, super_pass_ui_properties_category_name, super_pass_ui_properties_fare_mapping_display_name, super_pass_ui_properties_super_pass_user_details_user_id, super_pass_ui_properties_super_pass_user_details_mobile_number, super_pass_ui_properties_super_pass_user_details_full_name, super_pass_ui_properties_super_pass_user_details_gender, super_pass_ui_properties_super_pass_user_details_date_of_birth, super_pass_ui_properties_super_pass_user_details_email_id, super_pass_ui_properties_super_pass_user_details_profile_photo, dDoubleValue2, dDoubleValue3, zBooleanValue4, dDoubleValue4, super_pass_ui_properties_fare_infofareBreakupComponentList, zBooleanValue5, jLongValue12, super_pass_properties_qr_code, str, super_pass_properties_pass_id, super_pass_properties_product_type, super_pass_properties_product_sub_type, super_pass_properties_city_name_, super_pass_properties_agency_name, super_pass_repurchase_properties_config_id, super_pass_repurchase_properties_category_id, jLongValue13, jLongValue14, zBooleanValue6, zBooleanValue7, super_pass_transaction_details_transaction_id, super_pass_transaction_details_payment_mode, str2, str3, str4, str5, str6, refundInfoEntityModel, super_pass_validation_properties_tier_type, l, l2, bool, premiumBusMeta, bool2);
    }
}
