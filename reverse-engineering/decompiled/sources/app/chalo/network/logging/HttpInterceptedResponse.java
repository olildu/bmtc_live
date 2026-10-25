package app.chalo.network.logging;

import defpackage.vo1;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.StringValuesKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/logging/HttpInterceptedResponse;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpInterceptedResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6466a;
    public final LinkedHashMap b;
    public final String c;

    public HttpInterceptedResponse(HttpResponse httpResponse, String parsedResponse) {
        Intrinsics.i(parsedResponse, "parsedResponse");
        int i = httpResponse.getC().f16803a;
        LinkedHashMap linkedHashMapC = StringValuesKt.c(httpResponse.getH());
        this.f6466a = i;
        this.b = linkedHashMapC;
        this.c = parsedResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpInterceptedResponse)) {
            return false;
        }
        HttpInterceptedResponse httpInterceptedResponse = (HttpInterceptedResponse) obj;
        return this.f6466a == httpInterceptedResponse.f6466a && Intrinsics.d(this.b, httpInterceptedResponse.b) && Intrinsics.d(this.c, httpInterceptedResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6466a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpInterceptedResponse(code=");
        sb.append(this.f6466a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", parsedResponse=");
        return vo1.p(sb, this.c, ")");
    }
}
