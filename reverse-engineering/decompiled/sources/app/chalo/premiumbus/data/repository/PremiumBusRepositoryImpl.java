package app.chalo.premiumbus.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PBTicketCancellationRequestAppResponseModel;
import app.chalo.data.PbTicketCancellationRequestStatus;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.data.PremiumProductionModificationAdditionalInfoCtaActionType;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.data.ProductModificationSubtextColour;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.premiumbus.data.exceptions.PBRemoteToAppModelMappingFailedException;
import app.chalo.premiumbus.data.exceptions.ReserveSeatThroughPassFailedException;
import app.chalo.premiumbus.data.local.PremiumBusLocalDataSource;
import app.chalo.premiumbus.data.mappers.PBAppModelToEntityModelMappersKt;
import app.chalo.premiumbus.data.mappers.PBEntityToAppModelMappersKt;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.api.request.ChangeStopApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.ChangeStopApiResponseModel;
import app.chalo.premiumbus.data.models.api.request.ChangeStopException;
import app.chalo.premiumbus.data.models.api.request.PBReserveTicketThroughPassRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationReasonApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationRequestApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCancellationRequestApiResponseModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusBookingPurchaseOptionApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusChangeSeatsRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumProductRescheduleApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.EligibleStopApiModel;
import app.chalo.premiumbus.data.models.api.response.EligibleStopChangesApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsTripApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBOriginDestinationApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBReserveTicketThroughPassApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBTripDetailsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PbTripCommunicationApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PbTripCommunicationMessageApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingAvailableOptionsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingPurchaseOptionApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingPurchaseOptionDetailsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusChangeSeatsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationAdditionalInfoApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationOptionApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationReasonApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusSeatSelectionLayoutResponseApiModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusSeatSelectionLayoutResponseApiModelKt;
import app.chalo.premiumbus.data.models.api.response.PremiumProductRescheduleApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumReserveTicketReceiptApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumReserveTicketReceiptPassengerDetailsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel;
import app.chalo.premiumbus.data.models.api.response.SlotSearchRequestApiModel;
import app.chalo.premiumbus.data.models.api.response.UpcomingTripsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.VehicleBreakdownApiResponseModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ChangeStopAppModel;
import app.chalo.premiumbus.data.models.app.EligibleStopAppModel;
import app.chalo.premiumbus.data.models.app.EligibleStopChangesAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBRescheduleResponseAppModel;
import app.chalo.premiumbus.data.models.app.PBReserveTicketThroughPassResponseAppModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionType;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionDetailsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsAppResponseModel;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusChangeSeatsRequestAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatAssignmentType;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutRequestAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatSelectionLayoutResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotArrivalStatus;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotStatusType;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAckAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SlotSearchRequestAppModel;
import app.chalo.premiumbus.data.models.app.TripCommunicationAppModel;
import app.chalo.premiumbus.data.models.app.TripCommunicationIconType;
import app.chalo.premiumbus.data.models.app.UpcomingVehicleAppResponseModel;
import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketTripProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource;
import app.chalo.productbooking.common.data.exception.ProductConfigApiToAppModelFailedException;
import app.chalo.productbooking.common.data.mappers.ProductBookingCommonApiToAppModelsMappersKt;
import app.chalo.productbooking.common.data.models.api.request.AvailableSlotsRequestForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.request.BulkPreBookRequestApiModel;
import app.chalo.productbooking.common.data.models.api.request.CompleteProductConfigFilterRequestModel;
import app.chalo.productbooking.common.data.models.api.request.FetchCompleteProductConfigApiRequestModel;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsApiModel;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsResponseForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.response.BulkPreBookResponseApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.PBBulkBookingAvailableSlotsTripApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDisplayPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigForUiApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductsConfigListForUiApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDisplayPropsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDocumentPropsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.productbooking.common.data.models.app.request.AvailableSlotsRequestForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.request.BulkPreBookRequestAppModel;
import app.chalo.productbooking.common.data.models.app.response.AvailableSlotsResponseForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.response.BulkPreBookResponseAppModel;
import app.chalo.productbooking.common.data.models.app.response.BulkPreBookStatus;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.productbooking.common.data.models.app.response.SlotAvailableOnDateInfo;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModelKt;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/repository/PremiumBusRepositoryImpl;", "Lapp/chalo/premiumbus/data/repository/PremiumBusRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusRepositoryImpl implements PremiumBusRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusLocalDataSource f7153a;
    public final PremiumBusRemoteDataSource b;
    public final CoroutineContextProvider c;
    public final BasicInfoContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7154a;

        static {
            int[] iArr = new int[UserBookingsStatusType.values().length];
            try {
                iArr[UserBookingsStatusType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserBookingsStatusType.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserBookingsStatusType.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7154a = iArr;
        }
    }

    public PremiumBusRepositoryImpl(PremiumBusLocalDataSource premiumBusLocalDataSource, PremiumBusRemoteDataSource premiumBusRemoteDataSource, CoroutineContextProvider coroutineContextProvider, BasicInfoContract basicInfoContract) {
        this.f7153a = premiumBusLocalDataSource;
        this.b = premiumBusRemoteDataSource;
        this.c = coroutineContextProvider;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable A(String str, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1 premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1) {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1 = (PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1) continuationImpl;
            int i = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1(this, continuationImpl);
        }
        Object objJ = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1.label = 1;
            objJ = this.f7153a.j(str, premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithSameFirstBookingId$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        Iterable iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(PBEntityToAppModelMappersKt.a((PremiumReserveTicketEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object B(String str, String str2, String str3, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$cancelPremiumReserveTicket$1 premiumBusRepositoryImpl$cancelPremiumReserveTicket$1;
        PbTicketCancellationRequestStatus pbTicketCancellationRequestStatus;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$cancelPremiumReserveTicket$1) {
            premiumBusRepositoryImpl$cancelPremiumReserveTicket$1 = (PremiumBusRepositoryImpl$cancelPremiumReserveTicket$1) continuationImpl;
            int i = premiumBusRepositoryImpl$cancelPremiumReserveTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$cancelPremiumReserveTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$cancelPremiumReserveTicket$1 = new PremiumBusRepositoryImpl$cancelPremiumReserveTicket$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$cancelPremiumReserveTicket$1 = new PremiumBusRepositoryImpl$cancelPremiumReserveTicket$1(this, continuationImpl);
        }
        Object objD = premiumBusRepositoryImpl$cancelPremiumReserveTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$cancelPremiumReserveTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            PBTicketCancellationRequestApiRequestModel pBTicketCancellationRequestApiRequestModel = new PBTicketCancellationRequestApiRequestModel(str, str2, str3, new PBTicketCancellationReasonApiRequestModel(premiumBusProductModificationReasonAppModel.f2385a, premiumBusProductModificationReasonAppModel.b));
            premiumBusRepositoryImpl$cancelPremiumReserveTicket$1.label = 1;
            objD = this.b.D(pBTicketCancellationRequestApiRequestModel, premiumBusRepositoryImpl$cancelPremiumReserveTicket$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        PBTicketCancellationRequestApiResponseModel pBTicketCancellationRequestApiResponseModel = (PBTicketCancellationRequestApiResponseModel) objD;
        Intrinsics.i(pBTicketCancellationRequestApiResponseModel, "<this>");
        PbTicketCancellationRequestStatus.Companion companion = PbTicketCancellationRequestStatus.INSTANCE;
        String str4 = pBTicketCancellationRequestApiResponseModel.f6994a;
        companion.getClass();
        PbTicketCancellationRequestStatus[] pbTicketCancellationRequestStatusArrValues = PbTicketCancellationRequestStatus.values();
        int length = pbTicketCancellationRequestStatusArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                pbTicketCancellationRequestStatus = null;
                break;
            }
            pbTicketCancellationRequestStatus = pbTicketCancellationRequestStatusArrValues[i3];
            if (Intrinsics.d(pbTicketCancellationRequestStatus.getStatus(), str4)) {
                break;
            }
            i3++;
        }
        if (pbTicketCancellationRequestStatus == null) {
            pbTicketCancellationRequestStatus = PbTicketCancellationRequestStatus.UNKNOWN;
        }
        return new PBTicketCancellationRequestAppResponseModel(pbTicketCancellationRequestStatus, pBTicketCancellationRequestApiResponseModel.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable C(PremiumBusSeatSelectionLayoutForBulkBookingRequestAppModel premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1 premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1) {
            premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1 = (PremiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1 = new PremiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1 = new PremiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1(this, continuationImpl);
        }
        Object objX = premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            Intrinsics.i(premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel, "<this>");
            PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel premiumBusSeatSelectionLayoutForBulkBookingRequestApiModel = new PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel(premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.f7104a, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.b, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.c, premiumBusSeatSelectionLayoutForBulkBookingRequestAppModel.d);
            premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1.label = 1;
            objX = this.b.x(premiumBusSeatSelectionLayoutForBulkBookingRequestApiModel, premiumBusRepositoryImpl$fetchPBAggregateSeatSelectionLayout$1);
            if (objX == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objX).iterator();
        while (it.hasNext()) {
            SeatInfoAppModel seatInfoAppModelA = PremiumBusSeatSelectionLayoutResponseApiModelKt.a((SeatInfoApiModel) it.next());
            if (seatInfoAppModelA != null) {
                arrayList.add(seatInfoAppModelA);
            }
        }
        return arrayList;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object D(PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel, Continuation continuation) {
        String str = premiumReserveTicketReceiptAppModel.f7116a;
        long j = premiumReserveTicketReceiptAppModel.b;
        long j2 = premiumReserveTicketReceiptAppModel.c;
        String str2 = premiumReserveTicketReceiptAppModel.e;
        String str3 = premiumReserveTicketReceiptAppModel.d;
        String str4 = premiumReserveTicketReceiptAppModel.g;
        String str5 = premiumReserveTicketReceiptAppModel.h;
        String str6 = premiumReserveTicketReceiptAppModel.f;
        String str7 = premiumReserveTicketReceiptAppModel.i;
        String str8 = premiumReserveTicketReceiptAppModel.j;
        String str9 = premiumReserveTicketReceiptAppModel.k;
        Map map = premiumReserveTicketReceiptAppModel.l;
        RefundInfoAppModel refundInfoAppModel = premiumReserveTicketReceiptAppModel.m;
        Object objT = this.f7153a.t(new PremiumReserveTicketReceiptEntity(str, j, j2, str2, str3, str4, str5, str6, str7, str8, str9, map, refundInfoAppModel != null ? GenericMobileTicketProductApiResponseModelKt.a(refundInfoAppModel) : null), continuation);
        return objT == CoroutineSingletons.COROUTINE_SUSPENDED ? objT : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object E(BulkPreBookRequestAppModel bulkPreBookRequestAppModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$bulkPreBookRequest$1 premiumBusRepositoryImpl$bulkPreBookRequest$1;
        BulkPreBookStatus bulkPreBookStatus;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$bulkPreBookRequest$1) {
            premiumBusRepositoryImpl$bulkPreBookRequest$1 = (PremiumBusRepositoryImpl$bulkPreBookRequest$1) continuationImpl;
            int i = premiumBusRepositoryImpl$bulkPreBookRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$bulkPreBookRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$bulkPreBookRequest$1 = new PremiumBusRepositoryImpl$bulkPreBookRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$bulkPreBookRequest$1 = new PremiumBusRepositoryImpl$bulkPreBookRequest$1(this, continuationImpl);
        }
        Object objR = premiumBusRepositoryImpl$bulkPreBookRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$bulkPreBookRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objR);
            Intrinsics.i(bulkPreBookRequestAppModel, "<this>");
            String str = bulkPreBookRequestAppModel.f8230a;
            String str2 = bulkPreBookRequestAppModel.b;
            String str3 = bulkPreBookRequestAppModel.d;
            String str4 = bulkPreBookRequestAppModel.c;
            List list = bulkPreBookRequestAppModel.e;
            List list2 = bulkPreBookRequestAppModel.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(PremiumBusChangeSeatsRequestAppModelKt.a((SeatInfoAppModel) it.next()));
            }
            BulkPreBookRequestApiModel bulkPreBookRequestApiModel = new BulkPreBookRequestApiModel(str, str2, str4, str3, list, arrayList, bulkPreBookRequestAppModel.g);
            premiumBusRepositoryImpl$bulkPreBookRequest$1.label = 1;
            objR = this.b.r(bulkPreBookRequestApiModel, premiumBusRepositoryImpl$bulkPreBookRequest$1);
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objR);
        }
        BulkPreBookResponseApiModel bulkPreBookResponseApiModel = (BulkPreBookResponseApiModel) objR;
        Intrinsics.i(bulkPreBookResponseApiModel, "<this>");
        String str5 = bulkPreBookResponseApiModel.f8116a;
        BulkPreBookStatus.Companion companion = BulkPreBookStatus.INSTANCE;
        String status = bulkPreBookResponseApiModel.b;
        companion.getClass();
        Intrinsics.i(status, "status");
        BulkPreBookStatus[] bulkPreBookStatusArrValues = BulkPreBookStatus.values();
        int length = bulkPreBookStatusArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                bulkPreBookStatus = null;
                break;
            }
            bulkPreBookStatus = bulkPreBookStatusArrValues[i3];
            if (Intrinsics.d(bulkPreBookStatus.getStatus(), status)) {
                break;
            }
            i3++;
        }
        if (bulkPreBookStatus == null) {
            bulkPreBookStatus = BulkPreBookStatus.UNKNOWN;
        }
        return new BulkPreBookResponseAppModel(str5, bulkPreBookStatus);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1 F(String str) {
        final Flow flowU = this.f7153a.u(str);
        return new Flow<List<? extends PremiumReserveTripAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7168a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7168a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PremiumReserveTripEntity) it.next()).a());
                        }
                        anonymousClass1.label = 1;
                        if (this.f7168a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowU.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object G(String str, String str2, String str3, Continuation continuation) {
        return this.b.G(str, str2, str3, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object H(PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, String str, String str2, String str3, List list, ContinuationImpl continuationImpl) throws ReserveSeatThroughPassFailedException {
        PremiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1 premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1;
        String str4;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1) {
            premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1 = (PremiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1) continuationImpl;
            int i = premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1 = new PremiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1 = new PremiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1(this, continuationImpl);
        }
        Object objA = premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(PremiumBusChangeSeatsRequestAppModelKt.a((SeatInfoAppModel) it.next()));
            }
            PBReserveTicketThroughPassRequestApiModel pBReserveTicketThroughPassRequestApiModel = new PBReserveTicketThroughPassRequestApiModel(pBTicketSelectedTripDetailsApiRequestModel, str, str2, str3, arrayList);
            premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1.label = 1;
            objA = this.b.A(pBReserveTicketThroughPassRequestApiModel, premiumBusRepositoryImpl$reserveSeatThroughPremiumBusPassOnServer$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PBReserveTicketThroughPassApiResponseModel pBReserveTicketThroughPassApiResponseModel = (PBReserveTicketThroughPassApiResponseModel) objA;
        Intrinsics.i(pBReserveTicketThroughPassApiResponseModel, "<this>");
        String str5 = pBReserveTicketThroughPassApiResponseModel.f7030a;
        PBReserveTicketThroughPassResponseAppModel pBReserveTicketThroughPassResponseAppModel = (str5 == null || (str4 = pBReserveTicketThroughPassApiResponseModel.b) == null) ? null : new PBReserveTicketThroughPassResponseAppModel(str5, str4);
        if (pBReserveTicketThroughPassResponseAppModel != null) {
            return pBReserveTicketThroughPassResponseAppModel;
        }
        throw new ReserveSeatThroughPassFailedException(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:23:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final java.lang.Object I(java.util.ArrayList r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl.I(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object J(String str, String str2, String str3, String str4, long j, String str5, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchBookingAvailableOptions$1 premiumBusRepositoryImpl$fetchBookingAvailableOptions$1;
        PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel;
        PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel;
        PremiumBusBookingAvailableOptionType next;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchBookingAvailableOptions$1) {
            premiumBusRepositoryImpl$fetchBookingAvailableOptions$1 = (PremiumBusRepositoryImpl$fetchBookingAvailableOptions$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchBookingAvailableOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchBookingAvailableOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchBookingAvailableOptions$1 = new PremiumBusRepositoryImpl$fetchBookingAvailableOptions$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchBookingAvailableOptions$1 = new PremiumBusRepositoryImpl$fetchBookingAvailableOptions$1(this, continuationImpl);
        }
        Object objW = premiumBusRepositoryImpl$fetchBookingAvailableOptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchBookingAvailableOptions$1.label;
        if (i2 == 0) {
            ResultKt.b(objW);
            PremiumBusBookingPurchaseOptionApiRequestModel premiumBusBookingPurchaseOptionApiRequestModel = new PremiumBusBookingPurchaseOptionApiRequestModel(j, str, str2, str3, str4, str5);
            premiumBusRepositoryImpl$fetchBookingAvailableOptions$1.label = 1;
            objW = this.b.w(premiumBusBookingPurchaseOptionApiRequestModel, premiumBusRepositoryImpl$fetchBookingAvailableOptions$1);
            if (objW == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objW);
        }
        PremiumBusBookingAvailableOptionsApiResponseModel premiumBusBookingAvailableOptionsApiResponseModel = (PremiumBusBookingAvailableOptionsApiResponseModel) objW;
        Intrinsics.i(premiumBusBookingAvailableOptionsApiResponseModel, "<this>");
        List<PremiumBusBookingPurchaseOptionApiResponseModel> list = premiumBusBookingAvailableOptionsApiResponseModel.f7038a;
        ArrayList arrayList = new ArrayList();
        for (PremiumBusBookingPurchaseOptionApiResponseModel premiumBusBookingPurchaseOptionApiResponseModel : list) {
            Intrinsics.i(premiumBusBookingPurchaseOptionApiResponseModel, "<this>");
            Integer num = premiumBusBookingPurchaseOptionApiResponseModel.f7040a;
            int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            PremiumBusBookingAvailableOptionType.Companion companion = PremiumBusBookingAvailableOptionType.INSTANCE;
            String str6 = premiumBusBookingPurchaseOptionApiResponseModel.b;
            if (str6 == null) {
                str6 = "";
            }
            companion.getClass();
            Iterator<PremiumBusBookingAvailableOptionType> it = PremiumBusBookingAvailableOptionType.getEntries().iterator();
            do {
                premiumBusBookingPurchaseOptionDetailsAppModel = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getOptionTypeStr(), str6));
            PremiumBusBookingAvailableOptionType premiumBusBookingAvailableOptionType = next;
            if (premiumBusBookingAvailableOptionType == null) {
                premiumBusBookingPurchaseOptionAppModel = null;
            } else {
                PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel = premiumBusBookingPurchaseOptionApiResponseModel.c;
                if (premiumBusBookingPurchaseOptionDetailsApiResponseModel != null) {
                    String str7 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.f7042a;
                    String str8 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.b;
                    String str9 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.c;
                    String str10 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.d;
                    Long l = premiumBusBookingPurchaseOptionDetailsApiResponseModel.e;
                    Long l2 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.f;
                    Integer num2 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.g;
                    Boolean bool = premiumBusBookingPurchaseOptionDetailsApiResponseModel.h;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    String str11 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.i;
                    PassTierType.Companion companion2 = PassTierType.INSTANCE;
                    String str12 = premiumBusBookingPurchaseOptionDetailsApiResponseModel.j;
                    companion2.getClass();
                    premiumBusBookingPurchaseOptionDetailsAppModel = new PremiumBusBookingPurchaseOptionDetailsAppModel(str7, str8, str9, str10, l, l2, num2, zBooleanValue, str11, PassTierType.Companion.a(str12));
                }
                premiumBusBookingPurchaseOptionAppModel = new PremiumBusBookingPurchaseOptionAppModel(iIntValue, premiumBusBookingAvailableOptionType, premiumBusBookingPurchaseOptionDetailsAppModel);
            }
            if (premiumBusBookingPurchaseOptionAppModel != null) {
                arrayList.add(premiumBusBookingPurchaseOptionAppModel);
            }
        }
        return new PremiumBusBookingAvailableOptionsAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object K(AvailableSlotsRequestForPBPreBookingAppModel availableSlotsRequestForPBPreBookingAppModel, String str, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1 premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1;
        ?? arrayList;
        SlotAvailableOnDateInfo slotAvailableOnDateInfo;
        DateAvailabilityStatus next;
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel;
        String str2;
        Long l;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1) {
            premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1 = (PremiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1 = new PremiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1 = new PremiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1(this, continuationImpl);
        }
        Object objP = premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objP);
            Intrinsics.i(availableSlotsRequestForPBPreBookingAppModel, "<this>");
            AvailableSlotsRequestForPBPreBookingApiModel availableSlotsRequestForPBPreBookingApiModel = new AvailableSlotsRequestForPBPreBookingApiModel(availableSlotsRequestForPBPreBookingAppModel.f8229a, availableSlotsRequestForPBPreBookingAppModel.b, availableSlotsRequestForPBPreBookingAppModel.c, availableSlotsRequestForPBPreBookingAppModel.d, availableSlotsRequestForPBPreBookingAppModel.e, availableSlotsRequestForPBPreBookingAppModel.f, availableSlotsRequestForPBPreBookingAppModel.g);
            premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1.label = 1;
            objP = this.b.p(availableSlotsRequestForPBPreBookingApiModel, str, premiumBusRepositoryImpl$fetchAvailableSlotsForPreBooking$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        AvailableSlotsResponseForPBPreBookingApiModel availableSlotsResponseForPBPreBookingApiModel = (AvailableSlotsResponseForPBPreBookingApiModel) objP;
        Intrinsics.i(availableSlotsResponseForPBPreBookingApiModel, "<this>");
        List<AvailableSlotsApiModel> list = availableSlotsResponseForPBPreBookingApiModel.f8114a;
        if (list != null) {
            arrayList = new ArrayList();
            for (AvailableSlotsApiModel availableSlotsApiModel : list) {
                Intrinsics.i(availableSlotsApiModel, "<this>");
                String str3 = availableSlotsApiModel.b;
                Long l2 = availableSlotsApiModel.f8112a;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    DateAvailabilityStatus.INSTANCE.getClass();
                    Iterator<DateAvailabilityStatus> it = DateAvailabilityStatus.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.d(next.getStatus(), str3));
                    DateAvailabilityStatus dateAvailabilityStatus = next;
                    if (dateAvailabilityStatus == null) {
                        dateAvailabilityStatus = DateAvailabilityStatus.UNKNOWN;
                    }
                    DateAvailabilityStatus dateAvailabilityStatus2 = dateAvailabilityStatus;
                    List<PBBulkBookingAvailableSlotsTripApiResponseModel> list2 = availableSlotsApiModel.c;
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (PBBulkBookingAvailableSlotsTripApiResponseModel pBBulkBookingAvailableSlotsTripApiResponseModel : list2) {
                            Intrinsics.i(pBBulkBookingAvailableSlotsTripApiResponseModel, "<this>");
                            String str4 = pBBulkBookingAvailableSlotsTripApiResponseModel.f8143a;
                            if (str4 == null || (str2 = pBBulkBookingAvailableSlotsTripApiResponseModel.b) == null || (l = pBBulkBookingAvailableSlotsTripApiResponseModel.c) == null) {
                                pBBulkBookingAvailableSlotsTripAppResponseModel = null;
                            } else {
                                long jLongValue2 = l.longValue();
                                Long l3 = pBBulkBookingAvailableSlotsTripApiResponseModel.d;
                                if (l3 != null) {
                                    long jLongValue3 = l3.longValue();
                                    Long l4 = pBBulkBookingAvailableSlotsTripApiResponseModel.e;
                                    if (l4 != null) {
                                        long jLongValue4 = l4.longValue();
                                        PremiumBusSeatAssignmentType.Companion companion = PremiumBusSeatAssignmentType.INSTANCE;
                                        Integer num = pBBulkBookingAvailableSlotsTripApiResponseModel.f;
                                        companion.getClass();
                                        PremiumBusSeatAssignmentType premiumBusSeatAssignmentTypeA = PremiumBusSeatAssignmentType.Companion.a(num);
                                        if (premiumBusSeatAssignmentTypeA == null) {
                                            premiumBusSeatAssignmentTypeA = PremiumBusSeatAssignmentType.UNKNOWN;
                                        }
                                        PremiumBusSeatAssignmentType premiumBusSeatAssignmentType = premiumBusSeatAssignmentTypeA;
                                        List list3 = pBBulkBookingAvailableSlotsTripApiResponseModel.g;
                                        if (list3 == null) {
                                            list3 = EmptyList.f17557a;
                                        }
                                        pBBulkBookingAvailableSlotsTripAppResponseModel = new PBBulkBookingAvailableSlotsTripAppResponseModel(str4, str2, jLongValue2, jLongValue3, jLongValue4, premiumBusSeatAssignmentType, list3);
                                    } else {
                                        pBBulkBookingAvailableSlotsTripAppResponseModel = null;
                                    }
                                } else {
                                    pBBulkBookingAvailableSlotsTripAppResponseModel = null;
                                }
                            }
                            if (pBBulkBookingAvailableSlotsTripAppResponseModel != null) {
                                arrayList2.add(pBBulkBookingAvailableSlotsTripAppResponseModel);
                            }
                        }
                        slotAvailableOnDateInfo = new SlotAvailableOnDateInfo("date_" + l2 + "_remark_" + str3, jLongValue, dateAvailabilityStatus2, arrayList2);
                    } else {
                        slotAvailableOnDateInfo = null;
                    }
                } else {
                    slotAvailableOnDateInfo = null;
                }
                if (slotAvailableOnDateInfo != null) {
                    arrayList.add(slotAvailableOnDateInfo);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new AvailableSlotsResponseForPBPreBookingAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable L(String str, String str2, long j, long j2, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1 premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1) {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1 = (PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1) continuationImpl;
            int i = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1(this, continuationImpl);
        }
        PremiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1 premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2 = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$1;
        Object objR = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2.label;
        if (i2 == 0) {
            ResultKt.b(objR);
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2.label = 1;
            objR = this.f7153a.r(str, str2, j, j2, premiumBusRepositoryImpl$getAllPremiumReserveTicketsWithPendingTripFeedback$2);
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objR);
        }
        Iterable iterable = (Iterable) objR;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(PBEntityToAppModelMappersKt.a((PremiumReserveTicketEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable M(String str, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1 premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1) {
            premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1 = (PremiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1) continuationImpl;
            int i = premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1 = new PremiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1 = new PremiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1(this, continuationImpl);
        }
        Object objN = premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1.label = 1;
            objN = this.f7153a.n(str, premiumBusRepositoryImpl$getUniqueOriginDestinationPairs$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        Iterable iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(PBEntityToAppModelMappersKt.b((PremiumReserveTicketTripProperties) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object N(String str, String str2, ContinuationImpl continuationImpl) throws ChangeStopException {
        PremiumBusRepositoryImpl$processChangeStopRequest$1 premiumBusRepositoryImpl$processChangeStopRequest$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$processChangeStopRequest$1) {
            premiumBusRepositoryImpl$processChangeStopRequest$1 = (PremiumBusRepositoryImpl$processChangeStopRequest$1) continuationImpl;
            int i = premiumBusRepositoryImpl$processChangeStopRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$processChangeStopRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$processChangeStopRequest$1 = new PremiumBusRepositoryImpl$processChangeStopRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$processChangeStopRequest$1 = new PremiumBusRepositoryImpl$processChangeStopRequest$1(this, continuationImpl);
        }
        Object objZ = premiumBusRepositoryImpl$processChangeStopRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$processChangeStopRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objZ);
            ChangeStopApiRequestModel changeStopApiRequestModel = new ChangeStopApiRequestModel(str, str2);
            premiumBusRepositoryImpl$processChangeStopRequest$1.label = 1;
            objZ = this.b.z(changeStopApiRequestModel, premiumBusRepositoryImpl$processChangeStopRequest$1);
            if (objZ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objZ);
        }
        ChangeStopApiResponseModel changeStopApiResponseModel = (ChangeStopApiResponseModel) objZ;
        Intrinsics.i(changeStopApiResponseModel, "<this>");
        String str3 = changeStopApiResponseModel.f6986a;
        ChangeStopAppModel changeStopAppModel = str3 == null ? null : new ChangeStopAppModel(str3);
        if (changeStopAppModel != null) {
            return changeStopAppModel;
        }
        throw new ChangeStopException(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable O(List list, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchTripDetailsForBookings$1 premiumBusRepositoryImpl$fetchTripDetailsForBookings$1;
        PremiumReserveTicketStatus premiumReserveTicketStatusValueOf;
        PremiumBusTripStatus premiumBusTripStatusValueOf;
        String str;
        String str2;
        Iterator it;
        Long l;
        String str3;
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        List list2;
        ?? arrayList;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel;
        List list3;
        PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel;
        List list4;
        List list5;
        Integer num;
        UpcomingVehicleAppResponseModel upcomingVehicleAppResponseModel;
        List list6;
        TripCommunicationAppModel tripCommunicationAppModel;
        TripCommunicationIconType tripCommunicationIconType;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchTripDetailsForBookings$1) {
            premiumBusRepositoryImpl$fetchTripDetailsForBookings$1 = (PremiumBusRepositoryImpl$fetchTripDetailsForBookings$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchTripDetailsForBookings$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchTripDetailsForBookings$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchTripDetailsForBookings$1 = new PremiumBusRepositoryImpl$fetchTripDetailsForBookings$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchTripDetailsForBookings$1 = new PremiumBusRepositoryImpl$fetchTripDetailsForBookings$1(this, continuationImpl);
        }
        Object objV = premiumBusRepositoryImpl$fetchTripDetailsForBookings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchTripDetailsForBookings$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            PBTripDetailsApiRequestModel pBTripDetailsApiRequestModel = new PBTripDetailsApiRequestModel(list);
            premiumBusRepositoryImpl$fetchTripDetailsForBookings$1.label = 1;
            objV = this.b.v(pBTripDetailsApiRequestModel, premiumBusRepositoryImpl$fetchTripDetailsForBookings$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) objV).iterator();
        while (it2.hasNext()) {
            PBTripDetailsApiResponseModel pBTripDetailsApiResponseModel = (PBTripDetailsApiResponseModel) it2.next();
            Intrinsics.i(pBTripDetailsApiResponseModel, "<this>");
            Long l2 = pBTripDetailsApiResponseModel.h;
            String str4 = pBTripDetailsApiResponseModel.c;
            if (str4 == null) {
                it = it2;
                premiumBusTripPollingResponseAppModel = null;
            } else {
                PremiumReserveTicketStatus.Companion companion = PremiumReserveTicketStatus.INSTANCE;
                String strValueOf = String.valueOf(pBTripDetailsApiResponseModel.b);
                companion.getClass();
                try {
                    premiumReserveTicketStatusValueOf = PremiumReserveTicketStatus.valueOf(strValueOf);
                } catch (IllegalArgumentException unused) {
                    premiumReserveTicketStatusValueOf = null;
                }
                if (premiumReserveTicketStatusValueOf == null) {
                    it = it2;
                    premiumBusTripPollingResponseAppModel = null;
                } else {
                    String str5 = pBTripDetailsApiResponseModel.d;
                    String str6 = pBTripDetailsApiResponseModel.e;
                    if (str6 == null) {
                        it = it2;
                        premiumBusTripPollingResponseAppModel = null;
                    } else {
                        PremiumBusTripStatus.Companion companion2 = PremiumBusTripStatus.INSTANCE;
                        String strValueOf2 = String.valueOf(pBTripDetailsApiResponseModel.f7032a);
                        companion2.getClass();
                        try {
                            premiumBusTripStatusValueOf = PremiumBusTripStatus.valueOf(strValueOf2);
                        } catch (IllegalArgumentException unused2) {
                            premiumBusTripStatusValueOf = null;
                        }
                        if (premiumBusTripStatusValueOf == null || (str = pBTripDetailsApiResponseModel.f) == null || (str2 = pBTripDetailsApiResponseModel.g) == null || l2 == null) {
                            it = it2;
                            premiumBusTripPollingResponseAppModel = null;
                        } else {
                            long jLongValue = l2.longValue();
                            Long l3 = pBTripDetailsApiResponseModel.i;
                            if (l3 != null) {
                                long jLongValue2 = l3.longValue();
                                List list7 = pBTripDetailsApiResponseModel.j;
                                if (list7 == null) {
                                    list7 = EmptyList.f17557a;
                                }
                                List list8 = list7;
                                PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel = pBTripDetailsApiResponseModel.k;
                                if (pbTripCommunicationApiResponseModel == null || (list6 = pbTripCommunicationApiResponseModel.f7034a) == null) {
                                    it = it2;
                                    l = l2;
                                    str3 = str4;
                                    premiumReserveTicketStatus = premiumReserveTicketStatusValueOf;
                                    list2 = EmptyList.f17557a;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = list6.iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it2;
                                        PbTripCommunicationMessageApiResponseModel pbTripCommunicationMessageApiResponseModel = (PbTripCommunicationMessageApiResponseModel) it3.next();
                                        Intrinsics.i(pbTripCommunicationMessageApiResponseModel, "<this>");
                                        Long l4 = l2;
                                        Iterator it5 = it3;
                                        String str7 = pbTripCommunicationMessageApiResponseModel.f7036a;
                                        if (str7 == null) {
                                            tripCommunicationAppModel = null;
                                        } else {
                                            TripCommunicationIconType.Companion companion3 = TripCommunicationIconType.INSTANCE;
                                            String str8 = pbTripCommunicationMessageApiResponseModel.b;
                                            companion3.getClass();
                                            TripCommunicationIconType[] tripCommunicationIconTypeArrValues = TripCommunicationIconType.values();
                                            int length = tripCommunicationIconTypeArrValues.length;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= length) {
                                                    tripCommunicationIconType = null;
                                                    break;
                                                }
                                                tripCommunicationIconType = tripCommunicationIconTypeArrValues[i3];
                                                int i4 = i3;
                                                if (Intrinsics.d(tripCommunicationIconType.getIconType(), str8)) {
                                                    break;
                                                }
                                                i3 = i4 + 1;
                                            }
                                            if (tripCommunicationIconType == null) {
                                                tripCommunicationIconType = TripCommunicationIconType.DEFAULT;
                                            }
                                            tripCommunicationAppModel = new TripCommunicationAppModel(str7, tripCommunicationIconType);
                                        }
                                        if (tripCommunicationAppModel != null) {
                                            arrayList3.add(tripCommunicationAppModel);
                                        }
                                        it2 = it4;
                                        l2 = l4;
                                        it3 = it5;
                                        str4 = str4;
                                        premiumReserveTicketStatusValueOf = premiumReserveTicketStatusValueOf;
                                    }
                                    it = it2;
                                    l = l2;
                                    str3 = str4;
                                    premiumReserveTicketStatus = premiumReserveTicketStatusValueOf;
                                    list2 = arrayList3;
                                }
                                Long l5 = pBTripDetailsApiResponseModel.l;
                                long jLongValue3 = l5 != null ? l5.longValue() : l.longValue();
                                List list9 = pBTripDetailsApiResponseModel.m;
                                if (list9 != null) {
                                    arrayList = new ArrayList();
                                    Iterator it6 = list9.iterator();
                                    while (it6.hasNext()) {
                                        SeatInfoAppModel seatInfoAppModelA = PremiumBusSeatSelectionLayoutResponseApiModelKt.a((SeatInfoApiModel) it6.next());
                                        if (seatInfoAppModelA != null) {
                                            arrayList.add(seatInfoAppModelA);
                                        }
                                    }
                                } else {
                                    arrayList = EmptyList.f17557a;
                                }
                                ?? r20 = arrayList;
                                Boolean bool = pBTripDetailsApiResponseModel.n;
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                VehicleBreakdownApiResponseModel vehicleBreakdownApiResponseModel = pBTripDetailsApiResponseModel.o;
                                if (vehicleBreakdownApiResponseModel != null) {
                                    List<UpcomingTripsApiResponseModel> list10 = vehicleBreakdownApiResponseModel.f7068a;
                                    if (list10 != null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        List list11 = list2;
                                        for (UpcomingTripsApiResponseModel upcomingTripsApiResponseModel : list10) {
                                            Intrinsics.i(upcomingTripsApiResponseModel, "<this>");
                                            Long l6 = upcomingTripsApiResponseModel.e;
                                            List list12 = list11;
                                            String str9 = upcomingTripsApiResponseModel.f7066a;
                                            if (str9 == null || (num = upcomingTripsApiResponseModel.c) == null) {
                                                upcomingVehicleAppResponseModel = null;
                                            } else {
                                                int iIntValue = num.intValue();
                                                Integer num2 = upcomingTripsApiResponseModel.d;
                                                if (num2 != null) {
                                                    int iIntValue2 = num2.intValue();
                                                    String str10 = upcomingTripsApiResponseModel.b;
                                                    if (str10 == null) {
                                                        upcomingVehicleAppResponseModel = null;
                                                    } else {
                                                        upcomingVehicleAppResponseModel = new UpcomingVehicleAppResponseModel(str9, iIntValue, iIntValue2, str10, (l6 == null || l6.longValue() < 0) ? null : l6);
                                                    }
                                                } else {
                                                    upcomingVehicleAppResponseModel = null;
                                                }
                                            }
                                            if (upcomingVehicleAppResponseModel != null) {
                                                arrayList4.add(upcomingVehicleAppResponseModel);
                                            }
                                            list11 = list12;
                                        }
                                        list4 = list11;
                                        list5 = arrayList4;
                                    } else {
                                        list4 = list2;
                                        list5 = EmptyList.f17557a;
                                    }
                                    vehicleBreakdownAppResponseModel = new VehicleBreakdownAppResponseModel(list5);
                                    list3 = list4;
                                } else {
                                    vehicleBreakdownAppResponseModel = null;
                                    list3 = list2;
                                }
                                premiumBusTripPollingResponseAppModel = new PremiumBusTripPollingResponseAppModel(str3, premiumReserveTicketStatus, str5, str6, premiumBusTripStatusValueOf, str, str2, jLongValue, jLongValue2, list3, list8, r20, jLongValue3, zBooleanValue, vehicleBreakdownAppResponseModel);
                            } else {
                                it = it2;
                                premiumBusTripPollingResponseAppModel = null;
                            }
                        }
                    }
                }
            }
            if (premiumBusTripPollingResponseAppModel != null) {
                arrayList2.add(premiumBusTripPollingResponseAppModel);
            }
            it2 = it;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object P(String str, String str2, String str3, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, List list, ContinuationImpl continuationImpl) throws PBRemoteToAppModelMappingFailedException {
        PremiumBusRepositoryImpl$reschedulePremiumReserveTicket$1 premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$reschedulePremiumReserveTicket$1) {
            premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1 = (PremiumBusRepositoryImpl$reschedulePremiumReserveTicket$1) continuationImpl;
            int i = premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1 = new PremiumBusRepositoryImpl$reschedulePremiumReserveTicket$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1 = new PremiumBusRepositoryImpl$reschedulePremiumReserveTicket$1(this, continuationImpl);
        }
        Object objC = premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            PBTicketCancellationReasonApiRequestModel pBTicketCancellationReasonApiRequestModel = new PBTicketCancellationReasonApiRequestModel(premiumBusProductModificationReasonAppModel.f2385a, premiumBusProductModificationReasonAppModel.b);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(PremiumBusChangeSeatsRequestAppModelKt.a((SeatInfoAppModel) it.next()));
            }
            PremiumProductRescheduleApiRequestModel premiumProductRescheduleApiRequestModel = new PremiumProductRescheduleApiRequestModel(str, str2, str3, pBTicketCancellationReasonApiRequestModel, arrayList);
            premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1.label = 1;
            objC = this.b.C(premiumProductRescheduleApiRequestModel, premiumBusRepositoryImpl$reschedulePremiumReserveTicket$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        PremiumProductRescheduleApiResponseModel premiumProductRescheduleApiResponseModel = (PremiumProductRescheduleApiResponseModel) objC;
        Intrinsics.i(premiumProductRescheduleApiResponseModel, "<this>");
        String str4 = premiumProductRescheduleApiResponseModel.f7056a;
        PBRescheduleResponseAppModel pBRescheduleResponseAppModel = str4 == null ? null : new PBRescheduleResponseAppModel(str4);
        if (pBRescheduleResponseAppModel != null) {
            return pBRescheduleResponseAppModel;
        }
        throw new PBRemoteToAppModelMappingFailedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object Q(String str, boolean z, String str2, String str3, CompleteProductConfigFilterRequestModel completeProductConfigFilterRequestModel, ContinuationImpl continuationImpl) throws ProductConfigApiToAppModelFailedException {
        PremiumBusRepositoryImpl$fetchCompleteProductConfigById$1 premiumBusRepositoryImpl$fetchCompleteProductConfigById$1;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModelA;
        ?? arrayList;
        ?? arrayList2;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchCompleteProductConfigById$1) {
            premiumBusRepositoryImpl$fetchCompleteProductConfigById$1 = (PremiumBusRepositoryImpl$fetchCompleteProductConfigById$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchCompleteProductConfigById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchCompleteProductConfigById$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchCompleteProductConfigById$1 = new PremiumBusRepositoryImpl$fetchCompleteProductConfigById$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchCompleteProductConfigById$1 = new PremiumBusRepositoryImpl$fetchCompleteProductConfigById$1(this, continuationImpl);
        }
        Object objQ = premiumBusRepositoryImpl$fetchCompleteProductConfigById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchCompleteProductConfigById$1.label;
        if (i2 == 0) {
            ResultKt.b(objQ);
            FetchCompleteProductConfigApiRequestModel fetchCompleteProductConfigApiRequestModel = new FetchCompleteProductConfigApiRequestModel(str, str2, str3, completeProductConfigFilterRequestModel);
            premiumBusRepositoryImpl$fetchCompleteProductConfigById$1.label = 1;
            objQ = this.b.q(fetchCompleteProductConfigApiRequestModel, z, premiumBusRepositoryImpl$fetchCompleteProductConfigById$1);
            if (objQ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objQ);
        }
        ProductConfigCompleteDetailsListApiResponseModel productConfigCompleteDetailsListApiResponseModel = (ProductConfigCompleteDetailsListApiResponseModel) objQ;
        Intrinsics.i(productConfigCompleteDetailsListApiResponseModel, "<this>");
        ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = productConfigCompleteDetailsListApiResponseModel.f8153a;
        if (productConfigCompleteDetailsApiResponseModel == null || (productConfigCompleteDetailsAppModelA = ProductBookingCommonApiToAppModelsMappersKt.a(productConfigCompleteDetailsApiResponseModel)) == null) {
            productConfigCompleteDetailsListAppModel = null;
        } else {
            List list = productConfigCompleteDetailsListApiResponseModel.b;
            if (list != null) {
                List<ProductConfigDisplayPropsApiResponseModel> list2 = list;
                arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (ProductConfigDisplayPropsApiResponseModel productConfigDisplayPropsApiResponseModel : list2) {
                    Intrinsics.i(productConfigDisplayPropsApiResponseModel, "<this>");
                    arrayList.add(new ProductConfigDisplayPropsAppModel(productConfigDisplayPropsApiResponseModel.c, productConfigDisplayPropsApiResponseModel.f8155a, productConfigDisplayPropsApiResponseModel.b));
                }
            } else {
                arrayList = EmptyList.f17557a;
            }
            List list3 = productConfigCompleteDetailsListApiResponseModel.c;
            if (list3 != null) {
                List<ProductConfigDocumentPropsApiResponseModel> list4 = list3;
                arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                for (ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel : list4) {
                    Intrinsics.i(productConfigDocumentPropsApiResponseModel, "<this>");
                    arrayList2.add(new ProductConfigDocumentPropsAppModel(productConfigDocumentPropsApiResponseModel.f8159a, productConfigDocumentPropsApiResponseModel.b, productConfigDocumentPropsApiResponseModel.c, productConfigDocumentPropsApiResponseModel.d));
                }
            } else {
                arrayList2 = EmptyList.f17557a;
            }
            productConfigCompleteDetailsListAppModel = new ProductConfigCompleteDetailsListAppModel(productConfigCompleteDetailsAppModelA, arrayList, arrayList2);
        }
        if (productConfigCompleteDetailsListAppModel != null) {
            return productConfigCompleteDetailsListAppModel;
        }
        throw new ProductConfigApiToAppModelFailedException(null);
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Flow R(String str, final UserBookingsStatusType statusTypeToInclude, final boolean z) {
        Intrinsics.i(statusTypeToInclude, "statusTypeToInclude");
        final Flow flowX = this.f7153a.x(str);
        return FlowKt.z(new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsForCityAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsForCityAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7162a;
                public final /* synthetic */ PremiumBusRepositoryImpl b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ UserBookingsStatusType d;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsForCityAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsForCityAsFlow$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {63, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, PremiumBusRepositoryImpl premiumBusRepositoryImpl, boolean z, UserBookingsStatusType userBookingsStatusType) {
                    this.f7162a = flowCollector;
                    this.b = premiumBusRepositoryImpl;
                    this.c = z;
                    this.d = userBookingsStatusType;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0063  */
                /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
                
                    if (r12 == r1) goto L45;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
                
                    if (r7.emit((java.util.List) r6, r0) == r1) goto L45;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:22:0x0082). Please report as a decompilation issue!!! */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        Method dump skipped, instruction units count: 213
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsForCityAsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowX.collect(new AnonymousClass2(flowCollector, this, z, statusTypeToInclude), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, this.c.getDefault());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1 premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1) {
            premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1 = (PremiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1) continuationImpl;
            int i = premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1 = new PremiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1 = new PremiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1(this, continuationImpl);
        }
        Object objW = premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1.label;
        if (i2 == 0) {
            ResultKt.b(objW);
            premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1.label = 1;
            objW = this.f7153a.w(premiumBusRepositoryImpl$getPremiumReserveTripDetailsForBookingId$1);
            if (objW == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objW);
        }
        PremiumReserveTripEntity premiumReserveTripEntity = (PremiumReserveTripEntity) objW;
        if (premiumReserveTripEntity != null) {
            return premiumReserveTripEntity.a();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1 a(long j, String str, String str2) {
        final Flow flowA = this.f7153a.a(j, str, str2);
        return new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7164a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgement$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7164a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(PBEntityToAppModelMappersKt.a((PremiumReserveTicketEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f7164a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object b(String str, List list, boolean z, Continuation continuation) {
        Object objB = this.f7153a.b(str, list, z, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1 c(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        final Flow flowC = this.f7153a.c(bookingId);
        return new Flow<PremiumReserveTicketReceiptAppModel>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7172a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7172a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = anonymousClass1.label;
                    if (i3 == 0) {
                        ResultKt.b(obj2);
                        PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity = (PremiumReserveTicketReceiptEntity) obj;
                        if (premiumReserveTicketReceiptEntity != null) {
                            String str = premiumReserveTicketReceiptEntity.f7138a;
                            long j = premiumReserveTicketReceiptEntity.b;
                            long j2 = premiumReserveTicketReceiptEntity.c;
                            String str2 = premiumReserveTicketReceiptEntity.e;
                            String str3 = premiumReserveTicketReceiptEntity.d;
                            String str4 = premiumReserveTicketReceiptEntity.h;
                            String str5 = premiumReserveTicketReceiptEntity.f;
                            String str6 = premiumReserveTicketReceiptEntity.g;
                            String str7 = premiumReserveTicketReceiptEntity.i;
                            String str8 = premiumReserveTicketReceiptEntity.j;
                            String str9 = premiumReserveTicketReceiptEntity.k;
                            Map map = premiumReserveTicketReceiptEntity.l;
                            RefundInfoEntityModel refundInfoEntityModel = premiumReserveTicketReceiptEntity.m;
                            premiumReserveTicketReceiptAppModel = new PremiumReserveTicketReceiptAppModel(str, j, j2, str2, str3, str4, str5, str6, str7, str8, str9, map, refundInfoEntityModel != null ? RefundInfoEntityModelKt.a(refundInfoEntityModel) : null);
                            i = 1;
                        } else {
                            i = 1;
                            premiumReserveTicketReceiptAppModel = null;
                        }
                        anonymousClass1.label = i;
                        if (this.f7172a.emit(premiumReserveTicketReceiptAppModel, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowC.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object d(String str, ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(PBAppModelToEntityModelMappersKt.a((PremiumReserveTicketAppModel) obj));
        }
        Object objD = this.f7153a.d(str, arrayList2, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object e(Continuation continuation) {
        Object objE = this.f7153a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation) {
        Object objF = this.f7153a.f(str, str2, premiumReserveTicketAckType, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl) {
        Object objG = this.f7153a.g(str, premiumReserveTicketStatus, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object h(String str, PremiumBusTripStatus premiumBusTripStatus, Continuation continuation) {
        Object objH = this.f7153a.h(str, premiumBusTripStatus, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1 i(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return new PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1(this.f7153a.i(bookingId));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object j(String str, int i, ProductConfigServiceType productConfigServiceType, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchProductConfigsForUi$1 premiumBusRepositoryImpl$fetchProductConfigsForUi$1;
        ?? arrayList;
        String str8;
        String str9;
        ?? R;
        Iterator it;
        List list;
        ArrayList arrayList2;
        ProductConfigForUiAppModel productConfigForUiAppModel;
        ProductConfigServiceType productConfigServiceTypeValueOf;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchProductConfigsForUi$1) {
            premiumBusRepositoryImpl$fetchProductConfigsForUi$1 = (PremiumBusRepositoryImpl$fetchProductConfigsForUi$1) continuationImpl;
            int i2 = premiumBusRepositoryImpl$fetchProductConfigsForUi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchProductConfigsForUi$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchProductConfigsForUi$1 = new PremiumBusRepositoryImpl$fetchProductConfigsForUi$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchProductConfigsForUi$1 = new PremiumBusRepositoryImpl$fetchProductConfigsForUi$1(this, continuationImpl);
        }
        PremiumBusRepositoryImpl$fetchProductConfigsForUi$1 premiumBusRepositoryImpl$fetchProductConfigsForUi$2 = premiumBusRepositoryImpl$fetchProductConfigsForUi$1;
        Object objJ = premiumBusRepositoryImpl$fetchProductConfigsForUi$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusRepositoryImpl$fetchProductConfigsForUi$2.label;
        if (i3 == 0) {
            ResultKt.b(objJ);
            premiumBusRepositoryImpl$fetchProductConfigsForUi$2.label = 1;
            objJ = this.b.j(str, i, productConfigServiceType, str2, str3, str4, z, str6, str5, str7, premiumBusRepositoryImpl$fetchProductConfigsForUi$2);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        ProductsConfigListForUiApiResponseModel productsConfigListForUiApiResponseModel = (ProductsConfigListForUiApiResponseModel) objJ;
        Intrinsics.i(productsConfigListForUiApiResponseModel, "<this>");
        List list2 = productsConfigListForUiApiResponseModel.f8179a;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ProductConfigForUiApiResponseModel productConfigForUiApiResponseModel = (ProductConfigForUiApiResponseModel) it2.next();
                Intrinsics.i(productConfigForUiApiResponseModel, "<this>");
                String str10 = productConfigForUiApiResponseModel.f8167a;
                if (str10 == null || (str8 = productConfigForUiApiResponseModel.b) == null) {
                    it = it2;
                    productConfigForUiAppModel = null;
                } else {
                    String str11 = productConfigForUiApiResponseModel.c;
                    String str12 = productConfigForUiApiResponseModel.d;
                    if (str12 == null) {
                        it = it2;
                        productConfigForUiAppModel = null;
                    } else {
                        String str13 = productConfigForUiApiResponseModel.e;
                        Integer num = productConfigForUiApiResponseModel.f;
                        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                        List list3 = productConfigForUiApiResponseModel.g;
                        String str14 = productConfigForUiApiResponseModel.h;
                        Boolean bool = productConfigForUiApiResponseModel.k;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = productConfigForUiApiResponseModel.l;
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        String str15 = productConfigForUiApiResponseModel.m;
                        if (str15 == null || (str9 = productConfigForUiApiResponseModel.n) == null) {
                            it = it2;
                            productConfigForUiAppModel = null;
                        } else {
                            List list4 = productConfigForUiApiResponseModel.o;
                            if (list4 != null) {
                                List list5 = list4;
                                R = new ArrayList(CollectionsKt.v(list5, 10));
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    String str16 = (String) it3.next();
                                    ProductConfigServiceType.INSTANCE.getClass();
                                    Iterator it4 = it3;
                                    Intrinsics.i(str16, "str");
                                    try {
                                        productConfigServiceTypeValueOf = ProductConfigServiceType.valueOf(str16);
                                    } catch (IllegalArgumentException unused) {
                                        productConfigServiceTypeValueOf = ProductConfigServiceType.UNKNOWN;
                                    }
                                    R.add(productConfigServiceTypeValueOf);
                                    it3 = it4;
                                }
                            } else {
                                R = CollectionsKt.R(ProductConfigServiceType.REGULAR);
                            }
                            ?? r30 = R;
                            BrandingApiModel brandingApiModel = productConfigForUiApiResponseModel.j;
                            BrandingDetails brandingDetails = new BrandingDetails(brandingApiModel != null && brandingApiModel.f7144a);
                            String str17 = productConfigForUiApiResponseModel.p;
                            String str18 = productConfigForUiApiResponseModel.q;
                            String str19 = productConfigForUiApiResponseModel.r;
                            List list6 = productConfigForUiApiResponseModel.s;
                            if (list6 != null) {
                                List list7 = list6;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    Iterator it6 = it2;
                                    ProductImageAppModel productImageAppModelB = ProductBookingCommonApiToAppModelsMappersKt.b((ProductImageApiResponseModel) it5.next());
                                    if (productImageAppModelB != null) {
                                        arrayList3.add(productImageAppModelB);
                                    }
                                    it2 = it6;
                                }
                                it = it2;
                                list = arrayList3;
                            } else {
                                it = it2;
                                list = EmptyList.f17557a;
                            }
                            List list8 = list;
                            String str20 = productConfigForUiApiResponseModel.t;
                            ProductValidationType.Companion companion = ProductValidationType.INSTANCE;
                            String str21 = productConfigForUiApiResponseModel.i;
                            companion.getClass();
                            ProductValidationType productValidationTypeA = ProductValidationType.Companion.a(str21);
                            List list9 = productConfigForUiApiResponseModel.u;
                            if (list9 != null) {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it7 = list9.iterator();
                                while (it7.hasNext()) {
                                    ApplicableRuleAppModel applicableRuleAppModelB = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it7.next());
                                    if (applicableRuleAppModelB != null) {
                                        arrayList4.add(applicableRuleAppModelB);
                                    }
                                }
                                arrayList2 = arrayList4;
                            } else {
                                arrayList2 = null;
                            }
                            productConfigForUiAppModel = new ProductConfigForUiAppModel(str10, str8, str11, str12, str13, iIntValue, list3, str14, zBooleanValue, zBooleanValue2, productValidationTypeA, str15, str9, r30, brandingDetails, str17, str18, str19, list8, str20, arrayList2);
                        }
                    }
                }
                if (productConfigForUiAppModel != null) {
                    arrayList.add(productConfigForUiAppModel);
                }
                it2 = it;
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new ProductsConfigListForUiAppModel(arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1 k(String cityId, ArrayList arrayList) {
        Intrinsics.i(cityId, "cityId");
        final Flow flowY = this.f7153a.y(cityId, arrayList);
        return new Flow<List<? extends PremiumReserveTripAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7166a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$$inlined$mapFlowWithMappedListItems$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7166a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PremiumReserveTripEntity) it.next()).a());
                        }
                        anonymousClass1.label = 1;
                        if (this.f7166a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowY.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object l(String str, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchEligibleStopChanges$1 premiumBusRepositoryImpl$fetchEligibleStopChanges$1;
        ?? arrayList;
        String str2;
        Long l;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchEligibleStopChanges$1) {
            premiumBusRepositoryImpl$fetchEligibleStopChanges$1 = (PremiumBusRepositoryImpl$fetchEligibleStopChanges$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchEligibleStopChanges$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchEligibleStopChanges$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchEligibleStopChanges$1 = new PremiumBusRepositoryImpl$fetchEligibleStopChanges$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchEligibleStopChanges$1 = new PremiumBusRepositoryImpl$fetchEligibleStopChanges$1(this, continuationImpl);
        }
        Object objL = premiumBusRepositoryImpl$fetchEligibleStopChanges$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchEligibleStopChanges$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            premiumBusRepositoryImpl$fetchEligibleStopChanges$1.label = 1;
            objL = this.b.l(str, premiumBusRepositoryImpl$fetchEligibleStopChanges$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        EligibleStopChangesApiResponseModel eligibleStopChangesApiResponseModel = (EligibleStopChangesApiResponseModel) objL;
        Intrinsics.i(eligibleStopChangesApiResponseModel, "<this>");
        List<EligibleStopApiModel> list = eligibleStopChangesApiResponseModel.f7020a;
        if (list != null) {
            arrayList = new ArrayList();
            for (EligibleStopApiModel eligibleStopApiModel : list) {
                Intrinsics.i(eligibleStopApiModel, "<this>");
                String str3 = eligibleStopApiModel.f7018a;
                EligibleStopAppModel eligibleStopAppModel = null;
                if (str3 != null && (str2 = eligibleStopApiModel.b) != null && (l = eligibleStopApiModel.c) != null) {
                    eligibleStopAppModel = new EligibleStopAppModel(str3, str2, l.longValue());
                }
                if (eligibleStopAppModel != null) {
                    arrayList.add(eligibleStopAppModel);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new EligibleStopChangesAppModel(arrayList);
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object m(ArrayList arrayList, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PremiumReserveTripAppModel premiumReserveTripAppModel = (PremiumReserveTripAppModel) obj;
            arrayList2.add(new PremiumReserveTripEntity(premiumReserveTripAppModel.f7119a, premiumReserveTripAppModel.b, premiumReserveTripAppModel.c, premiumReserveTripAppModel.d, premiumReserveTripAppModel.e));
        }
        Object objV = this.f7153a.v(arrayList2, continuation);
        return objV == CoroutineSingletons.COROUTINE_SUSPENDED ? objV : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object n(PBTicketCreateOrderApiRequestModel pBTicketCreateOrderApiRequestModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$createPremiumReserveTicketOrder$1 premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$createPremiumReserveTicketOrder$1) {
            premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1 = (PremiumBusRepositoryImpl$createPremiumReserveTicketOrder$1) continuationImpl;
            int i = premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1 = new PremiumBusRepositoryImpl$createPremiumReserveTicketOrder$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1 = new PremiumBusRepositoryImpl$createPremiumReserveTicketOrder$1(this, continuationImpl);
        }
        Object objN = premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1.label = 1;
            objN = this.b.n(pBTicketCreateOrderApiRequestModel, premiumBusRepositoryImpl$createPremiumReserveTicketOrder$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objN);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable o(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1 premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1;
        PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1) {
            premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1 = (PremiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1 = new PremiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1 = new PremiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1(this, continuationImpl);
        }
        Object objO = premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1.label = 1;
            objO = this.b.o(premiumReserveTicketOptionAction, premiumBusRepositoryImpl$fetchPremiumBusProductModificationReasons$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
        }
        ArrayList arrayList = new ArrayList();
        for (PremiumBusProductModificationReasonApiResponseModel premiumBusProductModificationReasonApiResponseModel : (Iterable) objO) {
            Intrinsics.i(premiumBusProductModificationReasonApiResponseModel, "<this>");
            Integer num = premiumBusProductModificationReasonApiResponseModel.f7050a;
            if (num != null) {
                int iIntValue = num.intValue();
                String str = premiumBusProductModificationReasonApiResponseModel.b;
                if (str == null) {
                    premiumBusProductModificationReasonAppModel = null;
                } else {
                    premiumBusProductModificationReasonAppModel = new PremiumBusProductModificationReasonAppModel(iIntValue, str);
                }
            } else {
                premiumBusProductModificationReasonAppModel = null;
            }
            if (premiumBusProductModificationReasonAppModel != null) {
                arrayList.add(premiumBusProductModificationReasonAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable p(PBAvailableSlotsAppRequestModel pBAvailableSlotsAppRequestModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1 premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1;
        String str;
        ?? arrayList;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        String str2;
        String str3;
        PremiumBusSlotStatusType premiumBusSlotStatusType;
        PremiumBusTripStatus premiumBusTripStatusValueOf;
        PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus;
        ArrayList arrayList2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        Long l;
        PremiumBusSlotStatusType premiumBusSlotStatusTypeValueOf;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1) {
            premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1 = (PremiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1 = new PremiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1 = new PremiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1(this, continuationImpl);
        }
        Object objE = premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            Intrinsics.i(pBAvailableSlotsAppRequestModel, "<this>");
            String str4 = pBAvailableSlotsAppRequestModel.f7085a;
            String str5 = pBAvailableSlotsAppRequestModel.b;
            String str6 = pBAvailableSlotsAppRequestModel.c;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(pBAvailableSlotsAppRequestModel.d, 10));
            for (Iterator it = r2.iterator(); it.hasNext(); it = it) {
                SlotSearchRequestAppModel slotSearchRequestAppModel = (SlotSearchRequestAppModel) it.next();
                Intrinsics.i(slotSearchRequestAppModel, "<this>");
                arrayList3.add(new SlotSearchRequestApiModel(slotSearchRequestAppModel.f7124a, slotSearchRequestAppModel.b, slotSearchRequestAppModel.c, slotSearchRequestAppModel.d, slotSearchRequestAppModel.e, slotSearchRequestAppModel.f, slotSearchRequestAppModel.g));
            }
            PBAvailableSlotsApiRequestModel pBAvailableSlotsApiRequestModel = new PBAvailableSlotsApiRequestModel(str4, str5, str6, pBAvailableSlotsAppRequestModel.e, arrayList3);
            premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1.label = 1;
            objE = this.b.E(pBAvailableSlotsApiRequestModel, premiumBusRepositoryImpl$fetchPremiumBusAvailableSlots$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        ArrayList arrayList4 = new ArrayList();
        for (PBAvailableSlotsApiResponseModel pBAvailableSlotsApiResponseModel : (Iterable) objE) {
            Intrinsics.i(pBAvailableSlotsApiResponseModel, "<this>");
            String str7 = pBAvailableSlotsApiResponseModel.f7024a;
            if (str7 == null || (str = pBAvailableSlotsApiResponseModel.b) == null) {
                pBAvailableSlotsInfoAppModel = null;
            } else {
                List<PBAvailableSlotsTripApiResponseModel> list = pBAvailableSlotsApiResponseModel.c;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (PBAvailableSlotsTripApiResponseModel pBAvailableSlotsTripApiResponseModel : list) {
                        Intrinsics.i(pBAvailableSlotsTripApiResponseModel, "<this>");
                        Long l2 = pBAvailableSlotsTripApiResponseModel.f;
                        String str8 = pBAvailableSlotsTripApiResponseModel.b;
                        String str9 = pBAvailableSlotsTripApiResponseModel.f7026a;
                        String str10 = pBAvailableSlotsTripApiResponseModel.c;
                        if (str10 == null || (str2 = pBAvailableSlotsTripApiResponseModel.d) == null || (str3 = pBAvailableSlotsTripApiResponseModel.e) == null) {
                            pBAvailableSlotsTripAppModel = null;
                        } else {
                            Integer num = pBAvailableSlotsTripApiResponseModel.i;
                            if (str9 == null || str8 == null || l2 == null) {
                                pBAvailableSlotsTripAppModel = null;
                            } else {
                                long jLongValue = l2.longValue();
                                Long l3 = pBAvailableSlotsTripApiResponseModel.g;
                                if (l3 != null) {
                                    long jLongValue2 = l3.longValue();
                                    String str11 = pBAvailableSlotsTripApiResponseModel.m;
                                    if (str11 != null) {
                                        PremiumBusSlotStatusType.INSTANCE.getClass();
                                        try {
                                            premiumBusSlotStatusTypeValueOf = PremiumBusSlotStatusType.valueOf(str11);
                                        } catch (IllegalArgumentException unused) {
                                            premiumBusSlotStatusTypeValueOf = null;
                                        }
                                        premiumBusSlotStatusType = premiumBusSlotStatusTypeValueOf;
                                    } else {
                                        premiumBusSlotStatusType = null;
                                    }
                                    Long l4 = pBAvailableSlotsTripApiResponseModel.k;
                                    PremiumBusTripStatus.Companion companion = PremiumBusTripStatus.INSTANCE;
                                    String str12 = pBAvailableSlotsTripApiResponseModel.l;
                                    if (str12 == null) {
                                        str12 = "";
                                    }
                                    companion.getClass();
                                    try {
                                        premiumBusTripStatusValueOf = PremiumBusTripStatus.valueOf(str12);
                                    } catch (IllegalArgumentException unused2) {
                                        premiumBusTripStatusValueOf = null;
                                    }
                                    if (premiumBusTripStatusValueOf == null || premiumBusTripStatusValueOf != PremiumBusTripStatus.ACTIVE || (l = pBAvailableSlotsTripApiResponseModel.k) == null) {
                                        premiumBusSlotArrivalStatus = PremiumBusSlotArrivalStatus.UNKNOWN;
                                    } else {
                                        long jLongValue3 = l.longValue();
                                        long j = 60000;
                                        long j2 = jLongValue3 / j;
                                        long jLongValue4 = l2.longValue() / j;
                                        premiumBusSlotArrivalStatus = jLongValue4 < j2 ? PremiumBusSlotArrivalStatus.EARLY : jLongValue4 == j2 ? PremiumBusSlotArrivalStatus.ON_TIME : PremiumBusSlotArrivalStatus.DELAY;
                                    }
                                    PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus2 = premiumBusSlotArrivalStatus;
                                    List list2 = pBAvailableSlotsTripApiResponseModel.j;
                                    if (list2 == null) {
                                        list2 = EmptyList.f17557a;
                                    }
                                    List list3 = list2;
                                    String str13 = pBAvailableSlotsTripApiResponseModel.n;
                                    Integer num2 = pBAvailableSlotsTripApiResponseModel.h;
                                    String str14 = str10 + "_" + str9 + "_" + str8;
                                    PremiumBusSeatAssignmentType.Companion companion2 = PremiumBusSeatAssignmentType.INSTANCE;
                                    Integer num3 = pBAvailableSlotsTripApiResponseModel.o;
                                    companion2.getClass();
                                    PremiumBusSeatAssignmentType premiumBusSeatAssignmentTypeA = PremiumBusSeatAssignmentType.Companion.a(num3);
                                    if (premiumBusSeatAssignmentTypeA == null) {
                                        premiumBusSeatAssignmentTypeA = PremiumBusSeatAssignmentType.UNKNOWN;
                                    }
                                    PremiumBusSeatAssignmentType premiumBusSeatAssignmentType = premiumBusSeatAssignmentTypeA;
                                    List list4 = pBAvailableSlotsTripApiResponseModel.p;
                                    if (list4 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it2 = list4.iterator();
                                        while (it2.hasNext()) {
                                            Iterator it3 = it2;
                                            ApplicableRuleAppModel applicableRuleAppModelB = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it2.next());
                                            if (applicableRuleAppModelB != null) {
                                                arrayList5.add(applicableRuleAppModelB);
                                            }
                                            it2 = it3;
                                        }
                                        arrayList2 = arrayList5;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    Boolean bool = pBAvailableSlotsTripApiResponseModel.q;
                                    pBAvailableSlotsTripAppModel = new PBAvailableSlotsTripAppModel(str14, str2, str3, str9, str8, str10, jLongValue, jLongValue2, num2, num, list3, premiumBusSlotStatusType, l4, premiumBusSlotArrivalStatus2, str13, premiumBusSeatAssignmentType, arrayList2, bool != null ? bool.booleanValue() : true);
                                } else {
                                    pBAvailableSlotsTripAppModel = null;
                                }
                            }
                        }
                        if (pBAvailableSlotsTripAppModel != null) {
                            arrayList.add(pBAvailableSlotsTripAppModel);
                        }
                    }
                } else {
                    arrayList = EmptyList.f17557a;
                }
                pBAvailableSlotsInfoAppModel = new PBAvailableSlotsInfoAppModel(str7, str, arrayList);
            }
            if (pBAvailableSlotsInfoAppModel != null) {
                arrayList4.add(pBAvailableSlotsInfoAppModel);
            }
        }
        return arrayList4;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object q(String str, Continuation continuation) {
        Object objQ = this.f7153a.q(str, continuation);
        return objQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objQ : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1 r(String str, String str2) {
        final Flow flowO = this.f7153a.o(str, str2);
        return new Flow<PremiumReserveTicketAckAppModel>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7156a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7156a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        PremiumReserveTicketAckEntity premiumReserveTicketAckEntity = (PremiumReserveTicketAckEntity) obj;
                        PremiumReserveTicketAckAppModel premiumReserveTicketAckAppModel = premiumReserveTicketAckEntity != null ? new PremiumReserveTicketAckAppModel(premiumReserveTicketAckEntity.f7134a, premiumReserveTicketAckEntity.b, premiumReserveTicketAckEntity.c, premiumReserveTicketAckEntity.d, premiumReserveTicketAckEntity.e, premiumReserveTicketAckEntity.f, premiumReserveTicketAckEntity.g) : null;
                        anonymousClass1.label = 1;
                        if (this.f7156a.emit(premiumReserveTicketAckAppModel, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowO.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1] */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1 s(long j, long j2, String str, String str2) {
        final Flow flowS = this.f7153a.s(j, j2, str, str2);
        return new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7158a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketForCityBetweenGivenTime$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7158a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(PBEntityToAppModelMappersKt.a((PremiumReserveTicketEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f7158a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowS.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable t(String str, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1 premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1;
        String str2;
        String str3;
        String str4;
        String str5;
        Map mapD;
        PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1) {
            premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1 = (PremiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1 = new PremiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1 = new PremiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1(this, continuationImpl);
        }
        Object objU = premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objU);
            premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1.label = 1;
            objU = this.b.u(str, "mobileTicket", "premiumReserveTicket", premiumBusRepositoryImpl$fetchPremiumReserveTicketReceipt$1);
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objU);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objU).iterator();
        while (it.hasNext()) {
            PremiumReserveTicketReceiptApiResponseModel premiumReserveTicketReceiptApiResponseModel = (PremiumReserveTicketReceiptApiResponseModel) it.next();
            Intrinsics.i(premiumReserveTicketReceiptApiResponseModel, "<this>");
            String str6 = premiumReserveTicketReceiptApiResponseModel.f7058a;
            if (str6 == null || (str2 = premiumReserveTicketReceiptApiResponseModel.i) == null || (str3 = premiumReserveTicketReceiptApiResponseModel.j) == null) {
                it = it;
                premiumReserveTicketReceiptAppModel = null;
            } else {
                Long l = premiumReserveTicketReceiptApiResponseModel.b;
                long jLongValue = l != null ? l.longValue() : -1L;
                Long l2 = premiumReserveTicketReceiptApiResponseModel.c;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                String str7 = premiumReserveTicketReceiptApiResponseModel.d;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = premiumReserveTicketReceiptApiResponseModel.e;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = premiumReserveTicketReceiptApiResponseModel.f;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = premiumReserveTicketReceiptApiResponseModel.g;
                if (str10 == null) {
                    str10 = "";
                }
                String str11 = premiumReserveTicketReceiptApiResponseModel.h;
                String str12 = str11 == null ? "" : str11;
                String str13 = premiumReserveTicketReceiptApiResponseModel.k;
                if (str13 == null) {
                    it = it;
                    premiumReserveTicketReceiptAppModel = null;
                } else {
                    List list = premiumReserveTicketReceiptApiResponseModel.l;
                    if (list != null) {
                        List list2 = list;
                        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
                        if (iG < 16) {
                            iG = 16;
                        }
                        mapD = new LinkedHashMap(iG);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = it2;
                            PremiumReserveTicketReceiptPassengerDetailsApiResponseModel premiumReserveTicketReceiptPassengerDetailsApiResponseModel = (PremiumReserveTicketReceiptPassengerDetailsApiResponseModel) it2.next();
                            String str14 = str10;
                            String str15 = premiumReserveTicketReceiptPassengerDetailsApiResponseModel.b;
                            if (str15 == null) {
                                str15 = "";
                            }
                            Integer num = premiumReserveTicketReceiptPassengerDetailsApiResponseModel.c;
                            String str16 = str2;
                            Pair pair = new Pair(str15, Integer.valueOf(num != null ? num.intValue() : 0));
                            mapD.put(pair.d(), pair.e());
                            str10 = str14;
                            it2 = it3;
                            str2 = str16;
                        }
                        str4 = str10;
                        str5 = str2;
                    } else {
                        str4 = str10;
                        str5 = str2;
                        mapD = MapsKt.d();
                    }
                    RefundInfoApiModel refundInfoApiModel = premiumReserveTicketReceiptApiResponseModel.m;
                    premiumReserveTicketReceiptAppModel = new PremiumReserveTicketReceiptAppModel(str6, jLongValue, jLongValue2, str7, str8, str9, str4, str12, str5, str3, str13, mapD, refundInfoApiModel != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel) : null);
                }
            }
            if (premiumReserveTicketReceiptAppModel != null) {
                arrayList.add(premiumReserveTicketReceiptAppModel);
            }
            it = it;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object u(PremiumBusChangeSeatsRequestAppModel premiumBusChangeSeatsRequestAppModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$processChangeSeatsRequest$1 premiumBusRepositoryImpl$processChangeSeatsRequest$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$processChangeSeatsRequest$1) {
            premiumBusRepositoryImpl$processChangeSeatsRequest$1 = (PremiumBusRepositoryImpl$processChangeSeatsRequest$1) continuationImpl;
            int i = premiumBusRepositoryImpl$processChangeSeatsRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$processChangeSeatsRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$processChangeSeatsRequest$1 = new PremiumBusRepositoryImpl$processChangeSeatsRequest$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$processChangeSeatsRequest$1 = new PremiumBusRepositoryImpl$processChangeSeatsRequest$1(this, continuationImpl);
        }
        Object objB = premiumBusRepositoryImpl$processChangeSeatsRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$processChangeSeatsRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(premiumBusChangeSeatsRequestAppModel, "<this>");
            String str = premiumBusChangeSeatsRequestAppModel.f7101a;
            List list = premiumBusChangeSeatsRequestAppModel.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(PremiumBusChangeSeatsRequestAppModelKt.a((SeatInfoAppModel) it.next()));
            }
            PremiumBusChangeSeatsRequestApiModel premiumBusChangeSeatsRequestApiModel = new PremiumBusChangeSeatsRequestApiModel(str, arrayList);
            premiumBusRepositoryImpl$processChangeSeatsRequest$1.label = 1;
            objB = this.b.B(premiumBusChangeSeatsRequestApiModel, premiumBusRepositoryImpl$processChangeSeatsRequest$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        PremiumBusChangeSeatsApiResponseModel premiumBusChangeSeatsApiResponseModel = (PremiumBusChangeSeatsApiResponseModel) objB;
        Intrinsics.i(premiumBusChangeSeatsApiResponseModel, "<this>");
        return new PremiumBusChangeSeatsAppResponseModel(premiumBusChangeSeatsApiResponseModel.f7044a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable v(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1;
        PBModeToReachStopType pBModeToReachStopTypeA;
        PBModeToReachStopType pBModeToReachStopTypeA2;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1) {
            premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = (PremiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = new PremiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1 = new PremiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1(this, continuationImpl);
        }
        Object objF = premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1.label = 1;
            objF = this.b.F(linkedHashMap, premiumBusRepositoryImpl$fetchPremiumBusNearbyStopPointsForSelectedLocations$1);
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
        for (PBOriginDestinationApiResponseModel pBOriginDestinationApiResponseModel : (Iterable) objF) {
            Intrinsics.i(pBOriginDestinationApiResponseModel, "<this>");
            List list = pBOriginDestinationApiResponseModel.f7028a;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            List list2 = list;
            String str = pBOriginDestinationApiResponseModel.b;
            String str2 = pBOriginDestinationApiResponseModel.c;
            PBOriginDestinationAppModel pBOriginDestinationAppModel = null;
            if (str2 != null) {
                String str3 = pBOriginDestinationApiResponseModel.d;
                if (str3 == null) {
                    str3 = "";
                }
                Long l = pBOriginDestinationApiResponseModel.e;
                Long l2 = pBOriginDestinationApiResponseModel.f;
                String str4 = pBOriginDestinationApiResponseModel.g;
                if (str4 != null) {
                    PBModeToReachStopType.INSTANCE.getClass();
                    pBModeToReachStopTypeA = PBModeToReachStopType.Companion.a(str4);
                    if (pBModeToReachStopTypeA == null) {
                        pBModeToReachStopTypeA = PBModeToReachStopType.WALK;
                    }
                } else {
                    pBModeToReachStopTypeA = PBModeToReachStopType.WALK;
                }
                String str5 = pBOriginDestinationApiResponseModel.h;
                if (str5 != null) {
                    String str6 = pBOriginDestinationApiResponseModel.i;
                    String str7 = str6 == null ? "" : str6;
                    Long l3 = pBOriginDestinationApiResponseModel.j;
                    Long l4 = pBOriginDestinationApiResponseModel.k;
                    String str8 = pBOriginDestinationApiResponseModel.l;
                    if (str8 != null) {
                        PBModeToReachStopType.INSTANCE.getClass();
                        pBModeToReachStopTypeA2 = PBModeToReachStopType.Companion.a(str8);
                        if (pBModeToReachStopTypeA2 == null) {
                            pBModeToReachStopTypeA2 = PBModeToReachStopType.WALK;
                        }
                    } else {
                        pBModeToReachStopTypeA2 = PBModeToReachStopType.WALK;
                    }
                    pBOriginDestinationAppModel = new PBOriginDestinationAppModel(list2, str, str2, str3, l, l2, pBModeToReachStopTypeA, str5, str7, l3, l4, pBModeToReachStopTypeA2, 28672);
                }
            }
            if (pBOriginDestinationAppModel != null) {
                arrayList.add(pBOriginDestinationAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable w(PremiumBusSeatSelectionLayoutRequestAppModel premiumBusSeatSelectionLayoutRequestAppModel, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1 premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1;
        Integer num;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1) {
            premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1 = (PremiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1 = new PremiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1 = new PremiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1(this, continuationImpl);
        }
        Object objY = premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1.label;
        if (i2 == 0) {
            ResultKt.b(objY);
            Intrinsics.i(premiumBusSeatSelectionLayoutRequestAppModel, "<this>");
            PremiumBusSeatSelectionLayoutRequestApiModel premiumBusSeatSelectionLayoutRequestApiModel = new PremiumBusSeatSelectionLayoutRequestApiModel(premiumBusSeatSelectionLayoutRequestAppModel.b, premiumBusSeatSelectionLayoutRequestAppModel.c, premiumBusSeatSelectionLayoutRequestAppModel.d, premiumBusSeatSelectionLayoutRequestAppModel.f7105a);
            premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1.label = 1;
            objY = this.b.y(premiumBusSeatSelectionLayoutRequestApiModel, premiumBusRepositoryImpl$fetchPBSeatSelectionLayout$1);
            if (objY == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objY);
        }
        ArrayList arrayList = new ArrayList();
        for (PremiumBusSeatSelectionLayoutResponseApiModel premiumBusSeatSelectionLayoutResponseApiModel : (Iterable) objY) {
            Intrinsics.i(premiumBusSeatSelectionLayoutResponseApiModel, "<this>");
            String str = premiumBusSeatSelectionLayoutResponseApiModel.f7052a;
            PremiumBusSeatSelectionLayoutResponseAppModel premiumBusSeatSelectionLayoutResponseAppModel = null;
            if (str != null && (num = premiumBusSeatSelectionLayoutResponseApiModel.b) != null) {
                int iIntValue = num.intValue();
                Integer num2 = premiumBusSeatSelectionLayoutResponseApiModel.c;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    List list = premiumBusSeatSelectionLayoutResponseApiModel.d;
                    if (list == null) {
                        list = EmptyList.f17557a;
                    }
                    List list2 = list;
                    List list3 = premiumBusSeatSelectionLayoutResponseApiModel.e;
                    if (list3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            SeatInfoAppModel seatInfoAppModelA = PremiumBusSeatSelectionLayoutResponseApiModelKt.a((SeatInfoApiModel) it.next());
                            if (seatInfoAppModelA != null) {
                                arrayList2.add(seatInfoAppModelA);
                            }
                        }
                        premiumBusSeatSelectionLayoutResponseAppModel = new PremiumBusSeatSelectionLayoutResponseAppModel(str, iIntValue, iIntValue2, list2, arrayList2);
                    }
                }
            }
            if (premiumBusSeatSelectionLayoutResponseAppModel != null) {
                arrayList.add(premiumBusSeatSelectionLayoutResponseAppModel);
            }
        }
        return arrayList;
    }

    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object x(PremiumReserveTicketAppModel premiumReserveTicketAppModel, Continuation continuation) {
        Object objM = this.f7153a.m(PBAppModelToEntityModelMappersKt.a(premiumReserveTicketAppModel), continuation);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Serializable y(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1 premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1;
        Iterator it;
        PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel;
        PremiumReserveTicketOptionAction premiumReserveTicketOptionActionValueOf;
        ProductModificationSubtextColour productModificationSubtextColour;
        PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel;
        PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType;
        PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType2;
        String lowerCase;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1) {
            premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1 = (PremiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1) continuationImpl;
            int i = premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1 = new PremiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1 = new PremiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1(this, continuationImpl);
        }
        Object objT = premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objT);
            premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1.label = 1;
            objT = this.b.t(str, str2, str3, premiumBusRepositoryImpl$fetchPremiumBusTicketUpdateOptions$1);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objT);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Iterable) objT).iterator();
        while (it2.hasNext()) {
            PremiumBusProductModificationOptionApiResponseModel premiumBusProductModificationOptionApiResponseModel = (PremiumBusProductModificationOptionApiResponseModel) it2.next();
            Intrinsics.i(premiumBusProductModificationOptionApiResponseModel, "<this>");
            String str4 = premiumBusProductModificationOptionApiResponseModel.f7048a;
            if (str4 != null) {
                PremiumReserveTicketOptionAction.INSTANCE.getClass();
                try {
                    premiumReserveTicketOptionActionValueOf = PremiumReserveTicketOptionAction.valueOf(str4);
                } catch (IllegalArgumentException unused) {
                    premiumReserveTicketOptionActionValueOf = null;
                }
                if (premiumReserveTicketOptionActionValueOf != null) {
                    String str5 = premiumBusProductModificationOptionApiResponseModel.d;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = str5;
                    String str7 = premiumBusProductModificationOptionApiResponseModel.b;
                    if (str7 == null) {
                        it = it2;
                        premiumBusProductOptionsAppModel = null;
                    } else {
                        Boolean bool = premiumBusProductModificationOptionApiResponseModel.e;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : z;
                        String str8 = premiumBusProductModificationOptionApiResponseModel.f;
                        String str9 = premiumBusProductModificationOptionApiResponseModel.g;
                        String str10 = premiumBusProductModificationOptionApiResponseModel.c;
                        ProductModificationSubtextColour.Companion companion = ProductModificationSubtextColour.INSTANCE;
                        String str11 = premiumBusProductModificationOptionApiResponseModel.h;
                        companion.getClass();
                        ProductModificationSubtextColour[] productModificationSubtextColourArrValues = ProductModificationSubtextColour.values();
                        int length = productModificationSubtextColourArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                it = it2;
                                productModificationSubtextColour = null;
                                break;
                            }
                            productModificationSubtextColour = productModificationSubtextColourArrValues[i3];
                            String colour = productModificationSubtextColour.getColour();
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = colour.toLowerCase(locale);
                            it = it2;
                            Intrinsics.h(lowerCase2, "toLowerCase(...)");
                            if (str11 != null) {
                                lowerCase = str11.toLowerCase(locale);
                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            if (lowerCase2.equals(lowerCase)) {
                                break;
                            }
                            i3++;
                            it2 = it;
                        }
                        if (productModificationSubtextColour == null) {
                            productModificationSubtextColour = ProductModificationSubtextColour.DEFAULT;
                        }
                        ProductModificationSubtextColour productModificationSubtextColour2 = productModificationSubtextColour;
                        PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel = premiumBusProductModificationOptionApiResponseModel.i;
                        if (premiumBusProductModificationAdditionalInfoApiResponseModel != null) {
                            PremiumProductionModificationAdditionalInfoCtaActionType.Companion companion2 = PremiumProductionModificationAdditionalInfoCtaActionType.INSTANCE;
                            String str12 = premiumBusProductModificationAdditionalInfoApiResponseModel.d;
                            companion2.getClass();
                            PremiumProductionModificationAdditionalInfoCtaActionType[] premiumProductionModificationAdditionalInfoCtaActionTypeArrValues = PremiumProductionModificationAdditionalInfoCtaActionType.values();
                            int length2 = premiumProductionModificationAdditionalInfoCtaActionTypeArrValues.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length2) {
                                    premiumProductionModificationAdditionalInfoCtaActionType = null;
                                    break;
                                }
                                premiumProductionModificationAdditionalInfoCtaActionType = premiumProductionModificationAdditionalInfoCtaActionTypeArrValues[i4];
                                if (Intrinsics.d(premiumProductionModificationAdditionalInfoCtaActionType.getActionType(), str12)) {
                                    break;
                                }
                                i4++;
                            }
                            String str13 = premiumBusProductModificationAdditionalInfoApiResponseModel.f7046a;
                            String str14 = premiumBusProductModificationAdditionalInfoApiResponseModel.b;
                            String str15 = premiumBusProductModificationAdditionalInfoApiResponseModel.c;
                            int i5 = premiumProductionModificationAdditionalInfoCtaActionType == null ? -1 : PBRemoteToAppModelMappersKt.WhenMappings.f6982a[premiumProductionModificationAdditionalInfoCtaActionType.ordinal()];
                            if (i5 != -1) {
                                z = true;
                                if (i5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str16 = premiumBusProductModificationAdditionalInfoApiResponseModel.e;
                                if (str16 != null && str16.length() != 0) {
                                    premiumProductionModificationAdditionalInfoCtaActionType2 = premiumProductionModificationAdditionalInfoCtaActionType;
                                }
                                premiumBusProductModificationAdditionalInfoAppModel = new PremiumBusProductModificationAdditionalInfoAppModel(str13, str14, str15, premiumProductionModificationAdditionalInfoCtaActionType2, premiumBusProductModificationAdditionalInfoApiResponseModel.e, premiumBusProductModificationAdditionalInfoApiResponseModel.f);
                            } else {
                                z = true;
                            }
                            premiumProductionModificationAdditionalInfoCtaActionType2 = null;
                            premiumBusProductModificationAdditionalInfoAppModel = new PremiumBusProductModificationAdditionalInfoAppModel(str13, str14, str15, premiumProductionModificationAdditionalInfoCtaActionType2, premiumBusProductModificationAdditionalInfoApiResponseModel.e, premiumBusProductModificationAdditionalInfoApiResponseModel.f);
                        } else {
                            z = true;
                            premiumBusProductModificationAdditionalInfoAppModel = null;
                        }
                        premiumBusProductOptionsAppModel = new PremiumBusProductOptionsAppModel(premiumReserveTicketOptionActionValueOf, str6, str7, str10, zBooleanValue, str8, str9, productModificationSubtextColour2, premiumBusProductModificationAdditionalInfoAppModel);
                    }
                } else {
                    it = it2;
                    premiumBusProductOptionsAppModel = null;
                }
            } else {
                it = it2;
                premiumBusProductOptionsAppModel = null;
            }
            if (premiumBusProductOptionsAppModel != null) {
                arrayList.add(premiumBusProductOptionsAppModel);
            }
            it2 = it;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.data.repository.PremiumBusRepository
    public final Object z(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1 premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1;
        if (continuationImpl instanceof PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1) {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1 = (PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1) continuationImpl;
            int i = premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1(this, continuationImpl);
            }
        } else {
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1 = new PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1(this, continuationImpl);
        }
        Object objK = premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            premiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$1.label = 1;
            objK = this.f7153a.k(str, str2, str3);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        final Flow flow = (Flow) objK;
        return new Flow<List<? extends PremiumReserveTicketAppModel>>() { // from class: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7160a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAllPremiumReserveTicketsBookedThroughPass$$inlined$map$1$2", f = "PremiumBusRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7160a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(PBEntityToAppModelMappersKt.a((PremiumReserveTicketEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f7160a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
