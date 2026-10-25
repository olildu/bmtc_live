package app.chalo.onboarding.splash.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1", f = "SplashScreen.kt", l = {140, 146, 158}, m = "invokeSuspend", v = 1)
final class SplashScreenKt$GenericSplashAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowAlpha;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowTranslationY;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $firstArrowAnimationY;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onAnimationComplete;
    final /* synthetic */ MutableState<Boolean> $readyToAnimate$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $secondAnimationFraction;
    int label;

    /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1", f = "SplashScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowAlpha;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowTranslationY;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $secondAnimationFraction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$1", f = "SplashScreen.kt", l = {148}, m = "invokeSuspend", v = 1)
        final class C01311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01311(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$chaloLogoWithoutArrowAlpha = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01311(this.$chaloLogoWithoutArrowAlpha, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01311) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$chaloLogoWithoutArrowAlpha;
                    Float f = new Float(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tweenSpecTween$default, null, null, this, 12, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f17538a;
            }
        }

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$2", f = "SplashScreen.kt", l = {151}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $chaloLogoWithoutArrowTranslationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$chaloLogoWithoutArrowTranslationY = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.$chaloLogoWithoutArrowTranslationY, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$chaloLogoWithoutArrowTranslationY;
                    Float f = new Float(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tweenSpecTween$default, null, null, this, 12, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f17538a;
            }
        }

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$1$1$1$3", f = "SplashScreen.kt", l = {154}, m = "invokeSuspend", v = 1)
        final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $secondAnimationFraction;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$secondAnimationFraction = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.$secondAnimationFraction, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$secondAnimationFraction;
                    Float f = new Float(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tweenSpecTween$default, null, null, this, 12, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable animatable, Animatable animatable2, Animatable animatable3, Continuation continuation) {
            super(2, continuation);
            this.$chaloLogoWithoutArrowAlpha = animatable;
            this.$chaloLogoWithoutArrowTranslationY = animatable2;
            this.$secondAnimationFraction = animatable3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chaloLogoWithoutArrowAlpha, this.$chaloLogoWithoutArrowTranslationY, this.$secondAnimationFraction, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.d(coroutineScope, null, null, new C01311(this.$chaloLogoWithoutArrowAlpha, null), 3);
            BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.$chaloLogoWithoutArrowTranslationY, null), 3);
            return BuildersKt.d(coroutineScope, null, null, new AnonymousClass3(this.$secondAnimationFraction, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenKt$GenericSplashAnimation$1$1(Animatable animatable, Function1 function1, MutableState mutableState, Animatable animatable2, Animatable animatable3, Animatable animatable4, Continuation continuation) {
        super(2, continuation);
        this.$firstArrowAnimationY = animatable;
        this.$onAnimationComplete = function1;
        this.$readyToAnimate$delegate = mutableState;
        this.$chaloLogoWithoutArrowAlpha = animatable2;
        this.$chaloLogoWithoutArrowTranslationY = animatable3;
        this.$secondAnimationFraction = animatable4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashScreenKt$GenericSplashAnimation$1$1(this.$firstArrowAnimationY, this.$onAnimationComplete, this.$readyToAnimate$delegate, this.$chaloLogoWithoutArrowAlpha, this.$chaloLogoWithoutArrowTranslationY, this.$secondAnimationFraction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashScreenKt$GenericSplashAnimation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1<Continuation<? super Unit>, Object> function1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$readyToAnimate$delegate.getValue().booleanValue()) {
                Animatable<Float, AnimationVector1D> animatable = this.$firstArrowAnimationY;
                Float f = new Float(-200.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(800, 0, null, 6, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, f, tweenSpecTween$default, null, null, this, 12, null) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
        }
        function1 = this.$onAnimationComplete;
        this.label = 3;
        if (function1.invoke(this) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chaloLogoWithoutArrowAlpha, this.$chaloLogoWithoutArrowTranslationY, this.$secondAnimationFraction, null);
        this.label = 2;
        if (CoroutineScopeKt.c(anonymousClass1, this) != coroutineSingletons) {
            function1 = this.$onAnimationComplete;
            this.label = 3;
            if (function1.invoke(this) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
