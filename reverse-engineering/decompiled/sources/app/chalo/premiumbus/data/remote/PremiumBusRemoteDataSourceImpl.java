package app.chalo.premiumbus.data.remote;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkErrorResponseParseException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.model.ChaloError;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.generic.ErrorTypeKt;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.premiumbus.data.mappers.CompleteProductConfigFetchExceptionMapper;
import app.chalo.premiumbus.data.models.api.request.ChangeStopApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.ChangeStopApiResponseModel;
import app.chalo.premiumbus.data.models.api.request.PBReserveTicketThroughPassRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationRequestApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationRequestApiResponseModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusBookingPurchaseOptionApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusChangeSeatsRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumProductRescheduleApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.EligibleStopChangesApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBOriginDestinationApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBReserveTicketThroughPassApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBTripDetailsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingAvailableOptionsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusChangeSeatsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationOptionApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationReasonApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusSeatSelectionLayoutResponseApiModel;
import app.chalo.premiumbus.data.models.api.response.PremiumProductRescheduleApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumReserveTicketReceiptApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel;
import app.chalo.premiumbus.data.models.productconfig.PBProductConfigResultApiResponseModel;
import app.chalo.productbooking.common.data.exception.CompleteProductConfigFetchFailedException;
import app.chalo.productbooking.common.data.models.api.request.AvailableSlotsRequestForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.request.BulkPreBookRequestApiModel;
import app.chalo.productbooking.common.data.models.api.request.FetchCompleteProductConfigApiRequestModel;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsResponseForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.response.BulkPreBookResponseApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductDataApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductsConfigListForUiApiResponseModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import defpackage.du0;
import defpackage.nf1;
import defpackage.pu0;
import defpackage.t8;
import defpackage.vo1;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/data/remote/PremiumBusRemoteDataSourceImpl;", "Lapp/chalo/premiumbus/data/remote/PremiumBusRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusRemoteDataSourceImpl implements PremiumBusRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f7152a;
    public final CityProvider b;
    public final BasicInfoContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004¨\u0006*"}, d2 = {"Lapp/chalo/premiumbus/data/remote/PremiumBusRemoteDataSourceImpl$Companion;", "", "", "PATH_CITY", "Ljava/lang/String;", "PB_PRODUCTS_CONFIG_SUB_URL", "PRODUCT_CONFIGS_FOR_UI_SUB_URL", "COMPLETE_PRODUCT_CONFIG_SUB_URL", "PB_AVAILABLE_SLOTS_SUB_URL", "PB_STOP_PAIRS_BETWEEN_POINTS", "PB_TICKET_ORDER_CREATION_SUB_URL", "MOBILE_TICKETS_BOOKING_SUB_URL", "PB_TICKET_RECEIPT_SUB_URL", "PB_TRIP_DETAILS_SUB_URL", "PB_AVAILABLE_OPTIONS_SUB_URL", "PB_RESERVE_SEAT_THROUGH_PASS_SUB_URL", "PB_TICKET_UPDATE_OPTIONS_SUB_URL", "PB_TICKET_UPDATE_REASONS_SUB_URL", "PB_TICKET_CANCELLATION_SUB_URL", "PB_TICKET_RESCHEDULE_SUB_URL", "PB_PRE_BOOKING_FETCH_SLOTS_SUB_URL", "PB_PRE_BOOKING_REQUEST_SUB_URL", "PB_SEAT_SELECTION_LAYOUT_SUB_URL", "PB_BULK_BOOKING_SEAT_SELECTION_LAYOUT_SUB_URL", "PB_CHANGE_SEATS_SUB_URL", "PB_ELIGIBLE_STOP_CHANGES_SUB_URL", "PB_CHANGE_STOP_SUB_URL", "PARAM_BOOKING_ID", "PARAM_PRODUCT_TYPE", "PARAM_PRODUCT_SUB_TYPE", "PARAM_APP_VER", "PARAM_CONFIG_TYPE", "PARAM_ACTION_ID", "PARAM_SERVICE_TYPE", "PARAM_START_STOP_ID", "PARAM_END_STOP_ID", "PARAM_ROUTE_ID", "PARAM_USER_ID", "PARAM_CITY", "PARAM_USER_ACQUISITION_CHANNEL", "PARAM_TRIP_ID", "PARAM_USER_CAMPAIGN", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumBusRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, CompleteProductConfigFetchExceptionMapper completeProductConfigFetchExceptionMapper, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f7152a = networkManager;
        this.b = cityProvider;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object A(PBReserveTicketThroughPassRequestApiModel pBReserveTicketThroughPassRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1 premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1) {
            premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1 = (PremiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1 = new PremiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1 = new PremiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v2/pass-ticket/order");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PBReserveTicketThroughPassRequestApiModel.INSTANCE.serializer(), pBReserveTicketThroughPassRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$reserveSeatThroughPremiumBusPass$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(27));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PBReserveTicketThroughPassApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PBReserveTicketThroughPassApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PBReserveTicketThroughPassApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object B(PremiumBusChangeSeatsRequestApiModel premiumBusChangeSeatsRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$changeSeatsRequest$1 premiumBusRemoteDataSourceImpl$changeSeatsRequest$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$changeSeatsRequest$1) {
            premiumBusRemoteDataSourceImpl$changeSeatsRequest$1 = (PremiumBusRemoteDataSourceImpl$changeSeatsRequest$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$changeSeatsRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$changeSeatsRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$changeSeatsRequest$1 = new PremiumBusRemoteDataSourceImpl$changeSeatsRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$changeSeatsRequest$1 = new PremiumBusRemoteDataSourceImpl$changeSeatsRequest$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$changeSeatsRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$changeSeatsRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/user-change-seats");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PremiumBusChangeSeatsRequestApiModel.INSTANCE.serializer(), premiumBusChangeSeatsRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$changeSeatsRequest$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$changeSeatsRequest$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(15));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PremiumBusChangeSeatsApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PremiumBusChangeSeatsApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PremiumBusChangeSeatsApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object C(PremiumProductRescheduleApiRequestModel premiumProductRescheduleApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1 premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1) {
            premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1 = (PremiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1 = new PremiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1 = new PremiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/reschedule-booking");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PremiumProductRescheduleApiRequestModel.INSTANCE.serializer(), premiumProductRescheduleApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$reschedulePremiumReserveTicket$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(17));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PremiumProductRescheduleApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PremiumProductRescheduleApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PremiumProductRescheduleApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object D(PBTicketCancellationRequestApiRequestModel pBTicketCancellationRequestApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1 premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1) {
            premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1 = (PremiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1 = new PremiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1 = new PremiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/cancel-booking");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PBTicketCancellationRequestApiRequestModel.INSTANCE.serializer(), pBTicketCancellationRequestApiRequestModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$cancelPremiumReserveTicket$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(23));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PBTicketCancellationRequestApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PBTicketCancellationRequestApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PBTicketCancellationRequestApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object E(PBAvailableSlotsApiRequestModel pBAvailableSlotsApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1 premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("tub/v3/trips");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PBAvailableSlotsApiRequestModel.INSTANCE.serializer(), pBAvailableSlotsApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumBusAvailableSlots$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(24));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(PBAvailableSlotsApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object F(Map map, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String lowerCase = String.valueOf(this.b.h()).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            String strR = StringsKt.R("scheduler_v4/v5/{CITY}/stopPairsBetweenPoints", "{CITY}", lowerCase);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.h(map);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new pu0(3));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(PBOriginDestinationApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object G(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1 premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1) {
            premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1 = (PremiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1 = new PremiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1 = new PremiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/bookings");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, genericRequestData.f);
            networkRequestBuilderD.a("productType", str2, genericRequestData.f);
            networkRequestBuilderD.a("productSubType", str3, genericRequestData.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchMobileTicketProductById$1);
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
        String str4 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(18));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str4 != null) {
            try {
                json.getClass();
                objB = json.b(str4, BuiltinSerializersKt.c(GenericMobileTicketProductDataApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GenericMobileTicketProductDataApiResponseModel.class, e.getMessage(), str4));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GenericMobileTicketProductDataApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object j(String str, int i, ProductConfigServiceType productConfigServiceType, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1 premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1) {
            premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1 = (PremiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1) continuationImpl;
            int i2 = premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1 = new PremiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1 = new PremiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1.label;
        if (i3 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("configuration/v1/cities/{CITY}/minified-products", "{CITY}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("appVer", String.valueOf(i), genericRequestData.f);
            if (productConfigServiceType != null) {
                networkRequestBuilderD.a("serviceType", productConfigServiceType.name(), genericRequestData.f);
            }
            if (str2 != null) {
                networkRequestBuilderD.a("startStopId", str2, genericRequestData.f);
            }
            if (str3 != null) {
                networkRequestBuilderD.a("endStopId", str3, genericRequestData.f);
            }
            if (str4 != null) {
                networkRequestBuilderD.a("routeId", str4, genericRequestData.f);
            }
            if (str5 != null && str5.length() != 0) {
                networkRequestBuilderD.a("userAcquisitionChannel", str5, genericRequestData.f);
            }
            if (str6 != null) {
                networkRequestBuilderD.a("tripId", str6, genericRequestData.f);
            }
            if (str7 != null && str7.length() != 0) {
                networkRequestBuilderD.a("userCampaign", str7, genericRequestData.f);
            }
            if (z) {
                networkRequestBuilderD.b();
            }
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchProductConfigsForUi$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z2 = networkResponse.f6522a;
        String str8 = networkResponse.c;
        Object objB = null;
        if (!z2) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(29));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str8 != null) {
            try {
                json.getClass();
                objB = json.b(str8, BuiltinSerializersKt.c(ProductsConfigListForUiApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ProductsConfigListForUiApiResponseModel.class, e.getMessage(), str8));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ProductsConfigListForUiApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object l(String str, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1 premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1) {
            premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1 = (PremiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1 = new PremiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1 = new PremiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/eligible-stop-changes");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            networkRequestBuilderD.a("bookingId", str, networkRequestBuilderD.f6519a.f);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchEligibleStopChanges$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new pu0(2));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(EligibleStopChangesApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(EligibleStopChangesApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (EligibleStopChangesApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object n(PBTicketCreateOrderApiRequestModel pBTicketCreateOrderApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1 premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1) {
            premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1 = (PremiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1 = new PremiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1 = new PremiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/order");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PBTicketCreateOrderApiRequestModel.INSTANCE.serializer(), pBTicketCreateOrderApiRequestModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$createPremiumReserveTicketOrder$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(20));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(CreateOrderResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateOrderResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateOrderResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object o(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1 premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("configuration/v1/getReasons");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("actionId", premiumReserveTicketOptionAction.name(), networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationReasons$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(14));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(PremiumBusProductModificationReasonApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object p(AvailableSlotsRequestForPBPreBookingApiModel availableSlotsRequestForPBPreBookingApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1 premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1) {
            premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1 = (PremiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1 = new PremiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1 = new PremiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("tub/v2/trips/aggregatedSlots");
            networkRequestBuilderD.f(HttpRequestType.POST);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, networkRequestBuilderD.f6519a.e);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(AvailableSlotsRequestForPBPreBookingApiModel.INSTANCE.serializer(), availableSlotsRequestForPBPreBookingApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchAvailableSlotsForPreBooking$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(26));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(AvailableSlotsResponseForPBPreBookingApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(AvailableSlotsResponseForPBPreBookingApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (AvailableSlotsResponseForPBPreBookingApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object q(FetchCompleteProductConfigApiRequestModel fetchCompleteProductConfigApiRequestModel, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        PremiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1 premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1;
        Object objB;
        GenericChaloErrorResponse genericChaloErrorResponse;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1) {
            premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1 = (PremiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1 = new PremiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1 = new PremiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            if (z) {
                networkRequestBuilderD.b();
            }
            networkRequestBuilderD.j("configuration/v1/product/fetch-plans");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(FetchCompleteProductConfigApiRequestModel.INSTANCE.serializer(), fetchCompleteProductConfigApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchCompleteProductConfigById$1);
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
        NetworkCrashlyticsLogger networkCrashlyticsLogger = networkResponse.g;
        String str = networkResponse.c;
        Throwable noInternetException = null;
        objB = null;
        Object objB2 = null;
        if (z2) {
            Json json2 = ChaloJson.b;
            NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
            if (str != null) {
                try {
                    json2.getClass();
                    objB2 = json2.b(str, BuiltinSerializersKt.c(ProductConfigCompleteDetailsListApiResponseModel.INSTANCE.serializer()));
                } catch (Exception e) {
                    networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ProductConfigCompleteDetailsListApiResponseModel.class, e.getMessage(), str));
                    networkCrashlyticsLogger.b(networkSuccessResponseParseException);
                }
            }
            if (objB2 != null) {
                return (ProductConfigCompleteDetailsListApiResponseModel) objB2;
            }
            throw networkSuccessResponseParseException;
        }
        ErrorType errorType = networkResponse.b;
        if (str != null) {
            try {
                Json json3 = ChaloJson.b;
                json3.getClass();
                objB = json3.b(str, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e2) {
                networkCrashlyticsLogger.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e2.getMessage(), str)));
                objB = null;
            }
        } else {
            objB = null;
        }
        ChaloError chaloError = (ChaloError) objB;
        if (chaloError == null || (genericChaloErrorResponse = chaloError.f6493a) == null) {
            int iA = ErrorTypeKt.a(errorType);
            try {
                Json json4 = ChaloJson.b;
                if (str == null) {
                    str = "";
                }
                JsonObject jsonObjectG = JsonElementKt.g(json4.f(str));
                genericChaloErrorResponse = new GenericChaloErrorResponse(Intrinsics.d(JsonElementExtensionsKt.s(jsonObjectG, "errorType", "UNKNOWN"), "AUTHENTICATION_ERROR") ? TypedValues.CycleType.TYPE_CURVE_FIT : JsonElementExtensionsKt.n(iA, "errorCode", jsonObjectG), JsonElementExtensionsKt.s(jsonObjectG, "errorMessage", ""), null);
            } catch (Exception unused) {
                genericChaloErrorResponse = new GenericChaloErrorResponse(iA, "", null);
            }
        }
        int i3 = CompleteProductConfigFetchExceptionMapper.WhenMappings.f6981a[errorType.ordinal()];
        if (i3 == 1) {
            noInternetException = new ChaloLocalException.NoInternetException(vo1.j(ErrorTypeKt.a(errorType), "No internet. errorType: "));
        } else if (i3 == 2) {
            noInternetException = new ChaloLocalException.RequestCancelledException(vo1.j(ErrorTypeKt.a(errorType), "Request cancelled. errorType: "));
        } else if (i3 == 3) {
            noInternetException = new ChaloLocalException.ServerErrorException(genericChaloErrorResponse, nf1.i(ErrorTypeKt.a(errorType), networkResponse.f, "Some server error happened. errorType: ", " and responseCode: "));
        } else if (i3 == 4) {
            noInternetException = new ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException(genericChaloErrorResponse, vo1.j(ErrorTypeKt.a(errorType), "Unauthorized access, please try again later. errorType: "));
        } else if (i3 == 5) {
            noInternetException = new ChaloLocalException.UnexpectedException(genericChaloErrorResponse, vo1.j(ErrorTypeKt.a(errorType), "Something unexpected happened. errorType: "));
        }
        if (noInternetException == null) {
            throw new CompleteProductConfigFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse.b);
        }
        throw noInternetException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object r(BulkPreBookRequestApiModel bulkPreBookRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$bulkPreBookRequest$1 premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$bulkPreBookRequest$1) {
            premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1 = (PremiumBusRemoteDataSourceImpl$bulkPreBookRequest$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1 = new PremiumBusRemoteDataSourceImpl$bulkPreBookRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1 = new PremiumBusRemoteDataSourceImpl$bulkPreBookRequest$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v2/pass-ticket/bulkOrder");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(BulkPreBookRequestApiModel.INSTANCE.serializer(), bulkPreBookRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$bulkPreBookRequest$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(22));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(BulkPreBookResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(BulkPreBookResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (BulkPreBookResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object s(ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1 premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1;
        String lowerCase;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strB = CityProviderKt.b(this.b);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = "";
            }
            String strR = StringsKt.R("configuration/v4/cities/{CITY}/products", "{CITY}", lowerCase);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.a("appVer", String.valueOf(this.c.h()), genericRequestData.f);
            networkRequestBuilderD.a("configType", "premium", genericRequestData.f);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumBusProductsConfig$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(16));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(PBProductConfigResultApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PBProductConfigResultApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PBProductConfigResultApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object t(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1 premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/getActions");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, genericRequestData.f);
            networkRequestBuilderD.a("productType", str2, genericRequestData.f);
            networkRequestBuilderD.a("productSubType", str3, genericRequestData.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumBusProductModificationOptions$1);
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
        String str4 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(25));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str4 != null) {
            try {
                json.getClass();
                objB = json.b(str4, BuiltinSerializersKt.c(new ArrayListSerializer(PremiumBusProductModificationOptionApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str4));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object u(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1 premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1) {
            premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1 = (PremiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1 = new PremiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/receipt");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, genericRequestData.f);
            networkRequestBuilderD.a("productType", str2, genericRequestData.f);
            networkRequestBuilderD.a("productSubType", str3, genericRequestData.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPremiumReserveTicketReceipt$1);
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
        String str4 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(28));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str4 != null) {
            try {
                json.getClass();
                objB = json.b(str4, BuiltinSerializersKt.c(new ArrayListSerializer(PremiumReserveTicketReceiptApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str4));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object v(PBTripDetailsApiRequestModel pBTripDetailsApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1 premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1) {
            premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1 = (PremiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1 = new PremiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1 = new PremiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("tub/v1/bookingTripDetails");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PBTripDetailsApiRequestModel.INSTANCE.serializer(), pBTripDetailsApiRequestModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchTripDetailsForBookings$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new pu0(1));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(PBTripDetailsApiResponseModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object w(PremiumBusBookingPurchaseOptionApiRequestModel premiumBusBookingPurchaseOptionApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1 premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1) {
            premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1 = (PremiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1 = new PremiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1 = new PremiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v2/pass/purchase-options");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PremiumBusBookingPurchaseOptionApiRequestModel.INSTANCE.serializer(), premiumBusBookingPurchaseOptionApiRequestModel));
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchBookingAvailableOptions$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new pu0(0));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PremiumBusBookingAvailableOptionsApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PremiumBusBookingAvailableOptionsApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PremiumBusBookingAvailableOptionsApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object x(PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel premiumBusSeatSelectionLayoutForBulkBookingRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1 premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1) {
            premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1 = (PremiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1 = new PremiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1 = new PremiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("tub/v2/aggregatedSeatsWithLayout");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel.INSTANCE.serializer(), premiumBusSeatSelectionLayoutForBulkBookingRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPBAggregateSeatSelectionLayout$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new pu0(4));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(SeatInfoApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object y(PremiumBusSeatSelectionLayoutRequestApiModel premiumBusSeatSelectionLayoutRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1 premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1) {
            premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1 = (PremiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1 = new PremiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1 = new PremiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("tub/v1/availableSeatsWithLayout");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PremiumBusSeatSelectionLayoutRequestApiModel.INSTANCE.serializer(), premiumBusSeatSelectionLayoutRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$fetchPBSeatSelectionLayout$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(21));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(PremiumBusSeatSelectionLayoutResponseApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource
    public final Object z(ChangeStopApiRequestModel changeStopApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        PremiumBusRemoteDataSourceImpl$processChangeStopRequest$1 premiumBusRemoteDataSourceImpl$processChangeStopRequest$1;
        if (continuationImpl instanceof PremiumBusRemoteDataSourceImpl$processChangeStopRequest$1) {
            premiumBusRemoteDataSourceImpl$processChangeStopRequest$1 = (PremiumBusRemoteDataSourceImpl$processChangeStopRequest$1) continuationImpl;
            int i = premiumBusRemoteDataSourceImpl$processChangeStopRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteDataSourceImpl$processChangeStopRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteDataSourceImpl$processChangeStopRequest$1 = new PremiumBusRemoteDataSourceImpl$processChangeStopRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteDataSourceImpl$processChangeStopRequest$1 = new PremiumBusRemoteDataSourceImpl$processChangeStopRequest$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteDataSourceImpl$processChangeStopRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteDataSourceImpl$processChangeStopRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f7152a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/change-stop");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ChangeStopApiRequestModel.INSTANCE.serializer(), changeStopApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            premiumBusRemoteDataSourceImpl$processChangeStopRequest$1.label = 1;
            objC = chaloRequestE.c(premiumBusRemoteDataSourceImpl$processChangeStopRequest$1);
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
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new du0(19));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(ChangeStopApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ChangeStopApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ChangeStopApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
