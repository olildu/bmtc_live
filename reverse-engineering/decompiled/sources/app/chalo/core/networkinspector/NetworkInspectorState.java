package app.chalo.core.networkinspector;

import app.chalo.network.logging.NetworkCallInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorState;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkInspectorState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2305a;
    public final NetworkCallInfo b;
    public final boolean c;
    public final String d;

    public NetworkInspectorState(List calls, NetworkCallInfo networkCallInfo, boolean z, String str) {
        Intrinsics.i(calls, "calls");
        this.f2305a = calls;
        this.b = networkCallInfo;
        this.c = z;
        this.d = str;
    }

    public static NetworkInspectorState a(NetworkInspectorState networkInspectorState, NetworkCallInfo networkCallInfo, boolean z, String str, int i) {
        List calls = networkInspectorState.f2305a;
        if ((i & 2) != 0) {
            networkCallInfo = networkInspectorState.b;
        }
        if ((i & 4) != 0) {
            z = networkInspectorState.c;
        }
        if ((i & 8) != 0) {
            str = networkInspectorState.d;
        }
        networkInspectorState.getClass();
        Intrinsics.i(calls, "calls");
        return new NetworkInspectorState(calls, networkCallInfo, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInspectorState)) {
            return false;
        }
        NetworkInspectorState networkInspectorState = (NetworkInspectorState) obj;
        return Intrinsics.d(this.f2305a, networkInspectorState.f2305a) && Intrinsics.d(this.b, networkInspectorState.b) && this.c == networkInspectorState.c && Intrinsics.d(this.d, networkInspectorState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f2305a.hashCode() * 31;
        NetworkCallInfo networkCallInfo = this.b;
        int iHashCode2 = (((iHashCode + (networkCallInfo == null ? 0 : networkCallInfo.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkInspectorState(calls=" + this.f2305a + ", selectedCall=" + this.b + ", isRefreshing=" + this.c + ", errorMessage=" + this.d + ")";
    }
}
