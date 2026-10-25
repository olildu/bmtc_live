package app.chalo.home.di;

import app.chalo.ProductsSyncContractImpl;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appsupport.BookingHelpScreenComponent;
import app.chalo.appsupport.data.remote.BookingHelpRemoteDataSource;
import app.chalo.appsupport.data.remote.BookingHelpRemoteDataSourceImpl;
import app.chalo.appsupport.data.repository.BookingHelpRepository;
import app.chalo.appsupport.data.repository.BookingHelpRepositoryImpl;
import app.chalo.appsupport.domain.CancelBookingUseCase;
import app.chalo.appsupport.uistate.BookingHelpUIStateFactory;
import app.chalo.base.NavigationContractImpl;
import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore;
import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepositoryImpl;
import app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory;
import app.chalo.citydata.domain.FetchCityIdFromLatLngUseCase;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citylocationselection.CityMetaDataManagerImpl;
import app.chalo.citylocationselection.FetchBasicCityInfoListUseCase;
import app.chalo.citylocationselection.FetchCityMetaDataUseCase;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.electricitybill.di.ElectricityBillModuleKt;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.CheckoutMTicketDetailsHelperImpl;
import app.chalo.helper.CoroutineScopeHelper;
import app.chalo.helper.FeedbackFeature;
import app.chalo.helper.FeedbackFeatureImpl;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.helper.ProductDataDeletionHelperImpl;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.ChaloChainedBottomSheetFeatureImpl;
import app.chalo.home.HomeScreenInfoHelperImpl;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.analytics.HomeScreenAnalyticsHelperImpl;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.contract.ProductReceiptContractImpl;
import app.chalo.home.data.local.HomeScreenConfigLocalDataStore;
import app.chalo.home.data.remote.HomeScreenConfigRemoteDataSource;
import app.chalo.home.data.remote.IHomeScreenConfigRemoteDataSource;
import app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource;
import app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSourceImpl;
import app.chalo.home.data.remote.PremiumPassSavingRemoteDataSource;
import app.chalo.home.data.remote.PremiumPassSavingRemoteDataSourceImpl;
import app.chalo.home.data.repository.HomeScreenConfigRepository;
import app.chalo.home.data.repository.IHomeScreenConfigRepository;
import app.chalo.home.data.repository.PremiumBusRemoteRepository;
import app.chalo.home.data.repository.PremiumBusRemoteRepositoryImpl;
import app.chalo.home.data.repository.PremiumPassSavingRemoteRepositoryImpl;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.data.repository.TicketRepositoryImpl;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase;
import app.chalo.home.domain.FetchAndStoreProductConfigByIdUseCase;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.home.domain.FetchChaloBusPassEligibleForRideRollOverUseCase;
import app.chalo.home.domain.FetchHistoryScreenConfigDataUseCase;
import app.chalo.home.domain.FetchHomeTabSearchRemovalConfigUseCase;
import app.chalo.home.domain.FetchPremiumPassSavingsUseCase;
import app.chalo.home.domain.FetchRouteSchedulesUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.home.domain.GetChaloPageItemsUseCase;
import app.chalo.home.domain.GetCurrentCityAgencyNameUseCase;
import app.chalo.home.domain.GetHomePageItemsUseCase;
import app.chalo.home.domain.GetHomeScreenConfigUseCase;
import app.chalo.home.domain.GetHomeScreenStartDestinationTabUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase;
import app.chalo.home.domain.GetPremiumBusUserMetadataUseCase;
import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.home.domain.GetProductStatusUIUseCase;
import app.chalo.home.domain.GetProfilePageItemsUseCase;
import app.chalo.home.domain.GetRecentSearchListUseCase;
import app.chalo.home.domain.GetRegularBusPageItemsUseCase;
import app.chalo.home.domain.PremiumBusContentConfigUseCase;
import app.chalo.home.domain.ResolveChaloBusStickyBannerEligibilityUseCase;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.home.domain.ShouldCallWalletSyncApiUseCase;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import app.chalo.home.helper.HomeScreenConfigDataHelperImpl;
import app.chalo.home.helper.InstantTicketConfigHelperImpl;
import app.chalo.home.helper.NearbyBusMarkerHelper;
import app.chalo.home.manager.AppRatingProcessManagerInstanceHandler;
import app.chalo.home.manager.AppRatingProcessManagerProvider;
import app.chalo.home.manager.AppRatingProcessSkeletonImpl;
import app.chalo.home.manager.HomeScreenConfigManagerImpl;
import app.chalo.home.nearbytrips.domain.FetchNearbyTripsUseCase;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelper;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMarkerHelper;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManagerImpl;
import app.chalo.home.ui.PremiumBusNotificationComponent;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.PremiumBusTutorialComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoUiStateFactory;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.factory.MyTicketsUiStateFactory;
import app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper;
import app.chalo.home.ui.history.factory.mapper.active.HistoryActiveTicketsUiStateMapperHelper;
import app.chalo.home.ui.history.factory.mapper.expired.HistoryExpiredTicketsUiStateMapperHelper;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesUiStateFactory;
import app.chalo.home.ui.selectride.SelectRideUiStateFactory;
import app.chalo.home.ui.selectridescreen.SelectRideComponent;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.domain.ClearInstantTicketsDuringLogoutUseCase;
import app.chalo.instantticket.validation.InstantTicketProductValidationUIManager;
import app.chalo.instantticket.validation.InstantTicketValidationAnalyticManager;
import app.chalo.instantticket.validation.InstantTicketValidationData;
import app.chalo.instantticket.validation.InstantTicketValidationNavigationManager;
import app.chalo.instantticket.validation.InstantTicketValidationReportProblemManager;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider;
import app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.location.ChaloLocationManager;
import app.chalo.locationdisclaimer.LocationDisclaimerComponent;
import app.chalo.locationdisclaimer.domain.GetLocationDisclaimerStepsAndLottieTypeUseCase;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator;
import app.chalo.mTicketing.validation.MTicketProductValidationConfig;
import app.chalo.mTicketing.validation.di.MTicketingValidationModuleKt;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.metro.di.MetroValidationModuleKt;
import app.chalo.metro.domain.GetMetroTicketAppModelFromApiUseCase;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.metro.validation.MetroTicketProductValidationConfig;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.mticketing.dao.LastRideInfoDao;
import app.chalo.models.mticketing.dao.MTicketActivationStoreDao;
import app.chalo.models.mticketing.dao.TicketDao;
import app.chalo.mticket.domain.CalculateMTicketFareUseCase;
import app.chalo.mticket.domain.CheckIfFreeRideAvailableUseCase;
import app.chalo.mticket.domain.CreateMTicketOrderUseCase;
import app.chalo.mticket.domain.FetchMTicketFareBetweenStopsUseCase;
import app.chalo.mticket.domain.FreeRideHelpUrlUseCase;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIStateFactory;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.domain.GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationAnalyticsManagerFactory;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationData;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationReportProblemManager;
import app.chalo.multimodalticket.validation.MultiModalValidationNavigationManager;
import app.chalo.multimodalticket.validation.MultiModalValidationUIManager;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptManager;
import app.chalo.ncmc.cardreceipt.UserDetailsForChaloCard;
import app.chalo.ncmc.di.NcmcModuleKt;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.notification.managers.NotificationCentralProcessingManagerImpl;
import app.chalo.notification.managers.NotificationDisplayDataManagerImpl;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.ondc.di.OndcMetroValidationModuleKt;
import app.chalo.ondc.di.OndcValidationModuleKt;
import app.chalo.ondc.domain.GetOndcTicketAppModelFromApiUseCase;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.validation.OndcTicketProductValidationConfig;
import app.chalo.ondc.validation.OndcTicketReceiptManager;
import app.chalo.ondc.validation.OndcTicketUserDetailsForProducts;
import app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationConfig;
import app.chalo.ondc.validation.metro.OndcMetroTicketReceiptManager;
import app.chalo.ondc.validation.metro.OndcMetroTicketUserDetailsForProducts;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.PremiumBusAnalyticsHelperImpl;
import app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRemoteDataSourceImpl;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepositoryImpl;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.common.domain.PassUpsellPurchaseWrapperImpl;
import app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.FetchPBAvailableSlotsUseCase;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase;
import app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase;
import app.chalo.premiumbus.domains.PremiumBusBulkBookingHelperImpl;
import app.chalo.premiumbus.managers.SeatSelectionResultStateManager;
import app.chalo.premiumbus.navigation.ProductBookingNavigationManagerImpl;
import app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.AddPremiumBusTripDetailsIfNotDoneUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.CancelPremiumReserveTicketUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.DeletePremiumReserveTicketsUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusProductsModificationReasonsListUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusTicketsUpdateOptionsUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketReceiptUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTicketForAckDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusVehicleInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketReceiptManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationAnalyticsManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationNavigationManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationReportProblemManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationUIManager;
import app.chalo.productactivation.domain.GetActivationProductDataUseCase;
import app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder;
import app.chalo.productbooking.ProductBookingHelperImpl;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productdatasync.repository.ProductDataSyncRepository;
import app.chalo.productdatasync.repository.remote.ProductDataSyncRemoteDataSource;
import app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase;
import app.chalo.productpurchase.passpurchase.domain.FetchSuperPassCashPaymentInfoUseCase;
import app.chalo.productpurchase.passpurchase.domain.GetPassVerificationTimingDetailsUseCase;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.productpurchase.passpurchase.domain.RefreshSelectedBookableSuperPassConfigurationUseCase;
import app.chalo.productpurchase.passpurchase.domain.SubmitSuperPassApplicationUseCase;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory;
import app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessComponent;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent;
import app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource;
import app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSourceImpl;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepositoryImpl;
import app.chalo.productpurchase.productselection.domain.FetchFreeRideCountForUserUseCase;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.productpurchase.productselection.domain.GroupTicketConfigEligibilityHelperImpl;
import app.chalo.productpurchase.productselection.domain.ProductConfigFetchHelperImpl;
import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.productpurchase.utils.RenewSuperPassHelper;
import app.chalo.productsummary.data.remote.ProductInvoiceGenerationRemoteDataSource;
import app.chalo.productsummary.data.remote.ProductInvoiceGenerationRemoteDataSourceImpl;
import app.chalo.productsummary.data.repository.ProductInvoiceGenerationRepository;
import app.chalo.productsummary.data.repository.ProductInvoiceGenerationRepositoryImpl;
import app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.productsummary.domain.PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.productsummary.ui.pass.PassSummaryComponent;
import app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory;
import app.chalo.productsummary.ui.ticket.ProductSummaryUIStateFactory;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TripSummaryUIStateFactory;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig;
import app.chalo.quickpay.validation.manager.QuickPayReceiptManager;
import app.chalo.reportproblem.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.reportproblem.ReportProblemComponent;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.ridefeedback.di.RideFeedbackModuleKt;
import app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase;
import app.chalo.ridehailing.di.RideHailingModuleKt;
import app.chalo.routedetails.LiveTrackingNavigationContractImpl;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.ForceAppUpdateArgs;
import app.chalo.scenes.args.LocationDisclaimerArgs;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs;
import app.chalo.scenes.args.PremiumBusTutorialScreenArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import app.chalo.sos.SosScreenComponent;
import app.chalo.sos.SosScreenUIStateFactory;
import app.chalo.sos.data.remote.RaiseSOSRemoteDataSourceImpl;
import app.chalo.sos.data.repository.RaiseSOSRepositoryImpl;
import app.chalo.sos.feature.SosContactsFeature;
import app.chalo.sos.feature.SosFeaturePlatformDelegateProviderImpl;
import app.chalo.sos.official.GetOfficialSosContactsUseCase;
import app.chalo.sos.official.SosPhoneNumberNormalizer;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelperImpl;
import app.chalo.stoptripdetails.data.domain.FetchStopTripDetailsUseCase;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.stoptripdetails.ui.StopTripDetailsComponent;
import app.chalo.superpass.data.dao.DigitalTripReceiptDao;
import app.chalo.superpass.data.features.DigitalTripReceiptFeature;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.superpass.data.features.IVisualValidationFeature;
import app.chalo.superpass.data.features.UnsyncedActivationsSyncHelperImpl;
import app.chalo.superpass.data.features.VisualValidationFeature;
import app.chalo.superpass.data.remote.DigitalTripReceiptRemoteDataSource;
import app.chalo.superpass.data.remote.DigitalTripReceiptRemoteDataSourceImpl;
import app.chalo.superpass.data.repository.DigitalTripReceiptRepository;
import app.chalo.superpass.data.repository.SuperPassHistoryCallHelperImpl;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.superpass.domain.GetSuperPassDetailsUseCase;
import app.chalo.superpass.domain.InsertOrUpdatePassInPassTableUseCase;
import app.chalo.superpass.utils.CheckoutPostPaymentSuperPassDetailsHelperImpl;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.data.TITOValidationDataRepositoryImpl;
import app.chalo.tito.data.local.TITOValidationDataSource;
import app.chalo.tito.data.local.TITOValidationDataSourceImpl;
import app.chalo.tito.data.local.TitoLocalDataStore;
import app.chalo.tito.data.repository.dao.TITOValidationDao;
import app.chalo.tito.domain.CheckIsUnifiedTitoFlowEnabledUseCase;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase;
import app.chalo.tito.domain.GetCachedRouteInfoRouteIdUseCase;
import app.chalo.tito.domain.GetCachedStopFromStopIdUseCase;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.tito.domain.GetSuperPassForSuperPassIdUseCase;
import app.chalo.tito.domain.GetTitoTapIdForUnifiedFlowUseCase;
import app.chalo.tito.domain.GroupAsActiveExpiredAndUnknownFromProductsListUseCase;
import app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl;
import app.chalo.titoridedetail.domain.HandleLastProductActivationOnTitoMissedTapOutUseCase;
import app.chalo.titoridedetail.manager.TitoRideDataManagerImpl;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
import app.chalo.tripreceipt.domain.FetchSuperPassTripHistoryDataUseCase;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.GetBookableProductConfigForRenewUseCase;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetProductConfigListFromAgencyUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.IsLocationMandatoryForUserUseCase;
import app.chalo.usecase.RaiseSOSUseCase;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideDao;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceDao;
import app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource;
import app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSourceImpl;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepositoryImpl;
import app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore;
import app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl;
import app.chalo.usercommutepreference.domain.AddCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.CheckSaveRideEligibilityUseCase;
import app.chalo.usercommutepreference.domain.DeleteCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase;
import app.chalo.usercommutepreference.domain.FetchCommutePreferenceSummaryUseCase;
import app.chalo.usercommutepreference.domain.FetchSavedRideForODPairUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferencePlacesUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferenceSavedRidesUseCase;
import app.chalo.usercommutepreference.domain.SaveOrEditRideUseCase;
import app.chalo.usercommutepreference.domain.UpdateCommutePreferenceUseCase;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.BaseMobileTicketConverters;
import app.chalo.utils.CommonHtmlParser;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.ProductUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.ProductValidationConfigProviderImpl;
import app.chalo.validation.instantticket.InstantTicketProductValidationConfig;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validation.superpass.SuperPassProductValidationConfig;
import app.chalo.validation.superpass.SuperPassProductValidationReportProblemManager;
import app.chalo.validation.superpass.SuperPassProductValidationUIManager;
import app.chalo.validation.superpass.SuperPassValidationAnalyticsManager;
import app.chalo.validation.superpass.SuperPassValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationCommonUIManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigFactory;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase;
import app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.webview.WebViewScreenComponent;
import app.chalo.worker.IWorkerDataStore;
import app.chalo.workers.ChaloTimeBackgroundWorkerTask;
import com.arkivanov.decompose.ComponentContext;
import defpackage.i71;
import defpackage.t71;
import defpackage.v71;
import defpackage.w71;
import defpackage.x71;
import defpackage.y71;
import defpackage.z71;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.DefinitionBindingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SharedHomeModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "$this$module");
        RideHailingModuleKt.a(module);
        RideFeedbackModuleKt.a(module);
        Function2<Scope, ParametersHolder, FetchNearbyTripsUseCase> function2 = new Function2<Scope, ParametersHolder, FetchNearbyTripsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StopTripDetailsRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloConfigFeature.class), null, null);
                Object objD6 = scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                return new FetchNearbyTripsUseCase((StopTripDetailsRepository) objD, (ChaloLocationManager) objD2, (BasicInfoContract) objD3, (TimeUtilsContract) objD4, (ChaloConfigFeature) objD5, (GetDistinctIdUseCase) objD6, (LanguageFeature) objD7, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (CityDataRepository) scope.d(Reflection.a(CityDataRepository.class), null, null));
            }
        };
        StringQualifier stringQualifierA = ScopeRegistry.Companion.a();
        Kind kind = Kind.Factory;
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(stringQualifierA, Reflection.a(FetchNearbyTripsUseCase.class), null, function2, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, NearbyTripsDataManagerBase> function3 = new Function2<Scope, ParametersHolder, NearbyTripsDataManagerBase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(CoroutineScopeHelper.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchNearbyTripsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(NearbyTripsDataOrderManagerNew.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetEstimatedTimeUseCase.class), null, null);
                return new NearbyTripsDataManagerBase((CoroutineContextProvider) objD, (CoroutineScopeHelper) objD2, (FetchNearbyTripsUseCase) objD3, (NearbyTripsDataOrderManagerNew) objD4, (GetEstimatedTimeUseCase) objD5, (GetRelevantScheduledTripFromStopTripsList) scope.d(Reflection.a(GetRelevantScheduledTripFromStopTripsList.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NearbyTripsDataManagerBase.class), null, function3, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, NearbyTripsDataOrderManagerNew> function4 = new Function2<Scope, ParametersHolder, NearbyTripsDataOrderManagerNew>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new NearbyTripsDataOrderManagerNew((TripPlannerItineraryLiveInfoManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TripPlannerItineraryLiveInfoManager.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NearbyTripsDataOrderManagerNew.class), null, function4, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GeoSpatialLiveBusesDataPollingManager> function5 = new Function2<Scope, ParametersHolder, GeoSpatialLiveBusesDataPollingManager>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchGeoSpatialDataUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetGeoQueryCityWiseConfigUseCase.class), null, null);
                return new GeoSpatialLiveBusesDataPollingManager((FetchGeoSpatialDataUseCase) objD, (CoroutineContextProvider) objD2, (CityProvider) objD3, (IReportProblemFeature) objD4, (GetGeoQueryCityWiseConfigUseCase) objD5, (RouteAvailabilityBannerRepository) scope.d(Reflection.a(RouteAvailabilityBannerRepository.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GeoSpatialLiveBusesDataPollingManager.class), null, function5, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetGeoQueryCityWiseConfigUseCase> function6 = new Function2<Scope, ParametersHolder, GetGeoQueryCityWiseConfigUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new GetGeoQueryCityWiseConfigUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD3, (ChaloConfigFeature) objD, (CityProvider) objD2);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetGeoQueryCityWiseConfigUseCase.class), null, function6, kind, CollectionsKt.C()), module)), null);
        t71 t71Var = new t71(28);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchGeoSpatialDataUseCase.class), null, t71Var, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetHomeScreenConfigUseCase> function7 = new Function2<Scope, ParametersHolder, GetHomeScreenConfigUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", IHomeScreenConfigRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD4 = scope.d(Reflection.a(HtmlTextUIHelper.class), null, null);
                Object objD5 = scope.d(Reflection.a(CommonHtmlParser.class), null, null);
                Object objD6 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                return new GetHomeScreenConfigUseCase((IHomeScreenConfigRepository) objD, (BasicInfoContract) objD2, (CrashlyticsLogger) objD3, (HtmlTextUIHelper) objD4, (CommonHtmlParser) objD5, (CoroutineContextProvider) objD6, (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null), (LanguagePlatformHelper) scope.d(Reflection.a(LanguagePlatformHelper.class), null, null));
            }
        };
        StringQualifier stringQualifierA2 = ScopeRegistry.Companion.a();
        Kind kind2 = Kind.Singleton;
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(stringQualifierA2, Reflection.a(GetHomeScreenConfigUseCase.class), null, function7, kind2, CollectionsKt.C()), module)), null);
        v71 v71Var = new v71(23);
        Function2<Scope, ParametersHolder, HomeScreenAnalyticsHelperImpl> function8 = new Function2<Scope, ParametersHolder, HomeScreenAnalyticsHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new HomeScreenAnalyticsHelperImpl((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null), (StopTripDetailsAnalyticsEventHelper) scope.d(Reflection.a(StopTripDetailsAnalyticsEventHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenAnalyticsHelperImpl.class), null, function8, kind, CollectionsKt.C()), module)), v71Var);
        x71 x71Var = new x71(4);
        Function2<Scope, ParametersHolder, StopTripDetailsAnalyticsEventHelperImpl> function9 = new Function2<Scope, ParametersHolder, StopTripDetailsAnalyticsEventHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(SystemHelper.class), null, null);
                return new StopTripDetailsAnalyticsEventHelperImpl((AnalyticsContract) objD, (SystemHelper) objD2, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (FireAppOpenEventIfRequiredUseCase) scope.d(Reflection.a(FireAppOpenEventIfRequiredUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopTripDetailsAnalyticsEventHelperImpl.class), null, function9, kind, CollectionsKt.C()), module)), x71Var);
        w71 w71Var = new w71(22);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenConfigLocalDataStore.class), null, w71Var, kind2, CollectionsKt.C()), module));
        w71 w71Var2 = new w71(25);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateDebugBuildEnvironmentUseCase.class), null, w71Var2, kind, CollectionsKt.C()), module));
        NcmcModuleKt.a(module);
        x71 x71Var2 = new x71(24);
        Function2<Scope, ParametersHolder, HomeScreenConfigManagerImpl> function10 = new Function2<Scope, ParametersHolder, HomeScreenConfigManagerImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new HomeScreenConfigManagerImpl((GetHomeScreenConfigUseCase) scope.d(Reflection.a(GetHomeScreenConfigUseCase.class), null, null), (CityProvider) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenConfigManagerImpl.class), null, function10, kind2, CollectionsKt.C()), module)), x71Var2);
        z71 z71Var = new z71(2);
        Function2<Scope, ParametersHolder, HomeScreenConfigRemoteDataSource> function11 = new Function2<Scope, ParametersHolder, HomeScreenConfigRemoteDataSource>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                Object objD2 = scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null);
                return new HomeScreenConfigRemoteDataSource((NetworkManager) objD, (GenericNetworkExceptionMapper) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenConfigRemoteDataSource.class), null, function11, kind2, CollectionsKt.C()), module)), z71Var);
        z71 z71Var2 = new z71(10);
        Function2<Scope, ParametersHolder, HomeScreenConfigRepository> function12 = new Function2<Scope, ParametersHolder, HomeScreenConfigRepository>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new HomeScreenConfigRepository((IHomeScreenConfigRemoteDataSource) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", IHomeScreenConfigRemoteDataSource.class), null, null), (HomeScreenConfigLocalDataStore) scope.d(Reflection.a(HomeScreenConfigLocalDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenConfigRepository.class), null, function12, kind2, CollectionsKt.C()), module)), z71Var2);
        z71 z71Var3 = new z71(19);
        Function2<Scope, ParametersHolder, ChaloChainedBottomSheetFeatureImpl> function13 = new Function2<Scope, ParametersHolder, ChaloChainedBottomSheetFeatureImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ChaloChainedBottomSheetFeatureImpl((CrashlyticsLogger) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloChainedBottomSheetFeatureImpl.class), null, function13, kind2, CollectionsKt.C()), module)), z71Var3);
        y71 y71Var = new y71(16);
        DefinitionBindingKt.a(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenInfoHelperImpl.class), null, y71Var, kind2, CollectionsKt.C()), module)), Reflection.a(HomeScreenInfoHelper.class));
        Function2<Scope, ParametersHolder, ProductUtils> function14 = new Function2<Scope, ParametersHolder, ProductUtils>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductUtils((GetAvailableChaloCardOptionsUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetAvailableChaloCardOptionsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductUtils.class), null, function14, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ShouldCallWalletSyncApiUseCase> function15 = new Function2<Scope, ParametersHolder, ShouldCallWalletSyncApiUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetWalletSetupConfigurationUseCase.class), null, null);
                return new ShouldCallWalletSyncApiUseCase((GetWalletSetupConfigurationUseCase) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (ProductUtils) scope.d(Reflection.a(ProductUtils.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ShouldCallWalletSyncApiUseCase.class), null, function15, kind, CollectionsKt.C()), module)), null);
        x71 x71Var3 = new x71(2);
        Function2<Scope, ParametersHolder, CityMetaDataManagerImpl> function16 = new Function2<Scope, ParametersHolder, CityMetaDataManagerImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", FetchCityIdFromLatLngUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(FetchCityMetaDataUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchBasicCityInfoListUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(CityMetaPropsLocalDataSource.class), null, null);
                return new CityMetaDataManagerImpl((FetchCityIdFromLatLngUseCase) objD, (FetchCityMetaDataUseCase) objD2, (FetchBasicCityInfoListUseCase) objD3, (CityMetaPropsLocalDataSource) objD4, (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CityMetaDataManagerImpl.class), null, function16, kind2, CollectionsKt.C()), module)), x71Var3);
        w71 w71Var3 = new w71(20);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CityMetaPropsLocalDataSource.class), null, w71Var3, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetProfilePageItemsUseCase> function17 = new Function2<Scope, ParametersHolder, GetProfilePageItemsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchWalletBalanceUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null);
                Object objD6 = scope.d(Reflection.a(WalletResolver.class), null, null);
                return new GetProfilePageItemsUseCase((FetchWalletBalanceUseCase) objD, (UserProfileDetailsProvider) objD2, (CurrencyFeature) objD3, (StringProvider) objD4, (HomeScreenAnalyticsHelper) objD5, (WalletResolver) objD6, (UserProfilingHooksOrchestrator) scope.d(Reflection.a(UserProfilingHooksOrchestrator.class), null, null), (JuspayControllerProvider) scope.d(Reflection.a(JuspayControllerProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProfilePageItemsUseCase.class), null, function17, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchBasicCityInfoListUseCase> function18 = new Function2<Scope, ParametersHolder, FetchBasicCityInfoListUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(NetworkManager.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloUrlProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new FetchBasicCityInfoListUseCase((ChaloBuildConfig) objD5, (BasicInfoContract) objD, (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null), (ChaloUrlProvider) objD3, (NetworkManager) objD2, (UserProfileDetailsProvider) objD4, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchBasicCityInfoListUseCase.class), null, function18, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchCityMetaDataUseCase> function19 = new Function2<Scope, ParametersHolder, FetchCityMetaDataUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloUrlProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new FetchCityMetaDataUseCase((ChaloBuildConfig) objD5, (BasicInfoContract) objD3, (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null), (ChaloUrlProvider) objD2, (NetworkManager) objD, (UserProfileDetailsProvider) objD4, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchCityMetaDataUseCase.class), null, function19, kind, CollectionsKt.C()), module)), null);
        w71 w71Var4 = new w71(24);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassRepository.class), null, w71Var4, kind2, CollectionsKt.C()), module));
        x71 x71Var4 = new x71(23);
        Function2<Scope, ParametersHolder, SuperPassHistoryCallHelperImpl> function20 = new Function2<Scope, ParametersHolder, SuperPassHistoryCallHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new SuperPassHistoryCallHelperImpl((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassHistoryCallHelperImpl.class), null, function20, kind, CollectionsKt.C()), module)), x71Var4);
        Function2<Scope, ParametersHolder, ResolveChaloBusStickyBannerEligibilityUseCase> function21 = new Function2<Scope, ParametersHolder, ResolveChaloBusStickyBannerEligibilityUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfilingHooksRuleEngine.class), null, null);
                Object objD3 = scope.d(Reflection.a(PremiumBusUserSurveyPreferenceRepository.class), null, null);
                Object objD4 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new ResolveChaloBusStickyBannerEligibilityUseCase((UserProfileDetailsProvider) objD, (UserProfilingHooksRuleEngine) objD2, (PremiumBusUserSurveyPreferenceRepository) objD3, (CrashlyticsLogger) objD4, (PremiumBusRepository) scope.d(Reflection.a(PremiumBusRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveChaloBusStickyBannerEligibilityUseCase.class), null, function21, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, AcknowledgePremiumReserveTicketCancellationUseCase> function22 = new Function2<Scope, ParametersHolder, AcknowledgePremiumReserveTicketCancellationUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new AcknowledgePremiumReserveTicketCancellationUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AcknowledgePremiumReserveTicketCancellationUseCase.class), null, function22, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, AddPremiumBusTripDetailsIfNotDoneUseCase> function23 = new Function2<Scope, ParametersHolder, AddPremiumBusTripDetailsIfNotDoneUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new AddPremiumBusTripDetailsIfNotDoneUseCase((FetchPremiumBusBookingsTripDetailsUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchPremiumBusBookingsTripDetailsUseCase.class), null, null), (PremiumBusRepository) scope.d(Reflection.a(PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AddPremiumBusTripDetailsIfNotDoneUseCase.class), null, function23, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetActivePremiumReserveTicketBetweenGivenTimeUseCase> function24 = new Function2<Scope, ParametersHolder, GetActivePremiumReserveTicketBetweenGivenTimeUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null);
                return new GetActivePremiumReserveTicketBetweenGivenTimeUseCase((PremiumBusRepository) objD, (CityProvider) objD2, (BasicInfoContract) objD3, (UserProfileDetailsProvider) objD4, (CheckIsUserLoggedInUseCase) objD5, (AddPremiumBusTripDetailsIfNotDoneUseCase) scope.d(Reflection.a(AddPremiumBusTripDetailsIfNotDoneUseCase.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetActivePremiumReserveTicketBetweenGivenTimeUseCase.class), null, function24, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumReserveTicketsWithPendingAckUseCase> function25 = new Function2<Scope, ParametersHolder, GetPremiumReserveTicketsWithPendingAckUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetLatestPremiumReserveTicketFromFirstBookingIdUseCase.class), null, null);
                return new GetPremiumReserveTicketsWithPendingAckUseCase((PremiumBusRepository) objD, (CityProvider) objD2, (UserProfileDetailsProvider) objD3, (CheckIsUserLoggedInUseCase) objD4, (GetLatestPremiumReserveTicketFromFirstBookingIdUseCase) objD5, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumReserveTicketsWithPendingAckUseCase.class), null, function25, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchPremiumBusTicketsUpdateOptionsUseCase> function26 = new Function2<Scope, ParametersHolder, FetchPremiumBusTicketsUpdateOptionsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchPremiumBusTicketsUpdateOptionsUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumBusTicketsUpdateOptionsUseCase.class), null, function26, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchPremiumBusTripDetailsAndLiveEtaUseCase> function27 = new Function2<Scope, ParametersHolder, FetchPremiumBusTripDetailsAndLiveEtaUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusTripDetailsPollingHelper.class), null, null);
                Object objD2 = scope.d(Reflection.a(LiveTrackingDataManager.class), null, null);
                return new FetchPremiumBusTripDetailsAndLiveEtaUseCase((PremiumBusTripDetailsPollingHelper) objD, (LiveTrackingDataManager) objD2, (ProductsSyncContract) scope.d(Reflection.a(ProductsSyncContract.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumBusTripDetailsAndLiveEtaUseCase.class), null, function27, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumBusUserMetadataUseCase> function28 = new Function2<Scope, ParametersHolder, GetPremiumBusUserMetadataUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetPremiumBusUserMetadataUseCase((GetAllRequestedBookedProductsUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetAllRequestedBookedProductsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumBusUserMetadataUseCase.class), null, function28, kind, CollectionsKt.C()), module)), null);
        x71 x71Var5 = new x71(29);
        Function2<Scope, ParametersHolder, PremiumBusAnalyticsHelperImpl> function29 = new Function2<Scope, ParametersHolder, PremiumBusAnalyticsHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new PremiumBusAnalyticsHelperImpl((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusAnalyticsHelperImpl.class), null, function29, kind, CollectionsKt.C()), module)), x71Var5);
        Function2<Scope, ParametersHolder, PremiumBusBookingsTripPollingManager> function30 = new Function2<Scope, ParametersHolder, PremiumBusBookingsTripPollingManager>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(FetchPremiumBusBookingsTripDetailsUseCase.class), null, null);
                return new PremiumBusBookingsTripPollingManager((CoroutineContextProvider) objD, (FetchPremiumBusBookingsTripDetailsUseCase) objD2, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusBookingsTripPollingManager.class), null, function30, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProcessPremiumBusTicketForAckDataUseCase> function31 = new Function2<Scope, ParametersHolder, ProcessPremiumBusTicketForAckDataUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProcessPremiumBusTicketForAckDataUseCase((GetLatestPremiumReserveTicketFromFirstBookingIdUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetLatestPremiumReserveTicketFromFirstBookingIdUseCase.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProcessPremiumBusTicketForAckDataUseCase.class), null, function31, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PremiumBusTripDetailsPollingHelper> function32 = new Function2<Scope, ParametersHolder, PremiumBusTripDetailsPollingHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new PremiumBusTripDetailsPollingHelper((PremiumBusBookingsTripPollingManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusBookingsTripPollingManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusTripDetailsPollingHelper.class), null, function32, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProcessPremiumBusTripTimeInfoUseCase> function33 = new Function2<Scope, ParametersHolder, ProcessPremiumBusTripTimeInfoUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetPremiumBusCurrentCityConfigUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetTodayOrTomorrowOrDateUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                return new ProcessPremiumBusTripTimeInfoUseCase((GetPremiumBusCurrentCityConfigUseCase) objD, (GetTodayOrTomorrowOrDateUseCase) objD2, (BasicInfoContract) objD3, (StringProvider) objD4, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProcessPremiumBusTripTimeInfoUseCase.class), null, function33, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProcessPremiumBusVehicleInfoUseCase> function34 = new Function2<Scope, ParametersHolder, ProcessPremiumBusVehicleInfoUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new ProcessPremiumBusVehicleInfoUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProcessPremiumBusVehicleInfoUseCase.class), null, function34, kind, CollectionsKt.C()), module)), null);
        y71 y71Var2 = new y71(9);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumReserveTicketPostBookingActionHandler.class), null, y71Var2, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, NewPremiumBusReserveTicketActivationComponent> function35 = new Function2<Scope, ParametersHolder, NewPremiumBusReserveTicketActivationComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusActivationArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(PremiumReserveTicketPostBookingActionHandler.class), null, null);
                Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD6 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD7 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null);
                Object objD9 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD10 = scope.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null);
                Object objD11 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD12 = scope.d(Reflection.a(SystemHelper.class), null, null);
                Object objD13 = scope.d(Reflection.a(ShouldCheckBLEPermissionForActivationUseCase.class), null, null);
                Object objD14 = scope.d(Reflection.a(CheckBluetoothPermissionHelper.class), null, null);
                Object objD15 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
                Object objD16 = scope.d(Reflection.a(AdjustManager.class), null, null);
                return new NewPremiumBusReserveTicketActivationComponent((PremiumBusActivationArgs) objD, (ComponentContext) objD2, (PremiumReserveTicketPostBookingActionHandler) objD3, (CityProvider) objD4, (UserProfileDetailsProvider) objD5, (AnalyticsContract) objD6, (ChaloNavigationManager) objD7, (IUserPreferencesDataStore) objD8, (StringProvider) objD9, (ValidationSceneResolverUseCase) objD10, (KotlinToastManager) objD11, (SystemHelper) objD12, (ShouldCheckBLEPermissionForActivationUseCase) objD13, (CheckBluetoothPermissionHelper) objD14, (PermissionHandlerProvider) objD15, (AdjustManager) objD16, (IReportProblemFeature) scope.d(Reflection.a(IReportProblemFeature.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NewPremiumBusReserveTicketActivationComponent.class), null, function35, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchPremiumBusProductsModificationReasonsListUseCase> function36 = new Function2<Scope, ParametersHolder, FetchPremiumBusProductsModificationReasonsListUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$24
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchPremiumBusProductsModificationReasonsListUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumBusProductsModificationReasonsListUseCase.class), null, function36, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CancelPremiumReserveTicketUseCase> function37 = new Function2<Scope, ParametersHolder, CancelPremiumReserveTicketUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CancelPremiumReserveTicketUseCase((PremiumBusRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null), (FetchPremiumReserveTicketAndStoreLocallyUseCase) scope.d(Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CancelPremiumReserveTicketUseCase.class), null, function37, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIsUnifiedTitoFlowEnabledUseCase> function38 = new Function2<Scope, ParametersHolder, CheckIsUnifiedTitoFlowEnabledUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckIsUnifiedTitoFlowEnabledUseCase((BasicInfoContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIsUnifiedTitoFlowEnabledUseCase.class), null, function38, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetActiveTitoTripsAndUpdateRestUseCase> function39 = new Function2<Scope, ParametersHolder, GetActiveTitoTripsAndUpdateRestUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new GetActiveTitoTripsAndUpdateRestUseCase((TITOValidationDataRepository) objD, (UserProfileDetailsProvider) objD2, (GetAllActiveTappedInTripsUseCase) scope.d(Reflection.a(GetAllActiveTappedInTripsUseCase.class), null, null), (GroupAsActiveExpiredAndUnknownFromProductsListUseCase) scope.d(Reflection.a(GroupAsActiveExpiredAndUnknownFromProductsListUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetActiveTitoTripsAndUpdateRestUseCase.class), null, function39, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetAllActiveTappedInTripsUseCase> function40 = new Function2<Scope, ParametersHolder, GetAllActiveTappedInTripsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$28
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetAllActiveTappedInTripsUseCase((TITOValidationDataRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetAllActiveTappedInTripsUseCase.class), null, function40, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetSuperPassForSuperPassIdUseCase> function41 = new Function2<Scope, ParametersHolder, GetSuperPassForSuperPassIdUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$29
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetSuperPassForSuperPassIdUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetSuperPassForSuperPassIdUseCase.class), null, function41, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GroupAsActiveExpiredAndUnknownFromProductsListUseCase> function42 = new Function2<Scope, ParametersHolder, GroupAsActiveExpiredAndUnknownFromProductsListUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetSuperPassForSuperPassIdUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(QuickPayRepository.class), null, null);
                return new GroupAsActiveExpiredAndUnknownFromProductsListUseCase((GetSuperPassForSuperPassIdUseCase) objD, (QuickPayRepository) objD2, (InstantTicketRepository) scope.d(Reflection.a(InstantTicketRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GroupAsActiveExpiredAndUnknownFromProductsListUseCase.class), null, function42, kind, CollectionsKt.C()), module)), null);
        z71 z71Var4 = new z71(13);
        Function2<Scope, ParametersHolder, TitoRideDataManagerImpl> function43 = new Function2<Scope, ParametersHolder, TitoRideDataManagerImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineScopeHelper.class), null, null);
                Object objD2 = scope.d(Reflection.a(LiveTrackingDataManager.class), null, null);
                Object objD3 = scope.d(Reflection.a(RouteTrackingDataProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(CheckLiveBusDelayedUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(TITOValidationDataRepository.class), null, null);
                Object objD7 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                return new TitoRideDataManagerImpl((CoroutineScopeHelper) objD, (LiveTrackingDataManager) objD2, (RouteTrackingDataProvider) objD3, (StringProvider) objD4, (CheckLiveBusDelayedUseCase) objD5, (TITOValidationDataRepository) objD6, (AnalyticsContract) objD7, (PolylineUtils) scope.d(Reflection.a(PolylineUtils.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TitoRideDataManagerImpl.class), null, function43, kind, CollectionsKt.C()), module)), z71Var4);
        z71 z71Var5 = new z71(21);
        Function2<Scope, ParametersHolder, TITOValidationDataRepositoryImpl> function44 = new Function2<Scope, ParametersHolder, TITOValidationDataRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new TITOValidationDataRepositoryImpl((TITOValidationDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TITOValidationDataRepositoryImpl.class), null, function44, kind, CollectionsKt.C()), module)), z71Var5);
        z71 z71Var6 = new z71(27);
        Function2<Scope, ParametersHolder, TITOValidationDataSourceImpl> function45 = new Function2<Scope, ParametersHolder, TITOValidationDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new TITOValidationDataSourceImpl((TITOValidationDao) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDao.class), null, null), (TitoLocalDataStore) scope.d(Reflection.a(TitoLocalDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TITOValidationDataSourceImpl.class), null, function45, kind, CollectionsKt.C()), module)), z71Var6);
        w71 w71Var5 = new w71(0);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TitoLocalDataStore.class), null, w71Var5, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetActiveTitoEntryForProductUseCase> function46 = new Function2<Scope, ParametersHolder, GetActiveTitoEntryForProductUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$31
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetActiveTitoEntryForProductUseCase((TITOValidationDataRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetActiveTitoEntryForProductUseCase.class), null, function46, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetHomePageItemsUseCase> function47 = new Function2<Scope, ParametersHolder, GetHomePageItemsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$32
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetHomePageItemsUseCase((HomeScreenAnalyticsHelper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", HomeScreenAnalyticsHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetHomePageItemsUseCase.class), null, function47, kind, CollectionsKt.C()), module)), null);
        w71 w71Var6 = new w71(8);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsLocationMandatoryForUserUseCase.class), null, w71Var6, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, FetchHomeTabSearchRemovalConfigUseCase> function48 = new Function2<Scope, ParametersHolder, FetchHomeTabSearchRemovalConfigUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$33
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RemoteConfigFetcherContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(CheckIfExperimentEnabledUseCase.class), null, null);
                return new FetchHomeTabSearchRemovalConfigUseCase((RemoteConfigFetcherContract) objD, (CheckIfExperimentEnabledUseCase) objD2, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (ABTestAnalyticsContract) scope.d(Reflection.a(ABTestAnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchHomeTabSearchRemovalConfigUseCase.class), null, function48, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetHomeScreenStartDestinationTabUseCase> function49 = new Function2<Scope, ParametersHolder, GetHomeScreenStartDestinationTabUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$34
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                return new GetHomeScreenStartDestinationTabUseCase((CoroutineContextProvider) objD, (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (AdjustManager) scope.d(Reflection.a(AdjustManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetHomeScreenStartDestinationTabUseCase.class), null, function49, kind, CollectionsKt.C()), module)), null);
        x71 x71Var6 = new x71(1);
        Function2<Scope, ParametersHolder, ProductsSyncContractImpl> function50 = new Function2<Scope, ParametersHolder, ProductsSyncContractImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProductsSyncContractImpl((InitiateProductHistorySyncCallUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InitiateProductHistorySyncCallUseCase.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductsSyncContractImpl.class), null, function50, kind, CollectionsKt.C()), module)), x71Var6);
        w71 w71Var7 = new w71(10);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProfileScreenComponent.class), null, w71Var7, kind, CollectionsKt.C()), module));
        w71 w71Var8 = new w71(11);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InitiateProductHistorySyncCallUseCase.class), null, w71Var8, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, MobileTicketingConverters> function51 = new Function2<Scope, ParametersHolder, MobileTicketingConverters>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$35
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetOndcTicketAppModelFromApiUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetMetroTicketAppModelFromApiUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase.class), null, null);
                return new MobileTicketingConverters((GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase) objD, (GetOndcTicketAppModelFromApiUseCase) objD2, (GetMetroTicketAppModelFromApiUseCase) objD3, (GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase) objD4, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (BaseMobileTicketConverters) scope.d(Reflection.a(BaseMobileTicketConverters.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MobileTicketingConverters.class), null, function51, kind, CollectionsKt.C()), module)), null);
        w71 w71Var9 = new w71(12);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeComponent.class), null, w71Var9, kind, CollectionsKt.C()), module));
        w71 w71Var10 = new w71(13);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenComponent.class), null, w71Var10, kind, CollectionsKt.C()), module));
        w71 w71Var11 = new w71(14);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchPremiumPassSavingsUseCase.class), null, w71Var11, kind, CollectionsKt.C()), module));
        w71 w71Var12 = new w71(15);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloBusComponent.class), null, w71Var12, kind, CollectionsKt.C()), module));
        w71 w71Var13 = new w71(16);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PBUserProfileSurveyPreferenceDataStore.class), null, w71Var13, kind2, CollectionsKt.C()), module));
        x71 x71Var7 = new x71(3);
        Function2<Scope, ParametersHolder, PremiumBusUserSurveyPreferenceRepositoryImpl> function52 = new Function2<Scope, ParametersHolder, PremiumBusUserSurveyPreferenceRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PremiumBusUserSurveyPreferenceRepositoryImpl((PBUserProfileSurveyPreferenceDataStore) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", PBUserProfileSurveyPreferenceDataStore.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusUserSurveyPreferenceRepositoryImpl.class), null, function52, kind2, CollectionsKt.C()), module)), x71Var7);
        Function2<Scope, ParametersHolder, GetPremiumBusUserSurveyPreferenceUseCase> function53 = new Function2<Scope, ParametersHolder, GetPremiumBusUserSurveyPreferenceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$36
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusUserSurveyPreferenceRepository.class), null, null);
                return new GetPremiumBusUserSurveyPreferenceUseCase((PremiumBusUserSurveyPreferenceRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumBusUserSurveyPreferenceUseCase.class), null, function53, kind, CollectionsKt.C()), module)), null);
        w71 w71Var14 = new w71(17);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PBUserProfileSurveyPreferenceDataStore.class), null, w71Var14, kind2, CollectionsKt.C()), module));
        x71 x71Var8 = new x71(5);
        Function2<Scope, ParametersHolder, PremiumBusUserSurveyPreferenceRepositoryImpl> function54 = new Function2<Scope, ParametersHolder, PremiumBusUserSurveyPreferenceRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PremiumBusUserSurveyPreferenceRepositoryImpl((PBUserProfileSurveyPreferenceDataStore) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", PBUserProfileSurveyPreferenceDataStore.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusUserSurveyPreferenceRepositoryImpl.class), null, function54, kind2, CollectionsKt.C()), module)), x71Var8);
        Function2<Scope, ParametersHolder, GetPremiumBusUserSurveyPreferenceUseCase> function55 = new Function2<Scope, ParametersHolder, GetPremiumBusUserSurveyPreferenceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$37
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusUserSurveyPreferenceRepository.class), null, null);
                return new GetPremiumBusUserSurveyPreferenceUseCase((PremiumBusUserSurveyPreferenceRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumBusUserSurveyPreferenceUseCase.class), null, function55, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloBusUserProfileSurveyUiStateFactory> function56 = new Function2<Scope, ParametersHolder, ChaloBusUserProfileSurveyUiStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$38
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloBusUserProfileSurveyUiStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloBusUserProfileSurveyUiStateFactory.class), null, function56, kind, CollectionsKt.C()), module)), null);
        w71 w71Var15 = new w71(18);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloBusUserProfileSurveyComponent.class), null, w71Var15, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, PremiumBusTutorialComponent> function57 = new Function2<Scope, ParametersHolder, PremiumBusTutorialComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$39
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(PremiumBusTutorialScreenArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD4 = scope.d(Reflection.a(UrlOpenHelper.class), null, null);
                Object objD5 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                return new PremiumBusTutorialComponent((ComponentContext) objD, (PremiumBusTutorialScreenArgs) objD2, (ChaloNavigationManager) objD3, (UrlOpenHelper) objD4, (KotlinToastManager) objD5, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusTutorialComponent.class), null, function57, kind, CollectionsKt.C()), module)), null);
        x71 x71Var9 = new x71(6);
        Function2<Scope, ParametersHolder, AppRatingProcessManagerInstanceHandler> function58 = new Function2<Scope, ParametersHolder, AppRatingProcessManagerInstanceHandler>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new AppRatingProcessManagerInstanceHandler((AnalyticsContract) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AppRatingProcessManagerInstanceHandler.class), null, function58, kind2, CollectionsKt.C()), module)), x71Var9);
        x71 x71Var10 = new x71(7);
        Function2<Scope, ParametersHolder, AppRatingProcessSkeletonImpl> function59 = new Function2<Scope, ParametersHolder, AppRatingProcessSkeletonImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AppRatingProcessManagerProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                return new AppRatingProcessSkeletonImpl((AppRatingProcessManagerProvider) objD, (AnalyticsContract) objD2, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AppRatingProcessSkeletonImpl.class), null, function59, kind, CollectionsKt.C()), module)), x71Var10);
        Function2<Scope, ParametersHolder, CheckIfAppUpdateRequiredUseCase> function60 = new Function2<Scope, ParametersHolder, CheckIfAppUpdateRequiredUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", IHomeScreenConfigRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null);
                return new CheckIfAppUpdateRequiredUseCase((IHomeScreenConfigRepository) objD, (GetDistinctIdUseCase) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfAppUpdateRequiredUseCase.class), null, function60, kind, CollectionsKt.C()), module)), null);
        x71 x71Var11 = new x71(8);
        Function2<Scope, ParametersHolder, HomeTabScreensNavigationAndStateManagerImpl> function61 = new Function2<Scope, ParametersHolder, HomeTabScreensNavigationAndStateManagerImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new HomeTabScreensNavigationAndStateManagerImpl((ChaloNavigationManager) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeTabScreensNavigationAndStateManagerImpl.class), null, function61, kind2, CollectionsKt.C()), module)), x71Var11);
        Function2<Scope, ParametersHolder, GetRegularBusPageItemsUseCase> function62 = new Function2<Scope, ParametersHolder, GetRegularBusPageItemsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$41
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetRegularBusPageItemsUseCase((HomeScreenAnalyticsHelper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", HomeScreenAnalyticsHelper.class), null, null), (CommonHtmlParser) scope.d(Reflection.a(CommonHtmlParser.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRegularBusPageItemsUseCase.class), null, function62, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetRecentSearchListUseCase> function63 = new Function2<Scope, ParametersHolder, GetRecentSearchListUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$42
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetRecentSearchListUseCase((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRecentSearchListUseCase.class), null, function63, kind, CollectionsKt.C()), module)), null);
        w71 w71Var16 = new w71(19);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NearbyBusMarkerHelper.class), null, w71Var16, kind2, CollectionsKt.C()), module));
        x71 x71Var12 = new x71(9);
        Function2<Scope, ParametersHolder, ProductBookingHelperImpl> function64 = new Function2<Scope, ParametersHolder, ProductBookingHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProductBookingHelperImpl((OndcRepository) scope.d(Reflection.a(OndcRepository.class), null, null), (CityProvider) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductBookingHelperImpl.class), null, function64, kind2, CollectionsKt.C()), module)), x71Var12);
        w71 w71Var17 = new w71(21);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RegularBusComponent.class), null, w71Var17, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetChaloPageItemsUseCase> function65 = new Function2<Scope, ParametersHolder, GetChaloPageItemsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$43
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetChaloPageItemsUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetChaloPageItemsUseCase.class), null, function65, kind, CollectionsKt.C()), module)), null);
        x71 x71Var13 = new x71(10);
        Function2<Scope, ParametersHolder, DigitalTripReceiptFeature> function66 = new Function2<Scope, ParametersHolder, DigitalTripReceiptFeature>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(DigitalTripReceiptRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new DigitalTripReceiptFeature((CoroutineContextProvider) objD, (DigitalTripReceiptRepository) objD2, (AnalyticsContract) objD3, (UserProfileDetailsProvider) objD4, (CrashlyticsLogger) objD5, (MTicketUtilsHelper) scope.d(Reflection.a(MTicketUtilsHelper.class), null, null), (MobileTicketingConverters) scope.d(Reflection.a(MobileTicketingConverters.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DigitalTripReceiptFeature.class), null, function66, kind, CollectionsKt.C()), module)), x71Var13);
        x71 x71Var14 = new x71(11);
        Function2<Scope, ParametersHolder, DigitalTripReceiptRemoteDataSourceImpl> function67 = new Function2<Scope, ParametersHolder, DigitalTripReceiptRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new DigitalTripReceiptRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DigitalTripReceiptRemoteDataSourceImpl.class), null, function67, kind, CollectionsKt.C()), module)), x71Var14);
        Function2<Scope, ParametersHolder, DigitalTripReceiptRepository> function68 = new Function2<Scope, ParametersHolder, DigitalTripReceiptRepository>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$44
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", DigitalTripReceiptDao.class), null, null);
                Object objD2 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new DigitalTripReceiptRepository((DigitalTripReceiptDao) objD, (AnalyticsContract) objD2, (CrashlyticsLogger) objD3, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (DigitalTripReceiptRemoteDataSource) scope.d(Reflection.a(DigitalTripReceiptRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DigitalTripReceiptRepository.class), null, function68, kind, CollectionsKt.C()), module)), null);
        x71 x71Var15 = new x71(12);
        Function2<Scope, ParametersHolder, VisualValidationFeature> function69 = new Function2<Scope, ParametersHolder, VisualValidationFeature>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                return new VisualValidationFeature((CoroutineContextProvider) objD, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(VisualValidationFeature.class), null, function69, kind, CollectionsKt.C()), module)), x71Var15);
        x71 x71Var16 = new x71(13);
        Function2<Scope, ParametersHolder, UnsyncedActivationsSyncHelperImpl> function70 = new Function2<Scope, ParametersHolder, UnsyncedActivationsSyncHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UnsyncedActivationsSyncHelperImpl((IDigitalTripReceiptFeature) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", IDigitalTripReceiptFeature.class), null, null), (IVisualValidationFeature) scope.d(Reflection.a(IVisualValidationFeature.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UnsyncedActivationsSyncHelperImpl.class), null, function70, kind, CollectionsKt.C()), module)), x71Var16);
        x71 x71Var17 = new x71(14);
        Function2<Scope, ParametersHolder, LiveTrackingNavigationContractImpl> function71 = new Function2<Scope, ParametersHolder, LiveTrackingNavigationContractImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new LiveTrackingNavigationContractImpl((ChaloNavigationManager) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LiveTrackingNavigationContractImpl.class), null, function71, kind2, CollectionsKt.C()), module)), x71Var17);
        x71 x71Var18 = new x71(15);
        Function2<Scope, ParametersHolder, ProductPurchaseRemoteDataSourceImpl> function72 = new Function2<Scope, ParametersHolder, ProductPurchaseRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProductPurchaseRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductPurchaseRemoteDataSourceImpl.class), null, function72, kind, CollectionsKt.C()), module)), x71Var18);
        w71 w71Var18 = new w71(23);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductPurchaseLocalDataSource.class), null, w71Var18, kind, CollectionsKt.C()), module));
        x71 x71Var19 = new x71(16);
        Function2<Scope, ParametersHolder, ProductPurchaseRepositoryImpl> function73 = new Function2<Scope, ParametersHolder, ProductPurchaseRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRemoteDataSource.class), null, null);
                Object objD2 = scope.d(Reflection.a(ProductPurchaseLocalDataSource.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new ProductPurchaseRepositoryImpl((ProductPurchaseRemoteDataSource) objD, (ProductPurchaseLocalDataSource) objD2, (BasicInfoContract) objD3, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductPurchaseRepositoryImpl.class), null, function73, kind, CollectionsKt.C()), module)), x71Var19);
        Function2<Scope, ParametersHolder, FetchProductConfigsUseCase> function74 = new Function2<Scope, ParametersHolder, FetchProductConfigsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$45
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new FetchProductConfigsUseCase((ProductPurchaseRepository) objD, (CityProvider) objD2, (BasicInfoContract) objD3, (GetPremiumBusCurrentCityConfigUseCase) scope.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchProductConfigsUseCase.class), null, function74, kind, CollectionsKt.C()), module)), null);
        x71 x71Var20 = new x71(17);
        Function2<Scope, ParametersHolder, ProductConfigFetchHelperImpl> function75 = new Function2<Scope, ParametersHolder, ProductConfigFetchHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductConfigFetchHelperImpl((FetchProductConfigsUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchProductConfigsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductConfigFetchHelperImpl.class), null, function75, kind, CollectionsKt.C()), module)), x71Var20);
        x71 x71Var21 = new x71(18);
        Function2<Scope, ParametersHolder, GroupTicketConfigEligibilityHelperImpl> function76 = new Function2<Scope, ParametersHolder, GroupTicketConfigEligibilityHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null);
                return new GroupTicketConfigEligibilityHelperImpl((ProductPurchaseRepository) objD, (FetchProductConfigsUseCase) scope.d(Reflection.a(FetchProductConfigsUseCase.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GroupTicketConfigEligibilityHelperImpl.class), null, function76, kind, CollectionsKt.C()), module)), x71Var21);
        Function2<Scope, ParametersHolder, RenewSuperPassHelper> function77 = new Function2<Scope, ParametersHolder, RenewSuperPassHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$46
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new RenewSuperPassHelper((BasicInfoContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RenewSuperPassHelper.class), null, function77, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BookingHelper> function78 = new Function2<Scope, ParametersHolder, BookingHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$47
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new BookingHelper((ProductPurchaseRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null), (ProductPurchaseLocalDataSource) scope.d(Reflection.a(ProductPurchaseLocalDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelper.class), null, function78, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProductSelectionComponent> function79 = new Function2<Scope, ParametersHolder, ProductSelectionComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$48
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(ProductSelectionArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchProductConfigsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(SuperPassRepository.class), null, null);
                Object objD6 = scope.d(Reflection.a(TicketRepository.class), null, null);
                Object objD7 = scope.d(Reflection.a(GetOneTimeOfferConfigUseCase.class), null, null);
                Object objD8 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(GetInstantTicketFeatureConfigUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD11 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD12 = scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null);
                Object objD13 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD14 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
                Object objD15 = scope.d(Reflection.a(RenewSuperPassHelper.class), null, null);
                Object objD16 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD17 = scope.d(Reflection.a(PassPurchaseSceneResolverUseCase.class), null, null);
                Object objD18 = scope.d(Reflection.a(MTicketUtilsHelper.class), null, null);
                Object objD19 = scope.d(Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, null);
                return new ProductSelectionComponent((ComponentContext) objD, (ProductSelectionArgs) objD2, (FetchProductConfigsUseCase) objD3, (AnalyticsContract) objD4, (SuperPassRepository) objD5, (TicketRepository) objD6, (GetOneTimeOfferConfigUseCase) objD7, (UserProfileDetailsProvider) objD8, (GetInstantTicketFeatureConfigUseCase) objD9, (BasicInfoContract) objD10, (ChaloNavigationManager) objD11, (IUserPreferencesDataStore) objD12, (StringProvider) objD13, (CurrencyFeature) objD14, (RenewSuperPassHelper) objD15, (CityProvider) objD16, (PassPurchaseSceneResolverUseCase) objD17, (MTicketUtilsHelper) objD18, (FetchRouteDataFromRemoteUseCase) objD19, (ProductPurchaseRepository) scope.d(Reflection.a(ProductPurchaseRepository.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductSelectionComponent.class), null, function79, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PassSelectionComponent> function80 = new Function2<Scope, ParametersHolder, PassSelectionComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$49
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(PassSelectionArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD4 = scope.d(Reflection.a(ProductPurchaseRepository.class), null, null);
                Object objD5 = scope.d(Reflection.a(BookingHelper.class), null, null);
                Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD7 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
                Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD9 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new PassSelectionComponent((ComponentContext) objD, (PassSelectionArgs) objD2, (ChaloNavigationManager) objD3, (ProductPurchaseRepository) objD4, (BookingHelper) objD5, (StringProvider) objD6, (CurrencyFeature) objD7, (AnalyticsContract) objD8, (TimeUtilsContract) objD9, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (PassPurchaseSceneResolverUseCase) scope.d(Reflection.a(PassPurchaseSceneResolverUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PassSelectionComponent.class), null, function80, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetSuperPassDetailsUseCase> function81 = new Function2<Scope, ParametersHolder, GetSuperPassDetailsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetSuperPassDetailsUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetSuperPassDetailsUseCase.class), null, function81, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InsertOrUpdatePassInPassTableUseCase> function82 = new Function2<Scope, ParametersHolder, InsertOrUpdatePassInPassTableUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$51
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InsertOrUpdatePassInPassTableUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InsertOrUpdatePassInPassTableUseCase.class), null, function82, kind, CollectionsKt.C()), module)), null);
        x71 x71Var22 = new x71(19);
        Function2<Scope, ParametersHolder, CheckoutPostPaymentSuperPassDetailsHelperImpl> function83 = new Function2<Scope, ParametersHolder, CheckoutPostPaymentSuperPassDetailsHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckoutPostPaymentSuperPassDetailsHelperImpl((GetSuperPassDetailsUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetSuperPassDetailsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckoutPostPaymentSuperPassDetailsHelperImpl.class), null, function83, kind, CollectionsKt.C()), module)), x71Var22);
        Function2<Scope, ParametersHolder, PassPurchaseSceneResolverUseCase> function84 = new Function2<Scope, ParametersHolder, PassPurchaseSceneResolverUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PassPurchaseSceneResolverUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PassPurchaseSceneResolverUseCase.class), null, function84, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SuperPassPurchaseSharedViewModel> function85 = new Function2<Scope, ParametersHolder, SuperPassPurchaseSharedViewModel>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$53
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassPurchaseArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(SuperPassPurchaseInitialStateFactory.class), null, null);
                Object objD4 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD5 = scope.d(Reflection.a(SuperPassRepository.class), null, null);
                Object objD6 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD7 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD8 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(ProductPurchaseRepository.class), null, null);
                Object objD10 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD11 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
                Object objD12 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD13 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD14 = scope.d(Reflection.a(UploadFileToServerUseCase.class), null, null);
                Object objD15 = scope.d(Reflection.a(SystemHelper.class), null, null);
                Object objD16 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD17 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                return new SuperPassPurchaseSharedViewModel((SuperPassPurchaseArgs) objD, (ComponentContext) objD2, (SuperPassPurchaseInitialStateFactory) objD3, (ChaloNavigationManager) objD4, (SuperPassRepository) objD5, (TimeUtilsContract) objD6, (BasicInfoContract) objD7, (CityProvider) objD8, (ProductPurchaseRepository) objD9, (UserProfileDetailsProvider) objD10, (IReportProblemFeature) objD11, (AnalyticsContract) objD12, (CrashlyticsLogger) objD13, (UploadFileToServerUseCase) objD14, (SystemHelper) objD15, (CoroutineContextProvider) objD16, (KotlinToastManager) objD17, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (GetPremiumPassExpiryEligibilityForPurchaseUseCase) scope.d(Reflection.a(GetPremiumPassExpiryEligibilityForPurchaseUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassPurchaseSharedViewModel.class), null, function85, kind, CollectionsKt.C()), module)), null);
        x71 x71Var23 = new x71(20);
        Function2<Scope, ParametersHolder, SuperPassPurchaseInitialStateFactoryImpl> function86 = new Function2<Scope, ParametersHolder, SuperPassPurchaseInitialStateFactoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new SuperPassPurchaseInitialStateFactoryImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassPurchaseInitialStateFactoryImpl.class), null, function86, kind, CollectionsKt.C()), module)), x71Var23);
        Function2<Scope, ParametersHolder, SmartSuperPassPassengerSelectionHelper> function87 = new Function2<Scope, ParametersHolder, SmartSuperPassPassengerSelectionHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$54
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new SmartSuperPassPassengerSelectionHelper((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SmartSuperPassPassengerSelectionHelper.class), null, function87, kind, CollectionsKt.C()), module)), null);
        w71 w71Var19 = new w71(26);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassEnterUserDetailsViewModel.class), null, w71Var19, kind, CollectionsKt.C()), module));
        x71 x71Var24 = new x71(21);
        Function2<Scope, ParametersHolder, InstantTicketConfigHelperImpl> function88 = new Function2<Scope, ParametersHolder, InstantTicketConfigHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ProductBookingDataStore.class), null, null);
                return new InstantTicketConfigHelperImpl((ProductBookingDataStore) objD, (FetchProductConfigsUseCase) scope.d(Reflection.a(FetchProductConfigsUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketConfigHelperImpl.class), null, function88, kind2, CollectionsKt.C()), module)), x71Var24);
        x71 x71Var25 = new x71(22);
        Function2<Scope, ParametersHolder, HomeScreenConfigDataHelperImpl> function89 = new Function2<Scope, ParametersHolder, HomeScreenConfigDataHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new HomeScreenConfigDataHelperImpl((HomeScreenConfigManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", HomeScreenConfigManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HomeScreenConfigDataHelperImpl.class), null, function89, kind, CollectionsKt.C()), module)), x71Var25);
        w71 w71Var20 = new w71(27);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassProofOverviewViewModel.class), null, w71Var20, kind, CollectionsKt.C()), module));
        w71 w71Var21 = new w71(28);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassUserProofUploadViewModel.class), null, w71Var21, kind, CollectionsKt.C()), module));
        w71 w71Var22 = new w71(29);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassPassengerSelectionViewModel.class), null, w71Var22, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, CheckIfContinueWithBulkBookingFlowUseCase> function90 = new Function2<Scope, ParametersHolder, CheckIfContinueWithBulkBookingFlowUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$55
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckIfContinueWithBulkBookingFlowUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, function90, kind, CollectionsKt.C()), module)), null);
        y71 y71Var3 = new y71(0);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ConfirmSuperPassPurchaseViewModel.class), null, y71Var3, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, SuperPassBookingSuccessComponent> function91 = new Function2<Scope, ParametersHolder, SuperPassBookingSuccessComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$56
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassBookingSuccessArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                return new SuperPassBookingSuccessComponent((SuperPassBookingSuccessArgs) objD, (ComponentContext) objD2, (AnalyticsContract) objD3, (BasicInfoContract) objD4, (ChaloNavigationManager) objD5, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassBookingSuccessComponent.class), null, function91, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateSuperPassOrderUseCase> function92 = new Function2<Scope, ParametersHolder, CreateSuperPassOrderUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$57
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new CreateSuperPassOrderUseCase((ProductPurchaseRepository) objD, (CityProvider) objD2, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateSuperPassOrderUseCase.class), null, function92, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchSuperPassCashPaymentInfoUseCase> function93 = new Function2<Scope, ParametersHolder, FetchSuperPassCashPaymentInfoUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$58
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchSuperPassCashPaymentInfoUseCase((ProductPurchaseRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchSuperPassCashPaymentInfoUseCase.class), null, function93, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, RefreshSelectedBookableSuperPassConfigurationUseCase> function94 = new Function2<Scope, ParametersHolder, RefreshSelectedBookableSuperPassConfigurationUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$59
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchCompleteProductConfigByIdUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
                return new RefreshSelectedBookableSuperPassConfigurationUseCase((FetchCompleteProductConfigByIdUseCase) objD, (StoreCompleteProductConfigLocallyUseCase) objD2, (ProductPurchaseLocalDataSource) scope.d(Reflection.a(ProductPurchaseLocalDataSource.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RefreshSelectedBookableSuperPassConfigurationUseCase.class), null, function94, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SubmitSuperPassApplicationUseCase> function95 = new Function2<Scope, ParametersHolder, SubmitSuperPassApplicationUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$60
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new SubmitSuperPassApplicationUseCase((ProductPurchaseRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductPurchaseRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SubmitSuperPassApplicationUseCase.class), null, function95, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPassVerificationTimingDetailsUseCase> function96 = new Function2<Scope, ParametersHolder, GetPassVerificationTimingDetailsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$61
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetPassVerificationTimingDetailsUseCase((ChaloConfigFeature) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPassVerificationTimingDetailsUseCase.class), null, function96, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SuperPassVerificationStatusComponent> function97 = new Function2<Scope, ParametersHolder, SuperPassVerificationStatusComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$62
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassVerificationStatusArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetPassVerificationTimingDetailsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD6 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD7 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD8 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new SuperPassVerificationStatusComponent((SuperPassVerificationStatusArgs) objD, (ComponentContext) objD2, (GetPassVerificationTimingDetailsUseCase) objD3, (TimeUtilsContract) objD4, (AnalyticsContract) objD5, (ChaloNavigationManager) objD6, (StringProvider) objD7, (CityProvider) objD8, (UserProfileDetailsProvider) objD9, (IReportProblemFeature) scope.d(Reflection.a(IReportProblemFeature.class), null, null), (DoesUserHaveProductsOnMultipleDeviceUseCase) scope.d(Reflection.a(DoesUserHaveProductsOnMultipleDeviceUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SuperPassVerificationStatusComponent.class), null, function97, kind, CollectionsKt.C()), module)), null);
        h(module);
        e(module);
        y71 y71Var4 = new y71(1);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductValidationCommonUIManager.class), null, y71Var4, kind, CollectionsKt.C()), module));
        y71 y71Var5 = new y71(2);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductValidationConfigFactory.class), null, y71Var5, kind, CollectionsKt.C()), module));
        x71 x71Var26 = new x71(25);
        Function2<Scope, ParametersHolder, ProductValidationConfigProviderImpl> function98 = new Function2<Scope, ParametersHolder, ProductValidationConfigProviderImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", QuickPayTicketProductValidationConfig.class), null, null);
                Object objD2 = scope.d(Reflection.a(SuperPassProductValidationConfig.class), null, null);
                Object objD3 = scope.d(Reflection.a(InstantTicketProductValidationConfig.class), null, null);
                Object objD4 = scope.d(Reflection.a(MTicketProductValidationConfig.class), null, null);
                Object objD5 = scope.d(Reflection.a(PremiumReserveTicketValidationConfig.class), null, null);
                Object objD6 = scope.d(Reflection.a(OndcTicketProductValidationConfig.class), null, null);
                Object objD7 = scope.d(Reflection.a(OndcMetroTicketProductValidationConfig.class), null, null);
                return new ProductValidationConfigProviderImpl((QuickPayTicketProductValidationConfig) objD, (SuperPassProductValidationConfig) objD2, (InstantTicketProductValidationConfig) objD3, (MTicketProductValidationConfig) objD4, (PremiumReserveTicketValidationConfig) objD5, (OndcTicketProductValidationConfig) objD6, (OndcMetroTicketProductValidationConfig) objD7, (MetroTicketProductValidationConfig) scope.d(Reflection.a(MetroTicketProductValidationConfig.class), null, null), (MultiModalGroupTicketValidationConfig) scope.d(Reflection.a(MultiModalGroupTicketValidationConfig.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductValidationConfigProviderImpl.class), null, function98, kind, CollectionsKt.C()), module)), x71Var26);
        Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationData> function99 = new Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationData>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$63
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new MultiModalGroupTicketValidationData((BasicInfoContract) objD, (TimeUtilsContract) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalGroupTicketValidationData.class), null, function99, kind, CollectionsKt.C()), module)), null);
        x71 x71Var27 = new x71(26);
        Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl> function100 = new Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl.class), null, function100, kind, CollectionsKt.C()), module)), x71Var27);
        Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationConfig> function101 = new Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationConfig>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$64
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MultiModalGroupTicketRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(MultiModalGroupTicketValidationData.class), null, null);
                Object objD3 = scope.d(Reflection.a(MultiModalGroupTicketValidationReportProblemManager.class), null, null);
                Object objD4 = scope.d(Reflection.a(MultiModalValidationUIManager.class), null, null);
                Object objD5 = scope.d(Reflection.a(ProductValidationConfigFactory.class), null, null);
                Object objD6 = scope.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null);
                return new MultiModalGroupTicketValidationConfig((MultiModalGroupTicketRepository) objD, (MultiModalGroupTicketValidationData) objD2, (MultiModalGroupTicketValidationReportProblemManager) objD3, (MultiModalValidationUIManager) objD4, (ProductValidationConfigFactory) objD5, (GenerateHashCodeForEasyVerificationUseCase) objD6, (GetNumDigitsOfHashValueForEasyVerificationUseCase) objD7, (MultiModalValidationNavigationManager) scope.d(Reflection.a(MultiModalValidationNavigationManager.class), null, null), (MultiModalGroupTicketValidationAnalyticsManagerFactory) scope.d(Reflection.a(MultiModalGroupTicketValidationAnalyticsManagerFactory.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalGroupTicketValidationConfig.class), null, function101, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationReportProblemManager> function102 = new Function2<Scope, ParametersHolder, MultiModalGroupTicketValidationReportProblemManager>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$65
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new MultiModalGroupTicketValidationReportProblemManager();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalGroupTicketValidationReportProblemManager.class), null, function102, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MultiModalValidationUIManager> function103 = new Function2<Scope, ParametersHolder, MultiModalValidationUIManager>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$66
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MultiModalValidationUIManager((ProductValidationCommonUIManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductValidationCommonUIManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalValidationUIManager.class), null, function103, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MultiModalValidationNavigationManager> function104 = new Function2<Scope, ParametersHolder, MultiModalValidationNavigationManager>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$67
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new MultiModalValidationNavigationManager((NavigationContract) scope.d(Reflection.a(NavigationContract.class), null, null), (ChaloNavigationManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MultiModalValidationNavigationManager.class), null, function104, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InstantTicketProductValidationConfig> function105 = new Function2<Scope, ParametersHolder, InstantTicketProductValidationConfig>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$68
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InstantTicketRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(InstantTicketValidationData.class), null, null);
                Object objD3 = scope.d(Reflection.a(InstantTicketProductValidationUIManager.class), null, null);
                Object objD4 = scope.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(InstantTicketValidationAnalyticManager.class), null, null);
                Object objD7 = scope.d(Reflection.a(InstantTicketValidationNavigationManager.class), null, null);
                return new InstantTicketProductValidationConfig((InstantTicketRepository) objD, (InstantTicketValidationData) objD2, (InstantTicketProductValidationUIManager) objD3, (GetNumDigitsOfHashValueForEasyVerificationUseCase) objD4, (GenerateHashCodeForEasyVerificationUseCase) objD5, (InstantTicketValidationAnalyticManager) objD6, (InstantTicketValidationNavigationManager) objD7, (InstantTicketValidationReportProblemManager) scope.d(Reflection.a(InstantTicketValidationReportProblemManager.class), null, null), (ProductsSyncContract) scope.d(Reflection.a(ProductsSyncContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InstantTicketProductValidationConfig.class), null, function105, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetActiveTitoEntryForProductUseCase> function106 = new Function2<Scope, ParametersHolder, GetActiveTitoEntryForProductUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$69
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetActiveTitoEntryForProductUseCase((TITOValidationDataRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TITOValidationDataRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetActiveTitoEntryForProductUseCase.class), null, function106, kind, CollectionsKt.C()), module)), null);
        x71 x71Var28 = new x71(27);
        Function2<Scope, ParametersHolder, GetValidationProcessFlowDetailsForValidationProductUseCase> function107 = new Function2<Scope, ParametersHolder, GetValidationProcessFlowDetailsForValidationProductUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckIsUnifiedTitoFlowEnabledUseCase.class), null, null);
                return new GetValidationProcessFlowDetailsForValidationProductUseCase((CheckIsUnifiedTitoFlowEnabledUseCase) objD, (GetActiveTitoEntryForProductUseCase) scope.d(Reflection.a(GetActiveTitoEntryForProductUseCase.class), null, null), (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, function107, kind, CollectionsKt.C()), module)), x71Var28);
        x71 x71Var29 = new x71(28);
        Function2<Scope, ParametersHolder, NavigationContractImpl> function108 = new Function2<Scope, ParametersHolder, NavigationContractImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new NavigationContractImpl((ChaloNavigationManager) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NavigationContractImpl.class), null, function108, kind2, CollectionsKt.C()), module)), x71Var29);
        Function2<Scope, ParametersHolder, ForceAppUpdateComponent> function109 = new Function2<Scope, ParametersHolder, ForceAppUpdateComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$70
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(ForceAppUpdateArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(SystemHelper.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD6 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                return new ForceAppUpdateComponent((ComponentContext) objD, (ForceAppUpdateArgs) objD2, (SystemHelper) objD3, (StringProvider) objD4, (KotlinToastManager) objD5, (AnalyticsContract) objD6, (ChaloConfigFeature) scope.d(Reflection.a(ChaloConfigFeature.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ForceAppUpdateComponent.class), null, function109, kind, CollectionsKt.C()), module)), null);
        z71 z71Var7 = new z71(0);
        Function2<Scope, ParametersHolder, PremiumBusBulkBookingHelperImpl> function110 = new Function2<Scope, ParametersHolder, PremiumBusBulkBookingHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$24
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckIfContinueWithBulkBookingFlowUseCase.class), null, null);
                return new PremiumBusBulkBookingHelperImpl((CheckIfContinueWithBulkBookingFlowUseCase) objD, (SuperPassRepository) scope.d(Reflection.a(SuperPassRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusBulkBookingHelperImpl.class), null, function110, kind, CollectionsKt.C()), module)), z71Var7);
        z71 z71Var8 = new z71(1);
        Function2<Scope, ParametersHolder, ProductBookingNavigationManagerImpl> function111 = new Function2<Scope, ParametersHolder, ProductBookingNavigationManagerImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductBookingNavigationManagerImpl((ChaloNavigationManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductBookingNavigationManagerImpl.class), null, function111, kind, CollectionsKt.C()), module)), z71Var8);
        ElectricityBillModuleKt.a(module);
        i(module);
        f(module);
        d(module);
        OndcValidationModuleKt.a(module);
        OndcMetroValidationModuleKt.a(module);
        MetroValidationModuleKt.a(module);
        MTicketingValidationModuleKt.a(module);
        y71 y71Var6 = new y71(3);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BusesAroundYouComponent.class), null, y71Var6, kind, CollectionsKt.C()), module));
        y71 y71Var7 = new y71(4);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NearbyStopsMapComponent.class), null, y71Var7, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, NearbyStopsMarkerHelper> function112 = new Function2<Scope, ParametersHolder, NearbyStopsMarkerHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$71
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new NearbyStopsMarkerHelper((NearbyStopsMapMarkerIconHelper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NearbyStopsMapMarkerIconHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NearbyStopsMarkerHelper.class), null, function112, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, StopTripDetailsComponent> function113 = new Function2<Scope, ParametersHolder, StopTripDetailsComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$72
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(StopTripDetailsArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchStopTripDetailsUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetEstimatedTimeUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(FetchCurrentLocationUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(StopTripDetailsAnalyticsEventHelper.class), null, null);
                Object objD8 = scope.d(Reflection.a(GetRelevantScheduledTripFromStopTripsList.class), null, null);
                Object objD9 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD10 = scope.d(Reflection.a(NearbyTripsDataOrderManagerNew.class), null, null);
                Object objD11 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD12 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new StopTripDetailsComponent((ComponentContext) objD, (StopTripDetailsArgs) objD2, (FetchStopTripDetailsUseCase) objD3, (StringProvider) objD4, (GetEstimatedTimeUseCase) objD5, (FetchCurrentLocationUseCase) objD6, (StopTripDetailsAnalyticsEventHelper) objD7, (GetRelevantScheduledTripFromStopTripsList) objD8, (CoroutineContextProvider) objD9, (NearbyTripsDataOrderManagerNew) objD10, (BasicInfoContract) objD11, (TimeUtilsContract) objD12, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StopTripDetailsComponent.class), null, function113, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchStopTripDetailsUseCase> function114 = new Function2<Scope, ParametersHolder, FetchStopTripDetailsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$73
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StopTripDetailsRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                return new FetchStopTripDetailsUseCase((StopTripDetailsRepository) objD, (CityProvider) objD2, (GetDistinctIdUseCase) objD3, (LanguageFeature) objD4, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchStopTripDetailsUseCase.class), null, function114, kind, CollectionsKt.C()), module)), null);
        y71 y71Var8 = new y71(5);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MyTicketsComponent.class), null, y71Var8, kind, CollectionsKt.C()), module));
        y71 y71Var9 = new y71(6);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IWorkerDataStore.class), null, y71Var9, kind2, CollectionsKt.C()), module));
        z71 z71Var9 = new z71(3);
        Function2<Scope, ParametersHolder, ChaloTimeBackgroundWorkerTask> function115 = new Function2<Scope, ParametersHolder, ChaloTimeBackgroundWorkerTask>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ChaloTimeBackgroundWorkerTask((ChaloTimeRefreshManagerUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloTimeRefreshManagerUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeBackgroundWorkerTask.class), null, function115, kind, CollectionsKt.C()), module)), z71Var9);
        StringQualifier stringQualifierA3 = QualifierKt.a("config.preferences_pb");
        y71 y71Var10 = new y71(7);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocalDataStore.class), stringQualifierA3, y71Var10, kind2, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetAllRequestedBookedProductsUseCase> function116 = new Function2<Scope, ParametersHolder, GetAllRequestedBookedProductsUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$74
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetAllQuickPaysUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(InstantTicketRepository.class), null, null);
                Object objD4 = scope.d(Reflection.a(PremiumBusRepository.class), null, null);
                Object objD5 = scope.d(Reflection.a(OndcRepository.class), null, null);
                Object objD6 = scope.d(Reflection.a(MetroRepository.class), null, null);
                Object objD7 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD8 = scope.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null);
                Object objD9 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD10 = scope.d(Reflection.a(TicketRepository.class), null, null);
                Object objD11 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD12 = scope.d(Reflection.a(MTicketUtilsHelper.class), null, null);
                Object objD13 = scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null);
                return new GetAllRequestedBookedProductsUseCase((SuperPassRepository) objD, (GetAllQuickPaysUseCase) objD2, (InstantTicketRepository) objD3, (PremiumBusRepository) objD4, (OndcRepository) objD5, (MetroRepository) objD6, (CityProvider) objD7, (CheckIsUserLoggedInUseCase) objD8, (CoroutineContextProvider) objD9, (TicketRepository) objD10, (BasicInfoContract) objD11, (MTicketUtilsHelper) objD12, (GetWalletSetupConfigurationUseCase) objD13, (MultiModalGroupTicketRepository) scope.d(Reflection.a(MultiModalGroupTicketRepository.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetAllRequestedBookedProductsUseCase.class), null, function116, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetProductStatusUIUseCase> function117 = new Function2<Scope, ParametersHolder, GetProductStatusUIUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$75
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                return new GetProductStatusUIUseCase((StringProvider) objD, (FetchHistoryScreenConfigDataUseCase) scope.d(Reflection.a(FetchHistoryScreenConfigDataUseCase.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProductStatusUIUseCase.class), null, function117, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchHistoryScreenConfigDataUseCase> function118 = new Function2<Scope, ParametersHolder, FetchHistoryScreenConfigDataUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$76
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD4 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new FetchHistoryScreenConfigDataUseCase((ChaloBuildConfig) objD4, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD3, (ChaloConfigFeature) objD, (CoroutineContextProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchHistoryScreenConfigDataUseCase.class), null, function118, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, RunPreActivationChecksUseCase> function119 = new Function2<Scope, ParametersHolder, RunPreActivationChecksUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$77
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(MTicketUtilsHelper.class), null, null);
                Object objD4 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                return new RunPreActivationChecksUseCase((GetValidationProcessFlowDetailsForValidationProductUseCase) objD, (BasicInfoContract) objD2, (MTicketUtilsHelper) objD3, (CoroutineContextProvider) objD4, (TicketRepository) scope.d(Reflection.a(TicketRepository.class), null, null), (GetProductConfigFromProductIdUseCase) scope.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RunPreActivationChecksUseCase.class), null, function119, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetValidationProcessFlowDetailsForValidationProductUseCase> function120 = new Function2<Scope, ParametersHolder, GetValidationProcessFlowDetailsForValidationProductUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$78
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckIsUnifiedTitoFlowEnabledUseCase.class), null, null);
                return new GetValidationProcessFlowDetailsForValidationProductUseCase((CheckIsUnifiedTitoFlowEnabledUseCase) objD, (GetActiveTitoEntryForProductUseCase) scope.d(Reflection.a(GetActiveTitoEntryForProductUseCase.class), null, null), (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, function120, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ActivateProductIfRequiredUseCase> function121 = new Function2<Scope, ParametersHolder, ActivateProductIfRequiredUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$79
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(SuperPassRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(IDigitalTripReceiptFeature.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(TicketRepository.class), null, null);
                Object objD7 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD8 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD9 = scope.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(FeedbackFeature.class), null, null);
                return new ActivateProductIfRequiredUseCase((AnalyticsContract) objD, (SuperPassRepository) objD2, (IDigitalTripReceiptFeature) objD3, (BasicInfoContract) objD4, (GetValidationProcessFlowDetailsForValidationProductUseCase) objD5, (TicketRepository) objD6, (CoroutineContextProvider) objD7, (TimeUtilsContract) objD8, (GetProductConfigFromProductIdUseCase) objD9, (FeedbackFeature) objD10, (MTicketUtilsHelper) scope.d(Reflection.a(MTicketUtilsHelper.class), null, null), (MobileTicketingConverters) scope.d(Reflection.a(MobileTicketingConverters.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ActivateProductIfRequiredUseCase.class), null, function121, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetBookableProductConfigForRenewUseCase> function122 = new Function2<Scope, ParametersHolder, GetBookableProductConfigForRenewUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$80
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchCompleteProductConfigByIdUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                return new GetBookableProductConfigForRenewUseCase((FetchCompleteProductConfigByIdUseCase) objD, (StoreCompleteProductConfigLocallyUseCase) objD2, (CoroutineContextProvider) objD3, (ProductPurchaseLocalDataSource) scope.d(Reflection.a(ProductPurchaseLocalDataSource.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetBookableProductConfigForRenewUseCase.class), null, function122, kind, CollectionsKt.C()), module)), null);
        y71 y71Var11 = new y71(8);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HandlePremiumPassRenewFlowUseCase.class), null, y71Var11, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, StoreCompleteProductConfigLocallyUseCase> function123 = new Function2<Scope, ParametersHolder, StoreCompleteProductConfigLocallyUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$81
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", LocalDataStore.class), null, null);
                Object objD2 = scope.d(Reflection.a(LocalDataStore.class), null, null);
                return new StoreCompleteProductConfigLocallyUseCase((LocalDataStore) objD, (LocalDataStore) objD2, (LocalDataStore) scope.d(Reflection.a(LocalDataStore.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, function123, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetProductConfigInfoForPremiumBusProductIfActiveUseCase> function124 = new Function2<Scope, ParametersHolder, GetProductConfigInfoForPremiumBusProductIfActiveUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$82
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetProductConfigInfoForPremiumBusProductIfActiveUseCase((FetchProductConfigsForUiUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchProductConfigsForUiUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProductConfigInfoForPremiumBusProductIfActiveUseCase.class), null, function124, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIfContinueWithBulkBookingFlowUseCase> function125 = new Function2<Scope, ParametersHolder, CheckIfContinueWithBulkBookingFlowUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$83
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckIfContinueWithBulkBookingFlowUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, function125, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MyTicketsUiStateFactory> function126 = new Function2<Scope, ParametersHolder, MyTicketsUiStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$84
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(HistoryPassUiStateMapperHelper.class), null, null);
                Object objD3 = scope.d(Reflection.a(HistoryActiveTicketsUiStateMapperHelper.class), null, null);
                Object objD4 = scope.d(Reflection.a(HistoryExpiredTicketsUiStateMapperHelper.class), null, null);
                return new MyTicketsUiStateFactory((StringProvider) objD, (HistoryPassUiStateMapperHelper) objD2, (HistoryActiveTicketsUiStateMapperHelper) objD3, (HistoryExpiredTicketsUiStateMapperHelper) objD4, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (StepTicketModeBasedInfoUIStateFactory) scope.d(Reflection.a(StepTicketModeBasedInfoUIStateFactory.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MyTicketsUiStateFactory.class), null, function126, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, HistoryPassUiStateMapperHelper> function127 = new Function2<Scope, ParametersHolder, HistoryPassUiStateMapperHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$85
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(GetProductStatusUIUseCase.class), null, null);
                return new HistoryPassUiStateMapperHelper((StringProvider) objD, (BasicInfoContract) objD2, (TimeUtilsContract) objD3, (GetProductStatusUIUseCase) objD4, (CheckIfContinueWithBulkBookingFlowUseCase) scope.d(Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HistoryPassUiStateMapperHelper.class), null, function127, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, HistoryActiveTicketsUiStateMapperHelper> function128 = new Function2<Scope, ParametersHolder, HistoryActiveTicketsUiStateMapperHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$86
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new HistoryActiveTicketsUiStateMapperHelper((StringProvider) objD, (TimeUtilsContract) objD2, (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (MTicketUtilsHelper) scope.d(Reflection.a(MTicketUtilsHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HistoryActiveTicketsUiStateMapperHelper.class), null, function128, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, HistoryExpiredTicketsUiStateMapperHelper> function129 = new Function2<Scope, ParametersHolder, HistoryExpiredTicketsUiStateMapperHelper>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$87
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                return new HistoryExpiredTicketsUiStateMapperHelper((StringProvider) objD, (BasicInfoContract) objD2, (TimeUtilsContract) objD3, (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (GetProductStatusUIUseCase) scope.d(Reflection.a(GetProductStatusUIUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(HistoryExpiredTicketsUiStateMapperHelper.class), null, function129, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAndStoreProductConfigByIdUseCase> function130 = new Function2<Scope, ParametersHolder, FetchAndStoreProductConfigByIdUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$88
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FetchAndStoreProductConfigByIdUseCase((FetchCompleteProductConfigByIdUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchCompleteProductConfigByIdUseCase.class), null, null), (StoreCompleteProductConfigLocallyUseCase) scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAndStoreProductConfigByIdUseCase.class), null, function130, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetNextStepOnPassApplicationVerifiedUseCase> function131 = new Function2<Scope, ParametersHolder, GetNextStepOnPassApplicationVerifiedUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$89
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetNextStepOnPassApplicationVerifiedUseCase((FetchAndStoreProductConfigByIdUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchAndStoreProductConfigByIdUseCase.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetNextStepOnPassApplicationVerifiedUseCase.class), null, function131, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetNextStepOnPassApplicationRejectedUseCase> function132 = new Function2<Scope, ParametersHolder, GetNextStepOnPassApplicationRejectedUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetNextStepOnPassApplicationRejectedUseCase((FetchAndStoreProductConfigByIdUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchAndStoreProductConfigByIdUseCase.class), null, null), (BookingHelper) scope.d(Reflection.a(BookingHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetNextStepOnPassApplicationRejectedUseCase.class), null, function132, kind, CollectionsKt.C()), module)), null);
        c(module);
        Function2<Scope, ParametersHolder, InitiateFreshChatCustomerSupportUseCase> function133 = new Function2<Scope, ParametersHolder, InitiateFreshChatCustomerSupportUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$91
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InitiateFreshChatCustomerSupportUseCase((FreshchatUserInteractionContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FreshchatUserInteractionContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, function133, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ReportProblemComponent> function134 = new Function2<Scope, ParametersHolder, ReportProblemComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$92
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(ReportProblemArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
                Object objD4 = scope.d(Reflection.a(AutoLinkDeviceIdUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD6 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD7 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD9 = scope.d(Reflection.a(InitiateProductHistorySyncCallUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(ChaloConfigFeature.class), null, null);
                Object objD11 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD12 = scope.d(Reflection.a(SystemHelper.class), null, null);
                return new ReportProblemComponent((ComponentContext) objD, (ReportProblemArgs) objD2, (IReportProblemFeature) objD3, (AutoLinkDeviceIdUseCase) objD4, (StringProvider) objD5, (ChaloNavigationManager) objD6, (KotlinToastManager) objD7, (AnalyticsContract) objD8, (InitiateProductHistorySyncCallUseCase) objD9, (ChaloConfigFeature) objD10, (UserProfileDetailsProvider) objD11, (SystemHelper) objD12, (NetworkStateManager) scope.d(Reflection.a(NetworkStateManager.class), null, null), (InitiateFreshChatCustomerSupportUseCase) scope.d(Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ReportProblemComponent.class), null, function134, kind, CollectionsKt.C()), module)), null);
        z71 z71Var10 = new z71(4);
        Function2<Scope, ParametersHolder, BookingHelpRemoteDataSourceImpl> function135 = new Function2<Scope, ParametersHolder, BookingHelpRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new BookingHelpRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpRemoteDataSourceImpl.class), null, function135, kind, CollectionsKt.C()), module)), z71Var10);
        z71 z71Var11 = new z71(5);
        Function2<Scope, ParametersHolder, BookingHelpRepositoryImpl> function136 = new Function2<Scope, ParametersHolder, BookingHelpRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$28
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new BookingHelpRepositoryImpl((BookingHelpRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BookingHelpRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpRepositoryImpl.class), null, function136, kind, CollectionsKt.C()), module)), z71Var11);
        Function2<Scope, ParametersHolder, CancelBookingUseCase> function137 = new Function2<Scope, ParametersHolder, CancelBookingUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$93
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CancelBookingUseCase((BookingHelpRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BookingHelpRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CancelBookingUseCase.class), null, function137, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BookingHelpUIStateFactory> function138 = new Function2<Scope, ParametersHolder, BookingHelpUIStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$94
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new BookingHelpUIStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpUIStateFactory.class), null, function138, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BookingHelpScreenComponent> function139 = new Function2<Scope, ParametersHolder, BookingHelpScreenComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$95
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(BookingHelpArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(BookingHelpUIStateFactory.class), null, null);
                Object objD4 = scope.d(Reflection.a(BookingHelpResultStateManager.class), null, null);
                Object objD5 = scope.d(Reflection.a(CancelBookingUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
                return new BookingHelpScreenComponent((ComponentContext) objD, (BookingHelpArgs) objD2, (BookingHelpUIStateFactory) objD3, (BookingHelpResultStateManager) objD4, (CancelBookingUseCase) objD5, (StringProvider) objD6, (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpScreenComponent.class), null, function139, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase> function140 = new Function2<Scope, ParametersHolder, FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$96
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase((PbBulkBookingRideDetailsRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PbBulkBookingRideDetailsRepository.class), null, null), (PremiumBusRepository) scope.d(Reflection.a(PremiumBusRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase.class), null, function140, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchAllPremiumReserveTicketsBookedThroughPassUseCase> function141 = new Function2<Scope, ParametersHolder, FetchAllPremiumReserveTicketsBookedThroughPassUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$97
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                return new FetchAllPremiumReserveTicketsBookedThroughPassUseCase((PremiumBusRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchAllPremiumReserveTicketsBookedThroughPassUseCase.class), null, function141, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UpdatePassStartDateChangesUseCase> function142 = new Function2<Scope, ParametersHolder, UpdatePassStartDateChangesUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$98
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", InsertOrUpdatePassInPassTableUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(PbBulkBookingRideDetailsRepository.class), null, null);
                return new UpdatePassStartDateChangesUseCase((InsertOrUpdatePassInPassTableUseCase) objD, (PbBulkBookingRideDetailsRepository) objD2, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdatePassStartDateChangesUseCase.class), null, function142, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PremiumBusProductModificationReasonsComponent> function143 = new Function2<Scope, ParametersHolder, PremiumBusProductModificationReasonsComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$99
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusProductModificationArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(CancelPremiumReserveTicketUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(FetchPremiumBusProductsModificationReasonsListUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD7 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD8 = scope.d(Reflection.a(FetchPBAvailableSlotsUseCase.class), null, null);
                Object objD9 = scope.d(Reflection.a(FetchPBODPairsForGivenLocationsUseCase.class), null, null);
                Object objD10 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD11 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD12 = scope.d(Reflection.a(ReschedulePremiumReserveTicketUseCase.class), null, null);
                Object objD13 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
                Object objD14 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD15 = scope.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null);
                Object objD16 = scope.d(Reflection.a(SeatSelectionResultStateManager.class), null, null);
                return new PremiumBusProductModificationReasonsComponent((PremiumBusProductModificationArgs) objD, (ComponentContext) objD2, (CancelPremiumReserveTicketUseCase) objD3, (FetchPremiumBusProductsModificationReasonsListUseCase) objD4, (GetPremiumReserveTicketByIdUseCase) objD5, (AnalyticsContract) objD6, (StringProvider) objD7, (FetchPBAvailableSlotsUseCase) objD8, (FetchPBODPairsForGivenLocationsUseCase) objD9, (TimeUtilsContract) objD10, (CityProvider) objD11, (ReschedulePremiumReserveTicketUseCase) objD12, (KotlinToastManager) objD13, (ChaloNavigationManager) objD14, (GetTimeInMillisAfterXTimeUseCase) objD15, (SeatSelectionResultStateManager) objD16, (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusProductModificationReasonsComponent.class), null, function143, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PremiumBusNotificationComponent> function144 = new Function2<Scope, ParametersHolder, PremiumBusNotificationComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$100
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PremiumBusNotificationComponent((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null), (ComponentContext) scope.d(Reflection.a(ComponentContext.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusNotificationComponent.class), null, function144, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchChaloBusPassEligibleForRideRollOverUseCase> function145 = new Function2<Scope, ParametersHolder, FetchChaloBusPassEligibleForRideRollOverUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$101
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null);
                return new FetchChaloBusPassEligibleForRideRollOverUseCase((GetMiscellaneousCityWiseFlagsConfigUseCase) objD, (SuperPassRepository) scope.d(Reflection.a(SuperPassRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchChaloBusPassEligibleForRideRollOverUseCase.class), null, function145, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumPassExpiryEligibilityForPurchaseUseCase> function146 = new Function2<Scope, ParametersHolder, GetPremiumPassExpiryEligibilityForPurchaseUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$102
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetPremiumPassExpiryEligibilityForPurchaseUseCase((SuperPassRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SuperPassRepository.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumPassExpiryEligibilityForPurchaseUseCase.class), null, function146, kind, CollectionsKt.C()), module)), null);
        j(module);
        z71 z71Var12 = new z71(6);
        Function2<Scope, ParametersHolder, ProductInvoiceGenerationRemoteDataSourceImpl> function147 = new Function2<Scope, ParametersHolder, ProductInvoiceGenerationRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$29
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ProductInvoiceGenerationRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductInvoiceGenerationRemoteDataSourceImpl.class), null, function147, kind, CollectionsKt.C()), module)), z71Var12);
        z71 z71Var13 = new z71(7);
        Function2<Scope, ParametersHolder, ProductInvoiceGenerationRepositoryImpl> function148 = new Function2<Scope, ParametersHolder, ProductInvoiceGenerationRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductInvoiceGenerationRepositoryImpl((ProductInvoiceGenerationRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductInvoiceGenerationRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductInvoiceGenerationRepositoryImpl.class), null, function148, kind, CollectionsKt.C()), module)), z71Var13);
        Function2<Scope, ParametersHolder, FetchProductInvoiceUseCase> function149 = new Function2<Scope, ParametersHolder, FetchProductInvoiceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$103
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FetchProductInvoiceUseCase((ProductInvoiceGenerationRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductInvoiceGenerationRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchProductInvoiceUseCase.class), null, function149, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase> function150 = new Function2<Scope, ParametersHolder, PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$104
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase((FetchAllPremiumReserveTicketsBookedThroughPassUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchAllPremiumReserveTicketsBookedThroughPassUseCase.class), null, null), (GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase) scope.d(Reflection.a(GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase.class), null, function150, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase> function151 = new Function2<Scope, ParametersHolder, GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$105
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase((BasicInfoContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase.class), null, function151, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetLocationDisclaimerStepsAndLottieTypeUseCase> function152 = new Function2<Scope, ParametersHolder, GetLocationDisclaimerStepsAndLottieTypeUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$106
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetLocationDisclaimerStepsAndLottieTypeUseCase((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetLocationDisclaimerStepsAndLottieTypeUseCase.class), null, function152, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, LocationDisclaimerComponent> function153 = new Function2<Scope, ParametersHolder, LocationDisclaimerComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$107
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", LocationDisclaimerArgs.class), null, null);
                Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
                Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(GetLocationDisclaimerStepsAndLottieTypeUseCase.class), null, null);
                Object objD5 = scope.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
                Object objD7 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD8 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
                Object objD9 = scope.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null);
                Object objD10 = scope.d(Reflection.a(GpsRequestHandlerProvider.class), null, null);
                return new LocationDisclaimerComponent((LocationDisclaimerArgs) objD, (ComponentContext) objD2, (AnalyticsContract) objD3, (GetLocationDisclaimerStepsAndLottieTypeUseCase) objD4, (ArePermissionsGrantedUseCase) objD5, (ChaloLocationManager) objD6, (ChaloNavigationManager) objD7, (PermissionHandlerProvider) objD8, (LocationPermissionCallbackHandler) objD9, (GpsRequestHandlerProvider) objD10, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocationDisclaimerComponent.class), null, function153, kind, CollectionsKt.C()), module)), null);
        g(module);
        z71 z71Var14 = new z71(8);
        Function2<Scope, ParametersHolder, ProductDataDeletionHelperImpl> function154 = new Function2<Scope, ParametersHolder, ProductDataDeletionHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$31
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(SuperPassRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(OndcRepository.class), null, null);
                Object objD4 = scope.d(Reflection.a(PremiumBusDataStoreWrapper.class), null, null);
                Object objD5 = scope.d(Reflection.a(ClearWalletAndQuickPayDuringLogoutUseCase.class), null, null);
                Object objD6 = scope.d(Reflection.a(ClearInstantTicketsDuringLogoutUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(DeletePremiumReserveTicketsUseCase.class), null, null);
                Object objD8 = scope.d(Reflection.a(TicketRepository.class), null, null);
                Object objD9 = scope.d(Reflection.a(MetroRepository.class), null, null);
                return new ProductDataDeletionHelperImpl((UserProfileDetailsProvider) objD, (SuperPassRepository) objD2, (OndcRepository) objD3, (PremiumBusDataStoreWrapper) objD4, (ClearWalletAndQuickPayDuringLogoutUseCase) objD5, (ClearInstantTicketsDuringLogoutUseCase) objD6, (DeletePremiumReserveTicketsUseCase) objD7, (TicketRepository) objD8, (MetroRepository) objD9, (ClearRideFeedbackDataDuringLogoutUseCase) scope.d(Reflection.a(ClearRideFeedbackDataDuringLogoutUseCase.class), null, null), (MultiModalGroupTicketRepository) scope.d(Reflection.a(MultiModalGroupTicketRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductDataDeletionHelperImpl.class), null, function154, kind, CollectionsKt.C()), module)), z71Var14);
        y71 y71Var12 = new y71(10);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProductConfigFromProductIdUseCase.class), null, y71Var12, kind, CollectionsKt.C()), module));
        z71 z71Var15 = new z71(9);
        Function2<Scope, ParametersHolder, PremiumPassSavingRemoteDataSourceImpl> function155 = new Function2<Scope, ParametersHolder, PremiumPassSavingRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$32
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new PremiumPassSavingRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumPassSavingRemoteDataSourceImpl.class), null, function155, kind, CollectionsKt.C()), module)), z71Var15);
        z71 z71Var16 = new z71(11);
        Function2<Scope, ParametersHolder, PremiumPassSavingRemoteRepositoryImpl> function156 = new Function2<Scope, ParametersHolder, PremiumPassSavingRemoteRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$33
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new PremiumPassSavingRemoteRepositoryImpl((PremiumPassSavingRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumPassSavingRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumPassSavingRemoteRepositoryImpl.class), null, function156, kind, CollectionsKt.C()), module)), z71Var16);
        z71 z71Var17 = new z71(12);
        Function2<Scope, ParametersHolder, FeedbackFeatureImpl> function157 = new Function2<Scope, ParametersHolder, FeedbackFeatureImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", TicketRepository.class), null, null);
                return new FeedbackFeatureImpl((TicketRepository) objD, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FeedbackFeatureImpl.class), null, function157, kind2, CollectionsKt.C()), module)), z71Var17);
        y71 y71Var13 = new y71(11);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MTicketUtilsHelper.class), null, y71Var13, kind, CollectionsKt.C()), module));
        z71 z71Var18 = new z71(14);
        Function2<Scope, ParametersHolder, TicketRepositoryImpl> function158 = new Function2<Scope, ParametersHolder, TicketRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$singleOf$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", TicketDao.class), null, null);
                Object objD2 = scope.d(Reflection.a(LastRideInfoDao.class), null, null);
                return new TicketRepositoryImpl((TicketDao) objD, (LastRideInfoDao) objD2, (MTicketActivationStoreDao) scope.d(Reflection.a(MTicketActivationStoreDao.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TicketRepositoryImpl.class), null, function158, kind2, CollectionsKt.C()), module)), z71Var18);
        Function2<Scope, ParametersHolder, GetMTicketForTicketIdUseCase> function159 = new Function2<Scope, ParametersHolder, GetMTicketForTicketIdUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$108
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetMTicketForTicketIdUseCase((TicketRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TicketRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetMTicketForTicketIdUseCase.class), null, function159, kind, CollectionsKt.C()), module)), null);
        b(module);
        z71 z71Var19 = new z71(15);
        Function2<Scope, ParametersHolder, CheckoutMTicketDetailsHelperImpl> function160 = new Function2<Scope, ParametersHolder, CheckoutMTicketDetailsHelperImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$34
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TicketRepository.class), null, null);
                return new CheckoutMTicketDetailsHelperImpl((TicketRepository) objD, (MTicketUtilsHelper) scope.d(Reflection.a(MTicketUtilsHelper.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckoutMTicketDetailsHelperImpl.class), null, function160, kind, CollectionsKt.C()), module)), z71Var19);
        y71 y71Var14 = new y71(12);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MandatoryFirstHistoryCallGuard.class), null, y71Var14, kind2, CollectionsKt.C()), module));
        y71 y71Var15 = new y71(13);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AppMigrationPreconditionsComponent.class), null, y71Var15, kind, CollectionsKt.C()), module));
        z71 z71Var20 = new z71(16);
        Function2<Scope, ParametersHolder, PremiumBusFeatureRemoteDataSourceImpl> function161 = new Function2<Scope, ParametersHolder, PremiumBusFeatureRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$35
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new PremiumBusFeatureRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusFeatureRemoteDataSourceImpl.class), null, function161, kind, CollectionsKt.C()), module)), z71Var20);
        z71 z71Var21 = new z71(17);
        Function2<Scope, ParametersHolder, PremiumBusRemoteRepositoryImpl> function162 = new Function2<Scope, ParametersHolder, PremiumBusRemoteRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$36
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new PremiumBusRemoteRepositoryImpl((PremiumBusFeatureRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusFeatureRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusRemoteRepositoryImpl.class), null, function162, kind, CollectionsKt.C()), module)), z71Var21);
        Function2<Scope, ParametersHolder, FetchBannerUseCase> function163 = new Function2<Scope, ParametersHolder, FetchBannerUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$109
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRemoteRepository.class), null, null);
                return new FetchBannerUseCase((PremiumBusRemoteRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchBannerUseCase.class), null, function163, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchRouteSchedulesUseCase> function164 = new Function2<Scope, ParametersHolder, FetchRouteSchedulesUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$110
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRemoteRepository.class), null, null);
                return new FetchRouteSchedulesUseCase((PremiumBusRemoteRepository) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchRouteSchedulesUseCase.class), null, function164, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, PremiumBusContentConfigUseCase> function165 = new Function2<Scope, ParametersHolder, PremiumBusContentConfigUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$111
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new PremiumBusContentConfigUseCase((PremiumBusRemoteRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRemoteRepository.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PremiumBusContentConfigUseCase.class), null, function165, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloBusRouteInfoUiStateFactory> function166 = new Function2<Scope, ParametersHolder, ChaloBusRouteInfoUiStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$112
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloBusRouteInfoUiStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloBusRouteInfoUiStateFactory.class), null, function166, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloBusRouteInfoComponent> function167 = new Function2<Scope, ParametersHolder, ChaloBusRouteInfoComponent>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$113
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloBusRouteInfoScreenArgs.class), null, null);
                Object objD3 = scope.d(Reflection.a(FetchRouteSchedulesUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
                Object objD6 = scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null);
                return new ChaloBusRouteInfoComponent((ComponentContext) objD, (ChaloBusRouteInfoScreenArgs) objD2, (FetchRouteSchedulesUseCase) objD3, (StringProvider) objD4, (ChaloNavigationManager) objD5, (UniversalSearchResultStateManager) objD6, (ChaloBusRouteInfoUiStateFactory) scope.d(Reflection.a(ChaloBusRouteInfoUiStateFactory.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloBusRouteInfoComponent.class), null, function167, kind, CollectionsKt.C()), module)), null);
        z71 z71Var22 = new z71(18);
        Function2<Scope, ParametersHolder, UserCommutePreferenceRemoteDataSourceImpl> function168 = new Function2<Scope, ParametersHolder, UserCommutePreferenceRemoteDataSourceImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$37
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UserCommutePreferenceRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UserCommutePreferenceRemoteDataSourceImpl.class), null, function168, kind, CollectionsKt.C()), module)), z71Var22);
        z71 z71Var23 = new z71(20);
        Function2<Scope, ParametersHolder, UserCommutePreferenceLocalStoreImpl> function169 = new Function2<Scope, ParametersHolder, UserCommutePreferenceLocalStoreImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$38
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UserCommutePreferenceLocalStoreImpl((UserCommutePreferenceSavedRideDao) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceSavedRideDao.class), null, null), (UserCommutePreferenceStopPlaceDao) scope.d(Reflection.a(UserCommutePreferenceStopPlaceDao.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UserCommutePreferenceLocalStoreImpl.class), null, function169, kind, CollectionsKt.C()), module)), z71Var23);
        z71 z71Var24 = new z71(22);
        Function2<Scope, ParametersHolder, UserCommutePreferenceRepositoryImpl> function170 = new Function2<Scope, ParametersHolder, UserCommutePreferenceRepositoryImpl>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$39
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UserCommutePreferenceRepositoryImpl((UserCommutePreferenceRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRemoteDataSource.class), null, null), (UserCommutePreferenceLocalStore) scope.d(Reflection.a(UserCommutePreferenceLocalStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UserCommutePreferenceRepositoryImpl.class), null, function170, kind, CollectionsKt.C()), module)), z71Var24);
        Function2<Scope, ParametersHolder, FetchCommutePreferenceSummaryUseCase> function171 = new Function2<Scope, ParametersHolder, FetchCommutePreferenceSummaryUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$114
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new FetchCommutePreferenceSummaryUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (PremiumBusUserSurveyPreferenceRepository) scope.d(Reflection.a(PremiumBusUserSurveyPreferenceRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, function171, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UpdateCommutePreferenceUseCase> function172 = new Function2<Scope, ParametersHolder, UpdateCommutePreferenceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$115
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                return new UpdateCommutePreferenceUseCase((UserCommutePreferenceRepository) objD, (FetchCommutePreferenceSummaryUseCase) scope.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateCommutePreferenceUseCase.class), null, function172, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetCommutePreferencePlacesUseCase> function173 = new Function2<Scope, ParametersHolder, GetCommutePreferencePlacesUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$116
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                return new GetCommutePreferencePlacesUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCommutePreferencePlacesUseCase.class), null, function173, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetCommutePreferenceSavedRidesUseCase> function174 = new Function2<Scope, ParametersHolder, GetCommutePreferenceSavedRidesUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$117
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                return new GetCommutePreferenceSavedRidesUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCommutePreferenceSavedRidesUseCase.class), null, function174, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, AddCommutePreferenceStopPlaceUseCase> function175 = new Function2<Scope, ParametersHolder, AddCommutePreferenceStopPlaceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$118
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new AddCommutePreferenceStopPlaceUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (FetchCommutePreferenceSummaryUseCase) scope.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AddCommutePreferenceStopPlaceUseCase.class), null, function175, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, DeleteCommutePreferenceStopPlaceUseCase> function176 = new Function2<Scope, ParametersHolder, DeleteCommutePreferenceStopPlaceUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$119
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new DeleteCommutePreferenceStopPlaceUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (FetchCommutePreferenceSummaryUseCase) scope.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeleteCommutePreferenceStopPlaceUseCase.class), null, function176, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, DeleteSavedRideUseCase> function177 = new Function2<Scope, ParametersHolder, DeleteSavedRideUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$120
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new DeleteSavedRideUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (FetchCommutePreferenceSummaryUseCase) scope.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeleteSavedRideUseCase.class), null, function177, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SaveOrEditRideUseCase> function178 = new Function2<Scope, ParametersHolder, SaveOrEditRideUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$121
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new SaveOrEditRideUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) objD2, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (FetchCommutePreferenceSummaryUseCase) scope.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SaveOrEditRideUseCase.class), null, function178, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckSaveRideEligibilityUseCase> function179 = new Function2<Scope, ParametersHolder, CheckSaveRideEligibilityUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$122
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(UserCommutePreferenceRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                return new CheckSaveRideEligibilityUseCase((PremiumBusRepository) objD, (UserCommutePreferenceRepository) objD2, (UserProfileDetailsProvider) objD3, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckSaveRideEligibilityUseCase.class), null, function179, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchSavedRideForODPairUseCase> function180 = new Function2<Scope, ParametersHolder, FetchSavedRideForODPairUseCase>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$123
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserCommutePreferenceRepository.class), null, null);
                return new FetchSavedRideForODPairUseCase((UserCommutePreferenceRepository) objD, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchSavedRideForODPairUseCase.class), null, function180, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, SelectRideUiStateFactory> function181 = new Function2<Scope, ParametersHolder, SelectRideUiStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$124
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
                return new SelectRideUiStateFactory((StringProvider) objD, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SelectRideUiStateFactory.class), null, function181, kind, CollectionsKt.C()), module)), null);
        y71 y71Var16 = new y71(14);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SelectRideComponent.class), null, y71Var16, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, SavedPlacesAndRidesUiStateFactory> function182 = new Function2<Scope, ParametersHolder, SavedPlacesAndRidesUiStateFactory>() { // from class: app.chalo.home.di.SharedHomeModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$125
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new SavedPlacesAndRidesUiStateFactory((StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SavedPlacesAndRidesUiStateFactory.class), null, function182, kind, CollectionsKt.C()), module)), null);
        y71 y71Var17 = new y71(15);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SavedPlacesAndRidesComponent.class), null, y71Var17, kind, CollectionsKt.C()), module));
    }

    public static final void b(Module module) {
        SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$1 sharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$1 = new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(CheckIfFreeRideAvailableUseCase.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchFreeRideCountForUserUseCase.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FreeRideHelpUrlUseCase.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MTicketTripInfoComponent.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MTicketTripInfoUIStateFactory.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchMTicketFareBetweenStopsUseCase.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CalculateMTicketFareUseCase.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreateMTicketOrderUseCase.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MTicketPassengerSelectionUIStateFactory.class), null, new SharedHomeModuleKt$mTicketFeature$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MTicketPassengerSelectionComponent.class), null, new t71(29), kind, emptyList), module));
    }

    public static final void c(Module module) {
        v71 v71Var = new v71(13);
        SharedHomeModuleKt$notification$$inlined$factoryOf$1 sharedHomeModuleKt$notification$$inlined$factoryOf$1 = new SharedHomeModuleKt$notification$$inlined$factoryOf$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(NotificationCentralProcessingManagerImpl.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$notification$$inlined$factoryOf$1, kind, emptyList), module)), v71Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(NotificationDisplayDataManagerImpl.class), null, new SharedHomeModuleKt$notification$$inlined$factoryOf$2(), kind, emptyList), module)), new v71(14));
    }

    public static final void d(Module module) {
        SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$1 sharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$1 = new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(CancelPremiumReserveTicketUseCase.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(DeletePremiumReserveTicketsUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchPremiumBusProductsModificationReasonsListUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetProductConfigInfoForPremiumBusProductIfActiveUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumBusInAppCommunicationBottomSheetDataUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ShouldShowRescheduleAckForTicketUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SuperPassDataWrapperImpl.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$1(), kind, emptyList), module)), new z71(23));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PassUpsellPurchaseWrapperImpl.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$2(), kind, emptyList), module)), new z71(24));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchPremiumBusBookingsTripDetailsUseCase.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PbBulkBookingRideDetailsRepositoryImpl.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$3(), kind, emptyList), module)), new z71(25));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PbBulkBookingRideDetailsRemoteDataSourceImpl.class), null, new SharedHomeModuleKt$premiumBus$$inlined$factoryOf$4(), kind, emptyList), module)), new z71(26));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PbBulkBookingRideDetailsComponent.class), null, new y71(17), kind, emptyList), module));
    }

    public static final void e(Module module) {
        v71 v71Var = new v71(16);
        SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$1 sharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$1 = new SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(PremiumReserveTicketValidationAnalyticsManager.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$1, kind, emptyList), module)), v71Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumReserveTicketValidationNavigationManager.class), null, new SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$2(), kind, emptyList), module)), new v71(17));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumReserveTicketValidationReportProblemManager.class), null, new SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$3(), kind, emptyList), module)), new v71(18));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumReserveTicketValidationUIManager.class), null, new SharedHomeModuleKt$premiumBusValidationDependencies$$inlined$factoryOf$4(), kind, emptyList), module)), new v71(19));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumReserveTicketValidationConfig.class), null, new w71(2), kind, emptyList), module));
    }

    public static final void f(Module module) {
        SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$1 sharedHomeModuleKt$productActivation$$inlined$factoryOf$default$1 = new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(ActivateProductIfRequiredUseCase.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$productActivation$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetActivationProductDataUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RunPreActivationChecksUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductActivationComponent.class), null, new w71(5), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductActivationUIStateBuilder.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ShouldCheckBLEPermissionForActivationUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        SharedHomeModuleKt$productActivation$$inlined$singleOf$default$1 sharedHomeModuleKt$productActivation$$inlined$singleOf$default$1 = new SharedHomeModuleKt$productActivation$$inlined$singleOf$default$1();
        Kind kind2 = Kind.Singleton;
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ChaloCardReceiptManager.class), null, sharedHomeModuleKt$productActivation$$inlined$singleOf$default$1, kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(OndcTicketReceiptManager.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(OndcMetroTicketReceiptManager.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(QuickPayReceiptManager.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckAndFetchPassDataFromPassIdUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetPremiumReserveTicketReceiptUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetRequestedBookedProductDataUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(OndcTicketUserDetailsForProducts.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$12(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(OndcMetroTicketUserDetailsForProducts.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$13(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PremiumReserveTicketReceiptManager.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$14(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductReceiptContractImpl.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$1(), kind, emptyList), module)), new v71(28));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(UserDetailsForChaloCard.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$15(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetProductStatusUIForSummaryScreen.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$16(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductSummaryUIStateFactory.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$17(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(TripSummaryUIStateFactory.class), null, new w71(6), kind, emptyList), module));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(TicketSummaryComponent.class), null, new w71(7), kind, emptyList), module));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetProductConfigListFromAgencyUseCase.class), null, new w71(9), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchSuperPassBookingFromPassIdUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$18(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchSuperPassTripHistoryDataUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$19(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GetCurrentCityAgencyNameUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$singleOf$default$2(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RideReceiptComponent.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$20(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PassSummaryUIStateFactory.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$21(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PassSummaryComponent.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$22(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductDataSyncRepository.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$2(), kind, emptyList), module)), new v71(29));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ProductDataSyncRemoteDataSource.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$3(), kind, emptyList), module)), new x71(0));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(AutoLinkDeviceIdUseCase.class), null, new SharedHomeModuleKt$productActivation$$inlined$factoryOf$default$23(), kind, emptyList), module)), null);
    }

    public static final void g(Module module) {
        v71 v71Var = new v71(25);
        SharedHomeModuleKt$sosFeature$$inlined$singleOf$1 sharedHomeModuleKt$sosFeature$$inlined$singleOf$1 = new SharedHomeModuleKt$sosFeature$$inlined$singleOf$1();
        Kind kind = Kind.Singleton;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(SosFeaturePlatformDelegateProviderImpl.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$sosFeature$$inlined$singleOf$1, kind, emptyList), module)), v71Var);
        SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$1 sharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$1 = new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$1();
        Kind kind2 = Kind.Factory;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SosPhoneNumberNormalizer.class), null, sharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$1, kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetOfficialSosContactsUseCase.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$2(), kind2, emptyList), module)), null);
        new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(SosContactsFeature.class), null, new w71(4), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SosScreenComponent.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$3(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SosScreenUIStateFactory.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$4(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RaiseSOSUseCase.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$default$5(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RaiseSOSRepositoryImpl.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$1(), kind2, emptyList), module)), new v71(26));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RaiseSOSRemoteDataSourceImpl.class), null, new SharedHomeModuleKt$sosFeature$$inlined$factoryOf$2(), kind2, emptyList), module)), new v71(27));
    }

    public static final void h(Module module) {
        v71 v71Var = new v71(20);
        SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$1 sharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$1 = new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(SuperPassValidationAnalyticsManager.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$1, kind, emptyList), module)), v71Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SuperPassValidationNavigationManager.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$2(), kind, emptyList), module)), new v71(21));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SuperPassProductValidationUIManager.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$3(), kind, emptyList), module)), new v71(22));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SuperPassProductValidationReportProblemManager.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$4(), kind, emptyList), module)), new v71(24));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetSuperPassForSuperPassIdUseCase.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$default$1(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, new SharedHomeModuleKt$superPassValidationDependencies$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SuperPassProductValidationConfig.class), null, new w71(3), kind, emptyList), module));
    }

    public static final void i(Module module) {
        v71 v71Var = new v71(15);
        SharedHomeModuleKt$tito$$inlined$factoryOf$1 sharedHomeModuleKt$tito$$inlined$factoryOf$1 = new SharedHomeModuleKt$tito$$inlined$factoryOf$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(TITOUnifiedFlowValidationDataManagerImpl.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedHomeModuleKt$tito$$inlined$factoryOf$1, kind, emptyList), module)), v71Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchTitoValidationConfigUseCase.class), null, new SharedHomeModuleKt$tito$$inlined$factoryOf$default$1(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetTitoTapIdForUnifiedFlowUseCase.class), null, new SharedHomeModuleKt$tito$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(HandleLastProductActivationOnTitoMissedTapOutUseCase.class), null, new SharedHomeModuleKt$tito$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(TitoRideDetailsComponent.class), null, new w71(1), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetCachedRouteInfoRouteIdUseCase.class), null, new SharedHomeModuleKt$tito$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetCachedStopFromStopIdUseCase.class), null, new SharedHomeModuleKt$tito$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
    }

    public static final void j(Module module) {
        SharedHomeModuleKt$webView$$inlined$factoryOf$default$1 sharedHomeModuleKt$webView$$inlined$factoryOf$default$1 = new SharedHomeModuleKt$webView$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(ScopeRegistry.e, Reflection.a(WebViewScreenComponent.class), null, sharedHomeModuleKt$webView$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
    }
}
