package app.chalo.userprofile;

import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileAppModelKt {
    public static final UserProfileLocalInfoModel a(UserProfileAppModel userProfileAppModel, TimeUtilsContract timeUtilsContract) {
        String strQ;
        Intrinsics.i(userProfileAppModel, "<this>");
        String str = userProfileAppModel.i;
        String str2 = userProfileAppModel.f10305a;
        String str3 = userProfileAppModel.b;
        String strName = userProfileAppModel.d.name();
        String str4 = userProfileAppModel.h;
        String str5 = userProfileAppModel.e;
        String str6 = userProfileAppModel.c;
        String str7 = userProfileAppModel.f;
        Long l = userProfileAppModel.g;
        if (l == null || (strQ = timeUtilsContract.Q(l.longValue())) == null) {
            strQ = "";
        }
        return new UserProfileLocalInfoModel(str, str2, str3, strName, strQ, str4, str5, str6, str7, userProfileAppModel.g, userProfileAppModel.j);
    }
}
