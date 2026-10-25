package app.chalo.network.logging;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.logging.ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1", f = "ChaloInternalNetworkInspector.kt", l = {50}, m = "invokeSuspend", v = 1)
final class ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1 extends SuspendLambda implements Function3<Send.Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ ChaloInternalNetworkInspector $config;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1(ChaloInternalNetworkInspector chaloInternalNetworkInspector, Continuation continuation) {
        super(3, continuation);
        this.$config = chaloInternalNetworkInspector;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1 chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1 = new ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1(this.$config, (Continuation) obj3);
        chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1.L$0 = (Send.Sender) obj;
        chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1.L$1 = (HttpRequestBuilder) obj2;
        return chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Send.Sender sender = (Send.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            String string = Uuid.Companion.c().toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.$config.c(jCurrentTimeMillis, httpRequestBuilder, string);
            this.L$0 = string;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            obj = sender.f16688a.a(httpRequestBuilder, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = string;
            j = jCurrentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        httpClientCall.getAttributes().a(ChaloInternalNetworkInspectorKt.f6465a, str);
        httpClientCall.getAttributes().a(ChaloInternalNetworkInspectorKt.b, new Long(j));
        return httpClientCall;
    }
}
