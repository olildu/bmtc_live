package app.chalo.network.logging;

import defpackage.dd;
import defpackage.jk0;
import defpackage.nf1;
import defpackage.z40;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.EmptyContent;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/logging/NetworkCallInfo;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkCallInfo {
    public static final Lazy j = LazyKt.b(new jk0(20));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6467a;
    public final String b;
    public final long c;
    public final LinkedHashMap d;
    public final HttpMethod e;
    public final String f;
    public final Integer g;
    public final Map h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/logging/NetworkCallInfo$Companion;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final String a(String str) {
            Lazy lazy = NetworkCallInfo.j;
            try {
                if (str.length() >= 300000) {
                    return str;
                }
                Lazy lazy2 = NetworkCallInfo.j;
                JsonElement jsonElementF = ((Json) lazy2.getValue()).f(str);
                Json json = (Json) lazy2.getValue();
                json.getClass();
                return json.a(JsonElement.INSTANCE.serializer(), jsonElementF);
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public NetworkCallInfo(long j2, HttpRequestBuilder request, String requestId) {
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(request, "request");
        String strC = request.f16747a.c();
        Set<Map.Entry> setA = request.c.a();
        int iG = MapsKt.g(CollectionsKt.v(setA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (Map.Entry entry : setA) {
            linkedHashMap.put((String) entry.getKey(), (List) entry.getValue());
        }
        HttpMethod httpMethod = request.b;
        Object obj = request.d;
        String string = (!Intrinsics.d(obj, EmptyContent.f16761a) && (obj instanceof TextContent)) ? ((TextContent) obj).f16843a : obj.toString();
        this(requestId, strC, j2, linkedHashMap, httpMethod, Companion.a(string), null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCallInfo)) {
            return false;
        }
        NetworkCallInfo networkCallInfo = (NetworkCallInfo) obj;
        return Intrinsics.d(this.f6467a, networkCallInfo.f6467a) && Intrinsics.d(this.b, networkCallInfo.b) && this.c == networkCallInfo.c && Intrinsics.d(this.d, networkCallInfo.d) && Intrinsics.d(this.e, networkCallInfo.e) && Intrinsics.d(this.f, networkCallInfo.f) && Intrinsics.d(this.g, networkCallInfo.g) && Intrinsics.d(this.h, networkCallInfo.h) && Intrinsics.d(this.i, networkCallInfo.i);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6467a.hashCode() * 31, 31, this.b);
        long j2 = this.c;
        int iE2 = nf1.e((this.d.hashCode() + ((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.e.f16800a);
        String str = this.f;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.h;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NetworkCallInfo(requestId=", this.f6467a, ", url=", this.b, ", requestedAt=");
        sbE.append(this.c);
        sbE.append(", requestHeaders=");
        sbE.append(this.d);
        sbE.append(", requestType=");
        sbE.append(this.e);
        sbE.append(", body=");
        sbE.append(this.f);
        sbE.append(", responseCode=");
        sbE.append(this.g);
        sbE.append(", responseHeaders=");
        sbE.append(this.h);
        return z40.h(sbE, ", response=", this.i, ")");
    }

    public NetworkCallInfo(String requestId, String url, long j2, LinkedHashMap linkedHashMap, HttpMethod requestType, String str, Integer num, LinkedHashMap linkedHashMap2, String str2) {
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(url, "url");
        Intrinsics.i(requestType, "requestType");
        this.f6467a = requestId;
        this.b = url;
        this.c = j2;
        this.d = linkedHashMap;
        this.e = requestType;
        this.f = str;
        this.g = num;
        this.h = linkedHashMap2;
        this.i = str2;
    }

    public NetworkCallInfo(long j2, HttpInterceptedResponse interceptedResponse, HttpRequest request, String requestId) {
        String string;
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(request, "request");
        Intrinsics.i(interceptedResponse, "interceptedResponse");
        String urlString = request.getUrl().getUrlString();
        Set<Map.Entry> setA = request.getHeaders().a();
        int iG = MapsKt.g(CollectionsKt.v(setA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (Map.Entry entry : setA) {
            linkedHashMap.put((String) entry.getKey(), (List) entry.getValue());
        }
        HttpMethod method = request.getMethod();
        OutgoingContent content = request.getContent();
        if (!Intrinsics.d(content, EmptyContent.f16761a) && (content instanceof TextContent)) {
            string = ((TextContent) content).f16843a;
        } else {
            string = content.toString();
        }
        this(requestId, urlString, j2, linkedHashMap, method, Companion.a(string), Integer.valueOf(interceptedResponse.f6466a), interceptedResponse.b, Companion.a(interceptedResponse.c));
    }
}
