package app.chalo.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileLocalInfoModelKt {
    public static final UserProfileAppModel a(UserProfileLocalInfoModel userProfileLocalInfoModel) {
        Intrinsics.i(userProfileLocalInfoModel, "<this>");
        String str = userProfileLocalInfoModel.b;
        if (str == null) {
            str = "";
        }
        String str2 = userProfileLocalInfoModel.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = userProfileLocalInfoModel.h;
        if (str3 == null) {
            str3 = "";
        }
        Gender.Companion companion = Gender.INSTANCE;
        String str4 = userProfileLocalInfoModel.d;
        Gender gender = Gender.NULL;
        companion.getClass();
        Gender genderA = Gender.Companion.a(str4, gender);
        String str5 = userProfileLocalInfoModel.g;
        String str6 = userProfileLocalInfoModel.i;
        if (str6 == null) {
            str6 = "+91";
        }
        Long l = userProfileLocalInfoModel.j;
        String str7 = userProfileLocalInfoModel.f;
        if (str7 == null) {
            str7 = "";
        }
        return new UserProfileAppModel(str, str2, str3, genderA, str5, str6, l, str7, userProfileLocalInfoModel.f10306a, userProfileLocalInfoModel.k);
    }
}
