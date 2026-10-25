package app.chalo.home.ui.chalobus;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1", f = "ChaloBusScreenHeaderLayout.kt", l = {245, 246}, m = "invokeSuspend", v = 1)
final class ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatable;
    final /* synthetic */ float $end;
    final /* synthetic */ float $start;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1(Animatable animatable, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.$start = f;
        this.$end = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1(this.$animatable, this.$start, this.$end, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r12, 12, null) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.b(r13)
            goto L55
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            kotlin.ResultKt.b(r13)
            goto L31
        L1c:
            kotlin.ResultKt.b(r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animatable
            float r1 = r12.$start
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            r12.label = r2
            java.lang.Object r13 = r13.snapTo(r4, r12)
            if (r13 != r0) goto L31
            goto L54
        L31:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animatable
            float r13 = r12.$end
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r13)
            androidx.compose.animation.core.Easing r13 = androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing()
            r1 = 0
            r2 = 1200(0x4b0, float:1.682E-42)
            r6 = 0
            androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r6, r13, r3, r1)
            r12.label = r3
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt$AnimatedSavingsAmountText$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
