package app.chalo.home.data.remote;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.home.data.model.api.response.RoutesResponseApiModel;
import app.chalo.models.LocationAppModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.gt0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/data/remote/PremiumBusFeatureRemoteDataSourceImpl;", "Lapp/chalo/home/data/remote/PremiumBusFeatureRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFeatureRemoteDataSourceImpl implements PremiumBusFeatureRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2978a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/home/data/remote/PremiumBusFeatureRemoteDataSourceImpl$Companion;", "", "", "CITY_ID_PARAM", "Ljava/lang/String;", "SERVICE_TYPE_PARAM", "LAT_PARAM", "LON_PARAM", "FETCH_BANNER_URL", "FETCH_PREMIUM_BUS_CONTENT_CONFIG", "FETCH_ROUTE_SCHEDULES", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumBusFeatureRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider) {
        this.f2978a = networkManager;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl$fetchPremiumBusContentConfig$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl$fetchPremiumBusContentConfig$1 r0 = (app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl$fetchPremiumBusContentConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl$fetchPremiumBusContentConfig$1 r0 = new app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl$fetchPremiumBusContentConfig$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L2f
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            java.lang.Object r8 = r0.L$0
            app.chalo.network.rest.response.NetworkResponse r8 = (app.chalo.network.rest.response.NetworkResponse) r8
            kotlin.ResultKt.b(r9)
            goto Lba
        L38:
            kotlin.ResultKt.b(r9)
            goto L65
        L3c:
            kotlin.ResultKt.b(r9)
            app.chalo.network.NetworkManager r9 = r7.f2978a
            app.chalo.network.rest.request.NetworkRequestBuilder r9 = r9.d()
            java.lang.String r2 = "configuration/v1/content-config"
            r9.j(r2)
            app.chalo.network.rest.request.GenericRequestData r2 = r9.f6519a
            java.util.Map r2 = r2.f
            java.lang.String r6 = "cityId"
            r9.a(r6, r8, r2)
            app.chalo.network.rest.request.HttpRequestType r8 = app.chalo.network.rest.request.HttpRequestType.GET
            r9.f(r8)
            app.chalo.network.rest.request.ChaloRequest r8 = r9.e()
            r0.label = r5
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L65
            goto Lb9
        L65:
            r8 = r9
            app.chalo.network.rest.response.NetworkResponse r8 = (app.chalo.network.rest.response.NetworkResponse) r8
            boolean r9 = r8.f6522a
            java.lang.String r2 = r8.c
            if (r9 == 0) goto La8
            kotlinx.serialization.json.Json r9 = app.chalo.network.config.ChaloJson.b
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r1 = "Response json is either null or empty"
            r0.<init>(r1)
            if (r2 == 0) goto La2
            r9.getClass()     // Catch: java.lang.Exception -> L8d
            app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel$Companion r1 = app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel.INSTANCE     // Catch: java.lang.Exception -> L8d
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> L8d
            kotlinx.serialization.KSerializer r1 = kotlinx.serialization.builtins.BuiltinSerializersKt.c(r1)     // Catch: java.lang.Exception -> L8d
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch: java.lang.Exception -> L8d
            java.lang.Object r3 = r9.b(r2, r1)     // Catch: java.lang.Exception -> L8d
            goto La2
        L8d:
            r9 = move-exception
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r9 = r9.getMessage()
            java.lang.Class<app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel> r1 = app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel.class
            java.lang.String r9 = defpackage.t8.g(r1, r9, r2)
            r0.<init>(r9)
            app.chalo.network.NetworkCrashlyticsLogger r8 = r8.g
            r8.b(r0)
        La2:
            if (r3 == 0) goto La7
            app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel r3 = (app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel) r3
            return r3
        La7:
            throw r0
        La8:
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.L$0 = r8
            r0.label = r4
            app.chalo.providers.stringprovider.StringProvider r4 = r7.b
            java.lang.Object r9 = r4.b(r9, r2, r0)
            if (r9 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            java.lang.String r9 = (java.lang.String) r9
            hj0 r0 = new hj0
            r1 = 27
            r0.<init>(r9, r1)
            java.lang.Exception r8 = app.chalo.network.mapper.GenericNetworkExceptionMapper.a(r8, r3, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource
    public final Object b(String str, RouteServiceType routeServiceType, LocationAppModel locationAppModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1 premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1;
        if (continuationImpl instanceof PremiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1) {
            premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1 = (PremiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1) continuationImpl;
            int i = premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1 = new PremiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1(this, continuationImpl);
            }
        } else {
            premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1 = new PremiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1(this, continuationImpl);
        }
        Object objC = premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1.label;
        Object objB = null;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v1/{city}/routes/corridors", "{city}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f2978a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.a("serviceType", routeServiceType.name(), genericRequestData.f);
            if ((locationAppModel != null ? new Double(locationAppModel.f5586a) : null) != null) {
                networkRequestBuilderD.a("lat", String.valueOf(locationAppModel.f5586a), genericRequestData.f);
            }
            if ((locationAppModel != null ? new Double(locationAppModel.b) : null) != null) {
                networkRequestBuilderD.a("lon", String.valueOf(locationAppModel.b), genericRequestData.f);
            }
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1.label = 1;
            objC = chaloRequestE.c(premiumBusFeatureRemoteDataSourceImpl$fetchRouteSchedules$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new gt0(19));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(RoutesResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RoutesResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RoutesResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Map r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl.c(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
