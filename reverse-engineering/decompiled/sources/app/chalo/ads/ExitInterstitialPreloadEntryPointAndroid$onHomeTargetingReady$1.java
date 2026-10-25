package app.chalo.ads;

import app.chalo.constants.Source;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1", f = "ExitInterstitialPreloadEntryPointAndroid.kt", l = {96, 44}, m = "invokeSuspend", v = 1)
final class ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExitInterstitialTargetingKey $targetingKey;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ExitInterstitialPreloadEntryPointAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1(ExitInterstitialPreloadEntryPointAndroid exitInterstitialPreloadEntryPointAndroid, ExitInterstitialTargetingKey exitInterstitialTargetingKey, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialPreloadEntryPointAndroid;
        this.$targetingKey = exitInterstitialTargetingKey;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1(this.this$0, this.$targetingKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6 A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #6 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:7:0x0023, B:59:0x00e0, B:61:0x00e6, B:63:0x00fa, B:65:0x010d, B:67:0x0111, B:70:0x0128, B:69:0x0117), top: B:93:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #6 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:7:0x0023, B:59:0x00e0, B:61:0x00e6, B:63:0x00fa, B:65:0x010d, B:67:0x0111, B:70:0x0128, B:69:0x0117), top: B:93:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #6 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:7:0x0023, B:59:0x00e0, B:61:0x00e6, B:63:0x00fa, B:65:0x010d, B:67:0x0111, B:70:0x0128, B:69:0x0117), top: B:93:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117 A[Catch: all -> 0x0028, CancellationException -> 0x002b, TryCatch #6 {CancellationException -> 0x002b, all -> 0x0028, blocks: (B:7:0x0023, B:59:0x00e0, B:61:0x00e6, B:63:0x00fa, B:65:0x010d, B:67:0x0111, B:70:0x0128, B:69:0x0117), top: B:93:0x0023 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00e6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00fa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0117, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        ExitInterstitialPreloadEntryPointAndroid exitInterstitialPreloadEntryPointAndroid;
        Mutex mutex2;
        ExitInterstitialTargetingKey exitInterstitialTargetingKey;
        Mutex mutex3;
        ExitInterstitialTargetingKey exitInterstitialTargetingKey2;
        Mutex mutex4;
        ExitInterstitialPreloadEntryPointAndroid exitInterstitialPreloadEntryPointAndroid2;
        int i;
        ExitInterstitialAdConfig exitInterstitialAdConfigB;
        boolean z;
        Mutex mutex5;
        Mutex mutex6;
        ExitInterstitialTargetingKey exitInterstitialTargetingKey3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    exitInterstitialPreloadEntryPointAndroid = this.this$0;
                    MutexImpl mutexImpl = exitInterstitialPreloadEntryPointAndroid.d;
                    ExitInterstitialTargetingKey exitInterstitialTargetingKey4 = this.$targetingKey;
                    this.L$0 = mutexImpl;
                    this.L$1 = exitInterstitialPreloadEntryPointAndroid;
                    this.L$2 = exitInterstitialTargetingKey4;
                    this.label = 1;
                    if (mutexImpl.a(this) != coroutineSingletons) {
                        mutex2 = mutexImpl;
                        exitInterstitialTargetingKey = exitInterstitialTargetingKey4;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    exitInterstitialTargetingKey2 = (ExitInterstitialTargetingKey) this.L$2;
                    exitInterstitialPreloadEntryPointAndroid2 = (ExitInterstitialPreloadEntryPointAndroid) this.L$1;
                    mutex3 = (Mutex) this.L$0;
                    try {
                        ResultKt.b(obj);
                        mutex4 = mutex3;
                        if (!((ExitInterstitialAdConfig) obj).d) {
                            String message = "entrypoint preload skipped reason=config_disabled targeting=" + exitInterstitialTargetingKey2;
                            Intrinsics.i(message, "message");
                            mutex6 = mutex4;
                        } else if (i != 0) {
                            String message2 = "entrypoint preload ignored reason=same_targeting_config_refreshed targeting=" + exitInterstitialTargetingKey2;
                            Intrinsics.i(message2, "message");
                            mutex6 = mutex4;
                        } else {
                            exitInterstitialTargetingKey3 = exitInterstitialPreloadEntryPointAndroid2.e;
                            if (exitInterstitialTargetingKey3 != null || exitInterstitialTargetingKey3.equals(exitInterstitialTargetingKey2)) {
                                String message3 = "entrypoint preload requested targeting=" + exitInterstitialTargetingKey2;
                                Intrinsics.i(message3, "message");
                            }
                            exitInterstitialPreloadEntryPointAndroid2.f780a.f();
                            exitInterstitialPreloadEntryPointAndroid2.e = exitInterstitialTargetingKey2;
                            mutex6 = mutex4;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        ChaloLog.c("AdsterExitInterstitialPrefetch", "entrypoint preload skipped reason=config_fetch_failed", th);
                        mutex6 = mutex3;
                    }
                    mutex5 = mutex6;
                    mutex5.e(null);
                    return Unit.f17538a;
                }
                exitInterstitialTargetingKey = (ExitInterstitialTargetingKey) this.L$2;
                ExitInterstitialPreloadEntryPointAndroid exitInterstitialPreloadEntryPointAndroid3 = (ExitInterstitialPreloadEntryPointAndroid) this.L$1;
                Mutex mutex7 = (Mutex) this.L$0;
                ResultKt.b(obj);
                exitInterstitialPreloadEntryPointAndroid = exitInterstitialPreloadEntryPointAndroid3;
                mutex2 = mutex7;
                ExitInterstitialTargetingKey exitInterstitialTargetingKey5 = exitInterstitialPreloadEntryPointAndroid.e;
                if (exitInterstitialTargetingKey5 != null && !exitInterstitialTargetingKey5.equals(exitInterstitialTargetingKey)) {
                    exitInterstitialPreloadEntryPointAndroid.b(exitInterstitialTargetingKey5, exitInterstitialTargetingKey);
                }
                int i3 = 0;
                if (Intrinsics.d(exitInterstitialPreloadEntryPointAndroid.e, exitInterstitialTargetingKey)) {
                    ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialPreloadEntryPointAndroid.f780a;
                    synchronized (exitInterstitialAdManager.j) {
                        if (exitInterstitialAdManager.l) {
                            if ((exitInterstitialAdManager.b.f.getValue() instanceof AdsterSdkInitState.Failed) && !exitInterstitialAdManager.m) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        i3 = 1;
                    }
                }
                if (i3 == 0 || (exitInterstitialAdConfigB = exitInterstitialPreloadEntryPointAndroid.b.b()) == null || !exitInterstitialAdConfigB.d) {
                    try {
                        ExitInterstitialConfigProvider exitInterstitialConfigProvider = exitInterstitialPreloadEntryPointAndroid.b;
                        this.L$0 = mutex2;
                        this.L$1 = exitInterstitialPreloadEntryPointAndroid;
                        this.L$2 = exitInterstitialTargetingKey;
                        this.I$0 = i3;
                        this.label = 2;
                        Object objA = exitInterstitialConfigProvider.a(exitInterstitialTargetingKey, Source.HOME_SCREEN_TAB, this);
                        if (objA != coroutineSingletons) {
                            exitInterstitialTargetingKey2 = exitInterstitialTargetingKey;
                            mutex4 = mutex2;
                            exitInterstitialPreloadEntryPointAndroid2 = exitInterstitialPreloadEntryPointAndroid;
                            obj = objA;
                            i = i3;
                            if (!((ExitInterstitialAdConfig) obj).d) {
                                String message4 = "entrypoint preload skipped reason=config_disabled targeting=" + exitInterstitialTargetingKey2;
                                Intrinsics.i(message4, "message");
                                mutex6 = mutex4;
                            } else if (i != 0) {
                                String message5 = "entrypoint preload ignored reason=same_targeting_config_refreshed targeting=" + exitInterstitialTargetingKey2;
                                Intrinsics.i(message5, "message");
                                mutex6 = mutex4;
                            } else {
                                exitInterstitialTargetingKey3 = exitInterstitialPreloadEntryPointAndroid2.e;
                                if (exitInterstitialTargetingKey3 != null) {
                                    String message6 = "entrypoint preload requested targeting=" + exitInterstitialTargetingKey2;
                                    Intrinsics.i(message6, "message");
                                } else {
                                    String message7 = "entrypoint preload requested targeting=" + exitInterstitialTargetingKey2;
                                    Intrinsics.i(message7, "message");
                                }
                                exitInterstitialPreloadEntryPointAndroid2.f780a.f();
                                exitInterstitialPreloadEntryPointAndroid2.e = exitInterstitialTargetingKey2;
                                mutex6 = mutex4;
                            }
                            mutex5 = mutex6;
                        }
                        return coroutineSingletons;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex3 = mutex2;
                        ChaloLog.c("AdsterExitInterstitialPrefetch", "entrypoint preload skipped reason=config_fetch_failed", th);
                        mutex6 = mutex3;
                    }
                } else {
                    String message8 = "entrypoint preload ignored reason=same_targeting targeting=" + exitInterstitialTargetingKey;
                    Intrinsics.i(message8, "message");
                    mutex5 = mutex2;
                }
                mutex5.e(null);
                return Unit.f17538a;
            } catch (Throwable th3) {
                th = th3;
                mutex = mutex2;
                mutex.e(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            mutex = 2;
        }
    }
}
