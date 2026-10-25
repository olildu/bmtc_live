package app.chalo.ble_communication.passengerside.model;

import app.chalo.ble_communication.BLEDuplexConnectionStatus;
import com.silencelaboratories.silentride.components.SilentRideComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/passengerside/model/BLEPassengerSideDuplexConnection;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLEPassengerSideDuplexConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1144a;
    public final SilentRideComponent.Passenger.PassiveModeDriverDevice b;
    public final MutableStateFlow c;

    public BLEPassengerSideDuplexConnection(String connectionId, SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice) {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(BLEDuplexConnectionStatus.NOT_CONNECTED);
        Intrinsics.i(connectionId, "connectionId");
        this.f1144a = connectionId;
        this.b = passiveModeDriverDevice;
        this.c = mutableStateFlowA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(ContinuationImpl continuationImpl) {
        BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1 bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1;
        if (continuationImpl instanceof BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1) {
            bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1 = (BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1) continuationImpl;
            int i = bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1.label = i - Integer.MIN_VALUE;
            } else {
                bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1 = new BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1(this, continuationImpl);
            }
        } else {
            bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1 = new BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1(this, continuationImpl);
        }
        Object objB = bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2 bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2 = new BLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2(this, null);
                bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1.label = 1;
                objB = TimeoutKt.b(10000L, bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$2, bLEPassengerSideDuplexConnection$ensureDeviceConnectivity$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return (BLEDuplexConnectionStatus) objB;
        } catch (TimeoutCancellationException unused) {
            return BLEDuplexConnectionStatus.CONNECTION_BUSY;
        } catch (Exception unused2) {
            return BLEDuplexConnectionStatus.CONNECTION_BUSY;
        }
    }
}
