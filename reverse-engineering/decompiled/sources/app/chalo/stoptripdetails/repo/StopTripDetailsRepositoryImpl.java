package app.chalo.stoptripdetails.repo;

import app.chalo.citydata.data.model.api.response.RouteApiStatusType;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.geoquery.data.mappers.GeoQueryRemoteToAppModelMappersKt;
import app.chalo.geoquery.data.models.api.GeoQueryApiRequestModel;
import app.chalo.geoquery.data.models.api.GeoQueryApiResponseModel;
import app.chalo.stoptripdetails.data.exceptions.LocationSummaryFetchFailedException;
import app.chalo.stoptripdetails.data.mappers.LocationSummaryApiToAppModelsMappersKt;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryRequestDataHolder;
import app.chalo.stoptripdetails.data.model.api.RouteStatusApiModel;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryResponseAppModel;
import app.chalo.stoptripdetails.data.model.app.RouteStatusResponseAppModel;
import app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/repo/StopTripDetailsRepositoryImpl;", "Lapp/chalo/stoptripdetails/repo/StopTripDetailsRepository;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsRepositoryImpl implements StopTripDetailsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripDetailsRemoteDataSource f9509a;
    public final BasicInfoContract b;
    public final CityDataRepository c;
    public final CrashlyticsLogger d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9510a;

        static {
            int[] iArr = new int[RouteApiStatusType.values().length];
            try {
                iArr[RouteApiStatusType.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteApiStatusType.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteApiStatusType.NOT_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteApiStatusType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9510a = iArr;
        }
    }

    public StopTripDetailsRepositoryImpl(StopTripDetailsRemoteDataSource stopTripDetailsRemoteDataSource, BasicInfoContract basicInfoContract, CityDataRepository cityDataRepository, CrashlyticsLogger crashlyticsLogger) {
        this.f9509a = stopTripDetailsRemoteDataSource;
        this.b = basicInfoContract;
        this.c = cityDataRepository;
        this.d = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.stoptripdetails.repo.StopTripDetailsRepository
    public final Object a(GeoQueryApiRequestModel geoQueryApiRequestModel, String str, ContinuationImpl continuationImpl) {
        StopTripDetailsRepositoryImpl$fetchGeoSpatialData$1 stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1;
        if (continuationImpl instanceof StopTripDetailsRepositoryImpl$fetchGeoSpatialData$1) {
            stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1 = (StopTripDetailsRepositoryImpl$fetchGeoSpatialData$1) continuationImpl;
            int i = stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1 = new StopTripDetailsRepositoryImpl$fetchGeoSpatialData$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1 = new StopTripDetailsRepositoryImpl$fetchGeoSpatialData$1(this, continuationImpl);
        }
        Object objA = stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.label = 1;
            objA = this.f9509a.a(geoQueryApiRequestModel, str, stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1);
            if (objA != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        ResultKt.b(objA);
        stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1.label = 2;
        Object objB = GeoQueryRemoteToAppModelMappersKt.b((GeoQueryApiResponseModel) objA, this.d, stopTripDetailsRepositoryImpl$fetchGeoSpatialData$1);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.stoptripdetails.repo.StopTripDetailsRepository
    public final Object b(LocationSummaryRequestDataHolder locationSummaryRequestDataHolder, String str, ContinuationImpl continuationImpl) throws LocationSummaryFetchFailedException {
        StopTripDetailsRepositoryImpl$fetchLocationSummary$1 stopTripDetailsRepositoryImpl$fetchLocationSummary$1;
        if (continuationImpl instanceof StopTripDetailsRepositoryImpl$fetchLocationSummary$1) {
            stopTripDetailsRepositoryImpl$fetchLocationSummary$1 = (StopTripDetailsRepositoryImpl$fetchLocationSummary$1) continuationImpl;
            int i = stopTripDetailsRepositoryImpl$fetchLocationSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRepositoryImpl$fetchLocationSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRepositoryImpl$fetchLocationSummary$1 = new StopTripDetailsRepositoryImpl$fetchLocationSummary$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRepositoryImpl$fetchLocationSummary$1 = new StopTripDetailsRepositoryImpl$fetchLocationSummary$1(this, continuationImpl);
        }
        Object objB = stopTripDetailsRepositoryImpl$fetchLocationSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRepositoryImpl$fetchLocationSummary$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            stopTripDetailsRepositoryImpl$fetchLocationSummary$1.label = 1;
            objB = this.f9509a.b(locationSummaryRequestDataHolder, str, stopTripDetailsRepositoryImpl$fetchLocationSummary$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        LocationSummaryResponseAppModel locationSummaryResponseAppModelA = LocationSummaryApiToAppModelsMappersKt.a((LocationSummaryApiResponseModel) objB);
        if (locationSummaryResponseAppModelA != null) {
            return locationSummaryResponseAppModelA;
        }
        throw new LocationSummaryFetchFailedException(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (e(r7, r0) == r1) goto L23;
     */
    @Override // app.chalo.stoptripdetails.repo.StopTripDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.stoptripdetails.data.model.api.LocationSummaryRequestDataHolder r6, app.chalo.stoptripdetails.data.model.api.TripSummaryRequestApiModel r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws app.chalo.stoptripdetails.data.exceptions.LocationSummaryFetchFailedException {
        /*
            r5 = this;
            boolean r0 = r9 instanceof app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl$fetchLocationSummaryAndRouteStatus$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl$fetchLocationSummaryAndRouteStatus$1 r0 = (app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl$fetchLocationSummaryAndRouteStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl$fetchLocationSummaryAndRouteStatus$1 r0 = new app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl$fetchLocationSummaryAndRouteStatus$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel r6 = (app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel) r6
            kotlin.ResultKt.b(r9)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r9)
            goto L48
        L3a:
            kotlin.ResultKt.b(r9)
            r0.label = r4
            app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource r9 = r5.f9509a
            java.lang.Object r9 = r9.c(r6, r7, r8, r0)
            if (r9 != r1) goto L48
            goto L59
        L48:
            r6 = r9
            app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel r6 = (app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel) r6
            java.util.List r7 = r6.f9473a
            if (r7 == 0) goto L5a
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.e(r7, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            app.chalo.stoptripdetails.data.model.api.LocationSummaryApiResponseModel r6 = r6.b
            if (r6 == 0) goto L65
            app.chalo.stoptripdetails.data.model.app.LocationSummaryResponseAppModel r6 = app.chalo.stoptripdetails.data.mappers.LocationSummaryApiToAppModelsMappersKt.a(r6)
            if (r6 == 0) goto L65
            return r6
        L65:
            app.chalo.stoptripdetails.data.exceptions.LocationSummaryFetchFailedException r6 = new app.chalo.stoptripdetails.data.exceptions.LocationSummaryFetchFailedException
            r7 = 0
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl.c(app.chalo.stoptripdetails.data.model.api.LocationSummaryRequestDataHolder, app.chalo.stoptripdetails.data.model.api.TripSummaryRequestApiModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.stoptripdetails.repo.StopTripDetailsRepository
    public final Object d(LinkedHashMap linkedHashMap, String str, Continuation continuation) {
        return this.f9509a.d(linkedHashMap, str, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        StopTripDetailsRepositoryImpl$processRouteStatus$1 stopTripDetailsRepositoryImpl$processRouteStatus$1;
        Iterator it;
        RouteApiStatusType routeApiStatusTypeA;
        if (continuationImpl instanceof StopTripDetailsRepositoryImpl$processRouteStatus$1) {
            stopTripDetailsRepositoryImpl$processRouteStatus$1 = (StopTripDetailsRepositoryImpl$processRouteStatus$1) continuationImpl;
            int i = stopTripDetailsRepositoryImpl$processRouteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRepositoryImpl$processRouteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRepositoryImpl$processRouteStatus$1 = new StopTripDetailsRepositoryImpl$processRouteStatus$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRepositoryImpl$processRouteStatus$1 = new StopTripDetailsRepositoryImpl$processRouteStatus$1(this, continuationImpl);
        }
        Object obj = stopTripDetailsRepositoryImpl$processRouteStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRepositoryImpl$processRouteStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) stopTripDetailsRepositoryImpl$processRouteStatus$1.L$0;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            RouteStatusApiModel routeStatusApiModel = (RouteStatusApiModel) it.next();
            Intrinsics.i(routeStatusApiModel, "<this>");
            String str = routeStatusApiModel.f9480a;
            String str2 = routeStatusApiModel.b;
            if (str2 != null) {
                RouteApiStatusType.INSTANCE.getClass();
                routeApiStatusTypeA = RouteApiStatusType.Companion.a(str2);
                if (routeApiStatusTypeA == null) {
                    routeApiStatusTypeA = RouteApiStatusType.UNKNOWN;
                }
            } else {
                routeApiStatusTypeA = RouteApiStatusType.UNKNOWN;
            }
            new RouteStatusResponseAppModel(str, routeApiStatusTypeA, routeStatusApiModel.c);
            int i3 = WhenMappings.f9510a[routeApiStatusTypeA.ordinal()];
            if (i3 == 1 || i3 == 2) {
                stopTripDetailsRepositoryImpl$processRouteStatus$1.L$0 = it;
                stopTripDetailsRepositoryImpl$processRouteStatus$1.label = 1;
                if (this.c.m(str, stopTripDetailsRepositoryImpl$processRouteStatus$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f17538a;
    }
}
