package app.chalo.core;

import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Super_pass_application_tableQueries$getAllSuperPassApplicationsAsFlow$2 implements FunctionN<Super_pass_application_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 26) {
            throw new IllegalArgumentException("Expected 26 arguments");
        }
        String city_name_ = (String) objArr[0];
        String agency_name = (String) objArr[1];
        String config_id = (String) objArr[2];
        String category_id = (String) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        String fare_mapping_display_name = (String) objArr[5];
        String pass_name = (String) objArr[6];
        long jLongValue2 = ((Number) objArr[7]).longValue();
        long jLongValue3 = ((Number) objArr[8]).longValue();
        SuperPassApplicationStatus super_pass_application_status = (SuperPassApplicationStatus) objArr[9];
        Map proofs = (Map) objArr[10];
        PassApplicationActionRequired passApplicationActionRequired = (PassApplicationActionRequired) objArr[11];
        String super_pass_user_details_user_id = (String) objArr[12];
        String super_pass_user_details_mobile_number = (String) objArr[13];
        String super_pass_user_details_full_name = (String) objArr[14];
        Gender super_pass_user_details_gender = (Gender) objArr[15];
        String super_pass_user_details_date_of_birth = (String) objArr[16];
        String super_pass_user_details_email_id = (String) objArr[17];
        String super_pass_user_details_profile_photo = (String) objArr[18];
        long jLongValue4 = ((Number) objArr[19]).longValue();
        Double d = (Double) objArr[20];
        String str = (String) objArr[21];
        List list = (List) objArr[22];
        List list2 = (List) objArr[23];
        List list3 = (List) objArr[24];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[25];
        Intrinsics.i(city_name_, "city_name_");
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
        return new Super_pass_application_table(city_name_, agency_name, config_id, category_id, jLongValue, fare_mapping_display_name, pass_name, jLongValue2, jLongValue3, super_pass_application_status, proofs, passApplicationActionRequired, super_pass_user_details_user_id, super_pass_user_details_mobile_number, super_pass_user_details_full_name, super_pass_user_details_gender, super_pass_user_details_date_of_birth, super_pass_user_details_email_id, super_pass_user_details_profile_photo, jLongValue4, d, str, list, list2, list3, refundInfoEntityModel);
    }
}
