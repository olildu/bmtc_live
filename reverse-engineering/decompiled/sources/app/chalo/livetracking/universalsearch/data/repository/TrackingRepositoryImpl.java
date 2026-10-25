package app.chalo.livetracking.universalsearch.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType;
import app.chalo.livetracking.universalsearch.data.exception.InvalidAutoCompleteResponseDataException;
import app.chalo.livetracking.universalsearch.data.exception.InvalidLatLngException;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiResponseModel;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiResponseModelKt;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceAddressAndLatLng;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceGeometry;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceLocation;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng;
import app.chalo.livetracking.universalsearch.data.model.app.AutoCompleteResultAppModelKt;
import app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSource;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.location.LatLng;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/repository/TrackingRepositoryImpl;", "Lapp/chalo/livetracking/universalsearch/data/repository/TrackingRepository;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackingRepositoryImpl implements TrackingRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingRemoteDataSource f5008a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public TrackingRepositoryImpl(TrackingRemoteDataSource trackingRemoteDataSource, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f5008a = trackingRemoteDataSource;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.livetracking.universalsearch.data.repository.TrackingRepository
    public final Object a(AutoCompleteResultApiRequestModel.Default r8, ContinuationImpl continuationImpl) throws InvalidAutoCompleteResponseDataException {
        TrackingRepositoryImpl$fetchAutocompleteResults$1 trackingRepositoryImpl$fetchAutocompleteResults$1;
        if (continuationImpl instanceof TrackingRepositoryImpl$fetchAutocompleteResults$1) {
            trackingRepositoryImpl$fetchAutocompleteResults$1 = (TrackingRepositoryImpl$fetchAutocompleteResults$1) continuationImpl;
            int i = trackingRepositoryImpl$fetchAutocompleteResults$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingRepositoryImpl$fetchAutocompleteResults$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingRepositoryImpl$fetchAutocompleteResults$1 = new TrackingRepositoryImpl$fetchAutocompleteResults$1(this, continuationImpl);
            }
        } else {
            trackingRepositoryImpl$fetchAutocompleteResults$1 = new TrackingRepositoryImpl$fetchAutocompleteResults$1(this, continuationImpl);
        }
        TrackingRepositoryImpl$fetchAutocompleteResults$1 trackingRepositoryImpl$fetchAutocompleteResults$2 = trackingRepositoryImpl$fetchAutocompleteResults$1;
        Object objD = trackingRepositoryImpl$fetchAutocompleteResults$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackingRepositoryImpl$fetchAutocompleteResults$2.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            LinkedHashMap linkedHashMapE = e(r8, false);
            String upperCase = r8.k.toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            int i3 = r8.p;
            SearchFlowSourceType searchFlowSourceType = r8.q;
            trackingRepositoryImpl$fetchAutocompleteResults$2.label = 1;
            objD = this.f5008a.d(linkedHashMapE, upperCase, i3, searchFlowSourceType, trackingRepositoryImpl$fetchAutocompleteResults$2);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        if (!AutoCompleteResultApiResponseModelKt.a((AutoCompleteResultApiResponseModel) objD)) {
            objD = null;
        }
        AutoCompleteResultApiResponseModel autoCompleteResultApiResponseModel = (AutoCompleteResultApiResponseModel) objD;
        if (autoCompleteResultApiResponseModel != null) {
            return AutoCompleteResultAppModelKt.b(autoCompleteResultApiResponseModel);
        }
        throw new InvalidAutoCompleteResponseDataException("Invalid Universal Search Data Response");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.livetracking.universalsearch.data.repository.TrackingRepository
    public final Object b(AutoCompleteResultApiRequestModel.Default r8, ContinuationImpl continuationImpl) throws InvalidAutoCompleteResponseDataException {
        TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1 trackingRepositoryImpl$fetchOndcAutoCompleteResults$1;
        if (continuationImpl instanceof TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1) {
            trackingRepositoryImpl$fetchOndcAutoCompleteResults$1 = (TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1) continuationImpl;
            int i = trackingRepositoryImpl$fetchOndcAutoCompleteResults$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingRepositoryImpl$fetchOndcAutoCompleteResults$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingRepositoryImpl$fetchOndcAutoCompleteResults$1 = new TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1(this, continuationImpl);
            }
        } else {
            trackingRepositoryImpl$fetchOndcAutoCompleteResults$1 = new TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1(this, continuationImpl);
        }
        TrackingRepositoryImpl$fetchOndcAutoCompleteResults$1 trackingRepositoryImpl$fetchOndcAutoCompleteResults$2 = trackingRepositoryImpl$fetchOndcAutoCompleteResults$1;
        Object objC = trackingRepositoryImpl$fetchOndcAutoCompleteResults$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackingRepositoryImpl$fetchOndcAutoCompleteResults$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            LinkedHashMap linkedHashMapE = e(r8, true);
            String upperCase = r8.k.toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            int i3 = r8.p;
            SearchFlowSourceType searchFlowSourceType = r8.q;
            trackingRepositoryImpl$fetchOndcAutoCompleteResults$2.label = 1;
            objC = this.f5008a.c(linkedHashMapE, upperCase, i3, searchFlowSourceType, trackingRepositoryImpl$fetchOndcAutoCompleteResults$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        if (!AutoCompleteResultApiResponseModelKt.a((AutoCompleteResultApiResponseModel) objC)) {
            objC = null;
        }
        AutoCompleteResultApiResponseModel autoCompleteResultApiResponseModel = (AutoCompleteResultApiResponseModel) objC;
        if (autoCompleteResultApiResponseModel != null) {
            return AutoCompleteResultAppModelKt.b(autoCompleteResultApiResponseModel);
        }
        throw new InvalidAutoCompleteResponseDataException("Invalid Ondc Search Data Response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.universalsearch.data.repository.TrackingRepository
    public final Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws InvalidLatLngException {
        TrackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1 trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1;
        JsonObject jsonObject;
        PlaceAddressAndLatLng placeAddressAndLatLng;
        PlaceGeometry placeGeometry;
        PlaceLocation placeLocation;
        PlaceGeometry placeGeometry2;
        PlaceLocation placeLocation2;
        if (continuationImpl instanceof TrackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1) {
            trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1 = (TrackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1) continuationImpl;
            int i = trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1 = new TrackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1(this, continuationImpl);
            }
        } else {
            trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1 = new TrackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1(this, continuationImpl);
        }
        Object objB = trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1.label;
        Object obj = null;
        if (i2 == 0) {
            ResultKt.b(objB);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("placeid", str);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            try {
                linkedHashMap2.put("userId", JsonElementKt.b(str3));
                linkedHashMap2.put(CLConstants.SALT_FIELD_DEVICE_ID, JsonElementKt.b(str4));
                jsonObject = new JsonObject(linkedHashMap2);
            } catch (Exception unused) {
                jsonObject = null;
            }
            linkedHashMap.put(Constants.REFERRER_API_META, String.valueOf(jsonObject));
            linkedHashMap.put("searchPartner", str2);
            trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1.label = 1;
            objB = this.f5008a.b(linkedHashMap, trackingRepositoryImpl$fetchLatLngForPlaceWithPlaceID$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        PlaceWithLatLng placeWithLatLng = (PlaceWithLatLng) objB;
        Intrinsics.i(placeWithLatLng, "<this>");
        PlaceAddressAndLatLng placeAddressAndLatLng2 = placeWithLatLng.f4981a;
        if (placeAddressAndLatLng2 != null && (placeGeometry2 = placeAddressAndLatLng2.b) != null && (placeLocation2 = placeGeometry2.f4977a) != null && placeLocation2.b != null && placeLocation2.f4979a != null) {
            obj = objB;
        }
        PlaceWithLatLng placeWithLatLng2 = (PlaceWithLatLng) obj;
        if (placeWithLatLng2 == null || (placeAddressAndLatLng = placeWithLatLng2.f4981a) == null || (placeGeometry = placeAddressAndLatLng.b) == null || (placeLocation = placeGeometry.f4977a) == null) {
            throw new InvalidLatLngException("Latlng is null");
        }
        return placeLocation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.universalsearch.data.repository.TrackingRepository
    public final Object d(AutoCompleteResultApiRequestModel.Place place, ContinuationImpl continuationImpl) {
        TrackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1 trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1;
        if (continuationImpl instanceof TrackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1) {
            trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1 = (TrackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1) continuationImpl;
            int i = trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1.label = i - Integer.MIN_VALUE;
            } else {
                trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1 = new TrackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1(this, continuationImpl);
            }
        } else {
            trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1 = new TrackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1(this, continuationImpl);
        }
        Object objA = trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            LinkedHashMap linkedHashMapE = e(place, false);
            int i3 = place.l;
            String str = place.h;
            trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1.label = 1;
            objA = this.f5008a.a(linkedHashMapE, i3, str, trackingRepositoryImpl$fetchCityIndependentAutocompleteResults$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return AutoCompleteResultAppModelKt.b((AutoCompleteResultApiResponseModel) objA);
    }

    public final LinkedHashMap e(AutoCompleteResultApiRequestModel autoCompleteResultApiRequestModel, boolean z) {
        LatLng c = autoCompleteResultApiRequestModel.getC();
        String b = autoCompleteResultApiRequestModel.getB();
        String f4968a = autoCompleteResultApiRequestModel.getF4968a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("searchSource", b);
        linkedHashMap.put("str", f4968a);
        if (c != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("lat", JsonElementKt.a(Double.valueOf(c.f5134a)));
            linkedHashMap2.put("lon", JsonElementKt.a(Double.valueOf(c.b)));
            linkedHashMap.put(FirebaseAnalytics.Param.LOCATION, new JsonObject(linkedHashMap2).toString());
        }
        String d = autoCompleteResultApiRequestModel.getD();
        BasicInfoContract basicInfoContract = this.b;
        linkedHashMap.put(Constants.REFERRER_API_META, String.valueOf(TrackingUtils.f(basicInfoContract.h(), d, basicInfoContract.getDeviceId(), autoCompleteResultApiRequestModel.getE())));
        if (autoCompleteResultApiRequestModel instanceof AutoCompleteResultApiRequestModel.Default) {
            AutoCompleteResultApiRequestModel.Default r0 = (AutoCompleteResultApiRequestModel.Default) autoCompleteResultApiRequestModel;
            String str = r0.j;
            if (str != null && str.length() != 0) {
                linkedHashMap.put("searchFilter", str);
            }
            linkedHashMap.put("day", this.c.y(r0.o, null));
            linkedHashMap.put("station_type", "transit");
        } else if (!(autoCompleteResultApiRequestModel instanceof AutoCompleteResultApiRequestModel.Place)) {
            throw new NoWhenBranchMatchedException();
        }
        String f = autoCompleteResultApiRequestModel.getF();
        if (f != null) {
            if (z) {
                linkedHashMap.put("transitMode", f);
                return linkedHashMap;
            }
            linkedHashMap.put("category", f);
        }
        return linkedHashMap;
    }
}
