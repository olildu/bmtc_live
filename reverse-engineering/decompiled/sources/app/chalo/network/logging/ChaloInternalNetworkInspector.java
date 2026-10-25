package app.chalo.network.logging;

import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/logging/ChaloInternalNetworkInspector;", "", "DisabledInspector", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloInternalNetworkInspector {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/logging/ChaloInternalNetworkInspector$DisabledInspector;", "Lapp/chalo/network/logging/ChaloInternalNetworkInspector;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisabledInspector implements ChaloInternalNetworkInspector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ DisabledInspector f6464a = new DisabledInspector();

        @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
        public final void a(long j, HttpInterceptedResponse httpInterceptedResponse, HttpRequest httpRequest, String requestId) {
            Intrinsics.i(requestId, "requestId");
        }

        @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
        public final Object b() {
            return EmptyList.f17557a;
        }

        @Override // app.chalo.network.logging.ChaloInternalNetworkInspector
        public final void c(long j, HttpRequestBuilder request, String str) {
            Intrinsics.i(request, "request");
        }
    }

    void a(long j, HttpInterceptedResponse httpInterceptedResponse, HttpRequest httpRequest, String str);

    Object b();

    void c(long j, HttpRequestBuilder httpRequestBuilder, String str);
}
