package app.chalo.network.logging;

import app.chalo.network.config.ChaloJson;
import defpackage.gf;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.AttributeKey;
import io.ktor.util.ByteChannelsKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.io.Buffer;
import kotlinx.io.SourcesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.modules.SerializersModule;
import okio.internal._Utf8Kt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloInternalNetworkInspectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AttributeKey f6465a;
    public static final AttributeKey b;
    public static final ContextScope c;

    static {
        TypeReference typeReferenceD;
        ClassReference classReferenceA = Reflection.a(String.class);
        TypeReference typeReferenceD2 = null;
        try {
            typeReferenceD = Reflection.d(String.class);
        } catch (Throwable unused) {
            typeReferenceD = null;
        }
        f6465a = new AttributeKey("RequestId", new TypeInfo(classReferenceA, typeReferenceD));
        ClassReference classReferenceA2 = Reflection.a(Long.class);
        try {
            typeReferenceD2 = Reflection.d(Long.TYPE);
        } catch (Throwable unused2) {
        }
        b = new AttributeKey("RequestAt", new TypeInfo(classReferenceA2, typeReferenceD2));
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        c = CoroutineScopeKt.a(DefaultIoScheduler.f17895a.plus(SupervisorKt.b()));
    }

    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(PipelineContext pipelineContext, Object obj, ChaloInternalNetworkInspector chaloInternalNetworkInspector, ContinuationImpl continuationImpl) throws Throwable {
        ChaloInternalNetworkInspectorKt$logAndProceed$1 chaloInternalNetworkInspectorKt$logAndProceed$1;
        String str;
        long jLongValue;
        String strH;
        ByteReadChannel byteReadChannel;
        ChaloInternalNetworkInspector chaloInternalNetworkInspector2;
        HttpResponseContainer httpResponseContainerA;
        PipelineContext pipelineContext2 = pipelineContext;
        if (continuationImpl instanceof ChaloInternalNetworkInspectorKt$logAndProceed$1) {
            chaloInternalNetworkInspectorKt$logAndProceed$1 = (ChaloInternalNetworkInspectorKt$logAndProceed$1) continuationImpl;
            int i = chaloInternalNetworkInspectorKt$logAndProceed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloInternalNetworkInspectorKt$logAndProceed$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloInternalNetworkInspectorKt$logAndProceed$1 = new ChaloInternalNetworkInspectorKt$logAndProceed$1(continuationImpl);
            }
        } else {
            chaloInternalNetworkInspectorKt$logAndProceed$1 = new ChaloInternalNetworkInspectorKt$logAndProceed$1(continuationImpl);
        }
        Object objV = chaloInternalNetworkInspectorKt$logAndProceed$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloInternalNetworkInspectorKt$logAndProceed$1.label;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(objV);
                HttpClientCall httpClientCall = (HttpClientCall) pipelineContext2.f16917a;
                str = (String) httpClientCall.getAttributes().e(f6465a);
                if (str == null) {
                    chaloInternalNetworkInspectorKt$logAndProceed$1.label = 1;
                    if (pipelineContext2.f(chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                        return obj2;
                    }
                } else {
                    Long l = (Long) httpClientCall.getAttributes().e(b);
                    jLongValue = l != null ? l.longValue() : System.currentTimeMillis();
                    if (obj instanceof ByteChannel) {
                        Pair pairA = ByteChannelsKt.a((ByteReadChannel) obj, c);
                        ByteReadChannel byteReadChannel2 = (ByteReadChannel) pairA.getFirst();
                        byteReadChannel = (ByteReadChannel) pairA.getSecond();
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$0 = pipelineContext2;
                        chaloInternalNetworkInspector2 = chaloInternalNetworkInspector;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$1 = chaloInternalNetworkInspector2;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$2 = str;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$3 = byteReadChannel;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.J$0 = jLongValue;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.label = 2;
                        objV = ByteReadChannelOperationsKt.v(byteReadChannel2, chaloInternalNetworkInspectorKt$logAndProceed$1);
                        if (objV == obj2) {
                            return obj2;
                        }
                        chaloInternalNetworkInspector2.a(jLongValue, new HttpInterceptedResponse(((HttpClientCall) pipelineContext2.f16917a).f(), _Utf8Kt.a((byte[]) objV)), ((HttpClientCall) pipelineContext2.f16917a).d(), str);
                        httpResponseContainerA = HttpResponseContainer.a((HttpResponseContainer) pipelineContext2.getD(), byteReadChannel);
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$0 = null;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$1 = null;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$2 = null;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.L$3 = null;
                        chaloInternalNetworkInspectorKt$logAndProceed$1.label = 3;
                        if (pipelineContext2.h(httpResponseContainerA, chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                            return obj2;
                        }
                    } else if (obj instanceof Buffer) {
                        Buffer buffer = (Buffer) obj;
                        byte[] bArrB = SourcesKt.b(buffer, (int) buffer.c);
                        String strP = StringsKt.p(bArrB);
                        Buffer buffer2 = new Buffer();
                        BytePacketBuilderKt.b(buffer2, bArrB);
                        chaloInternalNetworkInspector.a(jLongValue, new HttpInterceptedResponse(httpClientCall.f(), strP), httpClientCall.d(), str);
                        HttpResponseContainer httpResponseContainerA2 = HttpResponseContainer.a((HttpResponseContainer) pipelineContext2.getD(), buffer2);
                        chaloInternalNetworkInspectorKt$logAndProceed$1.label = 4;
                        if (pipelineContext2.h(httpResponseContainerA2, chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                            return obj2;
                        }
                    } else if (obj instanceof String) {
                        chaloInternalNetworkInspector.a(jLongValue, new HttpInterceptedResponse(httpClientCall.f(), (String) obj), httpClientCall.d(), str);
                        chaloInternalNetworkInspectorKt$logAndProceed$1.label = 5;
                        if (pipelineContext2.f(chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                            return obj2;
                        }
                    } else if (obj instanceof byte[]) {
                        chaloInternalNetworkInspector.a(jLongValue, new HttpInterceptedResponse(httpClientCall.f(), StringsKt.p((byte[]) obj)), httpClientCall.d(), str);
                        chaloInternalNetworkInspectorKt$logAndProceed$1.label = 6;
                        if (pipelineContext2.f(chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        try {
                            Json json = ChaloJson.b;
                            SerializersModule module = json.b;
                            ClassReference classReferenceA = Reflection.a(Object.class);
                            Intrinsics.i(module, "module");
                            KSerializer kSerializerB = module.b(classReferenceA, EmptyList.f17557a);
                            if (kSerializerB == null) {
                                Platform_commonKt.d(classReferenceA);
                                throw null;
                            }
                            strH = TreeJsonEncoderKt.a(json, obj, kSerializerB).toString();
                            chaloInternalNetworkInspector.a(jLongValue, new HttpInterceptedResponse(httpClientCall.f(), strH), httpClientCall.d(), str);
                            chaloInternalNetworkInspectorKt$logAndProceed$1.label = 7;
                            if (pipelineContext2.f(chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                                return obj2;
                            }
                            return unit;
                        } catch (Exception unused) {
                            strH = gf.h("Client logging failed while decoding response: ", obj);
                        }
                    }
                }
                return unit;
            case 1:
                ResultKt.b(objV);
                return unit;
            case 2:
                long j = chaloInternalNetworkInspectorKt$logAndProceed$1.J$0;
                byteReadChannel = (ByteReadChannel) chaloInternalNetworkInspectorKt$logAndProceed$1.L$3;
                String str2 = (String) chaloInternalNetworkInspectorKt$logAndProceed$1.L$2;
                ChaloInternalNetworkInspector chaloInternalNetworkInspector3 = (ChaloInternalNetworkInspector) chaloInternalNetworkInspectorKt$logAndProceed$1.L$1;
                PipelineContext pipelineContext3 = (PipelineContext) chaloInternalNetworkInspectorKt$logAndProceed$1.L$0;
                ResultKt.b(objV);
                str = str2;
                chaloInternalNetworkInspector2 = chaloInternalNetworkInspector3;
                pipelineContext2 = pipelineContext3;
                jLongValue = j;
                chaloInternalNetworkInspector2.a(jLongValue, new HttpInterceptedResponse(((HttpClientCall) pipelineContext2.f16917a).f(), _Utf8Kt.a((byte[]) objV)), ((HttpClientCall) pipelineContext2.f16917a).d(), str);
                httpResponseContainerA = HttpResponseContainer.a((HttpResponseContainer) pipelineContext2.getD(), byteReadChannel);
                chaloInternalNetworkInspectorKt$logAndProceed$1.L$0 = null;
                chaloInternalNetworkInspectorKt$logAndProceed$1.L$1 = null;
                chaloInternalNetworkInspectorKt$logAndProceed$1.L$2 = null;
                chaloInternalNetworkInspectorKt$logAndProceed$1.L$3 = null;
                chaloInternalNetworkInspectorKt$logAndProceed$1.label = 3;
                if (pipelineContext2.h(httpResponseContainerA, chaloInternalNetworkInspectorKt$logAndProceed$1) == obj2) {
                    return obj2;
                }
                return unit;
            case 3:
                ResultKt.b(objV);
                return unit;
            case 4:
                ResultKt.b(objV);
                return unit;
            case 5:
                ResultKt.b(objV);
                return unit;
            case 6:
                ResultKt.b(objV);
                return unit;
            case 7:
                ResultKt.b(objV);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
