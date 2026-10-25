package app.chalo.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/utils/ConcurrentMutableMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConcurrentMutableMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10422a = new LinkedHashMap();
    public final MutexImpl b = MutexKt.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ConcurrentMutableMap$clear$1 concurrentMutableMap$clear$1;
        Mutex mutex;
        if (continuationImpl instanceof ConcurrentMutableMap$clear$1) {
            concurrentMutableMap$clear$1 = (ConcurrentMutableMap$clear$1) continuationImpl;
            int i = concurrentMutableMap$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                concurrentMutableMap$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                concurrentMutableMap$clear$1 = new ConcurrentMutableMap$clear$1(this, continuationImpl);
            }
        } else {
            concurrentMutableMap$clear$1 = new ConcurrentMutableMap$clear$1(this, continuationImpl);
        }
        Object obj = concurrentMutableMap$clear$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$clear$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.b;
            concurrentMutableMap$clear$1.L$0 = mutexImpl;
            concurrentMutableMap$clear$1.label = 1;
            if (mutexImpl.a(concurrentMutableMap$clear$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) concurrentMutableMap$clear$1.L$0;
            ResultKt.b(obj);
        }
        try {
            this.f10422a.clear();
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, ContinuationImpl continuationImpl) {
        ConcurrentMutableMap$get$1 concurrentMutableMap$get$1;
        Mutex mutex;
        if (continuationImpl instanceof ConcurrentMutableMap$get$1) {
            concurrentMutableMap$get$1 = (ConcurrentMutableMap$get$1) continuationImpl;
            int i = concurrentMutableMap$get$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                concurrentMutableMap$get$1.label = i - Integer.MIN_VALUE;
            } else {
                concurrentMutableMap$get$1 = new ConcurrentMutableMap$get$1(this, continuationImpl);
            }
        } else {
            concurrentMutableMap$get$1 = new ConcurrentMutableMap$get$1(this, continuationImpl);
        }
        Object obj2 = concurrentMutableMap$get$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$get$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            concurrentMutableMap$get$1.L$0 = obj;
            mutex = this.b;
            concurrentMutableMap$get$1.L$1 = mutex;
            concurrentMutableMap$get$1.label = 1;
            if (mutex.a(concurrentMutableMap$get$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) concurrentMutableMap$get$1.L$1;
            Object obj3 = concurrentMutableMap$get$1.L$0;
            ResultKt.b(obj2);
            mutex = mutex2;
            obj = obj3;
        }
        try {
            return this.f10422a.get(obj);
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Object obj, Object obj2, ContinuationImpl continuationImpl) {
        ConcurrentMutableMap$put$1 concurrentMutableMap$put$1;
        Mutex mutex;
        if (continuationImpl instanceof ConcurrentMutableMap$put$1) {
            concurrentMutableMap$put$1 = (ConcurrentMutableMap$put$1) continuationImpl;
            int i = concurrentMutableMap$put$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                concurrentMutableMap$put$1.label = i - Integer.MIN_VALUE;
            } else {
                concurrentMutableMap$put$1 = new ConcurrentMutableMap$put$1(this, continuationImpl);
            }
        } else {
            concurrentMutableMap$put$1 = new ConcurrentMutableMap$put$1(this, continuationImpl);
        }
        Object obj3 = concurrentMutableMap$put$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$put$1.label;
        if (i2 == 0) {
            ResultKt.b(obj3);
            concurrentMutableMap$put$1.L$0 = obj;
            concurrentMutableMap$put$1.L$1 = obj2;
            mutex = this.b;
            concurrentMutableMap$put$1.L$2 = mutex;
            concurrentMutableMap$put$1.label = 1;
            if (mutex.a(concurrentMutableMap$put$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) concurrentMutableMap$put$1.L$2;
            obj2 = concurrentMutableMap$put$1.L$1;
            Object obj4 = concurrentMutableMap$put$1.L$0;
            ResultKt.b(obj3);
            mutex = mutex2;
            obj = obj4;
        }
        try {
            this.f10422a.put(obj, obj2);
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(Object obj, Unit unit, ContinuationImpl continuationImpl) {
        ConcurrentMutableMap$putIfAbsent$1 concurrentMutableMap$putIfAbsent$1;
        Mutex mutex;
        Object obj2;
        LinkedHashMap linkedHashMap = this.f10422a;
        if (continuationImpl instanceof ConcurrentMutableMap$putIfAbsent$1) {
            concurrentMutableMap$putIfAbsent$1 = (ConcurrentMutableMap$putIfAbsent$1) continuationImpl;
            int i = concurrentMutableMap$putIfAbsent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                concurrentMutableMap$putIfAbsent$1.label = i - Integer.MIN_VALUE;
            } else {
                concurrentMutableMap$putIfAbsent$1 = new ConcurrentMutableMap$putIfAbsent$1(this, continuationImpl);
            }
        } else {
            concurrentMutableMap$putIfAbsent$1 = new ConcurrentMutableMap$putIfAbsent$1(this, continuationImpl);
        }
        Object obj3 = concurrentMutableMap$putIfAbsent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$putIfAbsent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj3);
            concurrentMutableMap$putIfAbsent$1.L$0 = obj;
            concurrentMutableMap$putIfAbsent$1.L$1 = unit;
            mutex = this.b;
            concurrentMutableMap$putIfAbsent$1.L$2 = mutex;
            concurrentMutableMap$putIfAbsent$1.label = 1;
            if (mutex.a(concurrentMutableMap$putIfAbsent$1) == coroutineSingletons) {
                obj2 = unit;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) concurrentMutableMap$putIfAbsent$1.L$2;
            Object obj4 = concurrentMutableMap$putIfAbsent$1.L$1;
            Object obj5 = concurrentMutableMap$putIfAbsent$1.L$0;
            ResultKt.b(obj3);
            mutex = mutex2;
            obj = obj5;
            obj2 = obj4;
        }
        obj2 = unit;
        try {
            Object obj6 = linkedHashMap.get(obj);
            if (obj6 == null) {
                linkedHashMap.put(obj, obj2);
            }
            return obj6;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Object obj, ContinuationImpl continuationImpl) {
        ConcurrentMutableMap$remove$1 concurrentMutableMap$remove$1;
        Mutex mutex;
        if (continuationImpl instanceof ConcurrentMutableMap$remove$1) {
            concurrentMutableMap$remove$1 = (ConcurrentMutableMap$remove$1) continuationImpl;
            int i = concurrentMutableMap$remove$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                concurrentMutableMap$remove$1.label = i - Integer.MIN_VALUE;
            } else {
                concurrentMutableMap$remove$1 = new ConcurrentMutableMap$remove$1(this, continuationImpl);
            }
        } else {
            concurrentMutableMap$remove$1 = new ConcurrentMutableMap$remove$1(this, continuationImpl);
        }
        Object obj2 = concurrentMutableMap$remove$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = concurrentMutableMap$remove$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            concurrentMutableMap$remove$1.L$0 = obj;
            mutex = this.b;
            concurrentMutableMap$remove$1.L$1 = mutex;
            concurrentMutableMap$remove$1.label = 1;
            if (mutex.a(concurrentMutableMap$remove$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) concurrentMutableMap$remove$1.L$1;
            Object obj3 = concurrentMutableMap$remove$1.L$0;
            ResultKt.b(obj2);
            mutex = mutex2;
            obj = obj3;
        }
        try {
            return this.f10422a.remove(obj);
        } finally {
            mutex.e(null);
        }
    }
}
