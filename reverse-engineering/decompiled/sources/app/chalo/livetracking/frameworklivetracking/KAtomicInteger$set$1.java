package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.KAtomicInteger", f = "RealTimeSocketManagerImpl.kt", l = {TypedValues.PositionType.TYPE_PERCENT_WIDTH}, m = "set", v = 1)
final class KAtomicInteger$set$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KAtomicInteger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KAtomicInteger$set$1(KAtomicInteger kAtomicInteger, Continuation continuation) {
        super(continuation);
        this.this$0 = kAtomicInteger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KAtomicInteger$set$1 kAtomicInteger$set$1;
        Mutex mutex;
        int i;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        KAtomicInteger kAtomicInteger = this.this$0;
        kAtomicInteger.getClass();
        int i2 = this.label;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.label = i2 - Integer.MIN_VALUE;
            kAtomicInteger$set$1 = this;
        } else {
            kAtomicInteger$set$1 = new KAtomicInteger$set$1(kAtomicInteger, this);
        }
        Object obj2 = kAtomicInteger$set$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = kAtomicInteger$set$1.label;
        if (i3 == 0) {
            ResultKt.b(obj2);
            MutexImpl mutexImpl = kAtomicInteger.b;
            kAtomicInteger$set$1.L$0 = mutexImpl;
            kAtomicInteger$set$1.I$0 = 0;
            kAtomicInteger$set$1.label = 1;
            if (mutexImpl.a(kAtomicInteger$set$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
            i = 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = kAtomicInteger$set$1.I$0;
            mutex = (Mutex) kAtomicInteger$set$1.L$0;
            ResultKt.b(obj2);
        }
        try {
            kAtomicInteger.f4191a = i;
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
