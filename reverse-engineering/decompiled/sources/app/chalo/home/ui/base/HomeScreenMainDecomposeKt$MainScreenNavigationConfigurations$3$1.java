package app.chalo.home.ui.base;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1", f = "HomeScreenMainDecompose.kt", l = {}, m = "invokeSuspend", v = 1)
final class HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableTransitionState<Boolean> $drawerTransitionState;
    final /* synthetic */ MutableState<HomeScreenDrawerChild> $renderedDrawerChild$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1(MutableTransitionState mutableTransitionState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$drawerTransitionState = mutableTransitionState;
        this.$renderedDrawerChild$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1(this.$drawerTransitionState, this.$renderedDrawerChild$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1 homeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1 = (HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        homeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!this.$drawerTransitionState.getTargetState().booleanValue() && this.$drawerTransitionState.isIdle()) {
            this.$renderedDrawerChild$delegate.setValue(null);
        }
        return Unit.f17538a;
    }
}
