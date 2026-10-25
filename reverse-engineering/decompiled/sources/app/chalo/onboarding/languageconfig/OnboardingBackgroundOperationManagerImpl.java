package app.chalo.onboarding.languageconfig;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/onboarding/languageconfig/OnboardingBackgroundOperationManagerImpl;", "Lapp/chalo/onboarding/languageconfig/OnboardingBackgroundOperationManager;", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnboardingBackgroundOperationManagerImpl implements OnboardingBackgroundOperationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LanguageFeature f6638a;
    public final ChaloConfigFeature b;
    public final ContextScope c;
    public final MutableStateFlow d = StateFlowKt.a(RemoteConfigRunState.NotStarted.f6641a);
    public final MutexImpl e = MutexKt.a();
    public Job f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/onboarding/languageconfig/OnboardingBackgroundOperationManagerImpl$Companion;", "", "", "CONFIG_FETCH_STARTED_TIMEOUT_MS", "J", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public OnboardingBackgroundOperationManagerImpl(LanguageFeature languageFeature, ChaloConfigFeature chaloConfigFeature, CoroutineContextProvider coroutineContextProvider) {
        this.f6638a = languageFeature;
        this.b = chaloConfigFeature;
        this.c = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.b()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager
    public final Enum a(ContinuationImpl continuationImpl) {
        OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1 onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1;
        if (continuationImpl instanceof OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1) {
            onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1 = (OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1) continuationImpl;
            int i = onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1 = new OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1(this, continuationImpl);
            }
        } else {
            onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1 = new OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1(this, continuationImpl);
        }
        Object objC = onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$2 onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$2 = new OnboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$2(this, null);
            onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1.label = 1;
            objC = TimeoutKt.c(200L, onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$2, onboardingBackgroundOperationManagerImpl$checkRemoteConfigCacheStatus$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloConfigCacheStatus chaloConfigCacheStatus = (ChaloConfigCacheStatus) objC;
        return chaloConfigCacheStatus == null ? (ChaloConfigCacheStatus) this.b.c().getValue() : chaloConfigCacheStatus;
    }

    @Override // app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager
    public final Object b(ContinuationImpl continuationImpl) {
        return FlowKt.u(this.d, new OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2(2, null), continuationImpl);
    }

    @Override // app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager
    public final RemoteConfigRunState c() {
        return (RemoteConfigRunState) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r5.f(r0) == r1) goto L28;
     */
    @Override // app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.features.language.data.Language r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$setLanguage$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$setLanguage$1 r0 = (app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$setLanguage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$setLanguage$1 r0 = new app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$setLanguage$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            app.chalo.features.language.LanguageFeature r5 = r7.f6638a
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r9)
            goto L69
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.b(r9)
            goto L60
        L3b:
            kotlin.ResultKt.b(r9)
            goto L57
        L3f:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.flow.StateFlow r9 = r5.getE()
            java.lang.Object r9 = r9.getValue()
            app.chalo.features.language.data.Language r9 = (app.chalo.features.language.data.Language) r9
            if (r9 == r8) goto L57
            r0.label = r6
            java.lang.Object r8 = r5.c(r8, r0)
            if (r8 != r1) goto L57
            goto L68
        L57:
            r0.label = r4
            java.lang.Object r8 = r5.g(r0)
            if (r8 != r1) goto L60
            goto L68
        L60:
            r0.label = r3
            java.lang.Object r8 = r5.f(r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl.d(app.chalo.features.language.data.Language, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:35:0x007c, B:37:0x0084, B:39:0x0088, B:42:0x0091), top: B:48:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (kotlinx.coroutines.JobKt.d(r3, r1) == r2) goto L31;
     */
    @Override // app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlinx.coroutines.flow.MutableStateFlow r0 = r8.d
            boolean r1 = r10 instanceof app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$1
            if (r1 == 0) goto L15
            r1 = r10
            app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$1 r1 = (app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$1 r1 = new app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$1
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L49
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L36
            boolean r9 = r1.Z$0
            java.lang.Object r1 = r1.L$0
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L33
            goto L7c
        L33:
            r9 = move-exception
            goto Lab
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            boolean r9 = r1.Z$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.b(r10)
            r10 = r3
            goto L5b
        L49:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.sync.MutexImpl r10 = r8.e
            r1.L$0 = r10
            r1.Z$0 = r9
            r1.label = r5
            java.lang.Object r3 = r10.a(r1)
            if (r3 != r2) goto L5b
            goto L77
        L5b:
            kotlinx.coroutines.Job r3 = r8.f     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7b
            r7 = r3
            kotlinx.coroutines.AbstractCoroutine r7 = (kotlinx.coroutines.AbstractCoroutine) r7     // Catch: java.lang.Throwable -> L78
            boolean r7 = r7.isActive()     // Catch: java.lang.Throwable -> L78
            if (r7 != r5) goto L7b
            if (r9 != 0) goto L6b
            goto La5
        L6b:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> L78
            r1.Z$0 = r9     // Catch: java.lang.Throwable -> L78
            r1.label = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = kotlinx.coroutines.JobKt.d(r3, r1)     // Catch: java.lang.Throwable -> L78
            if (r1 != r2) goto L7b
        L77:
            return r2
        L78:
            r9 = move-exception
            r1 = r10
            goto Lab
        L7b:
            r1 = r10
        L7c:
            java.lang.Object r10 = r0.getValue()     // Catch: java.lang.Throwable -> L33
            app.chalo.onboarding.languageconfig.RemoteConfigRunState r10 = (app.chalo.onboarding.languageconfig.RemoteConfigRunState) r10     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L91
            boolean r9 = r10 instanceof app.chalo.onboarding.languageconfig.RemoteConfigRunState.Terminal     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L91
            app.chalo.onboarding.languageconfig.RemoteConfigRunState$Terminal r10 = (app.chalo.onboarding.languageconfig.RemoteConfigRunState.Terminal) r10     // Catch: java.lang.Throwable -> L33
            app.chalo.features.chaloconfig.ChaloConfigFetchStatus r9 = r10.b     // Catch: java.lang.Throwable -> L33
            app.chalo.features.chaloconfig.ChaloConfigFetchStatus r10 = app.chalo.features.chaloconfig.ChaloConfigFetchStatus.FETCH_SUCCESSFUL     // Catch: java.lang.Throwable -> L33
            if (r9 != r10) goto L91
            goto La4
        L91:
            app.chalo.onboarding.languageconfig.RemoteConfigRunState$InProgress r9 = app.chalo.onboarding.languageconfig.RemoteConfigRunState.InProgress.f6639a     // Catch: java.lang.Throwable -> L33
            r0.setValue(r9)     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.internal.ContextScope r9 = r8.c     // Catch: java.lang.Throwable -> L33
            app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$2$1 r10 = new app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$fetchRemoteConfigIfNeeded$2$1     // Catch: java.lang.Throwable -> L33
            r10.<init>(r8, r6)     // Catch: java.lang.Throwable -> L33
            r0 = 3
            kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.d(r9, r6, r6, r10, r0)     // Catch: java.lang.Throwable -> L33
            r8.f = r9     // Catch: java.lang.Throwable -> L33
        La4:
            r10 = r1
        La5:
            r10.e(r6)
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        Lab:
            r1.e(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl.e(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
