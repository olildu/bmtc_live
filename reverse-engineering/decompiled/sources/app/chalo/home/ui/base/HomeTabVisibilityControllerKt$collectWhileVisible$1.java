package app.chalo.home.ui.base;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeTabVisibilityControllerKt$collectWhileVisible$1", f = "HomeTabVisibilityController.kt", l = {52}, m = "invokeSuspend", v = 1)
final class HomeTabVisibilityControllerKt$collectWhileVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object, Continuation<? super Unit>, Object> $collector;
    final /* synthetic */ BottomNavTabType $tabType;
    final /* synthetic */ Flow<Object> $this_collectWhileVisible;
    final /* synthetic */ HomeTabVisibilityController $visibilityController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabVisibilityControllerKt$collectWhileVisible$1(HomeTabVisibilityController homeTabVisibilityController, BottomNavTabType bottomNavTabType, Function2 function2, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$visibilityController = homeTabVisibilityController;
        this.$tabType = bottomNavTabType;
        this.$collector = function2;
        this.$this_collectWhileVisible = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeTabVisibilityControllerKt$collectWhileVisible$1(this.$visibilityController, this.$tabType, this.$collector, this.$this_collectWhileVisible, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeTabVisibilityControllerKt$collectWhileVisible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestH = FlowKt.H(this.$visibilityController.a(this.$tabType), new HomeTabVisibilityControllerKt$collectWhileVisible$1$invokeSuspend$$inlined$flatMapLatest$1(this.$this_collectWhileVisible, null));
            HomeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0 homeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0 = new HomeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0(this.$collector);
            this.label = 1;
            if (channelFlowTransformLatestH.collect(homeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0, this) == coroutineSingletons) {
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
