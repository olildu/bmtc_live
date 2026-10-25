package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate;
import app.chalo.bookingsuccess.DefaultBookingSuccessFlowDelegate;
import app.chalo.citydata.domain.FetchAllMetroStopsUseCase;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.NavigationContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.domain.GetCityIdsInClusterProductHistoryUseCase;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.InstantTicketRepositoryImpl;
import app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource;
import app.chalo.instantticket.data.localsource.InstantTicketLocalDataSourceImpl;
import app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource;
import app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSourceImpl;
import app.chalo.instantticket.domain.ClearInstantTicketsDuringLogoutUseCase;
import app.chalo.instantticket.domain.CreateInstantTicketOrderUseCase;
import app.chalo.instantticket.domain.FetchAndStoreInstantTicketReceiptUseCase;
import app.chalo.instantticket.domain.FetchMobileTicketFareUseCase;
import app.chalo.instantticket.domain.FetchRouteDetailsLiveUseCase;
import app.chalo.instantticket.domain.FilterAndSortMatchingStopsUseCase;
import app.chalo.instantticket.domain.InitiateInstantTicketFetchAndStoreUseCase;
import app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase;
import app.chalo.instantticket.domain.ValidateInstantTicketAmountUseCase;
import app.chalo.instantticket.domain.ValidateInstantTicketFareUseCase;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.FareDetailsCoordinatorComponent;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent;
import app.chalo.instantticket.validation.InstantTicketProductValidationUIManager;
import app.chalo.instantticket.validation.InstantTicketReceiptManager;
import app.chalo.instantticket.validation.InstantTicketUserDetailsForProducts;
import app.chalo.instantticket.validation.InstantTicketValidationAnalyticManager;
import app.chalo.instantticket.validation.InstantTicketValidationData;
import app.chalo.instantticket.validation.InstantTicketValidationNavigationManager;
import app.chalo.instantticket.validation.InstantTicketValidationReportProblemManager;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.universalsearch.domain.GetAutoCompleteCurrentCityTimeoutConfigUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.login.LoginAuthGuard;
import app.chalo.metro.dao.MetroTicketDao;
import app.chalo.metro.dao.ondc.OndcMetroTicketDao;
import app.chalo.metro.domain.CreateMetroTicketOrderUseCase;
import app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase;
import app.chalo.metro.domain.FetchAndStoreMetroTicketUseCase;
import app.chalo.metro.domain.FetchMetroTicketUseCase;
import app.chalo.metro.domain.FetchTicketBookingsFareUseCase;
import app.chalo.metro.domain.GetMetroFinalFareUseCase;
import app.chalo.metro.domain.GetMetroTicketAppModelFromApiUseCase;
import app.chalo.metro.domain.GetMetroTicketByIdUseCase;
import app.chalo.metro.domain.UpdateMetroBookingUseCase;
import app.chalo.metro.local.MetroLocalDataSource;
import app.chalo.metro.local.MetroLocalDataSourceImpl;
import app.chalo.metro.remote.MetroRemoteDataSource;
import app.chalo.metro.remote.MetroRemoteDataSourceImpl;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.metro.repository.MetroRepositoryImpl;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.MetroLandingScreenHelperFactory;
import app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper;
import app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper;
import app.chalo.metro.ui.landing.uistate.MetroLandingUiStateFactory;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingUiStateFactory;
import app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSourceImpl;
import app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSourceImpl;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepositoryImpl;
import app.chalo.multimodalticket.domain.CreateGroupTicketOrderUseCase;
import app.chalo.multimodalticket.domain.FetchGroupTicketBookingFareDetailsUseCase;
import app.chalo.multimodalticket.domain.FetchMultiModalGroupTicketAndStoreLocallyUseCase;
import app.chalo.multimodalticket.domain.GetGroupTicketSummaryUseCase;
import app.chalo.multimodalticket.domain.GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;
import app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter;
import app.chalo.multimodalticket.domain.NormalizeGroupTicketJourneyLegsUseCase;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketSummaryUIStateFactory;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.multimodalticket.ui.GroupTicketSelectionUIStateFactory;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.ondc.dao.OndcTicketDao;
import app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase;
import app.chalo.ondc.domain.CreateOndcBookingUseCase;
import app.chalo.ondc.domain.CreateOndcOrderUseCase;
import app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase;
import app.chalo.ondc.domain.FetchAndStoreOndcReceiptUseCase;
import app.chalo.ondc.domain.FetchAndStoreOndcTicketUseCase;
import app.chalo.ondc.domain.FetchOndcConfigUseCase;
import app.chalo.ondc.domain.FetchOndcMetroLineStopsUseCase;
import app.chalo.ondc.domain.FetchOndcMetroLinesUseCase;
import app.chalo.ondc.domain.FetchOndcMetroTicketUseCase;
import app.chalo.ondc.domain.FetchOndcTicketUseCase;
import app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCase;
import app.chalo.ondc.domain.GetOndcMetroTicketByIdUseCase;
import app.chalo.ondc.domain.GetOndcTicketAppModelFromApiUseCase;
import app.chalo.ondc.domain.GetOndcTicketByIdUseCase;
import app.chalo.ondc.domain.GetOndcTicketUseCase;
import app.chalo.ondc.local.OndcLocalDataSource;
import app.chalo.ondc.local.OndcLocalDataSourceImpl;
import app.chalo.ondc.remote.OndcRemoteDataSource;
import app.chalo.ondc.remote.OndcRemoteDataSourceImpl;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.repository.OndcRepositoryImpl;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.local.PremiumBusLocalDataSourceImpl;
import app.chalo.premiumbus.data.mappers.CompleteProductConfigFetchExceptionMapper;
import app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSourceImpl;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl;
import app.chalo.premiumbus.domain.CheckAndShowPassPurchaseNudgeCard;
import app.chalo.premiumbus.domain.CheckIfMultiSeatSelectionAllowedUseCase;
import app.chalo.premiumbus.domain.CreatePremiumReserveTicketOrderUseCase;
import app.chalo.premiumbus.domain.FetchAggregatedSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.FetchEligibleStopChangesUseCase;
import app.chalo.premiumbus.domain.FetchPBAvailableSlotsUseCase;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.FetchPremiumBusBookingAvailablePurchaseOptionsUseCase;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.premiumbus.domain.FetchSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.GetAvailableSlotsForODPairsPaginatedUseCase;
import app.chalo.premiumbus.domain.GetAvailableSlotsForODPairsUseCase;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketsWithPendingTripFeedbackUseCase;
import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.premiumbus.domain.GetRecentPremiumBusProductsPurchasedUseCase;
import app.chalo.premiumbus.domain.GetSeatDisplayTypeUseCase;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryBannerUIStateBuilder;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.domain.ProcessSeatChangeRequestUseCase;
import app.chalo.premiumbus.domain.ProcessStopChangeRequestUseCase;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase;
import app.chalo.premiumbus.domain.ReserveSeatThroughPassUseCase;
import app.chalo.premiumbus.domain.SlotSelectionSectionInfoManager;
import app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketToPunchedStatusUseCase;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketTripFeedbackStatus;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.premiumbus.managers.PremiumBusSharedManagerViewModel;
import app.chalo.premiumbus.managers.SeatSelectionResultStateManager;
import app.chalo.premiumbus.managers.SlotSelectionResultStateManager;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegateResolver;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsStartedActionRunner;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory;
import app.chalo.premiumbus.ui.seatselection.SeatToggleDecisionHelper;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.productbooking.ProductBookingHelperImpl;
import app.chalo.productbooking.common.domain.BulkPreBookUseCase;
import app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed;
import app.chalo.productbooking.common.domain.FetchAvailableSlotsForPreBookingUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.productbooking.common.domain.FetchMobileTicketProductByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.GetCompleteProductConfigFromLocalCacheUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.routeselection.data.remote.RouteSelectionRemoteDataSource;
import app.chalo.routeselection.data.remote.RouteSelectionRemoteDataSourceImpl;
import app.chalo.routeselection.data.repository.RouteSelectionRepository;
import app.chalo.routeselection.data.repository.RouteSelectionRepositoryImpl;
import app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase;
import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.ConfirmBookingScreenArgs;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.MetroLandingArgs;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
import app.chalo.utils.BaseMobileTicketConverters;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationCommonUIManager;
import com.arkivanov.decompose.ComponentContext;
import defpackage.b81;
import defpackage.c81;
import defpackage.d81;
import defpackage.e81;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SharedProductBookingModuleKt {
    public static final void a(Module module) {
        SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$1 sharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$1 = new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchMultiModalGroupTicketAndStoreLocallyUseCase.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MultiModalGroupTicketEntityToAppModelConverter.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MultiModalGroupTicketLocalDataSourceImpl.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$1(), kind, emptyList), module)), new e81(1));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MultiModalGroupTicketRepositoryImpl.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$2(), kind, emptyList), module)), new e81(2));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MultiModalGroupTicketRemoteDataSourceImpl.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$3(), kind, emptyList), module)), new e81(3));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(NormalizeGroupTicketJourneyLegsUseCase.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchGroupTicketBookingFareDetailsUseCase.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GroupTicketSelectionUIStateFactory.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GroupTicketLegSelectionComponent.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetGroupTicketSummaryUseCase.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreateGroupTicketOrderUseCase.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GroupTicketSummaryUIStateFactory.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GroupTicketSummaryComponent.class), null, new SharedProductBookingModuleKt$multiModalTicketing$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
    }

    public static final void b(Module module) {
        SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$1 sharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$1 = new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(CheckAndShowPassPurchaseNudgeCard.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetAvailableSlotsForODPairsUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetAvailableSlotsForODPairsPaginatedUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchPBAvailableSlotsUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchPremiumBusBookingAvailablePurchaseOptionsUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SlotSelectionScreenUiStateFactory.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SlotSelectionSectionInfoManager.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusSharedManagerViewModel.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchPBODPairsForGivenLocationsUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusSlotSelectionComponent.class), null, new d81(9), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BulkPreBookUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchAvailableSlotsForPreBookingUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusDataStoreWrapper.class), null, new d81(10), Kind.Singleton, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ReschedulePremiumReserveTicketUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$12(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(TriggerPremiumBusBookingBookingEventsUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$13(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(UpdatePremiumReserveTicketToPunchedStatusUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$14(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetRecentPremiumBusProductsPurchasedUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$15(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PBStopDetailsComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$16(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PbPassPurchaseLandingScreenComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$17(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusProductSelectionComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$18(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchSeatSelectionLayoutUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$19(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProcessSeatChangeRequestUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$20(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchAggregatedSeatSelectionLayoutUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$21(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetSeatDisplayTypeUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$22(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusSeatSelectionUiStateFactory.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$23(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusFareDetailsUiStateFactory.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$24(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusSeatSelectionComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$25(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SeatToggleDecisionHelper.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$26(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckIfMultiSeatSelectionAllowedUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$27(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusBulkBookingConfirmationComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$28(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SlotSelectionListComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$29(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchEligibleStopChangesUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$30(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProcessStopChangeRequestUseCase.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$31(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusChangeStopUIStateFactory.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$32(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusChangeStopComponent.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$33(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusStopSelectionComponent.class), null, new d81(11), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PricingEngineRuleExpiryCountdownController.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$34(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PricingEngineRuleExpiryBannerUIStateBuilder.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$35(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PricingEngineRuleExpiryTickerDelegate.class), null, new SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$36(), kind, emptyList), module)), null);
    }

    public static final void c(Module module) {
        Intrinsics.i(module, "$this$module");
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$1 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$1 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$1();
        StringQualifier stringQualifierA = ScopeRegistry.Companion.a();
        Kind kind = Kind.Factory;
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(stringQualifierA, Reflection.a(GetPremiumReserveTicketsWithPendingTripFeedbackUseCase.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$1, kind, CollectionsKt.C()), module)), null);
        c81 c81Var = new c81(20);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$1 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$1 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$1();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusLocalDataSourceImpl.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$1, kind, CollectionsKt.C()), module)), c81Var);
        c81 c81Var2 = new c81(21);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$2 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$2 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$2();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusRemoteDataSourceImpl.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$2, kind, CollectionsKt.C()), module)), c81Var2);
        c81 c81Var3 = new c81(23);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$3 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$3 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$3();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusRepositoryImpl.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$3, kind, CollectionsKt.C()), module)), c81Var3);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$2 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$2 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$2();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdatePremiumReserveTicketTripFeedbackStatus.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$2, kind, CollectionsKt.C()), module)), null);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$3 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$3 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$3();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CompleteProductConfigFetchExceptionMapper.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$3, kind, CollectionsKt.C()), module)), null);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$4 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$4 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$4();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetLatestPremiumReserveTicketFromFirstBookingIdUseCase.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$4, kind, CollectionsKt.C()), module)), null);
        c81 c81Var4 = new c81(24);
        SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$4 sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$4 = new SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$4();
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketLocalDataSourceImpl.class), null, sharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$4, kind, CollectionsKt.C()), module)), c81Var4);
        c81 c81Var5 = new c81(25);
        Function2<Scope, ParametersHolder, InstantTicketRemoteDataSourceImpl> function2 = new Function2<Scope, ParametersHolder, InstantTicketRemoteDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new InstantTicketRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketRemoteDataSourceImpl.class), null, function2, kind, CollectionsKt.C()), module)), c81Var5);
        c81 c81Var6 = new c81(26);
        Function2<Scope, ParametersHolder, InstantTicketRepositoryImpl> function3 = new Function2<Scope, ParametersHolder, InstantTicketRepositoryImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRemoteDataSource.class), null, null);
                Object objD2 = scope.d(Reflection.a(InstantTicketLocalDataSource.class), null, null);
                Object objD3 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD6 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD7 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD8 = scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null);
                Object objD9 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                return new InstantTicketRepositoryImpl((InstantTicketRemoteDataSource) objD, (InstantTicketLocalDataSource) objD2, (CoroutineContextProvider) objD3, (CityProvider) objD4, (UserProfileDetailsProvider) objD5, (BasicInfoContract) objD6, (TimeUtilsContract) objD7, (GetDistinctIdUseCase) objD8, (LanguageFeature) objD9, (GetCityIdsInClusterProductHistoryUseCase) scope.d(Reflection.a(GetCityIdsInClusterProductHistoryUseCase.class), null, null), (BaseMobileTicketConverters) scope.d(Reflection.a(BaseMobileTicketConverters.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketRepositoryImpl.class), null, function3, kind, CollectionsKt.C()), module)), c81Var6);
        Function2<Scope, ParametersHolder, GetPremiumReserveTicketByIdUseCase> function4 = new Function2<Scope, ParametersHolder, GetPremiumReserveTicketByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetPremiumReserveTicketByIdUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, function4, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase> function5 = new Function2<Scope, ParametersHolder, GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase.class), null, function5, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIfWelcomeOfferForPremiumBusIsConsumed> function6 = new Function2<Scope, ParametersHolder, CheckIfWelcomeOfferForPremiumBusIsConsumed>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CheckIfWelcomeOfferForPremiumBusIsConsumed((GetOneTimeOfferConfigUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetOneTimeOfferConfigUseCase.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfWelcomeOfferForPremiumBusIsConsumed.class), null, function6, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetRecentAndFlippedOriginDestinationPairsUseCase> function7 = new Function2<Scope, ParametersHolder, GetRecentAndFlippedOriginDestinationPairsUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetRecentAndFlippedOriginDestinationPairsUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRecentAndFlippedOriginDestinationPairsUseCase.class), null, function7, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchPremiumReserveTicketAndStoreLocallyUseCase> function8 = new Function2<Scope, ParametersHolder, FetchPremiumReserveTicketAndStoreLocallyUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                return new FetchPremiumReserveTicketAndStoreLocallyUseCase((PremiumBusRepository) objD, (FetchMobileTicketProductByIdUseCase) scope.d(Reflection.a(FetchMobileTicketProductByIdUseCase.class), null, null), (GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase) scope.d(Reflection.a(GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, function8, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchMobileTicketProductByIdUseCase> function9 = new Function2<Scope, ParametersHolder, FetchMobileTicketProductByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchMobileTicketProductByIdUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchMobileTicketProductByIdUseCase.class), null, function9, kind, CollectionsKt.C()), module)), null);
        d81 d81Var = new d81(8);
        StringQualifier stringQualifierA2 = ScopeRegistry.Companion.a();
        Kind kind2 = Kind.Singleton;
        new KoinDefinition(module, i71.x(new BeanDefinition(stringQualifierA2, Reflection.a(ProductBookingDataStore.class), null, d81Var, kind2, CollectionsKt.C()), module));
        c81 c81Var7 = new c81(27);
        Function2<Scope, ParametersHolder, ProductBookingHelperImpl> function10 = new Function2<Scope, ParametersHolder, ProductBookingHelperImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProductBookingHelperImpl((OndcRepository) scope.d(Reflection.a(OndcRepository.class), null, null), (CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductBookingHelperImpl.class), null, function10, kind, CollectionsKt.C()), module)), c81Var7);
        Function2<Scope, ParametersHolder, FetchPremiumReserveTicketAndStoreLocallyUseCase> function11 = new Function2<Scope, ParametersHolder, FetchPremiumReserveTicketAndStoreLocallyUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                return new FetchPremiumReserveTicketAndStoreLocallyUseCase((PremiumBusRepository) objD, (FetchMobileTicketProductByIdUseCase) scope.d(Reflection.a(FetchMobileTicketProductByIdUseCase.class), null, null), (GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase) scope.d(Reflection.a(GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, function11, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchMobileTicketProductByIdUseCase> function12 = new Function2<Scope, ParametersHolder, FetchMobileTicketProductByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchMobileTicketProductByIdUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchMobileTicketProductByIdUseCase.class), null, function12, kind, CollectionsKt.C()), module)), null);
        c81 c81Var8 = new c81(28);
        Function2<Scope, ParametersHolder, MetroRemoteDataSourceImpl> function13 = new Function2<Scope, ParametersHolder, MetroRemoteDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new MetroRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroRemoteDataSourceImpl.class), null, function13, kind, CollectionsKt.C()), module)), c81Var8);
        c81 c81Var9 = new c81(29);
        Function2<Scope, ParametersHolder, MetroLocalDataSourceImpl> function14 = new Function2<Scope, ParametersHolder, MetroLocalDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MetroLocalDataSourceImpl((MetroTicketDao) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroTicketDao.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroLocalDataSourceImpl.class), null, function14, kind, CollectionsKt.C()), module)), c81Var9);
        c81 c81Var10 = new c81(22);
        Function2<Scope, ParametersHolder, MetroRepositoryImpl> function15 = new Function2<Scope, ParametersHolder, MetroRepositoryImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRemoteDataSource.class), null, null);
                Object objD2 = scope.d(Reflection.a(MetroLocalDataSource.class), null, null);
                Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new MetroRepositoryImpl((MetroRemoteDataSource) objD, (MetroLocalDataSource) objD2, (UserProfileDetailsProvider) objD3, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroRepositoryImpl.class), null, function15, kind, CollectionsKt.C()), module)), c81Var10);
        Function2<Scope, ParametersHolder, FetchTicketBookingsFareUseCase> function16 = new Function2<Scope, ParametersHolder, FetchTicketBookingsFareUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                return new FetchTicketBookingsFareUseCase((CityProvider) objD, (MetroRepository) scope.d(Reflection.a(MetroRepository.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchTicketBookingsFareUseCase.class), null, function16, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, StopBasedMetroLandingUiStateFactory> function17 = new Function2<Scope, ParametersHolder, StopBasedMetroLandingUiStateFactory>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new StopBasedMetroLandingUiStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopBasedMetroLandingUiStateFactory.class), null, function17, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, StopBasedMetroLandingScreenComponent> function18 = new Function2<Scope, ParametersHolder, StopBasedMetroLandingScreenComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(StopBasedMetroLandingArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD6 = scope.d(Reflection.a(RecentRepositoryProvider.class), null, null);
                Object objD7 = scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null);
                Object objD9 = scope.d(Reflection.a(FetchAllMetroStopsUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(FetchTicketBookingsFareUseCase.class), null, null);
                Object objD11 = scope.d(Reflection.a(StopBasedMetroLandingUiStateFactory.class), null, null);
                Object objD12 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD13 = scope.d(Reflection.a(GetProductCapabilitiesUseCase.class), null, null);
                Object objD14 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD15 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                return new StopBasedMetroLandingScreenComponent((ComponentContext) objD, (StopBasedMetroLandingArgs) objD2, (CityProvider) objD3, (StringProvider) objD4, (BasicInfoContract) objD5, (RecentRepositoryProvider) objD6, (RouteSearchResultStateManager) objD7, (FetchProductConfigsForUiUseCase) objD8, (FetchAllMetroStopsUseCase) objD9, (FetchTicketBookingsFareUseCase) objD10, (StopBasedMetroLandingUiStateFactory) objD11, (AnalyticsContract) objD12, (GetProductCapabilitiesUseCase) objD13, (KotlinToastManager) objD14, (ChaloNavigationManager) objD15, (LoginAuthGuard) scope.d(Reflection.a(LoginAuthGuard.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopBasedMetroLandingScreenComponent.class), null, function18, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ConfirmBookingUIStateFactory> function19 = new Function2<Scope, ParametersHolder, ConfirmBookingUIStateFactory>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ConfirmBookingUIStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ConfirmBookingUIStateFactory.class), null, function19, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetMetroFinalFareUseCase> function20 = new Function2<Scope, ParametersHolder, GetMetroFinalFareUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetMetroFinalFareUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetMetroFinalFareUseCase.class), null, function20, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateMetroTicketOrderUseCase> function21 = new Function2<Scope, ParametersHolder, CreateMetroTicketOrderUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CreateMetroTicketOrderUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateMetroTicketOrderUseCase.class), null, function21, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ConfirmBookingScreenComponent> function22 = new Function2<Scope, ParametersHolder, ConfirmBookingScreenComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(ConfirmBookingScreenArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(ConfirmBookingUIStateFactory.class), null, null);
                Object objD6 = scope.d(Reflection.a(GetMetroFinalFareUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(CreateMetroTicketOrderUseCase.class), null, null);
                Object objD8 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD10 = scope.d(Reflection.a(CheckoutResultStateManager.class), null, null);
                return new ConfirmBookingScreenComponent((ComponentContext) objD, (ConfirmBookingScreenArgs) objD2, (StringProvider) objD3, (AnalyticsContract) objD4, (ConfirmBookingUIStateFactory) objD5, (GetMetroFinalFareUseCase) objD6, (CreateMetroTicketOrderUseCase) objD7, (UserProfileDetailsProvider) objD8, (TimeUtilsContract) objD9, (CheckoutResultStateManager) objD10, (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ConfirmBookingScreenComponent.class), null, function22, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreMetroTicketUseCase> function23 = new Function2<Scope, ParametersHolder, FetchAndStoreMetroTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null);
                return new FetchAndStoreMetroTicketUseCase((MetroRepository) objD, (FetchMetroTicketUseCase) scope.d(Reflection.a(FetchMetroTicketUseCase.class), null, null), (GetMetroTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetMetroTicketAppModelFromApiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreMetroTicketUseCase.class), null, function23, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchMetroTicketUseCase> function24 = new Function2<Scope, ParametersHolder, FetchMetroTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchMetroTicketUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchMetroTicketUseCase.class), null, function24, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UpdateMetroBookingUseCase> function25 = new Function2<Scope, ParametersHolder, UpdateMetroBookingUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new UpdateMetroBookingUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateMetroBookingUseCase.class), null, function25, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetMetroTicketAppModelFromApiUseCase> function26 = new Function2<Scope, ParametersHolder, GetMetroTicketAppModelFromApiUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetMetroTicketAppModelFromApiUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetMetroTicketAppModelFromApiUseCase.class), null, function26, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreMetroLiveBookingStatusUseCase> function27 = new Function2<Scope, ParametersHolder, FetchAndStoreMetroLiveBookingStatusUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$24
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchAndStoreMetroLiveBookingStatusUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreMetroLiveBookingStatusUseCase.class), null, function27, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetMetroTicketByIdUseCase> function28 = new Function2<Scope, ParametersHolder, GetMetroTicketByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetMetroTicketByIdUseCase((MetroRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MetroRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetMetroTicketByIdUseCase.class), null, function28, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetGroupTicketSummaryUseCase> function29 = new Function2<Scope, ParametersHolder, GetGroupTicketSummaryUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetGroupTicketSummaryUseCase((MultiModalGroupTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MultiModalGroupTicketRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetGroupTicketSummaryUseCase.class), null, function29, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateGroupTicketOrderUseCase> function30 = new Function2<Scope, ParametersHolder, CreateGroupTicketOrderUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CreateGroupTicketOrderUseCase((MultiModalGroupTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MultiModalGroupTicketRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateGroupTicketOrderUseCase.class), null, function30, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GroupTicketSummaryUIStateFactory> function31 = new Function2<Scope, ParametersHolder, GroupTicketSummaryUIStateFactory>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$28
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                return new GroupTicketSummaryUIStateFactory((StringProvider) objD, (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (StepTicketModeBasedInfoUIStateFactory) scope.d(Reflection.a(StepTicketModeBasedInfoUIStateFactory.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GroupTicketSummaryUIStateFactory.class), null, function31, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GroupTicketSummaryComponent> function32 = new Function2<Scope, ParametersHolder, GroupTicketSummaryComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$29
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(GroupTicketBookingSummaryArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetGroupTicketSummaryUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(CreateGroupTicketOrderUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(GroupTicketSummaryUIStateFactory.class), null, null);
                Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD7 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                return new GroupTicketSummaryComponent((ComponentContext) objD, (GroupTicketBookingSummaryArgs) objD2, (GetGroupTicketSummaryUseCase) objD3, (CreateGroupTicketOrderUseCase) objD4, (GroupTicketSummaryUIStateFactory) objD5, (StringProvider) objD6, (KotlinToastManager) objD7, (ChaloNavigationManager) objD8, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GroupTicketSummaryComponent.class), null, function32, kind, CollectionsKt.C()), module)), null);
        e81 e81Var = new e81(0);
        Function2<Scope, ParametersHolder, OndcLocalDataSourceImpl> function33 = new Function2<Scope, ParametersHolder, OndcLocalDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new OndcLocalDataSourceImpl((OndcTicketDao) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcTicketDao.class), null, null), (OndcMetroTicketDao) scope.d(Reflection.a(OndcMetroTicketDao.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(OndcLocalDataSourceImpl.class), null, function33, kind, CollectionsKt.C()), module)), e81Var);
        e81 e81Var2 = new e81(4);
        Function2<Scope, ParametersHolder, OndcRemoteDataSourceImpl> function34 = new Function2<Scope, ParametersHolder, OndcRemoteDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new OndcRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(OndcRemoteDataSourceImpl.class), null, function34, kind, CollectionsKt.C()), module)), e81Var2);
        e81 e81Var3 = new e81(5);
        Function2<Scope, ParametersHolder, OndcRepositoryImpl> function35 = new Function2<Scope, ParametersHolder, OndcRepositoryImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRemoteDataSource.class), null, null);
                Object objD2 = scope.d(Reflection.a(OndcLocalDataSource.class), null, null);
                Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new OndcRepositoryImpl((OndcRemoteDataSource) objD, (OndcLocalDataSource) objD2, (UserProfileDetailsProvider) objD3, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(OndcRepositoryImpl.class), null, function35, kind, CollectionsKt.C()), module)), e81Var3);
        Function2<Scope, ParametersHolder, CompleteOndcPurchaseAndStoreTicketUseCase> function36 = new Function2<Scope, ParametersHolder, CompleteOndcPurchaseAndStoreTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CompleteOndcPurchaseAndStoreTicketUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null), (GetOndcTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetOndcTicketAppModelFromApiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CompleteOndcPurchaseAndStoreTicketUseCase.class), null, function36, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateOndcBookingUseCase> function37 = new Function2<Scope, ParametersHolder, CreateOndcBookingUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$31
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CreateOndcBookingUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateOndcBookingUseCase.class), null, function37, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateOndcOrderUseCase> function38 = new Function2<Scope, ParametersHolder, CreateOndcOrderUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$32
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CreateOndcOrderUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateOndcOrderUseCase.class), null, function38, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreOndcReceiptUseCase> function39 = new Function2<Scope, ParametersHolder, FetchAndStoreOndcReceiptUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$33
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchAndStoreOndcReceiptUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreOndcReceiptUseCase.class), null, function39, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreOndcTicketUseCase> function40 = new Function2<Scope, ParametersHolder, FetchAndStoreOndcTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$34
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null);
                return new FetchAndStoreOndcTicketUseCase((OndcRepository) objD, (FetchOndcTicketUseCase) scope.d(Reflection.a(FetchOndcTicketUseCase.class), null, null), (GetOndcTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetOndcTicketAppModelFromApiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreOndcTicketUseCase.class), null, function40, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchOndcTicketUseCase> function41 = new Function2<Scope, ParametersHolder, FetchOndcTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$35
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchOndcTicketUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchOndcTicketUseCase.class), null, function41, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetOndcTicketAppModelFromApiUseCase> function42 = new Function2<Scope, ParametersHolder, GetOndcTicketAppModelFromApiUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$36
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetOndcTicketAppModelFromApiUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOndcTicketAppModelFromApiUseCase.class), null, function42, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetOndcTicketUseCase> function43 = new Function2<Scope, ParametersHolder, GetOndcTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$37
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetOndcTicketUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOndcTicketUseCase.class), null, function43, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetOndcTicketByIdUseCase> function44 = new Function2<Scope, ParametersHolder, GetOndcTicketByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$38
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetOndcTicketByIdUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOndcTicketByIdUseCase.class), null, function44, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetOndcMetroTicketByIdUseCase> function45 = new Function2<Scope, ParametersHolder, GetOndcMetroTicketByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$39
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetOndcMetroTicketByIdUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOndcMetroTicketByIdUseCase.class), null, function45, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ClearInstantTicketsDuringLogoutUseCase> function46 = new Function2<Scope, ParametersHolder, ClearInstantTicketsDuringLogoutUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ClearInstantTicketsDuringLogoutUseCase((InstantTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ClearInstantTicketsDuringLogoutUseCase.class), null, function46, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateInstantTicketOrderUseCase> function47 = new Function2<Scope, ParametersHolder, CreateInstantTicketOrderUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$41
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null);
                return new CreateInstantTicketOrderUseCase((InstantTicketRepository) objD, (InstantTicketConfigHelper) scope.d(Reflection.a(InstantTicketConfigHelper.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateInstantTicketOrderUseCase.class), null, function47, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreInstantTicketReceiptUseCase> function48 = new Function2<Scope, ParametersHolder, FetchAndStoreInstantTicketReceiptUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$42
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchAndStoreInstantTicketReceiptUseCase((InstantTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreInstantTicketReceiptUseCase.class), null, function48, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchMobileTicketFareUseCase> function49 = new Function2<Scope, ParametersHolder, FetchMobileTicketFareUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$43
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(InstantTicketRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(OndcRepository.class), null, null);
                return new FetchMobileTicketFareUseCase((CityProvider) objD, (InstantTicketRepository) objD2, (OndcRepository) objD3, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchMobileTicketFareUseCase.class), null, function49, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InitiateInstantTicketFetchAndStoreUseCase> function50 = new Function2<Scope, ParametersHolder, InitiateInstantTicketFetchAndStoreUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$44
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InitiateInstantTicketFetchAndStoreUseCase((InstantTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InitiateInstantTicketFetchAndStoreUseCase.class), null, function50, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UpdateInstantTicketEntryInTableOnTapOutUseCase> function51 = new Function2<Scope, ParametersHolder, UpdateInstantTicketEntryInTableOnTapOutUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$45
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UpdateInstantTicketEntryInTableOnTapOutUseCase((InstantTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateInstantTicketEntryInTableOnTapOutUseCase.class), null, function51, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ValidateInstantTicketAmountUseCase> function52 = new Function2<Scope, ParametersHolder, ValidateInstantTicketAmountUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$46
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ValidateInstantTicketAmountUseCase((CurrencyFeature) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CurrencyFeature.class), null, null), (InstantTicketConfigHelper) scope.d(Reflection.a(InstantTicketConfigHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ValidateInstantTicketAmountUseCase.class), null, function52, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ValidateInstantTicketFareUseCase> function53 = new Function2<Scope, ParametersHolder, ValidateInstantTicketFareUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$47
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ValidateInstantTicketFareUseCase((InstantTicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ValidateInstantTicketFareUseCase.class), null, function53, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketProductValidationUIManager> function54 = new Function2<Scope, ParametersHolder, InstantTicketProductValidationUIManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$48
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InstantTicketProductValidationUIManager((ProductValidationCommonUIManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductValidationCommonUIManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketProductValidationUIManager.class), null, function54, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketReceiptManager> function55 = new Function2<Scope, ParametersHolder, InstantTicketReceiptManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$49
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new InstantTicketReceiptManager((FetchAndStoreInstantTicketReceiptUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchAndStoreInstantTicketReceiptUseCase.class), null, null), (InstantTicketUserDetailsForProducts) scope.d(Reflection.a(InstantTicketUserDetailsForProducts.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketReceiptManager.class), null, function55, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketValidationAnalyticManager> function56 = new Function2<Scope, ParametersHolder, InstantTicketValidationAnalyticManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new InstantTicketValidationAnalyticManager((AnalyticsContract) objD, (BasicInfoContract) objD2, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketValidationAnalyticManager.class), null, function56, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketValidationData> function57 = new Function2<Scope, ParametersHolder, InstantTicketValidationData>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$51
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(InstantTicketUserDetailsForProducts.class), null, null);
                Object objD3 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new InstantTicketValidationData((BasicInfoContract) objD, (InstantTicketUserDetailsForProducts) objD2, (CurrencyFeature) objD3, (StringProvider) objD4, (TimeUtilsContract) objD5, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (InstantTicketConfigHelper) scope.d(Reflection.a(InstantTicketConfigHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketValidationData.class), null, function57, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketValidationNavigationManager> function58 = new Function2<Scope, ParametersHolder, InstantTicketValidationNavigationManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new InstantTicketValidationNavigationManager((NavigationContract) scope.d(Reflection.a(NavigationContract.class), null, null), (ChaloNavigationManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketValidationNavigationManager.class), null, function58, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketValidationReportProblemManager> function59 = new Function2<Scope, ParametersHolder, InstantTicketValidationReportProblemManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$53
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new InstantTicketValidationReportProblemManager();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketValidationReportProblemManager.class), null, function59, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketUserDetailsForProducts> function60 = new Function2<Scope, ParametersHolder, InstantTicketUserDetailsForProducts>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$54
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InstantTicketUserDetailsForProducts((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketUserDetailsForProducts.class), null, function60, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchProductConfigsForUiUseCase> function61 = new Function2<Scope, ParametersHolder, FetchProductConfigsForUiUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$55
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new FetchProductConfigsForUiUseCase((BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (PremiumBusRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) objD2);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchProductConfigsForUiUseCase.class), null, function61, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchRouteDetailsLiveUseCase> function62 = new Function2<Scope, ParametersHolder, FetchRouteDetailsLiveUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$56
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
                Object objD3 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
                return new FetchRouteDetailsLiveUseCase((InstantTicketRepository) objD, (ChaloLocationManager) objD2, (LanguageFeature) objD3, (CityProvider) objD4, (StringProvider) objD5, (GetDistinctIdUseCase) scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null), (GetAutoCompleteCurrentCityTimeoutConfigUseCase) scope.d(Reflection.a(GetAutoCompleteCurrentCityTimeoutConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchRouteDetailsLiveUseCase.class), null, function62, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FilterAndSortMatchingStopsUseCase> function63 = new Function2<Scope, ParametersHolder, FilterAndSortMatchingStopsUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$57
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new FilterAndSortMatchingStopsUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FilterAndSortMatchingStopsUseCase.class), null, function63, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreatePremiumReserveTicketOrderUseCase> function64 = new Function2<Scope, ParametersHolder, CreatePremiumReserveTicketOrderUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$58
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CreatePremiumReserveTicketOrderUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreatePremiumReserveTicketOrderUseCase.class), null, function64, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ReserveSeatThroughPassUseCase> function65 = new Function2<Scope, ParametersHolder, ReserveSeatThroughPassUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$59
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, null);
                return new ReserveSeatThroughPassUseCase((PremiumBusRepository) objD, (FetchPremiumReserveTicketAndStoreLocallyUseCase) objD2, (CheckIsUserLoggedInUseCase) scope.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ReserveSeatThroughPassUseCase.class), null, function65, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchCompleteProductConfigByIdUseCase> function66 = new Function2<Scope, ParametersHolder, FetchCompleteProductConfigByIdUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$60
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                return new FetchCompleteProductConfigByIdUseCase((PremiumBusRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, function66, kind, CollectionsKt.C()), module)), null);
        d81 d81Var2 = new d81(12);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCompleteProductConfigFromLocalCacheUseCase.class), null, d81Var2, kind, CollectionsKt.C()), module));
        d81 d81Var3 = new d81(13);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchCompleteProductConfigByIdWithLocalCacheUseCase.class), null, d81Var3, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, FetchRoutesForGivenStopsUseCase> function67 = new Function2<Scope, ParametersHolder, FetchRoutesForGivenStopsUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$61
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                return new FetchRoutesForGivenStopsUseCase((CityProvider) objD, (RouteSelectionRepository) scope.d(Reflection.a(RouteSelectionRepository.class), null, null), (OndcRepository) scope.d(Reflection.a(OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchRoutesForGivenStopsUseCase.class), null, function67, kind, CollectionsKt.C()), module)), null);
        e81 e81Var4 = new e81(6);
        Function2<Scope, ParametersHolder, RouteSelectionRemoteDataSourceImpl> function68 = new Function2<Scope, ParametersHolder, RouteSelectionRemoteDataSourceImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new RouteSelectionRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RouteSelectionRemoteDataSourceImpl.class), null, function68, kind, CollectionsKt.C()), module)), e81Var4);
        e81 e81Var5 = new e81(7);
        Function2<Scope, ParametersHolder, RouteSelectionRepositoryImpl> function69 = new Function2<Scope, ParametersHolder, RouteSelectionRepositoryImpl>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new RouteSelectionRepositoryImpl((RouteSelectionRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RouteSelectionRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RouteSelectionRepositoryImpl.class), null, function69, kind, CollectionsKt.C()), module)), e81Var5);
        d81 d81Var4 = new d81(14);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, d81Var4, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetOndcMetroTicketAppModelFromApiUseCase> function70 = new Function2<Scope, ParametersHolder, GetOndcMetroTicketAppModelFromApiUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$62
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetOndcMetroTicketAppModelFromApiUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOndcMetroTicketAppModelFromApiUseCase.class), null, function70, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchOndcMetroTicketUseCase> function71 = new Function2<Scope, ParametersHolder, FetchOndcMetroTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$63
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchOndcMetroTicketUseCase((OndcRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchOndcMetroTicketUseCase.class), null, function71, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreOndcMetroTicketUseCase> function72 = new Function2<Scope, ParametersHolder, FetchAndStoreOndcMetroTicketUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$64
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", OndcRepository.class), null, null);
                return new FetchAndStoreOndcMetroTicketUseCase((OndcRepository) objD, (FetchOndcMetroTicketUseCase) scope.d(Reflection.a(FetchOndcMetroTicketUseCase.class), null, null), (GetOndcMetroTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetOndcMetroTicketAppModelFromApiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreOndcMetroTicketUseCase.class), null, function72, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchProductConfigsForUiUseCase> function73 = new Function2<Scope, ParametersHolder, FetchProductConfigsForUiUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$65
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new FetchProductConfigsForUiUseCase((BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (PremiumBusRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) objD2);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchProductConfigsForUiUseCase.class), null, function73, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchOndcConfigUseCase> function74 = new Function2<Scope, ParametersHolder, FetchOndcConfigUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$66
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FetchOndcConfigUseCase((FetchProductConfigsForUiUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchProductConfigsForUiUseCase.class), null, null), (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchOndcConfigUseCase.class), null, function74, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchOndcMetroLinesUseCase> function75 = new Function2<Scope, ParametersHolder, FetchOndcMetroLinesUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$67
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                return new FetchOndcMetroLinesUseCase((CityProvider) objD, (OndcRepository) scope.d(Reflection.a(OndcRepository.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchOndcMetroLinesUseCase.class), null, function75, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchOndcMetroLineStopsUseCase> function76 = new Function2<Scope, ParametersHolder, FetchOndcMetroLineStopsUseCase>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$68
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FetchOndcMetroLineStopsUseCase((OndcRepository) scope.d(Reflection.a(OndcRepository.class), null, null), (CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchOndcMetroLineStopsUseCase.class), null, function76, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MetroLandingScreenHelperFactory> function77 = new Function2<Scope, ParametersHolder, MetroLandingScreenHelperFactory>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$69
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MetroLandingScreenHelperFactory((GetProductCapabilitiesUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetProductCapabilitiesUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroLandingScreenHelperFactory.class), null, function77, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, RouteBasedMetroLandingScreenHelper> function78 = new Function2<Scope, ParametersHolder, RouteBasedMetroLandingScreenHelper>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$70
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchOndcMetroLineStopsUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new RouteBasedMetroLandingScreenHelper((FetchOndcMetroLineStopsUseCase) objD, (StringProvider) objD2, (CityProvider) objD3, (BasicInfoContract) objD4, (RecentRepositoryProvider) scope.d(Reflection.a(RecentRepositoryProvider.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RouteBasedMetroLandingScreenHelper.class), null, function78, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, StopBasedMetroLandingScreenHelper> function79 = new Function2<Scope, ParametersHolder, StopBasedMetroLandingScreenHelper>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$71
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new StopBasedMetroLandingScreenHelper((CityProvider) objD, (BasicInfoContract) objD2, (RecentRepositoryProvider) scope.d(Reflection.a(RecentRepositoryProvider.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopBasedMetroLandingScreenHelper.class), null, function79, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MetroLandingUiStateFactory> function80 = new Function2<Scope, ParametersHolder, MetroLandingUiStateFactory>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$72
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MetroLandingUiStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroLandingUiStateFactory.class), null, function80, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MetroLandingScreenComponent> function81 = new Function2<Scope, ParametersHolder, MetroLandingScreenComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$73
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(MetroLandingArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD6 = scope.d(Reflection.a(RecentRepositoryProvider.class), null, null);
                Object objD7 = scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null);
                Object objD9 = scope.d(Reflection.a(FetchOndcMetroLinesUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(FetchOndcMetroLineStopsUseCase.class), null, null);
                Object objD11 = scope.d(Reflection.a(FetchRoutesForGivenStopsUseCase.class), null, null);
                Object objD12 = scope.d(Reflection.a(FetchOndcConfigUseCase.class), null, null);
                Object objD13 = scope.d(Reflection.a(MetroLandingScreenHelperFactory.class), null, null);
                Object objD14 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD15 = scope.d(Reflection.a(MetroLandingUiStateFactory.class), null, null);
                return new MetroLandingScreenComponent((ComponentContext) objD, (MetroLandingArgs) objD2, (CityProvider) objD3, (StringProvider) objD4, (BasicInfoContract) objD5, (RecentRepositoryProvider) objD6, (RouteSearchResultStateManager) objD7, (UniversalSearchResultStateManager) objD8, (FetchOndcMetroLinesUseCase) objD9, (FetchOndcMetroLineStopsUseCase) objD10, (FetchRoutesForGivenStopsUseCase) objD11, (FetchOndcConfigUseCase) objD12, (MetroLandingScreenHelperFactory) objD13, (ChaloNavigationManager) objD14, (MetroLandingUiStateFactory) objD15, (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MetroLandingScreenComponent.class), null, function81, kind, CollectionsKt.C()), module)), null);
        b81 b81Var = new b81(29);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketWalletAccessComponent.class), null, b81Var, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, PickRouteLocationComponent> function82 = new Function2<Scope, ParametersHolder, PickRouteLocationComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$74
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(PickRouteLocationArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchRouteDetailsLiveUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(IsAgencyTagVisibleUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(RecentRepositoryProvider.class), null, null);
                Object objD7 = scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
                return new PickRouteLocationComponent((ComponentContext) objD, (PickRouteLocationArgs) objD2, (FetchRouteDetailsLiveUseCase) objD3, (FetchRouteDataFromRemoteUseCase) objD4, (IsAgencyTagVisibleUseCase) objD5, (RecentRepositoryProvider) objD6, (RouteSearchResultStateManager) objD7, (CityProvider) objD8, (StringProvider) objD9, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PickRouteLocationComponent.class), null, function82, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PickStopComponent> function83 = new Function2<Scope, ParametersHolder, PickStopComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$75
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(PickStopArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FilterAndSortMatchingStopsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                return new PickStopComponent((ComponentContext) objD, (PickStopArgs) objD2, (FilterAndSortMatchingStopsUseCase) objD3, (RouteSearchResultStateManager) objD4, (ChaloNavigationManager) objD5, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PickStopComponent.class), null, function83, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, RouteBasedStopSearchForProductPurchaseComponent> function84 = new Function2<Scope, ParametersHolder, RouteBasedStopSearchForProductPurchaseComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$76
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(TicketPurchaseArgs.RouteSelectionArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(InstantTicketConfigHelper.class), null, null);
                Object objD5 = scope.d(Reflection.a(ProductBookingDataStore.class), null, null);
                Object objD6 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD7 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                return new RouteBasedStopSearchForProductPurchaseComponent((ComponentContext) objD, (TicketPurchaseArgs.RouteSelectionArgs) objD2, (StringProvider) objD3, (InstantTicketConfigHelper) objD4, (ProductBookingDataStore) objD5, (AnalyticsContract) objD6, (ChaloNavigationManager) objD7, (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (RouteSearchResultStateManager) scope.d(Reflection.a(RouteSearchResultStateManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RouteBasedStopSearchForProductPurchaseComponent.class), null, function84, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FareDetailsCoordinatorComponent> function85 = new Function2<Scope, ParametersHolder, FareDetailsCoordinatorComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$77
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FareDetailsCoordinatorComponent((FareDetailsArgs) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FareDetailsArgs.class), null, null), (ComponentContext) scope.d(Reflection.a(ComponentContext.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FareDetailsCoordinatorComponent.class), null, function85, kind, CollectionsKt.C()), module)), null);
        d81 d81Var5 = new d81(0);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FareDetailsComponent.class), null, d81Var5, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, StopBasedRouteSearchForProductPurchaseComponent> function86 = new Function2<Scope, ParametersHolder, StopBasedRouteSearchForProductPurchaseComponent>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$78
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(TicketPurchaseArgs.StopSelectionArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchRoutesForGivenStopsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD8 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(RecentRepositoryProvider.class), null, null);
                Object objD10 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD11 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD12 = scope.d(Reflection.a(FetchOndcConfigUseCase.class), null, null);
                Object objD13 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD14 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD15 = scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null);
                return new StopBasedRouteSearchForProductPurchaseComponent((ComponentContext) objD, (TicketPurchaseArgs.StopSelectionArgs) objD2, (FetchRoutesForGivenStopsUseCase) objD3, (FetchCompleteProductConfigByIdUseCase) objD4, (FetchProductConfigsForUiUseCase) objD5, (StoreCompleteProductConfigLocallyUseCase) objD6, (StringProvider) objD7, (CityProvider) objD8, (RecentRepositoryProvider) objD9, (BasicInfoContract) objD10, (AnalyticsContract) objD11, (FetchOndcConfigUseCase) objD12, (ChaloNavigationManager) objD13, (KotlinToastManager) objD14, (UniversalSearchResultStateManager) objD15, (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null), (IsCityEnabledForLiveTrackingUseCase) scope.d(Reflection.a(IsCityEnabledForLiveTrackingUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopBasedRouteSearchForProductPurchaseComponent.class), null, function86, kind, CollectionsKt.C()), module)), null);
        b(module);
        Function2<Scope, ParametersHolder, DefaultBookingSuccessFlowDelegate> function87 = new Function2<Scope, ParametersHolder, DefaultBookingSuccessFlowDelegate>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$79
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BookingSuccessArgs.ProductSuccessScreen.class), null, null);
                Object objD2 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD4 = scope.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new DefaultBookingSuccessFlowDelegate((BookingSuccessArgs.ProductSuccessScreen) objD, (StringProvider) objD2, (ChaloNavigationManager) objD3, (GetPremiumReserveTicketByIdUseCase) objD4, (TimeUtilsContract) objD5, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (TriggerPremiumBusBookingBookingEventsUseCase) scope.d(Reflection.a(TriggerPremiumBusBookingBookingEventsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DefaultBookingSuccessFlowDelegate.class), null, function87, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BulkBookingAcknowledgementDelegate> function88 = new Function2<Scope, ParametersHolder, BulkBookingAcknowledgementDelegate>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BookingSuccessArgs.BulkBooking.class), null, null);
                Object objD2 = scope.d(Reflection.a(StringProvider.class), null, null);
                return new BulkBookingAcknowledgementDelegate((BookingSuccessArgs.BulkBooking) objD, (StringProvider) objD2, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (BulkPreBookUseCase) scope.d(Reflection.a(BulkPreBookUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BulkBookingAcknowledgementDelegate.class), null, function88, kind, CollectionsKt.C()), module)), null);
        d81 d81Var6 = new d81(1);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusFareDetailsStartedActionRunner.class), null, d81Var6, kind, CollectionsKt.C()), module));
        d81 d81Var7 = new d81(2);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TicketPurchaseThroughPassDelegate.class), null, d81Var7, kind, CollectionsKt.C()), module));
        d81 d81Var8 = new d81(3);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FreshPurchaseDelegate.class), null, d81Var8, kind, CollectionsKt.C()), module));
        d81 d81Var9 = new d81(4);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TicketPurchaseWithPassUpsellNudgeDelegate.class), null, d81Var9, kind, CollectionsKt.C()), module));
        d81 d81Var10 = new d81(5);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingSuccessComponent.class), null, d81Var10, kind, CollectionsKt.C()), module));
        d81 d81Var11 = new d81(6);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusFareDetailsDelegateResolver.class), null, d81Var11, kind, CollectionsKt.C()), module));
        d81 d81Var12 = new d81(7);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusFareDetailsComponent.class), null, d81Var12, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, SeatSelectionResultStateManager> function89 = new Function2<Scope, ParametersHolder, SeatSelectionResultStateManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new SeatSelectionResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SeatSelectionResultStateManager.class), null, function89, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SlotSelectionResultStateManager> function90 = new Function2<Scope, ParametersHolder, SlotSelectionResultStateManager>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new SlotSelectionResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SlotSelectionResultStateManager.class), null, function90, kind2, CollectionsKt.C()), module)), null);
        a(module);
        Function2<Scope, ParametersHolder, BaseMobileTicketConverters> function91 = new Function2<Scope, ParametersHolder, BaseMobileTicketConverters>() { // from class: app.chalo.productbooking.di.SharedProductBookingModuleKt$sharedModule$lambda$0$$inlined$factoryOf$default$81
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new BaseMobileTicketConverters((CrashlyticsLogger) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CrashlyticsLogger.class), null, null), (GetOndcMetroTicketAppModelFromApiUseCase) scope.d(Reflection.a(GetOndcMetroTicketAppModelFromApiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BaseMobileTicketConverters.class), null, function91, kind, CollectionsKt.C()), module)), null);
    }
}
