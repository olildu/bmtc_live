package app.chalo.network;

import app.chalo.network.logging.ChaloInternalNetworkInspector;
import defpackage.u;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.HttpClientEngine;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/HttpClientHelper;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpClientHelper {
    public static HttpClient a(HttpClientEngine httpClientEngine, CommonHeaderProvider commonHeaderProvider, ChaloAuthSecureManager chaloAuthSecureManager, ChaloInternalNetworkInspector chaloInternalNetworkInspector) {
        u uVar = new u(29, chaloAuthSecureManager, commonHeaderProvider, chaloInternalNetworkInspector);
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        uVar.invoke(httpClientConfig);
        return new HttpClient(httpClientEngine, httpClientConfig, false);
    }
}
