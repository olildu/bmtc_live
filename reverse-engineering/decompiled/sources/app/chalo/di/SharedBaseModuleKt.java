package app.chalo.di;

import app.chalo.Device;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.ads.DefaultExitInterstitialConfigProvider;
import app.chalo.ads.DefaultUnifiedAdFailureReporter;
import app.chalo.ads.DefaultUnifiedAdLifecycleReporter;
import app.chalo.ads.ExitInterstitialDecisionEngine;
import app.chalo.ads.FetchExitInterstitialConfigUseCase;
import app.chalo.ads.UnifiedAdDebugFixtureCatalog;
import app.chalo.ads.UnifiedAdDebugFixtureResolver;
import app.chalo.ads.UnifiedAdFailureReporter;
import app.chalo.analytics.AnalyticsContractImpl;
import app.chalo.analytics.AnalyticsManager;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.mixpanel.MixpanelPropertiesProvider;
import app.chalo.base.BasicInfoContractImpl;
import app.chalo.behaviour.policy.AccountDeletionUrlOverride;
import app.chalo.behaviour.policy.BrandId;
import app.chalo.behaviour.policy.PolicyConfigFetcher;
import app.chalo.behaviour.policy.PolicyResolutionContextProvider;
import app.chalo.behaviour.policy.PolicyResolverCache;
import app.chalo.behaviour.policy.ResolveCitySelectionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase;
import app.chalo.behaviour.policy.ResolveLanguagePolicyUseCase;
import app.chalo.behaviour.policy.ResolveLocationPermissionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveProductPurchasePolicyUseCase;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.behaviour.policy.ResolveResourceUrlPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSplashPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolveWalletPolicyUseCase;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.behaviour.policy.TripPlannerPolicyManager;
import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.UpdateMapStateOnLiveVehiclePositionChangeUseCase;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapLiveBusMarkerHelper;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProviderImpl;
import app.chalo.contract.AppUsageTrackingContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductInfoContractImpl;
import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggerImpl;
import app.chalo.datastore.LocalDataStore;
import app.chalo.deeplink.DeepLinkCoordinator;
import app.chalo.deeplink.DeepLinkGuard;
import app.chalo.deeplink.DeepLinkNavigationHandler;
import app.chalo.deeplink.DeepLinkNavigationMapper;
import app.chalo.deeplink.DeepLinkPendingStore;
import app.chalo.deeplink.DeepLinkResumeManager;
import app.chalo.deeplink.DeepLinkRuntime;
import app.chalo.deeplink.DefaultDeepLinkAppOpenTracker;
import app.chalo.deeplink.InMemoryDeepLinkPendingStore;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.domain.EvaluateWalletEnableConfigUseCase;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.domain.GetBookingHelpFaqsUseCase;
import app.chalo.domain.GetBookingHelpRemoteConfigUseCase;
import app.chalo.domain.GetCityIdsInClusterProductHistoryUseCase;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.GetProductCapabilitiesRemoteConfigUseCase;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.domain.GetSupportedChaloCountryListUseCase;
import app.chalo.domain.GetTrimmedPolylineUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.domain.IsLocationMandatoryForUserUseCase;
import app.chalo.domain.IsNewCardExperienceEnabledUseCase;
import app.chalo.domain.IsStopBasedTripPlannerApplicableUseCase;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileAbVariantUseCase;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.features.adjust.AdjustManagerImpl;
import app.chalo.features.adjust.AdjustSdkDelegate;
import app.chalo.features.boostratings.IBoostRatingsFeature;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl;
import app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource;
import app.chalo.features.chaloconfig.data.remote.ChaloConfigRemoteDataSource;
import app.chalo.features.chaloconfig.data.remote.ChaloConfigRemoteDataSourceImpl;
import app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker;
import app.chalo.features.chaloconfig.domain.GetChaloConfigDataKeyForLanguageUseCase;
import app.chalo.features.chaloconfig.domain.ProcessAndStoreChaloConfigApiResponseUseCase;
import app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager;
import app.chalo.features.chaloconfig.impl.ChaloConfigFeatureImpl;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.chalotime.data.ChaloTimeRepository;
import app.chalo.features.chalotime.data.ChaloTimeRepositoryImpl;
import app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource;
import app.chalo.features.chalotime.data.remote.ChaloTimeRemoteDataSource;
import app.chalo.features.chalotime.data.remote.ChaloTimeRemoteDataSourceImpl;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.chalotime.domain.GetChaloTimeFetchConfigUseCase;
import app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase;
import app.chalo.features.chalotime.impl.ChaloTimeProviderImpl;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.features.foreground.ActiveSceneInStackResolverImpl;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.freshchat.FreshChatInitializer;
import app.chalo.features.freshchat.FreshChatInitializerImpl;
import app.chalo.features.freshchat.FreshchatSupportLauncher;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.freshchat.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.network.KConnectivityManager;
import app.chalo.features.network.NetworkStateManagerImpl;
import app.chalo.features.nfc.BasicNFCManager;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase;
import app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemResponseConverter;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.features.wallet.CurrencyFeatureImpl;
import app.chalo.fileupload.data.remote.UploadFileRemoteDataSource;
import app.chalo.fileupload.data.remote.UploadFileRemoteDataSourceImpl;
import app.chalo.fileupload.data.repository.UploadFileRepository;
import app.chalo.fileupload.data.repository.UploadFileRepositoryImpl;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.fileupload.picker.ImagePickerProviderImpl;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.ChaloPackageManagerHelper;
import app.chalo.helper.CoroutineScopeHelperImpl;
import app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase;
import app.chalo.juspay.CreateJusPaySDKRequestJsonUseCase;
import app.chalo.juspay.JuspayControllerFactory;
import app.chalo.juspay.JuspayControllerProviderImpl;
import app.chalo.juspay.JuspaySignatureRemoteDataSource;
import app.chalo.juspay.JuspaySignatureRemoteDataSourceImpl;
import app.chalo.juspay.JuspaySignatureRepository;
import app.chalo.juspay.JuspaySignatureRepositoryImpl;
import app.chalo.juspay.ProcessJuspayResultObjectUseCase;
import app.chalo.location.ChaloLocationDelegate;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.ChaloLocationManagerImpl;
import app.chalo.location.LastKnownLocationProvider;
import app.chalo.login.LoginAuthGuardImpl;
import app.chalo.login.LoginAuthNavigationGuard;
import app.chalo.login.LoginAuthNavigationGuardImpl;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.network.CommonHeaderProviderImpl;
import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.notification.core.AppNotificationResolverUseCase;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.notification.core.GCMReceiverImpl;
import app.chalo.permissions.gps.GpsRequestHandlerProviderImpl;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProviderImpl;
import app.chalo.plotline.HandleCustomActionUseCase;
import app.chalo.plotline.PlotlineContract;
import app.chalo.plotline.PlotlineContractImpl;
import app.chalo.plotline.PlotlineTrackContextProviderImpl;
import app.chalo.providers.ChaloUrlProviderImpl;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.CoroutineContextProviderImpl;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.PlatformStringOverrideProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.stringprovider.StringProviderImpl;
import app.chalo.providers.toast.KotlinToastManagerImpl;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.resultstatemanager.wallet.loadmoney.WalletLoadMoneyResultStateManager;
import app.chalo.ridefeedbacktracker.ChaloRideFeedbackCollectionHelper;
import app.chalo.ridefeedbacktracker.RideFeedbackTracker;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerImpl;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.uistate.userprofile.GenderCardSelectionUIStateFactory;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.ChaloFeedbackConfigDataUseCase;
import app.chalo.usecase.CheckIfPremiumPassEligibleForRideRollOver;
import app.chalo.usecase.CheckIsTimestampForTodayUseCase;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.usecase.ConvertAmountInSubcurrencyToCurrencyUseCase;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetChaloTimeUseCase;
import app.chalo.usecase.GetCurrencyStringFromAmountInSubcurrencyUseCase;
import app.chalo.usecase.GetDeviceNFCStateUseCase;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetPremiumBusNativeConfigUseCase;
import app.chalo.usecase.GetRideFeedbackDataUseCase;
import app.chalo.usecase.GetRoundedOffAmountInSubcurrencyUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
import app.chalo.usecase.IsDebugAnalyticsEventsEnabledUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.CommonHtmlParserImpl;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsEventHandler;
import app.chalo.utils.resources.GetRemoteResourcesUrlConfigUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.utils.timeutil.TimeUtilsContractImpl;
import defpackage.d71;
import defpackage.h61;
import defpackage.i71;
import defpackage.n71;
import defpackage.o71;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.instance.SingleInstanceFactory;
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
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SharedBaseModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "$this$module");
        d71 d71Var = new d71(25);
        Function2<Scope, ParametersHolder, CrashlyticsLoggerImpl> function2 = new Function2<Scope, ParametersHolder, CrashlyticsLoggerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CrashlyticsLoggerImpl((Device) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", Device.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        StringQualifier stringQualifierA = ScopeRegistry.Companion.a();
        Kind kind = Kind.Singleton;
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(stringQualifierA, Reflection.a(CrashlyticsLoggerImpl.class), null, function2, kind, CollectionsKt.C()), module)), d71Var);
        a aVar = new a(0);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LastKnownLocationProvider.class), null, aVar, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, AdTargetingProvider> function3 = new Function2<Scope, ParametersHolder, AdTargetingProvider>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                return new AdTargetingProvider((CityProvider) objD, (LanguageFeature) objD2, (LastKnownLocationProvider) scope.d(Reflection.a(LastKnownLocationProvider.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AdTargetingProvider.class), null, function3, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchExitInterstitialConfigUseCase> function4 = new Function2<Scope, ParametersHolder, FetchExitInterstitialConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RemoteConfigFetcherContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(CheckIfExperimentEnabledUseCase.class), null, null);
                return new FetchExitInterstitialConfigUseCase((RemoteConfigFetcherContract) objD, (CheckIfExperimentEnabledUseCase) objD2, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (ABTestAnalyticsContract) scope.d(Reflection.a(ABTestAnalyticsContract.class), null, null));
            }
        };
        StringQualifier stringQualifierA2 = ScopeRegistry.Companion.a();
        Kind kind2 = Kind.Factory;
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(stringQualifierA2, Reflection.a(FetchExitInterstitialConfigUseCase.class), null, function4, kind2, CollectionsKt.C()), module)), null);
        d71 d71Var2 = new d71(20);
        Function2<Scope, ParametersHolder, DefaultExitInterstitialConfigProvider> function5 = new Function2<Scope, ParametersHolder, DefaultExitInterstitialConfigProvider>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new DefaultExitInterstitialConfigProvider((FetchExitInterstitialConfigUseCase) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", FetchExitInterstitialConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DefaultExitInterstitialConfigProvider.class), null, function5, kind, CollectionsKt.C()), module)), d71Var2);
        Function2<Scope, ParametersHolder, ExitInterstitialDecisionEngine> function6 = new Function2<Scope, ParametersHolder, ExitInterstitialDecisionEngine>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new ExitInterstitialDecisionEngine();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ExitInterstitialDecisionEngine.class), null, function6, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var = new n71(0);
        Function2<Scope, ParametersHolder, DefaultUnifiedAdFailureReporter> function7 = new Function2<Scope, ParametersHolder, DefaultUnifiedAdFailureReporter>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new DefaultUnifiedAdFailureReporter((AnalyticsContract) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DefaultUnifiedAdFailureReporter.class), null, function7, kind, CollectionsKt.C()), module)), n71Var);
        n71 n71Var2 = new n71(5);
        Function2<Scope, ParametersHolder, DefaultUnifiedAdLifecycleReporter> function8 = new Function2<Scope, ParametersHolder, DefaultUnifiedAdLifecycleReporter>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new DefaultUnifiedAdLifecycleReporter((AnalyticsContract) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null), (UnifiedAdFailureReporter) scope.d(Reflection.a(UnifiedAdFailureReporter.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DefaultUnifiedAdLifecycleReporter.class), null, function8, kind, CollectionsKt.C()), module)), n71Var2);
        o71 o71Var = new o71(1);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UnifiedAdDebugFixtureCatalog.class), null, o71Var, kind, CollectionsKt.C()), module));
        o71 o71Var2 = new o71(9);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UnifiedAdDebugFixtureResolver.class), null, o71Var2, kind, CollectionsKt.C()), module));
        n71 n71Var3 = new n71(17);
        Function2<Scope, ParametersHolder, CoroutineContextProviderImpl> function9 = new Function2<Scope, ParametersHolder, CoroutineContextProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new CoroutineContextProviderImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CoroutineContextProviderImpl.class), null, function9, kind2, CollectionsKt.C()), module)), n71Var3);
        n71 n71Var4 = new n71(18);
        Function2<Scope, ParametersHolder, CommonHeaderProviderImpl> function10 = new Function2<Scope, ParametersHolder, CommonHeaderProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CommonHeaderProviderImpl((Device) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", Device.class), null, null), (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CommonHeaderProviderImpl.class), null, function10, kind, CollectionsKt.C()), module)), n71Var4);
        n71 n71Var5 = new n71(19);
        Function2<Scope, ParametersHolder, ChaloUrlProviderImpl> function11 = new Function2<Scope, ParametersHolder, ChaloUrlProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloUrlProviderImpl((ChaloBuildConfig) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloBuildConfig.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloUrlProviderImpl.class), null, function11, kind, CollectionsKt.C()), module)), n71Var5);
        n71 n71Var6 = new n71(4);
        Function2<Scope, ParametersHolder, UploadFileRemoteDataSourceImpl> function12 = new Function2<Scope, ParametersHolder, UploadFileRemoteDataSourceImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UploadFileRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UploadFileRemoteDataSourceImpl.class), null, function12, kind2, CollectionsKt.C()), module)), n71Var6);
        n71 n71Var7 = new n71(6);
        Function2<Scope, ParametersHolder, UploadFileRepositoryImpl> function13 = new Function2<Scope, ParametersHolder, UploadFileRepositoryImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new UploadFileRepositoryImpl((UploadFileRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UploadFileRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UploadFileRepositoryImpl.class), null, function13, kind2, CollectionsKt.C()), module)), n71Var7);
        Function2<Scope, ParametersHolder, UploadFileToServerUseCase> function14 = new Function2<Scope, ParametersHolder, UploadFileToServerUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new UploadFileToServerUseCase((UploadFileRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UploadFileRepository.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UploadFileToServerUseCase.class), null, function14, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var8 = new n71(7);
        Function2<Scope, ParametersHolder, JuspaySignatureRemoteDataSourceImpl> function15 = new Function2<Scope, ParametersHolder, JuspaySignatureRemoteDataSourceImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new JuspaySignatureRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(JuspaySignatureRemoteDataSourceImpl.class), null, function15, kind2, CollectionsKt.C()), module)), n71Var8);
        n71 n71Var9 = new n71(12);
        Function2<Scope, ParametersHolder, JuspaySignatureRepositoryImpl> function16 = new Function2<Scope, ParametersHolder, JuspaySignatureRepositoryImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new JuspaySignatureRepositoryImpl((JuspaySignatureRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", JuspaySignatureRemoteDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(JuspaySignatureRepositoryImpl.class), null, function16, kind2, CollectionsKt.C()), module)), n71Var9);
        n71 n71Var10 = new n71(20);
        Function2<Scope, ParametersHolder, JuspayControllerProviderImpl> function17 = new Function2<Scope, ParametersHolder, JuspayControllerProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new JuspayControllerProviderImpl((JuspayControllerFactory) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", JuspayControllerFactory.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(JuspayControllerProviderImpl.class), null, function17, kind, CollectionsKt.C()), module)), n71Var10);
        Function2<Scope, ParametersHolder, JuspayControllerFactory> function18 = new Function2<Scope, ParametersHolder, JuspayControllerFactory>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CreateJusPaySDKRequestJsonUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(ProcessJuspayResultObjectUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD6 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new JuspayControllerFactory((CreateJusPaySDKRequestJsonUseCase) objD, (ProcessJuspayResultObjectUseCase) objD2, (BasicInfoContract) objD3, (AnalyticsContract) objD4, (CoroutineContextProvider) objD5, (CityProvider) objD6, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ResolveJuspayPolicyUseCase) scope.d(Reflection.a(ResolveJuspayPolicyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(JuspayControllerFactory.class), null, function18, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CreateJusPaySDKRequestJsonUseCase> function19 = new Function2<Scope, ParametersHolder, CreateJusPaySDKRequestJsonUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", JuspaySignatureRepository.class), null, null);
                return new CreateJusPaySDKRequestJsonUseCase((JuspaySignatureRepository) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CreateJusPaySDKRequestJsonUseCase.class), null, function19, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProcessJuspayResultObjectUseCase> function20 = new Function2<Scope, ParametersHolder, ProcessJuspayResultObjectUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProcessJuspayResultObjectUseCase((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProcessJuspayResultObjectUseCase.class), null, function20, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var11 = new n71(23);
        Function2<Scope, ParametersHolder, AnalyticsContractImpl> function21 = new Function2<Scope, ParametersHolder, AnalyticsContractImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", AnalyticsManager.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloTimeProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(LanguageFeature.class), null, null);
                Object objD5 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                Object objD6 = scope.d(Reflection.a(IsDebugAnalyticsEventsEnabledUseCase.class), null, null);
                Object objD7 = scope.d(Reflection.a(PlotlineContract.class), null, null);
                return new AnalyticsContractImpl((AnalyticsManager) objD, (ChaloTimeProvider) objD2, (CityProvider) objD3, (LanguageFeature) objD4, (ChaloBuildConfig) objD5, (IsDebugAnalyticsEventsEnabledUseCase) objD6, (PlotlineContract) objD7, (LastKnownLocationProvider) scope.d(Reflection.a(LastKnownLocationProvider.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AnalyticsContractImpl.class), null, function21, kind, CollectionsKt.C()), module)), n71Var11);
        Function2<Scope, ParametersHolder, GetDistinctIdUseCase> function22 = new Function2<Scope, ParametersHolder, GetDistinctIdUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetDistinctIdUseCase((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null), (MixpanelPropertiesProvider) scope.d(Reflection.a(MixpanelPropertiesProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetDistinctIdUseCase.class), null, function22, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var12 = new n71(24);
        Function2<Scope, ParametersHolder, ChaloNavigationManagerImpl> function23 = new Function2<Scope, ParametersHolder, ChaloNavigationManagerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                return new ChaloNavigationManagerImpl((CoroutineContextProvider) objD, (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (LoginAuthNavigationGuard) scope.d(Reflection.a(LoginAuthNavigationGuard.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloNavigationManagerImpl.class), null, function23, kind, CollectionsKt.C()), module)), n71Var12);
        d71 d71Var3 = new d71(12);
        Function2<Scope, ParametersHolder, LoginAuthNavigationGuardImpl> function24 = new Function2<Scope, ParametersHolder, LoginAuthNavigationGuardImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new LoginAuthNavigationGuardImpl((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null), (ActiveSceneInStackResolver) scope.d(Reflection.a(ActiveSceneInStackResolver.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LoginAuthNavigationGuardImpl.class), null, function24, kind2, CollectionsKt.C()), module)), d71Var3);
        Function2<Scope, ParametersHolder, DeepLinkCoordinator> function25 = new Function2<Scope, ParametersHolder, DeepLinkCoordinator>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new DeepLinkCoordinator();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkCoordinator.class), null, function25, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, DeepLinkRuntime> function26 = new Function2<Scope, ParametersHolder, DeepLinkRuntime>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new DeepLinkRuntime((DeepLinkCoordinator) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", DeepLinkCoordinator.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkRuntime.class), null, function26, kind, CollectionsKt.C()), module)), null);
        d71 d71Var4 = new d71(13);
        Function2<Scope, ParametersHolder, DefaultDeepLinkAppOpenTracker> function27 = new Function2<Scope, ParametersHolder, DefaultDeepLinkAppOpenTracker>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new DefaultDeepLinkAppOpenTracker((FireAppOpenEventIfRequiredUseCase) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", FireAppOpenEventIfRequiredUseCase.class), null, null), (AppUsageTrackingContract) scope.d(Reflection.a(AppUsageTrackingContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DefaultDeepLinkAppOpenTracker.class), null, function27, kind, CollectionsKt.C()), module)), d71Var4);
        d71 d71Var5 = new d71(14);
        Function2<Scope, ParametersHolder, InMemoryDeepLinkPendingStore> function28 = new Function2<Scope, ParametersHolder, InMemoryDeepLinkPendingStore>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new InMemoryDeepLinkPendingStore();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InMemoryDeepLinkPendingStore.class), null, function28, kind, CollectionsKt.C()), module)), d71Var5);
        Function2<Scope, ParametersHolder, IsNewCardExperienceEnabledUseCase> function29 = new Function2<Scope, ParametersHolder, IsNewCardExperienceEnabledUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new IsNewCardExperienceEnabledUseCase((ChaloBuildConfig) objD3, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD2, (ChaloConfigFeature) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsNewCardExperienceEnabledUseCase.class), null, function29, kind, CollectionsKt.C()), module)), null);
        h61 h61Var = new h61(7);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkGuard.class), null, h61Var, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, DeepLinkNavigationMapper> function30 = new Function2<Scope, ParametersHolder, DeepLinkNavigationMapper>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new DeepLinkNavigationMapper();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkNavigationMapper.class), null, function30, kind, CollectionsKt.C()), module)), null);
        h61 h61Var2 = new h61(8);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkNavigationHandler.class), null, h61Var2, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, FreshchatSupportLauncher> function31 = new Function2<Scope, ParametersHolder, FreshchatSupportLauncher>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", FreshchatUserInteractionContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new FreshchatSupportLauncher((FreshchatUserInteractionContract) objD, (CityProvider) objD2, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FreshchatSupportLauncher.class), null, function31, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, InitiateFreshChatCustomerSupportUseCase> function32 = new Function2<Scope, ParametersHolder, InitiateFreshChatCustomerSupportUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new InitiateFreshChatCustomerSupportUseCase((FreshchatUserInteractionContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FreshchatUserInteractionContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, function32, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, DeepLinkResumeManager> function33 = new Function2<Scope, ParametersHolder, DeepLinkResumeManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new DeepLinkResumeManager((DeepLinkPendingStore) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", DeepLinkPendingStore.class), null, null), (DeepLinkRuntime) scope.d(Reflection.a(DeepLinkRuntime.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DeepLinkResumeManager.class), null, function33, kind, CollectionsKt.C()), module)), null);
        h61 h61Var3 = new h61(9);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LanguageFeature.class), null, h61Var3, kind, CollectionsKt.C()));
        module.a(singleInstanceFactory);
        module.b(singleInstanceFactory);
        new KoinDefinition(module, singleInstanceFactory);
        d71 d71Var6 = new d71(15);
        Function2<Scope, ParametersHolder, StringProviderImpl> function34 = new Function2<Scope, ParametersHolder, StringProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new StringProviderImpl((PlatformStringOverrideProvider) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", PlatformStringOverrideProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StringProviderImpl.class), null, function34, kind, CollectionsKt.C()), module)), d71Var6);
        d71 d71Var7 = new d71(16);
        Function2<Scope, ParametersHolder, BasicInfoContractImpl> function35 = new Function2<Scope, ParametersHolder, BasicInfoContractImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", Device.class), null, null);
                Object objD2 = scope.d(Reflection.a(SystemHelper.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new BasicInfoContractImpl((Device) objD, (SystemHelper) objD2, (ChaloBuildConfig) objD3, (ChaloTimeProvider) scope.d(Reflection.a(ChaloTimeProvider.class), null, null), (PermissionHandlerProvider) scope.d(Reflection.a(PermissionHandlerProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BasicInfoContractImpl.class), null, function35, kind, CollectionsKt.C()), module)), d71Var7);
        h61 h61Var4 = new h61(10);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigLocalDataSource.class), null, h61Var4, kind2, CollectionsKt.C()), module));
        d71 d71Var8 = new d71(17);
        Function2<Scope, ParametersHolder, ChaloConfigRemoteDataSourceImpl> function36 = new Function2<Scope, ParametersHolder, ChaloConfigRemoteDataSourceImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null);
                return new ChaloConfigRemoteDataSourceImpl((NetworkManager) objD, (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigRemoteDataSourceImpl.class), null, function36, kind2, CollectionsKt.C()), module)), d71Var8);
        Function2<Scope, ParametersHolder, ChaloConfigCacheManager> function37 = new Function2<Scope, ParametersHolder, ChaloConfigCacheManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", LanguageFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloConfigRepository.class), null, null);
                Object objD3 = scope.d(Reflection.a(ProcessAndStoreChaloConfigApiResponseUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new ChaloConfigCacheManager((LanguageFeature) objD, (ChaloConfigRepository) objD2, (ProcessAndStoreChaloConfigApiResponseUseCase) objD3, (BasicInfoContract) objD4, (CrashlyticsLogger) objD5, (ChaloConfigDataSnapshotTracker) scope.d(Reflection.a(ChaloConfigDataSnapshotTracker.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigCacheManager.class), null, function37, kind, CollectionsKt.C()), module)), null);
        d71 d71Var9 = new d71(18);
        Function2<Scope, ParametersHolder, ChaloConfigRepositoryImpl> function38 = new Function2<Scope, ParametersHolder, ChaloConfigRepositoryImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigLocalDataSource.class), null, null);
                return new ChaloConfigRepositoryImpl((ChaloConfigLocalDataSource) objD, (ChaloConfigRemoteDataSource) scope.d(Reflection.a(ChaloConfigRemoteDataSource.class), null, null), (GetChaloConfigDataKeyForLanguageUseCase) scope.d(Reflection.a(GetChaloConfigDataKeyForLanguageUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigRepositoryImpl.class), null, function38, kind2, CollectionsKt.C()), module)), d71Var9);
        d71 d71Var10 = new d71(19);
        Function2<Scope, ParametersHolder, ChaloConfigFeatureImpl> function39 = new Function2<Scope, ParametersHolder, ChaloConfigFeatureImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloConfigCacheManager.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloConfigRepository.class), null, null);
                return new ChaloConfigFeatureImpl((ChaloConfigCacheManager) objD, (ChaloConfigRepository) objD2, (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigFeatureImpl.class), null, function39, kind, CollectionsKt.C()), module)), d71Var10);
        Function2<Scope, ParametersHolder, GetChaloConfigDataKeyForLanguageUseCase> function40 = new Function2<Scope, ParametersHolder, GetChaloConfigDataKeyForLanguageUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetChaloConfigDataKeyForLanguageUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetChaloConfigDataKeyForLanguageUseCase.class), null, function40, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloConfigDataSnapshotTracker> function41 = new Function2<Scope, ParametersHolder, ChaloConfigDataSnapshotTracker>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ChaloConfigDataSnapshotTracker();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloConfigDataSnapshotTracker.class), null, function41, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProcessAndStoreChaloConfigApiResponseUseCase> function42 = new Function2<Scope, ParametersHolder, ProcessAndStoreChaloConfigApiResponseUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigRepository.class), null, null);
                return new ProcessAndStoreChaloConfigApiResponseUseCase((ChaloConfigRepository) objD, (GetChaloConfigDataKeyForLanguageUseCase) scope.d(Reflection.a(GetChaloConfigDataKeyForLanguageUseCase.class), null, null), (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProcessAndStoreChaloConfigApiResponseUseCase.class), null, function42, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, IsDebugAnalyticsEventsEnabledUseCase> function43 = new Function2<Scope, ParametersHolder, IsDebugAnalyticsEventsEnabledUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new IsDebugAnalyticsEventsEnabledUseCase((ChaloConfigFeature) objD, (BasicInfoContract) objD2, (CityProvider) objD3, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsDebugAnalyticsEventsEnabledUseCase.class), null, function43, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, IsCityEnabledForLiveTrackingUseCase> function44 = new Function2<Scope, ParametersHolder, IsCityEnabledForLiveTrackingUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new IsCityEnabledForLiveTrackingUseCase((ChaloBuildConfig) objD3, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD2, (ChaloConfigFeature) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsCityEnabledForLiveTrackingUseCase.class), null, function44, kind2, CollectionsKt.C()), module)), null);
        h61 h61Var5 = new h61(11);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeLocalDataSource.class), null, h61Var5, kind2, CollectionsKt.C()), module));
        d71 d71Var11 = new d71(21);
        Function2<Scope, ParametersHolder, ChaloTimeRemoteDataSourceImpl> function45 = new Function2<Scope, ParametersHolder, ChaloTimeRemoteDataSourceImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloTimeRemoteDataSourceImpl((NetworkManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NetworkManager.class), null, null), (GenericNetworkExceptionMapper) scope.d(Reflection.a(GenericNetworkExceptionMapper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeRemoteDataSourceImpl.class), null, function45, kind2, CollectionsKt.C()), module)), d71Var11);
        d71 d71Var12 = new d71(22);
        Function2<Scope, ParametersHolder, ChaloTimeRepositoryImpl> function46 = new Function2<Scope, ParametersHolder, ChaloTimeRepositoryImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloTimeRepositoryImpl((ChaloTimeRemoteDataSource) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloTimeRemoteDataSource.class), null, null), (ChaloTimeLocalDataSource) scope.d(Reflection.a(ChaloTimeLocalDataSource.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeRepositoryImpl.class), null, function46, kind2, CollectionsKt.C()), module)), d71Var12);
        Function2<Scope, ParametersHolder, ValidateChaloTimeCacheUseCase> function47 = new Function2<Scope, ParametersHolder, ValidateChaloTimeCacheUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloTimeRepository.class), null, null);
                Object objD2 = scope.d(Reflection.a(SystemHelper.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetChaloTimeFetchConfigUseCase.class), null, null);
                return new ValidateChaloTimeCacheUseCase((ChaloTimeRepository) objD, (SystemHelper) objD2, (GetChaloTimeFetchConfigUseCase) objD3, (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ValidateChaloTimeCacheUseCase.class), null, function47, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetChaloTimeFetchConfigUseCase> function48 = new Function2<Scope, ParametersHolder, GetChaloTimeFetchConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetChaloTimeFetchConfigUseCase((ChaloConfigFeature) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetChaloTimeFetchConfigUseCase.class), null, function48, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloTimeRefreshManagerUseCase> function49 = new Function2<Scope, ParametersHolder, ChaloTimeRefreshManagerUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetChaloTimeFetchConfigUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloTimeRepository.class), null, null);
                return new ChaloTimeRefreshManagerUseCase((CoroutineContextProvider) objD, (GetChaloTimeFetchConfigUseCase) objD2, (ChaloTimeRepository) objD3, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeRefreshManagerUseCase.class), null, function49, kind, CollectionsKt.C()), module)), null);
        d71 d71Var13 = new d71(23);
        Function2<Scope, ParametersHolder, ChaloTimeProviderImpl> function50 = new Function2<Scope, ParametersHolder, ChaloTimeProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ChaloTimeProviderImpl((ChaloTimeRepository) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloTimeRepository.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloTimeProviderImpl.class), null, function50, kind, CollectionsKt.C()), module)), d71Var13);
        h61 h61Var6 = new h61(12);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ClearProductStoresUseCase.class), null, h61Var6, kind, CollectionsKt.C()), module));
        d71 d71Var14 = new d71(24);
        Function2<Scope, ParametersHolder, PermissionHandlerProviderImpl> function51 = new Function2<Scope, ParametersHolder, PermissionHandlerProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new PermissionHandlerProviderImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PermissionHandlerProviderImpl.class), null, function51, kind, CollectionsKt.C()), module)), d71Var14);
        d71 d71Var15 = new d71(26);
        Function2<Scope, ParametersHolder, ImagePickerProviderImpl> function52 = new Function2<Scope, ParametersHolder, ImagePickerProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ImagePickerProviderImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ImagePickerProviderImpl.class), null, function52, kind, CollectionsKt.C()), module)), d71Var15);
        d71 d71Var16 = new d71(27);
        Function2<Scope, ParametersHolder, TimeUtilsContractImpl> function53 = new Function2<Scope, ParametersHolder, TimeUtilsContractImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                return new TimeUtilsContractImpl((CityProvider) objD, (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TimeUtilsContractImpl.class), null, function53, kind2, CollectionsKt.C()), module)), d71Var16);
        Function2<Scope, ParametersHolder, ConvertAmountInSubcurrencyToCurrencyUseCase> function54 = new Function2<Scope, ParametersHolder, ConvertAmountInSubcurrencyToCurrencyUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new ConvertAmountInSubcurrencyToCurrencyUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null), (GetRoundedOffAmountInSubcurrencyUseCase) scope.d(Reflection.a(GetRoundedOffAmountInSubcurrencyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ConvertAmountInSubcurrencyToCurrencyUseCase.class), null, function54, kind2, CollectionsKt.C()), module)), null);
        d71 d71Var17 = new d71(28);
        Function2<Scope, ParametersHolder, CurrencyFeatureImpl> function55 = new Function2<Scope, ParametersHolder, CurrencyFeatureImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ConvertAmountInSubcurrencyToCurrencyUseCase.class), null, null);
                return new CurrencyFeatureImpl((ConvertAmountInSubcurrencyToCurrencyUseCase) objD, (GetCurrencyStringFromAmountInSubcurrencyUseCase) scope.d(Reflection.a(GetCurrencyStringFromAmountInSubcurrencyUseCase.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CurrencyFeatureImpl.class), null, function55, kind2, CollectionsKt.C()), module)), d71Var17);
        Function2<Scope, ParametersHolder, GetChaloTimeUseCase> function56 = new Function2<Scope, ParametersHolder, GetChaloTimeUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetChaloTimeUseCase((ChaloTimeProvider) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloTimeProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetChaloTimeUseCase.class), null, function56, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetCurrencyStringFromAmountInSubcurrencyUseCase> function57 = new Function2<Scope, ParametersHolder, GetCurrencyStringFromAmountInSubcurrencyUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetCurrencyStringFromAmountInSubcurrencyUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null), (GetRoundedOffAmountInSubcurrencyUseCase) scope.d(Reflection.a(GetRoundedOffAmountInSubcurrencyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCurrencyStringFromAmountInSubcurrencyUseCase.class), null, function57, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, EvaluateWalletEnableConfigUseCase> function58 = new Function2<Scope, ParametersHolder, EvaluateWalletEnableConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new EvaluateWalletEnableConfigUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(EvaluateWalletEnableConfigUseCase.class), null, function58, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetRoundedOffAmountInSubcurrencyUseCase> function59 = new Function2<Scope, ParametersHolder, GetRoundedOffAmountInSubcurrencyUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetRoundedOffAmountInSubcurrencyUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRoundedOffAmountInSubcurrencyUseCase.class), null, function59, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetWalletSetupConfigurationUseCase> function60 = new Function2<Scope, ParametersHolder, GetWalletSetupConfigurationUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new GetWalletSetupConfigurationUseCase((ChaloConfigFeature) objD, (CrashlyticsLogger) objD2, (EvaluateWalletEnableConfigUseCase) scope.d(Reflection.a(EvaluateWalletEnableConfigUseCase.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetWalletSetupConfigurationUseCase.class), null, function60, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, LoadMoneyAmountValidationUseCase> function61 = new Function2<Scope, ParametersHolder, LoadMoneyAmountValidationUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new LoadMoneyAmountValidationUseCase((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LoadMoneyAmountValidationUseCase.class), null, function61, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BookingHelpResultStateManager> function62 = new Function2<Scope, ParametersHolder, BookingHelpResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new BookingHelpResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpResultStateManager.class), null, function62, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckoutResultStateManager> function63 = new Function2<Scope, ParametersHolder, CheckoutResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckoutResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckoutResultStateManager.class), null, function63, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, WalletLoadMoneyResultStateManager> function64 = new Function2<Scope, ParametersHolder, WalletLoadMoneyResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new WalletLoadMoneyResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(WalletLoadMoneyResultStateManager.class), null, function64, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UniversalSearchResultStateManager> function65 = new Function2<Scope, ParametersHolder, UniversalSearchResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new UniversalSearchResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UniversalSearchResultStateManager.class), null, function65, kind, CollectionsKt.C()), module)), null);
        d71 d71Var18 = new d71(29);
        Function2<Scope, ParametersHolder, ProductInfoContractImpl> function66 = new Function2<Scope, ParametersHolder, ProductInfoContractImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductInfoContractImpl((BasicInfoContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductInfoContractImpl.class), null, function66, kind2, CollectionsKt.C()), module)), d71Var18);
        Function2<Scope, ParametersHolder, GetMiscellaneousCityWiseFlagsConfigUseCase> function67 = new Function2<Scope, ParametersHolder, GetMiscellaneousCityWiseFlagsConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD4 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new GetMiscellaneousCityWiseFlagsConfigUseCase((ChaloConfigFeature) objD, (CityProvider) objD2, (CrashlyticsLogger) objD3, (ChaloBuildConfig) objD4, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (AccountDeletionUrlOverride) scope.d(Reflection.a(AccountDeletionUrlOverride.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, function67, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetOneTimeOfferConfigUseCase> function68 = new Function2<Scope, ParametersHolder, GetOneTimeOfferConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new GetOneTimeOfferConfigUseCase((ChaloBuildConfig) objD2, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloConfigFeature) objD);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetOneTimeOfferConfigUseCase.class), null, function68, kind2, CollectionsKt.C()), module)), null);
        h61 h61Var7 = new h61(13);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IUserPreferencesDataStore.class), null, h61Var7, kind2, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, UpdateOneTimeProductOfferAvailedIfNeededUseCase> function69 = new Function2<Scope, ParametersHolder, UpdateOneTimeProductOfferAvailedIfNeededUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new UpdateOneTimeProductOfferAvailedIfNeededUseCase((GetOneTimeOfferConfigUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetOneTimeOfferConfigUseCase.class), null, null), (IUserPreferencesDataStore) scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateOneTimeProductOfferAvailedIfNeededUseCase.class), null, function69, kind2, CollectionsKt.C()), module)), null);
        h61 h61Var8 = new h61(14);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ReclaimDataStoreWrapper.class), null, h61Var8, kind, CollectionsKt.C()), module));
        n71 n71Var13 = new n71(1);
        Function2<Scope, ParametersHolder, NetworkStateManagerImpl> function70 = new Function2<Scope, ParametersHolder, NetworkStateManagerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new NetworkStateManagerImpl((KConnectivityManager) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", KConnectivityManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(NetworkStateManagerImpl.class), null, function70, kind, CollectionsKt.C()), module)), n71Var13);
        n71 n71Var14 = new n71(2);
        Function2<Scope, ParametersHolder, CoroutineScopeHelperImpl> function71 = new Function2<Scope, ParametersHolder, CoroutineScopeHelperImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CoroutineScopeHelperImpl((CoroutineContextProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CoroutineScopeHelperImpl.class), null, function71, kind2, CollectionsKt.C()), module)), n71Var14);
        n71 n71Var15 = new n71(3);
        Function2<Scope, ParametersHolder, ChaloLocationManagerImpl> function72 = new Function2<Scope, ParametersHolder, ChaloLocationManagerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ArePermissionsGrantedUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                Object objD4 = scope.d(Reflection.a(ChaloLocationDelegate.class), null, null);
                return new ChaloLocationManagerImpl((ArePermissionsGrantedUseCase) objD, (BasicInfoContract) objD2, (CoroutineContextProvider) objD3, (ChaloLocationDelegate) objD4, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (LastKnownLocationProvider) scope.d(Reflection.a(LastKnownLocationProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloLocationManagerImpl.class), null, function72, kind, CollectionsKt.C()), module)), n71Var15);
        Function2<Scope, ParametersHolder, ArePermissionsGrantedUseCase> function73 = new Function2<Scope, ParametersHolder, ArePermissionsGrantedUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$24
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ArePermissionsGrantedUseCase((PermissionHandlerProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PermissionHandlerProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ArePermissionsGrantedUseCase.class), null, function73, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, UpdateMapStateOnLiveVehiclePositionChangeUseCase> function74 = new Function2<Scope, ParametersHolder, UpdateMapStateOnLiveVehiclePositionChangeUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new UpdateMapStateOnLiveVehiclePositionChangeUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UpdateMapStateOnLiveVehiclePositionChangeUseCase.class), null, function74, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetTimeInMillisAfterXTimeUseCase> function75 = new Function2<Scope, ParametersHolder, GetTimeInMillisAfterXTimeUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetTimeInMillisAfterXTimeUseCase((TimeUtilsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, function75, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, IsNotificationPermissionGrantedUseCase> function76 = new Function2<Scope, ParametersHolder, IsNotificationPermissionGrantedUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new IsNotificationPermissionGrantedUseCase((ArePermissionsGrantedUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ArePermissionsGrantedUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, function76, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumBusCurrentCityConfigUseCase> function77 = new Function2<Scope, ParametersHolder, GetPremiumBusCurrentCityConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$28
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetPremiumBusCurrentCityConfigUseCase((CityProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null), (GetPremiumBusNativeConfigUseCase) scope.d(Reflection.a(GetPremiumBusNativeConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, function77, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetPremiumBusNativeConfigUseCase> function78 = new Function2<Scope, ParametersHolder, GetPremiumBusNativeConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$29
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new GetPremiumBusNativeConfigUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) objD2, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloConfigFeature) objD);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetPremiumBusNativeConfigUseCase.class), null, function78, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, StepTicketModeBasedInfoUIStateFactory> function79 = new Function2<Scope, ParametersHolder, StepTicketModeBasedInfoUIStateFactory>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new StepTicketModeBasedInfoUIStateFactory((StringProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(StepTicketModeBasedInfoUIStateFactory.class), null, function79, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ReportProblemResponseConverter> function80 = new Function2<Scope, ParametersHolder, ReportProblemResponseConverter>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$31
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ReportProblemResponseConverter((CrashlyticsLogger) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ReportProblemResponseConverter.class), null, function80, kind2, CollectionsKt.C()), module)), null);
        h61 h61Var9 = new h61(15);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IReportProblemFeature.class), null, h61Var9, kind, CollectionsKt.C()), module));
        h61 h61Var10 = new h61(16);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IBoostRatingsFeature.class), null, h61Var10, kind, CollectionsKt.C()), module));
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BrandId.class), null, SharedBaseModuleKt$commonModule$1$126.f2478a, kind, CollectionsKt.C()), module));
        h61 h61Var11 = new h61(17);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PolicyResolutionContextProvider.class), null, h61Var11, kind, CollectionsKt.C()), module));
        h61 h61Var12 = new h61(18);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PolicyConfigFetcher.class), null, h61Var12, kind, CollectionsKt.C()), module));
        h61 h61Var13 = new h61(19);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(PolicyResolverCache.class), null, h61Var13, kind2, CollectionsKt.C()), module));
        h61 h61Var14 = new h61(20);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveSplashPolicyUseCase.class), null, h61Var14, kind, CollectionsKt.C()), module));
        h61 h61Var15 = new h61(21);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveCitySelectionPolicyUseCase.class), null, h61Var15, kind, CollectionsKt.C()), module));
        h61 h61Var16 = new h61(22);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveSupportPolicyUseCase.class), null, h61Var16, kind, CollectionsKt.C()), module));
        h61 h61Var17 = new h61(23);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveWalletPolicyUseCase.class), null, h61Var17, kind, CollectionsKt.C()), module));
        h61 h61Var18 = new h61(24);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveJuspayPolicyUseCase.class), null, h61Var18, kind, CollectionsKt.C()), module));
        h61 h61Var19 = new h61(25);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveLanguagePolicyUseCase.class), null, h61Var19, kind, CollectionsKt.C()), module));
        h61 h61Var20 = new h61(26);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveProductPurchasePolicyUseCase.class), null, h61Var20, kind, CollectionsKt.C()), module));
        h61 h61Var21 = new h61(27);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveProfilePolicyUseCase.class), null, h61Var21, kind, CollectionsKt.C()), module));
        h61 h61Var22 = new h61(28);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveResourceUrlPolicyUseCase.class), null, h61Var22, kind, CollectionsKt.C()), module));
        h61 h61Var23 = new h61(29);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(SdkIntegrationPolicyManager.class), null, h61Var23, kind, CollectionsKt.C()), module));
        o71 o71Var3 = new o71(0);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveLocationPermissionPolicyUseCase.class), null, o71Var3, kind, CollectionsKt.C()), module));
        o71 o71Var4 = new o71(2);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TripPlannerPolicyManager.class), null, o71Var4, kind, CollectionsKt.C()), module));
        o71 o71Var5 = new o71(3);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloAppFeatureHelper.class), null, o71Var5, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetDeviceNFCStateUseCase> function81 = new Function2<Scope, ParametersHolder, GetDeviceNFCStateUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$32
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetDeviceNFCStateUseCase((BasicNFCManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", BasicNFCManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetDeviceNFCStateUseCase.class), null, function81, kind2, CollectionsKt.C()), module)), null);
        o71 o71Var6 = new o71(4);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsLocationMandatoryForUserUseCase.class), null, o71Var6, kind2, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetInstantTicketFeatureConfigUseCase> function82 = new Function2<Scope, ParametersHolder, GetInstantTicketFeatureConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$33
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new GetInstantTicketFeatureConfigUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD3, (ChaloConfigFeature) objD, (CityProvider) objD2);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetInstantTicketFeatureConfigUseCase.class), null, function82, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, IsStopBasedTripPlannerApplicableUseCase> function83 = new Function2<Scope, ParametersHolder, IsStopBasedTripPlannerApplicableUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$34
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new IsStopBasedTripPlannerApplicableUseCase((BasicInfoContract) objD2, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloConfigFeature) scope.d(Reflection.a(ChaloConfigFeature.class), null, null), (CityProvider) objD);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsStopBasedTripPlannerApplicableUseCase.class), null, function83, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIsUserLoggedInUseCase> function84 = new Function2<Scope, ParametersHolder, CheckIsUserLoggedInUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$35
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new CheckIsUserLoggedInUseCase((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIsUserLoggedInUseCase.class), null, function84, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIsTimestampForTodayUseCase> function85 = new Function2<Scope, ParametersHolder, CheckIsTimestampForTodayUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$36
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetChaloTimeUseCase.class), null, null);
                return new CheckIsTimestampForTodayUseCase((GetChaloTimeUseCase) objD, (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIsTimestampForTodayUseCase.class), null, function85, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetTodayOrTomorrowOrDateUseCase> function86 = new Function2<Scope, ParametersHolder, GetTodayOrTomorrowOrDateUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$37
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckIsTimestampForTodayUseCase.class), null, null);
                Object objD2 = scope.d(Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new GetTodayOrTomorrowOrDateUseCase((CheckIsTimestampForTodayUseCase) objD, (FormatTimeInMillisToGivenFormatUseCase) objD2, (TimeUtilsContract) objD3, (BasicInfoContract) objD4, (GetTimeInMillisAfterXTimeUseCase) scope.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetTodayOrTomorrowOrDateUseCase.class), null, function86, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetTrimmedPolylineUseCase> function87 = new Function2<Scope, ParametersHolder, GetTrimmedPolylineUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$38
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetTrimmedPolylineUseCase((PolylineUtils) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PolylineUtils.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetTrimmedPolylineUseCase.class), null, function87, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var16 = new n71(8);
        Function2<Scope, ParametersHolder, ChaloMapMarkerIconProviderImpl> function88 = new Function2<Scope, ParametersHolder, ChaloMapMarkerIconProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ChaloMapMarkerIconProviderImpl((ChaloMapLiveBusMarkerHelper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloMapLiveBusMarkerHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloMapMarkerIconProviderImpl.class), null, function88, kind2, CollectionsKt.C()), module)), n71Var16);
        Function2<Scope, ParametersHolder, IsBluetoothFeatureAvailableUseCase> function89 = new Function2<Scope, ParametersHolder, IsBluetoothFeatureAvailableUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$39
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new IsBluetoothFeatureAvailableUseCase((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null), (ChaloPackageManagerHelper) scope.d(Reflection.a(ChaloPackageManagerHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(IsBluetoothFeatureAvailableUseCase.class), null, function89, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FormatTimeInMillisToGivenFormatUseCase> function90 = new Function2<Scope, ParametersHolder, FormatTimeInMillisToGivenFormatUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new FormatTimeInMillisToGivenFormatUseCase((TimeUtilsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TimeUtilsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FormatTimeInMillisToGivenFormatUseCase.class), null, function90, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, LocationPermissionCallbackHandler> function91 = new Function2<Scope, ParametersHolder, LocationPermissionCallbackHandler>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$41
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new LocationPermissionCallbackHandler((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocationPermissionCallbackHandler.class), null, function91, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, FetchCurrentLocationUseCase> function92 = new Function2<Scope, ParametersHolder, FetchCurrentLocationUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$42
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new FetchCurrentLocationUseCase((ChaloLocationManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloLocationManager.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FetchCurrentLocationUseCase.class), null, function92, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIfCanLaunchHomeScreenUseCase> function93 = new Function2<Scope, ParametersHolder, CheckIfCanLaunchHomeScreenUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$43
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new CheckIfCanLaunchHomeScreenUseCase((HomeScreenConfigManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", HomeScreenConfigManager.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfCanLaunchHomeScreenUseCase.class), null, function93, kind2, CollectionsKt.C()), module)), null);
        StringQualifier stringQualifierA3 = QualifierKt.a("product_config_store.preferences_pb");
        o71 o71Var7 = new o71(5);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocalDataStore.class), stringQualifierA3, o71Var7, kind, CollectionsKt.C()), module));
        StringQualifier stringQualifierA4 = QualifierKt.a("proof_document_props_store.preferences_pb");
        o71 o71Var8 = new o71(6);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocalDataStore.class), stringQualifierA4, o71Var8, kind, CollectionsKt.C()), module));
        StringQualifier stringQualifierA5 = QualifierKt.a("proof_config_store.preferences_pb");
        o71 o71Var9 = new o71(7);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LocalDataStore.class), stringQualifierA5, o71Var9, kind, CollectionsKt.C()), module));
        n71 n71Var17 = new n71(9);
        Function2<Scope, ParametersHolder, GpsRequestHandlerProviderImpl> function94 = new Function2<Scope, ParametersHolder, GpsRequestHandlerProviderImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new GpsRequestHandlerProviderImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GpsRequestHandlerProviderImpl.class), null, function94, kind, CollectionsKt.C()), module)), n71Var17);
        n71 n71Var18 = new n71(10);
        Function2<Scope, ParametersHolder, KotlinToastManagerImpl> function95 = new Function2<Scope, ParametersHolder, KotlinToastManagerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new KotlinToastManagerImpl((CoroutineContextProvider) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(KotlinToastManagerImpl.class), null, function95, kind, CollectionsKt.C()), module)), n71Var18);
        Function2<Scope, ParametersHolder, RouteSearchResultStateManager> function96 = new Function2<Scope, ParametersHolder, RouteSearchResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new RouteSearchResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RouteSearchResultStateManager.class), null, function96, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetProductCapabilitiesRemoteConfigUseCase> function97 = new Function2<Scope, ParametersHolder, GetProductCapabilitiesRemoteConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new GetProductCapabilitiesRemoteConfigUseCase((ChaloBuildConfig) objD3, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD2, (ChaloConfigFeature) objD, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProductCapabilitiesRemoteConfigUseCase.class), null, function97, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetProductCapabilitiesUseCase> function98 = new Function2<Scope, ParametersHolder, GetProductCapabilitiesUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$44
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetProductCapabilitiesUseCase((GetProductCapabilitiesRemoteConfigUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetProductCapabilitiesRemoteConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetProductCapabilitiesUseCase.class), null, function98, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetSupportedChaloCountryListUseCase> function99 = new Function2<Scope, ParametersHolder, GetSupportedChaloCountryListUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$45
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new GetSupportedChaloCountryListUseCase();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetSupportedChaloCountryListUseCase.class), null, function99, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetCurrentCityPhoneNumberConfigUseCase> function100 = new Function2<Scope, ParametersHolder, GetCurrentCityPhoneNumberConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$46
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetCurrentCityPhoneNumberConfigUseCase((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null), (GetSupportedChaloCountryListUseCase) scope.d(Reflection.a(GetSupportedChaloCountryListUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCurrentCityPhoneNumberConfigUseCase.class), null, function100, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, TicketPurchaseSceneResolverUseCase> function101 = new Function2<Scope, ParametersHolder, TicketPurchaseSceneResolverUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$47
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ProductBookingHelper.class), null, null);
                Object objD2 = scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null);
                Object objD3 = scope.d(Reflection.a(GetInstantTicketFeatureConfigUseCase.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                return new TicketPurchaseSceneResolverUseCase((ProductBookingHelper) objD, (GetWalletSetupConfigurationUseCase) objD2, (GetInstantTicketFeatureConfigUseCase) objD3, (BasicInfoContract) objD4, (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (GetClusterConfigForCityUseCase) scope.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(TicketPurchaseSceneResolverUseCase.class), null, function101, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloFeedbackConfigDataUseCase> function102 = new Function2<Scope, ParametersHolder, ChaloFeedbackConfigDataUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$48
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                return new ChaloFeedbackConfigDataUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (CrashlyticsLogger) objD3, (ChaloConfigFeature) objD, (CityProvider) objD2);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloFeedbackConfigDataUseCase.class), null, function102, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ChaloRideFeedbackCollectionHelper> function103 = new Function2<Scope, ParametersHolder, ChaloRideFeedbackCollectionHelper>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$49
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ChaloRideFeedbackCollectionHelper((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ChaloRideFeedbackCollectionHelper.class), null, function103, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetRemoteResourcesUrlConfigUseCase> function104 = new Function2<Scope, ParametersHolder, GetRemoteResourcesUrlConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                return new GetRemoteResourcesUrlConfigUseCase((ChaloConfigFeature) objD, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ResolveResourceUrlPolicyUseCase) scope.d(Reflection.a(ResolveResourceUrlPolicyUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRemoteResourcesUrlConfigUseCase.class), null, function104, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetRideFeedbackDataUseCase> function105 = new Function2<Scope, ParametersHolder, GetRideFeedbackDataUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$51
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new GetRideFeedbackDataUseCase((ChaloFeedbackConfigDataUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloFeedbackConfigDataUseCase.class), null, null), (RideFeedbackTracker) scope.d(Reflection.a(RideFeedbackTracker.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetRideFeedbackDataUseCase.class), null, function105, kind2, CollectionsKt.C()), module)), null);
        o71 o71Var10 = new o71(8);
        new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(RideFeedbackTracker.class), null, o71Var10, kind2, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, DoesUserHaveProductsOnMultipleDeviceUseCase> function106 = new Function2<Scope, ParametersHolder, DoesUserHaveProductsOnMultipleDeviceUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new DoesUserHaveProductsOnMultipleDeviceUseCase((ReclaimDataStoreWrapper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ReclaimDataStoreWrapper.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(DoesUserHaveProductsOnMultipleDeviceUseCase.class), null, function106, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var19 = new n71(11);
        Function2<Scope, ParametersHolder, CommonHtmlParserImpl> function107 = new Function2<Scope, ParametersHolder, CommonHtmlParserImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new CommonHtmlParserImpl();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CommonHtmlParserImpl.class), null, function107, kind2, CollectionsKt.C()), module)), n71Var19);
        o71 o71Var11 = new o71(10);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AppUsageTrackingContract.class), null, o71Var11, kind, CollectionsKt.C()), module));
        b(module);
        o71 o71Var12 = new o71(11);
        new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FireAppOpenEventIfRequiredUseCase.class), null, o71Var12, kind, CollectionsKt.C()), module));
        Function2<Scope, ParametersHolder, GetClusterConfigForCityUseCase> function108 = new Function2<Scope, ParametersHolder, GetClusterConfigForCityUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                return new GetClusterConfigForCityUseCase((ChaloConfigFeature) objD, (BasicInfoContract) objD2, (ChaloBuildConfig) objD3, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetClusterConfigForCityUseCase.class), null, function108, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetCityIdsInClusterProductHistoryUseCase> function109 = new Function2<Scope, ParametersHolder, GetCityIdsInClusterProductHistoryUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetCityIdsInClusterProductHistoryUseCase((GetClusterConfigForCityUseCase) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", GetClusterConfigForCityUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetCityIdsInClusterProductHistoryUseCase.class), null, function109, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetBookingHelpRemoteConfigUseCase> function110 = new Function2<Scope, ParametersHolder, GetBookingHelpRemoteConfigUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new GetBookingHelpRemoteConfigUseCase((ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (BasicInfoContract) objD2, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloConfigFeature) objD, (CityProvider) objD3);
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetBookingHelpRemoteConfigUseCase.class), null, function110, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, GetBookingHelpFaqsUseCase> function111 = new Function2<Scope, ParametersHolder, GetBookingHelpFaqsUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new GetBookingHelpFaqsUseCase((GetBookingHelpRemoteConfigUseCase) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", GetBookingHelpRemoteConfigUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(GetBookingHelpFaqsUseCase.class), null, function111, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, BookingHelpConfigHelper> function112 = new Function2<Scope, ParametersHolder, BookingHelpConfigHelper>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$53
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new BookingHelpConfigHelper((GetProductCapabilitiesUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetProductCapabilitiesUseCase.class), null, null), (GetBookingHelpFaqsUseCase) scope.d(Reflection.a(GetBookingHelpFaqsUseCase.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(BookingHelpConfigHelper.class), null, function112, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var20 = new n71(13);
        Function2<Scope, ParametersHolder, ABTestAnalyticsEventHandler> function113 = new Function2<Scope, ParametersHolder, ABTestAnalyticsEventHandler>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ABTestAnalyticsEventHandler((AnalyticsContract) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", AnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ABTestAnalyticsEventHandler.class), null, function113, kind2, CollectionsKt.C()), module)), n71Var20);
        Function2<Scope, ParametersHolder, CheckIfExperimentEnabledUseCase> function114 = new Function2<Scope, ParametersHolder, CheckIfExperimentEnabledUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$54
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloConfigFeature.class), null, null);
                Object objD2 = scope.d(Reflection.a(ChaloBuildConfig.class), null, null);
                Object objD3 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
                return new CheckIfExperimentEnabledUseCase((ChaloConfigFeature) objD, (ChaloBuildConfig) objD2, (CrashlyticsLogger) objD3, (CityProvider) objD4, (LanguageFeature) scope.d(Reflection.a(LanguageFeature.class), null, null), (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfExperimentEnabledUseCase.class), null, function114, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ResolveProductPurchaseMinProfileAbVariantUseCase> function115 = new Function2<Scope, ParametersHolder, ResolveProductPurchaseMinProfileAbVariantUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$55
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RemoteConfigFetcherContract.class), null, null);
                Object objD2 = scope.d(Reflection.a(CheckIfExperimentEnabledUseCase.class), null, null);
                return new ResolveProductPurchaseMinProfileAbVariantUseCase((RemoteConfigFetcherContract) objD, (CheckIfExperimentEnabledUseCase) objD2, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (ABTestAnalyticsContract) scope.d(Reflection.a(ABTestAnalyticsContract.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveProductPurchaseMinProfileAbVariantUseCase.class), null, function115, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ResolveProductPurchaseMinProfileDecisionUseCase> function116 = new Function2<Scope, ParametersHolder, ResolveProductPurchaseMinProfileDecisionUseCase>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$56
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null);
                Object objD2 = scope.d(Reflection.a(ResolveProductPurchaseMinProfileAbVariantUseCase.class), null, null);
                return new ResolveProductPurchaseMinProfileDecisionUseCase((UserProfileDetailsProvider) objD, (ResolveProductPurchaseMinProfileAbVariantUseCase) objD2, (UserProfilingHooksRuleEngine) scope.d(Reflection.a(UserProfilingHooksRuleEngine.class), null, null), (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ResolveProductPurchaseMinProfileDecisionUseCase.class), null, function116, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, ProductPurchaseMinProfileDecisionHelper> function117 = new Function2<Scope, ParametersHolder, ProductPurchaseMinProfileDecisionHelper>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$57
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new ProductPurchaseMinProfileDecisionHelper((MinProfileAnalyticsHelper) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", MinProfileAnalyticsHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ProductPurchaseMinProfileDecisionHelper.class), null, function117, kind2, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, CheckIfPremiumPassEligibleForRideRollOver> function118 = new Function2<Scope, ParametersHolder, CheckIfPremiumPassEligibleForRideRollOver>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$58
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new CheckIfPremiumPassEligibleForRideRollOver();
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(CheckIfPremiumPassEligibleForRideRollOver.class), null, function118, kind2, CollectionsKt.C()), module)), null);
        n71 n71Var21 = new n71(14);
        Function2<Scope, ParametersHolder, AdjustManagerImpl> function119 = new Function2<Scope, ParametersHolder, AdjustManagerImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloBuildConfig.class), null, null);
                Object objD2 = scope.d(Reflection.a(ApplicationForegroundManager.class), null, null);
                Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
                Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
                Object objD5 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
                Object objD6 = scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null);
                Object objD7 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
                return new AdjustManagerImpl((ChaloBuildConfig) objD, (ApplicationForegroundManager) objD2, (AnalyticsContract) objD3, (BasicInfoContract) objD4, (UserProfileDetailsProvider) objD5, (IUserPreferencesDataStore) objD6, (CoroutineContextProvider) objD7, (AdjustSdkDelegate) scope.d(Reflection.a(AdjustSdkDelegate.class), null, null), (SdkIntegrationPolicyManager) scope.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(AdjustManagerImpl.class), null, function119, kind, CollectionsKt.C()), module)), n71Var21);
        c(module);
        Function2<Scope, ParametersHolder, UserConsentResultStateManager> function120 = new Function2<Scope, ParametersHolder, UserConsentResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new UserConsentResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(UserConsentResultStateManager.class), null, function120, kind, CollectionsKt.C()), module)), null);
        Function2<Scope, ParametersHolder, MinProfileUpdateResultStateManager> function121 = new Function2<Scope, ParametersHolder, MinProfileUpdateResultStateManager>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$default$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope scope = (Scope) obj;
                return new MinProfileUpdateResultStateManager((SystemHelper) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SystemHelper.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(MinProfileUpdateResultStateManager.class), null, function121, kind, CollectionsKt.C()), module)), null);
        n71 n71Var22 = new n71(15);
        Function2<Scope, ParametersHolder, ActiveSceneInStackResolverImpl> function122 = new Function2<Scope, ParametersHolder, ActiveSceneInStackResolverImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$singleOf$23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                ActiveSceneInStackResolverImpl activeSceneInStackResolverImpl = new ActiveSceneInStackResolverImpl();
                activeSceneInStackResolverImpl.f2709a = StateFlowKt.a(null);
                return activeSceneInStackResolverImpl;
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(ActiveSceneInStackResolverImpl.class), null, function122, kind, CollectionsKt.C()), module)), n71Var22);
        n71 n71Var23 = new n71(16);
        Function2<Scope, ParametersHolder, LoginAuthGuardImpl> function123 = new Function2<Scope, ParametersHolder, LoginAuthGuardImpl>() { // from class: app.chalo.di.SharedBaseModuleKt$commonModule$lambda$0$$inlined$factoryOf$18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
                Scope scope = (Scope) obj;
                return new LoginAuthGuardImpl((UserProfileDetailsProvider) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", UserProfileDetailsProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
            }
        };
        OptionDSLKt.c(new KoinDefinition(module, i71.l(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(LoginAuthGuardImpl.class), null, function123, kind2, CollectionsKt.C()), module)), n71Var23);
        o71 o71Var13 = new o71(12);
        DefinitionBindingKt.a(new KoinDefinition(module, i71.x(new BeanDefinition(ScopeRegistry.Companion.a(), Reflection.a(FreshChatInitializerImpl.class), null, o71Var13, kind, CollectionsKt.C()), module)), Reflection.a(FreshChatInitializer.class));
    }

    public static final void b(Module module) {
        SharedBaseModuleKt$notification$$inlined$factoryOf$default$1 sharedBaseModuleKt$notification$$inlined$factoryOf$default$1 = new SharedBaseModuleKt$notification$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(AppNotificationResolverUseCase.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedBaseModuleKt$notification$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        DefinitionBindingKt.a(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GCMReceiverImpl.class), null, new o71(13), Kind.Singleton, emptyList), module)), Reflection.a(GCMReceiver.class));
    }

    public static final void c(Module module) {
        o71 o71Var = new o71(14);
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(Function2.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, o71Var, kind, emptyList), module));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(Function1.class), null, new o71(15), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(HandleCustomActionUseCase.class), null, new SharedBaseModuleKt$plotline$$inlined$factoryOf$default$1(), kind, emptyList), module)), null);
        n71 n71Var = new n71(21);
        SharedBaseModuleKt$plotline$$inlined$singleOf$1 sharedBaseModuleKt$plotline$$inlined$singleOf$1 = new SharedBaseModuleKt$plotline$$inlined$singleOf$1();
        Kind kind2 = Kind.Singleton;
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(PlotlineContractImpl.class), null, sharedBaseModuleKt$plotline$$inlined$singleOf$1, kind2, emptyList), module)), n71Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(PlotlineTrackContextProviderImpl.class), null, new SharedBaseModuleKt$plotline$$inlined$singleOf$2(), kind2, emptyList), module)), new n71(22));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GenderCardSelectionUIStateFactory.class), null, new SharedBaseModuleKt$plotline$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
    }
}
