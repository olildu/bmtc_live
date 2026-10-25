package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.ble_communication.BLECommunicationRange;
import app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason;
import app.chalo.ble_communication.BLECommunicationServiceType;
import app.chalo.ble_communication.base.BLEOperationResult;
import app.chalo.ble_communication.model.BLEActiveModeScanningConfig;
import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature;
import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnectionInitializationConfig;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationWithTwoWayPilotHelper;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleValidationWithTwoWayPilotHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BLEPassengerSideCommunicationFeature f10550a;
    public final TwoWayBleCommPilotLogger b;
    public final BasicInfoContract c;
    public final ContextScope d;
    public Source e;
    public final MutexImpl f;
    public final LinkedHashMap g;
    public byte[] h;
    public byte[] i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;

    public BleValidationWithTwoWayPilotHelper(BLEPassengerSideCommunicationFeature bLEPassengerSideCommunicationFeature, CoroutineContextProvider coroutineContextProvider, TwoWayBleCommPilotLogger twoWayBleCommPilotLogger, BasicInfoContract basicInfoContract) {
        this.f10550a = bLEPassengerSideCommunicationFeature;
        this.b = twoWayBleCommPilotLogger;
        this.c = basicInfoContract;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.d = contextScopeA;
        this.e = Source.UNKNOWN;
        this.f = MutexKt.a();
        this.g = new LinkedHashMap();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.j = mutableStateFlowA;
        this.k = FlowKt.c(mutableStateFlowA);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(null);
        this.l = mutableStateFlowA2;
        this.m = FlowKt.c(mutableStateFlowA2);
        MutableStateFlow mutableStateFlowA3 = StateFlowKt.a(new Pair(BleActiveModeStatus.Uninitialized.f10529a, BlePassiveModeStatus.Uninitialized.f10533a));
        this.n = mutableStateFlowA3;
        this.o = FlowKt.c(mutableStateFlowA3);
        BuildersKt.d(contextScopeA, null, null, new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1(this, null), 3);
        BuildersKt.d(contextScopeA, null, null, new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$2(this, null), 3);
        BuildersKt.d(contextScopeA, null, null, new BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$3(this, null), 3);
    }

    public static void g(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, Source source, String str) {
        bleValidationWithTwoWayPilotHelper.getClass();
        Intrinsics.i(source, "source");
        bleValidationWithTwoWayPilotHelper.e = source;
        BuildersKt.d(bleValidationWithTwoWayPilotHelper.d, null, null, new BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1(bleValidationWithTwoWayPilotHelper, source, null, str, null), 3);
        bleValidationWithTwoWayPilotHelper.f10550a.b();
        bleValidationWithTwoWayPilotHelper.h = null;
    }

    public static void h(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, Source source, BleValidationStoppingReason reason) {
        bleValidationWithTwoWayPilotHelper.getClass();
        Intrinsics.i(source, "source");
        Intrinsics.i(reason, "reason");
        bleValidationWithTwoWayPilotHelper.e = source;
        BuildersKt.d(bleValidationWithTwoWayPilotHelper.d, null, null, new BleValidationWithTwoWayPilotHelper$stopAllBLEOperationsAndSwitchOffBluetoothIfNeeded$1(bleValidationWithTwoWayPilotHelper, reason, source, null, null), 3);
        bleValidationWithTwoWayPilotHelper.f10550a.d();
        bleValidationWithTwoWayPilotHelper.h = null;
        bleValidationWithTwoWayPilotHelper.i = null;
    }

    public static ProductForLogging i(ProductValidationData productValidationData) {
        return new ProductForLogging(productValidationData.a(), productValidationData.b(), productValidationData.getId());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BLEOperationType bLEOperationType, ContinuationImpl continuationImpl) {
        BleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1 bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1;
        Mutex mutex;
        if (continuationImpl instanceof BleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1) {
            bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1 = (BleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1) continuationImpl;
            int i = bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1 = new BleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1(this, continuationImpl);
            }
        } else {
            bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1 = new BleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1(this, continuationImpl);
        }
        Object obj = bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.L$0 = bLEOperationType;
            mutex = this.f;
            bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.L$1 = mutex;
            bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.label = 1;
            if (mutex.a(bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.L$1;
            BLEOperationType bLEOperationType2 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$getCurrentFailureCount$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            bLEOperationType = bLEOperationType2;
        }
        try {
            Integer num = (Integer) this.g.get(bLEOperationType);
            return new Integer(num != null ? num.intValue() : 0);
        } finally {
            mutex.e(null);
        }
    }

    public final BLETransferData.OneWayBroadcastBLETransferData b(byte[] bArr) {
        return new BLETransferData.OneWayBroadcastBLETransferData(bArr, BLECommunicationRange.SHORT, 30000L, null, this.c.e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(BLEOperationType bLEOperationType, ContinuationImpl continuationImpl) {
        BleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1 bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1;
        Mutex mutex;
        if (continuationImpl instanceof BleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1) {
            bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1 = (BleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1) continuationImpl;
            int i = bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1 = new BleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1(this, continuationImpl);
            }
        } else {
            bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1 = new BleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1(this, continuationImpl);
        }
        Object obj = bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.L$0 = bLEOperationType;
            mutex = this.f;
            bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.L$1 = mutex;
            bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.label = 1;
            if (mutex.a(bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.L$1;
            BLEOperationType bLEOperationType2 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$incrementOperationFailureCount$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            bLEOperationType = bLEOperationType2;
        }
        try {
            LinkedHashMap linkedHashMap = this.g;
            Integer num = (Integer) linkedHashMap.get(bLEOperationType);
            linkedHashMap.put(bLEOperationType, new Integer(num != null ? num.intValue() + 1 : 0));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    public final void d(String unmetCondition) {
        Intrinsics.i(unmetCondition, "unmetCondition");
        this.h = null;
        this.i = null;
        BuildersKt.d(this.d, null, null, new BleValidationWithTwoWayPilotHelper$markOperationsInactiveDueToBlePrerequisitesNotMet$1(this, unmetCondition, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e9 A[PHI: r1 r2 r3 r5 r6 r7
      0x00e9: PHI (r1v10 app.chalo.validationsdk.blevalidation.helper.BLEOperationType) = 
      (r1v7 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
      (r1v16 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
     binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r2v10 java.util.Map) = (r2v7 java.util.Map), (r2v16 java.util.Map) binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v1 java.lang.Object) binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r5v12 app.chalo.constants.Source) = (r5v9 app.chalo.constants.Source), (r5v15 app.chalo.constants.Source) binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r6v10 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r6v7 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r6v14 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r7v11 byte[]) = (r7v8 byte[]), (r7v14 byte[]) binds: [B:44:0x01b6, B:25:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x022b A[PHI: r1 r11
      0x022b: PHI (r1v24 app.chalo.ble_communication.base.BLEOperationResult) = 
      (r1v20 app.chalo.ble_communication.base.BLEOperationResult)
      (r1v26 app.chalo.ble_communication.base.BLEOperationResult)
     binds: [B:57:0x0227, B:20:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r11v3 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1) = 
      (r11v2 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1)
      (r11v0 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1)
     binds: [B:57:0x0227, B:20:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0252 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Code duplicated, block: B:65:0x0257  */
    /* JADX WARN: Code duplicated, block: B:68:0x0270  */
    /* JADX WARN: Code duplicated, block: B:72:0x029b A[PHI: r1 r2
      0x029b: PHI (r1v33 app.chalo.ble_communication.base.BLEOperationResult) = 
      (r1v29 app.chalo.ble_communication.base.BLEOperationResult)
      (r1v35 app.chalo.ble_communication.base.BLEOperationResult)
     binds: [B:70:0x0298, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r2v36 byte[]) = (r2v31 byte[]), (r2v42 byte[]) binds: [B:70:0x0298, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object e(byte[] bArr, ProductValidationData productValidationData, Source source, ContinuationImpl continuationImpl) {
        BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1;
        BLEOperationType bLEOperationType;
        Source source2;
        ProductValidationData productValidationData2;
        Object obj;
        TwoWayBleCommPilotLogger twoWayBleCommPilotLogger;
        Map map;
        byte[] bArr2;
        int iIntValue;
        ProductForLogging productForLoggingI;
        byte[] bArr3;
        ProductValidationData productValidationData3;
        BLEOperationType bLEOperationType2;
        Source source3;
        Map map2;
        BLEOperationType bLEOperationType3;
        byte[] bArr4;
        ProductValidationData productValidationData4;
        Source source4;
        Map map3;
        BLEOperationResult bLEOperationResult;
        Object objA;
        Source source5;
        byte[] bArr5;
        BLEOperationResult bLEOperationResult2;
        byte[] bArr6;
        byte[] bArr7;
        BLEOperationResult bLEOperationResult3;
        BLEOperationType bLEOperationType4;
        ProductValidationData productValidationData5;
        Source source6;
        Map map4;
        BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason;
        byte[] bArr8;
        Map map5;
        Source source7;
        BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason2;
        Object objN;
        Pair pairC;
        Map map6;
        TwoWayBleCommPilotLogger twoWayBleCommPilotLogger2;
        int iIntValue2;
        ProductForLogging productForLoggingI2;
        Pair pairC2;
        byte[] bArr9 = bArr;
        if (continuationImpl instanceof BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1) {
            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 = (BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1) continuationImpl;
            int i = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 = new BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1(this, continuationImpl);
            }
        } else {
            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 = new BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1(this, continuationImpl);
        }
        BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1;
        Object objC = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label;
        TwoWayBleCommPilotLogger twoWayBleCommPilotLogger3 = this.b;
        MutableStateFlow mutableStateFlow = this.n;
        switch (i2) {
            case 0:
                ResultKt.b(objC);
                byte[] bArr10 = this.i;
                if (bArr10 != null && Arrays.equals(bArr10, bArr9)) {
                    return new BLEOperationResult.Success();
                }
                this.e = source;
                bLEOperationType = BLEOperationType.DUPLEX_CONNECTION_REQUEST;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr9;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = twoWayBleCommPilotLogger3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bArr9;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 1;
                Object objA2 = a(bLEOperationType, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                if (objA2 != obj2) {
                    source2 = source;
                    productValidationData2 = productValidationData;
                    obj = objA2;
                    twoWayBleCommPilotLogger = twoWayBleCommPilotLogger3;
                    map = null;
                    bArr2 = bArr9;
                    iIntValue = ((Number) obj).intValue();
                    productForLoggingI = i(productValidationData2);
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr9;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData2;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source2;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 2;
                    if (twoWayBleCommPilotLogger.p(bArr2, iIntValue, productForLoggingI, source2, map, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                        bArr3 = bArr9;
                        productValidationData3 = productValidationData2;
                        bLEOperationType2 = bLEOperationType;
                        source3 = source2;
                        map2 = map;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map2;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType2;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 3;
                        objC = this.f10550a.c(SetsKt.g(BLECommunicationServiceType.DuplexConnection.c), new BLEPassengerSideDuplexConnectionInitializationConfig(bArr3), new BLEActiveModeScanningConfig(), bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                        if (objC != obj2) {
                            Map map7 = map2;
                            bLEOperationType3 = bLEOperationType2;
                            bArr4 = bArr3;
                            productValidationData4 = productValidationData3;
                            source4 = source3;
                            map3 = map7;
                            bLEOperationResult = (BLEOperationResult) objC;
                            if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bLEOperationResult;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 4;
                                if (c(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                    bArr7 = bArr4;
                                    bLEOperationResult3 = bLEOperationResult;
                                    bLEOperationType4 = bLEOperationType3;
                                    productValidationData5 = productValidationData4;
                                    source6 = source4;
                                    map4 = map3;
                                    bLECommunicationServiceInitializationFailureReason = (BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = productValidationData5;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = source6;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = map4;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = bLEOperationResult3;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = twoWayBleCommPilotLogger3;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bArr7;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bLECommunicationServiceInitializationFailureReason;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 5;
                                    objC = a(bLEOperationType4, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                    if (objC != obj2) {
                                        bArr8 = bArr7;
                                        map5 = map4;
                                        source7 = source6;
                                        bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason;
                                        TwoWayBleCommPilotLogger twoWayBleCommPilotLogger4 = twoWayBleCommPilotLogger3;
                                        int iIntValue3 = ((Number) objC).intValue();
                                        ProductForLogging productForLoggingI3 = i(productValidationData5);
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                                        objN = twoWayBleCommPilotLogger4.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue3, productForLoggingI3, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                                        if (objN != obj2) {
                                            pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                                            if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                                                return bLEOperationResult3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (bLEOperationResult instanceof BLEOperationResult.Success) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationResult;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = twoWayBleCommPilotLogger3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bArr4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 8;
                                objA = a(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                if (objA != obj2) {
                                    source5 = source4;
                                    bArr5 = bArr4;
                                    bLEOperationResult2 = bLEOperationResult;
                                    objC = objA;
                                    bArr6 = bArr5;
                                    map6 = map3;
                                    twoWayBleCommPilotLogger2 = twoWayBleCommPilotLogger3;
                                    iIntValue2 = ((Number) objC).intValue();
                                    productForLoggingI2 = i(productValidationData4);
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr6;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = bLEOperationResult2;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 9;
                                    if (twoWayBleCommPilotLogger2.o(bArr5, iIntValue2, productForLoggingI2, source5, map6, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                        this.i = bArr6;
                                        pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                                        if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                            return bLEOperationResult2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                byte[] bArr11 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6;
                TwoWayBleCommPilotLogger twoWayBleCommPilotLogger5 = (TwoWayBleCommPilotLogger) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5;
                BLEOperationType bLEOperationType5 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                Map map8 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                Source source8 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                ProductValidationData productValidationData6 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                byte[] bArr12 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                map = map8;
                bArr2 = bArr11;
                bArr9 = bArr12;
                source2 = source8;
                obj = objC;
                bLEOperationType = bLEOperationType5;
                twoWayBleCommPilotLogger = twoWayBleCommPilotLogger5;
                productValidationData2 = productValidationData6;
                iIntValue = ((Number) obj).intValue();
                productForLoggingI = i(productValidationData2);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr9;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 2;
                if (twoWayBleCommPilotLogger.p(bArr2, iIntValue, productForLoggingI, source2, map, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                    bArr3 = bArr9;
                    productValidationData3 = productValidationData2;
                    bLEOperationType2 = bLEOperationType;
                    source3 = source2;
                    map2 = map;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map2;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType2;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 3;
                    objC = this.f10550a.c(SetsKt.g(BLECommunicationServiceType.DuplexConnection.c), new BLEPassengerSideDuplexConnectionInitializationConfig(bArr3), new BLEActiveModeScanningConfig(), bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                    if (objC != obj2) {
                        Map map9 = map2;
                        bLEOperationType3 = bLEOperationType2;
                        bArr4 = bArr3;
                        productValidationData4 = productValidationData3;
                        source4 = source3;
                        map3 = map9;
                        bLEOperationResult = (BLEOperationResult) objC;
                        if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bLEOperationResult;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 4;
                            if (c(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                bArr7 = bArr4;
                                bLEOperationResult3 = bLEOperationResult;
                                bLEOperationType4 = bLEOperationType3;
                                productValidationData5 = productValidationData4;
                                source6 = source4;
                                map4 = map3;
                                bLECommunicationServiceInitializationFailureReason = (BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = productValidationData5;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = source6;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = map4;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = bLEOperationResult3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = twoWayBleCommPilotLogger3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bArr7;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bLECommunicationServiceInitializationFailureReason;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 5;
                                objC = a(bLEOperationType4, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                if (objC != obj2) {
                                    bArr8 = bArr7;
                                    map5 = map4;
                                    source7 = source6;
                                    bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason;
                                    TwoWayBleCommPilotLogger twoWayBleCommPilotLogger6 = twoWayBleCommPilotLogger3;
                                    int iIntValue4 = ((Number) objC).intValue();
                                    ProductForLogging productForLoggingI4 = i(productValidationData5);
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                                    objN = twoWayBleCommPilotLogger6.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue4, productForLoggingI4, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                                    if (objN != obj2) {
                                        pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                                        if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                                            return bLEOperationResult3;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (bLEOperationResult instanceof BLEOperationResult.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationResult;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = twoWayBleCommPilotLogger3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bArr4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 8;
                            objA = a(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                            if (objA != obj2) {
                                source5 = source4;
                                bArr5 = bArr4;
                                bLEOperationResult2 = bLEOperationResult;
                                objC = objA;
                                bArr6 = bArr5;
                                map6 = map3;
                                twoWayBleCommPilotLogger2 = twoWayBleCommPilotLogger3;
                                iIntValue2 = ((Number) objC).intValue();
                                productForLoggingI2 = i(productValidationData4);
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr6;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = bLEOperationResult2;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 9;
                                if (twoWayBleCommPilotLogger2.o(bArr5, iIntValue2, productForLoggingI2, source5, map6, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                    this.i = bArr6;
                                    pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                                    if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                        return bLEOperationResult2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                bLEOperationType2 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                map2 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                source3 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                productValidationData3 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                bArr3 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 3;
                objC = this.f10550a.c(SetsKt.g(BLECommunicationServiceType.DuplexConnection.c), new BLEPassengerSideDuplexConnectionInitializationConfig(bArr3), new BLEActiveModeScanningConfig(), bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                if (objC != obj2) {
                    Map map10 = map2;
                    bLEOperationType3 = bLEOperationType2;
                    bArr4 = bArr3;
                    productValidationData4 = productValidationData3;
                    source4 = source3;
                    map3 = map10;
                    bLEOperationResult = (BLEOperationResult) objC;
                    if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bLEOperationResult;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 4;
                        if (c(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                            bArr7 = bArr4;
                            bLEOperationResult3 = bLEOperationResult;
                            bLEOperationType4 = bLEOperationType3;
                            productValidationData5 = productValidationData4;
                            source6 = source4;
                            map4 = map3;
                            bLECommunicationServiceInitializationFailureReason = (BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = productValidationData5;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = source6;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = map4;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = bLEOperationResult3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = twoWayBleCommPilotLogger3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bArr7;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bLECommunicationServiceInitializationFailureReason;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 5;
                            objC = a(bLEOperationType4, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                            if (objC != obj2) {
                                bArr8 = bArr7;
                                map5 = map4;
                                source7 = source6;
                                bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason;
                                TwoWayBleCommPilotLogger twoWayBleCommPilotLogger7 = twoWayBleCommPilotLogger3;
                                int iIntValue5 = ((Number) objC).intValue();
                                ProductForLogging productForLoggingI5 = i(productValidationData5);
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                                objN = twoWayBleCommPilotLogger7.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue5, productForLoggingI5, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                                if (objN != obj2) {
                                    pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                                    if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                                        return bLEOperationResult3;
                                    }
                                }
                            }
                        }
                    } else {
                        if (bLEOperationResult instanceof BLEOperationResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationResult;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = twoWayBleCommPilotLogger3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bArr4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 8;
                        objA = a(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                        if (objA != obj2) {
                            source5 = source4;
                            bArr5 = bArr4;
                            bLEOperationResult2 = bLEOperationResult;
                            objC = objA;
                            bArr6 = bArr5;
                            map6 = map3;
                            twoWayBleCommPilotLogger2 = twoWayBleCommPilotLogger3;
                            iIntValue2 = ((Number) objC).intValue();
                            productForLoggingI2 = i(productValidationData4);
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr6;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = bLEOperationResult2;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 9;
                            if (twoWayBleCommPilotLogger2.o(bArr5, iIntValue2, productForLoggingI2, source5, map6, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                this.i = bArr6;
                                pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                                if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                    return bLEOperationResult2;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                bLEOperationType2 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                map2 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                source3 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                productValidationData3 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                bArr3 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                Map map11 = map2;
                bLEOperationType3 = bLEOperationType2;
                bArr4 = bArr3;
                productValidationData4 = productValidationData3;
                source4 = source3;
                map3 = map11;
                bLEOperationResult = (BLEOperationResult) objC;
                if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationType3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bLEOperationResult;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 4;
                    if (c(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                        bArr7 = bArr4;
                        bLEOperationResult3 = bLEOperationResult;
                        bLEOperationType4 = bLEOperationType3;
                        productValidationData5 = productValidationData4;
                        source6 = source4;
                        map4 = map3;
                        bLECommunicationServiceInitializationFailureReason = (BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = productValidationData5;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = source6;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = map4;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = bLEOperationResult3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = twoWayBleCommPilotLogger3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bArr7;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bLECommunicationServiceInitializationFailureReason;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 5;
                        objC = a(bLEOperationType4, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                        if (objC != obj2) {
                            bArr8 = bArr7;
                            map5 = map4;
                            source7 = source6;
                            bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason;
                            TwoWayBleCommPilotLogger twoWayBleCommPilotLogger8 = twoWayBleCommPilotLogger3;
                            int iIntValue6 = ((Number) objC).intValue();
                            ProductForLogging productForLoggingI6 = i(productValidationData5);
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                            objN = twoWayBleCommPilotLogger8.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue6, productForLoggingI6, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                            if (objN != obj2) {
                                pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                                if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                                    return bLEOperationResult3;
                                }
                            }
                        }
                    }
                } else {
                    if (bLEOperationResult instanceof BLEOperationResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = productValidationData4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = source4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = map3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = bLEOperationResult;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = twoWayBleCommPilotLogger3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bArr4;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 8;
                    objA = a(bLEOperationType3, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                    if (objA != obj2) {
                        source5 = source4;
                        bArr5 = bArr4;
                        bLEOperationResult2 = bLEOperationResult;
                        objC = objA;
                        bArr6 = bArr5;
                        map6 = map3;
                        twoWayBleCommPilotLogger2 = twoWayBleCommPilotLogger3;
                        iIntValue2 = ((Number) objC).intValue();
                        productForLoggingI2 = i(productValidationData4);
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr6;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = bLEOperationResult2;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 9;
                        if (twoWayBleCommPilotLogger2.o(bArr5, iIntValue2, productForLoggingI2, source5, map6, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                            this.i = bArr6;
                            pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                            bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                            if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                                return bLEOperationResult2;
                            }
                        }
                    }
                }
                return obj2;
            case 4:
                bLEOperationResult3 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5;
                BLEOperationType bLEOperationType6 = (BLEOperationType) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                map3 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                source4 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                productValidationData4 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                byte[] bArr13 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                bLEOperationType4 = bLEOperationType6;
                bArr7 = bArr13;
                productValidationData5 = productValidationData4;
                source6 = source4;
                map4 = map3;
                bLECommunicationServiceInitializationFailureReason = (BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = productValidationData5;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = source6;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = map4;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = bLEOperationResult3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = twoWayBleCommPilotLogger3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = bArr7;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = bLECommunicationServiceInitializationFailureReason;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 5;
                objC = a(bLEOperationType4, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                if (objC != obj2) {
                    bArr8 = bArr7;
                    map5 = map4;
                    source7 = source6;
                    bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason;
                    TwoWayBleCommPilotLogger twoWayBleCommPilotLogger9 = twoWayBleCommPilotLogger3;
                    int iIntValue7 = ((Number) objC).intValue();
                    ProductForLogging productForLoggingI7 = i(productValidationData5);
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                    objN = twoWayBleCommPilotLogger9.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue7, productForLoggingI7, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                    if (objN != obj2) {
                        pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                        bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                        if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                            return bLEOperationResult3;
                        }
                    }
                }
                return obj2;
            case 5:
                BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason3 = (BLECommunicationServiceInitializationFailureReason) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6;
                byte[] bArr14 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5;
                twoWayBleCommPilotLogger3 = (TwoWayBleCommPilotLogger) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                BLEOperationResult bLEOperationResult4 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                Map map12 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                Source source9 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                productValidationData5 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                bArr8 = bArr14;
                map5 = map12;
                source7 = source9;
                bLECommunicationServiceInitializationFailureReason2 = bLECommunicationServiceInitializationFailureReason3;
                bLEOperationResult3 = bLEOperationResult4;
                TwoWayBleCommPilotLogger twoWayBleCommPilotLogger10 = twoWayBleCommPilotLogger3;
                int iIntValue8 = ((Number) objC).intValue();
                ProductForLogging productForLoggingI8 = i(productValidationData5);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 6;
                objN = twoWayBleCommPilotLogger10.n(bArr8, bLECommunicationServiceInitializationFailureReason2, iIntValue8, productForLoggingI8, source7, map5, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2 = bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2;
                if (objN != obj2) {
                    pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                    if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                        return bLEOperationResult3;
                    }
                }
                return obj2;
            case 6:
                bLEOperationResult3 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                pairC = Pair.c((Pair) mutableStateFlow.getValue(), null, new BlePassiveModeStatus.Error(((BLECommunicationServiceInitializationFailureReason) ((BLEOperationResult.Failure) bLEOperationResult3).f1109a).name()), 1);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult3;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 7;
                if (mutableStateFlow.emit(pairC, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) == obj2) {
                    return obj2;
                }
                return bLEOperationResult3;
            case 7:
                BLEOperationResult bLEOperationResult5 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                return bLEOperationResult5;
            case 8:
                byte[] bArr15 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6;
                twoWayBleCommPilotLogger3 = (TwoWayBleCommPilotLogger) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5;
                BLEOperationResult bLEOperationResult6 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4;
                map3 = (Map) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3;
                Source source10 = (Source) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2;
                productValidationData4 = (ProductValidationData) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                byte[] bArr16 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                source5 = source10;
                bArr5 = bArr15;
                bLEOperationResult2 = bLEOperationResult6;
                bArr6 = bArr16;
                map6 = map3;
                twoWayBleCommPilotLogger2 = twoWayBleCommPilotLogger3;
                iIntValue2 = ((Number) objC).intValue();
                productForLoggingI2 = i(productValidationData4);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bArr6;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = bLEOperationResult2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$2 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$3 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$4 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$5 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$6 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 9;
                if (twoWayBleCommPilotLogger2.o(bArr5, iIntValue2, productForLoggingI2, source5, map6, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                    this.i = bArr6;
                    pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                    bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                    if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                        return bLEOperationResult2;
                    }
                }
                return obj2;
            case 9:
                bLEOperationResult2 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1;
                bArr6 = (byte[]) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                this.i = bArr6;
                pairC2 = Pair.c((Pair) mutableStateFlow.getValue(), null, BlePassiveModeStatus.Running.f10531a, 1);
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0 = bLEOperationResult2;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$1 = null;
                bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.label = 10;
                if (mutableStateFlow.emit(pairC2, bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2) != obj2) {
                    return obj2;
                }
                return bLEOperationResult2;
            case 10:
                BLEOperationResult bLEOperationResult7 = (BLEOperationResult) bleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$2.L$0;
                ResultKt.b(objC);
                return bLEOperationResult7;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c4 A[PHI: r1 r2 r5 r6 r7 r8
      0x00c4: PHI (r1v16 app.chalo.ble_communication.base.BLEOperationResult) = 
      (r1v12 app.chalo.ble_communication.base.BLEOperationResult)
      (r1v19 app.chalo.ble_communication.base.BLEOperationResult)
     binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r2v15 app.chalo.validationsdk.blevalidation.helper.BLEOperationType) = 
      (r2v11 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
      (r2v19 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
     binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v17 java.util.Map) = (r5v14 java.util.Map), (r5v20 java.util.Map) binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r6v14 app.chalo.constants.Source) = (r6v10 app.chalo.constants.Source), (r6v18 app.chalo.constants.Source) binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r7v16 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r7v13 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r7v20 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r8v5 byte[]) = (r8v4 byte[]), (r8v12 byte[]) binds: [B:46:0x01c3, B:20:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00e4 A[PHI: r1 r2 r3 r5 r6 r7
      0x00e4: PHI (r1v10 app.chalo.validationsdk.blevalidation.helper.BLEOperationType) = 
      (r1v7 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
      (r1v15 app.chalo.validationsdk.blevalidation.helper.BLEOperationType)
     binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r2v10 java.util.Map) = (r2v7 java.util.Map), (r2v14 java.util.Map) binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r3v10 java.lang.Object) = (r3v9 java.lang.Object), (r3v1 java.lang.Object) binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r5v13 app.chalo.constants.Source) = (r5v10 app.chalo.constants.Source), (r5v16 app.chalo.constants.Source) binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r6v9 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r6v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r6v13 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r7v12 byte[]) = (r7v9 byte[]), (r7v15 byte[]) binds: [B:41:0x01a5, B:22:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0189  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x021b A[PHI: r1 r11
      0x021b: PHI (r1v23 app.chalo.ble_communication.base.BLEOperationResult) = 
      (r1v20 app.chalo.ble_communication.base.BLEOperationResult)
      (r1v25 app.chalo.ble_communication.base.BLEOperationResult)
     binds: [B:53:0x0217, B:17:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r11v3 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startActiveModeBroadcast$1) = 
      (r11v2 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startActiveModeBroadcast$1)
      (r11v0 app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startActiveModeBroadcast$1)
     binds: [B:53:0x0217, B:17:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0241  */
    /* JADX WARN: Code duplicated, block: B:60:0x0245  */
    /* JADX WARN: Code duplicated, block: B:63:0x0262  */
    /* JADX WARN: Code duplicated, block: B:67:0x028b A[PHI: r1 r2
      0x028b: PHI (r1v33 app.chalo.ble_communication.base.BLEOperationResult) = 
      (r1v28 app.chalo.ble_communication.base.BLEOperationResult)
      (r1v35 app.chalo.ble_communication.base.BLEOperationResult)
     binds: [B:65:0x0288, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r2v37 byte[]) = (r2v29 byte[]), (r2v43 byte[]) binds: [B:65:0x0288, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023e, code lost:
    
        if (r15.emit(r2, r11) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a5, code lost:
    
        if (r15.emit(r2, r11) == r4) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r18, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r19, app.chalo.constants.Source r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper.f(byte[], app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
