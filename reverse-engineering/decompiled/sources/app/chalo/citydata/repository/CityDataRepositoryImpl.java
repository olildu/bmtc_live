package app.chalo.citydata.repository;

import androidx.exifinterface.media.ExifInterface;
import app.chalo.citydata.data.error.InvalidCityIdFromLatLngApiResponseException;
import app.chalo.citydata.data.error.InvalidRoutesDataApiResponseException;
import app.chalo.citydata.data.model.api.request.NearbyStopsToLocationRequestApiModel;
import app.chalo.citydata.data.model.api.request.RouteDetailsRequestOldApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestDataApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestLocationApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestMetaQueryParameterApiModel;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestBody;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestModel;
import app.chalo.citydata.data.model.api.request.StopImagesRequestApiModel;
import app.chalo.citydata.data.model.api.request.StopImagesRequestBody;
import app.chalo.citydata.data.model.api.response.CityIdAndDisplayNameApiModel;
import app.chalo.citydata.data.model.api.response.CityIdAndNameFromLatLngResponseApiModel;
import app.chalo.citydata.data.model.api.response.NearbyStopsToLocationResponseApiModel;
import app.chalo.citydata.data.model.api.response.RouteApiModel;
import app.chalo.citydata.data.model.api.response.RouteApiStatusType;
import app.chalo.citydata.data.model.api.response.RouteDetailOldApiModel;
import app.chalo.citydata.data.model.api.response.RouteDetailsResponseOldApiModel;
import app.chalo.citydata.data.model.api.response.RouteDetailsResponseOldApiModelKt;
import app.chalo.citydata.data.model.api.response.RouteDetailsTimeTableWithFrequencyOldApiModel;
import app.chalo.citydata.data.model.api.response.RouteLiveDataApiModel;
import app.chalo.citydata.data.model.api.response.RouteShortTripApiModel;
import app.chalo.citydata.data.model.api.response.RouteStaticDataApiModel;
import app.chalo.citydata.data.model.api.response.RouteTimeTableApiModel;
import app.chalo.citydata.data.model.api.response.RouteTimeTableOldApiModel;
import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModel;
import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt;
import app.chalo.citydata.data.model.api.response.ShortTripOldApiModel;
import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.api.response.StopDetailsLocationApiModel;
import app.chalo.citydata.data.model.api.response.StopDetailsResponseApiModel;
import app.chalo.citydata.data.model.api.response.StopImagesResponseApiModel;
import app.chalo.citydata.data.model.api.response.TrafficSignalApiModel;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteIdWithVersion;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.ShortTripTimingAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.data.model.app.TrafficSignalAppModel;
import app.chalo.citydata.data.model.app.request.GetRouteDetailsMetaQueryParameterApiModel;
import app.chalo.citydata.data.model.app.request.NearbyStopsToLocationRequestAppModel;
import app.chalo.citydata.data.model.app.request.RouteDetailsRequestOldAppModel;
import app.chalo.citydata.data.model.app.request.RoutesDataRequestAppModel;
import app.chalo.citydata.data.model.app.request.StopDetailsRequestAppModel;
import app.chalo.citydata.data.model.app.request.StopImagesRequestAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.citydata.data.model.app.response.RouteDataResponseAppModel;
import app.chalo.citydata.data.model.app.response.RouteResponseLiveDataAppModel;
import app.chalo.citydata.data.model.app.response.RoutesDataResponseAppModel;
import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.citydata.data.model.app.response.StopImageAppModel;
import app.chalo.citydata.data.model.mapper.EntityToAppKt;
import app.chalo.citydata.repository.local.RouteLocalDataSource;
import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.citydata.repository.remote.CityDataRemoteDataSource;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.CityIdAndDisplayNameAppModel;
import app.chalo.data.CityIdAndNameFromLatLngResponseAppModel;
import app.chalo.location.LatLng;
import app.chalo.models.LocationAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/CityDataRepositoryImpl;", "Lapp/chalo/citydata/repository/CityDataRepository;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDataRepositoryImpl implements CityDataRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataRemoteDataSource f1777a;
    public final RouteLocalDataSource b;
    public final BasicInfoContract c;
    public final StringProvider d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1778a;

        static {
            int[] iArr = new int[SavedRoutesSortType.values().length];
            try {
                iArr[SavedRoutesSortType.MOST_RECENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SavedRoutesSortType.NO_SORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1778a = iArr;
        }
    }

    public CityDataRepositoryImpl(CityDataRemoteDataSource cityDataRemoteDataSource, RouteLocalDataSource routeLocalDataSource, BasicInfoContract basicInfoContract, StringProvider stringProvider) {
        this.f1777a = cityDataRemoteDataSource;
        this.b = routeLocalDataSource;
        this.c = basicInfoContract;
        this.d = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r8 == r1) goto L29;
     */
    @Override // app.chalo.citydata.repository.CityDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r6, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws app.chalo.citydata.data.error.InvalidStopListDataApiResponseException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.citydata.repository.CityDataRepositoryImpl$fetchStopListForCity$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.citydata.repository.CityDataRepositoryImpl$fetchStopListForCity$1 r0 = (app.chalo.citydata.repository.CityDataRepositoryImpl$fetchStopListForCity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.citydata.repository.CityDataRepositoryImpl$fetchStopListForCity$1 r0 = new app.chalo.citydata.repository.CityDataRepositoryImpl$fetchStopListForCity$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            kotlin.ResultKt.b(r8)
            goto L7c
        L32:
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L6c
            goto L44
        L36:
            kotlin.ResultKt.b(r8)
            app.chalo.citydata.repository.remote.CityDataRemoteDataSource r8 = r5.f1777a     // Catch: java.lang.Exception -> L6c
            r0.label = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r8 = r8.a(r6, r7, r0)     // Catch: java.lang.Exception -> L6c
            if (r8 != r1) goto L44
            goto L7b
        L44:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L6c
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L6c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6c
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.v(r8, r7)     // Catch: java.lang.Exception -> L6c
            r6.<init>(r7)     // Catch: java.lang.Exception -> L6c
            java.util.Iterator r7 = r8.iterator()     // Catch: java.lang.Exception -> L6c
        L57:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L6c
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L6c
            app.chalo.citydata.data.model.api.response.StopApiModel r8 = (app.chalo.citydata.data.model.api.response.StopApiModel) r8     // Catch: java.lang.Exception -> L6c
            app.chalo.citydata.data.model.app.StopAppModel r8 = app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt.d(r8)     // Catch: java.lang.Exception -> L6c
            r6.add(r8)     // Catch: java.lang.Exception -> L6c
            goto L57
        L6b:
            return r6
        L6c:
            app.chalo.providers.stringprovider.StringEnum r6 = app.chalo.providers.stringprovider.StringEnum.INVALID_RESPONSE_FROM_SERVER
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0.label = r3
            app.chalo.providers.stringprovider.StringProvider r8 = r5.d
            java.lang.Object r8 = r8.b(r6, r7, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.lang.String r8 = (java.lang.String) r8
            app.chalo.citydata.data.error.InvalidStopListDataApiResponseException r6 = new app.chalo.citydata.data.error.InvalidStopListDataApiResponseException
            r6.<init>(r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.repository.CityDataRepositoryImpl.a(java.lang.String, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object b(long j, Continuation continuation) {
        Object objB = this.b.b(j, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object c(ArrayList arrayList, Continuation continuation) {
        Object objG = this.b.g(arrayList, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object d(ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$isRoutesDataAvailable$1 cityDataRepositoryImpl$isRoutesDataAvailable$1;
        if (continuationImpl instanceof CityDataRepositoryImpl$isRoutesDataAvailable$1) {
            cityDataRepositoryImpl$isRoutesDataAvailable$1 = (CityDataRepositoryImpl$isRoutesDataAvailable$1) continuationImpl;
            int i = cityDataRepositoryImpl$isRoutesDataAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$isRoutesDataAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$isRoutesDataAvailable$1 = new CityDataRepositoryImpl$isRoutesDataAvailable$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$isRoutesDataAvailable$1 = new CityDataRepositoryImpl$isRoutesDataAvailable$1(this, continuationImpl);
        }
        Object objJ = cityDataRepositoryImpl$isRoutesDataAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$isRoutesDataAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            cityDataRepositoryImpl$isRoutesDataAvailable$1.label = 1;
            objJ = this.b.j(cityDataRepositoryImpl$isRoutesDataAvailable$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        return Boolean.valueOf(!((Collection) objJ).isEmpty());
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object e(SavedRoutesSortType savedRoutesSortType, ContinuationImpl continuationImpl) {
        int i = WhenMappings.f1778a[savedRoutesSortType.ordinal()];
        RouteLocalDataSource routeLocalDataSource = this.b;
        if (i == 1) {
            return routeLocalDataSource.d(continuationImpl);
        }
        if (i == 2) {
            return routeLocalDataSource.j(continuationImpl);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object f(String str, ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$getSavedRoute$1 cityDataRepositoryImpl$getSavedRoute$1;
        if (continuationImpl instanceof CityDataRepositoryImpl$getSavedRoute$1) {
            cityDataRepositoryImpl$getSavedRoute$1 = (CityDataRepositoryImpl$getSavedRoute$1) continuationImpl;
            int i = cityDataRepositoryImpl$getSavedRoute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$getSavedRoute$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$getSavedRoute$1 = new CityDataRepositoryImpl$getSavedRoute$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$getSavedRoute$1 = new CityDataRepositoryImpl$getSavedRoute$1(this, continuationImpl);
        }
        Object objI = cityDataRepositoryImpl$getSavedRoute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$getSavedRoute$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            cityDataRepositoryImpl$getSavedRoute$1.label = 1;
            objI = this.b.i(str, cityDataRepositoryImpl$getSavedRoute$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        RouteEntity routeEntity = (RouteEntity) objI;
        if (routeEntity != null) {
            return EntityToAppKt.a(routeEntity);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Serializable g(List list, ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$getSavedRoutes$1 cityDataRepositoryImpl$getSavedRoutes$1;
        if (continuationImpl instanceof CityDataRepositoryImpl$getSavedRoutes$1) {
            cityDataRepositoryImpl$getSavedRoutes$1 = (CityDataRepositoryImpl$getSavedRoutes$1) continuationImpl;
            int i = cityDataRepositoryImpl$getSavedRoutes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$getSavedRoutes$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$getSavedRoutes$1 = new CityDataRepositoryImpl$getSavedRoutes$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$getSavedRoutes$1 = new CityDataRepositoryImpl$getSavedRoutes$1(this, continuationImpl);
        }
        Object objH = cityDataRepositoryImpl$getSavedRoutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$getSavedRoutes$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            cityDataRepositoryImpl$getSavedRoutes$1.label = 1;
            objH = this.b.h(list, cityDataRepositoryImpl$getSavedRoutes$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        Iterable iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(EntityToAppKt.a((RouteEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0124 -> B:29:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0160 -> B:20:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final java.lang.Object h(java.util.List r23, java.lang.String r24, boolean r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.repository.CityDataRepositoryImpl.h(java.util.List, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object i(RouteDetailsRequestOldAppModel routeDetailsRequestOldAppModel, ContinuationImpl continuationImpl) throws InvalidRoutesDataApiResponseException {
        CityDataRepositoryImpl$fetchRouteDetailsFromRemote$4 cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4;
        String strA;
        ?? arrayList;
        ?? arrayList2;
        String str;
        ?? arrayList3;
        ?? arrayList4;
        List list;
        String str2;
        String str3;
        StopApiModel stopApiModel;
        List list2;
        String str4;
        String str5;
        List list3;
        List list4;
        List list5;
        if (continuationImpl instanceof CityDataRepositoryImpl$fetchRouteDetailsFromRemote$4) {
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4 = (CityDataRepositoryImpl$fetchRouteDetailsFromRemote$4) continuationImpl;
            int i = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4 = new CityDataRepositoryImpl$fetchRouteDetailsFromRemote$4(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4 = new CityDataRepositoryImpl$fetchRouteDetailsFromRemote$4(this, continuationImpl);
        }
        Object objB = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(routeDetailsRequestOldAppModel, "<this>");
            String str6 = routeDetailsRequestOldAppModel.f1734a;
            String str7 = routeDetailsRequestOldAppModel.b;
            String str8 = routeDetailsRequestOldAppModel.c;
            GetRouteDetailsMetaQueryParameterApiModel getRouteDetailsMetaQueryParameterApiModel = new GetRouteDetailsMetaQueryParameterApiModel(routeDetailsRequestOldAppModel.f, routeDetailsRequestOldAppModel.g, routeDetailsRequestOldAppModel.d, str7, routeDetailsRequestOldAppModel.e, routeDetailsRequestOldAppModel.h);
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(GetRouteDetailsMetaQueryParameterApiModel.INSTANCE.serializer(), getRouteDetailsMetaQueryParameterApiModel);
            } catch (Exception unused) {
                strA = null;
            }
            RouteDetailsRequestOldApiModel routeDetailsRequestOldApiModel = new RouteDetailsRequestOldApiModel(str6, str7, str8, strA);
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4.label = 1;
            objB = this.f1777a.b(routeDetailsRequestOldApiModel, cityDataRepositoryImpl$fetchRouteDetailsFromRemote$4);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        RouteDetailsResponseOldApiModel routeDetailsResponseOldApiModel = (RouteDetailsResponseOldApiModel) objB;
        Intrinsics.i(routeDetailsResponseOldApiModel, "<this>");
        RouteDetailOldApiModel routeDetailOldApiModel = routeDetailsResponseOldApiModel.f1672a;
        if (routeDetailOldApiModel == null || (list5 = routeDetailsResponseOldApiModel.b) == null || routeDetailOldApiModel.f1670a == null || routeDetailOldApiModel.b == null || routeDetailOldApiModel.s == null || routeDetailOldApiModel.d == null || routeDetailOldApiModel.q == null || routeDetailOldApiModel.r == null || routeDetailOldApiModel.t == null) {
            objB = null;
            break;
        }
        List<RouteTimeTableOldApiModel> list6 = list5;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            for (RouteTimeTableOldApiModel routeTimeTableOldApiModel : list6) {
                Boolean bool = routeTimeTableOldApiModel.f1684a;
                if (bool != null) {
                    if (bool.equals(Boolean.TRUE)) {
                        RouteDetailsTimeTableWithFrequencyOldApiModel routeDetailsTimeTableWithFrequencyOldApiModel = routeTimeTableOldApiModel.c;
                        if (routeDetailsTimeTableWithFrequencyOldApiModel == null || routeDetailsTimeTableWithFrequencyOldApiModel.f1674a == null || routeDetailsTimeTableWithFrequencyOldApiModel.b == null || routeDetailsTimeTableWithFrequencyOldApiModel.c == null) {
                        }
                    } else if (routeTimeTableOldApiModel.b != null) {
                    }
                }
                objB = null;
            }
        }
        RouteDetailsResponseOldApiModel routeDetailsResponseOldApiModel2 = (RouteDetailsResponseOldApiModel) objB;
        if (routeDetailsResponseOldApiModel2 == null) {
            throw new InvalidRoutesDataApiResponseException("Invalid response from server");
        }
        RouteDetailOldApiModel routeDetailOldApiModel2 = routeDetailsResponseOldApiModel2.f1672a;
        int i3 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.v : 0;
        int i4 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.w : 0;
        List list7 = routeDetailsResponseOldApiModel2.b;
        if (list7 == null) {
            list7 = EmptyList.f17557a;
        }
        Iterable iterable = routeDetailsResponseOldApiModel2.c;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        if (routeDetailOldApiModel2 == null || routeDetailOldApiModel2.q == null) {
            EmptyList emptyList = EmptyList.f17557a;
        }
        TimeTableStatus timeTableStatusB = RoutesDataResponseApiModelKt.b(i3);
        List listA = RouteDetailsResponseOldApiModelKt.a(list7);
        Iterable<ShortTripOldApiModel> iterable2 = iterable;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(iterable2, 10));
        for (ShortTripOldApiModel shortTripOldApiModel : iterable2) {
            String str9 = shortTripOldApiModel.b;
            String str10 = shortTripOldApiModel.f1691a;
            List list8 = shortTripOldApiModel.c;
            if (list8 == null) {
                list8 = EmptyList.f17557a;
            }
            arrayList5.add(new ShortTripTimingAppModel(str9, str10, RouteDetailsResponseOldApiModelKt.a(list8)));
        }
        RouteTripTimingAppModel routeTripTimingAppModel = new RouteTripTimingAppModel(timeTableStatusB, i4, arrayList5, listA);
        ArrayList arrayList6 = new ArrayList();
        if (routeDetailOldApiModel2 == null || (list4 = routeDetailOldApiModel2.e) == null) {
            arrayList = EmptyList.f17557a;
        } else {
            List list9 = list4;
            arrayList = new ArrayList(CollectionsKt.v(list9, 10));
            Iterator it = list9.iterator();
            while (it.hasNext()) {
                arrayList.add(new RouteSpecialFeatureAppModel(((RouteLegacySpecialFeature) it.next()).toString(), RouteSpecialFeatureType.LEGACY));
            }
        }
        if (routeDetailOldApiModel2 == null || (list3 = routeDetailOldApiModel2.f) == null) {
            arrayList2 = EmptyList.f17557a;
        } else {
            List list10 = list3;
            arrayList2 = new ArrayList(CollectionsKt.v(list10, 10));
            Iterator it2 = list10.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new RouteSpecialFeatureAppModel((String) it2.next(), RouteSpecialFeatureType.NEW));
            }
        }
        arrayList6.addAll((Collection) arrayList);
        arrayList6.addAll((Collection) arrayList2);
        String str11 = (routeDetailOldApiModel2 == null || (str5 = routeDetailOldApiModel2.f1670a) == null) ? "" : str5;
        String str12 = (routeDetailOldApiModel2 == null || (str4 = routeDetailOldApiModel2.b) == null) ? "" : str4;
        ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
        if (routeDetailOldApiModel2 == null || (str = routeDetailOldApiModel2.s) == null) {
            str = "";
        }
        ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str);
        if (routeDetailOldApiModel2 == null || (list2 = routeDetailOldApiModel2.q) == null) {
            arrayList3 = EmptyList.f17557a;
        } else {
            List list11 = list2;
            arrayList3 = new ArrayList(CollectionsKt.v(list11, 10));
            Iterator it3 = list11.iterator();
            while (it3.hasNext()) {
                arrayList3.add(RoutesDataResponseApiModelKt.d((StopApiModel) it3.next()));
            }
        }
        ?? r20 = arrayList3;
        StopAppModel stopAppModel = (routeDetailOldApiModel2 == null || (stopApiModel = routeDetailOldApiModel2.r) == null) ? new StopAppModel("", "", new LatLng(0.0d, 0.0d), ChaloTransitMode.BUS, "", null) : RoutesDataResponseApiModelKt.d(stopApiModel);
        String str13 = (routeDetailOldApiModel2 == null || (str3 = routeDetailOldApiModel2.d) == null) ? "" : str3;
        boolean z = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.j : false;
        String str14 = (routeDetailOldApiModel2 == null || (str2 = routeDetailOldApiModel2.k) == null) ? "" : str2;
        LiveSeatAvailabilityApplicable.Companion companion2 = LiveSeatAvailabilityApplicable.INSTANCE;
        int i5 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.n : 0;
        companion2.getClass();
        LiveSeatAvailabilityApplicable yes = i5 == 0 ? LiveSeatAvailabilityApplicable.No.INSTANCE : new LiveSeatAvailabilityApplicable.Yes(i5);
        boolean z2 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.m : false;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = new RouteLiveDetailsAppModel(String.valueOf(routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.l : 2L), routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.h : false, routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.i : false, routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.o : false, routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.p : false);
        boolean z3 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.u : false;
        if (routeDetailOldApiModel2 == null || (list = routeDetailOldApiModel2.z) == null) {
            arrayList4 = EmptyList.f17557a;
        } else {
            List<TrafficSignalApiModel> list12 = list;
            arrayList4 = new ArrayList(CollectionsKt.v(list12, 10));
            for (TrafficSignalApiModel trafficSignalApiModel : list12) {
                Intrinsics.i(trafficSignalApiModel, "<this>");
                String str15 = trafficSignalApiModel.f1701a;
                if (str15 == null) {
                    str15 = "";
                }
                arrayList4.add(new TrafficSignalAppModel(new LatLng(trafficSignalApiModel.b, trafficSignalApiModel.c), str15));
            }
        }
        ?? r33 = arrayList4;
        String str16 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.x : null;
        RouteNamingSchemeType.Companion companion3 = RouteNamingSchemeType.INSTANCE;
        String str17 = routeDetailOldApiModel2 != null ? routeDetailOldApiModel2.y : null;
        companion3.getClass();
        return new RouteAppModel(-1, str11, str12, chaloTransitModeB, (List) r20, (String) null, (String) null, stopAppModel, routeTripTimingAppModel, str13, z, z2, str14, arrayList6, yes, routeLiveDetailsAppModel, z3, (List) r33, str16, RouteNamingSchemeType.Companion.a(str17), 96);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Serializable j(NearbyStopsToLocationRequestAppModel nearbyStopsToLocationRequestAppModel, ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$fetchNearbyStops$1 cityDataRepositoryImpl$fetchNearbyStops$1;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel;
        if (continuationImpl instanceof CityDataRepositoryImpl$fetchNearbyStops$1) {
            cityDataRepositoryImpl$fetchNearbyStops$1 = (CityDataRepositoryImpl$fetchNearbyStops$1) continuationImpl;
            int i = cityDataRepositoryImpl$fetchNearbyStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$fetchNearbyStops$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$fetchNearbyStops$1 = new CityDataRepositoryImpl$fetchNearbyStops$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$fetchNearbyStops$1 = new CityDataRepositoryImpl$fetchNearbyStops$1(this, continuationImpl);
        }
        Object objE = cityDataRepositoryImpl$fetchNearbyStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$fetchNearbyStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            NearbyStopsToLocationRequestApiModel nearbyStopsToLocationRequestApiModel = new NearbyStopsToLocationRequestApiModel(nearbyStopsToLocationRequestAppModel.f1733a, nearbyStopsToLocationRequestAppModel.b, nearbyStopsToLocationRequestAppModel.c, nearbyStopsToLocationRequestAppModel.d.getMode());
            cityDataRepositoryImpl$fetchNearbyStops$1.label = 1;
            objE = this.f1777a.e(nearbyStopsToLocationRequestApiModel, cityDataRepositoryImpl$fetchNearbyStops$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        ArrayList arrayList = new ArrayList();
        for (NearbyStopsToLocationResponseApiModel nearbyStopsToLocationResponseApiModel : (List) objE) {
            Intrinsics.i(nearbyStopsToLocationResponseApiModel, "<this>");
            Double d = nearbyStopsToLocationResponseApiModel.f1666a;
            Double d2 = nearbyStopsToLocationResponseApiModel.c;
            if (nearbyStopsToLocationResponseApiModel.b == null || d2 == null || d == null || nearbyStopsToLocationResponseApiModel.f == null) {
                nearbyStopToLocationAppModel = null;
            } else {
                double dDoubleValue = d.doubleValue();
                String str = nearbyStopsToLocationResponseApiModel.b;
                double dDoubleValue2 = d2.doubleValue();
                String str2 = nearbyStopsToLocationResponseApiModel.d;
                String str3 = str2 == null ? "" : str2;
                ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
                String str4 = nearbyStopsToLocationResponseApiModel.e;
                ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str4 != null ? str4 : "");
                String str5 = nearbyStopsToLocationResponseApiModel.f;
                Integer num = nearbyStopsToLocationResponseApiModel.g;
                nearbyStopToLocationAppModel = new NearbyStopToLocationAppModel(dDoubleValue, str, dDoubleValue2, str3, chaloTransitModeB, str5, num != null ? num.intValue() : -1L);
            }
            if (nearbyStopToLocationAppModel != null) {
                arrayList.add(nearbyStopToLocationAppModel);
            }
        }
        return arrayList;
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object k(String str, RouteLiveDetailsAppModel routeLiveDetailsAppModel, Continuation continuation) {
        Object objE = this.b.e(str, new RouteEntityLiveDataDetails(routeLiveDetailsAppModel.e, routeLiveDetailsAppModel.f1713a, routeLiveDetailsAppModel.b, routeLiveDetailsAppModel.c, routeLiveDetailsAppModel.d), continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object l(RoutesDataRequestAppModel routesDataRequestAppModel, ContinuationImpl continuationImpl) throws InvalidRoutesDataApiResponseException {
        CityDataRepositoryImpl$fetchRouteDetailsFromRemote$1 cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1;
        List list;
        Iterator it;
        ?? arrayList;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel;
        ?? arrayList2;
        RouteTripTimingAppModel routeTripTimingAppModel;
        String str;
        ChaloTransitMode chaloTransitMode;
        List list2;
        Object updated;
        StopApiModel stopApiModel;
        Long l;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        String str2;
        List list3;
        List list4;
        List list5;
        if (continuationImpl instanceof CityDataRepositoryImpl$fetchRouteDetailsFromRemote$1) {
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1 = (CityDataRepositoryImpl$fetchRouteDetailsFromRemote$1) continuationImpl;
            int i = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1 = new CityDataRepositoryImpl$fetchRouteDetailsFromRemote$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1 = new CityDataRepositoryImpl$fetchRouteDetailsFromRemote$1(this, continuationImpl);
        }
        Object objG = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1.label;
        String str3 = "<this>";
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(objG);
            Intrinsics.i(routesDataRequestAppModel, "<this>");
            String str4 = routesDataRequestAppModel.b;
            RoutesDataRequestMetaQueryParameterApiModel routesDataRequestMetaQueryParameterApiModel = new RoutesDataRequestMetaQueryParameterApiModel(routesDataRequestAppModel.e, routesDataRequestAppModel.f, routesDataRequestAppModel.c, str4, routesDataRequestAppModel.d, routesDataRequestAppModel.g);
            List<RouteIdWithVersion> list6 = routesDataRequestAppModel.f1735a;
            int iG = MapsKt.g(CollectionsKt.v(list6, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (RouteIdWithVersion routeIdWithVersion : list6) {
                Pair pair = new Pair(routeIdWithVersion.b, Integer.valueOf(routeIdWithVersion.f1711a));
                linkedHashMap.put(pair.d(), pair.e());
            }
            LatLng latLng = routesDataRequestAppModel.h;
            RoutesDataRequestApiModel routesDataRequestApiModel = new RoutesDataRequestApiModel(str4, new RoutesDataRequestDataApiModel(routesDataRequestMetaQueryParameterApiModel, linkedHashMap, latLng != null ? new RoutesDataRequestLocationApiModel(latLng.f5134a, latLng.b) : null));
            cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1.label = 1;
            objG = this.f1777a.g(routesDataRequestApiModel, cityDataRepositoryImpl$fetchRouteDetailsFromRemote$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
            str3 = "<this>";
        }
        RoutesDataResponseApiModel routesDataResponseApiModel = (RoutesDataResponseApiModel) objG;
        Intrinsics.i(routesDataResponseApiModel, str3);
        List list7 = routesDataResponseApiModel.b;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        if (list7 == null) {
            objG = null;
            break;
        }
        if (!list7.isEmpty()) {
            List<RouteApiModel> list8 = list7;
            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                loop0: for (RouteApiModel routeApiModel : list8) {
                    if (routeApiModel.b != null && (str2 = routeApiModel.c) != null) {
                        RouteApiStatusType.INSTANCE.getClass();
                        int i7 = RoutesDataResponseApiModelKt.WhenMappings.f1690a[RouteApiStatusType.Companion.a(str2).ordinal()];
                        if (i7 == 1) {
                            RouteStaticDataApiModel routeStaticDataApiModel = routeApiModel.e;
                            if (routeStaticDataApiModel != null) {
                                String str5 = routeStaticDataApiModel.f1680a;
                                List list9 = routeStaticDataApiModel.u;
                                if (str5 != null && routeStaticDataApiModel.o != null && routeStaticDataApiModel.b != null && routeStaticDataApiModel.m != null && routeStaticDataApiModel.d != null && (list3 = routeStaticDataApiModel.t) != null) {
                                    List list10 = list3;
                                    if ((list10 instanceof Collection) && list10.isEmpty()) {
                                        list4 = list9;
                                        if (list4 != null) {
                                            continue;
                                        }
                                    } else {
                                        Iterator it2 = list10.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                list4 = list9;
                                                if (list4 != null && !list4.isEmpty()) {
                                                    List list11 = list9;
                                                    if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                                                        Iterator it3 = list11.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                RouteShortTripApiModel routeShortTripApiModel = (RouteShortTripApiModel) it3.next();
                                                                if (routeShortTripApiModel.b != null && routeShortTripApiModel.f1678a != null && (list5 = routeShortTripApiModel.c) != null) {
                                                                    List list12 = list5;
                                                                    if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                                                                        Iterator it4 = list12.iterator();
                                                                        while (true) {
                                                                            if (it4.hasNext()) {
                                                                                if (RoutesDataResponseApiModelKt.c((RouteTimeTableApiModel) it4.next())) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!RoutesDataResponseApiModelKt.c((RouteTimeTableApiModel) it2.next())) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i7 != 2 && i7 != 3) {
                            if (i7 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    objG = null;
                }
            }
        }
        RoutesDataResponseApiModel routesDataResponseApiModel2 = (RoutesDataResponseApiModel) objG;
        if (routesDataResponseApiModel2 == null) {
            throw new InvalidRoutesDataApiResponseException("Invalid response from server");
        }
        Integer num = routesDataResponseApiModel2.f1688a;
        List list13 = routesDataResponseApiModel2.b;
        if (list13 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = list13.iterator();
            while (it5.hasNext()) {
                RouteApiModel routeApiModel2 = (RouteApiModel) it5.next();
                int iIntValue = num != null ? num.intValue() : -1;
                String str6 = routeApiModel2.b;
                RouteLiveDataApiModel routeLiveDataApiModel = routeApiModel2.d;
                if (str6 != null) {
                    Integer num2 = routeApiModel2.f1668a;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    int i8 = iIntValue;
                    RouteApiStatusType.Companion companion = RouteApiStatusType.INSTANCE;
                    String str7 = routeApiModel2.c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    companion.getClass();
                    int i9 = RoutesDataResponseApiModelKt.WhenMappings.f1690a[RouteApiStatusType.Companion.a(str7).ordinal()];
                    long jLongValue = 2;
                    if (i9 != i3) {
                        if (i9 == i6) {
                            boolean zBooleanValue = (routeLiveDataApiModel == null || (bool4 = routeLiveDataApiModel.f1676a) == null) ? false : bool4.booleanValue();
                            boolean zBooleanValue2 = (routeLiveDataApiModel == null || (bool3 = routeLiveDataApiModel.b) == null) ? false : bool3.booleanValue();
                            boolean zBooleanValue3 = (routeLiveDataApiModel == null || (bool2 = routeLiveDataApiModel.c) == null) ? false : bool2.booleanValue();
                            boolean zBooleanValue4 = (routeLiveDataApiModel == null || (bool = routeLiveDataApiModel.d) == null) ? false : bool.booleanValue();
                            if (routeLiveDataApiModel != null && (l = routeLiveDataApiModel.e) != null) {
                                jLongValue = l.longValue();
                            }
                            updated = new RouteDataResponseAppModel.NoUpdate(str6, new RouteResponseLiveDataAppModel(String.valueOf(jLongValue), zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4));
                        } else if (i9 != i5) {
                            if (i9 != i4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            it = it5;
                            updated = null;
                        } else {
                            updated = new RouteDataResponseAppModel.Deleted(str6);
                        }
                        it = it5;
                    } else {
                        RouteStaticDataApiModel routeStaticDataApiModel2 = routeApiModel2.e;
                        if (routeStaticDataApiModel2 == null) {
                            it = it5;
                            updated = null;
                        } else {
                            Integer num3 = routeStaticDataApiModel2.r;
                            List list14 = routeStaticDataApiModel2.m;
                            int iIntValue2 = num3 != null ? num3.intValue() : 0;
                            Integer num4 = routeStaticDataApiModel2.s;
                            int iIntValue3 = num4 != null ? num4.intValue() : 0;
                            List list15 = routeStaticDataApiModel2.t;
                            if (list15 == null) {
                                list15 = EmptyList.f17557a;
                            }
                            Iterable iterable = routeStaticDataApiModel2.u;
                            if (iterable == null) {
                                iterable = EmptyList.f17557a;
                            }
                            TimeTableStatus timeTableStatusB = RoutesDataResponseApiModelKt.b(iIntValue2);
                            List listA = RoutesDataResponseApiModelKt.a(list15);
                            Iterable iterable2 = iterable;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(iterable2, 10));
                            Iterator it6 = iterable2.iterator();
                            while (it6.hasNext()) {
                                RouteShortTripApiModel routeShortTripApiModel2 = (RouteShortTripApiModel) it6.next();
                                Iterator it7 = it6;
                                String str8 = routeShortTripApiModel2.b;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                Iterator it8 = it5;
                                String str9 = routeShortTripApiModel2.f1678a;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                List list16 = routeShortTripApiModel2.c;
                                if (list16 == null) {
                                    list16 = EmptyList.f17557a;
                                }
                                arrayList4.add(new ShortTripTimingAppModel(str8, str9, RoutesDataResponseApiModelKt.a(list16)));
                                it6 = it7;
                                it5 = it8;
                            }
                            it = it5;
                            RouteTripTimingAppModel routeTripTimingAppModel2 = new RouteTripTimingAppModel(timeTableStatusB, iIntValue3, arrayList4, listA);
                            String str10 = routeStaticDataApiModel2.f1680a;
                            if (str10 == null) {
                                str10 = "";
                            }
                            ChaloTransitMode.Companion companion2 = ChaloTransitMode.INSTANCE;
                            String str11 = routeStaticDataApiModel2.o;
                            if (str11 == null) {
                                str11 = "";
                            }
                            ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion2, str11);
                            if (list14 != null) {
                                List list17 = list14;
                                arrayList = new ArrayList(CollectionsKt.v(list17, 10));
                                Iterator it9 = list17.iterator();
                                while (it9.hasNext()) {
                                    arrayList.add(RoutesDataResponseApiModelKt.d((StopApiModel) it9.next()));
                                }
                            } else {
                                arrayList = EmptyList.f17557a;
                            }
                            StopAppModel stopAppModel = (list14 == null || (stopApiModel = (StopApiModel) CollectionsKt.P(list14)) == null) ? new StopAppModel("", "", new LatLng(0.0d, 0.0d), ChaloTransitMode.BUS, "", null) : RoutesDataResponseApiModelKt.d(stopApiModel);
                            String str12 = routeStaticDataApiModel2.b;
                            String str13 = str12 == null ? "" : str12;
                            Boolean bool5 = routeStaticDataApiModel2.g;
                            boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                            String str14 = routeStaticDataApiModel2.h;
                            String str15 = str14 == null ? "" : str14;
                            LiveSeatAvailabilityApplicable.Companion companion3 = LiveSeatAvailabilityApplicable.INSTANCE;
                            Integer num5 = routeStaticDataApiModel2.j;
                            int iIntValue4 = num5 != null ? num5.intValue() : 0;
                            companion3.getClass();
                            LiveSeatAvailabilityApplicable yes = iIntValue4 == 0 ? LiveSeatAvailabilityApplicable.No.INSTANCE : new LiveSeatAvailabilityApplicable.Yes(iIntValue4);
                            Boolean bool6 = routeStaticDataApiModel2.i;
                            boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
                            if (routeLiveDataApiModel != null) {
                                Boolean bool7 = routeLiveDataApiModel.f1676a;
                                boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
                                Boolean bool8 = routeLiveDataApiModel.b;
                                boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
                                Boolean bool9 = routeLiveDataApiModel.c;
                                boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : false;
                                Boolean bool10 = routeLiveDataApiModel.d;
                                boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : false;
                                Long l2 = routeLiveDataApiModel.e;
                                routeLiveDetailsAppModel = new RouteLiveDetailsAppModel(String.valueOf(l2 != null ? l2.longValue() : 2L), zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10);
                            } else {
                                RouteLiveDetailsAppModel.INSTANCE.getClass();
                                routeLiveDetailsAppModel = new RouteLiveDetailsAppModel(ExifInterface.GPS_MEASUREMENT_2D, false, false, false, false);
                            }
                            List list18 = routeStaticDataApiModel2.c;
                            if (list18 != null) {
                                List list19 = list18;
                                arrayList2 = new ArrayList(CollectionsKt.v(list19, 10));
                                Iterator it10 = list19.iterator();
                                while (it10.hasNext()) {
                                    arrayList2.add(new RouteSpecialFeatureAppModel((String) it10.next(), RouteSpecialFeatureType.NEW));
                                }
                            } else {
                                arrayList2 = EmptyList.f17557a;
                            }
                            ?? r27 = arrayList2;
                            Boolean bool11 = routeStaticDataApiModel2.q;
                            boolean zBooleanValue11 = bool11 != null ? bool11.booleanValue() : false;
                            List list20 = routeStaticDataApiModel2.n;
                            if (list20 != null) {
                                List list21 = list20;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list21, 10));
                                Iterator it11 = list21.iterator();
                                while (it11.hasNext()) {
                                    TrafficSignalApiModel trafficSignalApiModel = (TrafficSignalApiModel) it11.next();
                                    Intrinsics.i(trafficSignalApiModel, str3);
                                    String str16 = trafficSignalApiModel.f1701a;
                                    if (str16 == null) {
                                        str16 = "";
                                    }
                                    arrayList5.add(new TrafficSignalAppModel(new LatLng(trafficSignalApiModel.b, trafficSignalApiModel.c), str16));
                                    str10 = str10;
                                    chaloTransitModeB = chaloTransitModeB;
                                    it11 = it11;
                                    routeTripTimingAppModel2 = routeTripTimingAppModel2;
                                }
                                routeTripTimingAppModel = routeTripTimingAppModel2;
                                str = str10;
                                chaloTransitMode = chaloTransitModeB;
                                list2 = arrayList5;
                            } else {
                                routeTripTimingAppModel = routeTripTimingAppModel2;
                                str = str10;
                                chaloTransitMode = chaloTransitModeB;
                                list2 = EmptyList.f17557a;
                            }
                            List list22 = list2;
                            String str17 = routeStaticDataApiModel2.v;
                            RouteNamingSchemeType.Companion companion4 = RouteNamingSchemeType.INSTANCE;
                            String str18 = routeStaticDataApiModel2.w;
                            companion4.getClass();
                            updated = new RouteDataResponseAppModel.Updated(new RouteAppModel(i8, str6, str, chaloTransitMode, (List) arrayList, (String) null, (String) null, stopAppModel, routeTripTimingAppModel, str13, zBooleanValue5, zBooleanValue6, str15, (List) r27, yes, routeLiveDetailsAppModel, zBooleanValue11, list22, str17, RouteNamingSchemeType.Companion.a(str18), 96));
                        }
                    }
                } else {
                    it = it5;
                    updated = null;
                }
                if (updated != null) {
                    arrayList3.add(updated);
                }
                num = num;
                it5 = it;
                i4 = 4;
                i5 = 3;
                i6 = 2;
                i3 = 1;
            }
            list = arrayList3;
        } else {
            list = null;
        }
        Integer num6 = num;
        int iIntValue5 = num6 != null ? num6.intValue() : -1;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        return new RoutesDataResponseAppModel(iIntValue5, list);
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object m(String str, ContinuationImpl continuationImpl) {
        Object objF = this.b.f(str, continuationImpl);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Serializable n(StopDetailsRequestAppModel stopDetailsRequestAppModel, ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$getStopDetails$1 cityDataRepositoryImpl$getStopDetails$1;
        StopDetailsAppModel stopDetailsAppModel;
        String str;
        if (continuationImpl instanceof CityDataRepositoryImpl$getStopDetails$1) {
            cityDataRepositoryImpl$getStopDetails$1 = (CityDataRepositoryImpl$getStopDetails$1) continuationImpl;
            int i = cityDataRepositoryImpl$getStopDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$getStopDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$getStopDetails$1 = new CityDataRepositoryImpl$getStopDetails$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$getStopDetails$1 = new CityDataRepositoryImpl$getStopDetails$1(this, continuationImpl);
        }
        Object objF = cityDataRepositoryImpl$getStopDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$getStopDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            StopDetailsApiRequestModel stopDetailsApiRequestModel = new StopDetailsApiRequestModel(stopDetailsRequestAppModel.f1736a, new StopDetailsApiRequestBody(stopDetailsRequestAppModel.b, stopDetailsRequestAppModel.c));
            cityDataRepositoryImpl$getStopDetails$1.label = 1;
            objF = this.f1777a.f(stopDetailsApiRequestModel, cityDataRepositoryImpl$getStopDetails$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        ArrayList arrayList = new ArrayList();
        for (StopDetailsResponseApiModel stopDetailsResponseApiModel : (List) objF) {
            String str2 = stopDetailsResponseApiModel.f1697a;
            if (str2 == null || (str = stopDetailsResponseApiModel.b) == null) {
                stopDetailsAppModel = null;
            } else {
                String str3 = stopDetailsResponseApiModel.c;
                StopDetailsLocationApiModel stopDetailsLocationApiModel = stopDetailsResponseApiModel.d;
                if (stopDetailsLocationApiModel != null) {
                    stopDetailsAppModel = new StopDetailsAppModel(str2, str, str3, new LocationAppModel(stopDetailsLocationApiModel.f1695a, stopDetailsLocationApiModel.b), stopDetailsResponseApiModel.e);
                } else {
                    stopDetailsAppModel = null;
                }
            }
            if (stopDetailsAppModel != null) {
                arrayList.add(stopDetailsAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object o(String str, String currentLanguage, LatLng latLng, ContinuationImpl continuationImpl) throws InvalidCityIdFromLatLngApiResponseException {
        CityDataRepositoryImpl$fetchCityIdsFromLocation$1 cityDataRepositoryImpl$fetchCityIdsFromLocation$1;
        JsonObject jsonObject;
        if (continuationImpl instanceof CityDataRepositoryImpl$fetchCityIdsFromLocation$1) {
            cityDataRepositoryImpl$fetchCityIdsFromLocation$1 = (CityDataRepositoryImpl$fetchCityIdsFromLocation$1) continuationImpl;
            int i = cityDataRepositoryImpl$fetchCityIdsFromLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$fetchCityIdsFromLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$fetchCityIdsFromLocation$1 = new CityDataRepositoryImpl$fetchCityIdsFromLocation$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$fetchCityIdsFromLocation$1 = new CityDataRepositoryImpl$fetchCityIdsFromLocation$1(this, continuationImpl);
        }
        CityDataRepositoryImpl$fetchCityIdsFromLocation$1 cityDataRepositoryImpl$fetchCityIdsFromLocation$2 = cityDataRepositoryImpl$fetchCityIdsFromLocation$1;
        Object objD = cityDataRepositoryImpl$fetchCityIdsFromLocation$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$fetchCityIdsFromLocation$2.label;
        CityIdAndNameFromLatLngResponseAppModel cityIdAndNameFromLatLngResponseAppModel = null;
        if (i2 == 0) {
            ResultKt.b(objD);
            double d = latLng.f5134a;
            double d2 = latLng.b;
            int iH = this.c.h();
            Intrinsics.i(currentLanguage, "currentLanguage");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                linkedHashMap.put("userId", JsonElementKt.b(str));
                linkedHashMap.put("versionCode", JsonElementKt.a(Integer.valueOf(iH)));
                linkedHashMap.put("language", JsonElementKt.b(currentLanguage));
                jsonObject = new JsonObject(linkedHashMap);
            } catch (Exception unused) {
                jsonObject = null;
            }
            String strValueOf = String.valueOf(jsonObject);
            cityDataRepositoryImpl$fetchCityIdsFromLocation$2.label = 1;
            objD = this.f1777a.d(d, d2, strValueOf, cityDataRepositoryImpl$fetchCityIdsFromLocation$2);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        List<CityIdAndDisplayNameApiModel> list = ((CityIdAndNameFromLatLngResponseApiModel) objD).f1660a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (CityIdAndDisplayNameApiModel cityIdAndDisplayNameApiModel : list) {
                arrayList.add(new CityIdAndDisplayNameAppModel(cityIdAndDisplayNameApiModel.f1658a, cityIdAndDisplayNameApiModel.b));
            }
            cityIdAndNameFromLatLngResponseAppModel = new CityIdAndNameFromLatLngResponseAppModel(arrayList);
        }
        if (cityIdAndNameFromLatLngResponseAppModel != null) {
            return cityIdAndNameFromLatLngResponseAppModel;
        }
        throw new InvalidCityIdFromLatLngApiResponseException("Invalid response from server");
    }

    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Object p(String str, Continuation continuation) {
        return this.b.l(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Serializable q(StopImagesRequestAppModel stopImagesRequestAppModel, ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$getStopImages$1 cityDataRepositoryImpl$getStopImages$1;
        if (continuationImpl instanceof CityDataRepositoryImpl$getStopImages$1) {
            cityDataRepositoryImpl$getStopImages$1 = (CityDataRepositoryImpl$getStopImages$1) continuationImpl;
            int i = cityDataRepositoryImpl$getStopImages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$getStopImages$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$getStopImages$1 = new CityDataRepositoryImpl$getStopImages$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$getStopImages$1 = new CityDataRepositoryImpl$getStopImages$1(this, continuationImpl);
        }
        Object objC = cityDataRepositoryImpl$getStopImages$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$getStopImages$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            StopImagesRequestApiModel stopImagesRequestApiModel = new StopImagesRequestApiModel(stopImagesRequestAppModel.f1737a, new StopImagesRequestBody(stopImagesRequestAppModel.b, stopImagesRequestAppModel.c));
            cityDataRepositoryImpl$getStopImages$1.label = 1;
            objC = this.f1777a.c(stopImagesRequestApiModel, cityDataRepositoryImpl$getStopImages$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ArrayList arrayList = new ArrayList();
        for (StopImagesResponseApiModel stopImagesResponseApiModel : (List) objC) {
            Intrinsics.i(stopImagesResponseApiModel, "<this>");
            StopImageAppModel stopImageAppModel = null;
            if (stopImagesResponseApiModel.f1699a == null || stopImagesResponseApiModel.b == null) {
                stopImagesResponseApiModel = null;
            }
            if (stopImagesResponseApiModel != null) {
                String str = stopImagesResponseApiModel.f1699a;
                if (str == null) {
                    str = "";
                }
                List list = stopImagesResponseApiModel.b;
                if (list == null) {
                    list = EmptyList.f17557a;
                }
                stopImageAppModel = new StopImageAppModel(str, list);
            }
            if (stopImageAppModel != null) {
                arrayList.add(stopImageAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.CityDataRepository
    public final Serializable r(ContinuationImpl continuationImpl) {
        CityDataRepositoryImpl$getAllSavedRoutes$1 cityDataRepositoryImpl$getAllSavedRoutes$1;
        if (continuationImpl instanceof CityDataRepositoryImpl$getAllSavedRoutes$1) {
            cityDataRepositoryImpl$getAllSavedRoutes$1 = (CityDataRepositoryImpl$getAllSavedRoutes$1) continuationImpl;
            int i = cityDataRepositoryImpl$getAllSavedRoutes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRepositoryImpl$getAllSavedRoutes$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRepositoryImpl$getAllSavedRoutes$1 = new CityDataRepositoryImpl$getAllSavedRoutes$1(this, continuationImpl);
            }
        } else {
            cityDataRepositoryImpl$getAllSavedRoutes$1 = new CityDataRepositoryImpl$getAllSavedRoutes$1(this, continuationImpl);
        }
        Object objK = cityDataRepositoryImpl$getAllSavedRoutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$getAllSavedRoutes$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            cityDataRepositoryImpl$getAllSavedRoutes$1.label = 1;
            objK = this.b.k(cityDataRepositoryImpl$getAllSavedRoutes$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(EntityToAppKt.a((RouteEntity) it.next()));
        }
        return arrayList;
    }
}
