package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason;
import app.chalo.ble_communication.BLEDataTransmissionFailureReason;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.notification.core.GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1;
import app.chalo.notification.models.AppNotification;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.ridefeedbacktracker.ChaloRideFeedbackCollectionHelper;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.GetRideFeedbackDataUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.resources.GetRemoteResourcesUrlConfigUseCase;
import app.chalo.utils.resources.RemoteResourcesUrlConfig;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetRegularBusBLEValidationPayloadUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetTitoTapOutBlePayloadUseCase;
import app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationStoppingReason;
import app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper;
import app.chalo.validationsdk.blevalidation.helper.GetTwoWayBleCommPilotConfigUseCase;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorProvider;
import app.chalo.validationsdk.legacy.Product;
import com.arkivanov.decompose.ComponentContext;
import defpackage.g;
import defpackage.k2;
import defpackage.ua;
import defpackage.v5;
import defpackage.va;
import defpackage.vo1;
import defpackage.wa;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationFragmentComponentAndroid;", "Lapp/chalo/validationsdk/blevalidation/ui/BleValidationFragmentComponent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleValidationFragmentComponentAndroid extends BleValidationFragmentComponent {
    public final ChaloRideFeedbackCollectionHelper A;
    public final ArePermissionsGrantedUseCase B;
    public final PermissionHandlerProvider C;
    public final SystemHelper D;
    public final ChaloNavigationManager E;
    public final IReportProblemFeature F;
    public final KotlinToastManager G;
    public final GCMReceiver H;
    public final DeviceNfcTapPaySuppressorProvider I;
    public ProductValidationAnalyticManager J;
    public Integer K;
    public Job L;
    public boolean M;
    public final long N;
    public final ValidationArgs.BleValidationScreenArgs k;
    public final ProductValidationConfigProvider l;
    public final BleValidationPrerequisitesStateHelper m;
    public final BleValidationDynamicInfoHelper n;
    public final BleValidationWithTwoWayPilotHelper o;
    public final BleValidationProcessCompletionHelper p;
    public final GetRemoteResourcesUrlConfigUseCase q;
    public final GetRegularBusProductValidationMethodUseCase r;
    public final GetTwoWayBleCommPilotConfigUseCase s;
    public final BasicInfoContract t;
    public final StringProvider u;
    public final BluetoothPermissionAndSystemFeature v;
    public final CoroutineContextProvider w;
    public final GetRegularBusBLEValidationPayloadUseCase x;
    public final GetTitoTapOutBlePayloadUseCase y;
    public final GetRideFeedbackDataUseCase z;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$1", f = "BleValidationFragmentComponent.android.kt", l = {148}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BleValidationFragmentComponentAndroid.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1 gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C = BleValidationFragmentComponentAndroid.this.H.c(Reflection.a(AppNotification.PunchNotification.class));
                final BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = BleValidationFragmentComponentAndroid.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        bleValidationFragmentComponentAndroid.C0(new BleValidationIntent.PunchReceivedIntent((AppNotification.PunchNotification) obj2));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10570a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[BleValidationCompletionType.values().length];
            try {
                iArr[BleValidationCompletionType.CONDUCTOR_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleValidationCompletionType.TITO_TAP_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10570a = iArr;
            int[] iArr2 = new int[BleValidationLayoutType.values().length];
            try {
                iArr2[BleValidationLayoutType.BLE_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BleValidationLayoutType.BLE_TURN_ON_FULL_SCREEN_EXPLAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BleValidationLayoutType.NEARBY_DEVICES_FULL_SCREEN_EXPLAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BleValidationLayoutType.SWITCH_TO_QR_VALIDATION_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BleValidationLayoutType.QR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[BleValidationPrerequisitesState.values().length];
            try {
                iArr3[BleValidationPrerequisitesState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_RATIONALE_BOTTOMSHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.ASK_FOR_BLE_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_EXPLAINER_FULL_SCREEN_WITHOUT_QR_OPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.SHOW_NEARBY_DEVICES_PERMISSION_EXPLAINER_FULL_SCREEN_WITH_QR_OPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.SHOW_TURN_ON_BLE_FULL_SCREEN_EXPLAINER.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.ASK_TO_MANUALLY_TURN_ON_BLUETOOTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.SHOW_TAP_TO_VALIDATE_BOTTOMSHEET_TUTORIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.CAN_RUN_BLE_VALIDATION_OPERATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.BLE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[BleValidationPrerequisitesState.BLE_TURN_ON_OPERATION_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            c = iArr3;
            int[] iArr4 = new int[BLEDataTransmissionFailureReason.values().length];
            try {
                iArr4[BLEDataTransmissionFailureReason.REQUIRED_PERMISSIONS_NOT_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.BLE_TURN_ON_OPERATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.CONNECTION_BUSY.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.TIMED_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[BLEDataTransmissionFailureReason.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            d = iArr4;
            int[] iArr5 = new int[BLECommunicationServiceInitializationFailureReason.values().length];
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.REQUIRED_PERMISSIONS_NOT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_TURN_ON_OPERATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_TIMED_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.REJECTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[BLECommunicationServiceInitializationFailureReason.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused44) {
            }
            e = iArr5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid(ValidationArgs.BleValidationScreenArgs args, ProductValidationConfigProvider productValidationConfigProvider, BleValidationPrerequisitesStateHelper bleValidationPrerequisitesStateHelper, BleValidationDynamicInfoHelper bleValidationDynamicInfoHelper, BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, GetRemoteResourcesUrlConfigUseCase getRemoteResourcesUrlConfigUseCase, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, GetTwoWayBleCommPilotConfigUseCase getTwoWayBleCommPilotConfigUseCase, BasicInfoContract basicInfoContract, StringProvider stringProvider, BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature, CoroutineContextProvider coroutineContextProvider, GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase, GetTitoTapOutBlePayloadUseCase getTitoTapOutBlePayloadUseCase, GetRideFeedbackDataUseCase getRideFeedbackDataUseCase, ChaloRideFeedbackCollectionHelper chaloRideFeedbackCollectionHelper, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, PermissionHandlerProvider permissionHandlerProvider, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager, IReportProblemFeature iReportProblemFeature, KotlinToastManager kotlinToastManager, GCMReceiver gCMReceiver, DeviceNfcTapPaySuppressorProvider deviceNfcTapPaySuppressorProvider, ComponentContext componentContext) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = args;
        this.l = productValidationConfigProvider;
        this.m = bleValidationPrerequisitesStateHelper;
        this.n = bleValidationDynamicInfoHelper;
        this.o = bleValidationWithTwoWayPilotHelper;
        this.p = bleValidationProcessCompletionHelper;
        this.q = getRemoteResourcesUrlConfigUseCase;
        this.r = getRegularBusProductValidationMethodUseCase;
        this.s = getTwoWayBleCommPilotConfigUseCase;
        this.t = basicInfoContract;
        this.u = stringProvider;
        this.v = bluetoothPermissionAndSystemFeature;
        this.w = coroutineContextProvider;
        this.x = getRegularBusBLEValidationPayloadUseCase;
        this.y = getTitoTapOutBlePayloadUseCase;
        this.z = getRideFeedbackDataUseCase;
        this.A = chaloRideFeedbackCollectionHelper;
        this.B = arePermissionsGrantedUseCase;
        this.C = permissionHandlerProvider;
        this.D = systemHelper;
        this.E = chaloNavigationManager;
        this.F = iReportProblemFeature;
        this.G = kotlinToastManager;
        this.H = gCMReceiver;
        this.I = deviceNfcTapPaySuppressorProvider;
        this.N = 5000L;
        C0(new BleValidationIntent.InitializationIntent(args.b));
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object F0(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, ContinuationImpl continuationImpl) {
        BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1 bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1;
        ProductValidationData productValidationData;
        StateFlow stateFlow = bleValidationFragmentComponentAndroid.f;
        if (continuationImpl instanceof BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1) {
            bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1 = (BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1) continuationImpl;
            int i = bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1 = new BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1(bleValidationFragmentComponentAndroid, continuationImpl);
            }
        } else {
            bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1 = new BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1(bleValidationFragmentComponentAndroid, continuationImpl);
        }
        Object obj = bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                bleValidationFragmentComponentAndroid.V0(true);
                long j = bleValidationFragmentComponentAndroid.N;
                BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2 bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2 = new BleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2(bleValidationFragmentComponentAndroid, null);
                bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label = 1;
                Object objB = TimeoutKt.b(j, bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$2, bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1);
                bleValidationFragmentComponentAndroid = objB;
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.b(obj);
                        bleValidationFragmentComponentAndroid.V0(false);
                        return Unit.f17538a;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    bleValidationFragmentComponentAndroid.V0(false);
                    return Unit.f17538a;
                }
                ResultKt.b(obj);
                bleValidationFragmentComponentAndroid = bleValidationFragmentComponentAndroid;
            }
        } catch (TimeoutCancellationException unused) {
            ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationFragmentComponentAndroid.J;
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) stateFlow.getValue()).j;
            productValidationData = bleValidationMetaData != null ? bleValidationMetaData.b : null;
            if (productValidationAnalyticManager != null && productValidationData != null) {
                Source source = Source.BLE_VALIDATION_ACTIVITY;
                bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label = 2;
                if (productValidationAnalyticManager.n(productValidationData, "timedOut", source, bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e) {
            ProductValidationAnalyticManager productValidationAnalyticManager2 = bleValidationFragmentComponentAndroid.J;
            BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) stateFlow.getValue()).j;
            productValidationData = bleValidationMetaData2 != null ? bleValidationMetaData2.b : null;
            if (productValidationAnalyticManager2 != null && productValidationData != null) {
                String strM = vo1.m("exception ", e.getMessage());
                Source source2 = Source.BLE_VALIDATION_ACTIVITY;
                bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1.label = 3;
                if (productValidationAnalyticManager2.n(productValidationData, strM, source2, bleValidationFragmentComponentAndroid$completeRequiredSyncingPostTitoTapOutValidation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, ContinuationImpl continuationImpl) {
        BleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1 bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1;
        bleValidationFragmentComponentAndroid.getClass();
        if (continuationImpl instanceof BleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1) {
            bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1 = (BleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1) continuationImpl;
            int i = bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1 = new BleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1(bleValidationFragmentComponentAndroid, continuationImpl);
            }
        } else {
            bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1 = new BleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1(bleValidationFragmentComponentAndroid, continuationImpl);
        }
        Object objA = bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            List listB = bleValidationFragmentComponentAndroid.v.b(false);
            if (listB.isEmpty()) {
                return Boolean.TRUE;
            }
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = bleValidationFragmentComponentAndroid.B;
            bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1.label = 1;
            objA = arePermissionsGrantedUseCase.a(listB, bleValidationFragmentComponentAndroid$isBluetoothPermissionGranted$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(ChaloLocationManagerKt.a((AppPermissionRequest) objA));
    }

    public static final Object H0(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, boolean z, SuspendLambda suspendLambda) {
        BleValidationMetaData bleValidationMetaData = ((BleValidationState) bleValidationFragmentComponentAndroid.f.getValue()).j;
        Unit unit = Unit.f17538a;
        if (bleValidationMetaData == null) {
            bleValidationFragmentComponentAndroid.Q0();
            return unit;
        }
        ProductValidationConfigProvider productValidationConfigProvider = bleValidationFragmentComponentAndroid.l;
        ValidationProduct validationProduct = bleValidationFragmentComponentAndroid.k.b.b;
        Intrinsics.i(productValidationConfigProvider, "<this>");
        Intrinsics.i(validationProduct, "validationProduct");
        Object objD = productValidationConfigProvider.a(validationProduct).getC().d(bleValidationMetaData.b, Source.BLE_VALIDATION_ACTIVITY.getSourceName(), bleValidationMetaData.e, bleValidationMetaData.f, z, suspendLambda);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : unit;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager.DefaultImpls.a(r1, "mpass activation duration expired dialog shown", r3, r4, null, r6, 24) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(500, r6) == r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I0(app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r10, app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$onValidationDynamicInfoUpdated$1
            if (r0 == 0) goto L17
            r0 = r12
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$onValidationDynamicInfoUpdated$1 r0 = (app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$onValidationDynamicInfoUpdated$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$onValidationDynamicInfoUpdated$1 r0 = new app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$onValidationDynamicInfoUpdated$1
            r0.<init>(r10, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L43
            if (r1 == r9) goto L3b
            if (r1 != r8) goto L33
            java.lang.Object r11 = r6.L$0
            app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo r11 = (app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo) r11
            kotlin.ResultKt.b(r12)
            goto L90
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r11 = r6.L$0
            app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo r11 = (app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo) r11
            kotlin.ResultKt.b(r12)
            goto L78
        L43:
            kotlin.ResultKt.b(r12)
            boolean r12 = r11.c
            if (r12 == 0) goto L83
            boolean r12 = r10.M
            if (r12 != 0) goto L83
            kotlinx.coroutines.flow.StateFlow r12 = r10.f
            java.lang.Object r12 = r12.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r12 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r12
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r12 = r12.j
            if (r12 == 0) goto L78
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r3 = r12.b
            if (r3 == 0) goto L78
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r1 = r10.J
            if (r1 == 0) goto L78
            app.chalo.constants.Source r12 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            java.lang.String r4 = r12.getSourceName()
            r6.L$0 = r11
            r6.label = r9
            java.lang.String r2 = "mpass activation duration expired dialog shown"
            r5 = 0
            r7 = 24
            java.lang.Object r12 = app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager.DefaultImpls.a(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L78
            goto L8f
        L78:
            app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper r12 = r10.o
            app.chalo.constants.Source r1 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            java.lang.String r2 = "product expired"
            app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper.g(r12, r1, r2)
            r10.M = r9
        L83:
            r6.L$0 = r11
            r6.label = r8
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r1, r6)
            if (r12 != r0) goto L90
        L8f:
            return r0
        L90:
            g r12 = new g
            r0 = 18
            r12.<init>(r11, r0)
            r10.E0(r12)
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.I0(app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid, app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:101:0x028a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0290  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:29:0x012f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:37:0x0168  */
    /* JADX WARN: Code duplicated, block: B:40:0x019d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f0 A[PHI: r1 r4 r5 r11 r14 r15 r16
      0x01f0: PHI (r1v31 ??) = (r1v53 ??), (r1v54 ??) binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r4v20 app.chalo.validationsdk.blevalidation.ui.BleValidationDialogInfo) = 
      (r4v16 app.chalo.validationsdk.blevalidation.ui.BleValidationDialogInfo)
      (r4v24 app.chalo.validationsdk.blevalidation.ui.BleValidationDialogInfo)
     binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r5v17 app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetInfo) = 
      (r5v12 app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetInfo)
      (r5v21 app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetInfo)
     binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r11v8 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r11v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r11v11 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r14v6 app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo) = 
      (r14v3 app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo)
      (r14v9 app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo)
     binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r15v3 app.chalo.models.validation.BleValidationArgs) = (r15v1 app.chalo.models.validation.BleValidationArgs), (r15v5 app.chalo.models.validation.BleValidationArgs) binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v3 java.lang.String) binds: [B:65:0x01ea, B:74:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0210  */
    /* JADX WARN: Code duplicated, block: B:76:0x021b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0226  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025c, code lost:
    
        if (r2 == r8) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r32v0, types: [app.chalo.mvibase.simple.ChaloBaseStateMviComponent, app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r32, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r33, app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r34, app.chalo.models.validation.BleValidationArgs r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.J0(app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig, app.chalo.models.validation.BleValidationArgs, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0 A[RETURN] */
    public static final Object K0(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, BleValidationPrerequisitesState bleValidationPrerequisitesState, ProductValidationData productValidationData, BleValidationArgs bleValidationArgs, Continuation continuation) {
        Object objU0;
        StateFlow stateFlow = bleValidationFragmentComponentAndroid.f;
        int[] iArr = WhenMappings.c;
        switch (iArr[bleValidationPrerequisitesState.ordinal()]) {
            case 1:
            case 11:
                break;
            case 2:
                bleValidationFragmentComponentAndroid.E0(new wa(4));
                break;
            case 3:
                bleValidationFragmentComponentAndroid.S0(new ua(bleValidationFragmentComponentAndroid, 2));
                break;
            case 4:
                BleValidationMetaData bleValidationMetaData = ((BleValidationState) stateFlow.getValue()).j;
                if (bleValidationMetaData != null) {
                    Product product = bleValidationMetaData.c;
                    ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationFragmentComponentAndroid.J;
                    if (productValidationAnalyticManager != null) {
                        productValidationAnalyticManager.z(product, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                    }
                }
                bleValidationFragmentComponentAndroid.P0(false);
                break;
            case 5:
                BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) stateFlow.getValue()).j;
                if (bleValidationMetaData2 != null) {
                    Product product2 = bleValidationMetaData2.c;
                    ProductValidationAnalyticManager productValidationAnalyticManager2 = bleValidationFragmentComponentAndroid.J;
                    if (productValidationAnalyticManager2 != null) {
                        productValidationAnalyticManager2.z(product2, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                    }
                }
                bleValidationFragmentComponentAndroid.P0(true);
                break;
            case 6:
                bleValidationFragmentComponentAndroid.E0(new wa(5));
                break;
            case 7:
                bleValidationFragmentComponentAndroid.C0(BleValidationIntent.TurnOnBluetoothManuallyIntent.f10600a);
                break;
            case 8:
                bleValidationFragmentComponentAndroid.E0(new v5(22));
                break;
            case 9:
                int i = WhenMappings.b[((BleValidationState) stateFlow.getValue()).f10610a.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            bleValidationFragmentComponentAndroid.E0(new v5(23));
                        } else if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bleValidationFragmentComponentAndroid.E0(new v5(24));
                } else {
                    bleValidationFragmentComponentAndroid.E0(new v5(23));
                }
                break;
            case 10:
                bleValidationFragmentComponentAndroid.E0(new v5(25));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i2 = iArr[bleValidationPrerequisitesState.ordinal()];
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
                bleValidationFragmentComponentAndroid.o.d(bleValidationPrerequisitesState.name());
                objU0 = unit;
                if (objU0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objU0;
                }
                return unit;
            case 8:
            case 9:
                objU0 = bleValidationFragmentComponentAndroid.U0(productValidationData, bleValidationArgs, continuation);
                if (objU0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objU0 = unit;
                }
                if (objU0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objU0;
                }
                return unit;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, ContinuationImpl continuationImpl) {
        BleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1 bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1;
        bleValidationFragmentComponentAndroid.getClass();
        if (continuationImpl instanceof BleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1) {
            bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1 = (BleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1) continuationImpl;
            int i = bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1 = new BleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1(bleValidationFragmentComponentAndroid, continuationImpl);
            }
        } else {
            bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1 = new BleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1(bleValidationFragmentComponentAndroid, continuationImpl);
        }
        Object obj = bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.label;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        while (JobKt.h(bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.getContext())) {
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) bleValidationFragmentComponentAndroid.f.getValue()).j;
            bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1.label = 1;
            if (DelayKt.b(100L, bleValidationFragmentComponentAndroid$waitUntilBleValidationAckDataAvailable$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void A0() {
        Integer num = this.K;
        if (num != null) {
            int iIntValue = num.intValue();
            DeviceNfcTapPaySuppressorProvider deviceNfcTapPaySuppressorProvider = this.I;
            if (iIntValue == deviceNfcTapPaySuppressorProvider.c()) {
                deviceNfcTapPaySuppressorProvider.b().disable();
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void B0() {
        DeviceNfcTapPaySuppressorProvider deviceNfcTapPaySuppressorProvider = this.I;
        this.K = Integer.valueOf(deviceNfcTapPaySuppressorProvider.c());
        deviceNfcTapPaySuppressorProvider.b().enable();
    }

    public final void M0(String str) {
        if (this.t.f()) {
            E0(new k2(str, 3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N0(ProductValidationData productValidationData, RemoteResourcesUrlConfig remoteResourcesUrlConfig, BleValidationArgs bleValidationArgs, ContinuationImpl continuationImpl) {
        BleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1 bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1;
        if (continuationImpl instanceof BleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1) {
            bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1 = (BleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1) continuationImpl;
            int i = bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1 = new BleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1(this, continuationImpl);
            }
        } else {
            bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1 = new BleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1(this, continuationImpl);
        }
        Object objT = bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.L$0 = remoteResourcesUrlConfig;
            bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.L$1 = bleValidationArgs;
            bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.label = 1;
            objT = productValidationData.t(bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1);
            if (objT == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bleValidationArgs = (BleValidationArgs) bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.L$1;
            remoteResourcesUrlConfig = (RemoteResourcesUrlConfig) bleValidationFragmentComponentAndroid$getInitialBottomsheetInfoBasedOnStaticData$1.L$0;
            ResultKt.b(objT);
        }
        ProductAndUserDetailsBottomsheetInfo productAndUserDetailsBottomsheetInfo = new ProductAndUserDetailsBottomsheetInfo((ProductDetailsDisplayData) objT);
        NearbyDevicesAndPermissionRationaleBottomsheetInfo nearbyDevicesAndPermissionRationaleBottomsheetInfo = new NearbyDevicesAndPermissionRationaleBottomsheetInfo(remoteResourcesUrlConfig.d);
        ValidationProduct validationProduct = bleValidationArgs.b;
        ProductValidationConfigProvider productValidationConfigProvider = this.l;
        Intrinsics.i(productValidationConfigProvider, "<this>");
        Intrinsics.i(validationProduct, "validationProduct");
        return new BleValidationBottomsheetInfo(productAndUserDetailsBottomsheetInfo, nearbyDevicesAndPermissionRationaleBottomsheetInfo, new PostValidationBottomsheetInfo(productValidationConfigProvider.a(validationProduct).getD().a()), null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0114  */
    /* JADX WARN: Code duplicated, block: B:33:0x012f  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:39:0x015a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0168  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:58:0x019d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object O0(ProductValidationData productValidationData, ProductValidationConfig productValidationConfig, RegularBusProductAndValidationMethod regularBusProductAndValidationMethod, RemoteResourcesUrlConfig remoteResourcesUrlConfig, ValidationProcessFlowDetails validationProcessFlowDetails, ContinuationImpl continuationImpl) {
        BleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1 bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1;
        ProductValidationConfig productValidationConfig2;
        ValidationProcessFlowDetails validationProcessFlowDetails2;
        ProductValidationData productValidationData2;
        RegularBusProductAndValidationMethod regularBusProductAndValidationMethod2;
        RemoteResourcesUrlConfig remoteResourcesUrlConfig2;
        ValidationProcessFlowDetails validationProcessFlowDetails3;
        String str;
        RemoteResourcesUrlConfig remoteResourcesUrlConfig3;
        ProductValidationData productValidationData3;
        ProductDetailsDisplayData productDetailsDisplayData;
        String str2;
        String strS;
        int length;
        StringProvider stringProvider;
        Object objB;
        String str3;
        ValidationProcessFlowDetails validationProcessFlowDetails4;
        String str4;
        String str5;
        ProductDetailsDisplayData productDetailsDisplayData2;
        RegularBusProductAndValidationMethod regularBusProductAndValidationMethod3;
        Object objB2;
        String str6;
        boolean z;
        RegularBusSlBleConfig regularBusSlBleConfig;
        boolean z2;
        if (continuationImpl instanceof BleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1) {
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1 = (BleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1) continuationImpl;
            int i = bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1 = new BleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1(this, continuationImpl);
            }
        } else {
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1 = new BleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1(this, continuationImpl);
        }
        Object obj = bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = productValidationData;
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = productValidationConfig;
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = regularBusProductAndValidationMethod;
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = remoteResourcesUrlConfig;
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = validationProcessFlowDetails;
            bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 1;
            Object objC = productValidationConfig.c(bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
            if (objC != coroutineSingletons) {
                productValidationConfig2 = productValidationConfig;
                validationProcessFlowDetails2 = validationProcessFlowDetails;
                productValidationData2 = productValidationData;
                obj = objC;
                regularBusProductAndValidationMethod2 = regularBusProductAndValidationMethod;
                remoteResourcesUrlConfig2 = remoteResourcesUrlConfig;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str4 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6;
                    str5 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5;
                    productDetailsDisplayData2 = (ProductDetailsDisplayData) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4;
                    str3 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3;
                    validationProcessFlowDetails4 = (ValidationProcessFlowDetails) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2;
                    remoteResourcesUrlConfig3 = (RemoteResourcesUrlConfig) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1;
                    regularBusProductAndValidationMethod3 = (RegularBusProductAndValidationMethod) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0;
                    ResultKt.b(obj);
                    str6 = (String) obj;
                    String str7 = str4;
                    String str8 = str6;
                    String str9 = str5;
                    ProductDetailsDisplayData productDetailsDisplayData3 = productDetailsDisplayData2;
                    String str10 = str3;
                    if (validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) {
                        z = false;
                    } else {
                        z = false;
                    }
                    BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo = new BleValidationBasicLayoutInfo(str9, str10, productDetailsDisplayData3, str8, str7, z);
                    String str11 = remoteResourcesUrlConfig3.f10449a;
                    regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                    if (regularBusSlBleConfig != null) {
                        z2 = regularBusSlBleConfig.k;
                    } else {
                        z2 = true;
                    }
                    return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo, new SwitchToQrValidationLayoutInfo(str11, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6;
                str5 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5;
                productDetailsDisplayData2 = (ProductDetailsDisplayData) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4;
                str3 = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3;
                validationProcessFlowDetails4 = (ValidationProcessFlowDetails) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2;
                remoteResourcesUrlConfig3 = (RemoteResourcesUrlConfig) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1;
                regularBusProductAndValidationMethod3 = (RegularBusProductAndValidationMethod) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0;
                ResultKt.b(obj);
                str6 = (String) obj;
                String str12 = str4;
                String str13 = str6;
                String str14 = str5;
                ProductDetailsDisplayData productDetailsDisplayData4 = productDetailsDisplayData2;
                String str15 = str3;
                if ((validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) || Intrinsics.d(validationProcessFlowDetails4, ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE)) {
                    z = false;
                } else {
                    if (!Intrinsics.d(validationProcessFlowDetails4, ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE) && !Intrinsics.d(validationProcessFlowDetails4, ValidationProcessFlowDetails.ConductorValidation.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo2 = new BleValidationBasicLayoutInfo(str14, str15, productDetailsDisplayData4, str13, str12, z);
                String str16 = remoteResourcesUrlConfig3.f10449a;
                regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                if (regularBusSlBleConfig != null) {
                    z2 = regularBusSlBleConfig.k;
                } else {
                    z2 = true;
                }
                return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo2, new SwitchToQrValidationLayoutInfo(str16, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
            }
            str = (String) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4;
            validationProcessFlowDetails3 = (ValidationProcessFlowDetails) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3;
            remoteResourcesUrlConfig3 = (RemoteResourcesUrlConfig) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2;
            regularBusProductAndValidationMethod2 = (RegularBusProductAndValidationMethod) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1;
            productValidationData3 = (ProductValidationData) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0;
            ResultKt.b(obj);
            productDetailsDisplayData = (ProductDetailsDisplayData) obj;
            str2 = remoteResourcesUrlConfig3.b;
            strS = productValidationData3.s();
            length = str.length();
            stringProvider = this.u;
            if (length > 0) {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = regularBusProductAndValidationMethod2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = remoteResourcesUrlConfig3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = validationProcessFlowDetails3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = str;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = productDetailsDisplayData;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5 = str2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6 = strS;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 3;
                objB2 = stringProvider.b(StringEnum.TICKET_NO, new Object[0], bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
                if (objB2 != coroutineSingletons) {
                    str3 = str;
                    validationProcessFlowDetails4 = validationProcessFlowDetails3;
                    str4 = strS;
                    str5 = str2;
                    productDetailsDisplayData2 = productDetailsDisplayData;
                    obj = objB2;
                    regularBusProductAndValidationMethod3 = regularBusProductAndValidationMethod2;
                    str6 = (String) obj;
                    String str17 = str4;
                    String str18 = str6;
                    String str19 = str5;
                    ProductDetailsDisplayData productDetailsDisplayData5 = productDetailsDisplayData2;
                    String str110 = str3;
                    if (validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) {
                        z = false;
                    } else {
                        z = false;
                    }
                    BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo3 = new BleValidationBasicLayoutInfo(str19, str110, productDetailsDisplayData5, str18, str17, z);
                    String str111 = remoteResourcesUrlConfig3.f10449a;
                    regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                    if (regularBusSlBleConfig != null) {
                        z2 = regularBusSlBleConfig.k;
                    } else {
                        z2 = true;
                    }
                    return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo3, new SwitchToQrValidationLayoutInfo(str111, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
                }
            } else {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = regularBusProductAndValidationMethod2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = remoteResourcesUrlConfig3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = validationProcessFlowDetails3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = str;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = productDetailsDisplayData;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5 = str2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6 = strS;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 4;
                objB = stringProvider.b(StringEnum.REFERENCE_CODE, new Object[0], bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
                if (objB != coroutineSingletons) {
                    str3 = str;
                    validationProcessFlowDetails4 = validationProcessFlowDetails3;
                    str4 = strS;
                    str5 = str2;
                    productDetailsDisplayData2 = productDetailsDisplayData;
                    obj = objB;
                    regularBusProductAndValidationMethod3 = regularBusProductAndValidationMethod2;
                    str6 = (String) obj;
                    String str112 = str4;
                    String str113 = str6;
                    String str114 = str5;
                    ProductDetailsDisplayData productDetailsDisplayData6 = productDetailsDisplayData2;
                    String str115 = str3;
                    if (validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) {
                        z = false;
                    } else {
                        z = false;
                    }
                    BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo4 = new BleValidationBasicLayoutInfo(str114, str115, productDetailsDisplayData6, str113, str112, z);
                    String str116 = remoteResourcesUrlConfig3.f10449a;
                    regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                    if (regularBusSlBleConfig != null) {
                        z2 = regularBusSlBleConfig.k;
                    } else {
                        z2 = true;
                    }
                    return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo4, new SwitchToQrValidationLayoutInfo(str116, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
                }
            }
            return coroutineSingletons;
        }
        validationProcessFlowDetails2 = (ValidationProcessFlowDetails) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4;
        remoteResourcesUrlConfig2 = (RemoteResourcesUrlConfig) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3;
        regularBusProductAndValidationMethod2 = (RegularBusProductAndValidationMethod) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2;
        productValidationConfig2 = (ProductValidationConfig) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1;
        productValidationData2 = (ProductValidationData) bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0;
        ResultKt.b(obj);
        String strA = productValidationConfig2.a(((Number) obj).intValue(), productValidationData2.n());
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = productValidationData2;
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = regularBusProductAndValidationMethod2;
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = remoteResourcesUrlConfig2;
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = validationProcessFlowDetails2;
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = strA;
        bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 2;
        Object objT = productValidationData2.t(bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
        if (objT != coroutineSingletons) {
            RemoteResourcesUrlConfig remoteResourcesUrlConfig4 = remoteResourcesUrlConfig2;
            validationProcessFlowDetails3 = validationProcessFlowDetails2;
            str = strA;
            obj = objT;
            remoteResourcesUrlConfig3 = remoteResourcesUrlConfig4;
            productValidationData3 = productValidationData2;
            productDetailsDisplayData = (ProductDetailsDisplayData) obj;
            str2 = remoteResourcesUrlConfig3.b;
            strS = productValidationData3.s();
            length = str.length();
            stringProvider = this.u;
            if (length > 0) {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = regularBusProductAndValidationMethod2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = remoteResourcesUrlConfig3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = validationProcessFlowDetails3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = str;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = productDetailsDisplayData;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5 = str2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6 = strS;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 3;
                objB2 = stringProvider.b(StringEnum.TICKET_NO, new Object[0], bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
                if (objB2 != coroutineSingletons) {
                    str3 = str;
                    validationProcessFlowDetails4 = validationProcessFlowDetails3;
                    str4 = strS;
                    str5 = str2;
                    productDetailsDisplayData2 = productDetailsDisplayData;
                    obj = objB2;
                    regularBusProductAndValidationMethod3 = regularBusProductAndValidationMethod2;
                    str6 = (String) obj;
                    String str117 = str4;
                    String str118 = str6;
                    String str119 = str5;
                    ProductDetailsDisplayData productDetailsDisplayData7 = productDetailsDisplayData2;
                    String str1110 = str3;
                    if (validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) {
                        z = false;
                    } else {
                        z = false;
                    }
                    BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo5 = new BleValidationBasicLayoutInfo(str119, str1110, productDetailsDisplayData7, str118, str117, z);
                    String str1111 = remoteResourcesUrlConfig3.f10449a;
                    regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                    if (regularBusSlBleConfig != null) {
                        z2 = regularBusSlBleConfig.k;
                    } else {
                        z2 = true;
                    }
                    return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo5, new SwitchToQrValidationLayoutInfo(str1111, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
                }
            } else {
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$0 = regularBusProductAndValidationMethod2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$1 = remoteResourcesUrlConfig3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$2 = validationProcessFlowDetails3;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$3 = str;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$4 = productDetailsDisplayData;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$5 = str2;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.L$6 = strS;
                bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1.label = 4;
                objB = stringProvider.b(StringEnum.REFERENCE_CODE, new Object[0], bleValidationFragmentComponentAndroid$getInitialLayoutInfoBasedOnStaticData$1);
                if (objB != coroutineSingletons) {
                    str3 = str;
                    validationProcessFlowDetails4 = validationProcessFlowDetails3;
                    str4 = strS;
                    str5 = str2;
                    productDetailsDisplayData2 = productDetailsDisplayData;
                    obj = objB;
                    regularBusProductAndValidationMethod3 = regularBusProductAndValidationMethod2;
                    str6 = (String) obj;
                    String str1112 = str4;
                    String str1113 = str6;
                    String str1114 = str5;
                    ProductDetailsDisplayData productDetailsDisplayData8 = productDetailsDisplayData2;
                    String str1115 = str3;
                    if (validationProcessFlowDetails4 instanceof ValidationProcessFlowDetails.TapOutValidation) {
                        z = false;
                    } else {
                        z = false;
                    }
                    BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo6 = new BleValidationBasicLayoutInfo(str1114, str1115, productDetailsDisplayData8, str1113, str1112, z);
                    String str1116 = remoteResourcesUrlConfig3.f10449a;
                    regularBusSlBleConfig = regularBusProductAndValidationMethod3.b;
                    if (regularBusSlBleConfig != null) {
                        z2 = regularBusSlBleConfig.k;
                    } else {
                        z2 = true;
                    }
                    return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo6, new SwitchToQrValidationLayoutInfo(str1116, z2, false, 60000L), new QRScreenLayoutInfo(true, "", false));
                }
            }
        }
        return coroutineSingletons;
    }

    public final void P0(boolean z) {
        BleValidationMetaData bleValidationMetaData = ((BleValidationState) this.f.getValue()).j;
        if (bleValidationMetaData != null) {
            Product product = bleValidationMetaData.c;
            ProductValidationAnalyticManager productValidationAnalyticManager = this.J;
            if (productValidationAnalyticManager != null) {
                productValidationAnalyticManager.k(product, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
            }
        }
        E0(new va(z, 0));
    }

    public final void Q0() {
        this.E.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final void C0(BleValidationIntent bleValidationIntent) {
        ValidationProduct validationProduct;
        ProductValidationData productValidationData;
        super.C0(bleValidationIntent);
        boolean z = bleValidationIntent instanceof BleValidationIntent.InitializationIntent;
        CoroutineContextProvider coroutineContextProvider = this.w;
        ContextScope contextScope = this.j;
        if (z) {
            BleValidationArgs bleValidationArgs = ((BleValidationIntent.InitializationIntent) bleValidationIntent).f10588a;
            ValidationProduct validationProduct2 = bleValidationArgs.b;
            ProductValidationConfigProvider productValidationConfigProvider = this.l;
            Intrinsics.i(productValidationConfigProvider, "<this>");
            Intrinsics.i(validationProduct2, "validationProduct");
            this.J = productValidationConfigProvider.a(validationProduct2).getB();
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleInitializationIntent$1(this, validationProduct2, bleValidationArgs, null), 2);
            if (this.t.f()) {
                BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleInitializationIntent$2(this, null), 2);
                BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleInitializationIntent$3(this, null), 2);
            }
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$startCollectingDataReceivedOnConnection$1(this, null), 2);
            return;
        }
        boolean zEquals = bleValidationIntent.equals(BleValidationIntent.ActivationExpiredDialogOkClickedIntent.f10579a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            Q0();
            BleValidationMetaData bleValidationMetaData = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData == null || (productValidationData = bleValidationMetaData.b) == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleActivationExpiredDialogOkClickedIntent$1$1(this, productValidationData, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ActivationExpiredDialogSeeDetailsClickedIntent.f10580a)) {
            BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData2 != null) {
                BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1(this, bleValidationMetaData2, null), 3);
                return;
            }
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.BackClickedIntent.f10582a)) {
            int i = WhenMappings.b[((BleValidationState) stateFlow.getValue()).f10610a.ordinal()];
            ValidationArgs.BleValidationScreenArgs bleValidationScreenArgs = this.k;
            ChaloNavigationManager chaloNavigationManager = this.E;
            if (i == 1) {
                if (bleValidationScreenArgs.e) {
                    ChaloNavigationManagerKt.c(chaloNavigationManager);
                    return;
                } else {
                    chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(bleValidationScreenArgs)));
                    return;
                }
            }
            if (i == 2) {
                if (bleValidationScreenArgs.e) {
                    ChaloNavigationManagerKt.c(chaloNavigationManager);
                    return;
                } else {
                    chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(bleValidationScreenArgs)));
                    return;
                }
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleBackClickedIntent$3(this, null), 2);
                    return;
                }
                BleValidationMetaData bleValidationMetaData3 = ((BleValidationState) stateFlow.getValue()).j;
                if (bleValidationMetaData3 != null) {
                    Product product = bleValidationMetaData3.c;
                    ProductValidationAnalyticManager productValidationAnalyticManager = this.J;
                    if (productValidationAnalyticManager != null) {
                        productValidationAnalyticManager.s(product, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                    }
                }
                E0(new v5(29));
                return;
            }
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.BleManualTurnOnOperationCompleteIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleBleManualTurnOnOperationCompleteIntent$1(this, ((BleValidationIntent.BleManualTurnOnOperationCompleteIntent) bleValidationIntent).f10583a, null), 2);
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.BlePermissionsUpdatedIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedIntent$1(this, ((BleValidationIntent.BlePermissionsUpdatedIntent) bleValidationIntent).f10585a, null), 2);
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.BlePermissionsUpdatedFromFullScreenExplainerIntent) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleBlePermissionsUpdatedFromFullScreenExplainerIntent$1(this, ((BleValidationIntent.BlePermissionsUpdatedFromFullScreenExplainerIntent) bleValidationIntent).f10584a, null), 2);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent.f10581a)) {
            S0(new ua(this, 0));
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ProductDetailsBottomSheetCardOkClickedIntent.f10589a)) {
            E0(new wa(2));
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.PunchReceivedIntent) {
            AppNotification.PunchNotification punchNotification = ((BleValidationIntent.PunchReceivedIntent) bleValidationIntent).f10590a;
            BleValidationMetaData bleValidationMetaData4 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData4 == null || (validationProduct = bleValidationMetaData4.d.b) == null) {
                return;
            }
            this.p.k(punchNotification, validationProduct);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent.f10595a)) {
            BleValidationMetaData bleValidationMetaData5 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData5 != null) {
                Product product2 = bleValidationMetaData5.c;
                ProductValidationAnalyticManager productValidationAnalyticManager2 = this.J;
                if (productValidationAnalyticManager2 != null) {
                    productValidationAnalyticManager2.B(product2, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
            }
            E0(new v5(28));
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent$3(this, null), 2);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.SwitchToQRAfterDenyingBlePermissionsClickedIntent.f10597a)) {
            BleValidationMetaData bleValidationMetaData6 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData6 != null) {
                Product product3 = bleValidationMetaData6.c;
                ProductValidationAnalyticManager productValidationAnalyticManager3 = this.J;
                if (productValidationAnalyticManager3 != null) {
                    productValidationAnalyticManager3.t(product3, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
            }
            if (((BleValidationState) stateFlow.getValue()).c.f10623a) {
                E0(new ua(this, 1));
                return;
            }
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.UnableToVerifyTapHereClickedIntent.f10601a)) {
            BleValidationMetaData bleValidationMetaData7 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData7 != null) {
                Product product4 = bleValidationMetaData7.c;
                ProductValidationAnalyticManager productValidationAnalyticManager4 = this.J;
                if (productValidationAnalyticManager4 != null) {
                    productValidationAnalyticManager4.C(product4, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
            }
            if (((BleValidationState) stateFlow.getValue()).c.f10623a) {
                E0(new wa(0));
                return;
            }
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.TurnOnBluetoothManuallyIntent.f10600a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleTurnOnBleManuallyIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.UseQRCodeClicked.f10602a)) {
            BleValidationMetaData bleValidationMetaData8 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData8 != null) {
                Product product5 = bleValidationMetaData8.c;
                ProductValidationAnalyticManager productValidationAnalyticManager5 = this.J;
                if (productValidationAnalyticManager5 != null) {
                    productValidationAnalyticManager5.c(product5, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
            }
            BleValidationLayoutInfo bleValidationLayoutInfo = ((BleValidationState) stateFlow.getValue()).b;
            if (bleValidationLayoutInfo == null || !bleValidationLayoutInfo.b.d) {
                return;
            }
            E0(new wa(1));
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.TapToValidateBottomsheetTutorialOkClickedIntent.f10599a)) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleTapToValidateBottomsheetTutorialOkClickedIntent$1(this, null), 2);
            E0(new v5(26));
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.RideFeedbackRatingSelectedIntent) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1(this, (BleValidationIntent.RideFeedbackRatingSelectedIntent) bleValidationIntent, null), 3);
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.RideFeedbackRatingSubmittedIntent) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1(this, (BleValidationIntent.RideFeedbackRatingSubmittedIntent) bleValidationIntent, null), 3);
            return;
        }
        if (bleValidationIntent instanceof BleValidationIntent.ViewTripReceiptMenuOptionClickedIntent) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleViewTripReceiptMenuOptionClickedIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ReportProblemIntent.f10591a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleReportProblemIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ShowProductDetailsBottomSheetIntent.f10596a)) {
            BleValidationMetaData bleValidationMetaData9 = ((BleValidationState) stateFlow.getValue()).j;
            if (bleValidationMetaData9 != null) {
                Product product6 = bleValidationMetaData9.c;
                ProductValidationAnalyticManager productValidationAnalyticManager6 = this.J;
                if (productValidationAnalyticManager6 != null) {
                    productValidationAnalyticManager6.x(product6, Source.BLE_VALIDATION_ACTIVITY.getSourceName());
                }
            }
            E0(new v5(27));
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ReturnedFromAndroidSettingsIntent.f10592a)) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new BleValidationFragmentComponentAndroid$handleResultFromAndroidSettingsPage$1(this, null), 2);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ViewTripReceiptPostConductorValidationCompleteIntent.f10604a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleViewTripReceiptPostConductorValidationCompleteIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ViewTripReceiptPostTapOutIntent.f10605a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleViewTripReceiptPostTapOutIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.ConductorValidationExitBtnClickedPostValidationIntent.f10586a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleConductorValidationExitBtnClickedPostValidationIntent$1(this, null), 3);
            return;
        }
        if (bleValidationIntent.equals(BleValidationIntent.TITOValidationExitBtnClickedPostTapOutIntent.f10598a)) {
            BuildersKt.d(contextScope, null, null, new BleValidationFragmentComponentAndroid$handleTITOValidationExitBtnClickedPostTapOutIntent$1(this, null), 3);
        } else if (bleValidationIntent.equals(BleValidationIntent.DismissBottomSheetIntent.f10587a)) {
            E0(new wa(3));
        } else if (!(bleValidationIntent instanceof BleValidationIntent.SendEventIntent)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void S0(Function1 function1) {
        Job job = this.L;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        PermissionHandler permissionHandlerC = this.C.c();
        if (permissionHandlerC == null) {
            return;
        }
        this.L = BuildersKt.d(this.j, null, null, new BleValidationFragmentComponentAndroid$requestBLEPermission$1(this, permissionHandlerC, function1, null), 3);
    }

    public final void T0(BleValidationCompletionType bleValidationCompletionType) {
        BleValidationBottomsheetType bleValidationBottomsheetType;
        int i = WhenMappings.f10570a[bleValidationCompletionType.ordinal()];
        if (i == 1) {
            bleValidationBottomsheetType = BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_CONDUCTOR_VALIDATION;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bleValidationBottomsheetType = BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_TAP_OUT;
        }
        E0(new g(bleValidationBottomsheetType, 19));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x021e  */
    /* JADX WARN: Code duplicated, block: B:83:0x022d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0231  */
    /* JADX WARN: Code duplicated, block: B:86:0x0244 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:89:0x0259  */
    /* JADX WARN: Code duplicated, block: B:92:0x0261  */
    /* JADX WARN: Code duplicated, block: B:94:0x026b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b6, code lost:
    
        if (r3 == r5) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r23, app.chalo.models.validation.BleValidationArgs r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid.U0(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.models.validation.BleValidationArgs, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void V0(boolean z) {
        E0(new va(z, 1));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (BleValidationState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new BleValidationState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new BleValidationState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        BleValidationPrerequisitesStateHelper bleValidationPrerequisitesStateHelper = this.m;
        bleValidationPrerequisitesStateHelper.f10536a.a();
        CoroutineScopeKt.b(bleValidationPrerequisitesStateHelper.f, null);
        CoroutineScopeKt.b(this.n.d, null);
        BleValidationWithTwoWayPilotHelper.h(this.o, Source.BLE_VALIDATION_ACTIVITY, BleValidationStoppingReason.VM_CLEARED);
        Integer num = this.K;
        if (num != null) {
            int iIntValue = num.intValue();
            DeviceNfcTapPaySuppressorProvider deviceNfcTapPaySuppressorProvider = this.I;
            if (iIntValue == deviceNfcTapPaySuppressorProvider.c()) {
                deviceNfcTapPaySuppressorProvider.b().disable();
            }
        }
        BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper = this.p;
        Job job = bleValidationProcessCompletionHelper.l;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        bleValidationProcessCompletionHelper.t = null;
    }
}
