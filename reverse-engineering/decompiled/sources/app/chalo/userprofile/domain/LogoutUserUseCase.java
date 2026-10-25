package app.chalo.userprofile.domain;

import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.helper.ProductDataDeletionHelper;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.userprofile.data.repository.UserProfileRepository;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/LogoutUserUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogoutUserUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClearProductStoresUseCase f10324a;
    public final ProductDataDeletionHelper b;
    public final WalletSyncHelper c;
    public final LoginRepository d;
    public final UserProfileRepository e;
    public final CrashlyticsLogger f;
    public final Device g;
    public final AnalyticsContract h;
    public final FcmTokenFeature i;
    public final UserProfilingHooksRuleEngine j;
    public final ThoughtNudgeContract k;

    public LogoutUserUseCase(ClearProductStoresUseCase clearProductStoresUseCase, ProductDataDeletionHelper productDataDeletionHelper, WalletSyncHelper walletSyncHelper, LoginRepository loginRepository, UserProfileRepository userProfileRepository, CrashlyticsLogger crashlyticsLogger, Device device, AnalyticsContract analyticsContract, FcmTokenFeature fcmTokenFeature, UserProfilingHooksRuleEngine userProfilingHooksRuleEngine, ThoughtNudgeContract thoughtNudgeContract) {
        this.f10324a = clearProductStoresUseCase;
        this.b = productDataDeletionHelper;
        this.c = walletSyncHelper;
        this.d = loginRepository;
        this.e = userProfileRepository;
        this.f = crashlyticsLogger;
        this.g = device;
        this.h = analyticsContract;
        this.i = fcmTokenFeature;
        this.j = userProfilingHooksRuleEngine;
        this.k = thoughtNudgeContract;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r6 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r4.e.d(r0) == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.domain.LogoutUserUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl, boolean z) {
        LogoutUserUseCase$raiseLogoutEvent$1 logoutUserUseCase$raiseLogoutEvent$1;
        Pair[] pairArr;
        String str2;
        String str3;
        AnalyticsContract analyticsContract;
        String str4;
        String str5;
        int i;
        Pair[] pairArr2;
        if (continuationImpl instanceof LogoutUserUseCase$raiseLogoutEvent$1) {
            logoutUserUseCase$raiseLogoutEvent$1 = (LogoutUserUseCase$raiseLogoutEvent$1) continuationImpl;
            int i2 = logoutUserUseCase$raiseLogoutEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutUserUseCase$raiseLogoutEvent$1.label = i2 - Integer.MIN_VALUE;
            } else {
                logoutUserUseCase$raiseLogoutEvent$1 = new LogoutUserUseCase$raiseLogoutEvent$1(this, continuationImpl);
            }
        } else {
            logoutUserUseCase$raiseLogoutEvent$1 = new LogoutUserUseCase$raiseLogoutEvent$1(this, continuationImpl);
        }
        Object obj = logoutUserUseCase$raiseLogoutEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = logoutUserUseCase$raiseLogoutEvent$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            pairArr = new Pair[3];
            logoutUserUseCase$raiseLogoutEvent$1.L$0 = str;
            logoutUserUseCase$raiseLogoutEvent$1.L$1 = pairArr;
            AnalyticsContract analyticsContract2 = this.h;
            logoutUserUseCase$raiseLogoutEvent$1.L$2 = analyticsContract2;
            str2 = "user logged out";
            logoutUserUseCase$raiseLogoutEvent$1.L$3 = "user logged out";
            logoutUserUseCase$raiseLogoutEvent$1.L$4 = "LogoutUserUseCase";
            logoutUserUseCase$raiseLogoutEvent$1.L$5 = pairArr;
            logoutUserUseCase$raiseLogoutEvent$1.L$6 = "userId";
            logoutUserUseCase$raiseLogoutEvent$1.Z$0 = z;
            logoutUserUseCase$raiseLogoutEvent$1.I$0 = 0;
            logoutUserUseCase$raiseLogoutEvent$1.label = 1;
            Object objD = this.d.d(logoutUserUseCase$raiseLogoutEvent$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            str3 = "LogoutUserUseCase";
            analyticsContract = analyticsContract2;
            str4 = "userId";
            obj = objD;
            str5 = str;
            i = 0;
            pairArr2 = pairArr;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = logoutUserUseCase$raiseLogoutEvent$1.I$0;
            z = logoutUserUseCase$raiseLogoutEvent$1.Z$0;
            str4 = (String) logoutUserUseCase$raiseLogoutEvent$1.L$6;
            pairArr = (Pair[]) logoutUserUseCase$raiseLogoutEvent$1.L$5;
            String str6 = (String) logoutUserUseCase$raiseLogoutEvent$1.L$4;
            str2 = (String) logoutUserUseCase$raiseLogoutEvent$1.L$3;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) logoutUserUseCase$raiseLogoutEvent$1.L$2;
            pairArr2 = (Pair[]) logoutUserUseCase$raiseLogoutEvent$1.L$1;
            str5 = (String) logoutUserUseCase$raiseLogoutEvent$1.L$0;
            ResultKt.b(obj);
            str3 = str6;
            analyticsContract = analyticsContract3;
        }
        pairArr[i] = new Pair(str4, String.valueOf(obj));
        pairArr2[1] = new Pair("sessionLogout", String.valueOf(z));
        if (str5 == null) {
            str5 = "";
        }
        pairArr2[2] = new Pair("url", str5);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str3, MapsKt.i(pairArr2), null, false, 24);
        return Unit.f17538a;
    }
}
