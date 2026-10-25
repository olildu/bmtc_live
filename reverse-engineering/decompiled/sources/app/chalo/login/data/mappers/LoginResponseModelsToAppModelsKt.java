package app.chalo.login.data.mappers;

import app.chalo.login.data.exceptions.ProfileAndTokensExceptions;
import app.chalo.login.data.models.app.DpdpaConsentInfoAppModel;
import app.chalo.login.data.models.app.DpdpaConsentStatus;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.data.models.response.DpdpaConsentInfoResponseApiModel;
import app.chalo.login.data.models.response.DpdpaUserConsentsInfoResponseApiModel;
import app.chalo.login.data.models.response.UserProfileResponseModel;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoginResponseModelsToAppModelsKt {
    public static final DpdpaUserConsentsInfoAppModel a(DpdpaUserConsentsInfoResponseApiModel dpdpaUserConsentsInfoResponseApiModel) {
        List<DpdpaConsentInfoResponseApiModel> list;
        DpdpaConsentInfoAppModel dpdpaConsentInfoAppModel;
        DpdpaConsentStatus dpdpaConsentStatus;
        Intrinsics.i(dpdpaUserConsentsInfoResponseApiModel, "<this>");
        String str = dpdpaUserConsentsInfoResponseApiModel.f5213a;
        if (str != null) {
            Integer num = dpdpaUserConsentsInfoResponseApiModel.c;
            String str2 = dpdpaUserConsentsInfoResponseApiModel.e;
            if (str2 != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null && (list = dpdpaUserConsentsInfoResponseApiModel.f) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (DpdpaConsentInfoResponseApiModel dpdpaConsentInfoResponseApiModel : list) {
                        Intrinsics.i(dpdpaConsentInfoResponseApiModel, "<this>");
                        String str3 = dpdpaConsentInfoResponseApiModel.f5211a;
                        if (str3 == null) {
                            dpdpaConsentInfoAppModel = null;
                        } else {
                            DpdpaConsentStatus.Companion companion = DpdpaConsentStatus.INSTANCE;
                            String str4 = dpdpaConsentInfoResponseApiModel.b;
                            if (str4 == null) {
                                str4 = "";
                            }
                            companion.getClass();
                            DpdpaConsentStatus[] dpdpaConsentStatusArrValues = DpdpaConsentStatus.values();
                            int length = dpdpaConsentStatusArrValues.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    dpdpaConsentStatus = null;
                                    break;
                                }
                                dpdpaConsentStatus = dpdpaConsentStatusArrValues[i];
                                if (StringsKt.x(dpdpaConsentStatus.name(), str4, true)) {
                                    break;
                                }
                                i++;
                            }
                            if (dpdpaConsentStatus == null) {
                                dpdpaConsentStatus = DpdpaConsentStatus.UNKNOWN;
                            }
                            dpdpaConsentInfoAppModel = new DpdpaConsentInfoAppModel(str3, dpdpaConsentStatus);
                        }
                        if (dpdpaConsentInfoAppModel != null) {
                            arrayList.add(dpdpaConsentInfoAppModel);
                        }
                    }
                    return new DpdpaUserConsentsInfoAppModel(str, num, str2, arrayList);
                }
            }
        }
        return null;
    }

    public static final UserProfileAppModel b(UserProfileResponseModel userProfileResponseModel) throws ProfileAndTokensExceptions.InvalidProfileDetails {
        Intrinsics.i(userProfileResponseModel, "<this>");
        String strConcat = userProfileResponseModel.f;
        if (userProfileResponseModel.e == null || strConcat == null || userProfileResponseModel.i == null) {
            throw new ProfileAndTokensExceptions.InvalidProfileDetails(userProfileResponseModel, "mandatory profile fields are null");
        }
        String str = userProfileResponseModel.f5225a;
        if (str == null) {
            str = "";
        }
        String str2 = userProfileResponseModel.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = userProfileResponseModel.c;
        if (str3 == null) {
            str3 = "";
        }
        Gender.Companion companion = Gender.INSTANCE;
        String str4 = userProfileResponseModel.d;
        Gender gender = Gender.NULL;
        companion.getClass();
        Gender genderA = Gender.Companion.a(str4, gender);
        String str5 = userProfileResponseModel.e;
        Character chA = StringsKt.A(strConcat, 0);
        if (chA == null || chA.charValue() != '+') {
            strConcat = "+".concat(strConcat);
        }
        String str6 = strConcat;
        Long l = userProfileResponseModel.g;
        String str7 = userProfileResponseModel.h;
        return new UserProfileAppModel(str, str2, str3, genderA, str5, str6, l, str7 == null ? "" : str7, userProfileResponseModel.i, userProfileResponseModel.j);
    }
}
