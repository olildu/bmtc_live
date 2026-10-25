package app.chalo.onboarding.splash.orchestrator;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/IosSplashOrchestrator;", "Lapp/chalo/onboarding/splash/orchestrator/SplashFlowOrchestrator;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IosSplashOrchestrator implements SplashFlowOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Job f6681a;
    public Deferred b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r8 == r1) goto L31;
     */
    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$1 r0 = (app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$1 r0 = new app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            if (r2 == r6) goto L5a
            if (r2 == r4) goto L56
            r1 = 4
            if (r2 == r3) goto L39
            if (r2 != r1) goto L31
            kotlin.ResultKt.b(r8)
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.ResultKt.b(r8)
            java.util.List r8 = (java.util.List) r8
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r8, r2)
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4c
            goto L81
        L4c:
            app.chalo.constants.Source$Companion r8 = app.chalo.constants.Source.INSTANCE
            app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$2 r8 = new app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator$onAnimationComplete$2
            r8.<init>(r6, r5)
            r0.label = r1
            throw r5
        L56:
            kotlin.ResultKt.b(r8)
            goto L79
        L5a:
            kotlin.ResultKt.b(r8)
            goto L6e
        L5e:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.Job r8 = r7.f6681a
            r0.label = r6
            kotlinx.coroutines.JobSupport r8 = (kotlinx.coroutines.JobSupport) r8
            java.lang.Object r8 = r8.V0(r0)
            if (r8 != r1) goto L6e
            goto L78
        L6e:
            kotlinx.coroutines.Deferred r8 = r7.b
            r0.label = r4
            java.lang.Object r8 = r8.q(r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
        L81:
            app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision$ToMigrationScreen r8 = app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision.ToMigrationScreen.f6688a
            return r8
        L84:
            r0.label = r3
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.splash.orchestrator.IosSplashOrchestrator.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    public final Object b(ContextScope contextScope, ContinuationImpl continuationImpl) {
        IosSplashOrchestrator$onInitialization$1 iosSplashOrchestrator$onInitialization$1;
        if (continuationImpl instanceof IosSplashOrchestrator$onInitialization$1) {
            iosSplashOrchestrator$onInitialization$1 = (IosSplashOrchestrator$onInitialization$1) continuationImpl;
            int i = iosSplashOrchestrator$onInitialization$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iosSplashOrchestrator$onInitialization$1.label = i - Integer.MIN_VALUE;
            } else {
                iosSplashOrchestrator$onInitialization$1 = new IosSplashOrchestrator$onInitialization$1(this, continuationImpl);
            }
        } else {
            iosSplashOrchestrator$onInitialization$1 = new IosSplashOrchestrator$onInitialization$1(this, continuationImpl);
        }
        Object obj = iosSplashOrchestrator$onInitialization$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = iosSplashOrchestrator$onInitialization$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            iosSplashOrchestrator$onInitialization$1.L$0 = contextScope;
            iosSplashOrchestrator$onInitialization$1.label = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoroutineScope coroutineScope = (CoroutineScope) iosSplashOrchestrator$onInitialization$1.L$0;
        ResultKt.b(obj);
        ((JobSupport) this.f6681a).cancel(null);
        this.f6681a = BuildersKt.d(coroutineScope, null, null, new IosSplashOrchestrator$onInitialization$3(this, null), 3);
        return new SplashInitResult.ShowAnimation((IconType) obj);
    }

    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    public final void c(ContextScope scope) {
        Intrinsics.i(scope, "scope");
        ((JobSupport) this.b).cancel(null);
        this.b = BuildersKt.b(scope, null, null, new IosSplashOrchestrator$startEarlyWork$1(this, null), 3);
    }
}
