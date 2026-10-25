package app.chalo.login.manager;

import app.chalo.constants.Source;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.login.domain.RefreshAuthTokenResult;
import app.chalo.login.domain.RefreshAuthTokensForUserUseCase;
import app.chalo.network.ChaloAuthSecureManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.userprofile.domain.LogoutUserUseCase;
import app.chalo.utils.PlatformFeature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/manager/ChaloAuthSecureManagerImpl;", "Lapp/chalo/network/ChaloAuthSecureManager;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloAuthSecureManagerImpl implements ChaloAuthSecureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5255a;
    public final RefreshAuthTokensForUserUseCase b;
    public final LogoutUserUseCase c;
    public final ChaloNavigationManager d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5256a;

        static {
            int[] iArr = new int[RefreshAuthTokenResult.values().length];
            try {
                iArr[RefreshAuthTokenResult.TOKENS_REFRESHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshAuthTokenResult.USER_ID_NOT_PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshAuthTokenResult.REFRESH_TOKEN_FOR_EXPIRED_TOKEN_NOT_PRESENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshAuthTokenResult.REFRESH_CALL_UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RefreshAuthTokenResult.SERVER_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RefreshAuthTokenResult.INVALID_TOKENS_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RefreshAuthTokenResult.UNKNOWN_LOCAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RefreshAuthTokenResult.RESPONSE_PARSE_EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RefreshAuthTokenResult.TOKENS_PARSE_EXCEPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5256a = iArr;
        }
    }

    public ChaloAuthSecureManagerImpl(LoginRepository loginRepository, RefreshAuthTokensForUserUseCase refreshAuthTokensForUserUseCase, LogoutUserUseCase logoutUserUseCase, ChaloNavigationManager chaloNavigationManager) {
        this.f5255a = loginRepository;
        this.b = refreshAuthTokensForUserUseCase;
        this.c = logoutUserUseCase;
        this.d = chaloNavigationManager;
    }

    @Override // app.chalo.network.ChaloAuthSecureManager
    public final Object a(String str, Continuation continuation) {
        Object objE = e(str, continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.network.ChaloAuthSecureManager
    public final Object b(ContinuationImpl continuationImpl) {
        ChaloAuthSecureManagerImpl$getAccessToken$1 chaloAuthSecureManagerImpl$getAccessToken$1;
        if (continuationImpl instanceof ChaloAuthSecureManagerImpl$getAccessToken$1) {
            chaloAuthSecureManagerImpl$getAccessToken$1 = (ChaloAuthSecureManagerImpl$getAccessToken$1) continuationImpl;
            int i = chaloAuthSecureManagerImpl$getAccessToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAuthSecureManagerImpl$getAccessToken$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAuthSecureManagerImpl$getAccessToken$1 = new ChaloAuthSecureManagerImpl$getAccessToken$1(this, continuationImpl);
            }
        } else {
            chaloAuthSecureManagerImpl$getAccessToken$1 = new ChaloAuthSecureManagerImpl$getAccessToken$1(this, continuationImpl);
        }
        Object objN = chaloAuthSecureManagerImpl$getAccessToken$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAuthSecureManagerImpl$getAccessToken$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            chaloAuthSecureManagerImpl$getAccessToken$1.label = 1;
            objN = this.f5255a.n(chaloAuthSecureManagerImpl$getAccessToken$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        String str = (String) objN;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (e("refreshToken", r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (e("refreshToken", r0) == r1) goto L34;
     */
    @Override // app.chalo.network.ChaloAuthSecureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.login.manager.ChaloAuthSecureManagerImpl$refreshToken$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.login.manager.ChaloAuthSecureManagerImpl$refreshToken$1 r0 = (app.chalo.login.manager.ChaloAuthSecureManagerImpl$refreshToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.manager.ChaloAuthSecureManagerImpl$refreshToken$1 r0 = new app.chalo.login.manager.ChaloAuthSecureManagerImpl$refreshToken$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.b(r7)
            goto L79
        L39:
            kotlin.ResultKt.b(r7)
            goto L4b
        L3d:
            kotlin.ResultKt.b(r7)
            r0.label = r5
            app.chalo.login.domain.RefreshAuthTokensForUserUseCase r7 = r6.b
            java.lang.Enum r7 = r7.a(r0)
            if (r7 != r1) goto L4b
            goto L78
        L4b:
            app.chalo.login.domain.RefreshAuthTokenResult r7 = (app.chalo.login.domain.RefreshAuthTokenResult) r7
            int[] r2 = app.chalo.login.manager.ChaloAuthSecureManagerImpl.WhenMappings.f5256a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            java.lang.String r2 = "refreshToken"
            switch(r7) {
                case 1: goto L7c;
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L64;
                case 5: goto L61;
                case 6: goto L61;
                case 7: goto L61;
                case 8: goto L61;
                case 9: goto L61;
                default: goto L5b;
            }
        L5b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L61:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L64:
            r0.label = r3
            java.lang.Object r7 = r6.e(r2, r0)
            if (r7 != r1) goto L6d
            goto L78
        L6d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L70:
            r0.label = r4
            java.lang.Object r7 = r6.e(r2, r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.manager.ChaloAuthSecureManagerImpl.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.network.ChaloAuthSecureManager
    public final Object d(ContinuationImpl continuationImpl) {
        ChaloAuthSecureManagerImpl$getUserId$1 chaloAuthSecureManagerImpl$getUserId$1;
        if (continuationImpl instanceof ChaloAuthSecureManagerImpl$getUserId$1) {
            chaloAuthSecureManagerImpl$getUserId$1 = (ChaloAuthSecureManagerImpl$getUserId$1) continuationImpl;
            int i = chaloAuthSecureManagerImpl$getUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAuthSecureManagerImpl$getUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAuthSecureManagerImpl$getUserId$1 = new ChaloAuthSecureManagerImpl$getUserId$1(this, continuationImpl);
            }
        } else {
            chaloAuthSecureManagerImpl$getUserId$1 = new ChaloAuthSecureManagerImpl$getUserId$1(this, continuationImpl);
        }
        Object objD = chaloAuthSecureManagerImpl$getUserId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAuthSecureManagerImpl$getUserId$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            chaloAuthSecureManagerImpl$getUserId$1.label = 1;
            objD = this.f5255a.d(chaloAuthSecureManagerImpl$getUserId$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        String str = (String) objD;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, Continuation continuation) {
        ChaloAuthSecureManagerImpl$forceLogoutUser$1 chaloAuthSecureManagerImpl$forceLogoutUser$1;
        if (continuation instanceof ChaloAuthSecureManagerImpl$forceLogoutUser$1) {
            chaloAuthSecureManagerImpl$forceLogoutUser$1 = (ChaloAuthSecureManagerImpl$forceLogoutUser$1) continuation;
            int i = chaloAuthSecureManagerImpl$forceLogoutUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAuthSecureManagerImpl$forceLogoutUser$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAuthSecureManagerImpl$forceLogoutUser$1 = new ChaloAuthSecureManagerImpl$forceLogoutUser$1(this, continuation);
            }
        } else {
            chaloAuthSecureManagerImpl$forceLogoutUser$1 = new ChaloAuthSecureManagerImpl$forceLogoutUser$1(this, continuation);
        }
        Object obj = chaloAuthSecureManagerImpl$forceLogoutUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAuthSecureManagerImpl$forceLogoutUser$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            chaloAuthSecureManagerImpl$forceLogoutUser$1.label = 1;
            if (this.c.a(str, chaloAuthSecureManagerImpl$forceLogoutUser$1, false) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        float f = PlatformFeature.f10436a;
        this.d.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.NONE, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
        return Unit.f17538a;
    }
}
