package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.window.embedding.SafeActivityEmbeddingComponentProvider;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData$CardData$$serializer;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData$NetBankingData$$serializer;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData$UpiData$IntentFlow$$serializer;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData$WalletData$$serializer;
import app.chalo.constants.Source;
import app.chalo.home.data.model.api.FAQApiModel$$serializer;
import app.chalo.home.data.model.api.PassSectionItemDataApiModel$$serializer;
import app.chalo.home.data.model.api.SectionApiModel;
import app.chalo.home.data.model.api.SectionItemApiModel;
import app.chalo.home.data.model.api.SectionItemApiModel$$serializer;
import app.chalo.home.data.model.api.response.CorridorResponseApiModel$$serializer;
import app.chalo.home.data.model.api.response.ScheduleBlockResponseApiModel;
import app.chalo.home.data.model.app.response.CorridorAppModel$$serializer;
import app.chalo.home.data.model.app.response.ScheduleBlockAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.home.data.model.app.response.ScheduleBlockType;
import app.chalo.homescreen.data.model.app.PassCardDataAppModel$$serializer;
import app.chalo.homescreen.data.model.app.SectionItemAppModel;
import app.chalo.livetracking.universalsearch.data.model.api.PlacesAndStopsInfoApiModel$$serializer;
import app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel$$serializer;
import app.chalo.livetracking.universalsearch.data.model.api.SearchedResultItemsApiResponseModel;
import app.chalo.premiumbus.data.models.app.BufferType;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.data.models.app.SeatType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.scenes.args.BookingHelpArgs$$serializer;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.BookingSuccessArgs$BulkBooking$$serializer;
import app.chalo.scenes.args.BookingSuccessArgs$ProductSuccessScreen$$serializer;
import app.chalo.scenes.args.BusesAroundYouArgs;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import app.chalo.scenes.args.CardLinkingScreenArgs$$serializer;
import app.chalo.scenes.args.CardPendingRechargesScreenArgs;
import app.chalo.scenes.args.CardPendingRechargesScreenArgs$$serializer;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs$$serializer;
import app.chalo.scenes.args.CardTransactionDetailArgs;
import app.chalo.scenes.args.CardTransactionDetailArgs$$serializer;
import app.chalo.scenes.args.CardTransactionHistoryArgs;
import app.chalo.scenes.args.CardTransactionHistoryArgs$$serializer;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs$$serializer;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs$$serializer;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs$$serializer;
import app.chalo.scenes.args.CheckoutCardArgs;
import app.chalo.scenes.args.CheckoutInaiArgs;
import app.chalo.scenes.args.CheckoutNetBankingArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs$$serializer;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs$$serializer;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs$$serializer;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.CitySelectionArgs$CityLocationSelectionArgs$$serializer;
import app.chalo.scenes.args.CitySelectionArgs$OldCitySelectionArgs$$serializer;
import app.chalo.scenes.args.ConfirmBookingScreenArgs;
import app.chalo.scenes.args.ConfirmBookingScreenArgs$$serializer;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import app.chalo.scenes.args.CustomUrlCheckoutArgs$$serializer;
import app.chalo.scenes.args.EBillAmountScreenArgs;
import app.chalo.scenes.args.EBillAmountScreenArgs$$serializer;
import app.chalo.scenes.args.EBillFetchScreenArgs;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs$$serializer;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs$$serializer;
import app.chalo.scenes.args.EBillPaymentSuccessArgs;
import app.chalo.scenes.args.EBillPaymentSuccessArgs$$serializer;
import app.chalo.scenes.args.EnterCardDetailsArgs;
import app.chalo.scenes.args.EnterCardDetailsArgs$$serializer;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.FareDetailsArgs$$serializer;
import app.chalo.scenes.args.ForceAppUpdateArgs;
import app.chalo.scenes.args.ForceAppUpdateArgs$$serializer;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs$$serializer;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs$$serializer;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.HomeArgs$$serializer;
import app.chalo.scenes.args.LanguageSelectionArgs;
import app.chalo.scenes.args.LanguageSelectionArgs$$serializer;
import app.chalo.scenes.args.LocationDisclaimerArgs;
import app.chalo.scenes.args.LocationDisclaimerArgs$$serializer;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.LoginOptionsArgs$$serializer;
import app.chalo.scenes.args.LoginOtpSceneArgs;
import app.chalo.scenes.args.LoginOtpSceneArgs$$serializer;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.scenes.args.MTicketSelectionArgs$$serializer;
import app.chalo.scenes.args.MetroLandingArgs;
import app.chalo.scenes.args.MetroLandingArgs$$serializer;
import app.chalo.scenes.args.MinKycDetailsArgs;
import app.chalo.scenes.args.MinKycOtpArgs;
import app.chalo.scenes.args.MinKycOtpArgs$$serializer;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.scenes.args.MinProfileUpdateArgs$$serializer;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs$$serializer;
import app.chalo.scenes.args.NcmcOnlineRechargeArgs;
import app.chalo.scenes.args.NcmcOnlineRechargeArgs$$serializer;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.NearbyStopsMapArgs$$serializer;
import app.chalo.scenes.args.NetworkInspectorArgs;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PassSelectionArgs$$serializer;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs$$serializer;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.PickRouteLocationArgs$$serializer;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.PickStopArgs$$serializer;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumProductSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumStopDetailsArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$SlotSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$StopSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.scenes.args.PremiumBusChangeStopArgs$$serializer;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs$$serializer;
import app.chalo.scenes.args.PremiumBusNotificationArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs$$serializer;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs$$serializer;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.ProductActivationArgs$$serializer;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.ProductSelectionArgs$$serializer;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.scenes.args.ReportProblemArgs$$serializer;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs$Auto$$serializer;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs$Default$$serializer;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.RouteDetailsArgs$$serializer;
import app.chalo.scenes.args.SavedPlacesAndRidesArgs;
import app.chalo.scenes.args.SavedPlacesAndRidesArgs$$serializer;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SelectRideArgs;
import app.chalo.scenes.args.SelectRideArgs$$serializer;
import app.chalo.scenes.args.SosArgs;
import app.chalo.scenes.args.SosArgs$$serializer;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs$$serializer;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.scenes.args.StopTripDetailsArgs$$serializer;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.TicketPurchaseArgs$MTicketTripInfoArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$PayForTicketArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$QuickPayArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs$$serializer;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.TripPlannerArgs$DetailsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$ResultsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$StopFocusedResultsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen$$serializer;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.scenes.args.TripSummaryArgs$PassSummaryScreen$$serializer;
import app.chalo.scenes.args.TripSummaryArgs$RideReceiptScreen$$serializer;
import app.chalo.scenes.args.TripSummaryArgs$TicketSummaryScreen$$serializer;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerArgs$$serializer;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.scenes.args.UserConsentScreenArgs$$serializer;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.scenes.args.UserProfileFormArgs$$serializer;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.scenes.args.ValidationArgs$BleValidationScreenArgs$$serializer;
import app.chalo.scenes.args.ValidationArgs$MultiProductValidation$$serializer;
import app.chalo.scenes.args.ValidationArgs$QrScannerValidationArgs$$serializer;
import app.chalo.scenes.args.ValidationArgs$QrValidationScreenArgs$$serializer;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs$$serializer;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletBalanceArgs$$serializer;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs$$serializer;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs$$serializer;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs$$serializer;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.scenes.args.WebViewArgs$$serializer;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19003a;

    public /* synthetic */ p41(int i) {
        this.f19003a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19003a) {
            case 0:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetAnimationParamsValid$lambda$48());
            case 1:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleValid$lambda$9());
            case 2:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitAttributesValid$lambda$16());
            case 3:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackTokenValid$lambda$36());
            case 4:
                return SaveableStateHolderKt.rememberSaveableStateHolder$lambda$0$0();
            case 5:
                return SaveableStateRegistryKt.LocalSaveableStateRegistry$lambda$0();
            case 6:
                SavedPlacesAndRidesArgs.Companion companion = SavedPlacesAndRidesArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 7:
                return Unit.f17538a;
            case 8:
                SceneArgs.Companion companion2 = SceneArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.SceneArgs", Reflection.a(SceneArgs.class), new KClass[]{Reflection.a(AppMigrationPreconditionsArgs.class), Reflection.a(BookingHelpArgs.class), Reflection.a(BookingSuccessArgs.BulkBooking.class), Reflection.a(BookingSuccessArgs.ProductSuccessScreen.class), Reflection.a(BusesAroundYouArgs.class), Reflection.a(CardLinkingScreenArgs.class), Reflection.a(CardPendingRechargesScreenArgs.class), Reflection.a(CardRechargeEnterAmountArgs.class), Reflection.a(CardTransactionDetailArgs.class), Reflection.a(CardTransactionHistoryArgs.class), Reflection.a(ChaloBusRouteInfoScreenArgs.class), Reflection.a(ChaloBusUserProfileSurveyArgs.class), Reflection.a(ChaloCardLandingScreenArgs.class), Reflection.a(CheckoutCardArgs.class), Reflection.a(CheckoutInaiArgs.class), Reflection.a(CheckoutNetBankingArgs.class), Reflection.a(CheckoutPaymentMainArgs.class), Reflection.a(CheckoutPhonePeArgs.class), Reflection.a(CheckoutPostPaymentArgs.class), Reflection.a(CheckoutRazorpayArgs.class), Reflection.a(CheckoutUpiArgs.class), Reflection.a(CheckoutWalletArgs.class), Reflection.a(CustomUrlCheckoutArgs.class), Reflection.a(CityDiscontinuedArgs.class), Reflection.a(CitySelectionArgs.CityLocationSelectionArgs.class), Reflection.a(CitySelectionArgs.OldCitySelectionArgs.class), Reflection.a(ConfirmBookingScreenArgs.class), Reflection.a(EBillAmountScreenArgs.class), Reflection.a(EBillFetchScreenArgs.class), Reflection.a(EBillHistoryScreenArgs.class), Reflection.a(EBillPaymentConfirmationArgs.class), Reflection.a(EBillPaymentInvoiceScreenArgs.class), Reflection.a(EBillPaymentSuccessArgs.class), Reflection.a(EnterCardDetailsArgs.class), Reflection.a(FareDetailsArgs.class), Reflection.a(ForceAppUpdateArgs.class), Reflection.a(GroupTicketBookingSummaryArgs.class), Reflection.a(GroupTicketLegSelectionArgs.class), Reflection.a(HomeArgs.class), Reflection.a(LanguageSelectionArgs.class), Reflection.a(LocationDisclaimerArgs.class), Reflection.a(LoginOptionsArgs.class), Reflection.a(LoginOtpSceneArgs.class), Reflection.a(MTicketSelectionArgs.class), Reflection.a(MetroLandingArgs.class), Reflection.a(MinKycDetailsArgs.class), Reflection.a(MinKycOtpArgs.class), Reflection.a(MinProfileUpdateArgs.class), Reflection.a(NcmcOfflineRechargeArgs.class), Reflection.a(NcmcOnlineRechargeArgs.class), Reflection.a(NearbyStopsMapArgs.class), Reflection.a(NetworkInspectorArgs.class), Reflection.a(PassSelectionArgs.class), Reflection.a(PbBulkBookingRideDetailsArgs.class), Reflection.a(PickRouteLocationArgs.class), Reflection.a(PickStopArgs.class), Reflection.a(PremiumBusActivationArgs.class), Reflection.a(PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumBusPassLandingScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumBusSeatSelectionArgs.class), Reflection.a(PremiumBusArgs.PremiumBusSlotListScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumProductSelectionArgs.class), Reflection.a(PremiumBusArgs.PremiumStopDetailsArgs.class), Reflection.a(PremiumBusArgs.SlotSelectionArgs.class), Reflection.a(PremiumBusArgs.StopSelectionArgs.class), Reflection.a(PremiumBusChangeStopArgs.class), Reflection.a(PremiumBusFareDetailsArgs.class), Reflection.a(PremiumBusNotificationArgs.class), Reflection.a(PremiumBusProductModificationArgs.class), Reflection.a(PremiumBusTutorialScreenArgs.class), Reflection.a(ProductActivationArgs.class), Reflection.a(ProductSelectionArgs.class), Reflection.a(ReportProblemArgs.class), Reflection.a(RideUserFeedbackScreenArgs.Auto.class), Reflection.a(RideUserFeedbackScreenArgs.Default.class), Reflection.a(RouteDetailsArgs.class), Reflection.a(SavedPlacesAndRidesArgs.class), Reflection.a(SelectRideArgs.class), Reflection.a(SosArgs.class), Reflection.a(SplashArgs.class), Reflection.a(StopBasedMetroLandingArgs.class), Reflection.a(StopTripDetailsArgs.class), Reflection.a(SuperPassBookingSuccessArgs.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.class), Reflection.a(SuperPassPurchaseArgs.ProofUploadInternalArgs.class), Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.class), Reflection.a(SuperPassVerificationStatusArgs.class), Reflection.a(TicketPurchaseArgs.MTicketTripInfoArgs.class), Reflection.a(TicketPurchaseArgs.PayForTicketArgs.class), Reflection.a(TicketPurchaseArgs.QuickPayArgs.class), Reflection.a(TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.InstantTicket.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.ONDC.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.PassPurchase.class), Reflection.a(TitoRideDetailsArgs.class), Reflection.a(TripPlannerArgs.DetailsScreen.class), Reflection.a(TripPlannerArgs.ResultsScreen.class), Reflection.a(TripPlannerArgs.StopFocusedResultsScreen.class), Reflection.a(TripPlannerArgs.StopFocusedSearchScreen.class), Reflection.a(TripSummaryArgs.PassSummaryScreen.class), Reflection.a(TripSummaryArgs.RideReceiptScreen.class), Reflection.a(TripSummaryArgs.TicketSummaryScreen.class), Reflection.a(UniversalPickerArgs.class), Reflection.a(UserConsentScreenArgs.class), Reflection.a(UserProfileFormArgs.class), Reflection.a(ValidationArgs.BleValidationScreenArgs.class), Reflection.a(ValidationArgs.MultiProductValidation.class), Reflection.a(ValidationArgs.QrScannerValidationArgs.class), Reflection.a(ValidationArgs.QrValidationScreenArgs.class), Reflection.a(WalletAllTransactionsArgs.class), Reflection.a(WalletBalanceArgs.class), Reflection.a(WalletLoadBalanceSuccessArgs.class), Reflection.a(WalletLoadMoneyArgs.class), Reflection.a(WalletTransactionSummaryArgs.class), Reflection.a(WebViewArgs.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.scenes.args.AppMigrationPreconditionsArgs", AppMigrationPreconditionsArgs.INSTANCE, new Annotation[0]), BookingHelpArgs$$serializer.f9226a, BookingSuccessArgs$BulkBooking$$serializer.f9227a, BookingSuccessArgs$ProductSuccessScreen$$serializer.f9228a, new ObjectSerializer("app.chalo.scenes.args.BusesAroundYouArgs", BusesAroundYouArgs.INSTANCE, new Annotation[0]), CardLinkingScreenArgs$$serializer.f9229a, CardPendingRechargesScreenArgs$$serializer.f9230a, CardRechargeEnterAmountArgs$$serializer.f9231a, CardTransactionDetailArgs$$serializer.f9232a, CardTransactionHistoryArgs$$serializer.f9233a, ChaloBusRouteInfoScreenArgs$$serializer.f9234a, ChaloBusUserProfileSurveyArgs$$serializer.f9235a, ChaloCardLandingScreenArgs$$serializer.f9236a, new ObjectSerializer("app.chalo.scenes.args.CheckoutCardArgs", CheckoutCardArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutInaiArgs", CheckoutInaiArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutNetBankingArgs", CheckoutNetBankingArgs.INSTANCE, new Annotation[0]), CheckoutPaymentMainArgs$$serializer.f9237a, new ObjectSerializer("app.chalo.scenes.args.CheckoutPhonePeArgs", CheckoutPhonePeArgs.INSTANCE, new Annotation[0]), CheckoutPostPaymentArgs$$serializer.f9238a, new ObjectSerializer("app.chalo.scenes.args.CheckoutRazorpayArgs", CheckoutRazorpayArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutUpiArgs", CheckoutUpiArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutWalletArgs", CheckoutWalletArgs.INSTANCE, new Annotation[0]), CustomUrlCheckoutArgs$$serializer.f9244a, CityDiscontinuedArgs$$serializer.f9239a, CitySelectionArgs$CityLocationSelectionArgs$$serializer.f9240a, CitySelectionArgs$OldCitySelectionArgs$$serializer.f9242a, ConfirmBookingScreenArgs$$serializer.f9243a, EBillAmountScreenArgs$$serializer.f9245a, new ObjectSerializer("app.chalo.scenes.args.EBillFetchScreenArgs", EBillFetchScreenArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.EBillHistoryScreenArgs", EBillHistoryScreenArgs.INSTANCE, new Annotation[0]), EBillPaymentConfirmationArgs$$serializer.f9246a, EBillPaymentInvoiceScreenArgs$$serializer.f9247a, EBillPaymentSuccessArgs$$serializer.f9248a, EnterCardDetailsArgs$$serializer.f9249a, FareDetailsArgs$$serializer.f9250a, ForceAppUpdateArgs$$serializer.f9251a, GroupTicketBookingSummaryArgs$$serializer.f9254a, GroupTicketLegSelectionArgs$$serializer.f9255a, HomeArgs$$serializer.f9265a, LanguageSelectionArgs$$serializer.f9266a, LocationDisclaimerArgs$$serializer.f9267a, LoginOptionsArgs$$serializer.f9268a, LoginOtpSceneArgs$$serializer.f9269a, MTicketSelectionArgs$$serializer.f9270a, MetroLandingArgs$$serializer.f9271a, new ObjectSerializer("app.chalo.scenes.args.MinKycDetailsArgs", MinKycDetailsArgs.INSTANCE, new Annotation[0]), MinKycOtpArgs$$serializer.f9272a, MinProfileUpdateArgs$$serializer.f9273a, NcmcOfflineRechargeArgs$$serializer.f9274a, NcmcOnlineRechargeArgs$$serializer.f9275a, NearbyStopsMapArgs$$serializer.f9276a, new ObjectSerializer("app.chalo.scenes.args.NetworkInspectorArgs", NetworkInspectorArgs.INSTANCE, new Annotation[0]), PassSelectionArgs$$serializer.f9279a, PbBulkBookingRideDetailsArgs$$serializer.f9280a, PickRouteLocationArgs$$serializer.f9281a, PickStopArgs$$serializer.f9282a, PremiumBusActivationArgs$$serializer.f9283a, PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer.f9284a, PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer.f9285a, PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer.f9286a, PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer.f9287a, PremiumBusArgs$PremiumProductSelectionArgs$$serializer.f9288a, PremiumBusArgs$PremiumStopDetailsArgs$$serializer.f9289a, PremiumBusArgs$SlotSelectionArgs$$serializer.f9290a, PremiumBusArgs$StopSelectionArgs$$serializer.f9291a, PremiumBusChangeStopArgs$$serializer.f9292a, PremiumBusFareDetailsArgs$$serializer.f9293a, new ObjectSerializer("app.chalo.scenes.args.PremiumBusNotificationArgs", PremiumBusNotificationArgs.INSTANCE, new Annotation[0]), PremiumBusProductModificationArgs$$serializer.f9294a, PremiumBusTutorialScreenArgs$$serializer.f9297a, ProductActivationArgs$$serializer.f9298a, ProductSelectionArgs$$serializer.f9299a, ReportProblemArgs$$serializer.f9300a, RideUserFeedbackScreenArgs$Auto$$serializer.f9301a, RideUserFeedbackScreenArgs$Default$$serializer.f9302a, RouteDetailsArgs$$serializer.f9303a, SavedPlacesAndRidesArgs$$serializer.f9304a, SelectRideArgs$$serializer.f9306a, SosArgs$$serializer.f9307a, new ObjectSerializer("app.chalo.scenes.args.SplashArgs", SplashArgs.INSTANCE, new Annotation[0]), StopBasedMetroLandingArgs$$serializer.f9308a, StopTripDetailsArgs$$serializer.f9309a, SuperPassBookingSuccessArgs$$serializer.f9310a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer.f9311a, new ObjectSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs", SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, new Annotation[0]), SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer.f9312a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer.f9313a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer.f9314a, SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer.f9315a, SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer.f9316a, SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer.f9317a, SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer.f9318a, SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer.f9319a, SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer.f9320a, SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer.f9321a, SuperPassVerificationStatusArgs$$serializer.f9322a, TicketPurchaseArgs$MTicketTripInfoArgs$$serializer.f9323a, TicketPurchaseArgs$PayForTicketArgs$$serializer.f9324a, TicketPurchaseArgs$QuickPayArgs$$serializer.f9325a, new ObjectSerializer("app.chalo.scenes.args.TicketPurchaseArgs.RouteSelectionArgs.InstantTicket", TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE, new Annotation[0]), TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer.f9326a, TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer.f9327a, TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer.f9328a, TitoRideDetailsArgs$$serializer.f9329a, TripPlannerArgs$DetailsScreen$$serializer.f9330a, TripPlannerArgs$ResultsScreen$$serializer.f9331a, TripPlannerArgs$StopFocusedResultsScreen$$serializer.f9332a, TripPlannerArgs$StopFocusedSearchScreen$$serializer.f9333a, TripSummaryArgs$PassSummaryScreen$$serializer.f9334a, TripSummaryArgs$RideReceiptScreen$$serializer.f9335a, TripSummaryArgs$TicketSummaryScreen$$serializer.f9336a, UniversalPickerArgs$$serializer.f9337a, UserConsentScreenArgs$$serializer.f9338a, UserProfileFormArgs$$serializer.f9339a, ValidationArgs$BleValidationScreenArgs$$serializer.f9340a, ValidationArgs$MultiProductValidation$$serializer.f9341a, ValidationArgs$QrScannerValidationArgs$$serializer.f9342a, ValidationArgs$QrValidationScreenArgs$$serializer.f9343a, WalletAllTransactionsArgs$$serializer.f9344a, WalletBalanceArgs$$serializer.f9345a, WalletLoadBalanceSuccessArgs$$serializer.f9346a, WalletLoadMoneyArgs$$serializer.f9347a, WalletTransactionSummaryArgs$$serializer.f9348a, WebViewArgs$$serializer.f9349a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 9:
                ScheduleBlockAppModel.Companion companion3 = ScheduleBlockAppModel.INSTANCE;
                return new ArrayListSerializer(CorridorAppModel$$serializer.f2960a);
            case 10:
                ScheduleBlockKey.Companion companion4 = ScheduleBlockKey.INSTANCE;
                return ScheduleBlockType.INSTANCE.serializer();
            case 11:
                ScheduleBlockResponseApiModel.Companion companion5 = ScheduleBlockResponseApiModel.INSTANCE;
                return new ArrayListSerializer(CorridorResponseApiModel$$serializer.f2927a);
            case 12:
                return ScheduleBlockType._init_$_anonymous_();
            case 13:
                return Boolean.valueOf(SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0());
            case 14:
                SearchedResultItemsApiResponseModel.Companion companion6 = SearchedResultItemsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(RoutesDetailApiModel$$serializer.f4986a);
            case 15:
                SearchedResultItemsApiResponseModel.Companion companion7 = SearchedResultItemsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(PlacesAndStopsInfoApiModel$$serializer.f4984a);
            case 16:
                SeatInfoAppModel.Companion companion8 = SeatInfoAppModel.INSTANCE;
                return SeatType.INSTANCE.serializer();
            case 17:
                SeatInfoAppModel.Companion companion9 = SeatInfoAppModel.INSTANCE;
                return SeatStatus.INSTANCE.serializer();
            case 18:
                SeatInfoAppModel.Companion companion10 = SeatInfoAppModel.INSTANCE;
                return ReservationType.INSTANCE.serializer();
            case 19:
                SeatInfoAppModel.Companion companion11 = SeatInfoAppModel.INSTANCE;
                return BufferType.INSTANCE.serializer();
            case 20:
                return SeatStatus._init_$_anonymous_();
            case 21:
                return SeatType._init_$_anonymous_();
            case 22:
                SectionApiModel.Companion companion12 = SectionApiModel.INSTANCE;
                return new ArrayListSerializer(FAQApiModel$$serializer.f2885a);
            case 23:
                SectionApiModel.Companion companion13 = SectionApiModel.INSTANCE;
                return new ArrayListSerializer(SectionItemApiModel$$serializer.f2905a);
            case 24:
                SectionItemApiModel.Companion companion14 = SectionItemApiModel.INSTANCE;
                return new ArrayListSerializer(PassSectionItemDataApiModel$$serializer.f2897a);
            case 25:
                SectionItemAppModel.Companion companion15 = SectionItemAppModel.INSTANCE;
                return new ArrayListSerializer(PassCardDataAppModel$$serializer.f3773a);
            case 26:
                SectionItemAppModel.Companion companion16 = SectionItemAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 27:
                SectionItemAppModel.Companion companion17 = SectionItemAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 28:
                SelectedPaymentInstrumentData.Companion companion18 = SelectedPaymentInstrumentData.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData", Reflection.a(SelectedPaymentInstrumentData.class), new KClass[]{Reflection.a(SelectedPaymentInstrumentData.CardData.class), Reflection.a(SelectedPaymentInstrumentData.NetBankingData.class), Reflection.a(SelectedPaymentInstrumentData.UpiData.IntentFlow.class), Reflection.a(SelectedPaymentInstrumentData.WalletData.class)}, new KSerializer[]{SelectedPaymentInstrumentData$CardData$$serializer.f1331a, SelectedPaymentInstrumentData$NetBankingData$$serializer.f1332a, SelectedPaymentInstrumentData$UpiData$IntentFlow$$serializer.f1333a, SelectedPaymentInstrumentData$WalletData$$serializer.f1334a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            default:
                SelectedPaymentInstrumentData.UpiData.Companion companion19 = SelectedPaymentInstrumentData.UpiData.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData.UpiData", Reflection.a(SelectedPaymentInstrumentData.UpiData.class), new KClass[]{Reflection.a(SelectedPaymentInstrumentData.UpiData.IntentFlow.class)}, new KSerializer[]{SelectedPaymentInstrumentData$UpiData$IntentFlow$$serializer.f1333a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
        }
    }
}
