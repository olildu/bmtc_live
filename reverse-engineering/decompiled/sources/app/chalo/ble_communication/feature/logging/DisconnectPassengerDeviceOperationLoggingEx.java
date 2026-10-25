package app.chalo.ble_communication.feature.logging;

import androidx.core.app.NotificationCompat;
import app.chalo.crashlytics.CrashlyticsLoggingException;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ble_communication/feature/logging/DisconnectPassengerDeviceOperationLoggingEx;", "Lapp/chalo/crashlytics/CrashlyticsLoggingException;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DisconnectPassengerDeviceOperationLoggingEx extends CrashlyticsLoggingException {
    private final String msg;

    public DisconnectPassengerDeviceOperationLoggingEx() {
        super("");
        this.msg = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisconnectPassengerDeviceOperationLoggingEx) && Intrinsics.d(this.msg, ((DisconnectPassengerDeviceOperationLoggingEx) obj).msg);
    }

    public final int hashCode() {
        return this.msg.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vo1.B("DisconnectPassengerDeviceOperationLoggingEx(msg=", this.msg, ")");
    }
}
