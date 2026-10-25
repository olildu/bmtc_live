package app.chalo.login.userprofiling.hookorchestrator;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/userprofiling/hookorchestrator/UserProfilingHooksOrchestratorImpl;", "Lapp/chalo/login/userprofiling/hookorchestrator/UserProfilingHooksOrchestrator;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfilingHooksOrchestratorImpl implements UserProfilingHooksOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f5376a;
    public final UserProfilingHooksRuleEngine b;
    public final CrashlyticsLogger c;
    public final ChaloAppFeatureHelper d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5377a;

        static {
            int[] iArr = new int[UserProfileCompletenessCategory.values().length];
            try {
                iArr[UserProfileCompletenessCategory.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileCompletenessCategory.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserProfileCompletenessCategory.BARE_MINIMUM_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5377a = iArr;
        }
    }

    public UserProfilingHooksOrchestratorImpl(UserProfileDetailsProvider userProfileDetailsProvider, UserProfilingHooksRuleEngine userProfilingHooksRuleEngine, CrashlyticsLogger crashlyticsLogger, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        this.f5376a = userProfileDetailsProvider;
        this.b = userProfilingHooksRuleEngine;
        this.c = crashlyticsLogger;
        this.d = chaloAppFeatureHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r7 == r1) goto L32;
     */
    @Override // app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$isProfileIncompleteForNudges$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$isProfileIncompleteForNudges$1 r0 = (app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$isProfileIncompleteForNudges$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$isProfileIncompleteForNudges$1 r0 = new app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$isProfileIncompleteForNudges$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L5f
        L2b:
            r7 = move-exception
            goto L82
        L2d:
            r7 = move-exception
            goto L8c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L49
        L3b:
            kotlin.ResultKt.b(r7)
            app.chalo.helper.ChaloAppFeatureHelper r7 = r6.d     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.label = r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 != r1) goto L49
            goto L5e
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 != 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r7
        L54:
            app.chalo.providers.UserProfileDetailsProvider r7 = r6.f5376a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.label = r4     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r7 = r7.l(r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            app.chalo.userprofile.UserProfileAppModel r7 = (app.chalo.userprofile.UserProfileAppModel) r7     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 != 0) goto L66
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r7
        L66:
            app.chalo.login.userprofiling.hookorchestrator.UserProfileCompletenessCategory r7 = app.chalo.login.userprofiling.hookorchestrator.UserProfileCompletenessResolver.a(r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            int[] r0 = app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl.WhenMappings.f5377a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            int r7 = r7.ordinal()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r7 = r0[r7]     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 == r5) goto L87
            if (r7 == r4) goto L80
            r0 = 3
            if (r7 != r0) goto L7a
            goto L80
        L7a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r7.<init>()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            throw r7     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
        L80:
            r3 = r5
            goto L87
        L82:
            app.chalo.crashlytics.CrashlyticsLogger r0 = r6.c
            r0.i(r7)
        L87:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r7 == r1) goto L41;
     */
    @Override // app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$resolveEligibility$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$resolveEligibility$1 r0 = (app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$resolveEligibility$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$resolveEligibility$1 r0 = new app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl$resolveEligibility$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L81
        L2a:
            r6 = move-exception
            goto L8c
        L2c:
            r6 = move-exception
            goto L94
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L52
        L3e:
            kotlin.ResultKt.b(r7)
            java.lang.String r6 = r6.getRuleId()
            app.chalo.providers.UserProfileDetailsProvider r7 = r5.f5376a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r7 = r7.l(r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r7 != r1) goto L52
            goto L80
        L52:
            app.chalo.userprofile.UserProfileAppModel r7 = (app.chalo.userprofile.UserProfileAppModel) r7     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r7 != 0) goto L59
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r6
        L59:
            app.chalo.login.userprofiling.hookorchestrator.UserProfileCompletenessCategory r7 = app.chalo.login.userprofiling.hookorchestrator.UserProfileCompletenessResolver.a(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            int[] r2 = app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl.WhenMappings.f5377a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            int r7 = r7.ordinal()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r7 = r2[r7]     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r7 == r4) goto L86
            if (r7 == r3) goto L73
            r2 = 3
            if (r7 != r2) goto L6d
            goto L73
        L6d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r6.<init>()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            throw r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
        L73:
            app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine r7 = r5.b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r7 = r7.a(r6, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            app.chalo.userprofiling.ruleengine.RuleDecision r7 = (app.chalo.userprofiling.ruleengine.RuleDecision) r7     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r6 = r7.b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L87
        L86:
            r6 = 0
        L87:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r6
        L8c:
            app.chalo.crashlytics.CrashlyticsLogger r7 = r5.c
            r7.i(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestratorImpl.b(app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator
    public final Object c(UserProfilingHookSlot userProfilingHookSlot, ContinuationImpl continuationImpl) {
        UserProfilingHooksOrchestratorImpl$onHookDisplayed$1 userProfilingHooksOrchestratorImpl$onHookDisplayed$1;
        if (continuationImpl instanceof UserProfilingHooksOrchestratorImpl$onHookDisplayed$1) {
            userProfilingHooksOrchestratorImpl$onHookDisplayed$1 = (UserProfilingHooksOrchestratorImpl$onHookDisplayed$1) continuationImpl;
            int i = userProfilingHooksOrchestratorImpl$onHookDisplayed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksOrchestratorImpl$onHookDisplayed$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksOrchestratorImpl$onHookDisplayed$1 = new UserProfilingHooksOrchestratorImpl$onHookDisplayed$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksOrchestratorImpl$onHookDisplayed$1 = new UserProfilingHooksOrchestratorImpl$onHookDisplayed$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksOrchestratorImpl$onHookDisplayed$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksOrchestratorImpl$onHookDisplayed$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                UserProfilingHooksRuleEngine userProfilingHooksRuleEngine = this.b;
                String ruleId = userProfilingHookSlot.getRuleId();
                userProfilingHooksOrchestratorImpl$onHookDisplayed$1.label = 1;
                if (userProfilingHooksRuleEngine.d(ruleId, userProfilingHooksOrchestratorImpl$onHookDisplayed$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.c.i(e2);
        }
        return Unit.f17538a;
    }
}
