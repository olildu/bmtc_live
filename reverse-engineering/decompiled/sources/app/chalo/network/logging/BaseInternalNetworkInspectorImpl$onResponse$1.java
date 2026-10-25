package app.chalo.network.logging;

import io.ktor.client.request.HttpRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.logging.BaseInternalNetworkInspectorImpl$onResponse$1", f = "BaseInternalNetworkInspectorImpl.kt", l = {60}, m = "invokeSuspend", v = 1)
final class BaseInternalNetworkInspectorImpl$onResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpInterceptedResponse $interceptedResponse;
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ String $requestId;
    final /* synthetic */ long $requestedAt;
    int label;
    final /* synthetic */ BaseInternalNetworkInspectorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInternalNetworkInspectorImpl$onResponse$1(String str, HttpRequest httpRequest, HttpInterceptedResponse httpInterceptedResponse, long j, BaseInternalNetworkInspectorImpl baseInternalNetworkInspectorImpl, Continuation continuation) {
        super(2, continuation);
        this.$requestId = str;
        this.$request = httpRequest;
        this.$interceptedResponse = httpInterceptedResponse;
        this.$requestedAt = j;
        this.this$0 = baseInternalNetworkInspectorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseInternalNetworkInspectorImpl$onResponse$1(this.$requestId, this.$request, this.$interceptedResponse, this.$requestedAt, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BaseInternalNetworkInspectorImpl$onResponse$1 baseInternalNetworkInspectorImpl$onResponse$1 = (BaseInternalNetworkInspectorImpl$onResponse$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        baseInternalNetworkInspectorImpl$onResponse$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f17538a;
            }
            ResultKt.b(obj);
            String str = this.$requestId;
            HttpRequest httpRequest = this.$request;
            new NetworkCallInfo(this.$requestedAt, this.$interceptedResponse, httpRequest, str);
            this.this$0.getClass();
            this.label = 1;
            throw null;
        } catch (Exception e) {
            BaseInternalNetworkInspectorImpl baseInternalNetworkInspectorImpl = this.this$0;
            this.$request.getB();
            e.toString();
            baseInternalNetworkInspectorImpl.getClass();
        } finally {
            this.this$0.getClass();
        }
    }
}
