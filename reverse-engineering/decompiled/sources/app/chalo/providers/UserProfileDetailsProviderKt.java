package app.chalo.providers;

import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileDetailsProviderKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(UserProfileDetailsProvider userProfileDetailsProvider, ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderKt$minProfileRequirementSatisfied$1 userProfileDetailsProviderKt$minProfileRequirementSatisfied$1;
        if (continuationImpl instanceof UserProfileDetailsProviderKt$minProfileRequirementSatisfied$1) {
            userProfileDetailsProviderKt$minProfileRequirementSatisfied$1 = (UserProfileDetailsProviderKt$minProfileRequirementSatisfied$1) continuationImpl;
            int i = userProfileDetailsProviderKt$minProfileRequirementSatisfied$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderKt$minProfileRequirementSatisfied$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderKt$minProfileRequirementSatisfied$1 = new UserProfileDetailsProviderKt$minProfileRequirementSatisfied$1(continuationImpl);
            }
        } else {
            userProfileDetailsProviderKt$minProfileRequirementSatisfied$1 = new UserProfileDetailsProviderKt$minProfileRequirementSatisfied$1(continuationImpl);
        }
        Object objH = userProfileDetailsProviderKt$minProfileRequirementSatisfied$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderKt$minProfileRequirementSatisfied$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            userProfileDetailsProviderKt$minProfileRequirementSatisfied$1.label = 1;
            objH = userProfileDetailsProvider.h(userProfileDetailsProviderKt$minProfileRequirementSatisfied$1);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        Set set = (Set) objH;
        Intrinsics.i(set, "<this>");
        return Boolean.valueOf(set.isEmpty());
    }
}
