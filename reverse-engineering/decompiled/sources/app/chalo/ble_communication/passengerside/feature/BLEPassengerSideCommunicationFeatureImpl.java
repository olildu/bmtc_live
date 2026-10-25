package app.chalo.ble_communication.passengerside.feature;

import android.content.Context;
import app.chalo.ble_communication.BLEBroadcastAdvertisementScanningInitializationFailureReason;
import app.chalo.ble_communication.BLECommunicationRange;
import app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason;
import app.chalo.ble_communication.BLECommunicationServiceType;
import app.chalo.ble_communication.BLEDuplexCommunicationInitializationFailureReason;
import app.chalo.ble_communication.BLEDuplexConnectionStatus;
import app.chalo.ble_communication.BLETerminalOperationStatus;
import app.chalo.ble_communication.SilentRideOperationFailureReason;
import app.chalo.ble_communication.StopBLEActiveModeBroadcastFailureReason;
import app.chalo.ble_communication.StopBLEActiveModeScanningFailureReason;
import app.chalo.ble_communication.StopBLEPassiveModeFailureReason;
import app.chalo.ble_communication.base.BLEOperationResult;
import app.chalo.ble_communication.domain.BLEOperationExecutor;
import app.chalo.ble_communication.feature.BLEPermissionRequirement;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature;
import app.chalo.ble_communication.feature.BluetoothTurnOnFailureReason;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.ble_communication.mapper.BLEOperationFailureReasonMapperKt;
import app.chalo.ble_communication.mapper.BLETerminalOpStatusToOpResultsMapperKt;
import app.chalo.ble_communication.mapper.BluetoothHardwareOperationsMapperKt;
import app.chalo.ble_communication.model.BLEActiveModeScanningConfig;
import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.ble_communication.passengerside.PassengerSideBLEOperationsMapperKt;
import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnectionInitializationConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import com.silencelaboratories.silentride.components.SilentRideComponent;
import com.silencelaboratories.silentride.operations.StartActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StartPassiveModeSilentRidePassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeBroadcastPassengerOperation;
import com.silencelaboratories.silentride.operations.StopActiveModeScanPassengerOperation;
import com.silencelaboratories.silentride.operations.StopPassiveModeSilentRidePassengerOperation;
import defpackage.l3;
import defpackage.v5;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/passengerside/feature/BLEPassengerSideCommunicationFeatureImpl;", "Lapp/chalo/ble_communication/passengerside/feature/BLEPassengerSideCommunicationFeature;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLEPassengerSideCommunicationFeatureImpl implements BLEPassengerSideCommunicationFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f1139a;
    public final BluetoothPermissionAndSystemFeature b;
    public final BluetoothHardwareOperationsFeature c;
    public final PassengerSideConnectionPoolManager d;
    public final BLEOperationExecutor e;
    public final Lazy f;
    public final ContextScope i;
    public Boolean k;
    public final MutableStateFlow g = StateFlowKt.a(null);
    public final MutableStateFlow h = StateFlowKt.a(null);
    public final MutexImpl j = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1140a;

        static {
            int[] iArr = new int[BLEDuplexConnectionStatus.values().length];
            try {
                iArr[BLEDuplexConnectionStatus.CONNECTION_BUSY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEDuplexConnectionStatus.ESTABLISHING_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEDuplexConnectionStatus.NOT_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BLEDuplexConnectionStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1140a = iArr;
        }
    }

    public BLEPassengerSideCommunicationFeatureImpl(Context context, CoroutineContextProvider coroutineContextProvider, BasicInfoContract basicInfoContract, BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature, BluetoothHardwareOperationsFeature bluetoothHardwareOperationsFeature, PassengerSideConnectionPoolManager passengerSideConnectionPoolManager, BLEOperationExecutor bLEOperationExecutor) {
        this.f1139a = basicInfoContract;
        this.b = bluetoothPermissionAndSystemFeature;
        this.c = bluetoothHardwareOperationsFeature;
        this.d = passengerSideConnectionPoolManager;
        this.e = bLEOperationExecutor;
        this.f = LazyKt.b(new l3(8, context, this));
        this.i = CoroutineScopeKt.a(coroutineContextProvider.b());
        SharedFlowKt.b(0, 0, null, 7);
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final StateFlow a() {
        return FlowKt.c(this.g);
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final void b() {
        BuildersKt.d(this.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcastAsync$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01af A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cd A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d0 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01dc A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01df A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e8 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f5 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:100:0x01a2, B:104:0x01ab, B:106:0x01af, B:113:0x01cd, B:120:0x01e1, B:114:0x01d0, B:115:0x01d5, B:116:0x01d6, B:117:0x01d9, B:118:0x01dc, B:119:0x01df, B:123:0x01e8, B:125:0x01ec, B:128:0x01f5, B:129:0x01fa), top: B:137:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0201 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010d A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0110 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0119 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011d A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0151 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x016c A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016f A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0175 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0178 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x017b A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0184 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0190 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:22:0x0055, B:73:0x0144, B:74:0x0147, B:76:0x014b, B:78:0x0151, B:83:0x016c, B:89:0x017d, B:84:0x016f, B:85:0x0174, B:86:0x0175, B:87:0x0178, B:88:0x017b, B:94:0x0188, B:96:0x0190, B:102:0x01a5, B:92:0x0184, B:130:0x01fb, B:131:0x0200, B:27:0x006e, B:45:0x00e0, B:47:0x00e6, B:52:0x0101, B:58:0x0112, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x010d, B:57:0x0110, B:61:0x0119, B:63:0x011d, B:65:0x0123, B:68:0x012c, B:69:0x0132, B:132:0x0201, B:133:0x0206, B:38:0x00b8, B:41:0x00be, B:42:0x00c8), top: B:136:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final Object c(Set set, BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig, BLEActiveModeScanningConfig bLEActiveModeScanningConfig, ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1 bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1;
        ?? r2;
        BLEActiveModeScanningConfig bLEActiveModeScanningConfig2;
        BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig2;
        Mutex mutex;
        Set set2;
        BLEActiveModeScanningConfig bLEActiveModeScanningConfig3;
        BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig3;
        BLEOperationResult bLEOperationResult;
        Set set3;
        BLEOperationResult success;
        int i;
        BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason;
        BLEOperationResult success2;
        ?? r3;
        ?? r4;
        int i2;
        BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason2;
        int i3;
        BLECommunicationServiceInitializationFailureReason bLECommunicationServiceInitializationFailureReason3;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1) {
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1 = (BLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1) continuationImpl;
            int i4 = bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = i4 - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1 = new BLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1 = new BLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1(this, continuationImpl);
        }
        Object objD = bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r5 = bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label;
        BLECommunicationServiceType.AdvertisementScanning advertisementScanning = BLECommunicationServiceType.b;
        try {
            if (r5 == 0) {
                ResultKt.b(objD);
                if (set.isEmpty()) {
                    return new BLEOperationResult.Success();
                }
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = set;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = bLEPassengerSideDuplexConnectionInitializationConfig;
                bLEActiveModeScanningConfig2 = bLEActiveModeScanningConfig;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = bLEActiveModeScanningConfig2;
                MutexImpl mutexImpl = this.j;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = mutexImpl;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 1;
                if (mutexImpl.a(bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1) != coroutineSingletons) {
                    bLEPassengerSideDuplexConnectionInitializationConfig2 = bLEPassengerSideDuplexConnectionInitializationConfig;
                    mutex = mutexImpl;
                    set2 = set;
                }
                return coroutineSingletons;
            }
            if (r5 == 1) {
                mutex = (Mutex) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3;
                bLEActiveModeScanningConfig2 = (BLEActiveModeScanningConfig) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2;
                bLEPassengerSideDuplexConnectionInitializationConfig2 = (BLEPassengerSideDuplexConnectionInitializationConfig) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1;
                set2 = (Set) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0;
                ResultKt.b(objD);
            } else {
                if (r5 == 2) {
                    mutex = (Mutex) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3;
                    bLEActiveModeScanningConfig2 = (BLEActiveModeScanningConfig) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2;
                    bLEPassengerSideDuplexConnectionInitializationConfig2 = (BLEPassengerSideDuplexConnectionInitializationConfig) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1;
                    set2 = (Set) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0;
                    ResultKt.b(objD);
                    BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig4 = bLEPassengerSideDuplexConnectionInitializationConfig2;
                    bLEActiveModeScanningConfig3 = bLEActiveModeScanningConfig2;
                    bLEPassengerSideDuplexConnectionInitializationConfig3 = bLEPassengerSideDuplexConnectionInitializationConfig4;
                    bLEOperationResult = (BLEOperationResult) objD;
                    if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                        BluetoothTurnOnFailureReason bluetoothTurnOnFailureReason = (BluetoothTurnOnFailureReason) ((BLEOperationResult.Failure) bLEOperationResult).f1109a;
                        Intrinsics.i(bluetoothTurnOnFailureReason, "<this>");
                        i = BluetoothHardwareOperationsMapperKt.WhenMappings.f1129a[bluetoothTurnOnFailureReason.ordinal()];
                        if (i != 1) {
                            bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.REQUIRED_PERMISSIONS_NOT_GRANTED;
                        } else if (i != 2) {
                            bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE;
                        } else if (i != 3) {
                            bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_TURN_ON_OPERATION_FAILED;
                        } else {
                            if (i == 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY;
                        }
                        BLEOperationResult.Failure failure = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason);
                        mutex.e(null);
                        return failure;
                    }
                    if (bLEOperationResult instanceof BLEOperationResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (set2.contains(advertisementScanning) && !set2.contains(BLECommunicationServiceType.f1094a)) {
                        success = new BLEOperationResult.Success();
                        if (success instanceof BLEOperationResult.Failure) {
                            if (set2.contains(advertisementScanning)) {
                                BLEBroadcastAdvertisementScanningInitializationFailureReason bLEBroadcastAdvertisementScanningInitializationFailureReason = (BLEBroadcastAdvertisementScanningInitializationFailureReason) ((BLEOperationResult.Failure) success).f1109a;
                                Intrinsics.i(bLEBroadcastAdvertisementScanningInitializationFailureReason, "<this>");
                                i2 = BLEOperationFailureReasonMapperKt.WhenMappings.f1128a[bLEBroadcastAdvertisementScanningInitializationFailureReason.ordinal()];
                                if (i2 != 1) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_FAILED;
                                } else if (i2 != 2) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_REJECTED;
                                } else if (i2 != 3) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_TIMED_OUT;
                                } else {
                                    if (i2 == 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_UNKNOWN;
                                }
                                BLEOperationResult.Failure failure2 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason2);
                                mutex.e(null);
                                return failure2;
                            }
                        } else if (!(success instanceof BLEOperationResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (set2.contains(BLECommunicationServiceType.DuplexConnection.c)) {
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = mutex;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 4;
                            objD = l(bLEPassengerSideDuplexConnectionInitializationConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                            if (objD != coroutineSingletons) {
                                r4 = mutex;
                            }
                        } else {
                            success2 = new BLEOperationResult.Success();
                            r3 = mutex;
                        }
                        if (!(success2 instanceof BLEOperationResult.Failure)) {
                            if (!(success2 instanceof BLEOperationResult.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            BLEOperationResult.Success success3 = new BLEOperationResult.Success();
                            r3.e(null);
                            return success3;
                        }
                        BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason = (BLEDuplexCommunicationInitializationFailureReason) ((BLEOperationResult.Failure) success2).f1109a;
                        Intrinsics.i(bLEDuplexCommunicationInitializationFailureReason, "<this>");
                        i3 = BLEOperationFailureReasonMapperKt.WhenMappings.b[bLEDuplexCommunicationInitializationFailureReason.ordinal()];
                        if (i3 == 1) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT;
                        } else if (i3 == 2) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN;
                        } else if (i3 == 3) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED;
                        } else if (i3 == 4) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED;
                        } else {
                            if (i3 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED;
                        }
                        BLEOperationResult.Failure failure3 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason3);
                        r3.e(null);
                        return failure3;
                    }
                    bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = set2;
                    bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = bLEPassengerSideDuplexConnectionInitializationConfig3;
                    bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = mutex;
                    bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                    bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 3;
                    objD = k(bLEActiveModeScanningConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                    if (objD == coroutineSingletons) {
                        set3 = set2;
                        success = (BLEOperationResult) objD;
                        set2 = set3;
                        if (success instanceof BLEOperationResult.Failure) {
                            if (set2.contains(advertisementScanning)) {
                                BLEBroadcastAdvertisementScanningInitializationFailureReason bLEBroadcastAdvertisementScanningInitializationFailureReason2 = (BLEBroadcastAdvertisementScanningInitializationFailureReason) ((BLEOperationResult.Failure) success).f1109a;
                                Intrinsics.i(bLEBroadcastAdvertisementScanningInitializationFailureReason2, "<this>");
                                i2 = BLEOperationFailureReasonMapperKt.WhenMappings.f1128a[bLEBroadcastAdvertisementScanningInitializationFailureReason2.ordinal()];
                                if (i2 != 1) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_FAILED;
                                } else if (i2 != 2) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_REJECTED;
                                } else if (i2 != 3) {
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_TIMED_OUT;
                                } else {
                                    if (i2 == 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_UNKNOWN;
                                }
                                BLEOperationResult.Failure failure4 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason2);
                                mutex.e(null);
                                return failure4;
                            }
                        } else if (!(success instanceof BLEOperationResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (set2.contains(BLECommunicationServiceType.DuplexConnection.c)) {
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = mutex;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 4;
                            objD = l(bLEPassengerSideDuplexConnectionInitializationConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                            if (objD != coroutineSingletons) {
                                r4 = mutex;
                            }
                        } else {
                            success2 = new BLEOperationResult.Success();
                            r3 = mutex;
                        }
                        if (!(success2 instanceof BLEOperationResult.Failure)) {
                            if (!(success2 instanceof BLEOperationResult.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            BLEOperationResult.Success success4 = new BLEOperationResult.Success();
                            r3.e(null);
                            return success4;
                        }
                        BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason2 = (BLEDuplexCommunicationInitializationFailureReason) ((BLEOperationResult.Failure) success2).f1109a;
                        Intrinsics.i(bLEDuplexCommunicationInitializationFailureReason2, "<this>");
                        i3 = BLEOperationFailureReasonMapperKt.WhenMappings.b[bLEDuplexCommunicationInitializationFailureReason2.ordinal()];
                        if (i3 == 1) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT;
                        } else if (i3 == 2) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN;
                        } else if (i3 == 3) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED;
                        } else if (i3 == 4) {
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED;
                        } else {
                            if (i3 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED;
                        }
                        BLEOperationResult.Failure failure5 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason3);
                        r3.e(null);
                        return failure5;
                    }
                    return coroutineSingletons;
                }
                if (r5 == 3) {
                    mutex = (Mutex) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2;
                    bLEPassengerSideDuplexConnectionInitializationConfig3 = (BLEPassengerSideDuplexConnectionInitializationConfig) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1;
                    set3 = (Set) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0;
                    ResultKt.b(objD);
                    success = (BLEOperationResult) objD;
                    set2 = set3;
                    if (success instanceof BLEOperationResult.Failure) {
                        if (set2.contains(advertisementScanning)) {
                            BLEBroadcastAdvertisementScanningInitializationFailureReason bLEBroadcastAdvertisementScanningInitializationFailureReason3 = (BLEBroadcastAdvertisementScanningInitializationFailureReason) ((BLEOperationResult.Failure) success).f1109a;
                            Intrinsics.i(bLEBroadcastAdvertisementScanningInitializationFailureReason3, "<this>");
                            i2 = BLEOperationFailureReasonMapperKt.WhenMappings.f1128a[bLEBroadcastAdvertisementScanningInitializationFailureReason3.ordinal()];
                            if (i2 != 1) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_FAILED;
                            } else if (i2 != 2) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_REJECTED;
                            } else if (i2 != 3) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_TIMED_OUT;
                            } else {
                                if (i2 == 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_UNKNOWN;
                            }
                            BLEOperationResult.Failure failure6 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason2);
                            mutex.e(null);
                            return failure6;
                        }
                    } else if (!(success instanceof BLEOperationResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (set2.contains(BLECommunicationServiceType.DuplexConnection.c)) {
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = mutex;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 4;
                        objD = l(bLEPassengerSideDuplexConnectionInitializationConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                        if (objD != coroutineSingletons) {
                            r4 = mutex;
                        }
                        return coroutineSingletons;
                    }
                    success2 = new BLEOperationResult.Success();
                    r3 = mutex;
                    if (!(success2 instanceof BLEOperationResult.Failure)) {
                        if (!(success2 instanceof BLEOperationResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BLEOperationResult.Success success5 = new BLEOperationResult.Success();
                        r3.e(null);
                        return success5;
                    }
                    BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason3 = (BLEDuplexCommunicationInitializationFailureReason) ((BLEOperationResult.Failure) success2).f1109a;
                    Intrinsics.i(bLEDuplexCommunicationInitializationFailureReason3, "<this>");
                    i3 = BLEOperationFailureReasonMapperKt.WhenMappings.b[bLEDuplexCommunicationInitializationFailureReason3.ordinal()];
                    if (i3 == 1) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT;
                    } else if (i3 == 2) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN;
                    } else if (i3 == 3) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED;
                    } else if (i3 == 4) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED;
                    } else {
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED;
                    }
                    BLEOperationResult.Failure failure7 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason3);
                    r3.e(null);
                    return failure7;
                }
                if (r5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r2 = (Mutex) bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0;
                try {
                    ResultKt.b(objD);
                    r4 = r2;
                } catch (Throwable th) {
                    th = th;
                    r2.e(null);
                    throw th;
                }
            }
            success2 = (BLEOperationResult) objD;
            r3 = r4;
            if (!(success2 instanceof BLEOperationResult.Failure)) {
                if (!(success2 instanceof BLEOperationResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                BLEOperationResult.Success success6 = new BLEOperationResult.Success();
                r3.e(null);
                return success6;
            }
            BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason4 = (BLEDuplexCommunicationInitializationFailureReason) ((BLEOperationResult.Failure) success2).f1109a;
            Intrinsics.i(bLEDuplexCommunicationInitializationFailureReason4, "<this>");
            i3 = BLEOperationFailureReasonMapperKt.WhenMappings.b[bLEDuplexCommunicationInitializationFailureReason4.ordinal()];
            if (i3 == 1) {
                bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT;
            } else if (i3 == 2) {
                bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN;
            } else if (i3 == 3) {
                bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED;
            } else if (i3 == 4) {
                bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED;
            }
            BLEOperationResult.Failure failure8 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason3);
            r3.e(null);
            return failure8;
            Boolean bool = this.k;
            BluetoothHardwareOperationsFeature bluetoothHardwareOperationsFeature = this.c;
            if (bool == null) {
                this.k = Boolean.valueOf(bluetoothHardwareOperationsFeature.c());
            }
            BLEPermissionRequirement bLEPermissionRequirementF = this.b.f(set2);
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = set2;
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = bLEPassengerSideDuplexConnectionInitializationConfig2;
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = bLEActiveModeScanningConfig2;
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = mutex;
            bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 2;
            objD = bluetoothHardwareOperationsFeature.d(bLEPermissionRequirementF, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
            if (objD != coroutineSingletons) {
                BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig5 = bLEPassengerSideDuplexConnectionInitializationConfig2;
                bLEActiveModeScanningConfig3 = bLEActiveModeScanningConfig2;
                bLEPassengerSideDuplexConnectionInitializationConfig3 = bLEPassengerSideDuplexConnectionInitializationConfig5;
                bLEOperationResult = (BLEOperationResult) objD;
                if (bLEOperationResult instanceof BLEOperationResult.Failure) {
                    BluetoothTurnOnFailureReason bluetoothTurnOnFailureReason2 = (BluetoothTurnOnFailureReason) ((BLEOperationResult.Failure) bLEOperationResult).f1109a;
                    Intrinsics.i(bluetoothTurnOnFailureReason2, "<this>");
                    i = BluetoothHardwareOperationsMapperKt.WhenMappings.f1129a[bluetoothTurnOnFailureReason2.ordinal()];
                    if (i != 1) {
                        bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.REQUIRED_PERMISSIONS_NOT_GRANTED;
                    } else if (i != 2) {
                        bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE;
                    } else if (i != 3) {
                        bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_TURN_ON_OPERATION_FAILED;
                    } else {
                        if (i == 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bLECommunicationServiceInitializationFailureReason = BLECommunicationServiceInitializationFailureReason.BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY;
                    }
                    BLEOperationResult.Failure failure9 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason);
                    mutex.e(null);
                    return failure9;
                }
                if (bLEOperationResult instanceof BLEOperationResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                if (set2.contains(advertisementScanning)) {
                }
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = set2;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = bLEPassengerSideDuplexConnectionInitializationConfig3;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = mutex;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 3;
                objD = k(bLEActiveModeScanningConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                if (objD == coroutineSingletons) {
                    set3 = set2;
                    success = (BLEOperationResult) objD;
                    set2 = set3;
                    if (success instanceof BLEOperationResult.Failure) {
                        if (set2.contains(advertisementScanning)) {
                            BLEBroadcastAdvertisementScanningInitializationFailureReason bLEBroadcastAdvertisementScanningInitializationFailureReason4 = (BLEBroadcastAdvertisementScanningInitializationFailureReason) ((BLEOperationResult.Failure) success).f1109a;
                            Intrinsics.i(bLEBroadcastAdvertisementScanningInitializationFailureReason4, "<this>");
                            i2 = BLEOperationFailureReasonMapperKt.WhenMappings.f1128a[bLEBroadcastAdvertisementScanningInitializationFailureReason4.ordinal()];
                            if (i2 != 1) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_FAILED;
                            } else if (i2 != 2) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_REJECTED;
                            } else if (i2 != 3) {
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_TIMED_OUT;
                            } else {
                                if (i2 == 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bLECommunicationServiceInitializationFailureReason2 = BLECommunicationServiceInitializationFailureReason.BLE_BROADCAST_ADV_SCANNING_UNKNOWN;
                            }
                            BLEOperationResult.Failure failure10 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason2);
                            mutex.e(null);
                            return failure10;
                        }
                    } else if (!(success instanceof BLEOperationResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (set2.contains(BLECommunicationServiceType.DuplexConnection.c)) {
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$0 = mutex;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$1 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$2 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.L$3 = null;
                        bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1.label = 4;
                        objD = l(bLEPassengerSideDuplexConnectionInitializationConfig3, bLEPassengerSideCommunicationFeatureImpl$startBLECommunicationService$1);
                        if (objD != coroutineSingletons) {
                            r4 = mutex;
                            success2 = (BLEOperationResult) objD;
                            r3 = r4;
                        }
                    } else {
                        success2 = new BLEOperationResult.Success();
                        r3 = mutex;
                    }
                    if (!(success2 instanceof BLEOperationResult.Failure)) {
                        if (!(success2 instanceof BLEOperationResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BLEOperationResult.Success success7 = new BLEOperationResult.Success();
                        r3.e(null);
                        return success7;
                    }
                    BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason5 = (BLEDuplexCommunicationInitializationFailureReason) ((BLEOperationResult.Failure) success2).f1109a;
                    Intrinsics.i(bLEDuplexCommunicationInitializationFailureReason5, "<this>");
                    i3 = BLEOperationFailureReasonMapperKt.WhenMappings.b[bLEDuplexCommunicationInitializationFailureReason5.ordinal()];
                    if (i3 == 1) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_TIMED_OUT;
                    } else if (i3 == 2) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_UNKNOWN;
                    } else if (i3 == 3) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_INITIALIZATION_CONFIG_NOT_PROVIDED;
                    } else if (i3 == 4) {
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_FAILED;
                    } else {
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bLECommunicationServiceInitializationFailureReason3 = BLECommunicationServiceInitializationFailureReason.BLE_DUPLEX_COMMUNICATION_REJECTED;
                    }
                    BLEOperationResult.Failure failure11 = new BLEOperationResult.Failure(bLECommunicationServiceInitializationFailureReason3);
                    r3.e(null);
                    return failure11;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            r2 = r5;
        }
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final void d() {
        BuildersKt.d(this.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$stopBleCommunicationServiceAsync$1(this, null), 3);
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final StateFlow e() {
        return FlowKt.c(this.d.d);
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final StateFlow f() {
        return FlowKt.c(this.d.e);
    }

    @Override // app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature
    public final Object g(BLETransferData.OneWayBroadcastBLETransferData oneWayBroadcastBLETransferData, Continuation continuation) {
        String message = "BLECommConnectionDataExchange: PassengerSide sendData on broadcast called data = " + oneWayBroadcastBLETransferData.f1133a;
        Intrinsics.i(message, "message");
        return j(oneWayBroadcastBLETransferData, (ContinuationImpl) continuation);
    }

    public final SilentRideComponent.Passenger h() {
        return (SilentRideComponent.Passenger) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        if (r14 == r0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl.i(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r10 == r0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl.j(app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k(BLEActiveModeScanningConfig bLEActiveModeScanningConfig, ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1 bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1;
        Object success;
        BLEBroadcastAdvertisementScanningInitializationFailureReason bLEBroadcastAdvertisementScanningInitializationFailureReason;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1) {
            bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1 = (BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1) continuationImpl;
            int i = bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1 = new BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1 = new BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1(this, continuationImpl);
        }
        BLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1 bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$2 = bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$1;
        Object objC = bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            StartActiveModeScanPassengerOperation startActiveModeScanPassengerOperationE = h().e(new v5(10));
            bLEActiveModeScanningConfig.getClass();
            bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$2.label = 1;
            objC = this.e.c(startActiveModeScanPassengerOperationE, 15000L, false, bLEPassengerSideCommunicationFeatureImpl$startActiveModeScanning$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        BLETerminalOperationStatus bLETerminalOperationStatus = (BLETerminalOperationStatus) objC;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure) {
            SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
            if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
                bLEBroadcastAdvertisementScanningInitializationFailureReason = BLEBroadcastAdvertisementScanningInitializationFailureReason.FAILED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
                bLEBroadcastAdvertisementScanningInitializationFailureReason = BLEBroadcastAdvertisementScanningInitializationFailureReason.REJECTED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
                bLEBroadcastAdvertisementScanningInitializationFailureReason = BLEBroadcastAdvertisementScanningInitializationFailureReason.TIMED_OUT;
            } else {
                if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                bLEBroadcastAdvertisementScanningInitializationFailureReason = BLEBroadcastAdvertisementScanningInitializationFailureReason.UNKNOWN;
            }
            success = new BLEOperationResult.Failure(bLEBroadcastAdvertisementScanningInitializationFailureReason);
        } else {
            if (!bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                throw new NoWhenBranchMatchedException();
            }
            success = new BLEOperationResult.Success();
        }
        if (!(success instanceof BLEOperationResult.Failure)) {
            if (success instanceof BLEOperationResult.Success) {
                return success;
            }
            throw new NoWhenBranchMatchedException();
        }
        String message = "BLECommPassengerSideActiveMode init op failed reason = " + ((BLEOperationResult.Failure) success).f1109a;
        Intrinsics.i(message, "message");
        return success;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig, ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1 bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1;
        SilentRideComponent.Passenger.PassiveModeBroadcastPower passiveModeBroadcastPower;
        BLEDuplexCommunicationInitializationFailureReason bLEDuplexCommunicationInitializationFailureReason;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1) {
            bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1 = (BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1) continuationImpl;
            int i = bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1 = new BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1 = new BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1(this, continuationImpl);
        }
        BLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1 bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$2 = bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$1;
        Object objC = bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (bLEPassengerSideDuplexConnectionInitializationConfig == null) {
                return new BLEOperationResult.Failure(BLEDuplexCommunicationInitializationFailureReason.INITIALIZATION_CONFIG_NOT_AVAILABLE);
            }
            byte[] bArr = bLEPassengerSideDuplexConnectionInitializationConfig.f1145a;
            String message = "BLECommPassengerSide start passive mode, helloData = " + bArr;
            Intrinsics.i(message, "message");
            SilentRideComponent.Passenger passengerH = h();
            BLECommunicationRange bLECommunicationRange = BLECommunicationRange.LONG;
            Intrinsics.i(bLECommunicationRange, "<this>");
            int i3 = PassengerSideBLEOperationsMapperKt.WhenMappings.f1138a[bLECommunicationRange.ordinal()];
            if (i3 == 1) {
                passiveModeBroadcastPower = SilentRideComponent.Passenger.PassiveModeBroadcastPower.POWER_MIN;
            } else if (i3 == 2) {
                passiveModeBroadcastPower = SilentRideComponent.Passenger.PassiveModeBroadcastPower.POWER_LIMITED_CLOSE_RANGE;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                passiveModeBroadcastPower = SilentRideComponent.Passenger.PassiveModeBroadcastPower.POWER_MAX;
            }
            StartPassiveModeSilentRidePassengerOperation startPassiveModeSilentRidePassengerOperationF = passengerH.f(bArr, passiveModeBroadcastPower, new a(this));
            long j = bLEPassengerSideDuplexConnectionInitializationConfig.c;
            bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$2.label = 1;
            objC = this.e.c(startPassiveModeSilentRidePassengerOperationF, j, true, bLEPassengerSideCommunicationFeatureImpl$startBLEDuplexCommunicationService$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        BLETerminalOperationStatus bLETerminalOperationStatus = (BLETerminalOperationStatus) objC;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (!(bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure)) {
            if (bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                return new BLEOperationResult.Success();
            }
            throw new NoWhenBranchMatchedException();
        }
        SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
        if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
            bLEDuplexCommunicationInitializationFailureReason = BLEDuplexCommunicationInitializationFailureReason.FAILED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
            bLEDuplexCommunicationInitializationFailureReason = BLEDuplexCommunicationInitializationFailureReason.REJECTED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
            bLEDuplexCommunicationInitializationFailureReason = BLEDuplexCommunicationInitializationFailureReason.TIMED_OUT;
        } else {
            if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            bLEDuplexCommunicationInitializationFailureReason = BLEDuplexCommunicationInitializationFailureReason.UNKNOWN;
        }
        return new BLEOperationResult.Failure(bLEDuplexCommunicationInitializationFailureReason);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object m(ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1 bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1;
        BLEOperationResult success;
        StopBLEActiveModeBroadcastFailureReason stopBLEActiveModeBroadcastFailureReason;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1) {
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1 = (BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1) continuationImpl;
            int i = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1 = new BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1 = new BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1(this, continuationImpl);
        }
        BLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1 bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$2 = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$1;
        Object objC = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            StopActiveModeBroadcastPassengerOperation stopActiveModeBroadcastPassengerOperationG = h().g();
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$2.label = 1;
            objC = this.e.c(stopActiveModeBroadcastPassengerOperationG, 10000L, true, bLEPassengerSideCommunicationFeatureImpl$stopActiveModeBroadcast$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        BLETerminalOperationStatus bLETerminalOperationStatus = (BLETerminalOperationStatus) objC;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure) {
            SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
            if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
                stopBLEActiveModeBroadcastFailureReason = StopBLEActiveModeBroadcastFailureReason.FAILED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
                stopBLEActiveModeBroadcastFailureReason = StopBLEActiveModeBroadcastFailureReason.REJECTED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
                stopBLEActiveModeBroadcastFailureReason = StopBLEActiveModeBroadcastFailureReason.TIMED_OUT;
            } else {
                if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                stopBLEActiveModeBroadcastFailureReason = StopBLEActiveModeBroadcastFailureReason.UNKNOWN;
            }
            success = new BLEOperationResult.Failure(stopBLEActiveModeBroadcastFailureReason);
        } else {
            if (!bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                throw new NoWhenBranchMatchedException();
            }
            success = new BLEOperationResult.Success();
        }
        if (!(success instanceof BLEOperationResult.Failure)) {
            if (success instanceof BLEOperationResult.Success) {
                return new BLEOperationResult.Success();
            }
            throw new NoWhenBranchMatchedException();
        }
        Object obj = ((BLEOperationResult.Failure) success).f1109a;
        String message = "BLEComm stop active mode broadcast failure reason = " + ((StopBLEActiveModeBroadcastFailureReason) obj).name();
        Intrinsics.i(message, "message");
        return new BLEOperationResult.Failure(obj);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1 bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1;
        BLEOperationResult success;
        StopBLEActiveModeScanningFailureReason stopBLEActiveModeScanningFailureReason;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1) {
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1 = (BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1) continuationImpl;
            int i = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1 = new BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1 = new BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1(this, continuationImpl);
        }
        BLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1 bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$2 = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$1;
        Object objC = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            StopActiveModeScanPassengerOperation stopActiveModeScanPassengerOperationH = h().h();
            bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$2.label = 1;
            objC = this.e.c(stopActiveModeScanPassengerOperationH, 10000L, true, bLEPassengerSideCommunicationFeatureImpl$stopActiveModeScanning$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        BLETerminalOperationStatus bLETerminalOperationStatus = (BLETerminalOperationStatus) objC;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure) {
            SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
            if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
                stopBLEActiveModeScanningFailureReason = StopBLEActiveModeScanningFailureReason.FAILED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
                stopBLEActiveModeScanningFailureReason = StopBLEActiveModeScanningFailureReason.REJECTED;
            } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
                stopBLEActiveModeScanningFailureReason = StopBLEActiveModeScanningFailureReason.TIMED_OUT;
            } else {
                if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                stopBLEActiveModeScanningFailureReason = StopBLEActiveModeScanningFailureReason.UNKNOWN;
            }
            success = new BLEOperationResult.Failure(stopBLEActiveModeScanningFailureReason);
        } else {
            if (!bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                throw new NoWhenBranchMatchedException();
            }
            success = new BLEOperationResult.Success();
        }
        if (!(success instanceof BLEOperationResult.Failure)) {
            if (success instanceof BLEOperationResult.Success) {
                return new BLEOperationResult.Success();
            }
            throw new NoWhenBranchMatchedException();
        }
        Object obj = ((BLEOperationResult.Failure) success).f1109a;
        String message = "BLEComm stop active mode scanning failure reason = " + ((StopBLEActiveModeScanningFailureReason) obj).name();
        Intrinsics.i(message, "message");
        return new BLEOperationResult.Failure(obj);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002f, B:28:0x0074, B:30:0x007e, B:31:0x009b, B:35:0x00a3, B:36:0x00a8), top: B:41:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002f, B:28:0x0074, B:30:0x007e, B:31:0x009b, B:35:0x00a3, B:36:0x00a8), top: B:41:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002f, B:28:0x0074, B:30:0x007e, B:31:0x009b, B:35:0x00a3, B:36:0x00a8), top: B:41:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x007e, please report this as an issue */
    public final Object o(ContinuationImpl continuationImpl) throws Throwable {
        BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1 bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1;
        Mutex mutex;
        Mutex mutex2;
        BLEOperationResult bLEOperationResultB;
        if (continuationImpl instanceof BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1) {
            bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1 = (BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1) continuationImpl;
            int i = bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1 = new BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1 = new BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1(this, continuationImpl);
        }
        BLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1 bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2 = bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$1;
        Object obj = bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = this.j;
                bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.L$0 = mutex;
                bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.label = 1;
                if (mutex.a(bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.L$0;
                try {
                    ResultKt.b(obj);
                    bLEOperationResultB = BLETerminalOpStatusToOpResultsMapperKt.b((BLETerminalOperationStatus) obj);
                    if (bLEOperationResultB instanceof BLEOperationResult.Failure) {
                        String message = "BLEComm stop passive mode failure reason = " + ((StopBLEPassiveModeFailureReason) ((BLEOperationResult.Failure) bLEOperationResultB).f1109a).name();
                        Intrinsics.i(message, "message");
                    } else if (!(bLEOperationResultB instanceof BLEOperationResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mutex2.e(null);
                    return bLEOperationResultB;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    mutex2.e(null);
                    throw th2;
                }
            }
            Mutex mutex3 = (Mutex) bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            StopPassiveModeSilentRidePassengerOperation stopPassiveModeSilentRidePassengerOperationI = h().i();
            BLEOperationExecutor bLEOperationExecutor = this.e;
            bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.L$0 = mutex;
            bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2.label = 2;
            Object objC = bLEOperationExecutor.c(stopPassiveModeSilentRidePassengerOperationI, 10000L, true, bLEPassengerSideCommunicationFeatureImpl$stopPassiveMode$2);
            if (objC != coroutineSingletons) {
                mutex2 = mutex;
                obj = objC;
                bLEOperationResultB = BLETerminalOpStatusToOpResultsMapperKt.b((BLETerminalOperationStatus) obj);
                if (bLEOperationResultB instanceof BLEOperationResult.Failure) {
                    String message2 = "BLEComm stop passive mode failure reason = " + ((StopBLEPassiveModeFailureReason) ((BLEOperationResult.Failure) bLEOperationResultB).f1109a).name();
                    Intrinsics.i(message2, "message");
                } else if (!(bLEOperationResultB instanceof BLEOperationResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                mutex2.e(null);
                return bLEOperationResultB;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            Throwable th4 = th;
            mutex2.e(null);
            throw th4;
        }
    }
}
