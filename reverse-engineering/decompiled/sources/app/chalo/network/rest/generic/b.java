package app.chalo.network.rest.generic;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClientPluginBuilder createClientPlugin = (ClientPluginBuilder) obj;
        ClientPlugin clientPlugin = ChaloAuthPluginKt.f6510a;
        Intrinsics.i(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.a(Send.f16687a, new ChaloAuthPluginKt$ChaloAuthPlugin$2$1((ChaloAuthConfig) createClientPlugin.b, null));
        return Unit.f17538a;
    }
}
