package app.chalo.geoquery.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/domain/GeoSpatialLiveBusesDataPollingManager;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeoSpatialLiveBusesDataPollingManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchGeoSpatialDataUseCase f2822a;
    public final CoroutineContextProvider b;
    public final CityProvider c;
    public final IReportProblemFeature d;
    public final GetGeoQueryCityWiseConfigUseCase e;
    public final RouteAvailabilityBannerRepository f;
    public final AnalyticsContract g;

    public GeoSpatialLiveBusesDataPollingManager(FetchGeoSpatialDataUseCase fetchGeoSpatialDataUseCase, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, IReportProblemFeature iReportProblemFeature, GetGeoQueryCityWiseConfigUseCase getGeoQueryCityWiseConfigUseCase, RouteAvailabilityBannerRepository routeAvailabilityBannerRepository, AnalyticsContract analyticsContract) {
        this.f2822a = fetchGeoSpatialDataUseCase;
        this.b = coroutineContextProvider;
        this.c = cityProvider;
        this.d = iReportProblemFeature;
        this.e = getGeoQueryCityWiseConfigUseCase;
        this.f = routeAvailabilityBannerRepository;
        this.g = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object a(GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager, String str, JsonObject jsonObject, ContinuationImpl continuationImpl) {
        GeoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1 geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1;
        JsonObject jsonObjectP;
        String c;
        Object objA;
        JsonElement jsonElement;
        String str2;
        String str3 = str;
        RouteAvailabilityBannerRepository routeAvailabilityBannerRepository = geoSpatialLiveBusesDataPollingManager.f;
        if (continuationImpl instanceof GeoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1) {
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1 = (GeoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1) continuationImpl;
            int i = geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1 = new GeoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1(geoSpatialLiveBusesDataPollingManager, continuationImpl);
            }
        } else {
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1 = new GeoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1(geoSpatialLiveBusesDataPollingManager, continuationImpl);
        }
        Object obj = geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.label;
        boolean zEquals = true;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                String str4 = (String) geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$2;
                JsonObject jsonObject2 = (JsonObject) geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$1;
                String str5 = (String) geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$0;
                ResultKt.b(obj);
                c = str4;
                str3 = str5;
                objA = obj;
                jsonObjectP = jsonObject2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$0;
                ResultKt.b(obj);
            }
            AnalyticsContract.DefaultImpls.a(geoSpatialLiveBusesDataPollingManager.g, "banner info received", "", vo1.s("versionCode", str2), null, false, 24);
            return unit;
        }
        ResultKt.b(obj);
        if (jsonObject != null && (jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "bannerMap")) != null) {
            JsonObject jsonObjectP2 = JsonElementExtensionsKt.p(jsonObject, "metaData");
            if (jsonObjectP2 == null || (jsonElement = (JsonElement) jsonObjectP2.get("versionCode")) == null) {
                c = "noVersionCached";
            } else {
                ChaloJson chaloJson = ChaloJson.f6455a;
                JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
                if (jsonPrimitiveA != null) {
                    InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f18192a;
                    c = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getC();
                    if (c == null) {
                        c = "noVersionCached";
                    }
                } else {
                    c = "noVersionCached";
                }
            }
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$0 = str3;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$1 = jsonObjectP;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$2 = c;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.label = 1;
            objA = routeAvailabilityBannerRepository.a(str3, geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return unit;
        String str6 = (String) objA;
        if (str6 != null && !StringsKt.F(str6) && !str6.equals("noVersionCached") && !Intrinsics.d(c, "noVersionCached")) {
            Long lT0 = StringsKt.t0(c);
            Long lT1 = StringsKt.t0(str6);
            if (lT0 == null || lT1 == null) {
                zEquals = true ^ c.equals(str6);
            } else if (lT0.longValue() < lT1.longValue()) {
                zEquals = false;
            }
        }
        if (zEquals) {
            String string = jsonObjectP.toString();
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$0 = c;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$1 = null;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.L$2 = null;
            geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1.label = 2;
            if (routeAvailabilityBannerRepository.b(str3, string, c, geoSpatialLiveBusesDataPollingManager$persistRouteAvailabilityBannerInfo$1) != coroutineSingletons) {
                str2 = c;
                AnalyticsContract.DefaultImpls.a(geoSpatialLiveBusesDataPollingManager.g, "banner info received", "", vo1.s("versionCode", str2), null, false, 24);
                return unit;
            }
            return coroutineSingletons;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LatLng latLng, boolean z, ContinuationImpl continuationImpl) {
        GeoSpatialLiveBusesDataPollingManager$invoke$1 geoSpatialLiveBusesDataPollingManager$invoke$1;
        if (continuationImpl instanceof GeoSpatialLiveBusesDataPollingManager$invoke$1) {
            geoSpatialLiveBusesDataPollingManager$invoke$1 = (GeoSpatialLiveBusesDataPollingManager$invoke$1) continuationImpl;
            int i = geoSpatialLiveBusesDataPollingManager$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                geoSpatialLiveBusesDataPollingManager$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                geoSpatialLiveBusesDataPollingManager$invoke$1 = new GeoSpatialLiveBusesDataPollingManager$invoke$1(this, continuationImpl);
            }
        } else {
            geoSpatialLiveBusesDataPollingManager$invoke$1 = new GeoSpatialLiveBusesDataPollingManager$invoke$1(this, continuationImpl);
        }
        Object objA = geoSpatialLiveBusesDataPollingManager$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = geoSpatialLiveBusesDataPollingManager$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            geoSpatialLiveBusesDataPollingManager$invoke$1.L$0 = latLng;
            geoSpatialLiveBusesDataPollingManager$invoke$1.Z$0 = z;
            geoSpatialLiveBusesDataPollingManager$invoke$1.label = 1;
            objA = this.e.a(geoSpatialLiveBusesDataPollingManager$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = geoSpatialLiveBusesDataPollingManager$invoke$1.Z$0;
            latLng = (LatLng) geoSpatialLiveBusesDataPollingManager$invoke$1.L$0;
            ResultKt.b(objA);
        }
        return FlowKt.z(FlowKt.y(new GeoSpatialLiveBusesDataPollingManager$invoke$2(z, (GeoQueryCityConfigModel) objA, this, latLng, null)), this.b.getDefault());
    }
}
