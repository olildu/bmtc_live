package app.chalo.livetracking.frameworklivetracking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/KAtomicInteger;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KAtomicInteger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4191a = 0;
    public final MutexImpl b = MutexKt.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        KAtomicInteger$incrementAndGet$1 kAtomicInteger$incrementAndGet$1;
        Mutex mutex;
        if (continuationImpl instanceof KAtomicInteger$incrementAndGet$1) {
            kAtomicInteger$incrementAndGet$1 = (KAtomicInteger$incrementAndGet$1) continuationImpl;
            int i = kAtomicInteger$incrementAndGet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kAtomicInteger$incrementAndGet$1.label = i - Integer.MIN_VALUE;
            } else {
                kAtomicInteger$incrementAndGet$1 = new KAtomicInteger$incrementAndGet$1(this, continuationImpl);
            }
        } else {
            kAtomicInteger$incrementAndGet$1 = new KAtomicInteger$incrementAndGet$1(this, continuationImpl);
        }
        Object obj = kAtomicInteger$incrementAndGet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = kAtomicInteger$incrementAndGet$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.b;
            kAtomicInteger$incrementAndGet$1.L$0 = mutexImpl;
            kAtomicInteger$incrementAndGet$1.label = 1;
            if (mutexImpl.a(kAtomicInteger$incrementAndGet$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) kAtomicInteger$incrementAndGet$1.L$0;
            ResultKt.b(obj);
        }
        try {
            int i3 = this.f4191a + 1;
            this.f4191a = i3;
            return new Integer(i3);
        } finally {
            mutex.e(null);
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof KAtomicInteger);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "KAtomicInteger(initialValue=0)";
    }
}
