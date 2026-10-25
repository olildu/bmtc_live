package app.chalo.home.extensions;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.ProfileCompletenessResult;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileDetailsProviderExtKt {
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(UserProfileDetailsProvider userProfileDetailsProvider, ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderExtKt$resolveHomeProfileCardData$1 userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1;
        UserProfileAppModel userProfileAppModel;
        ProfileCompletenessResult profileCompletenessResult;
        String strA;
        String str;
        String str2;
        String str3;
        boolean z;
        int i;
        UserProfileDetailsProvider userProfileDetailsProvider2 = userProfileDetailsProvider;
        if (continuationImpl instanceof UserProfileDetailsProviderExtKt$resolveHomeProfileCardData$1) {
            userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1 = (UserProfileDetailsProviderExtKt$resolveHomeProfileCardData$1) continuationImpl;
            int i2 = userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1 = new UserProfileDetailsProviderExtKt$resolveHomeProfileCardData$1(continuationImpl);
            }
        } else {
            userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1 = new UserProfileDetailsProviderExtKt$resolveHomeProfileCardData$1(continuationImpl);
        }
        Object objL = userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.label;
        if (i3 == 0) {
            ResultKt.b(objL);
            userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.L$0 = userProfileDetailsProvider2;
            userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.label = 1;
            objL = userProfileDetailsProvider2.l(userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1);
            if (objL != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            userProfileDetailsProvider2 = (UserProfileDetailsProvider) userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.L$0;
            ResultKt.b(objL);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userProfileAppModel = (UserProfileAppModel) userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.L$0;
            ResultKt.b(objL);
        }
        profileCompletenessResult = (ProfileCompletenessResult) objL;
        strA = userProfileAppModel.a();
        String str4 = userProfileAppModel.e;
        str = userProfileAppModel.c;
        if (StringsKt.F(str)) {
            str2 = null;
        } else {
            str2 = str;
        }
        if (strA.length() == 0) {
            str3 = null;
        } else {
            str3 = strA;
        }
        Gender gender = userProfileAppModel.d;
        if (profileCompletenessResult == null && profileCompletenessResult.f10304a == profileCompletenessResult.b && profileCompletenessResult.c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (profileCompletenessResult != null) {
            i = profileCompletenessResult.f10304a;
        } else {
            i = 0;
        }
        return new ProfileDrawerCardData(true, str2, str3, str4, gender, z, i, profileCompletenessResult != null ? profileCompletenessResult.b : 0, 64);
        UserProfileAppModel userProfileAppModel2 = (UserProfileAppModel) objL;
        if (userProfileAppModel2 == null) {
            return new ProfileDrawerCardData(false, (String) null, (String) null, (String) null, (Gender) null, false, 0, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
        }
        userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.L$0 = userProfileAppModel2;
        userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1.label = 2;
        Object objJ = userProfileDetailsProvider2.j(userProfileDetailsProviderExtKt$resolveHomeProfileCardData$1);
        if (objJ != coroutineSingletons) {
            objL = objJ;
            userProfileAppModel = userProfileAppModel2;
            profileCompletenessResult = (ProfileCompletenessResult) objL;
            strA = userProfileAppModel.a();
            String str5 = userProfileAppModel.e;
            str = userProfileAppModel.c;
            if (StringsKt.F(str)) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (strA.length() == 0) {
                str3 = null;
            } else {
                str3 = strA;
            }
            Gender gender2 = userProfileAppModel.d;
            if (profileCompletenessResult == null) {
                z = false;
            } else {
                z = false;
            }
            if (profileCompletenessResult != null) {
                i = profileCompletenessResult.f10304a;
            } else {
                i = 0;
            }
            return new ProfileDrawerCardData(true, str2, str3, str5, gender2, z, i, profileCompletenessResult != null ? profileCompletenessResult.b : 0, 64);
        }
        return coroutineSingletons;
    }
}
