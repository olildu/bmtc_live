package app.chalo.premiumbus.data.repository;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.productbooking.common.data.models.api.request.CompleteProductConfigFilterRequestModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.request.AvailableSlotsRequestForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.request.BulkPreBookRequestAppModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/repository/PremiumBusRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PremiumBusRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow a(PremiumBusRepository premiumBusRepository, String str, UserBookingsStatusType userBookingsStatusType, int i) {
            if ((i & 2) != 0) {
                userBookingsStatusType = UserBookingsStatusType.ALL;
            }
            return premiumBusRepository.R(str, userBookingsStatusType, false);
        }
    }

    Serializable A(String str, ContinuationImpl continuationImpl);

    Object B(String str, String str2, String str3, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ContinuationImpl continuationImpl);

    Serializable C(PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel, ContinuationImpl continuationImpl);

    Object D(PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel, Continuation continuation);

    Object E(BulkPreBookRequestAppModel bulkPreBookRequestAppModel, ContinuationImpl continuationImpl);

    PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1 F(String str);

    Object G(String str, String str2, String str3, Continuation continuation);

    Object H(PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, String str, String str2, String str3, List list, ContinuationImpl continuationImpl);

    Object I(ArrayList arrayList, ContinuationImpl continuationImpl);

    Object J(String str, String str2, String str3, String str4, long j, String str5, ContinuationImpl continuationImpl);

    Object K(AvailableSlotsRequestForPBPreBookingAppModel availableSlotsRequestForPBPreBookingAppModel, String str, ContinuationImpl continuationImpl);

    Serializable L(String str, String str2, long j, long j2, ContinuationImpl continuationImpl);

    Serializable M(String str, ContinuationImpl continuationImpl);

    Object N(String str, String str2, ContinuationImpl continuationImpl);

    Serializable O(List list, ContinuationImpl continuationImpl);

    Object P(String str, String str2, String str3, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, List list, ContinuationImpl continuationImpl);

    Object Q(String str, boolean z, String str2, String str3, CompleteProductConfigFilterRequestModel completeProductConfigFilterRequestModel, ContinuationImpl continuationImpl);

    Flow R(String str, UserBookingsStatusType userBookingsStatusType, boolean z);

    PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1 a(long j, String str, String str2);

    Object b(String str, List list, boolean z, Continuation continuation);

    PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1 c(String str);

    Object d(String str, ArrayList arrayList, Continuation continuation);

    Object e(Continuation continuation);

    Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation);

    Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl);

    Object h(String str, PremiumBusTripStatus premiumBusTripStatus, Continuation continuation);

    PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1 i(String str);

    Object j(String str, int i, ProductConfigServiceType productConfigServiceType, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, ContinuationImpl continuationImpl);

    PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1 k(String str, ArrayList arrayList);

    Object l(String str, ContinuationImpl continuationImpl);

    Object m(ArrayList arrayList, Continuation continuation);

    Object n(PBTicketCreateOrderApiRequestModel pBTicketCreateOrderApiRequestModel, ContinuationImpl continuationImpl);

    Serializable o(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, ContinuationImpl continuationImpl);

    Serializable p(PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel, ContinuationImpl continuationImpl);

    Object q(String str, Continuation continuation);

    PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1 r(String str, String str2);

    PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1 s(long j, long j2, String str, String str2);

    Serializable t(String str, ContinuationImpl continuationImpl);

    Object u(PremiumBusChangeSeatsRequestAppModel premiumBusChangeSeatsRequestAppModel, ContinuationImpl continuationImpl);

    Serializable v(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl);

    Serializable w(PremiumBusSeatSelectionLayoutRequestAppModel premiumBusSeatSelectionLayoutRequestAppModel, ContinuationImpl continuationImpl);

    Object x(PremiumReserveTicketAppModel premiumReserveTicketAppModel, Continuation continuation);

    Serializable y(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object z(String str, String str2, String str3, ContinuationImpl continuationImpl);
}
