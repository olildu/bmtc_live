package app.chalo.network.rest.response;

import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.rest.generic.ErrorType;
import defpackage.cb0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/rest/response/NetworkResponse;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6522a;
    public final ErrorType b;
    public final String c;
    public final byte[] d;
    public final Map e;
    public final int f;
    public final NetworkCrashlyticsLogger g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/response/NetworkResponse$Companion;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(String str, String str2, String str3) {
            return str + " Name : " + str2 + " response : " + str3;
        }
    }

    public NetworkResponse(boolean z, ErrorType errorType, String str, byte[] bArr, LinkedHashMap linkedHashMap, int i, NetworkCrashlyticsLogger networkCrashlyticsLogger) {
        Intrinsics.i(errorType, "errorType");
        Intrinsics.i(networkCrashlyticsLogger, "networkCrashlyticsLogger");
        this.f6522a = z;
        this.b = errorType;
        this.c = str;
        this.d = bArr;
        this.e = linkedHashMap;
        this.f = i;
        this.g = networkCrashlyticsLogger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkResponse.class != obj.getClass()) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        byte[] bArr = networkResponse.d;
        if (this.f6522a != networkResponse.f6522a || this.b != networkResponse.b || !Intrinsics.d(this.c, networkResponse.c) || this.f != networkResponse.f || !Intrinsics.d(this.e, networkResponse.e)) {
            return false;
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.f6522a ? 1231 : 1237) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.d;
        int iHashCode3 = (iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        Map map = this.e;
        return ((iHashCode3 + (map != null ? map.hashCode() : 0)) * 31) + this.f;
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("NetworkResponse(isSuccess=");
        sb.append(this.f6522a);
        sb.append(", errorType=");
        sb.append(this.b);
        sb.append(", response=");
        cb0.t(sb, this.c, ", rawResponse=", string, ", headers=");
        sb.append(this.e);
        sb.append(", httpResponseCode=");
        sb.append(this.f);
        sb.append(", networkCrashlyticsLogger=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
