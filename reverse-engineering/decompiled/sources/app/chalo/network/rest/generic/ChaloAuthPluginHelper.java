package app.chalo.network.rest.generic;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/generic/ChaloAuthPluginHelper;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChaloAuthPluginHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloAuthPluginHelper f6509a = new ChaloAuthPluginHelper();
    public static final AttributeKey b;

    static {
        TypeReference typeReferenceD;
        ClassReference classReferenceA = Reflection.a(Integer.class);
        try {
            typeReferenceD = Reflection.d(Integer.TYPE);
        } catch (Throwable unused) {
            typeReferenceD = null;
        }
        b = new AttributeKey("retryAttemptCount", new TypeInfo(classReferenceA, typeReferenceD));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(HttpRequestBuilder httpRequestBuilder, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloAuthPluginHelper$prepareSecureHttpRequest$1 chaloAuthPluginHelper$prepareSecureHttpRequest$1;
        if (continuationImpl instanceof ChaloAuthPluginHelper$prepareSecureHttpRequest$1) {
            chaloAuthPluginHelper$prepareSecureHttpRequest$1 = (ChaloAuthPluginHelper$prepareSecureHttpRequest$1) continuationImpl;
            int i = chaloAuthPluginHelper$prepareSecureHttpRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAuthPluginHelper$prepareSecureHttpRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAuthPluginHelper$prepareSecureHttpRequest$1 = new ChaloAuthPluginHelper$prepareSecureHttpRequest$1(this, continuationImpl);
            }
        } else {
            chaloAuthPluginHelper$prepareSecureHttpRequest$1 = new ChaloAuthPluginHelper$prepareSecureHttpRequest$1(this, continuationImpl);
        }
        Object objInvoke = chaloAuthPluginHelper$prepareSecureHttpRequest$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAuthPluginHelper$prepareSecureHttpRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            chaloAuthPluginHelper$prepareSecureHttpRequest$1.L$0 = httpRequestBuilder;
            chaloAuthPluginHelper$prepareSecureHttpRequest$1.label = 1;
            objInvoke = function1.invoke(chaloAuthPluginHelper$prepareSecureHttpRequest$1);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpRequestBuilder = (HttpRequestBuilder) chaloAuthPluginHelper$prepareSecureHttpRequest$1.L$0;
            ResultKt.b(objInvoke);
        }
        final ChaloAuthConfigHandler.ChaloAuthSecureData chaloAuthSecureData = (ChaloAuthConfigHandler.ChaloAuthSecureData) objInvoke;
        Intrinsics.i(httpRequestBuilder, "<this>");
        Attributes attributes = httpRequestBuilder.f;
        AttributeKey attributeKey = b;
        Integer num = (Integer) attributes.e(attributeKey);
        attributes.a(attributeKey, Integer.valueOf(num != null ? num.intValue() + 1 : 0));
        HttpRequestKt.a(httpRequestBuilder, new Function1() { // from class: app.chalo.network.rest.generic.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                HeadersBuilder headers = (HeadersBuilder) obj2;
                ChaloAuthPluginHelper chaloAuthPluginHelper = ChaloAuthPluginHelper.f6509a;
                Intrinsics.i(headers, "$this$headers");
                headers.f16897a.remove("secureApiHeaders");
                ChaloAuthConfigHandler.ChaloAuthSecureData chaloAuthSecureData2 = chaloAuthSecureData;
                headers.i("userId", chaloAuthSecureData2.f6508a);
                headers.i("authType", chaloAuthSecureData2.b);
                headers.i("accessToken", chaloAuthSecureData2.c);
                return Unit.f17538a;
            }
        });
        return Unit.f17538a;
    }
}
