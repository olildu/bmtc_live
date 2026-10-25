package app.chalo.geoquery.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.RouteAvailabilityBannerStore;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.geoquery.data.exceptions.GeoQueryFetchFailedException;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestDisruptionInfo;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestMetaData;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestModel;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestNearbyBuses;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestReportProblem;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestRequiredFields;
import app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel;
import app.chalo.location.LatLng;
import app.chalo.models.ApiRequestEmptyObject;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/domain/FetchGeoSpatialDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchGeoSpatialDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripDetailsRepository f2821a;
    public final LanguageFeature b;
    public final CityProvider c;
    public final BasicInfoContract d;
    public final UserProfileDetailsProvider e;
    public final IReportProblemFeature f;
    public final CrashlyticsLogger g;
    public final RouteAvailabilityBannerStore h;
    public final AnalyticsContract i;
    public final ApplicationForegroundManager j;
    public final NetworkStateManager k;
    public boolean l = true;

    public FetchGeoSpatialDataUseCase(StopTripDetailsRepository stopTripDetailsRepository, LanguageFeature languageFeature, CityProvider cityProvider, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, IReportProblemFeature iReportProblemFeature, CrashlyticsLogger crashlyticsLogger, RouteAvailabilityBannerStore routeAvailabilityBannerStore, AnalyticsContract analyticsContract, ApplicationForegroundManager applicationForegroundManager, NetworkStateManager networkStateManager) {
        this.f2821a = stopTripDetailsRepository;
        this.b = languageFeature;
        this.c = cityProvider;
        this.d = basicInfoContract;
        this.e = userProfileDetailsProvider;
        this.f = iReportProblemFeature;
        this.g = crashlyticsLogger;
        this.h = routeAvailabilityBannerStore;
        this.i = analyticsContract;
        this.j = applicationForegroundManager;
        this.k = networkStateManager;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[PHI: r2 r11 r12
      0x0091: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:32:0x008e, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r11v7 java.lang.String) = (r11v4 java.lang.String), (r11v16 java.lang.String) binds: [B:32:0x008e, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:32:0x008e, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r8.a(r2, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(String str, LatLng latLng, double d, boolean z, boolean z2, boolean z3, boolean z4, ContinuationImpl continuationImpl) {
        FetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1 fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1;
        GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses;
        ApiRequestEmptyObject apiRequestEmptyObject;
        ApiRequestEmptyObject apiRequestEmptyObject2;
        boolean z5;
        ApiRequestEmptyObject apiRequestEmptyObject3;
        ApiRequestEmptyObject apiRequestEmptyObject4;
        String str2;
        GeoQueryApiRequestReportProblem geoQueryApiRequestReportProblem;
        Object objA;
        boolean z6;
        GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses2;
        ApiRequestEmptyObject apiRequestEmptyObject5;
        ApiRequestEmptyObject apiRequestEmptyObject6;
        GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses3;
        Object objC;
        ApiRequestEmptyObject apiRequestEmptyObject7;
        ApiRequestEmptyObject apiRequestEmptyObject8;
        GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses4;
        if (continuationImpl instanceof FetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1) {
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1 = (FetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1) continuationImpl;
            int i = fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1 = new FetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1(this, continuationImpl);
            }
        } else {
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1 = new FetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1(this, continuationImpl);
        }
        Object obj = fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label;
        GeoQueryApiRequestDisruptionInfo geoQueryApiRequestDisruptionInfo = null;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z7 = fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.Z$0;
                apiRequestEmptyObject2 = (ApiRequestEmptyObject) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$3;
                apiRequestEmptyObject = (ApiRequestEmptyObject) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$2;
                geoQueryApiRequestNearbyBuses2 = (GeoQueryApiRequestNearbyBuses) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$1;
                String str3 = (String) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$0;
                ResultKt.b(obj);
                z6 = z7;
                str = str3;
                objA = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                geoQueryApiRequestReportProblem = (GeoQueryApiRequestReportProblem) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$3;
                apiRequestEmptyObject7 = (ApiRequestEmptyObject) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$2;
                apiRequestEmptyObject8 = (ApiRequestEmptyObject) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$1;
                geoQueryApiRequestNearbyBuses4 = (GeoQueryApiRequestNearbyBuses) fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$0;
                ResultKt.b(obj);
            }
            geoQueryApiRequestDisruptionInfo = (GeoQueryApiRequestDisruptionInfo) obj;
            apiRequestEmptyObject5 = apiRequestEmptyObject7;
            apiRequestEmptyObject6 = apiRequestEmptyObject8;
            geoQueryApiRequestNearbyBuses3 = geoQueryApiRequestNearbyBuses4;
            return new GeoQueryApiRequestRequiredFields(geoQueryApiRequestNearbyBuses3, apiRequestEmptyObject6, apiRequestEmptyObject5, geoQueryApiRequestReportProblem, geoQueryApiRequestDisruptionInfo);
        }
        ResultKt.b(obj);
        geoQueryApiRequestNearbyBuses = new GeoQueryApiRequestNearbyBuses(String.valueOf(latLng.f5134a), String.valueOf(latLng.b), String.valueOf(d));
        apiRequestEmptyObject = z3 ? new ApiRequestEmptyObject() : null;
        apiRequestEmptyObject2 = z4 ? new ApiRequestEmptyObject() : null;
        if (!z) {
            z5 = z2;
            apiRequestEmptyObject3 = apiRequestEmptyObject;
            apiRequestEmptyObject4 = apiRequestEmptyObject2;
            str2 = str;
            geoQueryApiRequestReportProblem = null;
            if (z5) {
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$0 = geoQueryApiRequestNearbyBuses;
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$1 = apiRequestEmptyObject3;
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$2 = apiRequestEmptyObject4;
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$3 = geoQueryApiRequestReportProblem;
                fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label = 2;
                objC = c(str2, fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1);
                if (objC != obj2) {
                    GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses5 = geoQueryApiRequestNearbyBuses;
                    obj = objC;
                    apiRequestEmptyObject7 = apiRequestEmptyObject4;
                    apiRequestEmptyObject8 = apiRequestEmptyObject3;
                    geoQueryApiRequestNearbyBuses4 = geoQueryApiRequestNearbyBuses5;
                    geoQueryApiRequestDisruptionInfo = (GeoQueryApiRequestDisruptionInfo) obj;
                    apiRequestEmptyObject5 = apiRequestEmptyObject7;
                    apiRequestEmptyObject6 = apiRequestEmptyObject8;
                    geoQueryApiRequestNearbyBuses3 = geoQueryApiRequestNearbyBuses4;
                }
            } else {
                apiRequestEmptyObject5 = apiRequestEmptyObject4;
                apiRequestEmptyObject6 = apiRequestEmptyObject3;
                geoQueryApiRequestNearbyBuses3 = geoQueryApiRequestNearbyBuses;
            }
            return new GeoQueryApiRequestRequiredFields(geoQueryApiRequestNearbyBuses3, apiRequestEmptyObject6, apiRequestEmptyObject5, geoQueryApiRequestReportProblem, geoQueryApiRequestDisruptionInfo);
        }
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$0 = str;
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$1 = geoQueryApiRequestNearbyBuses;
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$2 = apiRequestEmptyObject;
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$3 = apiRequestEmptyObject2;
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.Z$0 = z2;
        fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label = 1;
        objA = a(str, fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1);
        if (objA != obj2) {
            z6 = z2;
            geoQueryApiRequestNearbyBuses2 = geoQueryApiRequestNearbyBuses;
        }
        return obj2;
        ApiRequestEmptyObject apiRequestEmptyObject9 = apiRequestEmptyObject2;
        str2 = str;
        geoQueryApiRequestReportProblem = (GeoQueryApiRequestReportProblem) objA;
        z5 = z6;
        geoQueryApiRequestNearbyBuses = geoQueryApiRequestNearbyBuses2;
        apiRequestEmptyObject3 = apiRequestEmptyObject;
        apiRequestEmptyObject4 = apiRequestEmptyObject9;
        if (z5) {
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$0 = geoQueryApiRequestNearbyBuses;
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$1 = apiRequestEmptyObject3;
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$2 = apiRequestEmptyObject4;
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.L$3 = geoQueryApiRequestReportProblem;
            fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1.label = 2;
            objC = c(str2, fetchGeoSpatialDataUseCase$getRequiredFieldsRequest$1);
            if (objC != obj2) {
                GeoQueryApiRequestNearbyBuses geoQueryApiRequestNearbyBuses6 = geoQueryApiRequestNearbyBuses;
                obj = objC;
                apiRequestEmptyObject7 = apiRequestEmptyObject4;
                apiRequestEmptyObject8 = apiRequestEmptyObject3;
                geoQueryApiRequestNearbyBuses4 = geoQueryApiRequestNearbyBuses6;
                geoQueryApiRequestDisruptionInfo = (GeoQueryApiRequestDisruptionInfo) obj;
                apiRequestEmptyObject5 = apiRequestEmptyObject7;
                apiRequestEmptyObject6 = apiRequestEmptyObject8;
                geoQueryApiRequestNearbyBuses3 = geoQueryApiRequestNearbyBuses4;
            }
            return obj2;
        }
        apiRequestEmptyObject5 = apiRequestEmptyObject4;
        apiRequestEmptyObject6 = apiRequestEmptyObject3;
        geoQueryApiRequestNearbyBuses3 = geoQueryApiRequestNearbyBuses;
        return new GeoQueryApiRequestRequiredFields(geoQueryApiRequestNearbyBuses3, apiRequestEmptyObject6, apiRequestEmptyObject5, geoQueryApiRequestReportProblem, geoQueryApiRequestDisruptionInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        FetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1 fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1;
        if (continuationImpl instanceof FetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1) {
            fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1 = (FetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1) continuationImpl;
            int i = fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1 = new FetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1(this, continuationImpl);
            }
        } else {
            fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1 = new FetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1(this, continuationImpl);
        }
        Object objB = fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1.label = 1;
            objB = this.h.b(lowerCase, fetchGeoSpatialDataUseCase$getRouteDisruptionBannerDataRequest$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        String str2 = (String) objB;
        if (str2 != null) {
            return new GeoQueryApiRequestDisruptionInfo(str2);
        }
        GeoQueryApiRequestDisruptionInfo.INSTANCE.getClass();
        return new GeoQueryApiRequestDisruptionInfo("noVersionCached");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151 A[Catch: Exception -> 0x0061, ChaloLocalException -> 0x0064, NetworkSuccessResponseParseException -> 0x0067, GeoQueryFetchFailedException -> 0x006a, PHI: r0 r3 r14 r15 r17
      0x0151: PHI (r0v25 java.lang.Object) = (r0v24 java.lang.Object), (r0v1 java.lang.Object) binds: [B:54:0x014e, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r3v10 long) = (r3v9 long), (r3v17 long) binds: [B:54:0x014e, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r14v4 int A[IMMUTABLE_TYPE]) = (r14v3 int), (r14v9 int) binds: [B:54:0x014e, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r15v4 app.chalo.contract.BasicInfoContract) = (r15v3 app.chalo.contract.BasicInfoContract), (r15v7 app.chalo.contract.BasicInfoContract) binds: [B:54:0x014e, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r17v3 char) = (r17v2 char), (r17v7 char) binds: [B:54:0x014e, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {GeoQueryFetchFailedException -> 0x006a, ChaloLocalException -> 0x0064, NetworkSuccessResponseParseException -> 0x0067, Exception -> 0x0061, blocks: (B:16:0x005a, B:62:0x0185, B:63:0x01cc, B:29:0x0077, B:56:0x0151, B:58:0x0157, B:32:0x0089, B:53:0x012d, B:49:0x011f), top: B:76:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0157 A[Catch: Exception -> 0x0061, ChaloLocalException -> 0x0064, NetworkSuccessResponseParseException -> 0x0067, GeoQueryFetchFailedException -> 0x006a, TryCatch #2 {GeoQueryFetchFailedException -> 0x006a, ChaloLocalException -> 0x0064, NetworkSuccessResponseParseException -> 0x0067, Exception -> 0x0061, blocks: (B:16:0x005a, B:62:0x0185, B:63:0x01cc, B:29:0x0077, B:56:0x0151, B:58:0x0157, B:32:0x0089, B:53:0x012d, B:49:0x011f), top: B:76:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(LatLng latLng, double d, boolean z, boolean z2, boolean z3, boolean z4, ContinuationImpl continuationImpl) {
        FetchGeoSpatialDataUseCase$invoke$1 fetchGeoSpatialDataUseCase$invoke$1;
        String locale;
        int i;
        CityAppModel cityAppModel;
        GeoQueryApiRequestMetaData geoQueryApiRequestMetaData;
        GeoQueryApiRequestModel geoQueryApiRequestModel;
        long jLongValue;
        GeoQueryResponseAppModel geoQueryResponseAppModel;
        int i2;
        AnalyticsContract analyticsContract;
        Source source;
        Pair[] pairArr;
        String str;
        Object objC;
        GeoQueryResponseAppModel geoQueryResponseAppModel2;
        String str2;
        Pair[] pairArr2;
        if (continuationImpl instanceof FetchGeoSpatialDataUseCase$invoke$1) {
            fetchGeoSpatialDataUseCase$invoke$1 = (FetchGeoSpatialDataUseCase$invoke$1) continuationImpl;
            int i3 = fetchGeoSpatialDataUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fetchGeoSpatialDataUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                fetchGeoSpatialDataUseCase$invoke$1 = new FetchGeoSpatialDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchGeoSpatialDataUseCase$invoke$1 = new FetchGeoSpatialDataUseCase$invoke$1(this, continuationImpl);
        }
        FetchGeoSpatialDataUseCase$invoke$1 fetchGeoSpatialDataUseCase$invoke$2 = fetchGeoSpatialDataUseCase$invoke$1;
        Object objC2 = fetchGeoSpatialDataUseCase$invoke$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = fetchGeoSpatialDataUseCase$invoke$2.label;
        CrashlyticsLogger crashlyticsLogger = this.g;
        BasicInfoContract basicInfoContract = this.d;
        char c = 1;
        try {
            if (i4 == 0) {
                ResultKt.b(objC2);
                CityAppModel cityAppModel2 = (CityAppModel) this.c.getE().getValue();
                if (cityAppModel2 == null) {
                    return new ChaloUseCaseResult.Failure(new Pair(GeoQueryFetchFailedReason.CITY_NOT_AVAILABLE, null));
                }
                Language language = (Language) this.b.getE().getValue();
                if (language == null || (locale = language.getLocale()) == null) {
                    return new ChaloUseCaseResult.Failure(new Pair(GeoQueryFetchFailedReason.LOCALE_NOT_AVAILABLE, null));
                }
                GeoQueryApiRequestMetaData geoQueryApiRequestMetaData2 = new GeoQueryApiRequestMetaData(locale, basicInfoContract.h(), basicInfoContract.getDeviceId(), this.e.m());
                String lowerCase = cityAppModel2.f8854a.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                fetchGeoSpatialDataUseCase$invoke$2.L$0 = cityAppModel2;
                fetchGeoSpatialDataUseCase$invoke$2.L$1 = geoQueryApiRequestMetaData2;
                fetchGeoSpatialDataUseCase$invoke$2.label = 1;
                i = 2;
                Object objB = b(lowerCase, latLng, d, z, z2, z3, z4, fetchGeoSpatialDataUseCase$invoke$2);
                if (objB != obj) {
                    cityAppModel = cityAppModel2;
                    objC2 = objB;
                    geoQueryApiRequestMetaData = geoQueryApiRequestMetaData2;
                }
                return obj;
            }
            if (i4 == 1) {
                geoQueryApiRequestMetaData = (GeoQueryApiRequestMetaData) fetchGeoSpatialDataUseCase$invoke$2.L$1;
                cityAppModel = (CityAppModel) fetchGeoSpatialDataUseCase$invoke$2.L$0;
                ResultKt.b(objC2);
                i = 2;
            } else {
                if (i4 == 2) {
                    geoQueryApiRequestModel = (GeoQueryApiRequestModel) fetchGeoSpatialDataUseCase$invoke$2.L$1;
                    cityAppModel = (CityAppModel) fetchGeoSpatialDataUseCase$invoke$2.L$0;
                    ResultKt.b(objC2);
                    basicInfoContract = basicInfoContract;
                    i = 2;
                    c = 1;
                    jLongValue = ((Number) objC2).longValue();
                    StopTripDetailsRepository stopTripDetailsRepository = this.f2821a;
                    String lowerCase2 = cityAppModel.f8854a.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    fetchGeoSpatialDataUseCase$invoke$2.L$0 = null;
                    fetchGeoSpatialDataUseCase$invoke$2.L$1 = null;
                    fetchGeoSpatialDataUseCase$invoke$2.J$0 = jLongValue;
                    fetchGeoSpatialDataUseCase$invoke$2.label = 3;
                    objC2 = stopTripDetailsRepository.a(geoQueryApiRequestModel, lowerCase2, fetchGeoSpatialDataUseCase$invoke$2);
                    if (objC2 == obj) {
                        geoQueryResponseAppModel = (GeoQueryResponseAppModel) objC2;
                        if (this.l) {
                            i2 = 0;
                            this.l = false;
                            analyticsContract = this.i;
                            source = Source.UNKNOWN;
                            pairArr = new Pair[i];
                            str = "response time";
                            fetchGeoSpatialDataUseCase$invoke$2.L$0 = geoQueryResponseAppModel;
                            fetchGeoSpatialDataUseCase$invoke$2.L$1 = pairArr;
                            fetchGeoSpatialDataUseCase$invoke$2.L$2 = analyticsContract;
                            fetchGeoSpatialDataUseCase$invoke$2.L$3 = "geo spatial request response time";
                            fetchGeoSpatialDataUseCase$invoke$2.L$4 = source;
                            fetchGeoSpatialDataUseCase$invoke$2.L$5 = pairArr;
                            fetchGeoSpatialDataUseCase$invoke$2.L$6 = "response time";
                            fetchGeoSpatialDataUseCase$invoke$2.J$0 = jLongValue;
                            fetchGeoSpatialDataUseCase$invoke$2.I$0 = 0;
                            fetchGeoSpatialDataUseCase$invoke$2.label = 4;
                            objC = basicInfoContract.c(fetchGeoSpatialDataUseCase$invoke$2);
                            if (objC != obj) {
                                geoQueryResponseAppModel2 = geoQueryResponseAppModel;
                                str2 = "geo spatial request response time";
                                objC2 = objC;
                                pairArr2 = pairArr;
                            }
                        }
                        return new ChaloUseCaseResult.Success(geoQueryResponseAppModel);
                    }
                    return obj;
                }
                if (i4 == 3) {
                    long j = fetchGeoSpatialDataUseCase$invoke$2.J$0;
                    ResultKt.b(objC2);
                    basicInfoContract = basicInfoContract;
                    i = 2;
                    c = 1;
                    jLongValue = j;
                    geoQueryResponseAppModel = (GeoQueryResponseAppModel) objC2;
                    if (this.l) {
                        i2 = 0;
                        this.l = false;
                        analyticsContract = this.i;
                        source = Source.UNKNOWN;
                        pairArr = new Pair[i];
                        str = "response time";
                        fetchGeoSpatialDataUseCase$invoke$2.L$0 = geoQueryResponseAppModel;
                        fetchGeoSpatialDataUseCase$invoke$2.L$1 = pairArr;
                        fetchGeoSpatialDataUseCase$invoke$2.L$2 = analyticsContract;
                        fetchGeoSpatialDataUseCase$invoke$2.L$3 = "geo spatial request response time";
                        fetchGeoSpatialDataUseCase$invoke$2.L$4 = source;
                        fetchGeoSpatialDataUseCase$invoke$2.L$5 = pairArr;
                        fetchGeoSpatialDataUseCase$invoke$2.L$6 = "response time";
                        fetchGeoSpatialDataUseCase$invoke$2.J$0 = jLongValue;
                        fetchGeoSpatialDataUseCase$invoke$2.I$0 = 0;
                        fetchGeoSpatialDataUseCase$invoke$2.label = 4;
                        objC = basicInfoContract.c(fetchGeoSpatialDataUseCase$invoke$2);
                        if (objC != obj) {
                            geoQueryResponseAppModel2 = geoQueryResponseAppModel;
                            str2 = "geo spatial request response time";
                            objC2 = objC;
                            pairArr2 = pairArr;
                        }
                        return obj;
                    }
                    return new ChaloUseCaseResult.Success(geoQueryResponseAppModel);
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = fetchGeoSpatialDataUseCase$invoke$2.I$0;
                jLongValue = fetchGeoSpatialDataUseCase$invoke$2.J$0;
                str = (String) fetchGeoSpatialDataUseCase$invoke$2.L$6;
                pairArr = (Pair[]) fetchGeoSpatialDataUseCase$invoke$2.L$5;
                source = (Source) fetchGeoSpatialDataUseCase$invoke$2.L$4;
                str2 = (String) fetchGeoSpatialDataUseCase$invoke$2.L$3;
                analyticsContract = (AnalyticsContract) fetchGeoSpatialDataUseCase$invoke$2.L$2;
                pairArr2 = (Pair[]) fetchGeoSpatialDataUseCase$invoke$2.L$1;
                geoQueryResponseAppModel2 = (GeoQueryResponseAppModel) fetchGeoSpatialDataUseCase$invoke$2.L$0;
                ResultKt.b(objC2);
                c = 1;
            }
            pairArr[i2] = new Pair(str, new Integer(MathKt.e((((Number) objC2).longValue() - jLongValue) / 100.0d) * 100));
            pairArr2[c] = new Pair("network type", this.k.a().name());
            AnalyticsContractImplKt.b(analyticsContract, str2, source, MapsKt.i(pairArr2), false, 24);
            geoQueryResponseAppModel = geoQueryResponseAppModel2;
            return new ChaloUseCaseResult.Success(geoQueryResponseAppModel);
            GeoQueryApiRequestModel geoQueryApiRequestModel2 = new GeoQueryApiRequestModel(geoQueryApiRequestMetaData, (GeoQueryApiRequestRequiredFields) objC2);
            fetchGeoSpatialDataUseCase$invoke$2.L$0 = cityAppModel;
            fetchGeoSpatialDataUseCase$invoke$2.L$1 = geoQueryApiRequestModel2;
            fetchGeoSpatialDataUseCase$invoke$2.label = i;
            objC2 = basicInfoContract.c(fetchGeoSpatialDataUseCase$invoke$2);
            if (objC2 != obj) {
                geoQueryApiRequestModel = geoQueryApiRequestModel2;
                jLongValue = ((Number) objC2).longValue();
                StopTripDetailsRepository stopTripDetailsRepository2 = this.f2821a;
                String lowerCase3 = cityAppModel.f8854a.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase3, "toLowerCase(...)");
                fetchGeoSpatialDataUseCase$invoke$2.L$0 = null;
                fetchGeoSpatialDataUseCase$invoke$2.L$1 = null;
                fetchGeoSpatialDataUseCase$invoke$2.J$0 = jLongValue;
                fetchGeoSpatialDataUseCase$invoke$2.label = 3;
                objC2 = stopTripDetailsRepository2.a(geoQueryApiRequestModel, lowerCase3, fetchGeoSpatialDataUseCase$invoke$2);
                if (objC2 == obj) {
                    geoQueryResponseAppModel = (GeoQueryResponseAppModel) objC2;
                    if (this.l) {
                        i2 = 0;
                        this.l = false;
                        analyticsContract = this.i;
                        source = Source.UNKNOWN;
                        pairArr = new Pair[i];
                        str = "response time";
                        fetchGeoSpatialDataUseCase$invoke$2.L$0 = geoQueryResponseAppModel;
                        fetchGeoSpatialDataUseCase$invoke$2.L$1 = pairArr;
                        fetchGeoSpatialDataUseCase$invoke$2.L$2 = analyticsContract;
                        fetchGeoSpatialDataUseCase$invoke$2.L$3 = "geo spatial request response time";
                        fetchGeoSpatialDataUseCase$invoke$2.L$4 = source;
                        fetchGeoSpatialDataUseCase$invoke$2.L$5 = pairArr;
                        fetchGeoSpatialDataUseCase$invoke$2.L$6 = "response time";
                        fetchGeoSpatialDataUseCase$invoke$2.J$0 = jLongValue;
                        fetchGeoSpatialDataUseCase$invoke$2.I$0 = 0;
                        fetchGeoSpatialDataUseCase$invoke$2.label = 4;
                        objC = basicInfoContract.c(fetchGeoSpatialDataUseCase$invoke$2);
                        if (objC != obj) {
                            geoQueryResponseAppModel2 = geoQueryResponseAppModel;
                            str2 = "geo spatial request response time";
                            objC2 = objC;
                            pairArr2 = pairArr;
                            pairArr[i2] = new Pair(str, new Integer(MathKt.e((((Number) objC2).longValue() - jLongValue) / 100.0d) * 100));
                            pairArr2[c] = new Pair("network type", this.k.a().name());
                            AnalyticsContractImplKt.b(analyticsContract, str2, source, MapsKt.i(pairArr2), false, 24);
                            geoQueryResponseAppModel = geoQueryResponseAppModel2;
                        }
                    }
                    return new ChaloUseCaseResult.Success(geoQueryResponseAppModel);
                }
            }
            return obj;
        } catch (GeoQueryFetchFailedException e) {
            GeoQueryFetchFailedReason geoQueryFetchFailedReason = GeoQueryFetchFailedReason.SERVER_ERROR;
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new Pair(geoQueryFetchFailedReason, errorResponse != null ? errorResponse.b : null));
        } catch (ChaloLocalException e2) {
            crashlyticsLogger.i(e2);
            return new ChaloUseCaseResult.Failure(new Pair(GeoQueryFetchFailedReason.LOCAL_ERROR, e2.getMessage()));
        } catch (NetworkSuccessResponseParseException e3) {
            return new ChaloUseCaseResult.Failure(new Pair(GeoQueryFetchFailedReason.PARSING_ERROR, e3.getMessage()));
        } catch (Exception e4) {
            crashlyticsLogger.i(e4);
            return new ChaloUseCaseResult.Failure(new Pair(GeoQueryFetchFailedReason.UNKNOWN_ERROR, e4.getMessage()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        FetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1 fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1;
        String str;
        Map map;
        Map map2;
        if (continuationImpl instanceof FetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1) {
            fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1 = (FetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1) continuationImpl;
            int i = fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1 = new FetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1(this, continuationImpl);
            }
        } else {
            fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1 = new FetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1(this, continuationImpl);
        }
        Object obj = fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.j.getF2712a()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$0 = linkedHashMap;
                str = "Report Problem feature event description ";
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$1 = "Report Problem feature event description ";
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$2 = linkedHashMap;
                fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.label = 1;
                Object objC = this.d.c(fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map = linkedHashMap;
                map2 = map;
                obj = objC;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = (Map) fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$2;
        str = (String) fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$1;
        Map map3 = (Map) fetchGeoSpatialDataUseCase$raiseReportProblemAnalyticsEvent$1.L$0;
        ResultKt.b(obj);
        map2 = map3;
        map.put(str, "time stamp " + obj);
        AnalyticsContract.DefaultImpls.a(this.i, "Report Problem request sent", "ReportProblemFeature", map2, null, false, 24);
        return Unit.f17538a;
    }
}
