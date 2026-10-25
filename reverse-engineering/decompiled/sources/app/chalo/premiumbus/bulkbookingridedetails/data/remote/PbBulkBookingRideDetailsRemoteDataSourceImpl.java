package app.chalo.premiumbus.bulkbookingridedetails.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.PbTripBookingApiResponseModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.UpdatePassStartDateRequestApiModel;
import defpackage.mq0;
import defpackage.t8;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/remote/PbBulkBookingRideDetailsRemoteDataSourceImpl;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/remote/PbBulkBookingRideDetailsRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PbBulkBookingRideDetailsRemoteDataSourceImpl implements PbBulkBookingRideDetailsRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f6893a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/remote/PbBulkBookingRideDetailsRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_BULK_BOOKING_RIDE_DETAIL", "Ljava/lang/String;", "UPDATE_PASS_START_DATE", "PARAM_PASS_ID", "CITY_KEY", "IS_PREMIUM_BUS_FEATURE_ENABLED", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PbBulkBookingRideDetailsRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f6893a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRemoteDataSource
    public final Object a(String str, ContinuationImpl continuationImpl) throws Exception {
        PbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1 pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1;
        if (continuationImpl instanceof PbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1) {
            pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1 = (PbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1) continuationImpl;
            int i = pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1 = new PbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1 = new PbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1(this, continuationImpl);
        }
        Object objC = pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6893a.d();
            networkRequestBuilderD.j("mticketing/v2/pass-ticket/bookings");
            networkRequestBuilderD.b();
            networkRequestBuilderD.a("passId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1.label = 1;
            objC = chaloRequestE.c(pbBulkBookingRideDetailsRemoteDataSourceImpl$fetchPbTripBookingDetails$1);
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
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new mq0(22));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(PbTripBookingApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PbTripBookingApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PbTripBookingApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRemoteDataSource
    public final Object b(String str, String str2, UpdatePassStartDateRequestApiModel updatePassStartDateRequestApiModel, boolean z, ContinuationImpl continuationImpl) throws Exception {
        PbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1 pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1;
        if (continuationImpl instanceof PbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1) {
            pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1 = (PbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1) continuationImpl;
            int i = pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1 = new PbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1 = new PbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1(this, continuationImpl);
        }
        Object objC = pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("mticketing/v3/pass/{PARAM_PASS_ID}", "{PARAM_PASS_ID}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f6893a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(UpdatePassStartDateRequestApiModel.INSTANCE.serializer(), updatePassStartDateRequestApiModel));
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, genericRequestData.e);
            networkRequestBuilderD.a("isPremiumBusFeatureEnabled", String.valueOf(z), genericRequestData.e);
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1.label = 1;
            objC = chaloRequestE.c(pbBulkBookingRideDetailsRemoteDataSourceImpl$updatePassStartDate$1);
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
        boolean z2 = networkResponse.f6522a;
        String str3 = networkResponse.c;
        Object objB = null;
        if (!z2) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new mq0(21));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str3 != null) {
            try {
                json2.getClass();
                objB = json2.b(str3, BuiltinSerializersKt.c(JsonObject.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(JsonObject.class, e.getMessage(), str3));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (JsonObject) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
