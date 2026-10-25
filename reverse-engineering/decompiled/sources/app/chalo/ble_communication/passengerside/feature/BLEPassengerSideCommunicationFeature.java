package app.chalo.ble_communication.passengerside.feature;

import app.chalo.ble_communication.model.BLEActiveModeScanningConfig;
import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnectionInitializationConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/passengerside/feature/BLEPassengerSideCommunicationFeature;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BLEPassengerSideCommunicationFeature {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    StateFlow a();

    void b();

    Object c(Set set, BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig, BLEActiveModeScanningConfig bLEActiveModeScanningConfig, ContinuationImpl continuationImpl);

    void d();

    StateFlow e();

    StateFlow f();

    Object g(BLETransferData.OneWayBroadcastBLETransferData oneWayBroadcastBLETransferData, Continuation continuation);
}
