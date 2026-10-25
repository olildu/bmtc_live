package app.chalo.userprofile.data.repository;

import app.chalo.userprofile.UserProfileLocalInfoModel;
import app.chalo.userprofile.UserProfileLocalInfoModelKt;
import app.chalo.userprofile.data.local.UserProfileLocalDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.data.repository.UserProfileRepositoryImpl", f = "UserProfileRepositoryImpl.kt", l = {61}, m = "getUserProfileDetails", v = 1)
final class UserProfileRepositoryImpl$getUserProfileDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserProfileRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileRepositoryImpl$getUserProfileDetails$1(UserProfileRepositoryImpl userProfileRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = userProfileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserProfileRepositoryImpl$getUserProfileDetails$1 userProfileRepositoryImpl$getUserProfileDetails$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        UserProfileRepositoryImpl userProfileRepositoryImpl = this.this$0;
        userProfileRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            userProfileRepositoryImpl$getUserProfileDetails$1 = this;
        } else {
            userProfileRepositoryImpl$getUserProfileDetails$1 = new UserProfileRepositoryImpl$getUserProfileDetails$1(userProfileRepositoryImpl, this);
        }
        Object objF = userProfileRepositoryImpl$getUserProfileDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileRepositoryImpl$getUserProfileDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            UserProfileLocalDataSource userProfileLocalDataSource = userProfileRepositoryImpl.b;
            userProfileRepositoryImpl$getUserProfileDetails$1.label = 1;
            objF = userProfileLocalDataSource.f(userProfileRepositoryImpl$getUserProfileDetails$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) objF;
        if (userProfileLocalInfoModel != null) {
            return UserProfileLocalInfoModelKt.a(userProfileLocalInfoModel);
        }
        return null;
    }
}
