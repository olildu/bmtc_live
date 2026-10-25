package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JuspayState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuspaySdkStatus f4077a;
    public final JuspayUpiSessionState b;

    public JuspayState(JuspaySdkStatus sdkStatus, JuspayUpiSessionState upiSession) {
        Intrinsics.i(sdkStatus, "sdkStatus");
        Intrinsics.i(upiSession, "upiSession");
        this.f4077a = sdkStatus;
        this.b = upiSession;
    }

    public static JuspayState a(JuspayState juspayState, JuspaySdkStatus sdkStatus, JuspayUpiSessionState upiSession, int i) {
        if ((i & 1) != 0) {
            sdkStatus = juspayState.f4077a;
        }
        if ((i & 2) != 0) {
            upiSession = juspayState.b;
        }
        juspayState.getClass();
        Intrinsics.i(sdkStatus, "sdkStatus");
        Intrinsics.i(upiSession, "upiSession");
        return new JuspayState(sdkStatus, upiSession);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuspayState)) {
            return false;
        }
        JuspayState juspayState = (JuspayState) obj;
        return Intrinsics.d(this.f4077a, juspayState.f4077a) && Intrinsics.d(this.b, juspayState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4077a.hashCode() * 31);
    }

    public final String toString() {
        return "JuspayState(sdkStatus=" + this.f4077a + ", upiSession=" + this.b + ")";
    }
}
