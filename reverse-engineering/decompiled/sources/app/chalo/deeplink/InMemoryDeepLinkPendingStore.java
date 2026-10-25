package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/InMemoryDeepLinkPendingStore;", "Lapp/chalo/deeplink/DeepLinkPendingStore;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InMemoryDeepLinkPendingStore implements DeepLinkPendingStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutexImpl f2474a = MutexKt.a();
    public DeepLinkResolutionRequest b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.deeplink.DeepLinkPendingStore
    public final Object a(ContinuationImpl continuationImpl) {
        InMemoryDeepLinkPendingStore$consume$1 inMemoryDeepLinkPendingStore$consume$1;
        Mutex mutex;
        if (continuationImpl instanceof InMemoryDeepLinkPendingStore$consume$1) {
            inMemoryDeepLinkPendingStore$consume$1 = (InMemoryDeepLinkPendingStore$consume$1) continuationImpl;
            int i = inMemoryDeepLinkPendingStore$consume$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inMemoryDeepLinkPendingStore$consume$1.label = i - Integer.MIN_VALUE;
            } else {
                inMemoryDeepLinkPendingStore$consume$1 = new InMemoryDeepLinkPendingStore$consume$1(this, continuationImpl);
            }
        } else {
            inMemoryDeepLinkPendingStore$consume$1 = new InMemoryDeepLinkPendingStore$consume$1(this, continuationImpl);
        }
        Object obj = inMemoryDeepLinkPendingStore$consume$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = inMemoryDeepLinkPendingStore$consume$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.f2474a;
            inMemoryDeepLinkPendingStore$consume$1.L$0 = mutexImpl;
            inMemoryDeepLinkPendingStore$consume$1.label = 1;
            if (mutexImpl.a(inMemoryDeepLinkPendingStore$consume$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) inMemoryDeepLinkPendingStore$consume$1.L$0;
            ResultKt.b(obj);
        }
        try {
            DeepLinkResolutionRequest deepLinkResolutionRequest = this.b;
            this.b = null;
            return deepLinkResolutionRequest;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.deeplink.DeepLinkPendingStore
    public final Object b(DeepLinkResolutionRequest deepLinkResolutionRequest, ContinuationImpl continuationImpl) {
        InMemoryDeepLinkPendingStore$store$1 inMemoryDeepLinkPendingStore$store$1;
        Mutex mutex;
        if (continuationImpl instanceof InMemoryDeepLinkPendingStore$store$1) {
            inMemoryDeepLinkPendingStore$store$1 = (InMemoryDeepLinkPendingStore$store$1) continuationImpl;
            int i = inMemoryDeepLinkPendingStore$store$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inMemoryDeepLinkPendingStore$store$1.label = i - Integer.MIN_VALUE;
            } else {
                inMemoryDeepLinkPendingStore$store$1 = new InMemoryDeepLinkPendingStore$store$1(this, continuationImpl);
            }
        } else {
            inMemoryDeepLinkPendingStore$store$1 = new InMemoryDeepLinkPendingStore$store$1(this, continuationImpl);
        }
        Object obj = inMemoryDeepLinkPendingStore$store$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = inMemoryDeepLinkPendingStore$store$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            inMemoryDeepLinkPendingStore$store$1.L$0 = deepLinkResolutionRequest;
            mutex = this.f2474a;
            inMemoryDeepLinkPendingStore$store$1.L$1 = mutex;
            inMemoryDeepLinkPendingStore$store$1.label = 1;
            if (mutex.a(inMemoryDeepLinkPendingStore$store$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) inMemoryDeepLinkPendingStore$store$1.L$1;
            DeepLinkResolutionRequest deepLinkResolutionRequest2 = (DeepLinkResolutionRequest) inMemoryDeepLinkPendingStore$store$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            deepLinkResolutionRequest = deepLinkResolutionRequest2;
        }
        try {
            this.b = deepLinkResolutionRequest;
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
