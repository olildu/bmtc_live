package app.chalo.location;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.LastKnownLocationProvider$update$2", f = "LastKnownLocationProvider.kt", l = {166, 38, 40, 54}, m = "invokeSuspend", v = 1)
final class LastKnownLocationProvider$update$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatLng $location;
    final /* synthetic */ Long $timeMillis;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LastKnownLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastKnownLocationProvider$update$2(LastKnownLocationProvider lastKnownLocationProvider, Long l, LatLng latLng, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lastKnownLocationProvider;
        this.$timeMillis = l;
        this.$location = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LastKnownLocationProvider$update$2(this.this$0, this.$timeMillis, this.$location, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LastKnownLocationProvider$update$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:16:0x0041, B:41:0x00f2, B:43:0x00f6, B:47:0x011a, B:50:0x0150, B:21:0x005c, B:36:0x00c5, B:37:0x00cb), top: B:62:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00f6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        Mutex mutex;
        Long l;
        LastKnownLocationProvider lastKnownLocationProvider;
        LatLng latLng;
        Object objInvoke;
        LastKnownLocationProvider lastKnownLocationProvider2;
        Mutex mutex2;
        long jLongValue;
        Mutex mutex3;
        Object objC;
        long j;
        StoredLocation storedLocation;
        LastKnownLocationStorage lastKnownLocationStorage;
        StoredLocation storedLocation2;
        ?? r3;
        long j2;
        double dA;
        ?? r10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r11 = 1;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    LastKnownLocationProvider lastKnownLocationProvider3 = this.this$0;
                    mutex = lastKnownLocationProvider3.d;
                    l = this.$timeMillis;
                    LatLng latLng2 = this.$location;
                    this.L$0 = mutex;
                    this.L$1 = l;
                    this.L$2 = lastKnownLocationProvider3;
                    this.L$3 = latLng2;
                    this.label = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                        lastKnownLocationProvider = lastKnownLocationProvider3;
                        latLng = latLng2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        latLng = (LatLng) this.L$2;
                        LastKnownLocationProvider lastKnownLocationProvider4 = (LastKnownLocationProvider) this.L$1;
                        Mutex mutex4 = (Mutex) this.L$0;
                        ResultKt.b(obj);
                        lastKnownLocationProvider2 = lastKnownLocationProvider4;
                        objInvoke = obj;
                        mutex2 = mutex4;
                        jLongValue = ((Number) objInvoke).longValue();
                        mutex3 = mutex2;
                        String message = "update requested ts=" + jLongValue;
                        Intrinsics.i(message, "message");
                        LastKnownLocationStorage lastKnownLocationStorage2 = lastKnownLocationProvider2.f5133a;
                        this.L$0 = mutex3;
                        this.L$1 = lastKnownLocationProvider2;
                        this.L$2 = latLng;
                        this.L$3 = null;
                        this.J$0 = jLongValue;
                        this.label = 3;
                        objC = lastKnownLocationStorage2.c(this);
                        if (objC != coroutineSingletons) {
                            j = jLongValue;
                            r11 = mutex3;
                            storedLocation = (StoredLocation) objC;
                            if (storedLocation != null) {
                                j2 = j - storedLocation.c;
                                String message2 = "elapsed=" + j2 + " ms since last update";
                                Intrinsics.i(message2, "message");
                                if (j2 >= 0) {
                                    dA = new LatLng(storedLocation.f5160a, storedLocation.b).a(latLng);
                                    int i2 = LastKnownLocationProvider.e;
                                    lastKnownLocationProvider2.getClass();
                                    String message3 = "distance moved=" + String.valueOf(LastKnownLocationProvider.b(dA, 5)) + " m";
                                    Intrinsics.i(message3, "message");
                                    if (dA < 50.0d) {
                                        r10 = r11;
                                    }
                                    r10.e(null);
                                    return Unit.f17538a;
                                }
                            }
                            lastKnownLocationStorage = lastKnownLocationProvider2.f5133a;
                            storedLocation2 = new StoredLocation(latLng.f5134a, latLng.b, j);
                            this.L$0 = r11;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (lastKnownLocationStorage.b(storedLocation2, this) != coroutineSingletons) {
                                r3 = r11;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        long j3 = this.J$0;
                        LatLng latLng3 = (LatLng) this.L$2;
                        LastKnownLocationProvider lastKnownLocationProvider5 = (LastKnownLocationProvider) this.L$1;
                        Mutex mutex5 = (Mutex) this.L$0;
                        ResultKt.b(obj);
                        lastKnownLocationProvider2 = lastKnownLocationProvider5;
                        j = j3;
                        latLng = latLng3;
                        objC = obj;
                        r11 = mutex5;
                        storedLocation = (StoredLocation) objC;
                        if (storedLocation != null) {
                            j2 = j - storedLocation.c;
                            String message4 = "elapsed=" + j2 + " ms since last update";
                            Intrinsics.i(message4, "message");
                            if (j2 >= 0 && j2 < 30000) {
                                dA = new LatLng(storedLocation.f5160a, storedLocation.b).a(latLng);
                                int i3 = LastKnownLocationProvider.e;
                                lastKnownLocationProvider2.getClass();
                                String message5 = "distance moved=" + String.valueOf(LastKnownLocationProvider.b(dA, 5)) + " m";
                                Intrinsics.i(message5, "message");
                                if (dA < 50.0d) {
                                    r10 = r11;
                                }
                                r10.e(null);
                                return Unit.f17538a;
                            }
                        }
                        lastKnownLocationStorage = lastKnownLocationProvider2.f5133a;
                        storedLocation2 = new StoredLocation(latLng.f5134a, latLng.b, j);
                        this.L$0 = r11;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (lastKnownLocationStorage.b(storedLocation2, this) != coroutineSingletons) {
                            r3 = r11;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r2 = (Mutex) this.L$0;
                    try {
                        ResultKt.b(obj);
                        r3 = r2;
                    } catch (Throwable th) {
                        th = th;
                        r2.e(null);
                        throw th;
                    }
                    r10 = r3;
                    r10.e(null);
                    return Unit.f17538a;
                }
                latLng = (LatLng) this.L$3;
                lastKnownLocationProvider = (LastKnownLocationProvider) this.L$2;
                Long l2 = (Long) this.L$1;
                Mutex mutex6 = (Mutex) this.L$0;
                ResultKt.b(obj);
                l = l2;
                mutex = mutex6;
                if (l != null) {
                    jLongValue = l.longValue();
                    Mutex mutex7 = mutex;
                    lastKnownLocationProvider2 = lastKnownLocationProvider;
                    mutex3 = mutex7;
                    String message6 = "update requested ts=" + jLongValue;
                    Intrinsics.i(message6, "message");
                    LastKnownLocationStorage lastKnownLocationStorage3 = lastKnownLocationProvider2.f5133a;
                    this.L$0 = mutex3;
                    this.L$1 = lastKnownLocationProvider2;
                    this.L$2 = latLng;
                    this.L$3 = null;
                    this.J$0 = jLongValue;
                    this.label = 3;
                    objC = lastKnownLocationStorage3.c(this);
                    if (objC != coroutineSingletons) {
                        j = jLongValue;
                        r11 = mutex3;
                        storedLocation = (StoredLocation) objC;
                        if (storedLocation != null) {
                            j2 = j - storedLocation.c;
                            String message7 = "elapsed=" + j2 + " ms since last update";
                            Intrinsics.i(message7, "message");
                            if (j2 >= 0) {
                                dA = new LatLng(storedLocation.f5160a, storedLocation.b).a(latLng);
                                int i4 = LastKnownLocationProvider.e;
                                lastKnownLocationProvider2.getClass();
                                String message8 = "distance moved=" + String.valueOf(LastKnownLocationProvider.b(dA, 5)) + " m";
                                Intrinsics.i(message8, "message");
                                if (dA < 50.0d) {
                                    r10 = r11;
                                }
                                r10.e(null);
                                return Unit.f17538a;
                            }
                        }
                        lastKnownLocationStorage = lastKnownLocationProvider2.f5133a;
                        storedLocation2 = new StoredLocation(latLng.f5134a, latLng.b, j);
                        this.L$0 = r11;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (lastKnownLocationStorage.b(storedLocation2, this) != coroutineSingletons) {
                            r3 = r11;
                            r10 = r3;
                            r10.e(null);
                            return Unit.f17538a;
                        }
                    }
                } else {
                    Function1 function1 = lastKnownLocationProvider.c;
                    this.L$0 = mutex;
                    this.L$1 = lastKnownLocationProvider;
                    this.L$2 = latLng;
                    this.L$3 = null;
                    this.label = 2;
                    objInvoke = function1.invoke(this);
                    if (objInvoke != coroutineSingletons) {
                        Mutex mutex8 = mutex;
                        lastKnownLocationProvider2 = lastKnownLocationProvider;
                        mutex2 = mutex8;
                        jLongValue = ((Number) objInvoke).longValue();
                        mutex3 = mutex2;
                        String message9 = "update requested ts=" + jLongValue;
                        Intrinsics.i(message9, "message");
                        LastKnownLocationStorage lastKnownLocationStorage4 = lastKnownLocationProvider2.f5133a;
                        this.L$0 = mutex3;
                        this.L$1 = lastKnownLocationProvider2;
                        this.L$2 = latLng;
                        this.L$3 = null;
                        this.J$0 = jLongValue;
                        this.label = 3;
                        objC = lastKnownLocationStorage4.c(this);
                        if (objC != coroutineSingletons) {
                            j = jLongValue;
                            r11 = mutex3;
                            storedLocation = (StoredLocation) objC;
                            if (storedLocation != null) {
                                j2 = j - storedLocation.c;
                                String message10 = "elapsed=" + j2 + " ms since last update";
                                Intrinsics.i(message10, "message");
                                if (j2 >= 0) {
                                    dA = new LatLng(storedLocation.f5160a, storedLocation.b).a(latLng);
                                    int i5 = LastKnownLocationProvider.e;
                                    lastKnownLocationProvider2.getClass();
                                    String message11 = "distance moved=" + String.valueOf(LastKnownLocationProvider.b(dA, 5)) + " m";
                                    Intrinsics.i(message11, "message");
                                    if (dA < 50.0d) {
                                        r10 = r11;
                                    }
                                    r10.e(null);
                                    return Unit.f17538a;
                                }
                            }
                            lastKnownLocationStorage = lastKnownLocationProvider2.f5133a;
                            storedLocation2 = new StoredLocation(latLng.f5134a, latLng.b, j);
                            this.L$0 = r11;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (lastKnownLocationStorage.b(storedLocation2, this) != coroutineSingletons) {
                                r3 = r11;
                                r10 = r3;
                                r10.e(null);
                                return Unit.f17538a;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                th = th2;
                r2 = mutex;
                r2.e(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = r11;
        }
    }
}
