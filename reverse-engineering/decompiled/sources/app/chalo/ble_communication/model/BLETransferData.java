package app.chalo.ble_communication.model;

import app.chalo.ble_communication.BLECommunicationRange;
import app.chalo.ble_communication.BLEDataReceivingDistance;
import defpackage.dd;
import defpackage.t10;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ble_communication/model/BLETransferData;", "", "DuplexConnectionBLETransferData", "OneWayBroadcastBLETransferData", "Lapp/chalo/ble_communication/model/BLETransferData$DuplexConnectionBLETransferData;", "Lapp/chalo/ble_communication/model/BLETransferData$OneWayBroadcastBLETransferData;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BLETransferData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/model/BLETransferData$DuplexConnectionBLETransferData;", "Lapp/chalo/ble_communication/model/BLETransferData;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DuplexConnectionBLETransferData extends BLETransferData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f1132a;
        public final String b;
        public final long c;
        public final long d;

        public DuplexConnectionBLETransferData(String connectionId, byte[] data, long j, long j2) {
            Intrinsics.i(data, "data");
            Intrinsics.i(connectionId, "connectionId");
            this.f1132a = data;
            this.b = connectionId;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!DuplexConnectionBLETransferData.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type app.chalo.ble_communication.model.BLETransferData.DuplexConnectionBLETransferData");
            DuplexConnectionBLETransferData duplexConnectionBLETransferData = (DuplexConnectionBLETransferData) obj;
            return Arrays.equals(this.f1132a, duplexConnectionBLETransferData.f1132a) && Intrinsics.d(this.b, duplexConnectionBLETransferData.b) && this.c == duplexConnectionBLETransferData.c && this.d == duplexConnectionBLETransferData.d;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f1132a) * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sbE = dd.e("DuplexConnectionBLETransferData(data=", Arrays.toString(this.f1132a), ", connectionId=", this.b, ", dataTransmissionTimeout=");
            sbE.append(this.c);
            return t10.g(this.d, ", transferStartTimestamp=", ", bleDataReceivingDistance=null)", sbE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/model/BLETransferData$OneWayBroadcastBLETransferData;", "Lapp/chalo/ble_communication/model/BLETransferData;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OneWayBroadcastBLETransferData extends BLETransferData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f1133a;
        public final BLECommunicationRange b;
        public final long c;
        public final BLEDataReceivingDistance d;
        public final long e;

        public OneWayBroadcastBLETransferData(byte[] data, BLECommunicationRange bleCommunicationRange, long j, BLEDataReceivingDistance bLEDataReceivingDistance, long j2) {
            Intrinsics.i(data, "data");
            Intrinsics.i(bleCommunicationRange, "bleCommunicationRange");
            this.f1133a = data;
            this.b = bleCommunicationRange;
            this.c = j;
            this.d = bLEDataReceivingDistance;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OneWayBroadcastBLETransferData.class != obj.getClass()) {
                return false;
            }
            OneWayBroadcastBLETransferData oneWayBroadcastBLETransferData = (OneWayBroadcastBLETransferData) obj;
            return Arrays.equals(this.f1133a, oneWayBroadcastBLETransferData.f1133a) && this.b == oneWayBroadcastBLETransferData.b && this.c == oneWayBroadcastBLETransferData.c && this.d == oneWayBroadcastBLETransferData.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (Arrays.hashCode(this.f1133a) * 31)) * 31;
            long j = this.c;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            String string = Arrays.toString(this.f1133a);
            StringBuilder sb = new StringBuilder("OneWayBroadcastBLETransferData(data=");
            sb.append(string);
            sb.append(", bleCommunicationRange=");
            sb.append(this.b);
            sb.append(", broadcastSetupTimeout=");
            sb.append(this.c);
            sb.append(", bleDataReceivingDistance=");
            sb.append(this.d);
            return t10.g(this.e, ", timeStamp=", ")", sb);
        }
    }
}
