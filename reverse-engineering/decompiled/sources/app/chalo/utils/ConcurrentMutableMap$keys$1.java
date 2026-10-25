package app.chalo.utils;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.utils.ConcurrentMutableMap", f = "ConcurrentMutableMap.kt", l = {46}, m = UserMetadata.KEYDATA_FILENAME, v = 1)
final class ConcurrentMutableMap$keys$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConcurrentMutableMap<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentMutableMap$keys$1(ConcurrentMutableMap concurrentMutableMap, Continuation continuation) {
        super(continuation);
        this.this$0 = concurrentMutableMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConcurrentMutableMap$keys$1 concurrentMutableMap$keys$1;
        Mutex mutex;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ConcurrentMutableMap<Object, Object> concurrentMutableMap = this.this$0;
        concurrentMutableMap.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            concurrentMutableMap$keys$1 = this;
        } else {
            concurrentMutableMap$keys$1 = new ConcurrentMutableMap$keys$1(concurrentMutableMap, this);
        }
        Object obj2 = concurrentMutableMap$keys$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$keys$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MutexImpl mutexImpl = concurrentMutableMap.b;
            concurrentMutableMap$keys$1.L$0 = mutexImpl;
            concurrentMutableMap$keys$1.label = 1;
            if (mutexImpl.a(concurrentMutableMap$keys$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) concurrentMutableMap$keys$1.L$0;
            ResultKt.b(obj2);
        }
        try {
            return concurrentMutableMap.f10422a.keySet();
        } finally {
            mutex.e(null);
        }
    }
}
