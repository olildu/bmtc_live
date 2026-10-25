package app.chalo.network.logging;

import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/logging/BaseInternalNetworkInspectorImpl;", "Lapp/chalo/network/logging/ChaloInternalNetworkInspector;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseInternalNetworkInspectorImpl implements ChaloInternalNetworkInspector {
    @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
    public final void a(long j, HttpInterceptedResponse httpInterceptedResponse, HttpRequest httpRequest, String requestId) {
        Intrinsics.i(requestId, "requestId");
        BuildersKt.d(null, null, null, new BaseInternalNetworkInspectorImpl$onResponse$1(requestId, httpRequest, httpInterceptedResponse, j, this, null), 3);
    }

    @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
    public final Object b() {
        throw null;
    }

    @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
    public final void c(long j, HttpRequestBuilder request, String str) {
        Intrinsics.i(request, "request");
        BuildersKt.d(null, null, null, new BaseInternalNetworkInspectorImpl$onRequest$1(str, request, j, this, null), 3);
    }
}
