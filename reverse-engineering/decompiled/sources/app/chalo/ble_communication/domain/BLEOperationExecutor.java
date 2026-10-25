package app.chalo.ble_communication.domain;

import app.chalo.ble_communication.BLEOperationStatus;
import app.chalo.ble_communication.BLETerminalOperationStatus;
import app.chalo.ble_communication.SilentRideOperationFailureReason;
import app.chalo.ble_communication.feature.logging.BLELoggingFeature;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import com.silencelaboratories.silentride.operations.SilentRideOperation;
import com.silencelaboratories.silentride.operations.SilentRideOperationStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/domain/BLEOperationExecutor;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLEOperationExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f1110a;
    public final BLELoggingFeature b;
    public final BasicInfoContract c;
    public final MutexImpl d = MutexKt.a();

    public BLEOperationExecutor(CoroutineContextProvider coroutineContextProvider, BLELoggingFeature bLELoggingFeature, BasicInfoContract basicInfoContract) {
        this.f1110a = coroutineContextProvider;
        this.b = bLELoggingFeature;
        this.c = basicInfoContract;
    }

    public static final BLEOperationStatus a(BLEOperationExecutor bLEOperationExecutor, SilentRideOperationStatus silentRideOperationStatus) {
        bLEOperationExecutor.getClass();
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.Failed) {
            return new BLEOperationStatus.FailedFromSL(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.InProgress) {
            return new BLEOperationStatus.InProgress(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.NotStarted) {
            return new BLEOperationStatus.NotStarted(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.Rejected) {
            return new BLEOperationStatus.Rejected(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if ((silentRideOperationStatus instanceof SilentRideOperationStatus.AlreadyCompleted) || (silentRideOperationStatus instanceof SilentRideOperationStatus.Success)) {
            return BLEOperationStatus.Success.f1100a;
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.FailureAwaited) {
            return new BLEOperationStatus.FailureAwaited(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.SuccessAwaited) {
            return new BLEOperationStatus.SuccessAwaited(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.Validate) {
            return new BLEOperationStatus.Validate(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        if (silentRideOperationStatus instanceof SilentRideOperationStatus.OnNext) {
            return new BLEOperationStatus.InProgress(silentRideOperationStatus.b, silentRideOperationStatus.f15363a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(BLEOperationExecutor bLEOperationExecutor, Flow flow, boolean z, ContinuationImpl continuationImpl) {
        BLEOperationExecutor$waitUntilBLETerminalOperation$1 bLEOperationExecutor$waitUntilBLETerminalOperation$1;
        bLEOperationExecutor.getClass();
        if (continuationImpl instanceof BLEOperationExecutor$waitUntilBLETerminalOperation$1) {
            bLEOperationExecutor$waitUntilBLETerminalOperation$1 = (BLEOperationExecutor$waitUntilBLETerminalOperation$1) continuationImpl;
            int i = bLEOperationExecutor$waitUntilBLETerminalOperation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEOperationExecutor$waitUntilBLETerminalOperation$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEOperationExecutor$waitUntilBLETerminalOperation$1 = new BLEOperationExecutor$waitUntilBLETerminalOperation$1(bLEOperationExecutor, continuationImpl);
            }
        } else {
            bLEOperationExecutor$waitUntilBLETerminalOperation$1 = new BLEOperationExecutor$waitUntilBLETerminalOperation$1(bLEOperationExecutor, continuationImpl);
        }
        Object objW = bLEOperationExecutor$waitUntilBLETerminalOperation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEOperationExecutor$waitUntilBLETerminalOperation$1.label;
        if (i2 == 0) {
            ResultKt.b(objW);
            BLEOperationExecutor$waitUntilBLETerminalOperation$2 bLEOperationExecutor$waitUntilBLETerminalOperation$2 = new BLEOperationExecutor$waitUntilBLETerminalOperation$2(z, null);
            bLEOperationExecutor$waitUntilBLETerminalOperation$1.label = 1;
            objW = FlowKt.w(flow, bLEOperationExecutor$waitUntilBLETerminalOperation$2, bLEOperationExecutor$waitUntilBLETerminalOperation$1);
            if (objW == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objW);
        }
        BLEOperationStatus bLEOperationStatus = (BLEOperationStatus) objW;
        if (bLEOperationStatus == null) {
            return new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown("No terminal status found"));
        }
        if ((bLEOperationStatus instanceof BLEOperationStatus.FailureAwaited) || (bLEOperationStatus instanceof BLEOperationStatus.FailedFromSL)) {
            return new BLETerminalOperationStatus.Failure(SilentRideOperationFailureReason.Failed.f1105a);
        }
        if (bLEOperationStatus instanceof BLEOperationStatus.Rejected) {
            return new BLETerminalOperationStatus.Failure(SilentRideOperationFailureReason.Rejected.f1106a);
        }
        if ((bLEOperationStatus instanceof BLEOperationStatus.SuccessAwaited) || bLEOperationStatus.equals(BLEOperationStatus.Success.f1100a)) {
            return BLETerminalOperationStatus.Success.f1104a;
        }
        if (bLEOperationStatus instanceof BLEOperationStatus.InProgress) {
            return new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown("Terminal status conversion attempted on non terminal op status - InProgress"));
        }
        if (bLEOperationStatus instanceof BLEOperationStatus.NotStarted) {
            return new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown("Terminal status conversion attempted on non terminal op status - NotStarted"));
        }
        if (bLEOperationStatus instanceof BLEOperationStatus.Validate) {
            return new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown("Terminal status conversion attempted on non terminal op status - Validate"));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Object c(SilentRideOperation silentRideOperation, long j, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        BLEOperationExecutor$execute$1 bLEOperationExecutor$execute$1;
        long jE;
        long j2;
        boolean z2;
        SilentRideOperation silentRideOperation2;
        Mutex mutex;
        Mutex mutex2;
        String message;
        if (continuationImpl instanceof BLEOperationExecutor$execute$1) {
            bLEOperationExecutor$execute$1 = (BLEOperationExecutor$execute$1) continuationImpl;
            int i = bLEOperationExecutor$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEOperationExecutor$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEOperationExecutor$execute$1 = new BLEOperationExecutor$execute$1(this, continuationImpl);
            }
        } else {
            bLEOperationExecutor$execute$1 = new BLEOperationExecutor$execute$1(this, continuationImpl);
        }
        BLEOperationExecutor$execute$1 bLEOperationExecutor$execute$2 = bLEOperationExecutor$execute$1;
        Object objB = bLEOperationExecutor$execute$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = bLEOperationExecutor$execute$2.label;
        BLELoggingFeature bLELoggingFeature = this.b;
        try {
            try {
                if (r2 == 0) {
                    ResultKt.b(objB);
                    String message2 = "ExecuteBLEOperationCalled: operation = " + silentRideOperation.b + " opCode = " + silentRideOperation.getG();
                    Intrinsics.i(message2, "message");
                    jE = this.c.e();
                    bLEOperationExecutor$execute$2.L$0 = silentRideOperation;
                    MutexImpl mutexImpl = this.d;
                    bLEOperationExecutor$execute$2.L$1 = mutexImpl;
                    j2 = j;
                    bLEOperationExecutor$execute$2.J$0 = j2;
                    z2 = z;
                    bLEOperationExecutor$execute$2.Z$0 = z2;
                    bLEOperationExecutor$execute$2.J$1 = jE;
                    bLEOperationExecutor$execute$2.label = 1;
                    if (mutexImpl.a(bLEOperationExecutor$execute$2) != coroutineSingletons) {
                        silentRideOperation2 = silentRideOperation;
                        mutex = mutexImpl;
                    }
                    return coroutineSingletons;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) bLEOperationExecutor$execute$2.L$1;
                    silentRideOperation2 = (SilentRideOperation) bLEOperationExecutor$execute$2.L$0;
                    try {
                        ResultKt.b(objB);
                        mutex2.e(null);
                        return objB;
                    } catch (TimeoutCancellationException unused) {
                        bLELoggingFeature.b(silentRideOperation2);
                        BLETerminalOperationStatus.Failure failure = new BLETerminalOperationStatus.Failure(SilentRideOperationFailureReason.TimedOut.f1107a);
                        mutex2.e(null);
                        return failure;
                    } catch (Exception e) {
                        e = e;
                        bLELoggingFeature.a(silentRideOperation2, e);
                        message = e.getMessage();
                        if (message == null) {
                            message = "Unknown";
                        }
                        BLETerminalOperationStatus.Failure failure2 = new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown(message));
                        mutex2.e(null);
                        return failure2;
                    }
                }
                long j3 = bLEOperationExecutor$execute$2.J$1;
                boolean z3 = bLEOperationExecutor$execute$2.Z$0;
                j2 = bLEOperationExecutor$execute$2.J$0;
                Mutex mutex3 = (Mutex) bLEOperationExecutor$execute$2.L$1;
                SilentRideOperation silentRideOperation3 = (SilentRideOperation) bLEOperationExecutor$execute$2.L$0;
                ResultKt.b(objB);
                mutex = mutex3;
                jE = j3;
                silentRideOperation2 = silentRideOperation3;
                z2 = z3;
                BLEOperationExecutor$execute$2$1 bLEOperationExecutor$execute$2$1 = new BLEOperationExecutor$execute$2$1(jE, this, silentRideOperation2, null, z2);
                bLEOperationExecutor$execute$2.L$0 = silentRideOperation2;
                bLEOperationExecutor$execute$2.L$1 = mutex;
                bLEOperationExecutor$execute$2.J$0 = j2;
                bLEOperationExecutor$execute$2.label = 2;
                objB = TimeoutKt.b(j2, bLEOperationExecutor$execute$2$1, bLEOperationExecutor$execute$2);
                if (objB != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex2.e(null);
                    return objB;
                }
                return coroutineSingletons;
            } catch (TimeoutCancellationException unused2) {
                mutex2 = mutex;
                bLELoggingFeature.b(silentRideOperation2);
                BLETerminalOperationStatus.Failure failure3 = new BLETerminalOperationStatus.Failure(SilentRideOperationFailureReason.TimedOut.f1107a);
                mutex2.e(null);
                return failure3;
            } catch (Exception e2) {
                e = e2;
                mutex2 = mutex;
                bLELoggingFeature.a(silentRideOperation2, e);
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown";
                }
                BLETerminalOperationStatus.Failure failure4 = new BLETerminalOperationStatus.Failure(new SilentRideOperationFailureReason.Unknown(message));
                mutex2.e(null);
                return failure4;
            } catch (Throwable th) {
                th = th;
                r2 = mutex;
                r2.e(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
