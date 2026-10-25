package app.chalo.home.nearbytrips.domain;

import app.chalo.citydata.data.model.api.response.RouteApiStatusType;
import app.chalo.citydata.data.model.app.RouteIdWithVersion;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citydata.repository.SavedRoutesSortType;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryRequestDataHolder;
import app.chalo.stoptripdetails.data.model.api.TrimSummaryRequiredFields;
import app.chalo.stoptripdetails.data.model.api.TripSummary;
import app.chalo.stoptripdetails.data.model.api.TripSummaryRequestApiModel;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/FetchNearbyTripsUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchNearbyTripsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripDetailsRepository f3115a;
    public final ChaloLocationManager b;
    public final BasicInfoContract c;
    public final TimeUtilsContract d;
    public final ChaloConfigFeature e;
    public final GetDistinctIdUseCase f;
    public final LanguageFeature g;
    public final CityProvider h;
    public final CityDataRepository i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/FetchNearbyTripsUseCase$Companion;", "", "", "DEFAULT_NUM_OF_SUMMARIES", "I", "DEFAULT_NEARBY_STOPS_RADIUS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3116a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NearbyTripsApiType.values().length];
            try {
                iArr[NearbyTripsApiType.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NearbyTripsApiType.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NearbyTripsApiType.NEW_WITH_ROUTE_STATUS_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3116a = iArr;
            int[] iArr2 = new int[RouteApiStatusType.values().length];
            try {
                iArr2[RouteApiStatusType.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RouteApiStatusType.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RouteApiStatusType.NOT_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RouteApiStatusType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public FetchNearbyTripsUseCase(StopTripDetailsRepository stopTripDetailsRepository, ChaloLocationManager chaloLocationManager, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, ChaloConfigFeature chaloConfigFeature, GetDistinctIdUseCase getDistinctIdUseCase, LanguageFeature languageFeature, CityProvider cityProvider, CityDataRepository cityDataRepository) {
        this.f3115a = stopTripDetailsRepository;
        this.b = chaloLocationManager;
        this.c = basicInfoContract;
        this.d = timeUtilsContract;
        this.e = chaloConfigFeature;
        this.f = getDistinctIdUseCase;
        this.g = languageFeature;
        this.h = cityProvider;
        this.i = cityDataRepository;
    }

    public final String a() {
        TimeUtilsContract timeUtilsContract = this.d;
        return timeUtilsContract.y(timeUtilsContract.b(), Long.valueOf(this.c.j()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        FetchNearbyTripsUseCase$getDefaultRadius$1 fetchNearbyTripsUseCase$getDefaultRadius$1;
        Integer numQ0;
        if (continuationImpl instanceof FetchNearbyTripsUseCase$getDefaultRadius$1) {
            fetchNearbyTripsUseCase$getDefaultRadius$1 = (FetchNearbyTripsUseCase$getDefaultRadius$1) continuationImpl;
            int i = fetchNearbyTripsUseCase$getDefaultRadius$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNearbyTripsUseCase$getDefaultRadius$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNearbyTripsUseCase$getDefaultRadius$1 = new FetchNearbyTripsUseCase$getDefaultRadius$1(this, continuationImpl);
            }
        } else {
            fetchNearbyTripsUseCase$getDefaultRadius$1 = new FetchNearbyTripsUseCase$getDefaultRadius$1(this, continuationImpl);
        }
        Object objA = fetchNearbyTripsUseCase$getDefaultRadius$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyTripsUseCase$getDefaultRadius$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchNearbyTripsUseCase$getDefaultRadius$1.label = 1;
            objA = this.e.a("nearbyStopsRadius", fetchNearbyTripsUseCase$getDefaultRadius$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str = (String) objA;
        int iIntValue = 100;
        if (str.length() != 0 && (numQ0 = StringsKt.q0(str)) != null) {
            iIntValue = numQ0.intValue();
        }
        return new Integer(iIntValue);
    }

    public final String c() {
        String strName;
        String strA = this.f.a(false);
        String str = strA == null ? "" : strA;
        BasicInfoContract basicInfoContract = this.c;
        String deviceId = basicInfoContract.getDeviceId();
        Language language = (Language) this.g.getE().getValue();
        if (language == null || (strName = language.name()) == null) {
            strName = "ENGLISH";
        }
        String str2 = strName;
        int iH = basicInfoContract.h();
        String strB = CityProviderKt.b(this.h);
        JsonObject jsonObjectE = TrackingUtils.e(iH, basicInfoContract.getF(), str, deviceId, str2, strB == null ? "" : strB, basicInfoContract.getG());
        if (jsonObjectE != null) {
            return jsonObjectE.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(NearbyTripsApiType nearbyTripsApiType, ContinuationImpl continuationImpl) {
        FetchNearbyTripsUseCase$getSummaryApiRequest$1 fetchNearbyTripsUseCase$getSummaryApiRequest$1;
        if (continuationImpl instanceof FetchNearbyTripsUseCase$getSummaryApiRequest$1) {
            fetchNearbyTripsUseCase$getSummaryApiRequest$1 = (FetchNearbyTripsUseCase$getSummaryApiRequest$1) continuationImpl;
            int i = fetchNearbyTripsUseCase$getSummaryApiRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNearbyTripsUseCase$getSummaryApiRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNearbyTripsUseCase$getSummaryApiRequest$1 = new FetchNearbyTripsUseCase$getSummaryApiRequest$1(this, continuationImpl);
            }
        } else {
            fetchNearbyTripsUseCase$getSummaryApiRequest$1 = new FetchNearbyTripsUseCase$getSummaryApiRequest$1(this, continuationImpl);
        }
        Object objE = fetchNearbyTripsUseCase$getSummaryApiRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyTripsUseCase$getSummaryApiRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            int i3 = WhenMappings.f3116a[nearbyTripsApiType.ordinal()];
            if (i3 == 1 || i3 == 2) {
                TripSummaryRequestApiModel.INSTANCE.getClass();
                return TripSummaryRequestApiModel.b;
            }
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TripSummaryRequestApiModel.INSTANCE.getClass();
            SavedRoutesSortType savedRoutesSortType = SavedRoutesSortType.MOST_RECENT;
            fetchNearbyTripsUseCase$getSummaryApiRequest$1.label = 1;
            objE = this.i.e(savedRoutesSortType, fetchNearbyTripsUseCase$getSummaryApiRequest$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        TripSummary tripSummary = new TripSummary();
        List<RouteIdWithVersion> list = (List) objE;
        int iG = MapsKt.g(CollectionsKt.v(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (RouteIdWithVersion routeIdWithVersion : list) {
            Pair pair = new Pair(routeIdWithVersion.b, new Integer(routeIdWithVersion.f1711a));
            linkedHashMap.put(pair.d(), pair.e());
        }
        return new TripSummaryRequestApiModel(new TrimSummaryRequiredFields(linkedHashMap, tripSummary));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        FetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1 fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1;
        if (continuationImpl instanceof FetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1) {
            fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1 = (FetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1) continuationImpl;
            int i = fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1 = new FetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1(this, continuationImpl);
            }
        } else {
            fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1 = new FetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1(this, continuationImpl);
        }
        Object objA = fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1.label = 1;
            objA = this.b.a(fetchNearbyTripsUseCase$getUserCurrentLatLngIfAvailable$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        if (locationAppModelA != null) {
            return locationAppModelA.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b A[Catch: Exception -> 0x016e, NetworkSuccessResponseParseException -> 0x0176, ChaloLocalException -> 0x017e, LocationSummaryFetchFailedException -> 0x0186, TryCatch #2 {ChaloLocalException -> 0x017e, NetworkSuccessResponseParseException -> 0x0176, LocationSummaryFetchFailedException -> 0x0186, Exception -> 0x016e, blocks: (B:14:0x0031, B:51:0x0156, B:53:0x015e, B:55:0x0166, B:19:0x0058, B:44:0x012a, B:46:0x013b, B:48:0x0143, B:23:0x007c, B:40:0x0106, B:26:0x0096, B:35:0x00d3, B:36:0x00d9, B:30:0x00a5, B:31:0x00b3), top: B:65:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0143 A[Catch: Exception -> 0x016e, NetworkSuccessResponseParseException -> 0x0176, ChaloLocalException -> 0x017e, LocationSummaryFetchFailedException -> 0x0186, TryCatch #2 {ChaloLocalException -> 0x017e, NetworkSuccessResponseParseException -> 0x0176, LocationSummaryFetchFailedException -> 0x0186, Exception -> 0x016e, blocks: (B:14:0x0031, B:51:0x0156, B:53:0x015e, B:55:0x0166, B:19:0x0058, B:44:0x012a, B:46:0x013b, B:48:0x0143, B:23:0x007c, B:40:0x0106, B:26:0x0096, B:35:0x00d3, B:36:0x00d9, B:30:0x00a5, B:31:0x00b3), top: B:65:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
    
        if (r1 == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.location.LatLng r23, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r24, int r25, java.lang.Integer r26, app.chalo.home.nearbytrips.domain.NearbyTripsApiType r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.domain.FetchNearbyTripsUseCase.f(app.chalo.location.LatLng, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode, int, java.lang.Integer, app.chalo.home.nearbytrips.domain.NearbyTripsApiType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, LocationSummaryRequestDataHolder locationSummaryRequestDataHolder, NearbyTripsApiType nearbyTripsApiType, ContinuationImpl continuationImpl) {
        FetchNearbyTripsUseCase$makeCallAndProcessResponse$1 fetchNearbyTripsUseCase$makeCallAndProcessResponse$1;
        String str2;
        StopTripDetailsRepository stopTripDetailsRepository;
        if (continuationImpl instanceof FetchNearbyTripsUseCase$makeCallAndProcessResponse$1) {
            fetchNearbyTripsUseCase$makeCallAndProcessResponse$1 = (FetchNearbyTripsUseCase$makeCallAndProcessResponse$1) continuationImpl;
            int i = fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1 = new FetchNearbyTripsUseCase$makeCallAndProcessResponse$1(this, continuationImpl);
            }
        } else {
            fetchNearbyTripsUseCase$makeCallAndProcessResponse$1 = new FetchNearbyTripsUseCase$makeCallAndProcessResponse$1(this, continuationImpl);
        }
        Object objD = fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            int i3 = WhenMappings.f3116a[nearbyTripsApiType.ordinal()];
            StopTripDetailsRepository stopTripDetailsRepository2 = this.f3115a;
            if (i3 == 1) {
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label = 1;
                Object objB = stopTripDetailsRepository2.b(locationSummaryRequestDataHolder, str, fetchNearbyTripsUseCase$makeCallAndProcessResponse$1);
                if (objB != obj) {
                    return objB;
                }
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$0 = str;
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$1 = stopTripDetailsRepository2;
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$2 = locationSummaryRequestDataHolder;
                fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label = 2;
                objD = d(nearbyTripsApiType, fetchNearbyTripsUseCase$makeCallAndProcessResponse$1);
                if (objD != obj) {
                    str2 = str;
                    stopTripDetailsRepository = stopTripDetailsRepository2;
                }
            }
        }
        if (i2 == 1) {
            ResultKt.b(objD);
            return objD;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return objD;
        }
        locationSummaryRequestDataHolder = (LocationSummaryRequestDataHolder) fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$2;
        stopTripDetailsRepository = (StopTripDetailsRepository) fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$1;
        str2 = (String) fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$0;
        ResultKt.b(objD);
        fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$0 = null;
        fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$1 = null;
        fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.L$2 = null;
        fetchNearbyTripsUseCase$makeCallAndProcessResponse$1.label = 3;
        Object objC = stopTripDetailsRepository.c(locationSummaryRequestDataHolder, (TripSummaryRequestApiModel) objD, str2, fetchNearbyTripsUseCase$makeCallAndProcessResponse$1);
        return objC == obj ? obj : objC;
    }
}
