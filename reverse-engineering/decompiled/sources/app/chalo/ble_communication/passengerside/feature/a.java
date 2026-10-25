package app.chalo.ble_communication.passengerside.feature;

import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.contract.BasicInfoContract;
import com.silencelaboratories.silentride.components.SilentRideComponent;
import defpackage.vo1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BLEPassengerSideCommunicationFeatureImpl f1142a;

    public /* synthetic */ a(BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl) {
        this.f1142a = bLEPassengerSideCommunicationFeatureImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice = (SilentRideComponent.Passenger.PassiveModeDriverDevice) obj2;
        Intrinsics.i(passiveModeDriverDevice, "passiveModeDriverDevice");
        BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl = this.f1142a;
        BasicInfoContract basicInfoContract = bLEPassengerSideCommunicationFeatureImpl.f1139a;
        vo1.x("BLECommConnectionDataExchange: PassengerSide data received data = ", bArr != null ? bArr.toString() : null, "message");
        if (bArr != null) {
            BuildersKt.d(bLEPassengerSideCommunicationFeatureImpl.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$onDuplexConnectionDataReceivedFromDriverDevice$1(bLEPassengerSideCommunicationFeatureImpl, new BLETransferData.DuplexConnectionBLETransferData(passiveModeDriverDevice.b(), bArr, basicInfoContract.e(), basicInfoContract.e()), null), 3);
        }
        return Unit.f17538a;
    }
}
