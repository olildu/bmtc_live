package app.chalo.onboarding.splash.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
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
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1", f = "SplashScreen.kt", l = {246, 266}, m = "invokeSuspend", v = 1)
final class SplashScreenKt$KSRTCSplashAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Offset> $arrowPosition$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowRotation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowScale;
    final /* synthetic */ MutableState<IntSize> $arrowSize$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationX;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationY;
    final /* synthetic */ MutableState<Offset> $boxPosition$delegate;
    final /* synthetic */ MutableState<IntSize> $boxSize$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $ksrtcLayoutAlpha;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onAnimationComplete;
    final /* synthetic */ MutableState<Boolean> $readyToAnimate$delegate;
    int label;

    /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1", f = "SplashScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowRotation;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowScale;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationX;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationY;
        final /* synthetic */ float $finalX;
        final /* synthetic */ float $finalY;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $ksrtcLayoutAlpha;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$1", f = "SplashScreen.kt", l = {248}, m = "invokeSuspend", v = 1)
        final class C01321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationX;
            final /* synthetic */ float $finalX;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01321(Animatable animatable, float f, Continuation continuation) {
                super(2, continuation);
                this.$arrowTranslationX = animatable;
                this.$finalX = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01321(this.$arrowTranslationX, this.$finalX, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01321) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$arrowTranslationX;
                    Float f = new Float(this.$finalX);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
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

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$2", f = "SplashScreen.kt", l = {251}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowTranslationY;
            final /* synthetic */ float $finalY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable animatable, float f, Continuation continuation) {
                super(2, continuation);
                this.$arrowTranslationY = animatable;
                this.$finalY = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.$arrowTranslationY, this.$finalY, continuation);
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
                    Animatable<Float, AnimationVector1D> animatable = this.$arrowTranslationY;
                    Float f = new Float(this.$finalY);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
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

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$3", f = "SplashScreen.kt", l = {254}, m = "invokeSuspend", v = 1)
        final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowScale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$arrowScale = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.$arrowScale, continuation);
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
                    Animatable<Float, AnimationVector1D> animatable = this.$arrowScale;
                    Float f = new Float(0.4f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
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

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$4", f = "SplashScreen.kt", l = {257}, m = "invokeSuspend", v = 1)
        final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $arrowRotation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$arrowRotation = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.$arrowRotation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$arrowRotation;
                    Float f = new Float(45.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
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

        /* JADX INFO: renamed from: app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.onboarding.splash.ui.SplashScreenKt$KSRTCSplashAnimation$1$1$1$5", f = "SplashScreen.kt", l = {260}, m = "invokeSuspend", v = 1)
        final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $ksrtcLayoutAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.$ksrtcLayoutAlpha = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.$ksrtcLayoutAlpha, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$ksrtcLayoutAlpha;
                    Float f = new Float(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(800, 200, null, 4, null);
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
        public AnonymousClass1(Animatable animatable, float f, Animatable animatable2, float f2, Animatable animatable3, Animatable animatable4, Animatable animatable5, Continuation continuation) {
            super(2, continuation);
            this.$arrowTranslationX = animatable;
            this.$finalX = f;
            this.$arrowTranslationY = animatable2;
            this.$finalY = f2;
            this.$arrowScale = animatable3;
            this.$arrowRotation = animatable4;
            this.$ksrtcLayoutAlpha = animatable5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrowTranslationX, this.$finalX, this.$arrowTranslationY, this.$finalY, this.$arrowScale, this.$arrowRotation, this.$ksrtcLayoutAlpha, continuation);
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
            BuildersKt.d(coroutineScope, null, null, new C01321(this.$arrowTranslationX, this.$finalX, null), 3);
            BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.$arrowTranslationY, this.$finalY, null), 3);
            BuildersKt.d(coroutineScope, null, null, new AnonymousClass3(this.$arrowScale, null), 3);
            BuildersKt.d(coroutineScope, null, null, new AnonymousClass4(this.$arrowRotation, null), 3);
            return BuildersKt.d(coroutineScope, null, null, new AnonymousClass5(this.$ksrtcLayoutAlpha, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenKt$KSRTCSplashAnimation$1$1(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Animatable animatable, Animatable animatable2, Animatable animatable3, Animatable animatable4, Animatable animatable5, Continuation continuation) {
        super(2, continuation);
        this.$onAnimationComplete = function1;
        this.$readyToAnimate$delegate = mutableState;
        this.$boxPosition$delegate = mutableState2;
        this.$boxSize$delegate = mutableState3;
        this.$arrowSize$delegate = mutableState4;
        this.$arrowPosition$delegate = mutableState5;
        this.$arrowTranslationX = animatable;
        this.$arrowTranslationY = animatable2;
        this.$arrowScale = animatable3;
        this.$arrowRotation = animatable4;
        this.$ksrtcLayoutAlpha = animatable5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashScreenKt$KSRTCSplashAnimation$1$1(this.$onAnimationComplete, this.$readyToAnimate$delegate, this.$boxPosition$delegate, this.$boxSize$delegate, this.$arrowSize$delegate, this.$arrowPosition$delegate, this.$arrowTranslationX, this.$arrowTranslationY, this.$arrowScale, this.$arrowRotation, this.$ksrtcLayoutAlpha, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashScreenKt$KSRTCSplashAnimation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$readyToAnimate$delegate.getValue().booleanValue()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrowTranslationX, ((Float.intBitsToFloat((int) (this.$boxPosition$delegate.getValue().m4375unboximpl() >> 32)) + ((int) (this.$boxSize$delegate.getValue().m7449unboximpl() >> 32))) - (((int) (this.$arrowSize$delegate.getValue().m7449unboximpl() >> 32)) / 1.7f)) - Float.intBitsToFloat((int) (this.$arrowPosition$delegate.getValue().m4375unboximpl() >> 32)), this.$arrowTranslationY, (Float.intBitsToFloat((int) (this.$boxPosition$delegate.getValue().m4375unboximpl() & BodyPartID.bodyIdMax)) - (((int) (this.$arrowSize$delegate.getValue().m7449unboximpl() & BodyPartID.bodyIdMax)) / 2.5f)) - Float.intBitsToFloat((int) (this.$arrowPosition$delegate.getValue().m4375unboximpl() & BodyPartID.bodyIdMax)), this.$arrowScale, this.$arrowRotation, this.$ksrtcLayoutAlpha, null);
                this.label = 1;
                if (CoroutineScopeKt.c(anonymousClass1, this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Function1<Continuation<? super Unit>, Object> function1 = this.$onAnimationComplete;
        this.label = 2;
        return function1.invoke(this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
