package app.chalo.ble_communication.feature;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.ble_communication.base.BLEOperationResult;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.constants.Source;
import app.chalo.extensions.FlowExtentionsKt;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/BluetoothHardwareOperationsFeatureAndroid;", "Lapp/chalo/ble_communication/feature/BluetoothHardwareOperationsFeature;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothHardwareOperationsFeatureAndroid implements BluetoothHardwareOperationsFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1117a;
    public final CoroutineContextProvider b;
    public final AnalyticsContract c;
    public final IsBluetoothFeatureAvailableUseCase d;
    public final BluetoothPermissionAndSystemFeature e;
    public final BluetoothAdapter f;
    public final MutexImpl g = MutexKt.a();
    public final ContextScope h;
    public final MutableStateFlow i;

    public BluetoothHardwareOperationsFeatureAndroid(Context context, CoroutineContextProvider coroutineContextProvider, AnalyticsContract analyticsContract, IsBluetoothFeatureAvailableUseCase isBluetoothFeatureAvailableUseCase, BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature, BluetoothAdapter bluetoothAdapter) {
        this.f1117a = context;
        this.b = coroutineContextProvider;
        this.c = analyticsContract;
        this.d = isBluetoothFeatureAvailableUseCase;
        this.e = bluetoothPermissionAndSystemFeature;
        this.f = bluetoothAdapter;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.h = contextScopeA;
        this.i = StateFlowKt.a(BLEState.UNKNOWN);
        BuildersKt.d(contextScopeA, null, null, new BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, BLEState bLEState, ContinuationImpl continuationImpl) {
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1;
        BLEState bLEState2;
        bluetoothHardwareOperationsFeatureAndroid.getClass();
        if (continuationImpl instanceof BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1) {
            bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1 = (BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1) continuationImpl;
            int i = bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.label = i - Integer.MIN_VALUE;
            } else {
                bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1(bluetoothHardwareOperationsFeatureAndroid, continuationImpl);
            }
        } else {
            bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1(bluetoothHardwareOperationsFeatureAndroid, continuationImpl);
        }
        Object objE = bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.L$0 = bLEState;
            bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.label = 1;
            objE = FlowKt.e(new BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2(bluetoothHardwareOperationsFeatureAndroid, null));
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bLEState = (BLEState) bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.L$0;
            ResultKt.b(objE);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bLEState2 = (BLEState) bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.L$0;
            ResultKt.b(objE);
        }
        Pair pair = (Pair) objE;
        BLEState bLEState3 = pair != null ? (BLEState) pair.d() : null;
        g("stateAfterUpdate=" + bLEState3);
        return Boolean.valueOf(bLEState3 == bLEState2);
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(FlowExtentionsKt.b(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1((Flow) objE, FlowKt.y(new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1(bLEState, bluetoothHardwareOperationsFeatureAndroid, null)), new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2(bLEState, bluetoothHardwareOperationsFeatureAndroid, null)), 5000L), new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3(bluetoothHardwareOperationsFeatureAndroid, null));
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4(bLEState, null);
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.L$0 = bLEState;
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1.label = 2;
        objE = FlowKt.w(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4, bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$1);
        if (objE != obj) {
            bLEState2 = bLEState;
            Pair pair2 = (Pair) objE;
            if (pair2 != null) {
            }
            g("stateAfterUpdate=" + bLEState3);
            return Boolean.valueOf(bLEState3 == bLEState2);
        }
        return obj;
    }

    public static void g(String message) {
        Intrinsics.i(message, "message");
    }

    @Override // app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature
    public final void a() {
        CoroutineScopeKt.b(this.h, null);
    }

    @Override // app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature
    public final StateFlow b() {
        return FlowKt.c(this.i);
    }

    @Override // app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature
    public final boolean c() {
        return this.f.isEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0106 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010f A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:59:0x00e5, B:61:0x00f5, B:62:0x00fb, B:21:0x0048, B:41:0x009c, B:43:0x00a2, B:46:0x00ad, B:48:0x00b1, B:50:0x00b7, B:52:0x00bd, B:55:0x00c8, B:65:0x0106, B:68:0x010f, B:69:0x0114, B:28:0x006d, B:30:0x0073, B:33:0x007c, B:35:0x0084, B:38:0x008f), top: B:72:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature
    public final Object d(BLEPermissionRequirement bLEPermissionRequirement, ContinuationImpl continuationImpl) {
        BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1 bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1;
        BLEPermissionRequirement bLEPermissionRequirement2;
        Mutex mutex;
        ChaloUseCaseResult chaloUseCaseResult;
        long jCurrentTimeMillis;
        long j;
        boolean zBooleanValue;
        Object failure;
        if (continuationImpl instanceof BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1) {
            bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1 = (BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1) continuationImpl;
            int i = bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1(this, continuationImpl);
            }
        } else {
            bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1(this, continuationImpl);
        }
        Object objC = bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label;
        BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature = this.e;
        BluetoothAdapter bluetoothAdapter = this.f;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0 = bLEPermissionRequirement;
                MutexImpl mutexImpl = this.g;
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$1 = mutexImpl;
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label = 1;
                if (mutexImpl.a(bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1) != obj) {
                    bLEPermissionRequirement2 = bLEPermissionRequirement;
                    mutex = mutexImpl;
                }
                return obj;
            }
            if (i2 == 1) {
                mutex = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$1;
                BLEPermissionRequirement bLEPermissionRequirement3 = (BLEPermissionRequirement) bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0;
                ResultKt.b(objC);
                bLEPermissionRequirement2 = bLEPermissionRequirement3;
            } else {
                if (i2 == 2) {
                    mutex = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0;
                    ResultKt.b(objC);
                    chaloUseCaseResult = (ChaloUseCaseResult) objC;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        BLEOperationResult.Failure failure2 = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED);
                        mutex.e(null);
                        return failure2;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!bluetoothAdapter.isEnabled()) {
                        BLEOperationResult.Success success = new BLEOperationResult.Success();
                        mutex.e(null);
                        return success;
                    }
                    if (bluetoothPermissionAndSystemFeature.d()) {
                        BLEOperationResult.Failure failure3 = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.BLUETOOTH_NEEDS_TO_BE_TURNED_ON_MANUALLY);
                        mutex.e(null);
                        return failure3;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    DefaultIoScheduler defaultIoSchedulerB = this.b.b();
                    BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1 bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1(this, null);
                    bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0 = mutex;
                    bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.J$0 = jCurrentTimeMillis;
                    bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label = 3;
                    objC = BuildersKt.g(defaultIoSchedulerB, bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1, bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1);
                    if (objC != obj) {
                        j = jCurrentTimeMillis;
                    }
                    return obj;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.J$0;
                mutex = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0;
                ResultKt.b(objC);
            }
            zBooleanValue = ((Boolean) objC).booleanValue();
            i(System.currentTimeMillis() - j, zBooleanValue);
            if (zBooleanValue) {
                failure = new BLEOperationResult.Success();
            } else {
                failure = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.TURN_ON_OPERATION_FAILED);
            }
            mutex.e(null);
            return failure;
            if (bluetoothAdapter.isEnabled()) {
                BLEOperationResult.Success success2 = new BLEOperationResult.Success();
                mutex.e(null);
                return success2;
            }
            if (!this.d.a()) {
                BLEOperationResult.Failure failure4 = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.BLE_NOT_AVAILABLE_ON_DEVICE);
                mutex.e(null);
                return failure4;
            }
            bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0 = mutex;
            bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$1 = null;
            bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label = 2;
            objC = bluetoothPermissionAndSystemFeature.c(bLEPermissionRequirement2, bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1);
            if (objC != obj) {
                chaloUseCaseResult = (ChaloUseCaseResult) objC;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    BLEOperationResult.Failure failure5 = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED);
                    mutex.e(null);
                    return failure5;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!bluetoothAdapter.isEnabled()) {
                    BLEOperationResult.Success success3 = new BLEOperationResult.Success();
                    mutex.e(null);
                    return success3;
                }
                if (bluetoothPermissionAndSystemFeature.d()) {
                    BLEOperationResult.Failure failure6 = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.BLUETOOTH_NEEDS_TO_BE_TURNED_ON_MANUALLY);
                    mutex.e(null);
                    return failure6;
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                DefaultIoScheduler defaultIoSchedulerB2 = this.b.b();
                BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1 bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$2 = new BluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$1(this, null);
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.L$0 = mutex;
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.J$0 = jCurrentTimeMillis;
                bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1.label = 3;
                objC = BuildersKt.g(defaultIoSchedulerB2, bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$2$switchBluetoothResult$2, bluetoothHardwareOperationsFeatureAndroid$turnOnBluetoothIfNeeded$1);
                if (objC != obj) {
                    j = jCurrentTimeMillis;
                    zBooleanValue = ((Boolean) objC).booleanValue();
                    i(System.currentTimeMillis() - j, zBooleanValue);
                    if (zBooleanValue) {
                        failure = new BLEOperationResult.Success();
                    } else {
                        failure = new BLEOperationResult.Failure(BluetoothTurnOnFailureReason.TURN_ON_OPERATION_FAILED);
                    }
                    mutex.e(null);
                    return failure;
                }
            }
            return obj;
        } catch (Throwable th) {
            bLEPermissionRequirement.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:45:0x00a2, B:47:0x00a8, B:50:0x00b3, B:52:0x00b7, B:62:0x00f6, B:63:0x00fb), top: B:68:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:45:0x00a2, B:47:0x00a8, B:50:0x00b3, B:52:0x00b7, B:62:0x00f6, B:63:0x00fb), top: B:68:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:45:0x00a2, B:47:0x00a8, B:50:0x00b3, B:52:0x00b7, B:62:0x00f6, B:63:0x00fb), top: B:68:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:56:0x00d5, B:58:0x00e5, B:59:0x00eb), top: B:66:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:56:0x00d5, B:58:0x00e5, B:59:0x00eb), top: B:66:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:45:0x00a2, B:47:0x00a8, B:50:0x00b3, B:52:0x00b7, B:62:0x00f6, B:63:0x00fb), top: B:68:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature
    public final Object e(ContinuationImpl continuationImpl) throws Throwable {
        BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1 bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        ChaloUseCaseResult chaloUseCaseResult;
        long jCurrentTimeMillis;
        long j;
        boolean zBooleanValue;
        Object failure;
        if (continuationImpl instanceof BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1) {
            bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1 = (BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1) continuationImpl;
            int i = bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1(this, continuationImpl);
            }
        } else {
            bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1(this, continuationImpl);
        }
        Object objG = bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                mutex = this.g;
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0 = mutex;
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label = 1;
                if (mutex.a(bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    mutex3 = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0;
                    try {
                        ResultKt.b(objG);
                        chaloUseCaseResult = (ChaloUseCaseResult) objG;
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            BLEOperationResult.Failure failure2 = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED);
                            mutex3.e(null);
                            return failure2;
                        }
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        DefaultIoScheduler defaultIoSchedulerB = this.b.b();
                        BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1 bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1 = new BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1(this, null);
                        bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0 = mutex3;
                        bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.J$0 = jCurrentTimeMillis;
                        bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label = 3;
                        objG = BuildersKt.g(defaultIoSchedulerB, bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1, bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1);
                        if (objG != coroutineSingletons) {
                            mutex2 = mutex3;
                            j = jCurrentTimeMillis;
                            zBooleanValue = ((Boolean) objG).booleanValue();
                            h(System.currentTimeMillis() - j, zBooleanValue);
                            if (zBooleanValue) {
                                failure = new BLEOperationResult.Success();
                            } else {
                                failure = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.TURN_OFF_OPERATION_FAILED);
                            }
                            mutex2.e(null);
                            return failure;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.J$0;
                    mutex2 = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0;
                    try {
                        ResultKt.b(objG);
                        zBooleanValue = ((Boolean) objG).booleanValue();
                        h(System.currentTimeMillis() - j, zBooleanValue);
                        if (zBooleanValue) {
                            failure = new BLEOperationResult.Success();
                        } else {
                            failure = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.TURN_OFF_OPERATION_FAILED);
                        }
                        mutex2.e(null);
                        return failure;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                mutex2.e(null);
                throw th;
            }
            Mutex mutex4 = (Mutex) bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0;
            ResultKt.b(objG);
            mutex = mutex4;
            if (!this.f.isEnabled()) {
                BLEOperationResult.Success success = new BLEOperationResult.Success();
                mutex.e(null);
                return success;
            }
            if (!this.d.a()) {
                BLEOperationResult.Failure failure3 = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.BLE_NOT_AVAILABLE_ON_DEVICE);
                mutex.e(null);
                return failure3;
            }
            BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature = this.e;
            BLEPermissionRequirement bLEPermissionRequirement = BLEPermissionRequirement.SCANNING_PERMISSION_NOT_REQUIRED;
            bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0 = mutex;
            bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label = 2;
            Object objC = bluetoothPermissionAndSystemFeature.c(bLEPermissionRequirement, bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1);
            if (objC != coroutineSingletons) {
                mutex3 = mutex;
                objG = objC;
                chaloUseCaseResult = (ChaloUseCaseResult) objG;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    BLEOperationResult.Failure failure4 = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED);
                    mutex3.e(null);
                    return failure4;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                DefaultIoScheduler defaultIoSchedulerB2 = this.b.b();
                BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1 bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$2 = new BluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$1(this, null);
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.L$0 = mutex3;
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.J$0 = jCurrentTimeMillis;
                bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1.label = 3;
                objG = BuildersKt.g(defaultIoSchedulerB2, bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$2$switchBluetoothResult$2, bluetoothHardwareOperationsFeatureAndroid$turnOffBluetoothIfNeeded$1);
                if (objG != coroutineSingletons) {
                    mutex2 = mutex3;
                    j = jCurrentTimeMillis;
                    zBooleanValue = ((Boolean) objG).booleanValue();
                    h(System.currentTimeMillis() - j, zBooleanValue);
                    if (zBooleanValue) {
                        failure = new BLEOperationResult.Success();
                    } else {
                        failure = new BLEOperationResult.Failure(BluetoothTurnOffFailureReason.TURN_OFF_OPERATION_FAILED);
                    }
                    mutex2.e(null);
                    return failure;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
        }
    }

    public final void h(long j, boolean z) {
        AnalyticsContract.DefaultImpls.a(this.c, "BLE system bluetooth turned on", Source.BLE_COMMUNICATION_FEATURE.getSourceName(), MapsKt.i(new Pair("timeTaken", Long.valueOf(j)), new Pair("turnBluetoothOnResult", Boolean.valueOf(z))), null, false, 24);
    }

    public final void i(long j, boolean z) {
        AnalyticsContract.DefaultImpls.a(this.c, "BLE system bluetooth turned on", Source.BLE_COMMUNICATION_FEATURE.getSourceName(), MapsKt.i(new Pair("timeTaken", Long.valueOf(j)), new Pair("turnBluetoothOnResult", Boolean.valueOf(z))), null, false, 24);
    }
}
