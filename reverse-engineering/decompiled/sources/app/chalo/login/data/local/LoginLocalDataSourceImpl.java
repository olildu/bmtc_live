package app.chalo.login.data.local;

import app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1;
import app.chalo.userprofile.UserProfileAndAuthStoreManager;
import app.chalo.userprofile.UserProfileLocalInfoModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/local/LoginLocalDataSourceImpl;", "Lapp/chalo/login/data/local/LoginLocalDataSource;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginLocalDataSourceImpl implements LoginLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileAndAuthStoreManager f5189a;

    public LoginLocalDataSourceImpl(UserProfileAndAuthStoreManager userProfileAndAuthStoreManager) {
        this.f5189a = userProfileAndAuthStoreManager;
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        Object objA = this.f5189a.a(z, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object b(ContinuationImpl continuationImpl) {
        return this.f5189a.b(continuationImpl);
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object c(Continuation continuation) {
        return this.f5189a.c(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object d(ContinuationImpl continuationImpl) {
        LoginLocalDataSourceImpl$getUserId$1 loginLocalDataSourceImpl$getUserId$1;
        if (continuationImpl instanceof LoginLocalDataSourceImpl$getUserId$1) {
            loginLocalDataSourceImpl$getUserId$1 = (LoginLocalDataSourceImpl$getUserId$1) continuationImpl;
            int i = loginLocalDataSourceImpl$getUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginLocalDataSourceImpl$getUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                loginLocalDataSourceImpl$getUserId$1 = new LoginLocalDataSourceImpl$getUserId$1(this, continuationImpl);
            }
        } else {
            loginLocalDataSourceImpl$getUserId$1 = new LoginLocalDataSourceImpl$getUserId$1(this, continuationImpl);
        }
        Object objV = loginLocalDataSourceImpl$getUserId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginLocalDataSourceImpl$getUserId$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1 userProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1F = this.f5189a.f();
            loginLocalDataSourceImpl$getUserId$1.label = 1;
            objV = FlowKt.v(userProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1F, loginLocalDataSourceImpl$getUserId$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) objV;
        if (userProfileLocalInfoModel != null) {
            return userProfileLocalInfoModel.f10306a;
        }
        return null;
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object f(long j, String str, Continuation continuation) {
        return this.f5189a.j(j, str, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object g(ContinuationImpl continuationImpl) {
        return this.f5189a.g(continuationImpl);
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object h(UserProfileLocalInfoModel userProfileLocalInfoModel, Continuation continuation) {
        Object objL = this.f5189a.l(userProfileLocalInfoModel, (ContinuationImpl) continuation);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : Unit.f17538a;
    }

    @Override // app.chalo.login.data.local.LoginLocalDataSource
    public final Object i(String str, String str2, Long l, Long l2, Continuation continuation) {
        Object objK = this.f5189a.k(str, str2, l != null ? l.longValue() : -1L, l2.longValue(), continuation);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : Unit.f17538a;
    }
}
