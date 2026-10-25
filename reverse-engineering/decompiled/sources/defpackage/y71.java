package defpackage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator;
import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.citydata.domain.FetchNearbyStopsUseCase;
import app.chalo.citydata.domain.FetchStopImagesUseCase;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.ProjectionUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductConfigFetchHelperContract;
import app.chalo.contract.ProductInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.GetTrimmedPolylineUseCase;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.FeedbackFeature;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.home.ChaloChainedBottomSheetFeature;
import app.chalo.home.HomeScreenInfoHelperImpl;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.home.domain.FetchAndStoreProductConfigByIdUseCase;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.home.domain.FetchHistoryScreenConfigDataUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase;
import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.home.domain.ShouldCallWalletSyncApiUseCase;
import app.chalo.home.helper.MandatoryFirstHistoryCallGuardImpl;
import app.chalo.home.helper.NearbyBusMarkerHelper;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMarkerHelper;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.factory.MyTicketsUiStateFactory;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesUiStateFactory;
import app.chalo.home.ui.selectride.SelectRideUiStateFactory;
import app.chalo.home.ui.selectridescreen.SelectRideComponent;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent;
import app.chalo.livetracking.search.StopTripPlannerResultStateManager;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory;
import app.chalo.livetracking.tripplanner.domain.BuildEligibleGroupTicketJourneyModelUseCase;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.universalsearch.domain.CheckIfUserCameFromPremiumBusCampaign;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.metro.domain.FetchAndStoreMetroLiveBookingStatusUseCase;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.PremiumBusAnalyticsHelper;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchAllPremiumReserveTicketsBookedThroughPassUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusTicketsUpdateOptionsUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetProductConfigInfoForPremiumBusProductIfActiveUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTicketForAckDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusVehicleInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase;
import app.chalo.productpurchase.passpurchase.domain.FetchSuperPassCashPaymentInfoUseCase;
import app.chalo.productpurchase.passpurchase.domain.RefreshSelectedBookableSuperPassConfigurationUseCase;
import app.chalo.productpurchase.passpurchase.domain.SubmitSuperPassApplicationUseCase;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmationManager;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.BusesAroundYouArgs;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.SelectRideArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetBookableProductConfigForRenewUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.usecase.HandlePremiumPassRenewFlowUseCase;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.usercommutepreference.domain.AddCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.DeleteCommutePreferenceStopPlaceUseCase;
import app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase;
import app.chalo.usercommutepreference.domain.FetchCommutePreferenceSummaryUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferencePlacesUseCase;
import app.chalo.usercommutepreference.domain.GetCommutePreferenceSavedRidesUseCase;
import app.chalo.usercommutepreference.domain.SaveOrEditRideUseCase;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.PersistedMapMigration;
import app.chalo.utils.ProductUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.ProductValidationCommonUIManagerImpl;
import app.chalo.validation.ProductValidationConfigFactoryImpl;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.workers.WorkerDataStoreWrapper;
import com.arkivanov.decompose.ComponentContext;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20084a;

    public /* synthetic */ y71(int i) {
        this.f20084a = i;
    }

    private final Object a(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(single, "$this$single");
        Intrinsics.i(it, "it");
        return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single), "sos_store_key", null, 4, null)), null, new u71(single, 18), 5, null));
    }

    private final Object c(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new TripPlannerResultsComponent((ComponentContext) factory.d(Reflection.a(ComponentContext.class), null, null), (TripPlannerArgs.ResultsScreen) factory.d(Reflection.a(TripPlannerArgs.ResultsScreen.class), null, null), (MakeTripPlannerCallUseCase) factory.d(Reflection.a(MakeTripPlannerCallUseCase.class), null, null), (TripPlannerItineraryLiveInfoManager) factory.d(Reflection.a(TripPlannerItineraryLiveInfoManager.class), null, null), (BasicInfoContract) factory.d(Reflection.a(BasicInfoContract.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null), (GetTimeInMillisAfterXTimeUseCase) factory.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (TripRecentRepository) factory.d(Reflection.a(TripRecentRepository.class), null, null), (CityProvider) factory.d(Reflection.a(CityProvider.class), null, null), (FormatTimeInMillisToGivenFormatUseCase) factory.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null), (FetchCurrentLocationUseCase) factory.d(Reflection.a(FetchCurrentLocationUseCase.class), null, null), (ProcessTripPlannerItineraryForUiUseCase) factory.d(Reflection.a(ProcessTripPlannerItineraryForUiUseCase.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (CheckIfUserCameFromPremiumBusCampaign) factory.d(Reflection.a(CheckIfUserCameFromPremiumBusCampaign.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) factory.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (GetTripPlannerConfigForCityUseCase) factory.d(Reflection.a(GetTripPlannerConfigForCityUseCase.class), null, null), (LiveTrackingNavigationContract) factory.d(Reflection.a(LiveTrackingNavigationContract.class), null, null), (KotlinToastManager) factory.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (PermissionHandlerProvider) factory.d(Reflection.a(PermissionHandlerProvider.class), null, null), (UniversalSearchResultStateManager) factory.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (LocationPermissionCallbackHandler) factory.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null), (GpsRequestHandlerProvider) factory.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (ChaloLocationManager) factory.d(Reflection.a(ChaloLocationManager.class), null, null), (ProductConfigFetchHelperContract) factory.d(Reflection.a(ProductConfigFetchHelperContract.class), null, null), (ChaloAppFeatureHelper) factory.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
    }

    private final Object d(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new TripPlannerDetailsComponent((ComponentContext) factory.d(Reflection.a(ComponentContext.class), null, null), (TripPlannerArgs.DetailsScreen) factory.d(Reflection.a(TripPlannerArgs.DetailsScreen.class), null, null), (UserProfileDetailsProvider) factory.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloMapMarkerIconProvider) factory.d(Reflection.a(ChaloMapMarkerIconProvider.class), null, null), (CityDataManagerKotlin) factory.d(Reflection.a(CityDataManagerKotlin.class), null, null), (GetTrimmedPolylineUseCase) factory.d(Reflection.a(GetTrimmedPolylineUseCase.class), null, null), (ProcessTripPlannerItineraryForUiUseCase) factory.d(Reflection.a(ProcessTripPlannerItineraryForUiUseCase.class), null, null), (BasicInfoContract) factory.d(Reflection.a(BasicInfoContract.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (TripPlannerItineraryLiveInfoManager) factory.d(Reflection.a(TripPlannerItineraryLiveInfoManager.class), null, null), (ProductInfoContract) factory.d(Reflection.a(ProductInfoContract.class), null, null), (CityProvider) factory.d(Reflection.a(CityProvider.class), null, null), (ArePermissionsGrantedUseCase) factory.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (GetRouteDetailsPayForTicketFlowTypeUseCase) factory.d(Reflection.a(GetRouteDetailsPayForTicketFlowTypeUseCase.class), null, null), (GetInstantTicketFeatureConfigUseCase) factory.d(Reflection.a(GetInstantTicketFeatureConfigUseCase.class), null, null), (BuildEligibleGroupTicketJourneyModelUseCase) factory.d(Reflection.a(BuildEligibleGroupTicketJourneyModelUseCase.class), null, null), (ProductBookingHelper) factory.d(Reflection.a(ProductBookingHelper.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) factory.d(Reflection.a(KotlinToastManager.class), null, null), (LiveTrackingNavigationContract) factory.d(Reflection.a(LiveTrackingNavigationContract.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null), (PolylineUtils) factory.d(Reflection.a(PolylineUtils.class), null, null), (LatLngBoundsUtils) factory.d(Reflection.a(LatLngBoundsUtils.class), null, null));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.f20084a) {
            case 0:
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                Object objB = it.b(Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.class));
                if (objB == null) {
                    throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.class)) + '\'');
                }
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs confirmSuperPassPurchaseArgs = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) objB;
                Object objB2 = it.b(Reflection.a(ComponentContext.class));
                if (objB2 == null) {
                    throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(ComponentContext.class)) + '\'');
                }
                ComponentContext componentContext = (ComponentContext) objB2;
                Object objB3 = it.b(Reflection.a(SuperPassConfirmationManager.class));
                if (objB3 != null) {
                    return new ConfirmSuperPassPurchaseViewModel(confirmSuperPassPurchaseArgs, componentContext, (SuperPassConfirmationManager) objB3, (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (BasicInfoContract) factory.d(Reflection.a(BasicInfoContract.class), null, null), (GetTimeInMillisAfterXTimeUseCase) factory.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null), (CreateSuperPassOrderUseCase) factory.d(Reflection.a(CreateSuperPassOrderUseCase.class), null, null), (SuperPassRepository) factory.d(Reflection.a(SuperPassRepository.class), null, null), (CheckoutResultStateManager) factory.d(Reflection.a(CheckoutResultStateManager.class), null, null), (ResolveProductPurchaseMinProfileDecisionUseCase) factory.d(Reflection.a(ResolveProductPurchaseMinProfileDecisionUseCase.class), null, null), (MinProfileUpdateResultStateManager) factory.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null), (UserProfileDetailsProvider) factory.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CheckIfContinueWithBulkBookingFlowUseCase) factory.d(Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, null), (FetchSuperPassCashPaymentInfoUseCase) factory.d(Reflection.a(FetchSuperPassCashPaymentInfoUseCase.class), null, null), (KotlinToastManager) factory.d(Reflection.a(KotlinToastManager.class), null, null), (CityProvider) factory.d(Reflection.a(CityProvider.class), null, null), (IUserPreferencesDataStore) factory.d(Reflection.a(IUserPreferencesDataStore.class), null, null), (SubmitSuperPassApplicationUseCase) factory.d(Reflection.a(SubmitSuperPassApplicationUseCase.class), null, null), (CurrencyFeature) factory.d(Reflection.a(CurrencyFeature.class), null, null), (GetPremiumPassExpiryEligibilityForPurchaseUseCase) factory.d(Reflection.a(GetPremiumPassExpiryEligibilityForPurchaseUseCase.class), null, null), (FetchBannerUseCase) factory.d(Reflection.a(FetchBannerUseCase.class), null, null), (RefreshSelectedBookableSuperPassConfigurationUseCase) factory.d(Reflection.a(RefreshSelectedBookableSuperPassConfigurationUseCase.class), null, null), (MinProfileAnalyticsHelper) factory.d(Reflection.a(MinProfileAnalyticsHelper.class), null, null), (ProductPurchaseMinProfileDecisionHelper) factory.d(Reflection.a(ProductPurchaseMinProfileDecisionHelper.class), null, null));
                }
                throw new DefinitionParameterException("No value found for type '" + KClassExtKt.a(Reflection.a(SuperPassConfirmationManager.class)) + '\'');
            case 1:
                Scope factory2 = (Scope) obj;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new ProductValidationCommonUIManagerImpl((DataStore) factory2.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb")));
            case 2:
                Scope factory3 = (Scope) obj;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new ProductValidationConfigFactoryImpl(new u71(factory3, 13), new u71(factory3, 6), new u71(factory3, 7), new u71(factory3, 8), new u71(factory3, 9), new u71(factory3, 10), new u71(factory3, 11), new u71(factory3, 12));
            case 3:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new BusesAroundYouComponent((ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (BusesAroundYouArgs) parametersHolder.a(1, Reflection.a(BusesAroundYouArgs.class)), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null), (LocationPermissionCallbackHandler) scope.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (PermissionHandlerProvider) scope.d(Reflection.a(PermissionHandlerProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (NetworkStateManager) scope.d(Reflection.a(NetworkStateManager.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (GeoSpatialLiveBusesDataPollingManager) scope.d(Reflection.a(GeoSpatialLiveBusesDataPollingManager.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (IsCityRouteNamesDisabledUseCase) scope.d(Reflection.a(IsCityRouteNamesDisabledUseCase.class), null, null), (NearbyBusMarkerHelper) scope.d(Reflection.a(NearbyBusMarkerHelper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetGeoQueryCityWiseConfigUseCase) scope.d(Reflection.a(GetGeoQueryCityWiseConfigUseCase.class), null, null), (CheckIsTripNotStaleUseCase) scope.d(Reflection.a(CheckIsTripNotStaleUseCase.class), null, null), (GpsRequestHandlerProvider) scope.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (ProjectionUtils) scope.d(Reflection.a(ProjectionUtils.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            case 4:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new NearbyStopsMapComponent((ComponentContext) parametersHolder2.a(0, i71.k(scope2, "$this$factory", parametersHolder2, "<destruct>", ComponentContext.class)), (NearbyStopsMapArgs) parametersHolder2.a(1, Reflection.a(NearbyStopsMapArgs.class)), (ChaloLocationManager) scope2.d(Reflection.a(ChaloLocationManager.class), null, null), (CityProvider) scope2.d(Reflection.a(CityProvider.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (ArePermissionsGrantedUseCase) scope2.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (NearbyTripsDataManagerBase) scope2.d(Reflection.a(NearbyTripsDataManagerBase.class), null, null), (BasicInfoContract) scope2.d(Reflection.a(BasicInfoContract.class), null, null), (GetEstimatedTimeUseCase) scope2.d(Reflection.a(GetEstimatedTimeUseCase.class), null, null), (StopTripDetailsAnalyticsEventHelper) scope2.d(Reflection.a(StopTripDetailsAnalyticsEventHelper.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope2.d(Reflection.a(KotlinToastManager.class), null, null), (SystemHelper) scope2.d(Reflection.a(SystemHelper.class), null, null), (TimeUtilsContract) scope2.d(Reflection.a(TimeUtilsContract.class), null, null), (ProjectionUtils) scope2.d(Reflection.a(ProjectionUtils.class), null, null), (PermissionHandlerProvider) scope2.d(Reflection.a(PermissionHandlerProvider.class), null, null), (UniversalSearchResultStateManager) scope2.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (LocationPermissionCallbackHandler) scope2.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null), (GpsRequestHandlerProvider) scope2.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (CrashlyticsLogger) scope2.d(Reflection.a(CrashlyticsLogger.class), null, null), (NearbyStopsMarkerHelper) scope2.d(Reflection.a(NearbyStopsMarkerHelper.class), null, null), (LatLngBoundsUtils) scope2.d(Reflection.a(LatLngBoundsUtils.class), null, null));
            case 5:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                return new MyTicketsComponent((ComponentContext) parametersHolder3.a(0, i71.k(scope3, "$this$factory", parametersHolder3, "<destruct>", ComponentContext.class)), (BasicInfoContract) scope3.d(Reflection.a(BasicInfoContract.class), null, null), (GetAllRequestedBookedProductsUseCase) scope3.d(Reflection.a(GetAllRequestedBookedProductsUseCase.class), null, null), (CityProvider) scope3.d(Reflection.a(CityProvider.class), null, null), (HomeScreenInfoHelper) scope3.d(Reflection.a(HomeScreenInfoHelper.class), null, null), (TimeUtilsContract) scope3.d(Reflection.a(TimeUtilsContract.class), null, null), (GetTimeInMillisAfterXTimeUseCase) scope3.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (GetActivePremiumReserveTicketBetweenGivenTimeUseCase) scope3.d(Reflection.a(GetActivePremiumReserveTicketBetweenGivenTimeUseCase.class), null, null), (StringProvider) scope3.d(Reflection.a(StringProvider.class), null, null), (AutoLinkDeviceIdUseCase) scope3.d(Reflection.a(AutoLinkDeviceIdUseCase.class), null, null), (UserProfileDetailsProvider) scope3.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ChaloConfigFeature) scope3.d(Reflection.a(ChaloConfigFeature.class), null, null), (DoesUserHaveProductsOnMultipleDeviceUseCase) scope3.d(Reflection.a(DoesUserHaveProductsOnMultipleDeviceUseCase.class), null, null), (InitiateProductHistorySyncCallUseCase) scope3.d(Reflection.a(InitiateProductHistorySyncCallUseCase.class), null, null), (RunPreActivationChecksUseCase) scope3.d(Reflection.a(RunPreActivationChecksUseCase.class), null, null), (ActivateProductIfRequiredUseCase) scope3.d(Reflection.a(ActivateProductIfRequiredUseCase.class), null, null), (GetValidationProcessFlowDetailsForValidationProductUseCase) scope3.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductUseCase.class), null, null), (GetBookableProductConfigForRenewUseCase) scope3.d(Reflection.a(GetBookableProductConfigForRenewUseCase.class), null, null), (ChaloTimeProvider) scope3.d(Reflection.a(ChaloTimeProvider.class), null, null), (GetProductConfigInfoForPremiumBusProductIfActiveUseCase) scope3.d(Reflection.a(GetProductConfigInfoForPremiumBusProductIfActiveUseCase.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope3.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (HomeScreenAnalyticsHelper) scope3.d(Reflection.a(HomeScreenAnalyticsHelper.class), null, null), (CheckIfContinueWithBulkBookingFlowUseCase) scope3.d(Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, null), (FetchHistoryScreenConfigDataUseCase) scope3.d(Reflection.a(FetchHistoryScreenConfigDataUseCase.class), null, null), (GetActiveTitoTripsAndUpdateRestUseCase) scope3.d(Reflection.a(GetActiveTitoTripsAndUpdateRestUseCase.class), null, null), (CoroutineContextProvider) scope3.d(Reflection.a(CoroutineContextProvider.class), null, null), (IsNotificationPermissionGrantedUseCase) scope3.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null), (MyTicketsUiStateFactory) scope3.d(Reflection.a(MyTicketsUiStateFactory.class), null, null), (FetchAndStoreProductConfigByIdUseCase) scope3.d(Reflection.a(FetchAndStoreProductConfigByIdUseCase.class), null, null), (GetNextStepOnPassApplicationVerifiedUseCase) scope3.d(Reflection.a(GetNextStepOnPassApplicationVerifiedUseCase.class), null, null), (GetNextStepOnPassApplicationRejectedUseCase) scope3.d(Reflection.a(GetNextStepOnPassApplicationRejectedUseCase.class), null, null), (BookingHelper) scope3.d(Reflection.a(BookingHelper.class), null, null), (KotlinToastManager) scope3.d(Reflection.a(KotlinToastManager.class), null, null), (PermissionHandlerProvider) scope3.d(Reflection.a(PermissionHandlerProvider.class), null, null), (ChaloNavigationManager) scope3.d(Reflection.a(ChaloNavigationManager.class), null, null), (HomeTabScreensNavigationAndStateManager) scope3.d(Reflection.a(HomeTabScreensNavigationAndStateManager.class), null, null), (IReportProblemFeature) scope3.d(Reflection.a(IReportProblemFeature.class), null, null), (SystemHelper) scope3.d(Reflection.a(SystemHelper.class), null, null), (ValidationSceneResolverUseCase) scope3.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null), (FetchAndStoreMetroLiveBookingStatusUseCase) scope3.d(Reflection.a(FetchAndStoreMetroLiveBookingStatusUseCase.class), null, null), (HomeTabVisibilityController) parametersHolder3.a(1, Reflection.a(HomeTabVisibilityController.class)), (BottomNavTabType) parametersHolder3.a(2, Reflection.a(BottomNavTabType.class)), (MTicketUtilsHelper) scope3.d(Reflection.a(MTicketUtilsHelper.class), null, null), (ApplicationForegroundManager) scope3.d(Reflection.a(ApplicationForegroundManager.class), null, null));
            case 6:
                Scope single = (Scope) obj;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new WorkerDataStoreWrapper((LocalDataStore) single.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("keyWorkerStore.preferences_pb")));
            case 7:
                Scope single2 = (Scope) obj;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore((DataStore) single2.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb")));
            case 8:
                Scope factory4 = (Scope) obj;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new HandlePremiumPassRenewFlowUseCase((FetchCompleteProductConfigByIdUseCase) factory4.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null), (StoreCompleteProductConfigLocallyUseCase) factory4.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null), (ChaloNavigationManager) factory4.d(Reflection.a(ChaloNavigationManager.class), null, null), (ProductBookingNavigationManager) factory4.d(Reflection.a(ProductBookingNavigationManager.class), null, null), (BasicInfoContract) factory4.d(Reflection.a(BasicInfoContract.class), null, null), (KotlinToastManager) factory4.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) factory4.d(Reflection.a(StringProvider.class), null, null));
            case 9:
                Scope scope4 = (Scope) obj;
                return new PremiumReserveTicketPostBookingActionHandlerImpl((CoroutineContextProvider) scope4.d(i71.k(scope4, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope4.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (BasicInfoContract) scope4.d(Reflection.a(BasicInfoContract.class), null, null), (StringProvider) scope4.d(Reflection.a(StringProvider.class), null, null), (FetchPremiumBusTripDetailsAndLiveEtaUseCase) scope4.d(Reflection.a(FetchPremiumBusTripDetailsAndLiveEtaUseCase.class), null, null), (ProcessPremiumBusTripTimeInfoUseCase) scope4.d(Reflection.a(ProcessPremiumBusTripTimeInfoUseCase.class), null, null), (ProcessPremiumBusVehicleInfoUseCase) scope4.d(Reflection.a(ProcessPremiumBusVehicleInfoUseCase.class), null, null), (ProcessPremiumBusTicketForAckDataUseCase) scope4.d(Reflection.a(ProcessPremiumBusTicketForAckDataUseCase.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope4.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (GetRegularBusProductValidationMethodUseCase) scope4.d(Reflection.a(GetRegularBusProductValidationMethodUseCase.class), null, null), (IsBluetoothFeatureAvailableUseCase) scope4.d(Reflection.a(IsBluetoothFeatureAvailableUseCase.class), null, null), (FetchPremiumBusTicketsUpdateOptionsUseCase) scope4.d(Reflection.a(FetchPremiumBusTicketsUpdateOptionsUseCase.class), null, null), (AcknowledgePremiumReserveTicketCancellationUseCase) scope4.d(Reflection.a(AcknowledgePremiumReserveTicketCancellationUseCase.class), null, null), (GetLatestPremiumReserveTicketFromFirstBookingIdUseCase) scope4.d(Reflection.a(GetLatestPremiumReserveTicketFromFirstBookingIdUseCase.class), null, null), (TimeUtilsContract) scope4.d(Reflection.a(TimeUtilsContract.class), null, null), (CheckLiveBusDelayedUseCase) scope4.d(Reflection.a(CheckLiveBusDelayedUseCase.class), null, null), (ChaloMapMarkerIconProvider) scope4.d(Reflection.a(ChaloMapMarkerIconProvider.class), null, null), (GetTrimmedPolylineUseCase) scope4.d(Reflection.a(GetTrimmedPolylineUseCase.class), null, null), (ChaloLocationManager) scope4.d(Reflection.a(ChaloLocationManager.class), null, null), (CityProvider) scope4.d(Reflection.a(CityProvider.class), null, null), (GetTodayOrTomorrowOrDateUseCase) scope4.d(Reflection.a(GetTodayOrTomorrowOrDateUseCase.class), null, null), (ArePermissionsGrantedUseCase) scope4.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (PremiumBusAnalyticsHelper) scope4.d(Reflection.a(PremiumBusAnalyticsHelper.class), null, null), (FetchStopImagesUseCase) scope4.d(Reflection.a(FetchStopImagesUseCase.class), null, null), (RouteTrackingDataProvider) scope4.d(Reflection.a(RouteTrackingDataProvider.class), null, null), (PremiumBusRepository) scope4.d(Reflection.a(PremiumBusRepository.class), null, null), (ChaloMapMarkerInfoWindowProvider) scope4.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null), (PolylineUtils) scope4.d(Reflection.a(PolylineUtils.class), null, null), (LatLngBoundsUtils) scope4.d(Reflection.a(LatLngBoundsUtils.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope4.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (ShouldShowRescheduleAckForTicketUseCase) scope4.d(Reflection.a(ShouldShowRescheduleAckForTicketUseCase.class), null, null), (PremiumBusInAppCommunicationBottomSheetDataUseCase) scope4.d(Reflection.a(PremiumBusInAppCommunicationBottomSheetDataUseCase.class), null, null), (SystemHelper) scope4.d(Reflection.a(SystemHelper.class), null, null), (UserProfileDetailsProvider) scope4.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (PremiumBusDataStoreWrapper) scope4.d(Reflection.a(PremiumBusDataStoreWrapper.class), null, null), (RecordPendingFeedbackUseCase) scope4.d(Reflection.a(RecordPendingFeedbackUseCase.class), null, null));
            case 10:
                Scope factory5 = (Scope) obj;
                Intrinsics.i(factory5, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new GetProductConfigFromProductIdUseCase((LocalDataStore) factory5.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (FetchCompleteProductConfigByIdUseCase) factory5.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null));
            case 11:
                Scope scope5 = (Scope) obj;
                return new MTicketUtilsHelper((FeedbackFeature) scope5.d(i71.k(scope5, "$this$factory", (ParametersHolder) obj2, "it", FeedbackFeature.class), null, null), (BasicInfoContract) scope5.d(Reflection.a(BasicInfoContract.class), null, null), (CurrencyFeature) scope5.d(Reflection.a(CurrencyFeature.class), null, null), (CityProvider) scope5.d(Reflection.a(CityProvider.class), null, null), (UserProfileDetailsProvider) scope5.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TicketRepository) scope5.d(Reflection.a(TicketRepository.class), null, null), (GetProductConfigFromProductIdUseCase) scope5.d(Reflection.a(GetProductConfigFromProductIdUseCase.class), null, null), (CrashlyticsLogger) scope5.d(Reflection.a(CrashlyticsLogger.class), null, null), (LocalDataStore) scope5.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")));
            case 12:
                Scope single3 = (Scope) obj;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new MandatoryFirstHistoryCallGuardImpl(new LocalDataStore((DataStore) single3.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (UserProfileDetailsProvider) single3.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ProductUtils) single3.d(Reflection.a(ProductUtils.class), null, null), (CityProvider) single3.d(Reflection.a(CityProvider.class), null, null), (AnalyticsContract) single3.d(Reflection.a(AnalyticsContract.class), null, null));
            case 13:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                return new AppMigrationPreconditionsComponent((AppMigrationPreconditionsArgs) parametersHolder4.a(1, Reflection.a(AppMigrationPreconditionsArgs.class)), (ComponentContext) parametersHolder4.a(0, i71.k(scope6, "$this$factory", parametersHolder4, "<destruct>", ComponentContext.class)), (MigrationFlowOrchestrator) scope6.d(Reflection.a(MigrationFlowOrchestrator.class), null, null), (MandatoryFirstHistoryCallGuard) scope6.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null), (ChaloNavigationManager) scope6.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope6.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) scope6.d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) scope6.d(Reflection.a(SystemHelper.class), null, null), (UserConsentResultStateManager) scope6.d(Reflection.a(UserConsentResultStateManager.class), null, null));
            case 14:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                return new SelectRideComponent((ComponentContext) parametersHolder5.a(0, i71.k(scope7, "$this$factory", parametersHolder5, "<destruct>", ComponentContext.class)), (SelectRideArgs) parametersHolder5.a(1, Reflection.a(SelectRideArgs.class)), (ChaloNavigationManager) scope7.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope7.d(Reflection.a(StringProvider.class), null, null), (UniversalSearchResultStateManager) scope7.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (SaveOrEditRideUseCase) scope7.d(Reflection.a(SaveOrEditRideUseCase.class), null, null), (SelectRideUiStateFactory) scope7.d(Reflection.a(SelectRideUiStateFactory.class), null, null), (TimeUtilsContract) scope7.d(Reflection.a(TimeUtilsContract.class), null, null), (KotlinToastManager) scope7.d(Reflection.a(KotlinToastManager.class), null, null), (SystemHelper) scope7.d(Reflection.a(SystemHelper.class), null, null), (CityProvider) scope7.d(Reflection.a(CityProvider.class), null, null));
            case 15:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                ComponentContext componentContext2 = (ComponentContext) parametersHolder6.a(0, i71.k(scope8, "$this$factory", parametersHolder6, "<destruct>", ComponentContext.class));
                return new SavedPlacesAndRidesComponent(componentContext2, (FetchCommutePreferenceSummaryUseCase) scope8.d(Reflection.a(FetchCommutePreferenceSummaryUseCase.class), null, null), (GetCommutePreferencePlacesUseCase) scope8.d(Reflection.a(GetCommutePreferencePlacesUseCase.class), null, null), (GetCommutePreferenceSavedRidesUseCase) scope8.d(Reflection.a(GetCommutePreferenceSavedRidesUseCase.class), null, null), (DeleteCommutePreferenceStopPlaceUseCase) scope8.d(Reflection.a(DeleteCommutePreferenceStopPlaceUseCase.class), null, null), (DeleteSavedRideUseCase) scope8.d(Reflection.a(DeleteSavedRideUseCase.class), null, null), (ChaloNavigationManager) scope8.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope8.d(Reflection.a(StringProvider.class), null, null), (UniversalSearchResultStateManager) scope8.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (AddCommutePreferenceStopPlaceUseCase) scope8.d(Reflection.a(AddCommutePreferenceStopPlaceUseCase.class), null, null), (SavedPlacesAndRidesUiStateFactory) scope8.d(Reflection.a(SavedPlacesAndRidesUiStateFactory.class), null, null), (KotlinToastManager) scope8.d(Reflection.a(KotlinToastManager.class), null, null), (AnalyticsContract) scope8.d(Reflection.a(AnalyticsContract.class), null, null));
            case 16:
                Scope single4 = (Scope) obj;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new HomeScreenInfoHelperImpl((CityProvider) single4.d(Reflection.a(CityProvider.class), null, null), (InitiateProductHistorySyncCallUseCase) single4.d(Reflection.a(InitiateProductHistorySyncCallUseCase.class), null, null), (ShouldCallWalletSyncApiUseCase) single4.d(Reflection.a(ShouldCallWalletSyncApiUseCase.class), null, null), (WalletSyncOrchestrator) single4.d(Reflection.a(WalletSyncOrchestrator.class), null, null), (CoroutineContextProvider) single4.d(Reflection.a(CoroutineContextProvider.class), null, null), (SystemHelper) single4.d(Reflection.a(SystemHelper.class), null, null), (ProductUtils) single4.d(Reflection.a(ProductUtils.class), null, null), (ChaloChainedBottomSheetFeature) single4.d(Reflection.a(ChaloChainedBottomSheetFeature.class), null, null), (CheckIsUserLoggedInUseCase) single4.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), new LocalDataStore((DataStore) single4.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))));
            case 17:
                Scope scope9 = (Scope) obj;
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                return new PbBulkBookingRideDetailsComponent((ComponentContext) parametersHolder7.a(0, i71.k(scope9, "$this$factory", parametersHolder7, "<destruct>", ComponentContext.class)), (PbBulkBookingRideDetailsArgs) parametersHolder7.a(1, Reflection.a(PbBulkBookingRideDetailsArgs.class)), (GetTimeInMillisAfterXTimeUseCase) scope9.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (BasicInfoContract) scope9.d(Reflection.a(BasicInfoContract.class), null, null), (TimeUtilsContract) scope9.d(Reflection.a(TimeUtilsContract.class), null, null), (GetTodayOrTomorrowOrDateUseCase) scope9.d(Reflection.a(GetTodayOrTomorrowOrDateUseCase.class), null, null), (FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase) scope9.d(Reflection.a(FetchFailedAndUnderProcessBookingsAndUpdateAllBookingsInDBUseCase.class), null, null), (FormatTimeInMillisToGivenFormatUseCase) scope9.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null), (SuperPassRepository) scope9.d(Reflection.a(SuperPassRepository.class), null, null), (StringProvider) scope9.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) scope9.d(Reflection.a(AnalyticsContract.class), null, null), (CoroutineContextProvider) scope9.d(Reflection.a(CoroutineContextProvider.class), null, null), (FetchAllPremiumReserveTicketsBookedThroughPassUseCase) scope9.d(Reflection.a(FetchAllPremiumReserveTicketsBookedThroughPassUseCase.class), null, null), (GetProductConfigInfoForPremiumBusProductIfActiveUseCase) scope9.d(Reflection.a(GetProductConfigInfoForPremiumBusProductIfActiveUseCase.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope9.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (KotlinToastManager) scope9.d(Reflection.a(KotlinToastManager.class), null, null), (SystemHelper) scope9.d(Reflection.a(SystemHelper.class), null, null), (ChaloNavigationManager) scope9.d(Reflection.a(ChaloNavigationManager.class), null, null), (CheckIfContinueWithBulkBookingFlowUseCase) scope9.d(Reflection.a(CheckIfContinueWithBulkBookingFlowUseCase.class), null, null), (ChaloTimeProvider) scope9.d(Reflection.a(ChaloTimeProvider.class), null, null), (UpdatePassStartDateChangesUseCase) scope9.d(Reflection.a(UpdatePassStartDateChangesUseCase.class), null, null), (FetchCompleteProductConfigByIdUseCase) scope9.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope9.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (HandlePremiumPassRenewFlowUseCase) scope9.d(Reflection.a(HandlePremiumPassRenewFlowUseCase.class), null, null));
            case 18:
                Scope single5 = (Scope) obj;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single5, 21), 7, null));
            case 19:
                Scope single6 = (Scope) obj;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single6), "isTermsAndConditionSeenKey", null, 4, null)), null, new u71(single6, 14), 5, null));
            case 20:
                Scope single7 = (Scope) obj;
                Intrinsics.i(single7, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single7, 22), 7, null));
            case 21:
                Scope single8 = (Scope) obj;
                Intrinsics.i(single8, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.S(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single8), "city_store", null, 4, null), SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single8), "new_city_store", null, 4, null)), null, new u71(single8, 17), 5, null);
            case 22:
                Scope single9 = (Scope) obj;
                Intrinsics.i(single9, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single9), "pass_status_store", null, 4, null)), null, new u71(single9, 19), 5, null);
            case 23:
                Scope single10 = (Scope) obj;
                Intrinsics.i(single10, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new PersistedMapMigration(EmptySet.f17559a, ModuleExtKt.a(single10), "superPassActivationTimestampsMap", "superPassActivationTimestamps_map")), null, new u71(single10, 15), 5, null));
            case 24:
                Scope single11 = (Scope) obj;
                Intrinsics.i(single11, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single11, 20), 7, null));
            case 25:
                Scope single12 = (Scope) obj;
                Intrinsics.i(single12, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single12, 16), 7, null));
            case 26:
                return a(obj, obj2);
            case 27:
                return c(obj, obj2);
            case 28:
                return d(obj, obj2);
            default:
                Scope factory6 = (Scope) obj;
                Intrinsics.i(factory6, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new StopBasedTripPlannerSearchComponent((ComponentContext) factory6.d(Reflection.a(ComponentContext.class), null, null), (TripPlannerArgs.StopFocusedSearchScreen) factory6.d(Reflection.a(TripPlannerArgs.StopFocusedSearchScreen.class), null, null), (CityProvider) factory6.d(Reflection.a(CityProvider.class), null, null), (StringProvider) factory6.d(Reflection.a(StringProvider.class), null, null), (RecentRepositoryProvider) factory6.d(Reflection.a(RecentRepositoryProvider.class), null, null), (StopBasedTripPlannerSearchUiStateFactory) factory6.d(Reflection.a(StopBasedTripPlannerSearchUiStateFactory.class), null, null), (AnalyticsContract) factory6.d(Reflection.a(AnalyticsContract.class), null, null), (BasicInfoContract) factory6.d(Reflection.a(BasicInfoContract.class), null, null), (FetchNearbyStopsUseCase) factory6.d(Reflection.a(FetchNearbyStopsUseCase.class), null, null), (StopTripPlannerResultStateManager) factory6.d(Reflection.a(StopTripPlannerResultStateManager.class), null, null), (UniversalSearchResultStateManager) factory6.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (ChaloNavigationManager) factory6.d(Reflection.a(ChaloNavigationManager.class), null, null));
        }
    }
}
