package app.chalo.network.mock;

import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.dd;
import defpackage.vo1;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/mock/ApiSourceAwareRequestDispatcher;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApiSourceAwareRequestDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiSourceState f6470a;
    public final ChaloUrlProvider b;
    public final MockApiRouteCatalog c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/network/mock/ApiSourceAwareRequestDispatcher$Companion;", "", "", "MOCK_LOG_TAG", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ApiSourceAwareRequestDispatcher(ApiSourceState apiSourceState, ChaloUrlProvider chaloUrlProvider, MockApiRouteCatalog mockApiRouteCatalog) {
        this.f6470a = apiSourceState;
        this.b = chaloUrlProvider;
        this.c = mockApiRouteCatalog;
    }

    public static void a(NetworkCrashlyticsLogger networkCrashlyticsLogger, ApiSource apiSource, String str, NormalizedRequestDescriptor normalizedRequestDescriptor, String str2) {
        String strConcat = str2 != null ? " ".concat(str2) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        String lowerCase = apiSource.name().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str3 = normalizedRequestDescriptor.f;
        StringBuilder sbE = dd.e("apiSource=", lowerCase, " decision=", str, strConcat);
        sbE.append(" request=");
        sbE.append(str3);
        String string = sbE.toString();
        MockApiRuntimeLogger.b("MockApiDispatcher", string);
        System.out.println((Object) "MockApiDispatcher: ".concat(string));
        networkCrashlyticsLogger.a("MockApiDispatcher", string);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(ApiSource apiSource, NormalizedRequestDescriptor normalizedRequestDescriptor, NetworkCrashlyticsLogger networkCrashlyticsLogger, ContinuationImpl continuationImpl) {
        ApiSourceAwareRequestDispatcher$tryDispatch$3 apiSourceAwareRequestDispatcher$tryDispatch$3;
        Object objA;
        NetworkResponse networkResponse;
        ApiSource apiSource2 = apiSource;
        NormalizedRequestDescriptor normalizedRequestDescriptor2 = normalizedRequestDescriptor;
        NetworkCrashlyticsLogger networkCrashlyticsLogger2 = networkCrashlyticsLogger;
        if (continuationImpl instanceof ApiSourceAwareRequestDispatcher$tryDispatch$3) {
            apiSourceAwareRequestDispatcher$tryDispatch$3 = (ApiSourceAwareRequestDispatcher$tryDispatch$3) continuationImpl;
            int i = apiSourceAwareRequestDispatcher$tryDispatch$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiSourceAwareRequestDispatcher$tryDispatch$3.label = i - Integer.MIN_VALUE;
            } else {
                apiSourceAwareRequestDispatcher$tryDispatch$3 = new ApiSourceAwareRequestDispatcher$tryDispatch$3(this, continuationImpl);
            }
        } else {
            apiSourceAwareRequestDispatcher$tryDispatch$3 = new ApiSourceAwareRequestDispatcher$tryDispatch$3(this, continuationImpl);
        }
        Object objB = apiSourceAwareRequestDispatcher$tryDispatch$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = apiSourceAwareRequestDispatcher$tryDispatch$3.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (apiSource2 == ApiSource.REAL) {
                return null;
            }
            String str = normalizedRequestDescriptor2.c;
            ChaloUrlProvider chaloUrlProvider = this.b;
            List listS = CollectionsKt.S(chaloUrlProvider.g(), chaloUrlProvider.f(), chaloUrlProvider.h(), chaloUrlProvider.i(), chaloUrlProvider.c(), chaloUrlProvider.b(), chaloUrlProvider.e(), chaloUrlProvider.d(), chaloUrlProvider.j());
            ArrayList arrayList = new ArrayList();
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                try {
                    objA = URLUtilsKt.a((String) it.next()).getHost().toLowerCase(Locale.ROOT);
                    Intrinsics.h(objA, "toLowerCase(...)");
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                if (objA instanceof Result.Failure) {
                    objA = null;
                }
                String str2 = (String) objA;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            Set setG0 = CollectionsKt.G0(arrayList);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (!setG0.contains(lowerCase)) {
                a(networkCrashlyticsLogger2, apiSource2, "real passthrough", normalizedRequestDescriptor2, "fallback=third_party_route");
                return null;
            }
            apiSourceAwareRequestDispatcher$tryDispatch$3.L$0 = apiSource2;
            apiSourceAwareRequestDispatcher$tryDispatch$3.L$1 = normalizedRequestDescriptor2;
            apiSourceAwareRequestDispatcher$tryDispatch$3.L$2 = networkCrashlyticsLogger2;
            apiSourceAwareRequestDispatcher$tryDispatch$3.label = 1;
            objB = this.c.b(normalizedRequestDescriptor2, networkCrashlyticsLogger2, apiSourceAwareRequestDispatcher$tryDispatch$3);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NetworkCrashlyticsLogger networkCrashlyticsLogger3 = (NetworkCrashlyticsLogger) apiSourceAwareRequestDispatcher$tryDispatch$3.L$2;
            normalizedRequestDescriptor2 = (NormalizedRequestDescriptor) apiSourceAwareRequestDispatcher$tryDispatch$3.L$1;
            ApiSource apiSource3 = (ApiSource) apiSourceAwareRequestDispatcher$tryDispatch$3.L$0;
            ResultKt.b(objB);
            networkCrashlyticsLogger2 = networkCrashlyticsLogger3;
            apiSource2 = apiSource3;
        }
        MockApiRouteCatalog.RouteLookupResult routeLookupResult = (MockApiRouteCatalog.RouteLookupResult) objB;
        if (routeLookupResult instanceof MockApiRouteCatalog.RouteLookupResult.MockResponse) {
            MockApiRouteCatalog.RouteLookupResult.MockResponse mockResponse = (MockApiRouteCatalog.RouteLookupResult.MockResponse) routeLookupResult;
            String str3 = mockResponse.f6484a;
            String lowerCase2 = mockResponse.b.name().toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            a(networkCrashlyticsLogger2, apiSource2, "mock matched", normalizedRequestDescriptor2, "routeId=" + str3 + " variant=" + lowerCase2);
            return mockResponse.c;
        }
        if (routeLookupResult instanceof MockApiRouteCatalog.RouteLookupResult.MissingFixture) {
            MockApiRouteCatalog.RouteLookupResult.MissingFixture missingFixture = (MockApiRouteCatalog.RouteLookupResult.MissingFixture) routeLookupResult;
            String str4 = missingFixture.f6483a;
            String str5 = missingFixture.c;
            String str6 = missingFixture.b;
            StringBuilder sbE = dd.e("missing mock fixture routeId=", str4, " route=", str5, " fixture=");
            sbE.append(str6);
            String string = sbE.toString();
            a(networkCrashlyticsLogger2, apiSource2, "mock failure", normalizedRequestDescriptor2, string);
            networkResponse = new NetworkResponse(false, ErrorType.TYPE_UNKNOWN, string, null, null, 0, networkCrashlyticsLogger2);
        } else {
            if (!(routeLookupResult instanceof MockApiRouteCatalog.RouteLookupResult.InvalidCustomResponse)) {
                if (routeLookupResult instanceof MockApiRouteCatalog.RouteLookupResult.KnownRouteWithoutSelection) {
                    a(networkCrashlyticsLogger2, apiSource2, "real passthrough", normalizedRequestDescriptor2, vo1.m("fallback=known_internal_route_without_mock_variant routeId=", ((MockApiRouteCatalog.RouteLookupResult.KnownRouteWithoutSelection) routeLookupResult).f6482a));
                    return null;
                }
                if (!Intrinsics.d(routeLookupResult, MockApiRouteCatalog.RouteLookupResult.NoMatch.f6485a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a(networkCrashlyticsLogger2, apiSource2, "real passthrough", normalizedRequestDescriptor2, "fallback=unmocked_internal_route");
                return null;
            }
            String strB = vo1.B("invalid custom mock response routeId=", ((MockApiRouteCatalog.RouteLookupResult.InvalidCustomResponse) routeLookupResult).f6481a, " reason=selected custom variant without custom response payload");
            a(networkCrashlyticsLogger2, apiSource2, "mock failure", normalizedRequestDescriptor2, strB);
            networkResponse = new NetworkResponse(false, ErrorType.TYPE_UNKNOWN, strB, null, null, 0, networkCrashlyticsLogger2);
        }
        return networkResponse;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(GenericRequestData genericRequestData, String str, HttpRequestType httpRequestType, NetworkCrashlyticsLogger networkCrashlyticsLogger, ContinuationImpl continuationImpl) {
        ApiSourceAwareRequestDispatcher$tryDispatch$2 apiSourceAwareRequestDispatcher$tryDispatch$2;
        GenericRequestData genericRequestData2;
        String fullUrl;
        NetworkCrashlyticsLogger networkCrashlyticsLogger2;
        HttpRequestType method;
        Object obj;
        if (continuationImpl instanceof ApiSourceAwareRequestDispatcher$tryDispatch$2) {
            apiSourceAwareRequestDispatcher$tryDispatch$2 = (ApiSourceAwareRequestDispatcher$tryDispatch$2) continuationImpl;
            int i = apiSourceAwareRequestDispatcher$tryDispatch$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiSourceAwareRequestDispatcher$tryDispatch$2.label = i - Integer.MIN_VALUE;
            } else {
                apiSourceAwareRequestDispatcher$tryDispatch$2 = new ApiSourceAwareRequestDispatcher$tryDispatch$2(this, continuationImpl);
            }
        } else {
            apiSourceAwareRequestDispatcher$tryDispatch$2 = new ApiSourceAwareRequestDispatcher$tryDispatch$2(this, continuationImpl);
        }
        Object obj2 = apiSourceAwareRequestDispatcher$tryDispatch$2.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = apiSourceAwareRequestDispatcher$tryDispatch$2.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            genericRequestData2 = genericRequestData;
            apiSourceAwareRequestDispatcher$tryDispatch$2.L$0 = genericRequestData2;
            apiSourceAwareRequestDispatcher$tryDispatch$2.L$1 = str;
            apiSourceAwareRequestDispatcher$tryDispatch$2.L$2 = httpRequestType;
            apiSourceAwareRequestDispatcher$tryDispatch$2.L$3 = networkCrashlyticsLogger;
            apiSourceAwareRequestDispatcher$tryDispatch$2.label = 1;
            Object objA = this.f6470a.a();
            if (objA != obj3) {
                fullUrl = str;
                networkCrashlyticsLogger2 = networkCrashlyticsLogger;
                method = httpRequestType;
                obj = objA;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return obj2;
        }
        networkCrashlyticsLogger2 = (NetworkCrashlyticsLogger) apiSourceAwareRequestDispatcher$tryDispatch$2.L$3;
        HttpRequestType httpRequestType2 = (HttpRequestType) apiSourceAwareRequestDispatcher$tryDispatch$2.L$2;
        String str2 = (String) apiSourceAwareRequestDispatcher$tryDispatch$2.L$1;
        GenericRequestData genericRequestData3 = (GenericRequestData) apiSourceAwareRequestDispatcher$tryDispatch$2.L$0;
        ResultKt.b(obj2);
        obj = obj2;
        genericRequestData2 = genericRequestData3;
        fullUrl = str2;
        method = httpRequestType2;
        ApiSource apiSource = (ApiSource) obj;
        if (apiSource == ApiSource.REAL) {
            return null;
        }
        Map queryParams = genericRequestData2.f;
        Intrinsics.i(fullUrl, "fullUrl");
        Intrinsics.i(queryParams, "queryParams");
        Intrinsics.i(method, "method");
        Url urlA = URLUtilsKt.a(fullUrl);
        String lowerCase = urlA.getHost().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String strA0 = StringsKt.A0(urlA.i(), IOUtils.DIR_SEPARATOR_UNIX);
        List<Map.Entry> listV0 = CollectionsKt.v0(new NormalizedRequestDescriptor$Companion$from$$inlined$sortedBy$1(), queryParams.entrySet());
        int iG = MapsKt.g(CollectionsKt.v(listV0, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Map.Entry entry : listV0) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.d(), pair.e());
        }
        NormalizedRequestDescriptor normalizedRequestDescriptor = new NormalizedRequestDescriptor(method, fullUrl, lowerCase, strA0, linkedHashMap, method.name() + " " + lowerCase + "/" + strA0);
        apiSourceAwareRequestDispatcher$tryDispatch$2.L$0 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$2.L$1 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$2.L$2 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$2.L$3 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$2.label = 2;
        Object objB = b(apiSource, normalizedRequestDescriptor, networkCrashlyticsLogger2, apiSourceAwareRequestDispatcher$tryDispatch$2);
        return objB == obj3 ? obj3 : objB;
    }
}
