package app.chalo.livetracking.frameworklivetracking.data.repository;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.frameworklivetracking.data.model.RtsServiceType;
import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetSeatAvailabilityRequestApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.ChaloRtsServiceConfigApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.ChaloSocketConfigResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.ConnectionDataApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.FetchVehicleLiveGpsLocationResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.GetSeatAvailabilityResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.SeatAvailabilityApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.SocketConfigApiToAppModelException;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.VehicleLatestPointApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloRtsServiceConfigAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigRequestQueryModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ConnectionDataAppModel;
import app.chalo.livetracking.frameworklivetracking.data.remote.LiveTrackingFrameworkRemoteDataSource;
import app.chalo.livetracking.frameworklivetracking.domain.InvalidGpsLocationData;
import app.chalo.livetracking.routedetails.data.model.app.request.FetchVehicleLiveGpsLocationRequestAppModel;
import app.chalo.livetracking.routedetails.data.model.app.request.GetSeatAvailabilityRequestAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import app.chalo.location.LatLng;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/repository/LiveTrackingFrameworkRepositoryImpl;", "Lapp/chalo/livetracking/frameworklivetracking/data/repository/LiveTrackingFrameworkRepository;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingFrameworkRepositoryImpl implements LiveTrackingFrameworkRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveTrackingFrameworkRemoteDataSource f4319a;

    public LiveTrackingFrameworkRepositoryImpl(LiveTrackingFrameworkRemoteDataSource liveTrackingFrameworkRemoteDataSource) {
        this.f4319a = liveTrackingFrameworkRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository
    public final Object a(ChaloSocketConfigRequestQueryModel chaloSocketConfigRequestQueryModel, ContinuationImpl continuationImpl) throws SocketConfigApiToAppModelException.SocketSubscriptionServiceDataNotAvailable, SocketConfigApiToAppModelException.SocketConnectionDataNotAvailable {
        LiveTrackingFrameworkRepositoryImpl$getSocketConfig$1 liveTrackingFrameworkRepositoryImpl$getSocketConfig$1;
        RtsServiceType rtsServiceType;
        Object withSubscription;
        if (continuationImpl instanceof LiveTrackingFrameworkRepositoryImpl$getSocketConfig$1) {
            liveTrackingFrameworkRepositoryImpl$getSocketConfig$1 = (LiveTrackingFrameworkRepositoryImpl$getSocketConfig$1) continuationImpl;
            int i = liveTrackingFrameworkRepositoryImpl$getSocketConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRepositoryImpl$getSocketConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRepositoryImpl$getSocketConfig$1 = new LiveTrackingFrameworkRepositoryImpl$getSocketConfig$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRepositoryImpl$getSocketConfig$1 = new LiveTrackingFrameworkRepositoryImpl$getSocketConfig$1(this, continuationImpl);
        }
        Object objA = liveTrackingFrameworkRepositoryImpl$getSocketConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRepositoryImpl$getSocketConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            liveTrackingFrameworkRepositoryImpl$getSocketConfig$1.label = 1;
            objA = this.f4319a.a(chaloSocketConfigRequestQueryModel, liveTrackingFrameworkRepositoryImpl$getSocketConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloSocketConfigResponseApiModel chaloSocketConfigResponseApiModel = (ChaloSocketConfigResponseApiModel) objA;
        Intrinsics.i(chaloSocketConfigResponseApiModel, "<this>");
        JsonObject jsonObject = chaloSocketConfigResponseApiModel.b;
        ConnectionDataApiModel connectionDataApiModel = chaloSocketConfigResponseApiModel.f4276a;
        if (connectionDataApiModel == null) {
            throw SocketConfigApiToAppModelException.SocketConnectionDataNotAvailable.f4292a;
        }
        if (jsonObject == null) {
            throw SocketConfigApiToAppModelException.SocketSubscriptionServiceDataNotAvailable.f4293a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : jsonObject.f18198a.entrySet()) {
            RtsServiceType.Companion companion = RtsServiceType.INSTANCE;
            String rtsServiceString = (String) entry.getKey();
            companion.getClass();
            Intrinsics.i(rtsServiceString, "rtsServiceString");
            RtsServiceType[] rtsServiceTypeArrValues = RtsServiceType.values();
            int length = rtsServiceTypeArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    rtsServiceType = null;
                    break;
                }
                rtsServiceType = rtsServiceTypeArrValues[i3];
                if (Intrinsics.d(rtsServiceType.getServiceName(), rtsServiceString)) {
                    break;
                }
                i3++;
            }
            if (rtsServiceType == null) {
                rtsServiceType = RtsServiceType.UNKNOWN;
            }
            if (rtsServiceType != RtsServiceType.UNKNOWN) {
                Json.Default r5 = Json.d;
                JsonElement jsonElement = (JsonElement) entry.getValue();
                r5.getClass();
                ChaloRtsServiceConfigApiModel chaloRtsServiceConfigApiModel = (ChaloRtsServiceConfigApiModel) r5.e(ChaloRtsServiceConfigApiModel.INSTANCE.serializer(), jsonElement);
                if (chaloRtsServiceConfigApiModel.f4274a) {
                    Long l = chaloRtsServiceConfigApiModel.d;
                    withSubscription = new ChaloRtsServiceConfigAppModel.WithPolling(l != null ? l.longValue() : -1L, chaloRtsServiceConfigApiModel.b);
                } else {
                    Long l2 = chaloRtsServiceConfigApiModel.c;
                    withSubscription = new ChaloRtsServiceConfigAppModel.WithSubscription(l2 != null ? l2.longValue() : -1L, chaloRtsServiceConfigApiModel.b, chaloRtsServiceConfigApiModel.e);
                }
                linkedHashMap.put(rtsServiceType, withSubscription);
            }
        }
        String str = connectionDataApiModel.f4278a;
        boolean z = connectionDataApiModel.b;
        String str2 = connectionDataApiModel.c;
        double d = connectionDataApiModel.d;
        long j = connectionDataApiModel.e;
        long j2 = connectionDataApiModel.f;
        long j3 = connectionDataApiModel.g;
        List list = connectionDataApiModel.h;
        Boolean bool = connectionDataApiModel.i;
        return new ChaloSocketConfigResponseAppModel(new ConnectionDataAppModel(str, z, str2, d, j, j2, j3, list, bool != null ? bool.booleanValue() : false), linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository
    public final Object b(GetSeatAvailabilityRequestAppModel getSeatAvailabilityRequestAppModel, ContinuationImpl continuationImpl) {
        LiveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1 liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1;
        SeatAvailabilityLevel seatAvailabilityLevel;
        if (continuationImpl instanceof LiveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1) {
            liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1 = (LiveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1) continuationImpl;
            int i = liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1 = new LiveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1 = new LiveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1(this, continuationImpl);
        }
        Object objC = liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            Intrinsics.i(getSeatAvailabilityRequestAppModel, "<this>");
            GetSeatAvailabilityRequestApiModel getSeatAvailabilityRequestApiModel = new GetSeatAvailabilityRequestApiModel(getSeatAvailabilityRequestAppModel.f4394a, getSeatAvailabilityRequestAppModel.b, getSeatAvailabilityRequestAppModel.c, getSeatAvailabilityRequestAppModel.d, getSeatAvailabilityRequestAppModel.e, getSeatAvailabilityRequestAppModel.f);
            liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1.label = 1;
            objC = this.f4319a.c(getSeatAvailabilityRequestApiModel, liveTrackingFrameworkRepositoryImpl$getRouteSeatAvailabilityDetails$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        GetSeatAvailabilityResponseApiModel getSeatAvailabilityResponseApiModel = (GetSeatAvailabilityResponseApiModel) objC;
        Intrinsics.i(getSeatAvailabilityResponseApiModel, "<this>");
        List<SeatAvailabilityApiModel> list = getSeatAvailabilityResponseApiModel.f4284a;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (SeatAvailabilityApiModel seatAvailabilityApiModel : list) {
            String str = seatAvailabilityApiModel.f4290a;
            SeatAvailabilityLevel.Companion companion = SeatAvailabilityLevel.INSTANCE;
            int i3 = seatAvailabilityApiModel.b;
            companion.getClass();
            if (i3 == 0) {
                seatAvailabilityLevel = SeatAvailabilityLevel.LOW;
            } else if (i3 == 1) {
                seatAvailabilityLevel = SeatAvailabilityLevel.MEDIUM;
            } else if (i3 == 2) {
                seatAvailabilityLevel = SeatAvailabilityLevel.HIGH;
            } else if (i3 == 3) {
                seatAvailabilityLevel = SeatAvailabilityLevel.LOW;
            } else if (i3 == 4) {
                seatAvailabilityLevel = SeatAvailabilityLevel.MEDIUM;
            } else if (i3 != 5) {
                seatAvailabilityLevel = SeatAvailabilityLevel.UNKNOWN;
            } else {
                seatAvailabilityLevel = SeatAvailabilityLevel.HIGH;
            }
            arrayList.add(new VehicleSeatAvailabilityDetailsAppModel(str, seatAvailabilityLevel));
        }
        return new SeatAvailabilityAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository
    public final Object c(FetchVehicleLiveGpsLocationRequestAppModel fetchVehicleLiveGpsLocationRequestAppModel, ContinuationImpl continuationImpl) throws InvalidGpsLocationData {
        LiveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1 liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1;
        Long l;
        Double d;
        Double d2;
        if (continuationImpl instanceof LiveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1) {
            liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1 = (LiveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1) continuationImpl;
            int i = liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1 = new LiveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1 = new LiveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1(this, continuationImpl);
        }
        Object objB = liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String str = fetchVehicleLiveGpsLocationRequestAppModel.f4393a;
            String str2 = fetchVehicleLiveGpsLocationRequestAppModel.b;
            String str3 = fetchVehicleLiveGpsLocationRequestAppModel.c;
            liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.L$0 = fetchVehicleLiveGpsLocationRequestAppModel;
            liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.label = 1;
            objB = this.f4319a.b(str, str2, str3, liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fetchVehicleLiveGpsLocationRequestAppModel = (FetchVehicleLiveGpsLocationRequestAppModel) liveTrackingFrameworkRepositoryImpl$getVehicleLiveGpsDetails$1.L$0;
            ResultKt.b(objB);
        }
        FetchVehicleLiveGpsLocationResponseApiModel fetchVehicleLiveGpsLocationResponseApiModel = (FetchVehicleLiveGpsLocationResponseApiModel) objB;
        Intrinsics.i(fetchVehicleLiveGpsLocationResponseApiModel, "<this>");
        VehicleLatestPointApiModel vehicleLatestPointApiModel = fetchVehicleLiveGpsLocationResponseApiModel.f4280a;
        double dDoubleValue = 0.0d;
        if (vehicleLatestPointApiModel != null) {
            Double d3 = vehicleLatestPointApiModel.c;
            Double d4 = vehicleLatestPointApiModel.b;
            if (d3 == null || d4 == null || Intrinsics.b(d3, 0.0d) || Intrinsics.b(d4, 0.0d)) {
                fetchVehicleLiveGpsLocationResponseApiModel = null;
            }
        } else {
            fetchVehicleLiveGpsLocationResponseApiModel = null;
        }
        if (fetchVehicleLiveGpsLocationResponseApiModel == null) {
            throw InvalidGpsLocationData.f4329a;
        }
        String vehicleNumber = fetchVehicleLiveGpsLocationRequestAppModel.b;
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        VehicleLatestPointApiModel vehicleLatestPointApiModel2 = fetchVehicleLiveGpsLocationResponseApiModel.f4280a;
        double dDoubleValue2 = (vehicleLatestPointApiModel2 == null || (d2 = vehicleLatestPointApiModel2.c) == null) ? 0.0d : d2.doubleValue();
        if (vehicleLatestPointApiModel2 != null && (d = vehicleLatestPointApiModel2.b) != null) {
            dDoubleValue = d.doubleValue();
        }
        return new VehicleLiveGpsLocationResponseAppModel(vehicleNumber, new LatLng(dDoubleValue2, dDoubleValue), (vehicleLatestPointApiModel2 == null || (l = vehicleLatestPointApiModel2.e) == null) ? 0L : l.longValue());
    }
}
