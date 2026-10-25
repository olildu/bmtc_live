package app.chalo.ble_communication.passengerside.model;

import app.chalo.ble_communication.BLECommunicationRange;
import defpackage.uf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/passengerside/model/BLEPassengerSideDuplexConnectionInitializationConfig;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BLEPassengerSideDuplexConnectionInitializationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1145a;
    public final BLECommunicationRange b;
    public final long c;

    public BLEPassengerSideDuplexConnectionInitializationConfig(byte[] duplexConnectionPassengerHelloData) {
        BLECommunicationRange duplexConnectionPassengerRange = BLECommunicationRange.LONG;
        Intrinsics.i(duplexConnectionPassengerHelloData, "duplexConnectionPassengerHelloData");
        Intrinsics.i(duplexConnectionPassengerRange, "duplexConnectionPassengerRange");
        this.f1145a = duplexConnectionPassengerHelloData;
        this.b = duplexConnectionPassengerRange;
        this.c = 15000L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BLEPassengerSideDuplexConnectionInitializationConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnectionInitializationConfig");
        BLEPassengerSideDuplexConnectionInitializationConfig bLEPassengerSideDuplexConnectionInitializationConfig = (BLEPassengerSideDuplexConnectionInitializationConfig) obj;
        return Arrays.equals(this.f1145a, bLEPassengerSideDuplexConnectionInitializationConfig.f1145a) && this.b == bLEPassengerSideDuplexConnectionInitializationConfig.b && this.c == bLEPassengerSideDuplexConnectionInitializationConfig.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Arrays.hashCode(this.f1145a) * 31)) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String string = Arrays.toString(this.f1145a);
        StringBuilder sb = new StringBuilder("BLEPassengerSideDuplexConnectionInitializationConfig(duplexConnectionPassengerHelloData=");
        sb.append(string);
        sb.append(", duplexConnectionPassengerRange=");
        sb.append(this.b);
        sb.append(", duplexConnectionInitializationTimeout=");
        return uf0.m(this.c, ")", sb);
    }
}
