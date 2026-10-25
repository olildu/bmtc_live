package app.chalo.network.rest.generic;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.rest.generic.ChaloAuthPluginKt$ChaloAuthPlugin$2$1", f = "ChaloAuthPlugin.kt", l = {32, 35, 37, 39, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 55, 56}, m = "invokeSuspend", v = 1)
public final class ChaloAuthPluginKt$ChaloAuthPlugin$2$1 extends SuspendLambda implements Function3<Send.Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ ChaloAuthConfig $authConfig;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: app.chalo.network.rest.generic.ChaloAuthPluginKt$ChaloAuthPlugin$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Continuation<? super ChaloAuthConfigHandler.ChaloAuthSecureData>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((ChaloAuthConfigHandler) this.receiver).f6507a.invoke((Continuation) obj);
        }
    }

    /* JADX INFO: renamed from: app.chalo.network.rest.generic.ChaloAuthPluginKt$ChaloAuthPlugin$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Continuation<? super ChaloAuthConfigHandler.ChaloAuthSecureData>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((ChaloAuthConfigHandler) this.receiver).f6507a.invoke((Continuation) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloAuthPluginKt$ChaloAuthPlugin$2$1(ChaloAuthConfig chaloAuthConfig, Continuation continuation) {
        super(3, continuation);
        this.$authConfig = chaloAuthConfig;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloAuthPluginKt$ChaloAuthPlugin$2$1 chaloAuthPluginKt$ChaloAuthPlugin$2$1 = new ChaloAuthPluginKt$ChaloAuthPlugin$2$1(this.$authConfig, (Continuation) obj3);
        chaloAuthPluginKt$ChaloAuthPlugin$2$1.L$0 = (Send.Sender) obj;
        chaloAuthPluginKt$ChaloAuthPlugin$2$1.L$1 = (HttpRequestBuilder) obj2;
        return chaloAuthPluginKt$ChaloAuthPlugin$2$1.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048 A[PHI: r1 r3 r4 r5 r13
      0x0048: PHI (r1v16 io.ktor.client.call.HttpClientCall) = (r1v12 io.ktor.client.call.HttpClientCall), (r1v19 io.ktor.client.call.HttpClientCall) binds: [B:9:0x0035, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r3v18 app.chalo.network.rest.generic.ChaloAuthConfigHandler) = 
      (r3v14 app.chalo.network.rest.generic.ChaloAuthConfigHandler)
      (r3v21 app.chalo.network.rest.generic.ChaloAuthConfigHandler)
     binds: [B:9:0x0035, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v15 io.ktor.client.request.HttpRequestBuilder) = (r4v11 io.ktor.client.request.HttpRequestBuilder), (r4v18 io.ktor.client.request.HttpRequestBuilder) binds: [B:9:0x0035, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r5v5 io.ktor.client.plugins.api.Send$Sender) = (r5v4 io.ktor.client.plugins.api.Send$Sender), (r5v7 io.ktor.client.plugins.api.Send$Sender) binds: [B:9:0x0035, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r13v15 java.lang.Object) = (r13v0 java.lang.Object), (r13v32 java.lang.Object) binds: [B:9:0x0035, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (r13 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0199, code lost:
    
        if (r13 == r0) goto L61;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0199 -> B:7:0x001f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.network.rest.generic.ChaloAuthPluginKt$ChaloAuthPlugin$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
