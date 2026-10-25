package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.Device;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.citydata.domain.FetchNearbyStopsUseCase;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.GetCachedRouteUseCase;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.contract.AppUsageTrackingContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.GetSupportedChaloCountryListUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.domain.ValidatePhoneNumberUseCase;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.fcmtoken.FcmTokenFeatureImpl;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.features.freshchat.FreshChatInitializer;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.thoughtnudge.ThoughtNudgeContractImpl;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.helper.UnsyncedActivationsSyncHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStoreImpl;
import app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.RouteDetailsHelper;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteAvailabilityBannerStoreImpl;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStoreImpl;
import app.chalo.livetracking.routedetails.domain.CheckIfCheckinCanBePerformedUseCase;
import app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData;
import app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromTimeTable;
import app.chalo.livetracking.routedetails.domain.GetLivePassengerDetailsBottomSheetDetailsUseCase;
import app.chalo.livetracking.routedetails.domain.GetNearestStopToCurrentLocationUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsOptionsMenuListUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteTimeTableUiModelUseCase;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.search.StopTripPlannerResultStateManager;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory;
import app.chalo.livetracking.tripplanner.domain.GetSeatAvailabilityModeKey;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerWithBusArrivalCallUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.login.UserCountryPhoneNumberConfigProvider;
import app.chalo.login.domain.FetchLoginAfterCitySelectionConfigUseCase;
import app.chalo.login.domain.GenerateUidForTruecallerLoginUseCase;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.login.domain.SendOtpForLoginUseCase;
import app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
import app.chalo.login.domain.ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase;
import app.chalo.login.domain.VerifyLoginSuccessOnServerAndHandleTokensUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandlerProvider;
import app.chalo.login.truecaller.TruecallerSetupHandlerProvider;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStoreImpl;
import app.chalo.network.ChaloAuthSecureManager;
import app.chalo.network.CommonHeaderProvider;
import app.chalo.network.HttpClientHelper;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.NetworkConfig;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.network.mock.ApiSourceState;
import app.chalo.network.mock.EmptyMockApiRouteVariantState;
import app.chalo.network.mock.FixedApiSourceState;
import app.chalo.network.mock.LocalOverrideMockApiRuntimeState;
import app.chalo.network.mock.MockApiLocalOverrideResolver;
import app.chalo.network.mock.MockApiRouteVariantState;
import app.chalo.network.mock.MockApiRuntimeLogger;
import app.chalo.network.mock.MockApiRuntimeOverride;
import app.chalo.network.rest.ChaloRestClient;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.onboarding.splash.orchestrator.AndroidSplashOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashOperations;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.domain.CreateQuickPayOrderUsecase;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import io.ktor.client.engine.HttpClientEngine;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b81 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11176a;

    public /* synthetic */ b81(int i) {
        this.f11176a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11176a) {
            case 0:
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new StopTripPlannerResultsComponent((ComponentContext) factory.d(Reflection.a(ComponentContext.class), null, null), (TripPlannerArgs.StopFocusedResultsScreen) factory.d(Reflection.a(TripPlannerArgs.StopFocusedResultsScreen.class), null, null), (MakeTripPlannerCallUseCase) factory.d(Reflection.a(MakeTripPlannerCallUseCase.class), null, null), (MakeTripPlannerWithBusArrivalCallUseCase) factory.d(Reflection.a(MakeTripPlannerWithBusArrivalCallUseCase.class), null, null), (TripPlannerItineraryLiveInfoManager) factory.d(Reflection.a(TripPlannerItineraryLiveInfoManager.class), null, null), (BasicInfoContract) factory.d(Reflection.a(BasicInfoContract.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (StopTripPlannerResultStateManager) factory.d(Reflection.a(StopTripPlannerResultStateManager.class), null, null), (StopTripPlannerResultUiStateFactory) factory.d(Reflection.a(StopTripPlannerResultUiStateFactory.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null), (FetchNearbyStopsUseCase) factory.d(Reflection.a(FetchNearbyStopsUseCase.class), null, null));
            case 1:
                Scope factory2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it2, "it");
                return new LiveTrackingConfigDataStoreImpl((DataStore) factory2.d(Reflection.a(DataStore.class), null, new StringQualifier("livetracking_config.preferences_pb")), (GetSeatAvailabilityModeKey) factory2.d(Reflection.a(GetSeatAvailabilityModeKey.class), null, null));
            case 2:
                Scope single = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it3, "it");
                return new RouteAvailabilityBannerStoreImpl(new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("routeAvailabilityBanner.preferences_pb"))));
            case 3:
                Scope single2 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it4, "it");
                return new RouteDetailsLocalDataStoreImpl(new LocalDataStore((DataStore) single2.d(Reflection.a(DataStore.class), null, new StringQualifier("keyRouteDetails.preferences_pb"))), (RecentRepositoryProvider) single2.d(Reflection.a(RecentRepositoryProvider.class), null, null), (CityProvider) single2.d(Reflection.a(CityProvider.class), null, null));
            case 4:
                Scope scope = (Scope) obj;
                return new RouteDetailsComponent((ComponentContext) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null), (RouteDetailsArgs) scope.d(Reflection.a(RouteDetailsArgs.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (GetCachedRouteUseCase) scope.d(Reflection.a(GetCachedRouteUseCase.class), null, null), (FetchRouteDataFromRemoteUseCase) scope.d(Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, null), (GetRouteDetailsOptionsMenuListUseCase) scope.d(Reflection.a(GetRouteDetailsOptionsMenuListUseCase.class), null, null), (GetNearestStopToCurrentLocationUseCase) scope.d(Reflection.a(GetNearestStopToCurrentLocationUseCase.class), null, null), (GetEtaUiModelForStopFromRtsData) scope.d(Reflection.a(GetEtaUiModelForStopFromRtsData.class), null, null), (GetEtaUiModelForStopFromTimeTable) scope.d(Reflection.a(GetEtaUiModelForStopFromTimeTable.class), null, null), (CheckIfCheckinCanBePerformedUseCase) scope.d(Reflection.a(CheckIfCheckinCanBePerformedUseCase.class), null, null), (GetRouteDetailsPayForTicketFlowTypeUseCase) scope.d(Reflection.a(GetRouteDetailsPayForTicketFlowTypeUseCase.class), null, null), (LiveTrackingDataManager) scope.d(Reflection.a(LiveTrackingDataManager.class), null, null), (GetDelayedEtaThresholdForLiveTrackingUseCase) scope.d(Reflection.a(GetDelayedEtaThresholdForLiveTrackingUseCase.class), null, null), (GetRouteTimeTableUiModelUseCase) scope.d(Reflection.a(GetRouteTimeTableUiModelUseCase.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (RouteDetailsHelper) scope.d(Reflection.a(RouteDetailsHelper.class), null, null), (GetLivePassengerDetailsBottomSheetDetailsUseCase) scope.d(Reflection.a(GetLivePassengerDetailsBottomSheetDetailsUseCase.class), null, null), (RouteDetailsAnalyticsHelper) scope.d(Reflection.a(RouteDetailsAnalyticsHelper.class), null, null), (AdTargetingProvider) scope.d(Reflection.a(AdTargetingProvider.class), null, null), (LiveTrackingConfigDataStore) scope.d(Reflection.a(LiveTrackingConfigDataStore.class), null, null), (IsAgencyTagVisibleUseCase) scope.d(Reflection.a(IsAgencyTagVisibleUseCase.class), null, null), (ChaloLocationManager) scope.d(Reflection.a(ChaloLocationManager.class), null, null), (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (RouteDetailsLocalDataStore) scope.d(Reflection.a(RouteDetailsLocalDataStore.class), null, null), (IsCityRouteNamesDisabledUseCase) scope.d(Reflection.a(IsCityRouteNamesDisabledUseCase.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (RouteMapLiveVehicleIconHelper) scope.d(Reflection.a(RouteMapLiveVehicleIconHelper.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (ChaloMapMarkerInfoWindowProvider) scope.d(Reflection.a(ChaloMapMarkerInfoWindowProvider.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (LatLngBoundsUtils) scope.d(Reflection.a(LatLngBoundsUtils.class), null, null), (PolylineUtils) scope.d(Reflection.a(PolylineUtils.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (LiveTrackingNavigationContract) scope.d(Reflection.a(LiveTrackingNavigationContract.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (RouteDetailsUIStateFactory) scope.d(Reflection.a(RouteDetailsUIStateFactory.class), null, null), (TicketPurchaseSceneResolverUseCase) scope.d(Reflection.a(TicketPurchaseSceneResolverUseCase.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (UrlOpenHelper) scope.d(Reflection.a(UrlOpenHelper.class), null, null), (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
            case 5:
                Scope single3 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it5, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single3, 25), 7, null);
            case 6:
                Scope single4 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it6, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single4, 24), 7, null);
            case 7:
                Scope single5 = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i(it7, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single5, 23), 7, null);
            case 8:
                Scope factory3 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it8, "it");
                return new UserProfileAndAuthStoreManagerImpl((DataStore) factory3.d(Reflection.a(DataStore.class), null, new StringQualifier("user_details_datastore.preferences_pb")));
            case 9:
                Scope single6 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i(it9, "it");
                return new UserProfilingHooksRuleEngineDataStoreImpl((DataStore) single6.d(Reflection.a(DataStore.class), null, new StringQualifier("user_profiling_rule_engine.preferences_pb")), new LocalDataStore((DataStore) single6.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))));
            case 10:
                Scope factory4 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it10, "it");
                return new LoginOptionsComponent((ComponentContext) factory4.d(Reflection.a(ComponentContext.class), null, null), (LoginOptionsArgs) factory4.d(Reflection.a(LoginOptionsArgs.class), null, null), (TruecallerSetupHandlerProvider) factory4.d(Reflection.a(TruecallerSetupHandlerProvider.class), null, null), (GenerateUidForTruecallerLoginUseCase) factory4.d(Reflection.a(GenerateUidForTruecallerLoginUseCase.class), null, null), (ValidatePhoneNumberUseCase) factory4.d(Reflection.a(ValidatePhoneNumberUseCase.class), null, null), (SendOtpForLoginUseCase) factory4.d(Reflection.a(SendOtpForLoginUseCase.class), null, null), (VerifyLoginSuccessOnServerAndHandleTokensUseCase) factory4.d(Reflection.a(VerifyLoginSuccessOnServerAndHandleTokensUseCase.class), null, null), (ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase) factory4.d(Reflection.a(ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase.class), null, null), (StringProvider) factory4.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) factory4.d(Reflection.a(AnalyticsContract.class), null, null), (SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase) factory4.d(Reflection.a(SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase.class), null, null), (FetchLoginAfterCitySelectionConfigUseCase) factory4.d(Reflection.a(FetchLoginAfterCitySelectionConfigUseCase.class), null, null), (KotlinToastManager) factory4.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) factory4.d(Reflection.a(ChaloNavigationManager.class), null, null), (GetSupportedChaloCountryListUseCase) factory4.d(Reflection.a(GetSupportedChaloCountryListUseCase.class), null, null), (CityProvider) factory4.d(Reflection.a(CityProvider.class), null, null), (UserProfileDetailsProvider) factory4.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (PhoneNumberHintHandlerProvider) factory4.d(Reflection.a(PhoneNumberHintHandlerProvider.class), null, null), (UserCountryPhoneNumberConfigProvider) factory4.d(Reflection.a(UserCountryPhoneNumberConfigProvider.class), null, null), (AdjustManager) factory4.d(Reflection.a(AdjustManager.class), null, null), (DpdpaConsentManager) factory4.d(Reflection.a(DpdpaConsentManager.class), null, null), (UserConsentResultStateManager) factory4.d(Reflection.a(UserConsentResultStateManager.class), null, null), (MinProfileUpdateResultStateManager) factory4.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null), (MandatoryFirstHistoryCallGuard) factory4.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null), (ResolvePostLoginNavigationTargetUseCase) factory4.d(Reflection.a(ResolvePostLoginNavigationTargetUseCase.class), null, null), (MinProfileAnalyticsHelper) factory4.d(Reflection.a(MinProfileAnalyticsHelper.class), null, null), (ResolveProfilePolicyUseCase) factory4.d(Reflection.a(ResolveProfilePolicyUseCase.class), null, null));
            case 11:
                Scope single7 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(single7, "$this$single");
                Intrinsics.i(it11, "it");
                return new FcmTokenFeatureImpl((GCMReceiver) single7.d(Reflection.a(GCMReceiver.class), null, null), (CoroutineContextProvider) single7.d(Reflection.a(CoroutineContextProvider.class), null, null), (NetworkManager) single7.d(Reflection.a(NetworkManager.class), null, null), (UserProfileDetailsProvider) single7.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (BasicInfoContract) single7.d(Reflection.a(BasicInfoContract.class), null, null), (DataStore) single7.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb")), (CrashlyticsLogger) single7.d(Reflection.a(CrashlyticsLogger.class), null, null), (FreshChatInitManager) single7.d(Reflection.a(FreshChatInitManager.class), null, null), (PlotlineNotificationManager) single7.d(Reflection.a(PlotlineNotificationManager.class), null, null), (ThoughtNudgeNotificationManager) single7.d(Reflection.a(ThoughtNudgeNotificationManager.class), null, null));
            case 12:
                Scope single8 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(single8, "$this$single");
                Intrinsics.i(it12, "it");
                return new ThoughtNudgeContractImpl(ModuleExtKt.a(single8), (ChaloBuildConfig) single8.d(Reflection.a(ChaloBuildConfig.class), null, null), (UserProfileDetailsProvider) single8.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (AnalyticsContract) single8.d(Reflection.a(AnalyticsContract.class), null, null), (SdkIntegrationPolicyManager) single8.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
            case 13:
                Scope single9 = (Scope) obj;
                ParametersHolder it13 = (ParametersHolder) obj2;
                Intrinsics.i(single9, "$this$single");
                Intrinsics.i(it13, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.S(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single9), "user_info_store", null, 4, null), SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single9), "accessToken", null, 4, null)), null, new u71(single9, 26), 5, null);
            case 14:
                Scope single10 = (Scope) obj;
                ParametersHolder it14 = (ParametersHolder) obj2;
                Intrinsics.i(single10, "$this$single");
                Intrinsics.i(it14, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, EmptyList.f17557a, null, new u71(single10, 27), 5, null);
            case 15:
                Scope scope2 = (Scope) obj;
                Object systemService = ((Context) scope2.d(i71.k(scope2, "$this$single", (ParametersHolder) obj2, "it", Context.class), null, null)).getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                return (TelephonyManager) systemService;
            case 16:
                Scope factory5 = (Scope) obj;
                ParametersHolder it15 = (ParametersHolder) obj2;
                Intrinsics.i(factory5, "$this$factory");
                Intrinsics.i(it15, "it");
                return new NetworkConfig((DataStore) factory5.d(Reflection.a(DataStore.class), null, new StringQualifier("network_config.preferences_pb")));
            case 17:
                Scope single11 = (Scope) obj;
                ParametersHolder it16 = (ParametersHolder) obj2;
                Intrinsics.i(single11, "$this$single");
                Intrinsics.i(it16, "it");
                if (!((Boolean) single11.d(Reflection.a(Boolean.class), null, new StringQualifier("API_SOURCE_DEBUG_BUILD_GATE_KEY"))).booleanValue()) {
                    return new FixedApiSourceState();
                }
                MockApiRuntimeOverride mockApiRuntimeOverrideA = ((MockApiLocalOverrideResolver) single11.d(Reflection.a(MockApiLocalOverrideResolver.class), null, null)).a();
                String lowerCase = mockApiRuntimeOverrideA.f6489a.name().toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                MockApiRuntimeLogger.b("MockApiRuntimeState", "creating local override runtime state apiSource=" + lowerCase + " routes=" + CollectionsKt.u0(mockApiRuntimeOverrideA.b.keySet()));
                return (ApiSourceState) single11.d(Reflection.a(LocalOverrideMockApiRuntimeState.class), null, null);
            case 18:
                Scope scope3 = (Scope) obj;
                return new LocalOverrideMockApiRuntimeState(((MockApiLocalOverrideResolver) scope3.d(i71.k(scope3, "$this$single", (ParametersHolder) obj2, "it", MockApiLocalOverrideResolver.class), null, null)).a());
            case 19:
                Scope single12 = (Scope) obj;
                ParametersHolder it17 = (ParametersHolder) obj2;
                Intrinsics.i(single12, "$this$single");
                Intrinsics.i(it17, "it");
                return ((Boolean) single12.d(Reflection.a(Boolean.class), null, new StringQualifier("API_SOURCE_DEBUG_BUILD_GATE_KEY"))).booleanValue() ? (MockApiRouteVariantState) single12.d(Reflection.a(LocalOverrideMockApiRuntimeState.class), null, null) : new EmptyMockApiRouteVariantState();
            case 20:
                Scope single13 = (Scope) obj;
                ParametersHolder it18 = (ParametersHolder) obj2;
                Intrinsics.i(single13, "$this$single");
                Intrinsics.i(it18, "it");
                return new ChaloRestClient(HttpClientHelper.a((HttpClientEngine) single13.d(Reflection.a(HttpClientEngine.class), null, new StringQualifier("lowPriority")), (CommonHeaderProvider) single13.d(Reflection.a(CommonHeaderProvider.class), null, null), (ChaloAuthSecureManager) single13.d(Reflection.a(ChaloAuthSecureManager.class), null, null), (ChaloInternalNetworkInspector) single13.d(Reflection.a(ChaloInternalNetworkInspector.class), null, null)));
            case 21:
                Scope single14 = (Scope) obj;
                ParametersHolder it19 = (ParametersHolder) obj2;
                Intrinsics.i(single14, "$this$single");
                Intrinsics.i(it19, "it");
                return new ChaloRestClient(HttpClientHelper.a((HttpClientEngine) single14.d(Reflection.a(HttpClientEngine.class), null, new StringQualifier("mediumPriority")), (CommonHeaderProvider) single14.d(Reflection.a(CommonHeaderProvider.class), null, null), (ChaloAuthSecureManager) single14.d(Reflection.a(ChaloAuthSecureManager.class), null, null), (ChaloInternalNetworkInspector) single14.d(Reflection.a(ChaloInternalNetworkInspector.class), null, null)));
            case 22:
                Scope single15 = (Scope) obj;
                ParametersHolder it20 = (ParametersHolder) obj2;
                Intrinsics.i(single15, "$this$single");
                Intrinsics.i(it20, "it");
                return new ChaloRestClient(HttpClientHelper.a((HttpClientEngine) single15.d(Reflection.a(HttpClientEngine.class), null, new StringQualifier("highPriority")), (CommonHeaderProvider) single15.d(Reflection.a(CommonHeaderProvider.class), null, null), (ChaloAuthSecureManager) single15.d(Reflection.a(ChaloAuthSecureManager.class), null, null), (ChaloInternalNetworkInspector) single15.d(Reflection.a(ChaloInternalNetworkInspector.class), null, null)));
            case 23:
                Scope factory6 = (Scope) obj;
                ParametersHolder it21 = (ParametersHolder) obj2;
                Intrinsics.i(factory6, "$this$factory");
                Intrinsics.i(it21, "it");
                return new SplashOperations((ChaloTimeRefreshManagerUseCase) factory6.d(Reflection.a(ChaloTimeRefreshManagerUseCase.class), null, null), (CityProvider) factory6.d(Reflection.a(CityProvider.class), null, null), (GetClusterConfigForCityUseCase) factory6.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null), (Device) factory6.d(Reflection.a(Device.class), null, null), (AnalyticsContract) factory6.d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) factory6.d(Reflection.a(CrashlyticsLogger.class), null, null), (IsNotificationPermissionGrantedUseCase) factory6.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null), (FireAppOpenEventIfRequiredUseCase) factory6.d(Reflection.a(FireAppOpenEventIfRequiredUseCase.class), null, null), (AppUsageTrackingContract) factory6.d(Reflection.a(AppUsageTrackingContract.class), null, null), (LanguageFeature) factory6.d(Reflection.a(LanguageFeature.class), null, null), (OnboardingBackgroundOperationManager) factory6.d(Reflection.a(OnboardingBackgroundOperationManager.class), null, null), (CheckIsUserLoggedInUseCase) factory6.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (DpdpaConsentManager) factory6.d(Reflection.a(DpdpaConsentManager.class), null, null), (CheckIfCanLaunchHomeScreenUseCase) factory6.d(Reflection.a(CheckIfCanLaunchHomeScreenUseCase.class), null, null), (MandatoryFirstHistoryCallGuard) factory6.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null), (SystemHelper) factory6.d(Reflection.a(SystemHelper.class), null, null), (FormatTimeInMillisToGivenFormatUseCase) factory6.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null), new LocalDataStore((DataStore) factory6.d(Reflection.a(DataStore.class), null, new StringQualifier("app_open_daily_store.preferences_pb"))), (BasicInfoContract) factory6.d(Reflection.a(BasicInfoContract.class), null, null), (UnsyncedActivationsSyncHelper) factory6.d(Reflection.a(UnsyncedActivationsSyncHelper.class), null, null), (FreshChatInitializer) factory6.d(Reflection.a(FreshChatInitializer.class), null, null), (ChaloAppFeatureHelper) factory6.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
            case 24:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new SplashScreenComponent((ComponentContext) parametersHolder.a(0, i71.k(scope4, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (ChaloNavigationManager) scope4.d(Reflection.a(ChaloNavigationManager.class), null, null), (SplashFlowOrchestrator) scope4.d(Reflection.a(SplashFlowOrchestrator.class), null, null), (UserConsentResultStateManager) scope4.d(Reflection.a(UserConsentResultStateManager.class), null, null), (AnalyticsContract) scope4.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloAppFeatureHelper) scope4.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
            case 25:
                Scope factory7 = (Scope) obj;
                ParametersHolder it22 = (ParametersHolder) obj2;
                Intrinsics.i(factory7, "$this$factory");
                Intrinsics.i(it22, "it");
                return new CityChangeOperationTracker(new LocalDataStore((DataStore) factory7.d(Reflection.a(DataStore.class), null, new StringQualifier("city_store.preferences_pb"))), (SystemHelper) factory7.d(Reflection.a(SystemHelper.class), null, null));
            case 26:
                Scope factory8 = (Scope) obj;
                ParametersHolder it23 = (ParametersHolder) obj2;
                Intrinsics.i(factory8, "$this$factory");
                Intrinsics.i(it23, "it");
                SplitInstallManager splitInstallManagerA = SplitInstallManagerFactory.a(ModuleExtKt.a(factory8));
                Intrinsics.h(splitInstallManagerA, "create(...)");
                return splitInstallManagerA;
            case 27:
                Scope single16 = (Scope) obj;
                ParametersHolder it24 = (ParametersHolder) obj2;
                Intrinsics.i(single16, "$this$single");
                Intrinsics.i(it24, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single16), "app_open_daily_store", null, 4, null)), null, new u71(single16, 28), 5, null);
            case 28:
                Scope factory9 = (Scope) obj;
                ParametersHolder it25 = (ParametersHolder) obj2;
                Intrinsics.i(factory9, "$this$factory");
                Intrinsics.i(it25, "it");
                return new AndroidSplashOrchestrator((SplashOperations) factory9.d(Reflection.a(SplashOperations.class), null, null), (MandatoryFirstHistoryCallGuard) factory9.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null));
            default:
                Scope factory10 = (Scope) obj;
                ParametersHolder it26 = (ParametersHolder) obj2;
                Intrinsics.i(factory10, "$this$factory");
                Intrinsics.i(it26, "it");
                return new InstantTicketWalletAccessComponent((ComponentContext) factory10.d(Reflection.a(ComponentContext.class), null, null), (GetWalletStatusUseCase) factory10.d(Reflection.a(GetWalletStatusUseCase.class), null, null), (RefreshWalletStatusUseCase) factory10.d(Reflection.a(RefreshWalletStatusUseCase.class), null, null), (GetWalletStatusWithoutSyncUseCase) factory10.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null), (AnalyticsContract) factory10.d(Reflection.a(AnalyticsContract.class), null, null), (PostDeviceIdForWalletMigrationUseCase) factory10.d(Reflection.a(PostDeviceIdForWalletMigrationUseCase.class), null, null), (CurrencyFeature) factory10.d(Reflection.a(CurrencyFeature.class), null, null), (ValidateQuickPayUseCase) factory10.d(Reflection.a(ValidateQuickPayUseCase.class), null, null), (CreateQuickPayOrderUsecase) factory10.d(Reflection.a(CreateQuickPayOrderUsecase.class), null, null), (FetchWalletBalanceUseCase) factory10.d(Reflection.a(FetchWalletBalanceUseCase.class), null, null), (SatisfiesQuickPayPrerequisitesUseCase) factory10.d(Reflection.a(SatisfiesQuickPayPrerequisitesUseCase.class), null, null), (RefreshQuickPayPrerequisitesUseCase) factory10.d(Reflection.a(RefreshQuickPayPrerequisitesUseCase.class), null, null), (StringProvider) factory10.d(Reflection.a(StringProvider.class), null, null), (ChaloConfigFeature) factory10.d(Reflection.a(ChaloConfigFeature.class), null, null), (UserProfileDetailsProvider) factory10.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (GetWalletAndAllTransactionsWithoutSyncUseCase) factory10.d(Reflection.a(GetWalletAndAllTransactionsWithoutSyncUseCase.class), null, null), (GetWalletSetupConfigurationUseCase) factory10.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null), (ChaloNavigationManager) factory10.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) factory10.d(Reflection.a(KotlinToastManager.class), null, null), (InstantTicketConfigHelper) factory10.d(Reflection.a(InstantTicketConfigHelper.class), null, null), (WalletResolver) factory10.d(Reflection.a(WalletResolver.class), null, null));
        }
    }
}
