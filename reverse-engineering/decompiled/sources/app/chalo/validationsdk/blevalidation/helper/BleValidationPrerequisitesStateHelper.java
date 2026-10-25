package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.ble_communication.base.BLEOperationResult;
import app.chalo.ble_communication.feature.BLEPermissionRequirement;
import app.chalo.ble_communication.feature.BLEState;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature;
import app.chalo.ble_communication.feature.BluetoothTurnOnFailureReason;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.domain.configuration.ShouldShowBleTutorialUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.ShouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationPrerequisitesStateHelper;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleValidationPrerequisitesStateHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothHardwareOperationsFeature f10536a;
    public final BluetoothPermissionAndSystemFeature b;
    public final ShouldShowBleTutorialUseCase c;
    public final TrackBleTutorialShownUseCase d;
    public final ShouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase e;
    public final ContextScope f;
    public final MutableStateFlow g = StateFlowKt.a(BleValidationPrerequisitesState.UNKNOWN);
    public Set h;
    public boolean i;
    public ValidationProduct j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10537a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BLEState.values().length];
            try {
                iArr[BLEState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEState.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEState.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10537a = iArr;
            int[] iArr2 = new int[BluetoothTurnOnFailureReason.values().length];
            try {
                iArr2[BluetoothTurnOnFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BluetoothTurnOnFailureReason.BLE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BluetoothTurnOnFailureReason.TURN_ON_OPERATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BluetoothTurnOnFailureReason.BLUETOOTH_NEEDS_TO_BE_TURNED_ON_MANUALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public BleValidationPrerequisitesStateHelper(BluetoothHardwareOperationsFeature bluetoothHardwareOperationsFeature, CoroutineContextProvider coroutineContextProvider, BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature, ShouldShowBleTutorialUseCase shouldShowBleTutorialUseCase, TrackBleTutorialShownUseCase trackBleTutorialShownUseCase, ShouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase shouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase) {
        this.f10536a = bluetoothHardwareOperationsFeature;
        this.b = bluetoothPermissionAndSystemFeature;
        this.c = shouldShowBleTutorialUseCase;
        this.d = trackBleTutorialShownUseCase;
        this.e = shouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase;
        this.f = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        BleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1 bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1;
        if (continuationImpl instanceof BleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1) {
            bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1 = (BleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1) continuationImpl;
            int i = bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1 = new BleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1(this, continuationImpl);
            }
        } else {
            bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1 = new BleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1(this, continuationImpl);
        }
        Object objC = bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objC);
            BLEPermissionRequirement bLEPermissionRequirementB = b();
            bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1.label = 1;
            objC = this.b.c(bLEPermissionRequirementB, bleValidationPrerequisitesStateHelper$areBlePermissionsGranted$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            z = false;
        } else if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z);
    }

    public final BLEPermissionRequirement b() {
        Set set = this.h;
        if (set != null) {
            return this.b.f(set);
        }
        Intrinsics.q("requiredBleCommServices");
        throw null;
    }

    public final Object c(boolean z, ContinuationImpl continuationImpl) {
        boolean z2 = this.i;
        MutableStateFlow mutableStateFlow = this.g;
        if (!z2) {
            Object objEmit = mutableStateFlow.emit(BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_RATIONALE_BOTTOMSHEET, continuationImpl);
            if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objEmit;
            }
        } else if (z) {
            Object objEmit2 = mutableStateFlow.emit(BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_EXPLAINER_FULL_SCREEN_WITH_QR_OPTION, continuationImpl);
            if (objEmit2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = mutableStateFlow.emit(BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_EXPLAINER_FULL_SCREEN_WITHOUT_QR_OPTION, continuationImpl);
            if (objEmit3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objEmit3;
            }
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Continuation continuation) {
        BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1 bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1;
        if (continuation instanceof BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1) {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1 = (BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1) continuation;
            int i = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1 = new BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1(this, continuation);
            }
        } else {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1 = new BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1(this, continuation);
        }
        Object objD = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label;
        Object obj2 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            BLEPermissionRequirement bLEPermissionRequirementB = b();
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = 1;
            objD = this.f10536a.d(bLEPermissionRequirementB, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objD);
                return obj2;
            }
            if (i2 == 3) {
                ResultKt.b(objD);
                return obj2;
            }
            if (i2 == 4) {
                ResultKt.b(objD);
                return obj2;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return obj2;
        }
        ResultKt.b(objD);
        BLEOperationResult bLEOperationResult = (BLEOperationResult) objD;
        if (bLEOperationResult instanceof BLEOperationResult.Failure) {
            int i3 = WhenMappings.b[((BluetoothTurnOnFailureReason) ((BLEOperationResult.Failure) bLEOperationResult).f1109a).ordinal()];
            if (i3 != 1) {
                MutableStateFlow mutableStateFlow = this.g;
                if (i3 == 2) {
                    bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = 3;
                    mutableStateFlow.emit(BleValidationPrerequisitesState.BLE_NOT_AVAILABLE_ON_DEVICE, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1);
                    if (obj2 == obj) {
                        return obj;
                    }
                } else if (i3 == 3) {
                    bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = 4;
                    mutableStateFlow.emit(BleValidationPrerequisitesState.BLE_TURN_ON_OPERATION_FAILED, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1);
                    if (obj2 == obj) {
                        return obj;
                    }
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = 5;
                    mutableStateFlow.emit(BleValidationPrerequisitesState.ASK_TO_MANUALLY_TURN_ON_BLUETOOTH, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1);
                    if (obj2 == obj) {
                        return obj;
                    }
                }
            } else {
                bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1.label = 2;
                if (c(false, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1) == obj) {
                    return obj;
                }
            }
        } else if (!(bLEOperationResult instanceof BLEOperationResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation continuation) {
        BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1 bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1;
        boolean zBooleanValue;
        MutableStateFlow mutableStateFlow;
        BleValidationPrerequisitesState bleValidationPrerequisitesState;
        BleValidationPrerequisitesState bleValidationPrerequisitesState2;
        if (continuation instanceof BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1 = (BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) continuation;
            int i = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1 = new BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1(this, continuation);
            }
        } else {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1 = new BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1(this, continuation);
        }
        Object objC = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            BLEPermissionRequirement bLEPermissionRequirementB = b();
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 1;
            objC = this.b.c(bLEPermissionRequirementB, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                ResultKt.b(objC);
                return unit;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ResultKt.b(objC);
                    return unit;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return unit;
            }
            ResultKt.b(objC);
        }
        zBooleanValue = ((Boolean) objC).booleanValue();
        mutableStateFlow = this.g;
        if (zBooleanValue) {
            bleValidationPrerequisitesState2 = BleValidationPrerequisitesState.SHOW_TAP_TO_VALIDATE_BOTTOMSHEET_TUTORIAL;
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 4;
            if (mutableStateFlow.emit(bleValidationPrerequisitesState2, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) == obj) {
                return obj;
            }
            return unit;
        }
        bleValidationPrerequisitesState = BleValidationPrerequisitesState.CAN_RUN_BLE_VALIDATION_OPERATION;
        bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 5;
        if (mutableStateFlow.emit(bleValidationPrerequisitesState, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) == obj) {
            return obj;
        }
        return unit;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 2;
            if (c(false, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ValidationProduct validationProduct = this.j;
        if (validationProduct != null) {
            bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 3;
            objC = this.c.a(validationProduct, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1);
            if (objC != obj) {
                zBooleanValue = ((Boolean) objC).booleanValue();
                mutableStateFlow = this.g;
                if (zBooleanValue) {
                    bleValidationPrerequisitesState2 = BleValidationPrerequisitesState.SHOW_TAP_TO_VALIDATE_BOTTOMSHEET_TUTORIAL;
                    bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 4;
                    if (mutableStateFlow.emit(bleValidationPrerequisitesState2, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) == obj) {
                    }
                } else {
                    bleValidationPrerequisitesState = BleValidationPrerequisitesState.CAN_RUN_BLE_VALIDATION_OPERATION;
                    bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1.label = 5;
                    if (mutableStateFlow.emit(bleValidationPrerequisitesState, bleValidationPrerequisitesStateHelper$handleBluetoothTurnedOn$1) == obj) {
                    }
                }
            }
            return obj;
        }
        return unit;
    }

    public final void f(ValidationProduct validationProduct, Set set) {
        Intrinsics.i(validationProduct, "validationProduct");
        this.j = validationProduct;
        this.h = set;
        BuildersKt.d(this.f, null, null, new BleValidationPrerequisitesStateHelper$startOperation$1(this, null), 3);
    }

    public final Object g(BLEState bLEState, Continuation continuation) {
        int i = WhenMappings.f10537a[bLEState.ordinal()];
        Unit unit = Unit.f17538a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objD = d(continuation);
                return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : unit;
            }
            Object objE = e(continuation);
            if (objE == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objE;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        BleValidationPrerequisitesStateHelper$onPermissionsUpdated$1 bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1;
        boolean zBooleanValue;
        if (continuationImpl instanceof BleValidationPrerequisitesStateHelper$onPermissionsUpdated$1) {
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1 = (BleValidationPrerequisitesStateHelper$onPermissionsUpdated$1) continuationImpl;
            int i = bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1 = new BleValidationPrerequisitesStateHelper$onPermissionsUpdated$1(this, continuationImpl);
            }
        } else {
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1 = new BleValidationPrerequisitesStateHelper$onPermissionsUpdated$1(this, continuationImpl);
        }
        Object objA = bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.L$0 = validationProduct;
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = 1;
            objA = a(bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            validationProduct = (ValidationProduct) bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                ResultKt.b(objA);
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            ResultKt.b(objA);
        }
        zBooleanValue = ((Boolean) objA).booleanValue();
        bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = 4;
        if (c(zBooleanValue, bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1) != obj) {
            return obj;
        }
        return unit;
        if (((Boolean) objA).booleanValue()) {
            BLEState bLEState = (BLEState) this.f10536a.b().getValue();
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.L$0 = null;
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = 2;
            if (g(bLEState, bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1) != obj) {
                return unit;
            }
        } else {
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.L$0 = null;
            bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = 3;
            objA = this.e.a(validationProduct, bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1);
            if (objA != obj) {
                zBooleanValue = ((Boolean) objA).booleanValue();
                bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1.label = 4;
                if (c(zBooleanValue, bleValidationPrerequisitesStateHelper$onPermissionsUpdated$1) != obj) {
                    return unit;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r5.g.emit(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper$onTapToValidateBottomsheetTutorialOkClicked$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper$onTapToValidateBottomsheetTutorialOkClicked$1 r0 = (app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper$onTapToValidateBottomsheetTutorialOkClicked$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper$onTapToValidateBottomsheetTutorialOkClicked$1 r0 = new app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper$onTapToValidateBottomsheetTutorialOkClicked$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase r6 = r5.d
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L50
        L44:
            app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState r6 = app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState.CAN_RUN_BLE_VALIDATION_OPERATION
            r0.label = r3
            kotlinx.coroutines.flow.MutableStateFlow r2 = r5.g
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper.i(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
