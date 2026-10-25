package app.chalo.livetracking.tripplanner.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.tripplanner.data.mappers.TripPlannerRemoteToAppModelsMappersKt;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerResultApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.request.MakeTripPlannerRequestData;
import app.chalo.livetracking.tripplanner.data.models.api.request.TripPlannerRequestApiModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerRequestAppModel;
import app.chalo.livetracking.tripplanner.data.remote.TripPlannerRemoteDataSource;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import com.amazon.device.ads.DtbDeviceData;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/repository/TripPlannerRepositoryImpl;", "Lapp/chalo/livetracking/tripplanner/data/repository/TripPlannerRepository;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerRepositoryImpl implements TripPlannerRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripPlannerRemoteDataSource f4690a;
    public final BasicInfoContract b;

    public TripPlannerRepositoryImpl(TripPlannerRemoteDataSource tripPlannerRemoteDataSource, BasicInfoContract basicInfoContract) {
        this.f4690a = tripPlannerRemoteDataSource;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.livetracking.tripplanner.data.repository.TripPlannerRepository
    public final Object a(TripPlannerRequestAppModel tripPlannerRequestAppModel, ContinuationImpl continuationImpl) {
        TripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1 tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1;
        if (continuationImpl instanceof TripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1) {
            tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1 = (TripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1) continuationImpl;
            int i = tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1 = new TripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1(this, continuationImpl);
            }
        } else {
            tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1 = new TripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1(this, continuationImpl);
        }
        Object objB = tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            LatLng latLng = tripPlannerRequestAppModel.b;
            LatLng latLng2 = tripPlannerRequestAppModel.f4680a;
            TripPlannerRequestApiModel tripPlannerRequestApiModel = new TripPlannerRequestApiModel(latLng2 != null ? Double.valueOf(latLng2.f5134a) : null, latLng2 != null ? Double.valueOf(latLng2.b) : null, latLng != null ? Double.valueOf(latLng.f5134a) : null, latLng != null ? Double.valueOf(latLng.b) : null, tripPlannerRequestAppModel.c.getMode(), tripPlannerRequestAppModel.d, tripPlannerRequestAppModel.e, tripPlannerRequestAppModel.f);
            tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1.label = 1;
            objB = this.f4690a.b(tripPlannerRequestApiModel, tripPlannerRepositoryImpl$makeTripPlannerCallWithArrival$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return TripPlannerRemoteToAppModelsMappersKt.d((TripPlannerResultApiResponseModel) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.livetracking.tripplanner.data.repository.TripPlannerRepository
    public final Object b(MakeTripPlannerRequestData makeTripPlannerRequestData, ContinuationImpl continuationImpl) {
        TripPlannerRepositoryImpl$makeTripPlannerCall$1 tripPlannerRepositoryImpl$makeTripPlannerCall$1;
        JsonObject jsonObject;
        if (continuationImpl instanceof TripPlannerRepositoryImpl$makeTripPlannerCall$1) {
            tripPlannerRepositoryImpl$makeTripPlannerCall$1 = (TripPlannerRepositoryImpl$makeTripPlannerCall$1) continuationImpl;
            int i = tripPlannerRepositoryImpl$makeTripPlannerCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerRepositoryImpl$makeTripPlannerCall$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerRepositoryImpl$makeTripPlannerCall$1 = new TripPlannerRepositoryImpl$makeTripPlannerCall$1(this, continuationImpl);
            }
        } else {
            tripPlannerRepositoryImpl$makeTripPlannerCall$1 = new TripPlannerRepositoryImpl$makeTripPlannerCall$1(this, continuationImpl);
        }
        Object objA = tripPlannerRepositoryImpl$makeTripPlannerCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerRepositoryImpl$makeTripPlannerCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            LatLng latLng = makeTripPlannerRequestData.f4648a;
            LatLng latLng2 = makeTripPlannerRequestData.b;
            String str = makeTripPlannerRequestData.k;
            ChaloTransitMode chaloTransitMode = makeTripPlannerRequestData.c;
            Intrinsics.i(chaloTransitMode, "<this>");
            String mode = chaloTransitMode == ChaloTransitMode.METRO ? ChaloTransitMode.TRIP_PLANNER_METRO_MODE : chaloTransitMode.getMode();
            long j = makeTripPlannerRequestData.d;
            String str2 = makeTripPlannerRequestData.e;
            String deviceId = this.b.getDeviceId();
            String str3 = makeTripPlannerRequestData.f;
            int i3 = makeTripPlannerRequestData.g;
            String str4 = makeTripPlannerRequestData.h;
            String androidModel = makeTripPlannerRequestData.j;
            int i4 = makeTripPlannerRequestData.i;
            Intrinsics.i(androidModel, "androidModel");
            JsonObject jsonObjectF = TrackingUtils.f(i3, str2, deviceId, str3);
            if (jsonObjectF != null) {
                LinkedHashMap linkedHashMapU = MapsKt.u(jsonObjectF);
                linkedHashMapU.put("city", JsonElementKt.b(str4));
                linkedHashMapU.put("androidModel", JsonElementKt.b(androidModel));
                linkedHashMapU.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, JsonElementKt.a(Integer.valueOf(i4)));
                linkedHashMapU.put("userId", JsonElementKt.b(str2));
                jsonObject = new JsonObject(linkedHashMapU);
            } else {
                jsonObject = null;
            }
            String strValueOf = String.valueOf(jsonObject);
            long j2 = makeTripPlannerRequestData.l;
            String type = makeTripPlannerRequestData.m.getType();
            String str5 = makeTripPlannerRequestData.n;
            String str6 = makeTripPlannerRequestData.o;
            boolean z = makeTripPlannerRequestData.p;
            tripPlannerRepositoryImpl$makeTripPlannerCall$1.label = 1;
            objA = this.f4690a.a(latLng, latLng2, str, mode, j, strValueOf, j2, type, str5, str6, z, tripPlannerRepositoryImpl$makeTripPlannerCall$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return TripPlannerRemoteToAppModelsMappersKt.d((TripPlannerResultApiResponseModel) objA);
    }
}
