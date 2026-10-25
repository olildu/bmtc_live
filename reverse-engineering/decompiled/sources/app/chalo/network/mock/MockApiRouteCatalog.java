package app.chalo.network.mock;

import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.response.NetworkResponse;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog;", "", "RouteLookupResult", "RouteDefinition", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MockApiRouteCatalog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MockApiFixtureLoader f6479a;
    public final MockApiRouteVariantState b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$Companion;", "", "", "MOCK_LOG_TAG", "Ljava/lang/String;", "MOCK_HEADER_NAME", "MOCK_HEADER_VALUE", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "", "NoMatch", "MockResponse", "MissingFixture", "KnownRouteWithoutSelection", "InvalidCustomResponse", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$InvalidCustomResponse;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$KnownRouteWithoutSelection;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$MissingFixture;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$MockResponse;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$NoMatch;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RouteLookupResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$InvalidCustomResponse;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCustomResponse extends RouteLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6481a;

            public InvalidCustomResponse(String routeId) {
                Intrinsics.i(routeId, "routeId");
                this.f6481a = routeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvalidCustomResponse) && Intrinsics.d(this.f6481a, ((InvalidCustomResponse) obj).f6481a);
            }

            public final int hashCode() {
                return (this.f6481a.hashCode() * 31) - 1141302015;
            }

            public final String toString() {
                return vo1.B("InvalidCustomResponse(routeId=", this.f6481a, ", reason=selected custom variant without custom response payload)");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$KnownRouteWithoutSelection;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KnownRouteWithoutSelection extends RouteLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6482a;
            public final String b;

            public KnownRouteWithoutSelection(String routeId, String routePath) {
                Intrinsics.i(routeId, "routeId");
                Intrinsics.i(routePath, "routePath");
                this.f6482a = routeId;
                this.b = routePath;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KnownRouteWithoutSelection)) {
                    return false;
                }
                KnownRouteWithoutSelection knownRouteWithoutSelection = (KnownRouteWithoutSelection) obj;
                return Intrinsics.d(this.f6482a, knownRouteWithoutSelection.f6482a) && Intrinsics.d(this.b, knownRouteWithoutSelection.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6482a.hashCode() * 31);
            }

            public final String toString() {
                return vo1.o("KnownRouteWithoutSelection(routeId=", this.f6482a, ", routePath=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$MissingFixture;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MissingFixture extends RouteLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6483a;
            public final String b;
            public final String c;

            public MissingFixture(String routeId, String fixturePath, String routePath) {
                Intrinsics.i(routeId, "routeId");
                Intrinsics.i(fixturePath, "fixturePath");
                Intrinsics.i(routePath, "routePath");
                this.f6483a = routeId;
                this.b = fixturePath;
                this.c = routePath;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MissingFixture)) {
                    return false;
                }
                MissingFixture missingFixture = (MissingFixture) obj;
                return Intrinsics.d(this.f6483a, missingFixture.f6483a) && Intrinsics.d(this.b, missingFixture.b) && Intrinsics.d(this.c, missingFixture.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + nf1.e(this.f6483a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return vo1.p(dd.e("MissingFixture(routeId=", this.f6483a, ", fixturePath=", this.b, ", routePath="), this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$MockResponse;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MockResponse extends RouteLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6484a;
            public final MockApiVariant b;
            public final NetworkResponse c;

            public MockResponse(String routeId, MockApiVariant variant, NetworkResponse networkResponse) {
                Intrinsics.i(routeId, "routeId");
                Intrinsics.i(variant, "variant");
                this.f6484a = routeId;
                this.b = variant;
                this.c = networkResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MockResponse)) {
                    return false;
                }
                MockResponse mockResponse = (MockResponse) obj;
                return Intrinsics.d(this.f6484a, mockResponse.f6484a) && this.b == mockResponse.b && Intrinsics.d(this.c, mockResponse.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f6484a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "MockResponse(routeId=" + this.f6484a + ", variant=" + this.b + ", response=" + this.c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult$NoMatch;", "Lapp/chalo/network/mock/MockApiRouteCatalog$RouteLookupResult;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoMatch extends RouteLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NoMatch f6485a = new NoMatch();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6486a;

        static {
            int[] iArr = new int[MockApiVariant.values().length];
            try {
                iArr[MockApiVariant.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MockApiVariant.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MockApiVariant.MALFORMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MockApiVariant.SERVER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MockApiVariant.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6486a = iArr;
        }
    }

    public MockApiRouteCatalog(MockApiFixtureLoader mockApiFixtureLoader, MockApiRouteVariantState mockApiRouteVariantState) {
        this.f6479a = mockApiFixtureLoader;
        this.b = mockApiRouteVariantState;
        HttpRequestType httpRequestType = HttpRequestType.GET;
        this.c = CollectionsKt.S(new RouteDefinition("configuration_rc_v2", httpRequestType, "configuration/rc/v2", "mock-api/configuration_rc_v2/success.json", "mock-api/configuration_rc_v2/server_error.json", MapsKt.h(new Pair("etag", CollectionsKt.R("mock-config-v2")))), new RouteDefinition("chaukidar_v1_otp", HttpRequestType.POST, "chaukidar/v1/otp", "mock-api/chaukidar_v1_otp/success.json", "mock-api/chaukidar_v1_otp/server_error.json"), new RouteDefinition("scheduler_v4_v5_mumbai_tripplanner", httpRequestType, "scheduler_v4/v5/MUMBAI/tripplanner", "mock-api/scheduler_v4_v5_mumbai_tripplanner/success.json", "mock-api/scheduler_v4_v5_mumbai_tripplanner/server_error.json"), new RouteDefinition("configuration_v1_cities_mumbai_homescreen_config", httpRequestType, "configuration/v1/cities/mumbai/homescreen-config", "mock-api/configuration_v1_cities_mumbai_homescreen_config/success.json", "mock-api/configuration_v1_cities_mumbai_homescreen_config/server_error.json"), new RouteDefinition("configuration_v1_cities_mumbai_homescreen_config", httpRequestType, "configuration/v1/cities/MUMBAI/homescreen-config", "mock-api/configuration_v1_cities_mumbai_homescreen_config/success.json", "mock-api/configuration_v1_cities_mumbai_homescreen_config/server_error.json"), new RouteDefinition("configuration_v1_cities_bengaluru_homescreen_config", httpRequestType, "configuration/v1/cities/bengaluru/homescreen-config", "mock-api/configuration_v1_cities_bengaluru_homescreen_config/success.json", "mock-api/configuration_v1_cities_bengaluru_homescreen_config/server_error.json"), new RouteDefinition("configuration_v1_cities_bengaluru_homescreen_config", httpRequestType, "configuration/v1/cities/BENGALURU/homescreen-config", "mock-api/configuration_v1_cities_bengaluru_homescreen_config/success.json", "mock-api/configuration_v1_cities_bengaluru_homescreen_config/server_error.json"));
    }

    public static NetworkResponse a(int i, String str, NetworkCrashlyticsLogger networkCrashlyticsLogger, Map map) {
        ErrorType errorTypeA;
        LinkedHashMap linkedHashMapL = MapsKt.l(MapsKt.l(MapsKt.h(new Pair(HttpHeaderParser.HEADER_CONTENT_TYPE, CollectionsKt.R("application/json"))), map), MapsKt.h(new Pair("x-chalo-api-source", CollectionsKt.R("mock"))));
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        if (200 > i || i >= 300) {
            ErrorType.INSTANCE.getClass();
            errorTypeA = ErrorType.Companion.a(i);
        } else {
            errorTypeA = ErrorType.TYPE_NONE;
        }
        return new NetworkResponse(z, errorTypeA, str, null, linkedHashMapL, i, networkCrashlyticsLogger);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(NormalizedRequestDescriptor requestDescriptor, NetworkCrashlyticsLogger networkCrashlyticsLogger, ContinuationImpl continuationImpl) {
        MockApiRouteCatalog$findResponse$1 mockApiRouteCatalog$findResponse$1;
        Object next;
        RouteDefinition routeDefinition;
        if (continuationImpl instanceof MockApiRouteCatalog$findResponse$1) {
            mockApiRouteCatalog$findResponse$1 = (MockApiRouteCatalog$findResponse$1) continuationImpl;
            int i = mockApiRouteCatalog$findResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mockApiRouteCatalog$findResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                mockApiRouteCatalog$findResponse$1 = new MockApiRouteCatalog$findResponse$1(this, continuationImpl);
            }
        } else {
            mockApiRouteCatalog$findResponse$1 = new MockApiRouteCatalog$findResponse$1(this, continuationImpl);
        }
        Object objB = mockApiRouteCatalog$findResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mockApiRouteCatalog$findResponse$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RouteDefinition routeDefinition2 = (RouteDefinition) next;
                routeDefinition2.getClass();
                Intrinsics.i(requestDescriptor, "requestDescriptor");
                if (requestDescriptor.f6492a == routeDefinition2.b && Intrinsics.d(requestDescriptor.d, routeDefinition2.c)) {
                    break;
                }
            }
            routeDefinition = (RouteDefinition) next;
            if (routeDefinition == null) {
                return RouteLookupResult.NoMatch.f6485a;
            }
            String str = routeDefinition.f6480a;
            mockApiRouteCatalog$findResponse$1.L$0 = networkCrashlyticsLogger;
            mockApiRouteCatalog$findResponse$1.L$1 = routeDefinition;
            mockApiRouteCatalog$findResponse$1.label = 1;
            objB = this.b.b(str);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routeDefinition = (RouteDefinition) mockApiRouteCatalog$findResponse$1.L$1;
            networkCrashlyticsLogger = (NetworkCrashlyticsLogger) mockApiRouteCatalog$findResponse$1.L$0;
            ResultKt.b(objB);
        }
        RouteDefinition routeDefinition3 = routeDefinition;
        NetworkCrashlyticsLogger networkCrashlyticsLogger2 = networkCrashlyticsLogger;
        MockApiRouteVariantSelection mockApiRouteVariantSelection = (MockApiRouteVariantSelection) objB;
        if (mockApiRouteVariantSelection == null) {
            return new RouteLookupResult.KnownRouteWithoutSelection(routeDefinition3.f6480a, routeDefinition3.c);
        }
        MockApiVariant mockApiVariant = mockApiRouteVariantSelection.f6487a;
        int i3 = WhenMappings.f6486a[mockApiVariant.ordinal()];
        if (i3 == 1) {
            return c(routeDefinition3, routeDefinition3.d, 200, networkCrashlyticsLogger2, mockApiRouteVariantSelection.f6487a, routeDefinition3.f);
        }
        if (i3 == 2) {
            return new RouteLookupResult.MockResponse(routeDefinition3.f6480a, mockApiVariant, a(200, "", networkCrashlyticsLogger2, MapsKt.d()));
        }
        if (i3 == 3) {
            return new RouteLookupResult.MockResponse(routeDefinition3.f6480a, mockApiVariant, a(200, "{\"malformed\":", networkCrashlyticsLogger2, MapsKt.d()));
        }
        if (i3 == 4) {
            return c(routeDefinition3, routeDefinition3.e, ServiceStarter.ERROR_UNKNOWN, networkCrashlyticsLogger2, mockApiRouteVariantSelection.f6487a, MapsKt.d());
        }
        if (i3 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        MockApiCustomResponse mockApiCustomResponse = mockApiRouteVariantSelection.b;
        return mockApiCustomResponse == null ? new RouteLookupResult.InvalidCustomResponse(routeDefinition3.f6480a) : new RouteLookupResult.MockResponse(routeDefinition3.f6480a, mockApiVariant, a(mockApiCustomResponse.f6475a, mockApiCustomResponse.c, networkCrashlyticsLogger2, mockApiCustomResponse.b));
    }

    public final RouteLookupResult c(RouteDefinition routeDefinition, String str, int i, NetworkCrashlyticsLogger networkCrashlyticsLogger, MockApiVariant mockApiVariant, Map map) {
        String str2 = routeDefinition.c;
        String str3 = routeDefinition.f6480a;
        String strA = this.f6479a.a(str);
        if (strA == null) {
            StringBuilder sbE = dd.e("fixture missing routeId=", str3, " path=", str2, " fixture=");
            sbE.append(str);
            MockApiRuntimeLogger.a("MockApiDispatcher", sbE.toString());
            return new RouteLookupResult.MissingFixture(str3, str, str2);
        }
        String lowerCase = mockApiVariant.name().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        StringBuilder sb = new StringBuilder("fixture matched routeId=");
        sb.append(str3);
        sb.append(" path=");
        cb0.t(sb, str2, " fixture=", str, " variant=");
        sb.append(lowerCase);
        MockApiRuntimeLogger.b("MockApiDispatcher", sb.toString());
        return new RouteLookupResult.MockResponse(str3, mockApiVariant, a(i, strA, networkCrashlyticsLogger, map));
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteCatalog$RouteDefinition;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6480a;
        public final HttpRequestType b;
        public final String c;
        public final String d;
        public final String e;
        public final Map f;

        public RouteDefinition(String str, HttpRequestType method, String str2, String str3, String str4, Map map) {
            Intrinsics.i(method, "method");
            this.f6480a = str;
            this.b = method;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteDefinition)) {
                return false;
            }
            RouteDefinition routeDefinition = (RouteDefinition) obj;
            return Intrinsics.d(this.f6480a, routeDefinition.f6480a) && this.b == routeDefinition.b && Intrinsics.d(this.c, routeDefinition.c) && Intrinsics.d(this.d, routeDefinition.d) && Intrinsics.d(this.e, routeDefinition.e) && Intrinsics.d(this.f, routeDefinition.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + nf1.e(nf1.e(nf1.e((this.b.hashCode() + (this.f6480a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RouteDefinition(routeId=");
            sb.append(this.f6480a);
            sb.append(", method=");
            sb.append(this.b);
            sb.append(", path=");
            cb0.t(sb, this.c, ", successFixturePath=", this.d, ", serverErrorFixturePath=");
            sb.append(this.e);
            sb.append(", successHeaders=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ RouteDefinition(String str, HttpRequestType httpRequestType, String str2, String str3, String str4) {
            this(str, httpRequestType, str2, str3, str4, MapsKt.d());
        }
    }
}
