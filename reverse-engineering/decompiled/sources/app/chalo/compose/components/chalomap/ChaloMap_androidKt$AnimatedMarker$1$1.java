package app.chalo.compose.components.chalomap;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.WalletConstants;
import com.google.maps.android.compose.MarkerState;
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
@DebugMetadata(c = "app.chalo.compose.components.chalomap.ChaloMap_androidKt$AnimatedMarker$1$1", f = "ChaloMap.android.kt", l = {WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 1)
final class ChaloMap_androidKt$AnimatedMarker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<LatLng> $animationEndPosition$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<LatLng> $animationStartPosition$delegate;
    final /* synthetic */ ChaloMapMarkerUIState $marker;
    final /* synthetic */ MarkerState $markerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloMap_androidKt$AnimatedMarker$1$1(MarkerState markerState, ChaloMapMarkerUIState chaloMapMarkerUIState, Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$markerState = markerState;
        this.$marker = chaloMapMarkerUIState;
        this.$animationProgress = animatable;
        this.$animationStartPosition$delegate = mutableState;
        this.$animationEndPosition$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloMap_androidKt$AnimatedMarker$1$1(this.$markerState, this.$marker, this.$animationProgress, this.$animationStartPosition$delegate, this.$animationEndPosition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloMap_androidKt$AnimatedMarker$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r12, 12, null) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            goto L72
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            kotlin.ResultKt.b(r13)
            goto L4e
        L1c:
            kotlin.ResultKt.b(r13)
            androidx.compose.runtime.MutableState<com.google.android.gms.maps.model.LatLng> r13 = r12.$animationStartPosition$delegate
            com.google.maps.android.compose.MarkerState r1 = r12.$markerState
            androidx.compose.runtime.MutableState r1 = r1.f14652a
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.maps.model.LatLng r1 = (com.google.android.gms.maps.model.LatLng) r1
            r13.setValue(r1)
            androidx.compose.runtime.MutableState<com.google.android.gms.maps.model.LatLng> r13 = r12.$animationEndPosition$delegate
            app.chalo.compose.components.chalomap.ChaloMapMarkerUIState r1 = r12.$marker
            app.chalo.location.LatLng r1 = r1.getB()
            com.google.android.gms.maps.model.LatLng r1 = r1.b()
            r13.setValue(r1)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Float r1 = new java.lang.Float
            r4 = 0
            r1.<init>(r4)
            r12.label = r2
            java.lang.Object r13 = r13.snapTo(r1, r12)
            if (r13 != r0) goto L4e
            goto L71
        L4e:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
            java.lang.Float r5 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r13)
            androidx.compose.animation.core.Easing r13 = androidx.compose.animation.core.EasingKt.getLinearOutSlowInEasing()
            r1 = 0
            r2 = 1000(0x3e8, float:1.401E-42)
            r6 = 0
            androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r2, r6, r13, r3, r1)
            r12.label = r3
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L72
        L71:
            return r0
        L72:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.compose.components.chalomap.ChaloMap_androidKt$AnimatedMarker$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
