package app.chalo.network.interceptor;

import app.chalo.network.config.NetworkConfig;
import app.chalo.network.exception.BaseNetworkException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/interceptor/TimeoutInterceptor;", "Lapp/chalo/network/interceptor/BaseInterceptor;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeoutInterceptor extends BaseInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkConfig f6462a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public TimeoutInterceptor(NetworkConfig networkConfig) {
        this.f6462a = networkConfig;
        final int i = 0;
        this.b = LazyKt.b(new Function0(this) { // from class: app.chalo.network.interceptor.a
            public final /* synthetic */ TimeoutInterceptor b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue;
                switch (i) {
                    case 0:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultConnectionTimeout$2$1(this.b, null))).intValue();
                        break;
                    case 1:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultReadTimeout$2$1(this.b, null))).intValue();
                        break;
                    default:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultWriteTimeout$2$1(this.b, null))).intValue();
                        break;
                }
                return Integer.valueOf(iIntValue);
            }
        });
        final int i2 = 1;
        this.c = LazyKt.b(new Function0(this) { // from class: app.chalo.network.interceptor.a
            public final /* synthetic */ TimeoutInterceptor b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue;
                switch (i2) {
                    case 0:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultConnectionTimeout$2$1(this.b, null))).intValue();
                        break;
                    case 1:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultReadTimeout$2$1(this.b, null))).intValue();
                        break;
                    default:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultWriteTimeout$2$1(this.b, null))).intValue();
                        break;
                }
                return Integer.valueOf(iIntValue);
            }
        });
        final int i3 = 2;
        this.d = LazyKt.b(new Function0(this) { // from class: app.chalo.network.interceptor.a
            public final /* synthetic */ TimeoutInterceptor b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue;
                switch (i3) {
                    case 0:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultConnectionTimeout$2$1(this.b, null))).intValue();
                        break;
                    case 1:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultReadTimeout$2$1(this.b, null))).intValue();
                        break;
                    default:
                        iIntValue = ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new TimeoutInterceptor$defaultWriteTimeout$2$1(this.b, null))).intValue();
                        break;
                }
                return Integer.valueOf(iIntValue);
            }
        });
    }

    public final Interceptor.Chain a(Request request, Request.Builder builder, Interceptor.Chain chain) {
        Integer numQ0;
        Integer numQ1;
        Integer numQ2;
        String strHeader = request.header("connection_timeout");
        int iIntValue = (strHeader == null || (numQ2 = StringsKt.q0(strHeader)) == null) ? ((Number) this.b.getValue()).intValue() : numQ2.intValue();
        String strHeader2 = request.header("read_timeout");
        int iIntValue2 = (strHeader2 == null || (numQ1 = StringsKt.q0(strHeader2)) == null) ? ((Number) this.c.getValue()).intValue() : numQ1.intValue();
        String strHeader3 = request.header("write_timeout");
        int iIntValue3 = (strHeader3 == null || (numQ0 = StringsKt.q0(strHeader3)) == null) ? ((Number) this.d.getValue()).intValue() : numQ0.intValue();
        builder.removeHeader("connection_timeout");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Interceptor.Chain chainWithConnectTimeout = chain.withConnectTimeout(iIntValue, timeUnit);
        builder.removeHeader("read_timeout");
        Interceptor.Chain chainWithReadTimeout = chainWithConnectTimeout.withReadTimeout(iIntValue2, timeUnit);
        builder.removeHeader("write_timeout");
        return chainWithReadTimeout.withWriteTimeout(iIntValue3, timeUnit);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain ichain) throws BaseNetworkException.NetworkConnectionFailedException {
        Intrinsics.i(ichain, "ichain");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Interceptor.Chain chainA = a(ichain.request(), ichain.request().newBuilder(), ichain);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Response responseProceed = chainA.proceed(chainA.request());
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            Response.Builder builderNewBuilder = responseProceed.newBuilder();
            builderNewBuilder.addHeader("callLatency", String.valueOf(jCurrentTimeMillis3));
            long jCurrentTimeMillis4 = (System.currentTimeMillis() - jCurrentTimeMillis) - jCurrentTimeMillis3;
            String url = chainA.request().url().encodedPath();
            Intrinsics.i(url, "url");
            HashMap map = new HashMap();
            map.put("interceptor", "TimeoutInterceptor");
            map.put("interceptorLatency", Long.valueOf(jCurrentTimeMillis4));
            map.put("url", url);
            return builderNewBuilder.build();
        } catch (Throwable th) {
            if (th instanceof BaseNetworkException) {
                throw th;
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            throw new BaseNetworkException.NetworkConnectionFailedException(message, th);
        }
    }
}
