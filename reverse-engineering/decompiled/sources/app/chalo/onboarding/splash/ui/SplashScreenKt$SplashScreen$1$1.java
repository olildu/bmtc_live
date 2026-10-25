package app.chalo.onboarding.splash.ui;

import app.chalo.onboarding.splash.SplashScreenComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$SplashScreen$1$1", f = "SplashScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class SplashScreenKt$SplashScreen$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ SplashScreenComponent $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenKt$SplashScreen$1$1(SplashScreenComponent splashScreenComponent, Continuation continuation) {
        super(1, continuation);
        this.$component = splashScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SplashScreenKt$SplashScreen$1$1(this.$component, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SplashScreenKt$SplashScreen$1$1 splashScreenKt$SplashScreen$1$1 = (SplashScreenKt$SplashScreen$1$1) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        splashScreenKt$SplashScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.$component.G0(SplashScreenIntent.ProceedToApp.f6693a);
        return Unit.f17538a;
    }
}
