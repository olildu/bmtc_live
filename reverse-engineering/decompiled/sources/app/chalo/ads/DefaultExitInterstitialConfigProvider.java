package app.chalo.ads;

import app.chalo.constants.Source;
import app.chalo.utils.KAtomicRef;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ads/DefaultExitInterstitialConfigProvider;", "Lapp/chalo/ads/ExitInterstitialConfigProvider;", "CacheState", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultExitInterstitialConfigProvider implements ExitInterstitialConfigProvider {
    public static final ExitInterstitialAdConfig d = new ExitInterstitialAdConfig(55);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchExitInterstitialConfigUseCase f760a;
    public final MutexImpl b = MutexKt.a();
    public final KAtomicRef c = new KAtomicRef(new CacheState(0, 7));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultExitInterstitialConfigProvider$CacheState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CacheState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f761a;
        public final ExitInterstitialTargetingKey b;
        public final ExitInterstitialAdConfig c;

        public /* synthetic */ CacheState(int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheState)) {
                return false;
            }
            CacheState cacheState = (CacheState) obj;
            return this.f761a == cacheState.f761a && Intrinsics.d(this.b, cacheState.b) && Intrinsics.d(this.c, cacheState.c);
        }

        public final int hashCode() {
            int i = this.f761a * 31;
            ExitInterstitialTargetingKey exitInterstitialTargetingKey = this.b;
            int iHashCode = (i + (exitInterstitialTargetingKey == null ? 0 : exitInterstitialTargetingKey.hashCode())) * 31;
            ExitInterstitialAdConfig exitInterstitialAdConfig = this.c;
            return iHashCode + (exitInterstitialAdConfig != null ? exitInterstitialAdConfig.hashCode() : 0);
        }

        public final String toString() {
            return "CacheState(version=" + this.f761a + ", cachedEnabledTargetingKey=" + this.b + ", latestConfig=" + this.c + ")";
        }

        public CacheState(int i, ExitInterstitialTargetingKey exitInterstitialTargetingKey, ExitInterstitialAdConfig exitInterstitialAdConfig) {
            this.f761a = i;
            this.b = exitInterstitialTargetingKey;
            this.c = exitInterstitialAdConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultExitInterstitialConfigProvider$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DefaultExitInterstitialConfigProvider(FetchExitInterstitialConfigUseCase fetchExitInterstitialConfigUseCase) {
        this.f760a = fetchExitInterstitialConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:39:0x00ac, B:43:0x00c2, B:47:0x00c8, B:48:0x00cf, B:51:0x00d6), top: B:62:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:39:0x00ac, B:43:0x00c2, B:47:0x00c8, B:48:0x00cf, B:51:0x00d6), top: B:62:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:48:0x00cf->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ads.ExitInterstitialConfigProvider
    public final Object a(ExitInterstitialTargetingKey exitInterstitialTargetingKey, Source source, ContinuationImpl continuationImpl) throws Throwable {
        DefaultExitInterstitialConfigProvider$resolveForTargeting$1 defaultExitInterstitialConfigProvider$resolveForTargeting$1;
        Mutex mutex;
        Mutex mutex2;
        ExitInterstitialTargetingKey exitInterstitialTargetingKey2;
        CacheState cacheState;
        ExitInterstitialAdConfig exitInterstitialAdConfig;
        CacheState cacheState2;
        int i;
        int i2;
        ExitInterstitialAdConfig exitInterstitialAdConfig2;
        CacheState cacheState3;
        AtomicReference atomicReference;
        if (continuationImpl instanceof DefaultExitInterstitialConfigProvider$resolveForTargeting$1) {
            defaultExitInterstitialConfigProvider$resolveForTargeting$1 = (DefaultExitInterstitialConfigProvider$resolveForTargeting$1) continuationImpl;
            int i3 = defaultExitInterstitialConfigProvider$resolveForTargeting$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                defaultExitInterstitialConfigProvider$resolveForTargeting$1.label = i3 - Integer.MIN_VALUE;
            } else {
                defaultExitInterstitialConfigProvider$resolveForTargeting$1 = new DefaultExitInterstitialConfigProvider$resolveForTargeting$1(this, continuationImpl);
            }
        } else {
            defaultExitInterstitialConfigProvider$resolveForTargeting$1 = new DefaultExitInterstitialConfigProvider$resolveForTargeting$1(this, continuationImpl);
        }
        Object obj = defaultExitInterstitialConfigProvider$resolveForTargeting$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = defaultExitInterstitialConfigProvider$resolveForTargeting$1.label;
        boolean z = true;
        KAtomicRef kAtomicRef = this.c;
        try {
            if (i4 == 0) {
                ResultKt.b(obj);
                defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$0 = exitInterstitialTargetingKey;
                defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$1 = source;
                mutex = this.b;
                defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$2 = mutex;
                defaultExitInterstitialConfigProvider$resolveForTargeting$1.label = 1;
                if (mutex.a(defaultExitInterstitialConfigProvider$resolveForTargeting$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cacheState = (CacheState) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$2;
                mutex2 = (Mutex) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$1;
                exitInterstitialTargetingKey2 = (ExitInterstitialTargetingKey) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$0;
                try {
                    ResultKt.b(obj);
                    exitInterstitialAdConfig = (ExitInterstitialAdConfig) obj;
                    cacheState2 = (CacheState) kAtomicRef.f10429a.get();
                    i = cacheState2.f761a;
                    i2 = cacheState.f761a;
                    exitInterstitialAdConfig2 = d;
                    if (i == i2) {
                        if (exitInterstitialAdConfig.d) {
                            exitInterstitialTargetingKey2 = null;
                        }
                        cacheState3 = new CacheState(i, exitInterstitialTargetingKey2, exitInterstitialAdConfig);
                        atomicReference = kAtomicRef.f10429a;
                        while (!atomicReference.compareAndSet(cacheState2, cacheState3)) {
                            if (atomicReference.get() != cacheState2) {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            mutex = mutex2;
                        } else {
                            mutex = mutex2;
                            exitInterstitialAdConfig = exitInterstitialAdConfig2;
                        }
                    } else {
                        mutex = mutex2;
                        exitInterstitialAdConfig = exitInterstitialAdConfig2;
                    }
                    mutex.e(null);
                    return exitInterstitialAdConfig;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$2;
            source = (Source) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$1;
            ExitInterstitialTargetingKey exitInterstitialTargetingKey3 = (ExitInterstitialTargetingKey) defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            exitInterstitialTargetingKey = exitInterstitialTargetingKey3;
            CacheState cacheState4 = (CacheState) kAtomicRef.f10429a.get();
            if (Intrinsics.d(cacheState4.b, exitInterstitialTargetingKey) && (exitInterstitialAdConfig = cacheState4.c) != null) {
                if (!exitInterstitialAdConfig.d) {
                    exitInterstitialAdConfig = null;
                }
                if (exitInterstitialAdConfig != null) {
                }
                mutex.e(null);
                return exitInterstitialAdConfig;
            }
            FetchExitInterstitialConfigUseCase fetchExitInterstitialConfigUseCase = this.f760a;
            defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$0 = exitInterstitialTargetingKey;
            defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$1 = mutex;
            defaultExitInterstitialConfigProvider$resolveForTargeting$1.L$2 = cacheState4;
            defaultExitInterstitialConfigProvider$resolveForTargeting$1.label = 2;
            Object objG = BuildersKt.g(fetchExitInterstitialConfigUseCase.d.b(), new FetchExitInterstitialConfigUseCase$invoke$2(fetchExitInterstitialConfigUseCase, source, null), defaultExitInterstitialConfigProvider$resolveForTargeting$1);
            if (objG != coroutineSingletons) {
                Mutex mutex4 = mutex;
                obj = objG;
                mutex2 = mutex4;
                exitInterstitialTargetingKey2 = exitInterstitialTargetingKey;
                cacheState = cacheState4;
                exitInterstitialAdConfig = (ExitInterstitialAdConfig) obj;
                cacheState2 = (CacheState) kAtomicRef.f10429a.get();
                i = cacheState2.f761a;
                i2 = cacheState.f761a;
                exitInterstitialAdConfig2 = d;
                if (i == i2) {
                    if (exitInterstitialAdConfig.d) {
                        exitInterstitialTargetingKey2 = null;
                    }
                    cacheState3 = new CacheState(i, exitInterstitialTargetingKey2, exitInterstitialAdConfig);
                    atomicReference = kAtomicRef.f10429a;
                    while (!atomicReference.compareAndSet(cacheState2, cacheState3)) {
                        if (atomicReference.get() != cacheState2) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        mutex = mutex2;
                    } else {
                        mutex = mutex2;
                        exitInterstitialAdConfig = exitInterstitialAdConfig2;
                    }
                } else {
                    mutex = mutex2;
                    exitInterstitialAdConfig = exitInterstitialAdConfig2;
                }
                mutex.e(null);
                return exitInterstitialAdConfig;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }

    @Override // app.chalo.ads.ExitInterstitialConfigProvider
    public final ExitInterstitialAdConfig b() {
        return ((CacheState) this.c.f10429a.get()).c;
    }

    @Override // app.chalo.ads.ExitInterstitialConfigProvider
    public final void invalidate() {
        while (true) {
            KAtomicRef kAtomicRef = this.c;
            CacheState cacheState = (CacheState) kAtomicRef.f10429a.get();
            CacheState cacheState2 = new CacheState(cacheState.f761a + 1, 6);
            AtomicReference atomicReference = kAtomicRef.f10429a;
            while (!atomicReference.compareAndSet(cacheState, cacheState2)) {
                if (atomicReference.get() != cacheState) {
                }
            }
            return;
        }
    }
}
