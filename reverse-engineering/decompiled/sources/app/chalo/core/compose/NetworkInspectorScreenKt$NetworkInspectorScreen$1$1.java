package app.chalo.core.compose;

import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorSideEffect;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.compose.NetworkInspectorScreenKt$NetworkInspectorScreen$1$1", f = "NetworkInspectorScreen.kt", l = {51}, m = "invokeSuspend", v = 1)
final class NetworkInspectorScreenKt$NetworkInspectorScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClipboardManager $clipboardManager;
    final /* synthetic */ NetworkInspectorComponent $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInspectorScreenKt$NetworkInspectorScreen$1$1(NetworkInspectorComponent networkInspectorComponent, ClipboardManager clipboardManager, Continuation continuation) {
        super(2, continuation);
        this.$component = networkInspectorComponent;
        this.$clipboardManager = clipboardManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NetworkInspectorScreenKt$NetworkInspectorScreen$1$1(this.$component, this.$clipboardManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkInspectorScreenKt$NetworkInspectorScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final ClipboardManager clipboardManager = this.$clipboardManager;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.core.compose.NetworkInspectorScreenKt$NetworkInspectorScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    NetworkInspectorSideEffect networkInspectorSideEffect = (NetworkInspectorSideEffect) obj2;
                    if (!(networkInspectorSideEffect instanceof NetworkInspectorSideEffect.CopyCurl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clipboardManager.setText(new AnnotatedString(((NetworkInspectorSideEffect.CopyCurl) networkInspectorSideEffect).f2304a, null, 2, null));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
