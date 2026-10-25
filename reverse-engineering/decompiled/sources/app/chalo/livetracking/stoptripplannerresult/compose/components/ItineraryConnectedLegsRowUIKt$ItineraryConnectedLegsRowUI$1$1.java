package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.Density;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemUiState;
import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1", f = "ItineraryConnectedLegsRowUI.kt", l = {99}, m = "invokeSuspend", v = 1)
final class ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ float $screenWidth;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ MutableIntState $selectedItemIndex$delegate;
    final /* synthetic */ ItineraryListItemUiState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1(Density density, float f, ItineraryListItemUiState itineraryListItemUiState, ScrollState scrollState, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$localDensity = density;
        this.$screenWidth = f;
        this.$state = itineraryListItemUiState;
        this.$scrollState = scrollState;
        this.$selectedItemIndex$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1(this.$localDensity, this.$screenWidth, this.$state, this.$scrollState, this.$selectedItemIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Density density = this.$localDensity;
            float f = this.$screenWidth;
            ItineraryListItemUiState itineraryListItemUiState = this.$state;
            ScrollState scrollState = this.$scrollState;
            MutableIntState mutableIntState = this.$selectedItemIndex$delegate;
            int intValue = mutableIntState.getIntValue() * ((int) (density.mo404toPx0680j_4(itineraryListItemUiState.b.c) + density.mo404toPx0680j_4(f)));
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, null, 6, null);
            this.label = 1;
            if (scrollState.animateScrollTo(intValue, tweenSpecTween$default, this) == coroutineSingletons) {
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
