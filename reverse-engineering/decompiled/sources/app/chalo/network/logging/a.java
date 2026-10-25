package app.chalo.network.logging;

import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.AttributeKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClientPluginBuilder createClientPlugin = (ClientPluginBuilder) obj;
        AttributeKey attributeKey = ChaloInternalNetworkInspectorKt.f6465a;
        Intrinsics.i(createClientPlugin, "$this$createClientPlugin");
        ChaloInternalNetworkInspector chaloInternalNetworkInspector = (ChaloInternalNetworkInspector) createClientPlugin.b;
        createClientPlugin.a(Send.f16687a, new ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1(chaloInternalNetworkInspector, null));
        createClientPlugin.f16682a.f.g(HttpResponsePipeline.i, new ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2(chaloInternalNetworkInspector, null));
        return Unit.f17538a;
    }
}
