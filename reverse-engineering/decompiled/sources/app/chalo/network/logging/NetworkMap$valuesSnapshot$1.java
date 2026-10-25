package app.chalo.network.logging;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.logging.NetworkMap", f = "BaseInternalNetworkInspectorImpl.kt", l = {ComposerKt.providerMapsKey}, m = "valuesSnapshot", v = 1)
final class NetworkMap$valuesSnapshot$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMap$valuesSnapshot$1(NetworkMap networkMap, Continuation continuation) {
        super(continuation);
        this.this$0 = networkMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetworkMap$valuesSnapshot$1 networkMap$valuesSnapshot$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        NetworkMap networkMap = this.this$0;
        networkMap.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            networkMap$valuesSnapshot$1 = this;
        } else {
            networkMap$valuesSnapshot$1 = new NetworkMap$valuesSnapshot$1(networkMap, this);
        }
        Object obj2 = networkMap$valuesSnapshot$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = networkMap$valuesSnapshot$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            networkMap$valuesSnapshot$1.L$0 = null;
            networkMap$valuesSnapshot$1.label = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Mutex mutex = (Mutex) networkMap$valuesSnapshot$1.L$0;
        ResultKt.b(obj2);
        try {
            throw null;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }
}
