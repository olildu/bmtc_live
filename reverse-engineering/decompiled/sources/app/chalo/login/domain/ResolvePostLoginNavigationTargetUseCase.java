package app.chalo.login.domain;

import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/ResolvePostLoginNavigationTargetUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolvePostLoginNavigationTargetUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f5246a;
    public final UserProfileDetailsProvider b;
    public final FetchOnboardingMinProfileUpdateConfigUseCase c;
    public final ChaloAppFeatureHelper d;

    public ResolvePostLoginNavigationTargetUseCase(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, FetchOnboardingMinProfileUpdateConfigUseCase fetchOnboardingMinProfileUpdateConfigUseCase, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        this.f5246a = cityProvider;
        this.b = userProfileDetailsProvider;
        this.c = fetchOnboardingMinProfileUpdateConfigUseCase;
        this.d = chaloAppFeatureHelper;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[Catch: CancellationException -> 0x002e, Exception -> 0x009f, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x009f, blocks: (B:13:0x002a, B:43:0x0090, B:45:0x0096, B:47:0x0099, B:20:0x003d, B:36:0x0074, B:38:0x007c, B:40:0x0082, B:23:0x0045, B:29:0x0059, B:31:0x0061, B:33:0x0067, B:26:0x004c), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[Catch: CancellationException -> 0x002e, Exception -> 0x009f, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x009f, blocks: (B:13:0x002a, B:43:0x0090, B:45:0x0096, B:47:0x0099, B:20:0x003d, B:36:0x0074, B:38:0x007c, B:40:0x0082, B:23:0x0045, B:29:0x0059, B:31:0x0061, B:33:0x0067, B:26:0x004c), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r9 == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.constants.Source r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase$resolveOnboardingTarget$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase$resolveOnboardingTarget$1 r0 = (app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase$resolveOnboardingTarget$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase$resolveOnboardingTarget$1 r0 = new app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase$resolveOnboardingTarget$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.ResultKt.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            goto L90
        L2e:
            r8 = move-exception
            goto La2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$0
            app.chalo.constants.Source r8 = (app.chalo.constants.Source) r8
            kotlin.ResultKt.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            goto L74
        L41:
            java.lang.Object r8 = r0.L$0
            app.chalo.constants.Source r8 = (app.chalo.constants.Source) r8
            kotlin.ResultKt.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            goto L59
        L49:
            kotlin.ResultKt.b(r9)
            app.chalo.providers.UserProfileDetailsProvider r9 = r7.b     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r0.label = r6     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            java.lang.Object r9 = app.chalo.providers.UserProfileDetailsProviderKt.a(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r9 != r1) goto L59
            goto L8f
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r9 == 0) goto L67
            app.chalo.data.PostLoginNavigationTarget$CitySelection r8 = new app.chalo.data.PostLoginNavigationTarget$CitySelection     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r8.<init>(r6, r5)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            return r8
        L67:
            app.chalo.helper.ChaloAppFeatureHelper r9 = r7.d     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            java.lang.Object r9 = r9.f(r0)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r9 != r1) goto L74
            goto L8f
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r9 != 0) goto L82
            app.chalo.data.PostLoginNavigationTarget$CitySelection r8 = new app.chalo.data.PostLoginNavigationTarget$CitySelection     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r8.<init>(r5, r6)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            return r8
        L82:
            app.chalo.login.domain.FetchOnboardingMinProfileUpdateConfigUseCase r9 = r7.c     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r2 = 0
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            app.chalo.login.data.models.app.OnboardingMinProfileUpdateRemoteConfigModel r9 = (app.chalo.login.data.models.app.OnboardingMinProfileUpdateRemoteConfigModel) r9     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            boolean r8 = r9.c     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            if (r8 == 0) goto L99
            app.chalo.data.PostLoginNavigationTarget$MinProfileUpdate r8 = app.chalo.data.PostLoginNavigationTarget.MinProfileUpdate.f2374a     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            return r8
        L99:
            app.chalo.data.PostLoginNavigationTarget$CitySelection r8 = new app.chalo.data.PostLoginNavigationTarget$CitySelection     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            r8.<init>(r5, r6)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Exception -> L9f
            return r8
        L9f:
            app.chalo.data.PostLoginNavigationTarget$OnboardingResolutionFailed r8 = app.chalo.data.PostLoginNavigationTarget.OnboardingResolutionFailed.f2375a
            return r8
        La2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase.a(app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
