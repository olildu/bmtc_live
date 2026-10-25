package app.chalo.ble_communication;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ble_communication/BLECommunicationServiceType;", "", "DuplexConnection", "AdvertisementScanning", "Companion", "Lapp/chalo/ble_communication/BLECommunicationServiceType$AdvertisementScanning;", "Lapp/chalo/ble_communication/BLECommunicationServiceType$DuplexConnection;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BLECommunicationServiceType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AdvertisementScanning f1094a = new AdvertisementScanning(true);
    public static final AdvertisementScanning b = new AdvertisementScanning(false);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLECommunicationServiceType$AdvertisementScanning;", "Lapp/chalo/ble_communication/BLECommunicationServiceType;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdvertisementScanning extends BLECommunicationServiceType {
        public final boolean c;

        public AdvertisementScanning(boolean z) {
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertisementScanning) && this.c == ((AdvertisementScanning) obj).c;
        }

        public final int hashCode() {
            return this.c ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("AdvertisementScanning(isOptional=", ")", this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLECommunicationServiceType$Companion;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLECommunicationServiceType$DuplexConnection;", "Lapp/chalo/ble_communication/BLECommunicationServiceType;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DuplexConnection extends BLECommunicationServiceType {
        public static final DuplexConnection c = new DuplexConnection();
    }
}
