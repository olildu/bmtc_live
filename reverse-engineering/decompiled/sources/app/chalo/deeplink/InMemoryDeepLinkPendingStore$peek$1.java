package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.deeplink.InMemoryDeepLinkPendingStore", f = "DeepLinkPendingStore.kt", l = {41}, m = "peek", v = 1)
final class InMemoryDeepLinkPendingStore$peek$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InMemoryDeepLinkPendingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryDeepLinkPendingStore$peek$1(InMemoryDeepLinkPendingStore inMemoryDeepLinkPendingStore, Continuation continuation) {
        super(continuation);
        this.this$0 = inMemoryDeepLinkPendingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryDeepLinkPendingStore$peek$1 inMemoryDeepLinkPendingStore$peek$1;
        Mutex mutex;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        InMemoryDeepLinkPendingStore inMemoryDeepLinkPendingStore = this.this$0;
        inMemoryDeepLinkPendingStore.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            inMemoryDeepLinkPendingStore$peek$1 = this;
        } else {
            inMemoryDeepLinkPendingStore$peek$1 = new InMemoryDeepLinkPendingStore$peek$1(inMemoryDeepLinkPendingStore, this);
        }
        Object obj2 = inMemoryDeepLinkPendingStore$peek$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = inMemoryDeepLinkPendingStore$peek$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MutexImpl mutexImpl = inMemoryDeepLinkPendingStore.f2474a;
            inMemoryDeepLinkPendingStore$peek$1.L$0 = mutexImpl;
            inMemoryDeepLinkPendingStore$peek$1.label = 1;
            if (mutexImpl.a(inMemoryDeepLinkPendingStore$peek$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) inMemoryDeepLinkPendingStore$peek$1.L$0;
            ResultKt.b(obj2);
        }
        try {
            return inMemoryDeepLinkPendingStore.b;
        } finally {
            mutex.e(null);
        }
    }
}
