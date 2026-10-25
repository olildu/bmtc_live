package app.chalo.ble_communication.passengerside.feature;

import app.chalo.ble_communication.BLEDuplexConnectionStatus;
import app.chalo.ble_communication.passengerside.PassengerSideBLEOperationsMapperKt;
import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection;
import app.chalo.extensions.UtilityExtensionsKt;
import com.silencelaboratories.silentride.components.SilentRideComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/passengerside/feature/PassengerSideConnectionPoolManager;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassengerSideConnectionPoolManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutexImpl f1141a = MutexKt.a();
    public final MutexImpl b = MutexKt.a();
    public final HashMap c = new HashMap();
    public final MutableStateFlow d;
    public final MutableStateFlow e;

    public PassengerSideConnectionPoolManager(PassengerSideConnectionResolver passengerSideConnectionResolver) {
        EmptyList emptyList = EmptyList.f17557a;
        this.d = StateFlowKt.a(emptyList);
        this.e = StateFlowKt.a(emptyList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(PassengerSideConnectionPoolManager passengerSideConnectionPoolManager, String str, ContinuationImpl continuationImpl) {
        PassengerSideConnectionPoolManager$getConnection$1 passengerSideConnectionPoolManager$getConnection$1;
        Mutex mutex;
        passengerSideConnectionPoolManager.getClass();
        if (continuationImpl instanceof PassengerSideConnectionPoolManager$getConnection$1) {
            passengerSideConnectionPoolManager$getConnection$1 = (PassengerSideConnectionPoolManager$getConnection$1) continuationImpl;
            int i = passengerSideConnectionPoolManager$getConnection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passengerSideConnectionPoolManager$getConnection$1.label = i - Integer.MIN_VALUE;
            } else {
                passengerSideConnectionPoolManager$getConnection$1 = new PassengerSideConnectionPoolManager$getConnection$1(passengerSideConnectionPoolManager, continuationImpl);
            }
        } else {
            passengerSideConnectionPoolManager$getConnection$1 = new PassengerSideConnectionPoolManager$getConnection$1(passengerSideConnectionPoolManager, continuationImpl);
        }
        Object obj = passengerSideConnectionPoolManager$getConnection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passengerSideConnectionPoolManager$getConnection$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mutex = passengerSideConnectionPoolManager.f1141a;
            passengerSideConnectionPoolManager$getConnection$1.L$0 = str;
            passengerSideConnectionPoolManager$getConnection$1.L$1 = mutex;
            passengerSideConnectionPoolManager$getConnection$1.label = 1;
            if (mutex.a(passengerSideConnectionPoolManager$getConnection$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) passengerSideConnectionPoolManager$getConnection$1.L$1;
            String str2 = (String) passengerSideConnectionPoolManager$getConnection$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            return passengerSideConnectionPoolManager.c.get(str);
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        PassengerSideConnectionPoolManager$cleanup$1 passengerSideConnectionPoolManager$cleanup$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        if (continuationImpl instanceof PassengerSideConnectionPoolManager$cleanup$1) {
            passengerSideConnectionPoolManager$cleanup$1 = (PassengerSideConnectionPoolManager$cleanup$1) continuationImpl;
            int i = passengerSideConnectionPoolManager$cleanup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passengerSideConnectionPoolManager$cleanup$1.label = i - Integer.MIN_VALUE;
            } else {
                passengerSideConnectionPoolManager$cleanup$1 = new PassengerSideConnectionPoolManager$cleanup$1(this, continuationImpl);
            }
        } else {
            passengerSideConnectionPoolManager$cleanup$1 = new PassengerSideConnectionPoolManager$cleanup$1(this, continuationImpl);
        }
        Object obj = passengerSideConnectionPoolManager$cleanup$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passengerSideConnectionPoolManager$cleanup$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = this.f1141a;
                passengerSideConnectionPoolManager$cleanup$1.L$0 = mutex;
                passengerSideConnectionPoolManager$cleanup$1.label = 1;
                if (mutex.a(passengerSideConnectionPoolManager$cleanup$1) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    Mutex mutex3 = (Mutex) passengerSideConnectionPoolManager$cleanup$1.L$0;
                    try {
                        ResultKt.b(obj);
                        mutex = mutex3;
                        passengerSideConnectionPoolManager$cleanup$1.L$0 = mutex;
                        passengerSideConnectionPoolManager$cleanup$1.label = 3;
                        if (h(passengerSideConnectionPoolManager$cleanup$1) != obj2) {
                            mutex2 = mutex;
                        }
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) passengerSideConnectionPoolManager$cleanup$1.L$0;
                    try {
                        ResultKt.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                mutex2.e(null);
                throw th;
            }
            Mutex mutex4 = (Mutex) passengerSideConnectionPoolManager$cleanup$1.L$0;
            ResultKt.b(obj);
            mutex = mutex4;
            mutex2.e(null);
            return Unit.f17538a;
            this.c.clear();
            passengerSideConnectionPoolManager$cleanup$1.L$0 = mutex;
            passengerSideConnectionPoolManager$cleanup$1.label = 2;
            if (i(passengerSideConnectionPoolManager$cleanup$1) != obj2) {
                passengerSideConnectionPoolManager$cleanup$1.L$0 = mutex;
                passengerSideConnectionPoolManager$cleanup$1.label = 3;
                if (h(passengerSideConnectionPoolManager$cleanup$1) != obj2) {
                    mutex2 = mutex;
                    mutex2.e(null);
                    return Unit.f17538a;
                }
            }
            return obj2;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice, ContinuationImpl continuationImpl) throws Throwable {
        PassengerSideConnectionPoolManager$createOrUpdateConnection$1 passengerSideConnectionPoolManager$createOrUpdateConnection$1;
        SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice2;
        Mutex mutex;
        BLEDuplexConnectionStatus bLEDuplexConnectionStatus;
        Mutex mutex2;
        Mutex mutex3;
        if (continuationImpl instanceof PassengerSideConnectionPoolManager$createOrUpdateConnection$1) {
            passengerSideConnectionPoolManager$createOrUpdateConnection$1 = (PassengerSideConnectionPoolManager$createOrUpdateConnection$1) continuationImpl;
            int i = passengerSideConnectionPoolManager$createOrUpdateConnection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.label = i - Integer.MIN_VALUE;
            } else {
                passengerSideConnectionPoolManager$createOrUpdateConnection$1 = new PassengerSideConnectionPoolManager$createOrUpdateConnection$1(this, continuationImpl);
            }
        } else {
            passengerSideConnectionPoolManager$createOrUpdateConnection$1 = new PassengerSideConnectionPoolManager$createOrUpdateConnection$1(this, continuationImpl);
        }
        Object obj = passengerSideConnectionPoolManager$createOrUpdateConnection$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passengerSideConnectionPoolManager$createOrUpdateConnection$1.label;
        Unit unit = Unit.f17538a;
        HashMap map = this.c;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                BLEDuplexConnectionStatus bLEDuplexConnectionStatusA = PassengerSideBLEOperationsMapperKt.a(passiveModeDriverDevice.a());
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0 = passiveModeDriverDevice;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$1 = bLEDuplexConnectionStatusA;
                MutexImpl mutexImpl = this.b;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$2 = mutexImpl;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.label = 1;
                if (mutexImpl.a(passengerSideConnectionPoolManager$createOrUpdateConnection$1) != obj2) {
                    passiveModeDriverDevice2 = passiveModeDriverDevice;
                    mutex = mutexImpl;
                    bLEDuplexConnectionStatus = bLEDuplexConnectionStatusA;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0;
                    try {
                        ResultKt.b(obj);
                        mutex2.e(null);
                        return unit;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.e(null);
                        throw th;
                    }
                }
                mutex3 = (Mutex) passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0;
                try {
                    ResultKt.b(obj);
                    String message = "BLECommConnectionDataExchange final list = ".concat(UtilityExtensionsKt.a(CollectionsKt.D0(map.values())));
                    Intrinsics.i(message, "message");
                    mutex3.e(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                    mutex2.e(null);
                    throw th;
                }
            }
            mutex = (Mutex) passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$2;
            bLEDuplexConnectionStatus = (BLEDuplexConnectionStatus) passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$1;
            passiveModeDriverDevice2 = (SilentRideComponent.Passenger.PassiveModeDriverDevice) passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0;
            ResultKt.b(obj);
            if (bLEDuplexConnectionStatus == BLEDuplexConnectionStatus.NOT_CONNECTED) {
                String message2 = "BLECommConnectionDataExchange status not connected, currList = ".concat(UtilityExtensionsKt.a(CollectionsKt.D0(map.values())));
                Intrinsics.i(message2, "message");
                Intrinsics.i(passiveModeDriverDevice2, "passiveModeDriverDevice");
                String strB = passiveModeDriverDevice2.b();
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0 = mutex;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$1 = null;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$2 = null;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.label = 2;
                if (f(strB, passengerSideConnectionPoolManager$createOrUpdateConnection$1) != obj2) {
                    mutex3 = mutex;
                    String message3 = "BLECommConnectionDataExchange final list = ".concat(UtilityExtensionsKt.a(CollectionsKt.D0(map.values())));
                    Intrinsics.i(message3, "message");
                    mutex3.e(null);
                    return unit;
                }
            } else {
                Intrinsics.i(passiveModeDriverDevice2, "passiveModeDriverDevice");
                BLEPassengerSideDuplexConnection bLEPassengerSideDuplexConnection = new BLEPassengerSideDuplexConnection(passiveModeDriverDevice2.b(), passiveModeDriverDevice2);
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$0 = mutex;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$1 = null;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.L$2 = null;
                passengerSideConnectionPoolManager$createOrUpdateConnection$1.label = 3;
                if (g(bLEPassengerSideDuplexConnection, bLEDuplexConnectionStatus, passengerSideConnectionPoolManager$createOrUpdateConnection$1) != obj2) {
                    mutex2 = mutex;
                    mutex2.e(null);
                    return unit;
                }
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        PassengerSideConnectionPoolManager$getAllConnections$1 passengerSideConnectionPoolManager$getAllConnections$1;
        Mutex mutex;
        if (continuationImpl instanceof PassengerSideConnectionPoolManager$getAllConnections$1) {
            passengerSideConnectionPoolManager$getAllConnections$1 = (PassengerSideConnectionPoolManager$getAllConnections$1) continuationImpl;
            int i = passengerSideConnectionPoolManager$getAllConnections$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passengerSideConnectionPoolManager$getAllConnections$1.label = i - Integer.MIN_VALUE;
            } else {
                passengerSideConnectionPoolManager$getAllConnections$1 = new PassengerSideConnectionPoolManager$getAllConnections$1(this, continuationImpl);
            }
        } else {
            passengerSideConnectionPoolManager$getAllConnections$1 = new PassengerSideConnectionPoolManager$getAllConnections$1(this, continuationImpl);
        }
        Object obj = passengerSideConnectionPoolManager$getAllConnections$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passengerSideConnectionPoolManager$getAllConnections$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl = this.f1141a;
            passengerSideConnectionPoolManager$getAllConnections$1.L$0 = mutexImpl;
            passengerSideConnectionPoolManager$getAllConnections$1.label = 1;
            if (mutexImpl.a(passengerSideConnectionPoolManager$getAllConnections$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) passengerSideConnectionPoolManager$getAllConnections$1.L$0;
            ResultKt.b(obj);
        }
        try {
            return CollectionsKt.D0(CollectionsKt.D(this.c.values()));
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, String str, ContinuationImpl continuationImpl) {
        PassengerSideConnectionPoolManager$getConnectionWithTimeout$1 passengerSideConnectionPoolManager$getConnectionWithTimeout$1;
        if (continuationImpl instanceof PassengerSideConnectionPoolManager$getConnectionWithTimeout$1) {
            passengerSideConnectionPoolManager$getConnectionWithTimeout$1 = (PassengerSideConnectionPoolManager$getConnectionWithTimeout$1) continuationImpl;
            int i = passengerSideConnectionPoolManager$getConnectionWithTimeout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passengerSideConnectionPoolManager$getConnectionWithTimeout$1.label = i - Integer.MIN_VALUE;
            } else {
                passengerSideConnectionPoolManager$getConnectionWithTimeout$1 = new PassengerSideConnectionPoolManager$getConnectionWithTimeout$1(this, continuationImpl);
            }
        } else {
            passengerSideConnectionPoolManager$getConnectionWithTimeout$1 = new PassengerSideConnectionPoolManager$getConnectionWithTimeout$1(this, continuationImpl);
        }
        Object objB = passengerSideConnectionPoolManager$getConnectionWithTimeout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passengerSideConnectionPoolManager$getConnectionWithTimeout$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                PassengerSideConnectionPoolManager$getConnectionWithTimeout$2 passengerSideConnectionPoolManager$getConnectionWithTimeout$2 = new PassengerSideConnectionPoolManager$getConnectionWithTimeout$2(this, str, null);
                passengerSideConnectionPoolManager$getConnectionWithTimeout$1.label = 1;
                objB = TimeoutKt.b(j, passengerSideConnectionPoolManager$getConnectionWithTimeout$2, passengerSideConnectionPoolManager$getConnectionWithTimeout$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return (BLEPassengerSideDuplexConnection) objB;
        } catch (TimeoutCancellationException | Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (h(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v0, types: [app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$removeConnection$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$removeConnection$1 r0 = (app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$removeConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$removeConnection$1 r0 = new app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$removeConnection$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L82
        L32:
            r10 = move-exception
            goto L8c
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L77
        L44:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            r10 = r9
            r9 = r2
            goto L64
        L52:
            kotlin.ResultKt.b(r10)
            r0.L$0 = r9
            kotlinx.coroutines.sync.MutexImpl r10 = r8.f1141a
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r2 = r10.a(r0)
            if (r2 != r1) goto L64
            goto L81
        L64:
            java.util.HashMap r2 = r8.c     // Catch: java.lang.Throwable -> L88
            r2.remove(r9)     // Catch: java.lang.Throwable -> L88
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L88
            r0.label = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r9 = r8.i(r0)     // Catch: java.lang.Throwable -> L88
            if (r9 != r1) goto L76
            goto L81
        L76:
            r9 = r10
        L77:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = r8.h(r0)     // Catch: java.lang.Throwable -> L32
            if (r10 != r1) goto L82
        L81:
            return r1
        L82:
            r9.e(r6)
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        L88:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8c:
            r9.e(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager.f(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x003d, PHI: r12 r14
      0x00dc: PHI (r12v19 java.lang.Object) = (r12v33 java.lang.Object), (r12v34 java.lang.Object) binds: [B:59:0x00d9, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r14v8 java.lang.Object) = (r14v10 java.lang.Object), (r14v11 java.lang.Object) binds: [B:59:0x00d9, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:16:0x0038, B:23:0x004c, B:61:0x00dc, B:26:0x0055, B:58:0x00cd), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r14.a(r1) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r12 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        if (r12 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        if (h(r1) == r2) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager] */
    /* JADX WARN: Type inference failed for: r12v0, types: [app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection r12, app.chalo.ble_communication.BLEDuplexConnectionStatus r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager.g(app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection, app.chalo.ble_communication.BLEDuplexConnectionStatus, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object h(ContinuationImpl continuationImpl) {
        Object objEmit;
        List<BLEPassengerSideDuplexConnection> listD0 = CollectionsKt.D0(this.c.values());
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listD0, 10));
        for (BLEPassengerSideDuplexConnection bLEPassengerSideDuplexConnection : listD0) {
            arrayList.add(bLEPassengerSideDuplexConnection != null ? bLEPassengerSideDuplexConnection.f1144a : null);
        }
        MutableStateFlow mutableStateFlow = this.e;
        ArrayList arrayListE0 = CollectionsKt.E0((Collection) mutableStateFlow.getValue());
        boolean z = false;
        for (BLEPassengerSideDuplexConnection bLEPassengerSideDuplexConnection2 : listD0) {
            if (bLEPassengerSideDuplexConnection2 != null && !arrayList.contains(bLEPassengerSideDuplexConnection2.f1144a)) {
                arrayListE0.add(bLEPassengerSideDuplexConnection2);
                z = true;
            }
        }
        return (z && (objEmit = mutableStateFlow.emit(arrayListE0, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objEmit : Unit.f17538a;
    }

    public final Object i(ContinuationImpl continuationImpl) {
        HashMap map = this.c;
        List listD0 = CollectionsKt.D0(map.values());
        String message = "BLECommConnectionDataExchange updated connection list for debugging = ".concat(UtilityExtensionsKt.a(CollectionsKt.D0(map.values())));
        Intrinsics.i(message, "message");
        Object objEmit = this.d.emit(listD0, continuationImpl);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : Unit.f17538a;
    }
}
