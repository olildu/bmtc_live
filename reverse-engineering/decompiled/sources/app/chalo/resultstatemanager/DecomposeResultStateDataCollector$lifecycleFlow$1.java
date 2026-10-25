package app.chalo.resultstatemanager;

import com.arkivanov.essenty.lifecycle.Lifecycle;
import defpackage.ti;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.resultstatemanager.DecomposeResultStateDataCollector$lifecycleFlow$1", f = "ResultStateDataCollector.kt", l = {100}, m = "invokeSuspend", v = 1)
final class DecomposeResultStateDataCollector$lifecycleFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DecomposeResultStateDataCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecomposeResultStateDataCollector$lifecycleFlow$1(DecomposeResultStateDataCollector decomposeResultStateDataCollector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = decomposeResultStateDataCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DecomposeResultStateDataCollector$lifecycleFlow$1 decomposeResultStateDataCollector$lifecycleFlow$1 = new DecomposeResultStateDataCollector$lifecycleFlow$1(this.this$0, continuation);
        decomposeResultStateDataCollector$lifecycleFlow$1.L$0 = obj;
        return decomposeResultStateDataCollector$lifecycleFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DecomposeResultStateDataCollector$lifecycleFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            if (this.this$0.f9033a.getB().compareTo(Lifecycle.State.STARTED) >= 0) {
                producerScope.mo7576trySendJP2dKIU(Boolean.TRUE);
            }
            Lifecycle.Callbacks callbacks = new Lifecycle.Callbacks() { // from class: app.chalo.resultstatemanager.DecomposeResultStateDataCollector$lifecycleFlow$1$callback$1
                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onStart() {
                    producerScope.mo7576trySendJP2dKIU(Boolean.TRUE);
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onStop() {
                    producerScope.mo7576trySendJP2dKIU(Boolean.FALSE);
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final /* bridge */ void onCreate() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final /* bridge */ void onDestroy() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final /* bridge */ void onPause() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final /* bridge */ void onResume() {
                }
            };
            this.this$0.f9033a.b(callbacks);
            ti tiVar = new ti(26, this.this$0, callbacks);
            this.label = 1;
            if (ProduceKt.a(producerScope, tiVar, this) == coroutineSingletons) {
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
