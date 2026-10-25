package app.chalo.network.rest.request;

import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.mock.ApiSourceAwareRequestDispatcher;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.response.NetworkResponse;
import com.android.volley.toolbox.HttpHeaderParser;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.util.StringValuesKt;
import io.ktor.util.cio.ReadersKt;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.internal._Utf8Kt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/request/ChaloRequest;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericRequestData f6513a;
    public final NetworkCrashlyticsLogger b;
    public final ApiSourceAwareRequestDispatcher c;
    public final RequestRetryHandler d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6514a;

        static {
            int[] iArr = new int[HttpRequestType.values().length];
            try {
                iArr[HttpRequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpRequestType.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpRequestType.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpRequestType.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpRequestType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6514a = iArr;
        }
    }

    public ChaloRequest(GenericRequestData genericRequestData, NetworkCrashlyticsLogger networkCrashlyticsLogger, ApiSourceAwareRequestDispatcher apiSourceAwareRequestDispatcher) {
        Intrinsics.i(genericRequestData, "genericRequestData");
        Intrinsics.i(networkCrashlyticsLogger, "networkCrashlyticsLogger");
        Intrinsics.i(apiSourceAwareRequestDispatcher, "apiSourceAwareRequestDispatcher");
        this.f6513a = genericRequestData;
        this.b = networkCrashlyticsLogger;
        this.c = apiSourceAwareRequestDispatcher;
        int i = genericRequestData.p;
        RetryStrategyType.Companion companion = RetryStrategyType.INSTANCE;
        String str = genericRequestData.q;
        companion.getClass();
        for (RetryStrategyType retryStrategyType : RetryStrategyType.values()) {
            if (Intrinsics.d(retryStrategyType.name(), str)) {
                this.d = new RequestRetryHandler(i, retryStrategyType);
            }
        }
        retryStrategyType = RetryStrategyType.UNKNOWN;
        this.d = new RequestRetryHandler(i, retryStrategyType);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a A[LOOP:0: B:110:0x0224->B:112:0x022a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0253 A[LOOP:1: B:114:0x024d->B:116:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0 A[LOOP:2: B:122:0x02aa->B:124:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x02d9 A[LOOP:3: B:126:0x02d3->B:128:0x02d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x030b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0333  */
    /* JADX WARN: Code duplicated, block: B:143:0x0337  */
    /* JADX WARN: Code duplicated, block: B:145:0x0352  */
    /* JADX WARN: Code duplicated, block: B:147:0x035b  */
    /* JADX WARN: Code duplicated, block: B:150:0x037f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0404  */
    /* JADX WARN: Code duplicated, block: B:165:0x040a  */
    /* JADX WARN: Code duplicated, block: B:166:0x042a  */
    /* JADX WARN: Code duplicated, block: B:168:0x042f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0433  */
    /* JADX WARN: Code duplicated, block: B:175:0x0466  */
    /* JADX WARN: Code duplicated, block: B:177:0x046a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0480  */
    /* JADX WARN: Code duplicated, block: B:181:0x048c  */
    /* JADX WARN: Code duplicated, block: B:186:0x04cb A[LOOP:5: B:184:0x04c5->B:186:0x04cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:194:0x0527 A[LOOP:6: B:192:0x0521->B:194:0x0527, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0550 A[LOOP:7: B:196:0x054a->B:198:0x0550, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x056f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0584  */
    /* JADX WARN: Code duplicated, block: B:215:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:218:0x05dd A[LOOP:8: B:216:0x05d7->B:218:0x05dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0606 A[LOOP:9: B:220:0x0600->B:222:0x0606, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x063a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:230:0x063b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:249:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0276, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x032b, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04ea, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05a6, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x062c, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r3.t == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        if (kotlin.collections.CollectionsKt.w(kotlin.collections.CollectionsKt.R("application/json"), r3) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.network.rest.request.ChaloRequest.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18, types: [io.ktor.http.HttpMessage] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object b(HttpResponse httpResponse, ContinuationImpl continuationImpl) {
        ChaloRequest$processResponse$1 chaloRequest$processResponse$1;
        Exception exc;
        ?? r6;
        ?? r12;
        Object objA;
        int i;
        HttpResponse httpResponse2;
        HttpResponse httpResponse3;
        Object objA2;
        Object objA3;
        HttpResponse httpResponse4;
        int i2;
        HttpResponse httpResponse5;
        HttpResponse httpResponse6;
        Object objA4;
        String strA;
        byte[] bArr;
        int i3;
        Exception e;
        if (continuationImpl instanceof ChaloRequest$processResponse$1) {
            chaloRequest$processResponse$1 = (ChaloRequest$processResponse$1) continuationImpl;
            int i4 = chaloRequest$processResponse$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chaloRequest$processResponse$1.label = i4 - Integer.MIN_VALUE;
            } else {
                chaloRequest$processResponse$1 = new ChaloRequest$processResponse$1(this, continuationImpl);
            }
        } else {
            chaloRequest$processResponse$1 = new ChaloRequest$processResponse$1(this, continuationImpl);
        }
        Object obj = chaloRequest$processResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = chaloRequest$processResponse$1.label;
        if (r2 == 0) {
            ResultKt.b(obj);
            i = httpResponse.getF16698a().f16803a;
            if (200 > i || i >= 300) {
                chaloRequest$processResponse$1.L$0 = httpResponse;
                chaloRequest$processResponse$1.I$0 = i;
                chaloRequest$processResponse$1.label = 5;
                Object objB = HttpResponseKt.b(httpResponse, Charsets.f17672a, chaloRequest$processResponse$1);
                if (objB != coroutineSingletons) {
                    i2 = i;
                    obj = objB;
                    httpResponse5 = httpResponse;
                    String str = (String) obj;
                    ErrorType.INSTANCE.getClass();
                    return new NetworkResponse(false, ErrorType.Companion.a(i2), str, null, StringValuesKt.c(httpResponse5.getE()), i2, this.b);
                }
            } else {
                try {
                    String str2 = httpResponse.getE().get(HttpHeaderParser.HEADER_CONTENT_TYPE);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (StringsKt.a0(str2, "application/pdf", false)) {
                        chaloRequest$processResponse$1.L$0 = httpResponse;
                        chaloRequest$processResponse$1.I$0 = i;
                        chaloRequest$processResponse$1.label = 1;
                        objA4 = HttpResponseKt.a(httpResponse, chaloRequest$processResponse$1);
                        if (objA4 == coroutineSingletons) {
                            httpResponse6 = httpResponse;
                        } else {
                            httpResponse6 = httpResponse;
                            chaloRequest$processResponse$1.L$0 = httpResponse6;
                            chaloRequest$processResponse$1.I$0 = i;
                            chaloRequest$processResponse$1.label = 2;
                            objA = ReadersKt.a((ByteReadChannel) objA4, Integer.MAX_VALUE, chaloRequest$processResponse$1);
                            httpResponse2 = httpResponse6;
                            if (objA == coroutineSingletons) {
                            }
                            bArr = (byte[]) objA;
                            strA = _Utf8Kt.a(bArr);
                            httpResponse = httpResponse2;
                        }
                    } else {
                        chaloRequest$processResponse$1.L$0 = httpResponse;
                        chaloRequest$processResponse$1.I$0 = i;
                        chaloRequest$processResponse$1.label = 3;
                        objA2 = HttpResponseKt.a(httpResponse, chaloRequest$processResponse$1);
                        if (objA2 == coroutineSingletons) {
                            httpResponse3 = httpResponse;
                        } else {
                            httpResponse3 = httpResponse;
                            chaloRequest$processResponse$1.L$0 = httpResponse3;
                            chaloRequest$processResponse$1.I$0 = i;
                            chaloRequest$processResponse$1.label = 4;
                            objA3 = ReadersKt.a((ByteReadChannel) objA2, Integer.MAX_VALUE, chaloRequest$processResponse$1);
                            httpResponse4 = httpResponse3;
                            if (objA3 == coroutineSingletons) {
                            }
                            strA = _Utf8Kt.a((byte[]) objA3);
                            bArr = null;
                            httpResponse = httpResponse4;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i3 = i;
                    exc = e;
                    r6 = i3;
                    r12 = httpResponse;
                    this.b.b(exc);
                    return new NetworkResponse(false, ErrorType.TYPE_NONE, null, null, StringValuesKt.c(r12.getE()), r6, this.b);
                }
            }
            return coroutineSingletons;
        }
        try {
            if (r2 != 1) {
                try {
                    if (r2 != 2) {
                        if (r2 == 3) {
                            int i5 = chaloRequest$processResponse$1.I$0;
                            HttpResponse httpResponse7 = (HttpResponse) chaloRequest$processResponse$1.L$0;
                            ResultKt.b(obj);
                            i = i5;
                            httpResponse3 = httpResponse7;
                            objA2 = obj;
                            httpResponse3 = httpResponse;
                            chaloRequest$processResponse$1.L$0 = httpResponse3;
                            chaloRequest$processResponse$1.I$0 = i;
                            chaloRequest$processResponse$1.label = 4;
                            objA3 = ReadersKt.a((ByteReadChannel) objA2, Integer.MAX_VALUE, chaloRequest$processResponse$1);
                            httpResponse4 = httpResponse3;
                            if (objA3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (r2 != 4) {
                                if (r2 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i6 = chaloRequest$processResponse$1.I$0;
                                HttpResponse httpResponse8 = (HttpResponse) chaloRequest$processResponse$1.L$0;
                                ResultKt.b(obj);
                                i2 = i6;
                                httpResponse5 = httpResponse8;
                                String str3 = (String) obj;
                                ErrorType.INSTANCE.getClass();
                                return new NetworkResponse(false, ErrorType.Companion.a(i2), str3, null, StringValuesKt.c(httpResponse5.getE()), i2, this.b);
                            }
                            int i7 = chaloRequest$processResponse$1.I$0;
                            HttpResponse httpResponse9 = (HttpResponse) chaloRequest$processResponse$1.L$0;
                            ResultKt.b(obj);
                            objA3 = obj;
                            i = i7;
                            httpResponse4 = httpResponse9;
                        }
                        strA = _Utf8Kt.a((byte[]) objA3);
                        bArr = null;
                        httpResponse = httpResponse4;
                    } else {
                        int i8 = chaloRequest$processResponse$1.I$0;
                        HttpResponse httpResponse10 = (HttpResponse) chaloRequest$processResponse$1.L$0;
                        ResultKt.b(obj);
                        objA = obj;
                        i = i8;
                        httpResponse2 = httpResponse10;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    r6 = httpResponse;
                    r12 = coroutineSingletons;
                    this.b.b(exc);
                    return new NetworkResponse(false, ErrorType.TYPE_NONE, null, null, StringValuesKt.c(r12.getE()), r6, this.b);
                }
            } else {
                int i9 = chaloRequest$processResponse$1.I$0;
                HttpResponse httpResponse11 = (HttpResponse) chaloRequest$processResponse$1.L$0;
                ResultKt.b(obj);
                i = i9;
                httpResponse6 = httpResponse11;
                objA4 = obj;
                httpResponse6 = httpResponse;
                chaloRequest$processResponse$1.L$0 = httpResponse6;
                chaloRequest$processResponse$1.I$0 = i;
                chaloRequest$processResponse$1.label = 2;
                objA = ReadersKt.a((ByteReadChannel) objA4, Integer.MAX_VALUE, chaloRequest$processResponse$1);
                httpResponse2 = httpResponse6;
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            bArr = (byte[]) objA;
            strA = _Utf8Kt.a(bArr);
            httpResponse = httpResponse2;
        } catch (Exception e4) {
            exc = e4;
            r6 = httpResponse;
            r12 = r2;
        }
        i3 = i;
        byte[] bArr2 = bArr;
        String str4 = strA;
        try {
            return new NetworkResponse(true, ErrorType.TYPE_NONE, str4, bArr2, StringValuesKt.c(httpResponse.getE()), i3 == true ? 1 : 0, this.b);
        } catch (Exception e5) {
            e = e5;
            exc = e;
            r6 = i3;
            r12 = httpResponse;
            this.b.b(exc);
            return new NetworkResponse(false, ErrorType.TYPE_NONE, null, null, StringValuesKt.c(r12.getE()), r6, this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[Catch: Exception -> 0x003d, BaseNetworkException -> 0x003f, CancellationException -> 0x006b, PHI: r0
      0x0051: PHI (r0v11 java.lang.Object) = (r0v14 java.lang.Object), (r0v3 java.lang.Object) binds: [B:25:0x004d, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {BaseNetworkException -> 0x003f, CancellationException -> 0x006b, Exception -> 0x003d, blocks: (B:24:0x0045, B:27:0x0051, B:16:0x0039), top: B:60:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d7 -> B:52:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e4 -> B:56:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.network.rest.request.ChaloRequest.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
