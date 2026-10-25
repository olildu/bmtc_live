package app.chalo.core.networkinspector;

import app.chalo.network.logging.ChaloInternalNetworkInspector;
import defpackage.im0;
import defpackage.ud;
import defpackage.wi0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.networkinspector.NetworkInspectorComponent$refresh$1", f = "NetworkInspectorComponent.kt", l = {118}, m = "invokeSuspend", v = 1)
final class NetworkInspectorComponent$refresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NetworkInspectorComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInspectorComponent$refresh$1(NetworkInspectorComponent networkInspectorComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = networkInspectorComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NetworkInspectorComponent$refresh$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkInspectorComponent$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                this.this$0.E0(new im0(18));
                ChaloInternalNetworkInspector chaloInternalNetworkInspector = this.this$0.l;
                this.label = 1;
                obj = chaloInternalNetworkInspector.b();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.this$0.E0(new ud(CollectionsKt.v0(new NetworkInspectorComponent$refresh$1$invokeSuspend$$inlined$sortedByDescending$1(), (Iterable) obj), 11));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.E0(new wi0(e2, 28));
        }
        return Unit.f17538a;
    }
}
