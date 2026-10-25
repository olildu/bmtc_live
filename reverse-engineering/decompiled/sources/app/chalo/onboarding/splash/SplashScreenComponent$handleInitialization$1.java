package app.chalo.onboarding.splash;

import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashInitResult;
import app.chalo.onboarding.splash.ui.SplashScreenIntent;
import defpackage.h81;
import defpackage.l91;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.splash.SplashScreenComponent$handleInitialization$1", f = "SplashScreenComponent.kt", l = {85, 88}, m = "invokeSuspend", v = 1)
final class SplashScreenComponent$handleInitialization$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SplashScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenComponent$handleInitialization$1(SplashScreenComponent splashScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = splashScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashScreenComponent$handleInitialization$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashScreenComponent$handleInitialization$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SplashInitResult splashInitResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SplashScreenComponent splashScreenComponent = this.this$0;
            SplashFlowOrchestrator splashFlowOrchestrator = splashScreenComponent.l;
            ContextScope contextScope = splashScreenComponent.j;
            this.label = 1;
            obj = splashFlowOrchestrator.b(contextScope, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            splashInitResult = (SplashInitResult) this.L$0;
            ResultKt.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.E0(new h81(29));
            this.this$0.G0(SplashScreenIntent.ProceedToApp.f6693a);
        } else {
            this.this$0.E0(new l91(splashInitResult, 9));
        }
        return Unit.f17538a;
        SplashInitResult splashInitResult2 = (SplashInitResult) obj;
        if (!(splashInitResult2 instanceof SplashInitResult.ShowAnimation)) {
            throw new NoWhenBranchMatchedException();
        }
        ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.o;
        this.L$0 = splashInitResult2;
        this.label = 2;
        Object objN = chaloAppFeatureHelper.n(this);
        if (objN != coroutineSingletons) {
            splashInitResult = splashInitResult2;
            obj = objN;
            if (((Boolean) obj).booleanValue()) {
                this.this$0.E0(new h81(29));
                this.this$0.G0(SplashScreenIntent.ProceedToApp.f6693a);
            } else {
                this.this$0.E0(new l91(splashInitResult, 9));
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
