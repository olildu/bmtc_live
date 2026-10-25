package app.chalo.login.userprofiling.hookorchestrator;

import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/userprofiling/hookorchestrator/UserProfileCompletenessResolver;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileCompletenessResolver {
    public static UserProfileCompletenessCategory a(UserProfileAppModel userProfileAppModel) {
        Long l;
        Integer num = userProfileAppModel.j;
        boolean z = num == null ? !((l = userProfileAppModel.g) == null || l.longValue() <= 0) : num.intValue() > 0;
        boolean z2 = userProfileAppModel.d != Gender.NULL;
        boolean zF = StringsKt.F(userProfileAppModel.a());
        boolean zF2 = StringsKt.F(userProfileAppModel.h);
        if (z && z2) {
            return (zF || zF2) ? UserProfileCompletenessCategory.BARE_MINIMUM_COMPLETED : UserProfileCompletenessCategory.COMPLETE;
        }
        return UserProfileCompletenessCategory.INCOMPLETE;
    }
}
