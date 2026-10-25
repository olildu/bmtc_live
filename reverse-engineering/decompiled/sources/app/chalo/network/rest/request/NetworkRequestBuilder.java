package app.chalo.network.rest.request;

import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.mock.ApiSourceAwareRequestDispatcher;
import defpackage.z40;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/request/NetworkRequestBuilder;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkRequestBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericRequestData f6519a;
    public final NetworkCrashlyticsLogger b;
    public final ApiSourceAwareRequestDispatcher c;

    public NetworkRequestBuilder(GenericRequestData genericRequestData, NetworkCrashlyticsLogger networkCrashlyticsLogger, ApiSourceAwareRequestDispatcher apiSourceAwareRequestDispatcher) {
        this.f6519a = genericRequestData;
        this.b = networkCrashlyticsLogger;
        this.c = apiSourceAwareRequestDispatcher;
    }

    public final void a(String str, String str2, Map map) {
        if (str2 == null) {
            throw new IllegalArgumentException(z40.g("Param value is null for key: ", str, ", url: ", this.f6519a.a()));
        }
        map.put(str, str2);
    }

    public final void b() {
        this.f6519a.e.put("secureApiHeaders", "secureApiHeaders");
    }

    public final void c() {
        this.f6519a.e.put("xTypeHeader", "xTypeHeader");
    }

    public final void d(String baseUrl) {
        Intrinsics.i(baseUrl, "baseUrl");
        if (StringsKt.F(baseUrl)) {
            throw new IllegalArgumentException("Base-Url cannot be empty");
        }
        this.f6519a.b = baseUrl;
    }

    public final ChaloRequest e() {
        return new ChaloRequest(this.f6519a, this.b, this.c);
    }

    public final void f(HttpRequestType httpRequestType) {
        Intrinsics.i(httpRequestType, "httpRequestType");
        GenericRequestData genericRequestData = this.f6519a;
        if (genericRequestData.i != null && httpRequestType == HttpRequestType.GET) {
            throw new IllegalArgumentException("Request body can not be set with GET method, either change the method or remove the request body");
        }
        genericRequestData.d = httpRequestType.getHttpRequestType();
    }

    public final void g(PriorityLevel priorityLevel) {
        Intrinsics.i(priorityLevel, "priorityLevel");
        this.f6519a.k = priorityLevel.getValue();
    }

    public final void h(Map map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Query params cannot be empty. If you do not have any query params, please do not call this function");
        }
        Map map2 = this.f6519a.f;
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Path params cannot be null or empty");
        }
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (String) entry.getValue(), map2);
        }
    }

    public final void i(String str) {
        GenericRequestData genericRequestData = this.f6519a;
        genericRequestData.i = str;
        genericRequestData.d = HttpRequestType.POST.getHttpRequestType();
    }

    public final void j(String subUrl) {
        Intrinsics.i(subUrl, "subUrl");
        if (StringsKt.F(subUrl)) {
            throw new IllegalArgumentException("Sub-Url cannot be empty");
        }
        this.f6519a.c = subUrl;
    }

    public final void k(int i) {
        Integer numValueOf = Integer.valueOf(i);
        GenericRequestData genericRequestData = this.f6519a;
        genericRequestData.m = numValueOf;
        genericRequestData.n = Integer.valueOf(i);
        genericRequestData.o = Integer.valueOf(i);
    }
}
