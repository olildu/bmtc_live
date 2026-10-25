package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.Device;
import app.chalo.ads.ExitInterstitialPreloadEntryPoint;
import app.chalo.ads.NativeInlineAdPrefetchEntryPoint;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl;
import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.chalobususerprofile.domain.GetPremiumBusUserSurveyPreferenceUseCase;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory;
import app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase;
import app.chalo.citydata.domain.IsDynamicCityDataFetchEnabledUseCase;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductReceiptContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.GetCityIdsInClusterProductHistoryUseCase;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.IsLocationMandatoryForUserUseCase;
import app.chalo.domain.IsStopBasedTripPlannerApplicableUseCase;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.boostratings.IBoostRatingsFeature;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.ChaloChainedBottomSheetFeature;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl;
import app.chalo.home.data.repository.PremiumPassSavingRemoteRepository;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.home.domain.FetchHomeTabSearchRemovalConfigUseCase;
import app.chalo.home.domain.FetchPremiumPassSavingsUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.home.domain.GetChaloPageItemsUseCase;
import app.chalo.home.domain.GetHomePageItemsUseCase;
import app.chalo.home.domain.GetHomeScreenConfigUseCase;
import app.chalo.home.domain.GetHomeScreenStartDestinationTabUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase;
import app.chalo.home.domain.GetPremiumBusUserMetadataUseCase;
import app.chalo.home.domain.GetProfilePageItemsUseCase;
import app.chalo.home.domain.GetRecentSearchListUseCase;
import app.chalo.home.domain.GetRegularBusPageItemsUseCase;
import app.chalo.home.domain.PremiumBusContentConfigUseCase;
import app.chalo.home.domain.ResolveChaloBusStickyBannerEligibilityUseCase;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import app.chalo.home.helper.NearbyBusMarkerHelper;
import app.chalo.home.helper.NearbyBusMarkerIconHelper;
import app.chalo.home.manager.AppRatingProcessSkeleton;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.history.factory.mapper.expired.HistoryExpiredTicketsUiStateMapperHelper;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator;
import app.chalo.metro.domain.GetMetroTicketByIdUseCase;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.ondc.domain.GetOndcMetroTicketByIdUseCase;
import app.chalo.ondc.domain.GetOndcTicketByIdUseCase;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketsWithPendingTripFeedbackUseCase;
import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketToPunchedStatusUseCase;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketTripFeedbackStatus;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationAnalyticsManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationData;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationNavigationManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationReportProblemManager;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationUIManager;
import app.chalo.productactivation.domain.GetActivationProductDataUseCase;
import app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase;
import app.chalo.productactivation.ui.ProductActivationComponent;
import app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productdatasync.repository.IProductDataSyncRepository;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassUserDetailsManager;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionManager;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSourceImpl;
import app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.productsummary.ui.ticket.ProductSummaryUIStateFactory;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TripSummaryUIStateFactory;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.database.migration.RecentsStoreMigrationHelper;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.reportproblem.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase;
import app.chalo.ridefeedback.domain.DismissRideFeedbackPromptUseCase;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase;
import app.chalo.ridefeedback.domain.RetryPendingRideFeedbackUseCase;
import app.chalo.ridefeedback.domain.SyncPremiumBusPendingPrfEntriesUseCase;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.sos.feature.SosContactsFeatureImpl;
import app.chalo.sos.feature.SosFeaturePlatformDelegateProvider;
import app.chalo.sos.official.SosPhoneNumberNormalizer;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.superpass.data.dao.SuperPassBookingsDao;
import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.data.local.TitoLocalDataStoreImpl;
import app.chalo.tito.domain.CheckIsUnifiedTitoFlowEnabledUseCase;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.tito.domain.GetSuperPassForSuperPassIdUseCase;
import app.chalo.titoridedetail.domain.HandleLastProductActivationOnTitoMissedTapOutUseCase;
import app.chalo.titoridedetail.manager.TitoRideDataManager;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.CheckIfPremiumPassEligibleForRideRollOver;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetDeviceNFCStateUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetProductConfigListFromAgencyUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.usecase.SuperPassHistoryCallHelper;
import app.chalo.usercommutepreference.domain.CheckSaveRideEligibilityUseCase;
import app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase;
import app.chalo.usercommutepreference.domain.FetchCommutePreferenceSummaryUseCase;
import app.chalo.usercommutepreference.domain.FetchSavedRideForODPairUseCase;
import app.chalo.usercommutepreference.domain.SaveOrEditRideUseCase;
import app.chalo.usercommutepreference.domain.UpdateCommutePreferenceUseCase;
import app.chalo.userprofile.domain.AccountSettingsInteractor;
import app.chalo.utils.CommonHtmlParser;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.ProductUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validation.superpass.SuperPassProductValidationConfig;
import app.chalo.validation.superpass.SuperPassProductValidationReportProblemManager;
import app.chalo.validation.superpass.SuperPassProductValidationUIManager;
import app.chalo.validation.superpass.SuperPassValidationAnalyticsManager;
import app.chalo.validation.superpass.SuperPassValidationData;
import app.chalo.validation.superpass.SuperPassValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import com.arkivanov.decompose.ComponentContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19901a;

    public /* synthetic */ w71(int i) {
        this.f19901a = i;
    }

    private final Object a(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        ParametersHolder parametersHolder = (ParametersHolder) obj2;
        ComponentContext componentContext = (ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class));
        HomeTabVisibilityController homeTabVisibilityController = (HomeTabVisibilityController) parametersHolder.a(1, Reflection.a(HomeTabVisibilityController.class));
        BottomNavTabType bottomNavTabType = (BottomNavTabType) parametersHolder.a(2, Reflection.a(BottomNavTabType.class));
        return new ChaloBusComponent(componentContext, (GetChaloPageItemsUseCase) scope.d(Reflection.a(GetChaloPageItemsUseCase.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (GetRecentAndFlippedOriginDestinationPairsUseCase) scope.d(Reflection.a(GetRecentAndFlippedOriginDestinationPairsUseCase.class), null, null), (FetchCurrentLocationUseCase) scope.d(Reflection.a(FetchCurrentLocationUseCase.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (HomeScreenInfoHelper) scope.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (HomeScreenAnalyticsHelper) scope.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (HomeTabScreensNavigationAndStateManager) scope.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (UniversalSearchResultStateManager) scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (IReportProblemFeature) scope.d(Reflection.a(IReportProblemFeature.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (FetchPremiumPassSavingsUseCase) scope.d(Reflection.a(FetchPremiumPassSavingsUseCase.class), null, null), homeTabVisibilityController, bottomNavTabType, (SuperPassRepository) scope.d(Reflection.a(SuperPassRepository.class), null, null), (FetchBannerUseCase) scope.d(Reflection.a(FetchBannerUseCase.class), null, null), (HandlePremiumPassRenewFlowUseCase) scope.d(Reflection.a(HandlePremiumPassRenewFlowUseCase.class), null, null), (FormatTimeInMillisToGivenFormatUseCase) scope.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null), (FetchProductConfigsForUiUseCase) scope.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null), (FetchCompleteProductConfigByIdUseCase) scope.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null), (StoreCompleteProductConfigLocallyUseCase) scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null), (ProductBookingNavigationManager) scope.d(Reflection.a(ProductBookingNavigationManager.class), null, null), (LocalDataStore) scope.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (PremiumBusContentConfigUseCase) scope.d(Reflection.a(PremiumBusContentConfigUseCase.class), null, null), (UrlOpenHelper) scope.d(Reflection.a(UrlOpenHelper.class), null, null), (CheckSaveRideEligibilityUseCase) scope.d(Reflection.a(CheckSaveRideEligibilityUseCase.class), null, null), (FetchSavedRideForODPairUseCase) scope.d(Reflection.a(FetchSavedRideForODPairUseCase.class), null, null), (GetPremiumBusUserMetadataUseCase) scope.d(Reflection.a(GetPremiumBusUserMetadataUseCase.class), null, null), (SaveOrEditRideUseCase) scope.d(Reflection.a(SaveOrEditRideUseCase.class), null, null), (DeleteSavedRideUseCase) scope.d(Reflection.a(DeleteSavedRideUseCase.class), null, null), (PricingEngineRuleExpiryTickerDelegate) scope.d(Reflection.a(PricingEngineRuleExpiryTickerDelegate.class), null, null));
    }

    private final Object c(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new CityMetaPropsLocalDataSource((CoroutineContextProvider) factory.d(Reflection.a(CoroutineContextProvider.class), null, null), (DataStore) factory.d(Reflection.a(DataStore.class), null, new StringQualifier("city_store.preferences_pb")));
    }

    private final Object d(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        ParametersHolder parametersHolder = (ParametersHolder) obj2;
        return new ChaloBusUserProfileSurveyComponent((ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (ChaloBusUserProfileSurveyArgs) parametersHolder.a(1, Reflection.a(ChaloBusUserProfileSurveyArgs.class)), (GetPremiumBusUserSurveyPreferenceUseCase) scope.d(Reflection.a(GetPremiumBusUserSurveyPreferenceUseCase.class), null, null), (UpdateCommutePreferenceUseCase) scope.d(Reflection.a(UpdateCommutePreferenceUseCase.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (UniversalSearchResultStateManager) scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (ChaloBusUserProfileSurveyUiStateFactory) scope.d(Reflection.a(ChaloBusUserProfileSurveyUiStateFactory.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
    }

    private final Object e(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(single, "$this$single");
        Intrinsics.i(it, "it");
        return new SuperPassRepository(new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("pass_status_store.preferences_pb"))), (SuperPassDao) single.d(Reflection.a(SuperPassDao.class), null, null), (SuperPassBookingsDao) single.d(Reflection.a(SuperPassBookingsDao.class), null, null), (CityProvider) single.d(Reflection.a(CityProvider.class), null, null), (SystemHelper) single.d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) single.d(Reflection.a(CoroutineContextProvider.class), null, null), (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null), (GetCityIdsInClusterProductHistoryUseCase) single.d(Reflection.a(GetCityIdsInClusterProductHistoryUseCase.class), null, null));
    }

    private final Object f(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        ParametersHolder parametersHolder = (ParametersHolder) obj2;
        return new RegularBusComponent((ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (NearbyTripsDataManagerBase) scope.d(Reflection.a(NearbyTripsDataManagerBase.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetEstimatedTimeUseCase) scope.d(Reflection.a(GetEstimatedTimeUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null), (GetRegularBusPageItemsUseCase) scope.d(Reflection.a(GetRegularBusPageItemsUseCase.class), null, null), (IsDynamicCityDataFetchEnabledUseCase) scope.d(Reflection.a(IsDynamicCityDataFetchEnabledUseCase.class), null, null), (HomeScreenInfoHelper) scope.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (GeoSpatialLiveBusesDataPollingManager) scope.d(Reflection.a(GeoSpatialLiveBusesDataPollingManager.class), null, null), (NearbyBusMarkerHelper) scope.d(Reflection.a(NearbyBusMarkerHelper.class), null, null), (IsLocationMandatoryForUserUseCase) scope.d(Reflection.a(IsLocationMandatoryForUserUseCase.class), null, null), (RecentsStoreMigrationHelper) scope.d(Reflection.a(RecentsStoreMigrationHelper.class), null, null), (RecentRepositoryProvider) scope.d(Reflection.a(RecentRepositoryProvider.class), null, null), (GetRecentSearchListUseCase) scope.d(Reflection.a(GetRecentSearchListUseCase.class), null, null), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null), (GetTripPlannerConfigForCityUseCase) scope.d(Reflection.a(GetTripPlannerConfigForCityUseCase.class), null, null), (GetGeoQueryCityWiseConfigUseCase) scope.d(Reflection.a(GetGeoQueryCityWiseConfigUseCase.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (HomeScreenAnalyticsHelper) scope.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (CheckIsTripNotStaleUseCase) scope.d(Reflection.a(CheckIsTripNotStaleUseCase.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (IsStopBasedTripPlannerApplicableUseCase) scope.d(Reflection.a(IsStopBasedTripPlannerApplicableUseCase.class), null, null), (PermissionHandlerProvider) scope.d(Reflection.a(PermissionHandlerProvider.class), null, null), (IsCityRouteNamesDisabledUseCase) scope.d(Reflection.a(IsCityRouteNamesDisabledUseCase.class), null, null), (LiveTrackingConfigDataStore) scope.d(Reflection.a(LiveTrackingConfigDataStore.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (HomeTabScreensNavigationAndStateManager) scope.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (TicketPurchaseSceneResolverUseCase) scope.d(Reflection.a(TicketPurchaseSceneResolverUseCase.class), null, null), (GpsRequestHandlerProvider) scope.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (LocationPermissionCallbackHandler) scope.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null), (IsCityEnabledForLiveTrackingUseCase) scope.d(Reflection.a(IsCityEnabledForLiveTrackingUseCase.class), null, null), (GetClusterConfigForCityUseCase) scope.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null), (UrlOpenHelper) scope.d(Reflection.a(UrlOpenHelper.class), null, null), (HomeTabVisibilityController) parametersHolder.a(1, Reflection.a(HomeTabVisibilityController.class)), (BottomNavTabType) parametersHolder.a(2, Reflection.a(BottomNavTabType.class)), (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (ProductBookingHelper) scope.d(Reflection.a(ProductBookingHelper.class), null, null), (JuspayControllerProvider) scope.d(Reflection.a(JuspayControllerProvider.class), null, null), (ArePermissionsGrantedUseCase) scope.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null));
    }

    private final Object g(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(single, "$this$single");
        Intrinsics.i(it, "it");
        return new HomeScreenConfigLocalDataStoreImpl((LocalDataStore) single.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("homeScreenConfigDataStoreKey.preferences_pb")), (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) single.d(Reflection.a(CrashlyticsLogger.class), null, null), (HtmlTextUIHelper) single.d(Reflection.a(HtmlTextUIHelper.class), null, null), (CommonHtmlParser) single.d(Reflection.a(CommonHtmlParser.class), null, null));
    }

    private final Object h(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new ProductPurchaseLocalDataSourceImpl((LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")), (LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_document_props_store.preferences_pb")));
    }

    private final Object i(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new UpdateDebugBuildEnvironmentUseCase((DataStore) factory.d(Reflection.a(DataStore.class), null, new StringQualifier("ENV_CHANGE_STORE_KEY.preferences_pb")), (ChaloBuildConfig) factory.d(Reflection.a(ChaloBuildConfig.class), null, null));
    }

    private final Object j(Object obj, Object obj2) throws DefinitionParameterException {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        Object objB = it.b(Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.class));
        if (objB == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.class)) + '\'');
        }
        SuperPassPurchaseArgs.EnterUserDetailsArgs enterUserDetailsArgs = (SuperPassPurchaseArgs.EnterUserDetailsArgs) objB;
        Object objB2 = it.b(Reflection.a(ComponentContext.class));
        if (objB2 == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(ComponentContext.class)) + '\'');
        }
        ComponentContext componentContext = (ComponentContext) objB2;
        Object objB3 = it.b(Reflection.a(SuperPassUserDetailsManager.class));
        if (objB3 != null) {
            return new SuperPassEnterUserDetailsViewModel(enterUserDetailsArgs, componentContext, (SuperPassUserDetailsManager) objB3, (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (BasicInfoContract) factory.d(Reflection.a(BasicInfoContract.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null), (GetTimeInMillisAfterXTimeUseCase) factory.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (SmartSuperPassPassengerSelectionHelper) factory.d(Reflection.a(SmartSuperPassPassengerSelectionHelper.class), null, null), (ChaloAppFeatureHelper) factory.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (UserProfileDetailsProvider) factory.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
        }
        throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassUserDetailsManager.class)) + '\'');
    }

    private final Object k(Object obj, Object obj2) throws DefinitionParameterException {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        Object objB = it.b(Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.class));
        if (objB == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.class)) + '\'');
        }
        SuperPassPurchaseArgs.UserProofsOverviewArgs userProofsOverviewArgs = (SuperPassPurchaseArgs.UserProofsOverviewArgs) objB;
        Object objB2 = it.b(Reflection.a(ComponentContext.class));
        if (objB2 == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(ComponentContext.class)) + '\'');
        }
        ComponentContext componentContext = (ComponentContext) objB2;
        Object objB3 = it.b(Reflection.a(SuperPassProofUploadManager.class));
        if (objB3 != null) {
            return new SuperPassProofOverviewViewModel(userProofsOverviewArgs, componentContext, (SuperPassProofUploadManager) objB3, (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (ChaloAppFeatureHelper) factory.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (UrlOpenHelper) factory.d(Reflection.a(UrlOpenHelper.class), null, null), (PermissionHandlerProvider) factory.d(Reflection.a(PermissionHandlerProvider.class), null, null), (ImagePickerProvider) factory.d(Reflection.a(ImagePickerProvider.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (SystemHelper) factory.d(Reflection.a(SystemHelper.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloBuildConfig) factory.d(Reflection.a(ChaloBuildConfig.class), null, null));
        }
        throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassProofUploadManager.class)) + '\'');
    }

    private final Object l(Object obj, Object obj2) throws DefinitionParameterException {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        Object objB = it.b(Reflection.a(SuperPassPurchaseArgs.ProofUploadInternalArgs.class));
        if (objB == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPurchaseArgs.ProofUploadInternalArgs.class)) + '\'');
        }
        SuperPassPurchaseArgs.ProofUploadInternalArgs proofUploadInternalArgs = (SuperPassPurchaseArgs.ProofUploadInternalArgs) objB;
        Object objB2 = it.b(Reflection.a(ComponentContext.class));
        if (objB2 == null) {
            throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(ComponentContext.class)) + '\'');
        }
        ComponentContext componentContext = (ComponentContext) objB2;
        Object objB3 = it.b(Reflection.a(SuperPassProofUploadManager.class));
        if (objB3 != null) {
            return new SuperPassUserProofUploadViewModel(proofUploadInternalArgs, componentContext, (SuperPassProofUploadManager) objB3, (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (PermissionHandlerProvider) factory.d(Reflection.a(PermissionHandlerProvider.class), null, null), (ImagePickerProvider) factory.d(Reflection.a(ImagePickerProvider.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (UrlOpenHelper) factory.d(Reflection.a(UrlOpenHelper.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (SystemHelper) factory.d(Reflection.a(SystemHelper.class), null, null), (ChaloBuildConfig) factory.d(Reflection.a(ChaloBuildConfig.class), null, null));
        }
        throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassProofUploadManager.class)) + '\'');
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.f19901a) {
            case 0:
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new TitoLocalDataStoreImpl((LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("keyTITOFirstTimeUser.preferences_pb")));
            case 1:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new TitoRideDetailsComponent((TitoRideDetailsArgs) parametersHolder.a(1, Reflection.a(TitoRideDetailsArgs.class)), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (TITOValidationDataRepository) scope.d(Reflection.a(TITOValidationDataRepository.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TitoRideDataManager) scope.d(Reflection.a(TitoRideDataManager.class), null, null), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (LiveTrackingDataManager) scope.d(Reflection.a(LiveTrackingDataManager.class), null, null), (TITOUnifiedFlowValidationDataManager) scope.d(Reflection.a(TITOUnifiedFlowValidationDataManager.class), null, null), (ProcessLiveStopEtaDataUseCase) scope.d(Reflection.a(ProcessLiveStopEtaDataUseCase.class), null, null), (ChaloMapMarkerIconProvider) scope.d(Reflection.a(ChaloMapMarkerIconProvider.class), null, null), (ArePermissionsGrantedUseCase) scope.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (FetchTitoValidationConfigUseCase) scope.d(Reflection.a(FetchTitoValidationConfigUseCase.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (HandleLastProductActivationOnTitoMissedTapOutUseCase) scope.d(Reflection.a(HandleLastProductActivationOnTitoMissedTapOutUseCase.class), null, null), (LatLngBoundsUtils) scope.d(Reflection.a(LatLngBoundsUtils.class), null, null), (PolylineUtils) scope.d(Reflection.a(PolylineUtils.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (ChaloMapMarkerInfoWindowProvider) scope.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (ValidationSceneResolverUseCase) scope.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null), (GetMTicketForTicketIdUseCase) scope.d(Reflection.a(GetMTicketForTicketIdUseCase.class), null, null), (ApplicationBackgroundWorkersManager) scope.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null), (ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)));
            case 2:
                Scope factory2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it2, "it");
                return new PremiumReserveTicketValidationConfig(new PremiumReserveTicketValidationData((CurrencyFeature) factory2.d(Reflection.a(CurrencyFeature.class), null, null), (StringProvider) factory2.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) factory2.d(Reflection.a(TimeUtilsContract.class), null, null), (GenerateHashCodeForEasyVerificationUseCase) factory2.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null)), (ProductValidationAnalyticManager) factory2.d(Reflection.a(PremiumReserveTicketValidationAnalyticsManager.class), null, null), (ProductValidationNavigationManager) factory2.d(Reflection.a(PremiumReserveTicketValidationNavigationManager.class), null, null), (ProductValidationUIManager) factory2.d(Reflection.a(PremiumReserveTicketValidationUIManager.class), null, null), (ProductValidationReportProblemManager) factory2.d(Reflection.a(PremiumReserveTicketValidationReportProblemManager.class), null, null), (GetPremiumReserveTicketByIdUseCase) factory2.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (BasicInfoContract) factory2.d(Reflection.a(BasicInfoContract.class), null, null), (UserProfileDetailsProvider) factory2.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (GenerateHashCodeForEasyVerificationUseCase) factory2.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null), (GetNumDigitsOfHashValueForEasyVerificationUseCase) factory2.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null), (ProductsSyncContract) factory2.d(Reflection.a(ProductsSyncContract.class), null, null), (UpdatePremiumReserveTicketToPunchedStatusUseCase) factory2.d(Reflection.a(UpdatePremiumReserveTicketToPunchedStatusUseCase.class), null, null));
            case 3:
                Scope factory3 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it3, "it");
                return new SuperPassProductValidationConfig(new SuperPassValidationData((CurrencyFeature) factory3.d(Reflection.a(CurrencyFeature.class), null, null), (StringProvider) factory3.d(Reflection.a(StringProvider.class), null, null), (CityProvider) factory3.d(Reflection.a(CityProvider.class), null, null), (TimeUtilsContract) factory3.d(Reflection.a(TimeUtilsContract.class), null, null), (GenerateHashCodeForEasyVerificationUseCase) factory3.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null)), (ProductValidationAnalyticManager) factory3.d(Reflection.a(SuperPassValidationAnalyticsManager.class), null, null), (ProductValidationNavigationManager) factory3.d(Reflection.a(SuperPassValidationNavigationManager.class), null, null), (ProductValidationUIManager) factory3.d(Reflection.a(SuperPassProductValidationUIManager.class), null, null), (ProductValidationReportProblemManager) factory3.d(Reflection.a(SuperPassProductValidationReportProblemManager.class), null, null), (GetSuperPassForSuperPassIdUseCase) factory3.d(Reflection.a(GetSuperPassForSuperPassIdUseCase.class), null, null), (GetNumDigitsOfHashValueForEasyVerificationUseCase) factory3.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null), (GenerateHashCodeForEasyVerificationUseCase) factory3.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null), (ProductsSyncContract) factory3.d(Reflection.a(ProductsSyncContract.class), null, null), (BasicInfoContract) factory3.d(Reflection.a(BasicInfoContract.class), null, null), (TimeUtilsContract) factory3.d(Reflection.a(TimeUtilsContract.class), null, null));
            case 4:
                Scope single = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it4, "it");
                return new SosContactsFeatureImpl((LocalDataStore) single.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("sos_store_key.preferences_pb")), (CrashlyticsLogger) single.d(Reflection.a(CrashlyticsLogger.class), null, null), (StringProvider) single.d(Reflection.a(StringProvider.class), null, null), (SosFeaturePlatformDelegateProvider) single.d(Reflection.a(SosFeaturePlatformDelegateProvider.class), null, null), (ChaloLocationManager) single.d(Reflection.a(ChaloLocationManager.class), null, null), (SosPhoneNumberNormalizer) single.d(Reflection.a(SosPhoneNumberNormalizer.class), null, null));
            case 5:
                Scope factory4 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it5, "it");
                return new ProductActivationComponent((ComponentContext) factory4.d(Reflection.a(ComponentContext.class), null, null), (ProductActivationArgs) factory4.d(Reflection.a(ProductActivationArgs.class), null, null), (GetActivationProductDataUseCase) factory4.d(Reflection.a(GetActivationProductDataUseCase.class), null, null), (ChaloNavigationManager) factory4.d(Reflection.a(ChaloNavigationManager.class), null, null), (PermissionHandlerProvider) factory4.d(Reflection.a(PermissionHandlerProvider.class), null, null), (CheckBluetoothPermissionHelper) factory4.d(Reflection.a(CheckBluetoothPermissionHelper.class), null, null), (AnalyticsContract) factory4.d(Reflection.a(AnalyticsContract.class), null, null), (RunPreActivationChecksUseCase) factory4.d(Reflection.a(RunPreActivationChecksUseCase.class), null, null), (ActivateProductIfRequiredUseCase) factory4.d(Reflection.a(ActivateProductIfRequiredUseCase.class), null, null), (GetValidationProcessFlowDetailsForValidationProductUseCase) factory4.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null), (ValidationSceneResolverUseCase) factory4.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null), (StringProvider) factory4.d(Reflection.a(StringProvider.class), null, null), (GetActiveTitoTripsAndUpdateRestUseCase) factory4.d(Reflection.a(GetActiveTitoTripsAndUpdateRestUseCase.class), null, null), (KotlinToastManager) factory4.d(Reflection.a(KotlinToastManager.class), null, null), (IReportProblemFeature) factory4.d(Reflection.a(IReportProblemFeature.class), null, null), (ProductActivationUIStateBuilder) factory4.d(Reflection.a(ProductActivationUIStateBuilder.class), null, null), (ShouldCheckBLEPermissionForActivationUseCase) factory4.d(Reflection.a(ShouldCheckBLEPermissionForActivationUseCase.class), null, null), (ChaloLocationManager) factory4.d(Reflection.a(ChaloLocationManager.class), null, null), (CurrencyFeature) factory4.d(Reflection.a(CurrencyFeature.class), null, null), (ProductBookingDataStore) factory4.d(Reflection.a(ProductBookingDataStore.class), null, null), (InstantTicketConfigHelper) factory4.d(Reflection.a(InstantTicketConfigHelper.class), null, null), (GetOndcTicketByIdUseCase) factory4.d(Reflection.a(GetOndcTicketByIdUseCase.class), null, null), (GetOndcMetroTicketByIdUseCase) factory4.d(Reflection.a(GetOndcMetroTicketByIdUseCase.class), null, null), (GetMetroTicketByIdUseCase) factory4.d(Reflection.a(GetMetroTicketByIdUseCase.class), null, null), (ChaloTimeProvider) factory4.d(Reflection.a(ChaloTimeProvider.class), null, null), (SystemHelper) factory4.d(Reflection.a(SystemHelper.class), null, null), (ResolveQuickPayProductNameUseCase) factory4.d(Reflection.a(ResolveQuickPayProductNameUseCase.class), null, null), (UserProfileDetailsProvider) factory4.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (UserProfilingHooksOrchestrator) factory4.d(Reflection.a(UserProfilingHooksOrchestrator.class), null, null), (GetPremiumReserveTicketByIdUseCase) factory4.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null));
            case 6:
                Scope factory5 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(factory5, "$this$factory");
                Intrinsics.i(it6, "it");
                return new TripSummaryUIStateFactory((GetProductStatusUIForSummaryScreen) factory5.d(Reflection.a(GetProductStatusUIForSummaryScreen.class), null, null), (TimeUtilsContract) factory5.d(Reflection.a(TimeUtilsContract.class), null, null), (CheckAndFetchPassDataFromPassIdUseCase) factory5.d(Reflection.a(CheckAndFetchPassDataFromPassIdUseCase.class), null, null), (StringProvider) factory5.d(Reflection.a(StringProvider.class), null, null), (CurrencyFeature) factory5.d(Reflection.a(CurrencyFeature.class), null, null), (BasicInfoContract) factory5.d(Reflection.a(BasicInfoContract.class), null, null), (HistoryExpiredTicketsUiStateMapperHelper) factory5.d(Reflection.a(HistoryExpiredTicketsUiStateMapperHelper.class), null, null), (GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase) factory5.d(Reflection.a(GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase.class), null, null), (ProductSummaryUIStateFactory) factory5.d(Reflection.a(ProductSummaryUIStateFactory.class), null, null), (MTicketUtilsHelper) factory5.d(Reflection.a(MTicketUtilsHelper.class), null, null), (LocalDataStore) factory5.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")));
            case 7:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new TicketSummaryComponent((TripSummaryArgs.TicketSummaryScreen) parametersHolder2.a(1, Reflection.a(TripSummaryArgs.TicketSummaryScreen.class)), (ComponentContext) parametersHolder2.a(0, i71.k(scope2, "$this$factory", parametersHolder2, "<destruct>", ComponentContext.class)), (GetRequestedBookedProductDataUseCase) scope2.d(Reflection.a(GetRequestedBookedProductDataUseCase.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (ActivateProductIfRequiredUseCase) scope2.d(Reflection.a(ActivateProductIfRequiredUseCase.class), null, null), (GetValidationProcessFlowDetailsForValidationProductUseCase) scope2.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null), (BasicInfoContract) scope2.d(Reflection.a(BasicInfoContract.class), null, null), (GetProductConfigInfoForPremiumBusProductIfActiveUseCase) scope2.d(Reflection.a(GetProductConfigInfoForPremiumBusProductIfActiveUseCase.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope2.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (ProductReceiptContract) scope2.d(Reflection.a(ProductReceiptContract.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (TripSummaryUIStateFactory) scope2.d(Reflection.a(TripSummaryUIStateFactory.class), null, null), (KotlinToastManager) scope2.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (BookingHelpResultStateManager) scope2.d(Reflection.a(BookingHelpResultStateManager.class), null, null), (BookingHelpConfigHelper) scope2.d(Reflection.a(BookingHelpConfigHelper.class), null, null), (ProductsSyncContract) scope2.d(Reflection.a(ProductsSyncContract.class), null, null), (ValidationSceneResolverUseCase) scope2.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null), (FetchProductInvoiceUseCase) scope2.d(Reflection.a(FetchProductInvoiceUseCase.class), null, null), (SystemHelper) scope2.d(Reflection.a(SystemHelper.class), null, null), (GetProductConfigFromProductIdUseCase) scope2.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null), (GetRouteDataFromLocalOrRemoteUseCase) scope2.d(Reflection.a(GetRouteDataFromLocalOrRemoteUseCase.class), null, null), (GetProductConfigListFromAgencyUseCase) scope2.d(Reflection.a(GetProductConfigListFromAgencyUseCase.class), null, null), (ChaloAppFeatureHelper) scope2.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
            case 8:
                Scope factory6 = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(factory6, "$this$factory");
                Intrinsics.i(it7, "it");
                return new app.chalo.usecase.IsLocationMandatoryForUserUseCase((CityProvider) factory6.d(Reflection.a(CityProvider.class), null, null), (BasicInfoContract) factory6.d(Reflection.a(BasicInfoContract.class), null, null), (ChaloBuildConfig) factory6.d(Reflection.a(ChaloBuildConfig.class), null, null), (ChaloConfigFeature) factory6.d(Reflection.a(ChaloConfigFeature.class), null, null), (CrashlyticsLogger) factory6.d(Reflection.a(CrashlyticsLogger.class), null, null), new LocalDataStore((DataStore) factory6.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (AnalyticsContract) factory6.d(Reflection.a(AnalyticsContract.class), null, null));
            case 9:
                Scope factory7 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(factory7, "$this$factory");
                Intrinsics.i(it8, "it");
                return new GetProductConfigListFromAgencyUseCase((LocalDataStore) factory7.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (GetProductConfigFromProductIdUseCase) factory7.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null));
            case 10:
                Scope factory8 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(factory8, "$this$factory");
                Intrinsics.i(it9, "it");
                return new ProfileScreenComponent((ComponentContext) factory8.d(Reflection.a(ComponentContext.class), null, null), (WalletDataStore) factory8.d(Reflection.a(WalletDataStore.class), null, null), (HomeScreenInfoHelper) factory8.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (GetProfilePageItemsUseCase) factory8.d(Reflection.a(GetProfilePageItemsUseCase.class), null, null), (HomeScreenAnalyticsHelper) factory8.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (CoroutineContextProvider) factory8.d(Reflection.a(CoroutineContextProvider.class), null, null), (ChaloBuildConfig) factory8.d(Reflection.a(ChaloBuildConfig.class), null, null), (ChaloTimeRefreshManagerUseCase) factory8.d(Reflection.a(ChaloTimeRefreshManagerUseCase.class), null, null), (ChaloNavigationManager) factory8.d(Reflection.a(ChaloNavigationManager.class), null, null), (HomeTabScreensNavigationAndStateManager) factory8.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (CityProvider) factory8.d(Reflection.a(CityProvider.class), null, null), (InitiateFreshChatCustomerSupportUseCase) factory8.d(Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, null), (UserProfileDetailsProvider) factory8.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (AccountSettingsInteractor) factory8.d(Reflection.a(AccountSettingsInteractor.class), null, null), (StringProvider) factory8.d(Reflection.a(StringProvider.class), null, null), (KotlinToastManager) factory8.d(Reflection.a(KotlinToastManager.class), null, null), (UrlOpenHelper) factory8.d(Reflection.a(UrlOpenHelper.class), null, null), (ChaloAppFeatureHelper) factory8.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (ResolveSupportPolicyUseCase) factory8.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null), (JuspayControllerProvider) factory8.d(Reflection.a(JuspayControllerProvider.class), null, null));
            case 11:
                Scope factory9 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(factory9, "$this$factory");
                Intrinsics.i(it10, "it");
                return new InitiateProductHistorySyncCallUseCase((IProductDataSyncRepository) factory9.d(Reflection.a(IProductDataSyncRepository.class), null, null), (StringProvider) factory9.d(Reflection.a(StringProvider.class), null, null), (BasicInfoContract) factory9.d(Reflection.a(BasicInfoContract.class), null, null), (Device) factory9.d(Reflection.a(Device.class), null, null), (CityProvider) factory9.d(Reflection.a(CityProvider.class), null, null), (CoroutineContextProvider) factory9.d(Reflection.a(CoroutineContextProvider.class), null, null), (ReclaimDataStoreWrapper) factory9.d(Reflection.a(ReclaimDataStoreWrapper.class), null, null), (UserProfileDetailsProvider) factory9.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CrashlyticsLogger) factory9.d(Reflection.a(CrashlyticsLogger.class), null, null), (SuperPassHistoryCallHelper) factory9.d(Reflection.a(SuperPassHistoryCallHelper.class), null, null), (MobileTicketingConverters) factory9.d(Reflection.a(MobileTicketingConverters.class), null, null), (LocalDataStore) factory9.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_document_props_store.preferences_pb")), (LocalDataStore) factory9.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (GetPremiumBusCurrentCityConfigUseCase) factory9.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (InstantTicketRepository) factory9.d(Reflection.a(InstantTicketRepository.class), null, null), (PremiumBusRepository) factory9.d(Reflection.a(PremiumBusRepository.class), null, null), (OndcRepository) factory9.d(Reflection.a(OndcRepository.class), null, null), (MetroRepository) factory9.d(Reflection.a(MetroRepository.class), null, null), (MultiModalGroupTicketRepository) factory9.d(Reflection.a(MultiModalGroupTicketRepository.class), null, null), (AnalyticsContract) factory9.d(Reflection.a(AnalyticsContract.class), null, null), (TicketRepository) factory9.d(Reflection.a(TicketRepository.class), null, null), (MTicketUtilsHelper) factory9.d(Reflection.a(MTicketUtilsHelper.class), null, null), (MandatoryFirstHistoryCallGuard) factory9.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null), (FetchProductConfigsForUiUseCase) factory9.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null), (ProductBookingDataStore) factory9.d(Reflection.a(ProductBookingDataStore.class), null, null));
            case 12:
                Scope factory10 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(factory10, "$this$factory");
                Intrinsics.i(it11, "it");
                return new HomeComponent((ComponentContext) factory10.d(Reflection.a(ComponentContext.class), null, null), (HomeArgs) factory10.d(Reflection.a(HomeArgs.class), null, null), (CityProvider) factory10.d(Reflection.a(CityProvider.class), null, null), new LocalDataStore((DataStore) factory10.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (ChaloChainedBottomSheetFeature) factory10.d(Reflection.a(ChaloChainedBottomSheetFeature.class), null, null), (HomeScreenInfoHelper) factory10.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (StringProvider) factory10.d(Reflection.a(StringProvider.class), null, null), (IReportProblemFeature) factory10.d(Reflection.a(IReportProblemFeature.class), null, null), (IBoostRatingsFeature) factory10.d(Reflection.a(IBoostRatingsFeature.class), null, null), (SuperPassRepository) factory10.d(Reflection.a(SuperPassRepository.class), null, null), (GetDeviceNFCStateUseCase) factory10.d(Reflection.a(GetDeviceNFCStateUseCase.class), null, null), (UserProfileDetailsProvider) factory10.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (BasicInfoContract) factory10.d(Reflection.a(BasicInfoContract.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) factory10.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (UpdatePremiumReserveTicketTripFeedbackStatus) factory10.d(Reflection.a(UpdatePremiumReserveTicketTripFeedbackStatus.class), null, null), (GetPremiumReserveTicketsWithPendingTripFeedbackUseCase) factory10.d(Reflection.a(GetPremiumReserveTicketsWithPendingTripFeedbackUseCase.class), null, null), (BackfillPendingPremiumBusPrfUseCase) factory10.d(Reflection.a(BackfillPendingPremiumBusPrfUseCase.class), null, null), (GetTimeInMillisAfterXTimeUseCase) factory10.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (HomeScreenAnalyticsHelper) factory10.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (FetchGeoSpatialDataUseCase) factory10.d(Reflection.a(FetchGeoSpatialDataUseCase.class), null, null), (ChaloLocationManager) factory10.d(Reflection.a(ChaloLocationManager.class), null, null), (GetGeoQueryCityWiseConfigUseCase) factory10.d(Reflection.a(GetGeoQueryCityWiseConfigUseCase.class), null, null), (GetHomeScreenConfigUseCase) factory10.d(Reflection.a(GetHomeScreenConfigUseCase.class), null, null), (CoroutineContextProvider) factory10.d(Reflection.a(CoroutineContextProvider.class), null, null), (CityMetaDataManager) factory10.d(Reflection.a(CityMetaDataManager.class), null, null), (IsNotificationPermissionGrantedUseCase) factory10.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) factory10.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (ProductUtils) factory10.d(Reflection.a(ProductUtils.class), null, null), (AppRatingProcessSkeleton) factory10.d(Reflection.a(AppRatingProcessSkeleton.class), null, null), (ChaloNavigationManager) factory10.d(Reflection.a(ChaloNavigationManager.class), null, null), (NetworkStateManager) factory10.d(Reflection.a(NetworkStateManager.class), null, null), (CheckIfAppUpdateRequiredUseCase) factory10.d(Reflection.a(CheckIfAppUpdateRequiredUseCase.class), null, null), (HomeTabScreensNavigationAndStateManager) factory10.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (FetchHomeTabSearchRemovalConfigUseCase) factory10.d(Reflection.a(FetchHomeTabSearchRemovalConfigUseCase.class), null, null), (GetTripPlannerConfigForCityUseCase) factory10.d(Reflection.a(GetTripPlannerConfigForCityUseCase.class), null, null), (GetNextStepOnPassApplicationVerifiedUseCase) factory10.d(Reflection.a(GetNextStepOnPassApplicationVerifiedUseCase.class), null, null), (GetNextStepOnPassApplicationRejectedUseCase) factory10.d(Reflection.a(GetNextStepOnPassApplicationRejectedUseCase.class), null, null), (KotlinToastManager) factory10.d(Reflection.a(KotlinToastManager.class), null, null), (PassPurchaseSceneResolverUseCase) factory10.d(Reflection.a(PassPurchaseSceneResolverUseCase.class), null, null), (GetHomeScreenStartDestinationTabUseCase) factory10.d(Reflection.a(GetHomeScreenStartDestinationTabUseCase.class), null, null), (ApplicationBackgroundWorkersManager) factory10.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null), (GetAllRequestedBookedProductsUseCase) factory10.d(Reflection.a(GetAllRequestedBookedProductsUseCase.class), null, null), (CheckIfPremiumPassEligibleForRideRollOver) factory10.d(Reflection.a(CheckIfPremiumPassEligibleForRideRollOver.class), null, null), (DpdpaConsentManager) factory10.d(Reflection.a(DpdpaConsentManager.class), null, null), (AdjustManager) factory10.d(Reflection.a(AdjustManager.class), null, null), (ChaloConfigFeature) factory10.d(Reflection.a(ChaloConfigFeature.class), null, null), (CrashlyticsLogger) factory10.d(Reflection.a(CrashlyticsLogger.class), null, null), (LiveTrackingConfigDataStore) factory10.d(Reflection.a(LiveTrackingConfigDataStore.class), null, null), (TicketRepository) factory10.d(Reflection.a(TicketRepository.class), null, null), (SystemHelper) factory10.d(Reflection.a(SystemHelper.class), null, null), (NativeInlineAdPrefetchEntryPoint) factory10.d(Reflection.a(NativeInlineAdPrefetchEntryPoint.class), null, null), (ExitInterstitialPreloadEntryPoint) factory10.d(Reflection.a(ExitInterstitialPreloadEntryPoint.class), null, null), (LanguageFeature) factory10.d(Reflection.a(LanguageFeature.class), null, null), (PermissionHandlerProvider) factory10.d(Reflection.a(PermissionHandlerProvider.class), null, null), (SdkIntegrationPolicyManager) factory10.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null), (UserProfilingHooksOrchestrator) factory10.d(Reflection.a(UserProfilingHooksOrchestrator.class), null, null), (ResolveChaloBusStickyBannerEligibilityUseCase) factory10.d(Reflection.a(ResolveChaloBusStickyBannerEligibilityUseCase.class), null, null), (PremiumBusUserSurveyPreferenceRepository) factory10.d(Reflection.a(PremiumBusUserSurveyPreferenceRepository.class), null, null), (FetchCommutePreferenceSummaryUseCase) factory10.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null), (ChaloAppFeatureHelper) factory10.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (LocalDataStore) factory10.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("ride_hailing_store.preferences_pb")), (GetPostRideFeedbackDataUseCase) factory10.d(Reflection.a(GetPostRideFeedbackDataUseCase.class), null, null), (RideHailingRepository) factory10.d(Reflection.a(RideHailingRepository.class), null, null), (SubmitRideHailingBookingFeedbackUseCase) factory10.d(Reflection.a(SubmitRideHailingBookingFeedbackUseCase.class), null, null), (RetryPendingRideFeedbackUseCase) factory10.d(Reflection.a(RetryPendingRideFeedbackUseCase.class), null, null), (SyncPremiumBusPendingPrfEntriesUseCase) factory10.d(Reflection.a(SyncPremiumBusPendingPrfEntriesUseCase.class), null, null), (ObservePendingRideFeedbackPromptsUseCase) factory10.d(Reflection.a(ObservePendingRideFeedbackPromptsUseCase.class), null, null), (DismissRideFeedbackPromptUseCase) factory10.d(Reflection.a(DismissRideFeedbackPromptUseCase.class), null, null), (TimeUtilsContract) factory10.d(Reflection.a(TimeUtilsContract.class), null, null));
            case 13:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                return new HomeScreenComponent((ComponentContext) parametersHolder3.a(0, i71.k(scope3, "$this$factory", parametersHolder3, "<destruct>", ComponentContext.class)), (UrlOpenHelper) scope3.d(Reflection.a(UrlOpenHelper.class), null, null), (CityProvider) scope3.d(Reflection.a(CityProvider.class), null, null), (StringProvider) scope3.d(Reflection.a(StringProvider.class), null, null), (GetHomePageItemsUseCase) scope3.d(Reflection.a(GetHomePageItemsUseCase.class), null, null), (GetTripPlannerConfigForCityUseCase) scope3.d(Reflection.a(GetTripPlannerConfigForCityUseCase.class), null, null), (BasicInfoContract) scope3.d(Reflection.a(BasicInfoContract.class), null, null), (PremiumReserveTicketPostBookingActionHandler) scope3.d(Reflection.a(PremiumReserveTicketPostBookingActionHandler.class), null, null), (TimeUtilsContract) scope3.d(Reflection.a(TimeUtilsContract.class), null, null), (GetLatestPremiumReserveTicketFromFirstBookingIdUseCase) scope3.d(Reflection.a(GetLatestPremiumReserveTicketFromFirstBookingIdUseCase.class), null, null), (PremiumBusInAppCommunicationBottomSheetDataUseCase) scope3.d(Reflection.a(PremiumBusInAppCommunicationBottomSheetDataUseCase.class), null, null), (GetActivePremiumReserveTicketBetweenGivenTimeUseCase) scope3.d(Reflection.a(GetActivePremiumReserveTicketBetweenGivenTimeUseCase.class), null, null), (GetPremiumReserveTicketsWithPendingAckUseCase) scope3.d(Reflection.a(GetPremiumReserveTicketsWithPendingAckUseCase.class), null, null), (GetTimeInMillisAfterXTimeUseCase) scope3.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (AcknowledgePremiumReserveTicketCancellationUseCase) scope3.d(Reflection.a(AcknowledgePremiumReserveTicketCancellationUseCase.class), null, null), (UserProfileDetailsProvider) scope3.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (app.chalo.usecase.IsLocationMandatoryForUserUseCase) scope3.d(Reflection.a(app.chalo.usecase.IsLocationMandatoryForUserUseCase.class), null, null), (HomeScreenInfoHelper) scope3.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (ChaloLocationManager) scope3.d(Reflection.a(ChaloLocationManager.class), null, null), (HomeScreenAnalyticsHelper) scope3.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (TitoRideDataManager) scope3.d(Reflection.a(TitoRideDataManager.class), null, null), (CheckIsUnifiedTitoFlowEnabledUseCase) scope3.d(Reflection.a(CheckIsUnifiedTitoFlowEnabledUseCase.class), null, null), (GetActiveTitoTripsAndUpdateRestUseCase) scope3.d(Reflection.a(GetActiveTitoTripsAndUpdateRestUseCase.class), null, null), (ChaloNavigationManager) scope3.d(Reflection.a(ChaloNavigationManager.class), null, null), (PermissionHandlerProvider) scope3.d(Reflection.a(PermissionHandlerProvider.class), null, null), (HomeTabScreensNavigationAndStateManager) scope3.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (LocationPermissionCallbackHandler) scope3.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null), (ProductBookingHelper) scope3.d(Reflection.a(ProductBookingHelper.class), null, null), (GetClusterConfigForCityUseCase) scope3.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null), (HomeTabVisibilityController) parametersHolder3.a(1, Reflection.a(HomeTabVisibilityController.class)), (BottomNavTabType) parametersHolder3.a(2, Reflection.a(BottomNavTabType.class)), (SystemHelper) scope3.d(Reflection.a(SystemHelper.class), null, null), (GpsRequestHandlerProvider) scope3.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (CrashlyticsLogger) scope3.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloAppFeatureHelper) scope3.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (KotlinToastManager) scope3.d(Reflection.a(KotlinToastManager.class), null, null), (ArePermissionsGrantedUseCase) scope3.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (JuspayControllerProvider) scope3.d(Reflection.a(JuspayControllerProvider.class), null, null));
            case 14:
                Scope scope4 = (Scope) obj;
                return new FetchPremiumPassSavingsUseCase((PremiumPassSavingRemoteRepository) scope4.d(i71.k(scope4, "$this$factory", (ParametersHolder) obj2, "it", PremiumPassSavingRemoteRepository.class), null, null), (UserProfileDetailsProvider) scope4.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (PremiumBusDataStoreWrapper) scope4.d(Reflection.a(PremiumBusDataStoreWrapper.class), null, null), (CurrencyFeature) scope4.d(Reflection.a(CurrencyFeature.class), null, null));
            case 15:
                return a(obj, obj2);
            case 16:
                Scope single2 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it12, "it");
                return new PBUserProfileSurveyPreferenceDataStoreImpl((LocalDataStore) single2.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("pb_user_profile_survey_store.preferences_pb")));
            case 17:
                Scope single3 = (Scope) obj;
                ParametersHolder it13 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it13, "it");
                return new PBUserProfileSurveyPreferenceDataStoreImpl((LocalDataStore) single3.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("pb_user_profile_survey_store.preferences_pb")));
            case 18:
                return d(obj, obj2);
            case 19:
                Scope single4 = (Scope) obj;
                ParametersHolder it14 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it14, "it");
                return new NearbyBusMarkerHelper((NearbyBusMarkerIconHelper) single4.d(Reflection.a(NearbyBusMarkerIconHelper.class), null, null));
            case 20:
                return c(obj, obj2);
            case 21:
                return f(obj, obj2);
            case 22:
                return g(obj, obj2);
            case 23:
                return h(obj, obj2);
            case 24:
                return e(obj, obj2);
            case 25:
                return i(obj, obj2);
            case 26:
                return j(obj, obj2);
            case 27:
                return k(obj, obj2);
            case 28:
                return l(obj, obj2);
            default:
                Scope factory11 = (Scope) obj;
                ParametersHolder it15 = (ParametersHolder) obj2;
                Intrinsics.i(factory11, "$this$factory");
                Intrinsics.i(it15, "it");
                Object objB = it15.b(Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.class));
                if (objB == null) {
                    throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.class)) + '\'');
                }
                SuperPassPurchaseArgs.PassengerSelectionArgs passengerSelectionArgs = (SuperPassPurchaseArgs.PassengerSelectionArgs) objB;
                Object objB2 = it15.b(Reflection.a(ComponentContext.class));
                if (objB2 == null) {
                    throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(ComponentContext.class)) + '\'');
                }
                ComponentContext componentContext = (ComponentContext) objB2;
                Object objB3 = it15.b(Reflection.a(SuperPassPassengerSelectionManager.class));
                if (objB3 != null) {
                    return new SuperPassPassengerSelectionViewModel(passengerSelectionArgs, componentContext, (SuperPassPassengerSelectionManager) objB3, (SuperPassRepository) factory11.d(Reflection.a(SuperPassRepository.class), null, null), (AnalyticsContract) factory11.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloNavigationManager) factory11.d(Reflection.a(ChaloNavigationManager.class), null, null), (SmartSuperPassPassengerSelectionHelper) factory11.d(Reflection.a(SmartSuperPassPassengerSelectionHelper.class), null, null), (StringProvider) factory11.d(Reflection.a(StringProvider.class), null, null));
                }
                throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPassengerSelectionManager.class)) + '\'');
        }
    }
}
