package app.chalo.userprofile.data.repository;

import app.chalo.login.data.mappers.LoginResponseModelsToAppModelsKt;
import app.chalo.login.data.models.response.UserProfileResponseModel;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.UserProfileAppModelKt;
import app.chalo.userprofile.data.local.UserProfileLocalDataSource;
import app.chalo.userprofile.data.models.request.UpdateUserProfileRequestApiModel;
import app.chalo.userprofile.data.remote.UserProfileRemoteDataSource;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/data/repository/UserProfileRepositoryImpl;", "Lapp/chalo/userprofile/data/repository/UserProfileRepository;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileRepositoryImpl implements UserProfileRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileRemoteDataSource f10314a;
    public final UserProfileLocalDataSource b;
    public final TimeUtilsContract c;

    public UserProfileRepositoryImpl(UserProfileRemoteDataSource userProfileRemoteDataSource, UserProfileLocalDataSource userProfileLocalDataSource, TimeUtilsContract timeUtilsContract) {
        this.f10314a = userProfileRemoteDataSource;
        this.b = userProfileLocalDataSource;
        this.c = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.data.repository.UserProfileRepository
    public final Object a(String str, ContinuationImpl continuationImpl) {
        UserProfileRepositoryImpl$fetchUserProfile$1 userProfileRepositoryImpl$fetchUserProfile$1;
        if (continuationImpl instanceof UserProfileRepositoryImpl$fetchUserProfile$1) {
            userProfileRepositoryImpl$fetchUserProfile$1 = (UserProfileRepositoryImpl$fetchUserProfile$1) continuationImpl;
            int i = userProfileRepositoryImpl$fetchUserProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileRepositoryImpl$fetchUserProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileRepositoryImpl$fetchUserProfile$1 = new UserProfileRepositoryImpl$fetchUserProfile$1(this, continuationImpl);
            }
        } else {
            userProfileRepositoryImpl$fetchUserProfile$1 = new UserProfileRepositoryImpl$fetchUserProfile$1(this, continuationImpl);
        }
        Object objA = userProfileRepositoryImpl$fetchUserProfile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileRepositoryImpl$fetchUserProfile$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            userProfileRepositoryImpl$fetchUserProfile$1.label = 1;
            objA = this.f10314a.a(str, userProfileRepositoryImpl$fetchUserProfile$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return LoginResponseModelsToAppModelsKt.b((UserProfileResponseModel) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.userprofile.data.repository.UserProfileRepository
    public final Object b(String str, String str2, String str3, String str4, String str5, Long l, String str6, Integer num, ContinuationImpl continuationImpl) {
        UserProfileRepositoryImpl$updateUserProfileOnServer$1 userProfileRepositoryImpl$updateUserProfileOnServer$1;
        if (continuationImpl instanceof UserProfileRepositoryImpl$updateUserProfileOnServer$1) {
            userProfileRepositoryImpl$updateUserProfileOnServer$1 = (UserProfileRepositoryImpl$updateUserProfileOnServer$1) continuationImpl;
            int i = userProfileRepositoryImpl$updateUserProfileOnServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileRepositoryImpl$updateUserProfileOnServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileRepositoryImpl$updateUserProfileOnServer$1 = new UserProfileRepositoryImpl$updateUserProfileOnServer$1(this, continuationImpl);
            }
        } else {
            userProfileRepositoryImpl$updateUserProfileOnServer$1 = new UserProfileRepositoryImpl$updateUserProfileOnServer$1(this, continuationImpl);
        }
        Object objB = userProfileRepositoryImpl$updateUserProfileOnServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileRepositoryImpl$updateUserProfileOnServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            UpdateUserProfileRequestApiModel updateUserProfileRequestApiModel = new UpdateUserProfileRequestApiModel(str, str2, str3, str4, str5, l, str6, num);
            userProfileRepositoryImpl$updateUserProfileOnServer$1.label = 1;
            objB = this.f10314a.b(updateUserProfileRequestApiModel, userProfileRepositoryImpl$updateUserProfileOnServer$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return LoginResponseModelsToAppModelsKt.b((UserProfileResponseModel) objB);
    }

    @Override // app.chalo.userprofile.data.repository.UserProfileRepository
    public final Object c(UserProfileAppModel userProfileAppModel, ContinuationImpl continuationImpl) {
        Object objC = this.b.c(UserProfileAppModelKt.a(userProfileAppModel, this.c), continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.data.repository.UserProfileRepository
    public final Object d(Continuation continuation) {
        Object objA = this.b.a((ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
