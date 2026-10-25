package app.chalo.onboarding.cityselection.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionContent$1$1", f = "CitySelectionScreen.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
final class CitySelectionScreenKt$CitySelectionContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<Float> $headerOffset$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $headerOffsetAnimatable;
    final /* synthetic */ float $minHeaderHeightPx;
    final /* synthetic */ CitySelectionUIState $state;
    final /* synthetic */ MutableState<Dp> $toolbarHeaderHeight$delegate;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySelectionScreenKt$CitySelectionContent$1$1(CitySelectionUIState citySelectionUIState, Density density, float f, Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$state = citySelectionUIState;
        this.$density = density;
        this.$minHeaderHeightPx = f;
        this.$headerOffsetAnimatable = animatable;
        this.$toolbarHeaderHeight$delegate = mutableState;
        this.$headerOffset$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CitySelectionScreenKt$CitySelectionContent$1$1(this.$state, this.$density, this.$minHeaderHeightPx, this.$headerOffsetAnimatable, this.$toolbarHeaderHeight$delegate, this.$headerOffset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySelectionScreenKt$CitySelectionContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, null, r7, r11, 4, null) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r12)
            goto L89
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            float r1 = r11.F$0
            kotlin.ResultKt.b(r12)
            goto L64
        L1f:
            kotlin.ResultKt.b(r12)
            app.chalo.onboarding.cityselection.ui.CitySelectionUIState r12 = r11.$state
            app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState r12 = r12.f
            boolean r12 = app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt.i(r12)
            if (r12 == 0) goto L44
            androidx.compose.ui.unit.Density r12 = r11.$density
            androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> r1 = r11.$toolbarHeaderHeight$delegate
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1
            float r1 = r1.m7292unboximpl()
            float r12 = r12.mo404toPx0680j_4(r1)
            float r1 = r11.$minHeaderHeightPx
            float r12 = r12 - r1
            float r12 = -r12
        L42:
            r1 = r12
            goto L46
        L44:
            r12 = 0
            goto L42
        L46:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.$headerOffsetAnimatable
            androidx.compose.runtime.MutableState<java.lang.Float> r4 = r11.$headerOffset$delegate
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            r11.F$0 = r1
            r11.label = r3
            java.lang.Object r12 = r12.snapTo(r5, r11)
            if (r12 != r0) goto L64
            goto L88
        L64:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r3 = r11.$headerOffsetAnimatable
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            r12 = 0
            r1 = 6
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 0
            androidx.compose.animation.core.TweenSpec r5 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r12, r6, r1, r6)
            androidx.compose.runtime.MutableState<java.lang.Float> r12 = r11.$headerOffset$delegate
            g5 r7 = new g5
            r1 = 15
            r7.<init>(r12, r1)
            r11.label = r2
            r9 = 4
            r10 = 0
            r8 = r11
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
