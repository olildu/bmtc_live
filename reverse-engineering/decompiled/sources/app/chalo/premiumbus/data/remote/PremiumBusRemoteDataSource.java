package app.chalo.premiumbus.data.remote;

import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.premiumbus.data.models.api.request.ChangeStopApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBReserveTicketThroughPassRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationRequestApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusBookingPurchaseOptionApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusChangeSeatsRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumProductRescheduleApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiRequestModel;
import app.chalo.productbooking.common.data.models.api.request.AvailableSlotsRequestForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.request.BulkPreBookRequestApiModel;
import app.chalo.productbooking.common.data.models.api.request.FetchCompleteProductConfigApiRequestModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/remote/PremiumBusRemoteDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PremiumBusRemoteDataSource {
    Object A(PBReserveTicketThroughPassRequestApiModel pBReserveTicketThroughPassRequestApiModel, ContinuationImpl continuationImpl);

    Object B(PremiumBusChangeSeatsRequestApiModel premiumBusChangeSeatsRequestApiModel, ContinuationImpl continuationImpl);

    Object C(PremiumProductRescheduleApiRequestModel premiumProductRescheduleApiRequestModel, ContinuationImpl continuationImpl);

    Object D(PBTicketCancellationRequestApiRequestModel pBTicketCancellationRequestApiRequestModel, ContinuationImpl continuationImpl);

    Object E(PBAvailableSlotsApiRequestModel pBAvailableSlotsApiRequestModel, ContinuationImpl continuationImpl);

    Object F(Map map, ContinuationImpl continuationImpl);

    Object G(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object j(String str, int i, ProductConfigServiceType productConfigServiceType, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, ContinuationImpl continuationImpl);

    Object l(String str, ContinuationImpl continuationImpl);

    Object n(PBTicketCreateOrderApiRequestModel pBTicketCreateOrderApiRequestModel, ContinuationImpl continuationImpl);

    Object o(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, ContinuationImpl continuationImpl);

    Object p(AvailableSlotsRequestForPBPreBookingApiModel availableSlotsRequestForPBPreBookingApiModel, String str, ContinuationImpl continuationImpl);

    Object q(FetchCompleteProductConfigApiRequestModel fetchCompleteProductConfigApiRequestModel, boolean z, ContinuationImpl continuationImpl);

    Object r(BulkPreBookRequestApiModel bulkPreBookRequestApiModel, ContinuationImpl continuationImpl);

    Object s(ContinuationImpl continuationImpl);

    Object t(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object u(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object v(PBTripDetailsApiRequestModel pBTripDetailsApiRequestModel, ContinuationImpl continuationImpl);

    Object w(PremiumBusBookingPurchaseOptionApiRequestModel premiumBusBookingPurchaseOptionApiRequestModel, ContinuationImpl continuationImpl);

    Object x(PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel premiumBusSeatSelectionLayoutForBulkBookingRequestApiModel, ContinuationImpl continuationImpl);

    Object y(PremiumBusSeatSelectionLayoutRequestApiModel premiumBusSeatSelectionLayoutRequestApiModel, ContinuationImpl continuationImpl);

    Object z(ChangeStopApiRequestModel changeStopApiRequestModel, ContinuationImpl continuationImpl);
}
