package app.chalo.onboarding.splash.orchestrator;

import app.chalo.constants.Source;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/AndroidSplashOrchestrator;", "Lapp/chalo/onboarding/splash/orchestrator/SplashFlowOrchestrator;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSplashOrchestrator implements SplashFlowOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplashOperations f6680a;
    public final MandatoryFirstHistoryCallGuard b;
    public Job c;

    public AndroidSplashOrchestrator(SplashOperations splashOperations, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard) {
        this.f6680a = splashOperations;
        this.b = mandatoryFirstHistoryCallGuard;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    public final Object a(ContinuationImpl continuationImpl) {
        AndroidSplashOrchestrator$onAnimationComplete$1 androidSplashOrchestrator$onAnimationComplete$1;
        if (continuationImpl instanceof AndroidSplashOrchestrator$onAnimationComplete$1) {
            androidSplashOrchestrator$onAnimationComplete$1 = (AndroidSplashOrchestrator$onAnimationComplete$1) continuationImpl;
            int i = androidSplashOrchestrator$onAnimationComplete$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidSplashOrchestrator$onAnimationComplete$1.label = i - Integer.MIN_VALUE;
            } else {
                androidSplashOrchestrator$onAnimationComplete$1 = new AndroidSplashOrchestrator$onAnimationComplete$1(this, continuationImpl);
            }
        } else {
            androidSplashOrchestrator$onAnimationComplete$1 = new AndroidSplashOrchestrator$onAnimationComplete$1(this, continuationImpl);
        }
        Object obj = androidSplashOrchestrator$onAnimationComplete$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidSplashOrchestrator$onAnimationComplete$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Job job = this.c;
            if (job != null) {
                androidSplashOrchestrator$onAnimationComplete$1.label = 1;
                if (((JobSupport) job).V0(androidSplashOrchestrator$onAnimationComplete$1) != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Source source = Source.SPLASH_SCREEN;
        AndroidSplashOrchestrator$onAnimationComplete$2 androidSplashOrchestrator$onAnimationComplete$2 = new AndroidSplashOrchestrator$onAnimationComplete$2(1, this.b, MandatoryFirstHistoryCallGuard.class, "requireMandatoryHistoryCall", "requireMandatoryHistoryCall(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        androidSplashOrchestrator$onAnimationComplete$1.label = 2;
        Object objC = this.f6680a.c(source, androidSplashOrchestrator$onAnimationComplete$2, androidSplashOrchestrator$onAnimationComplete$1);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    public final Object b(ContextScope contextScope, ContinuationImpl continuationImpl) {
        AndroidSplashOrchestrator$onInitialization$1 androidSplashOrchestrator$onInitialization$1;
        CoroutineScope coroutineScope;
        if (continuationImpl instanceof AndroidSplashOrchestrator$onInitialization$1) {
            androidSplashOrchestrator$onInitialization$1 = (AndroidSplashOrchestrator$onInitialization$1) continuationImpl;
            int i = androidSplashOrchestrator$onInitialization$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidSplashOrchestrator$onInitialization$1.label = i - Integer.MIN_VALUE;
            } else {
                androidSplashOrchestrator$onInitialization$1 = new AndroidSplashOrchestrator$onInitialization$1(this, continuationImpl);
            }
        } else {
            androidSplashOrchestrator$onInitialization$1 = new AndroidSplashOrchestrator$onInitialization$1(this, continuationImpl);
        }
        Object objE = androidSplashOrchestrator$onInitialization$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidSplashOrchestrator$onInitialization$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            androidSplashOrchestrator$onInitialization$1.L$0 = contextScope;
            androidSplashOrchestrator$onInitialization$1.label = 1;
            objE = this.f6680a.e(androidSplashOrchestrator$onInitialization$1);
            if (objE == obj) {
                coroutineScope = contextScope;
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) androidSplashOrchestrator$onInitialization$1.L$0;
            ResultKt.b(objE);
            coroutineScope = coroutineScope2;
        }
        coroutineScope = contextScope;
        IconType iconType = (IconType) objE;
        Job job = this.c;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.c = BuildersKt.d(coroutineScope, null, null, new AndroidSplashOrchestrator$onInitialization$2(this, null), 3);
        return new SplashInitResult.ShowAnimation(iconType);
    }

    @Override // app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator
    public final void c(ContextScope scope) {
        Intrinsics.i(scope, "scope");
    }
}
