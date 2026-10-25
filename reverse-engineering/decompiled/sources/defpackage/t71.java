package defpackage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.ads.AndroidAdsStartup;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.firebase.FirebaseAnalyticsDelegate;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataFetcher;
import app.chalo.citydata.repository.local.store.CityDataLocalStoreImpl;
import app.chalo.compose.utils.CommonContext;
import app.chalo.contract.BasicInfoContract;
import app.chalo.core.database.AppDatabase;
import app.chalo.core.database.dao.InstantTicketDaoImpl;
import app.chalo.core.database.dao.PremiumBusDaoImpl;
import app.chalo.core.database.dao.PremiumBusTripDaoImpl;
import app.chalo.core.database.dao.RecentPlacesCityItineraryDaoImpl;
import app.chalo.core.database.dao.RecentStopBasedTripCityItineraryDaoImpl;
import app.chalo.core.database.dao.RecentStopCityItineraryEntityDaoImpl;
import app.chalo.core.database.dao.RecentTripCityItineraryDaoImpl;
import app.chalo.core.database.dao.RouteDaoImpl;
import app.chalo.core.database.dao.RouteRecentCityItineraryDaoImpl;
import app.chalo.core.database.dao.SuperPassBookingsDaoImpl;
import app.chalo.core.database.dao.SuperPassDaoImpl;
import app.chalo.core.di.PlatformDependencyFactory;
import app.chalo.core.di.PlatformDependencyRequest;
import app.chalo.core.init.ApplicationInitManagerAndroid;
import app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.RouteAvailabilityBannerStore;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.features.adjust.AdjustSdkDelegate;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.freshchat.FreshchatUserDataHandler;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.network.KConnectivityManager;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.mticket.domain.CalculateMTicketFareUseCase;
import app.chalo.mticket.domain.CreateMTicketOrderUseCase;
import app.chalo.mticket.domain.FetchMTicketFareBetweenStopsUseCase;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.notification.core.NotificationPlatformNativeDelegate;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.worker.IWorkerDataStore;
import com.arkivanov.decompose.ComponentContext;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19634a;

    public /* synthetic */ t71(int i) {
        this.f19634a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19634a) {
            case 0:
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return (FreshchatUserInteractionContract) ((PlatformDependencyFactory) factory.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.FreshchatUserInteractionContractHelper.f2135a);
            case 1:
                Scope factory2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it2, "it");
                return new FreshchatUserDataHandler((GetDistinctIdUseCase) factory2.d(Reflection.a(GetDistinctIdUseCase.class), null, null), (LocalDataStore) factory2.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("config.preferences_pb")), (CoroutineContextProvider) factory2.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 2:
                Scope scope = (Scope) obj;
                AppDatabase appDatabase = (AppDatabase) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RecentStopCityItineraryEntityDaoImpl(appDatabase.b().getZ(), appDatabase.f2047a);
            case 3:
                Scope factory3 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it3, "it");
                return (AdjustSdkDelegate) ((PlatformDependencyFactory) factory3.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.AdjustDelegate.f2126a);
            case 4:
                Scope factory4 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it4, "it");
                return (FirebaseAnalyticsDelegate) ((PlatformDependencyFactory) factory4.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.FirebaseAnalytics.f2132a);
            case 5:
                Scope factory5 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(factory5, "$this$factory");
                Intrinsics.i(it5, "it");
                return (CapacitorDataFetcher) ((PlatformDependencyFactory) factory5.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.CapacitorDataFetchRequest.f2128a);
            case 6:
                Scope factory6 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(factory6, "$this$factory");
                Intrinsics.i(it6, "it");
                return (NotificationPlatformNativeDelegate) ((PlatformDependencyFactory) factory6.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.NotificationPlatformDelegate.f2144a);
            case 7:
                Scope scope2 = (Scope) obj;
                return (KConnectivityManager) ((PlatformDependencyFactory) scope2.d(i71.k(scope2, "$this$factory", (ParametersHolder) obj2, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.ConnectivityManagerRequest.f2131a);
            case 8:
                Scope scope3 = (Scope) obj;
                return (ApplicationForegroundManager) ((PlatformDependencyFactory) scope3.d(i71.k(scope3, "$this$single", (ParametersHolder) obj2, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.ForegroundManager.f2133a);
            case 9:
                Scope scope4 = (Scope) obj;
                AppDatabase appDatabase2 = (AppDatabase) scope4.d(i71.k(scope4, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RouteDaoImpl(appDatabase2.b().getF(), appDatabase2.f2047a);
            case 10:
                Scope scope5 = (Scope) obj;
                AppDatabase appDatabase3 = (AppDatabase) scope5.d(i71.k(scope5, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RouteRecentCityItineraryDaoImpl(appDatabase3.b().getW(), appDatabase3.f2047a);
            case 11:
                Scope scope6 = (Scope) obj;
                AppDatabase appDatabase4 = (AppDatabase) scope6.d(i71.k(scope6, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RecentPlacesCityItineraryDaoImpl(appDatabase4.b().getV(), appDatabase4.f2047a);
            case 12:
                Scope scope7 = (Scope) obj;
                AppDatabase appDatabase5 = (AppDatabase) scope7.d(i71.k(scope7, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RecentTripCityItineraryDaoImpl(appDatabase5.b().getA(), appDatabase5.f2047a);
            case 13:
                Scope scope8 = (Scope) obj;
                AppDatabase appDatabase6 = (AppDatabase) scope8.d(i71.k(scope8, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new RecentStopBasedTripCityItineraryDaoImpl(appDatabase6.b().getY(), appDatabase6.f2047a);
            case 14:
                Scope scope9 = (Scope) obj;
                AppDatabase appDatabase7 = (AppDatabase) scope9.d(i71.k(scope9, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new PremiumBusTripDaoImpl(appDatabase7.b().getS(), appDatabase7.f2047a);
            case 15:
                Scope scope10 = (Scope) obj;
                AppDatabase appDatabase8 = (AppDatabase) scope10.d(i71.k(scope10, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new PremiumBusDaoImpl(appDatabase8.b().getR(), appDatabase8.b().getQ(), appDatabase8.b().getP(), appDatabase8.f2047a);
            case 16:
                Scope scope11 = (Scope) obj;
                AppDatabase appDatabase9 = (AppDatabase) scope11.d(i71.k(scope11, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new SuperPassDaoImpl(appDatabase9.b().getC(), appDatabase9.b().getF(), appDatabase9.b().getG(), appDatabase9.b().getB(), appDatabase9.b().getN(), appDatabase9.f2047a);
            case 17:
                Scope scope12 = (Scope) obj;
                AppDatabase appDatabase10 = (AppDatabase) scope12.d(i71.k(scope12, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new SuperPassBookingsDaoImpl(appDatabase10.b().getH(), appDatabase10.f2047a);
            case 18:
                Scope scope13 = (Scope) obj;
                AppDatabase appDatabase11 = (AppDatabase) scope13.d(i71.k(scope13, "$this$single", (ParametersHolder) obj2, "it", AppDatabase.class), null, null);
                return new InstantTicketDaoImpl(appDatabase11.b().getD(), appDatabase11.b().getC(), appDatabase11.f2047a);
            case 19:
                Scope single = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it7, "it");
                return new CommonContext(ModuleExtKt.a(single));
            case 20:
                Scope single2 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it8, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single2), "ENV_CHANGE_STORE_KEY", null, 4, null)), null, new u71(single2, 0), 5, null);
            case 21:
                Scope scope14 = (Scope) obj;
                return new ApplicationInitManagerAndroid((CommonContext) scope14.d(i71.k(scope14, "$this$single", (ParametersHolder) obj2, "it", CommonContext.class), null, null), (CoroutineContextProvider) scope14.d(Reflection.a(CoroutineContextProvider.class), null, null), (CityProvider) scope14.d(Reflection.a(CityProvider.class), null, null), LazyKt.b(new u71(scope14, 1)), (AnalyticsContract) scope14.d(Reflection.a(AnalyticsContract.class), null, null), LazyKt.b(new u71(scope14, 2)), (ChaloBuildConfig) scope14.d(Reflection.a(ChaloBuildConfig.class), null, null), (SdkIntegrationPolicyManager) scope14.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null), LazyKt.b(new u71(scope14, 3)), (GCMReceiver) scope14.d(Reflection.a(GCMReceiver.class), null, null), (FcmTokenFeature) scope14.d(Reflection.a(FcmTokenFeature.class), null, null), (ThoughtNudgeContract) scope14.d(Reflection.a(ThoughtNudgeContract.class), null, null), LazyKt.b(new m4(scope14, 24)), LazyKt.b(new m4(scope14, 25)), (CityChangeOperationTracker) scope14.d(Reflection.a(CityChangeOperationTracker.class), null, null), LazyKt.b(new m4(scope14, 26)), LazyKt.b(new m4(scope14, 27)), LazyKt.b(new m4(scope14, 28)), LazyKt.b(new m4(scope14, 29)), (AndroidAdsStartup) scope14.d(Reflection.a(AndroidAdsStartup.class), null, null));
            case 22:
                Scope single3 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it9, "it");
                return new ApplicationBackgroundWorkersManagerAndroid(ModuleExtKt.a(single3), (IWorkerDataStore) single3.d(Reflection.a(IWorkerDataStore.class), null, null), (WalletDataStore) single3.d(Reflection.a(WalletDataStore.class), null, null), (GetWalletSetupConfigurationUseCase) single3.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null), (CityProvider) single3.d(Reflection.a(CityProvider.class), null, null));
            case 23:
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it10, "it");
                return ChaloInternalNetworkInspector.DisabledInspector.f6464a;
            case 24:
                Scope single4 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it11, "it");
                return new CityDataLocalStoreImpl(new LocalDataStore((DataStore) single4.d(Reflection.a(DataStore.class), null, new StringQualifier("keyCityData.preferences_pb"))), (CityProvider) single4.d(Reflection.a(CityProvider.class), null, null));
            case 25:
                Scope factory7 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(factory7, "$this$factory");
                Intrinsics.i(it12, "it");
                return new RecentsAndFavMigrationsTrackingDatastoreHelperImpl((DataStore) factory7.d(Reflection.a(DataStore.class), null, new StringQualifier("recents_and_fav_data_store_migration_tracker.preferences_pb")));
            case 26:
                Scope single5 = (Scope) obj;
                ParametersHolder it13 = (ParametersHolder) obj2;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i(it13, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single5, 5), 7, null);
            case 27:
                Scope single6 = (Scope) obj;
                ParametersHolder it14 = (ParametersHolder) obj2;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i(it14, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single6), "recents_and_fav_data_store_migration_tracker", null, 4, null)), null, new u71(single6, 4), 5, null);
            case 28:
                Scope scope15 = (Scope) obj;
                return new FetchGeoSpatialDataUseCase((StopTripDetailsRepository) scope15.d(i71.k(scope15, "$this$factory", (ParametersHolder) obj2, "it", StopTripDetailsRepository.class), null, null), (LanguageFeature) scope15.d(Reflection.a(LanguageFeature.class), null, null), (CityProvider) scope15.d(Reflection.a(CityProvider.class), null, null), (BasicInfoContract) scope15.d(Reflection.a(BasicInfoContract.class), null, null), (UserProfileDetailsProvider) scope15.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (IReportProblemFeature) scope15.d(Reflection.a(IReportProblemFeature.class), null, null), (CrashlyticsLogger) scope15.d(Reflection.a(CrashlyticsLogger.class), null, null), (RouteAvailabilityBannerStore) scope15.d(Reflection.a(RouteAvailabilityBannerStore.class), null, null), (AnalyticsContract) scope15.d(Reflection.a(AnalyticsContract.class), null, null), (ApplicationForegroundManager) scope15.d(Reflection.a(ApplicationForegroundManager.class), null, null), (NetworkStateManager) scope15.d(Reflection.a(NetworkStateManager.class), null, null));
            default:
                Scope scope16 = (Scope) obj;
                return new MTicketPassengerSelectionComponent((MTicketSelectionArgs) scope16.d(i71.k(scope16, "$this$factory", (ParametersHolder) obj2, "it", MTicketSelectionArgs.class), null, null), (ComponentContext) scope16.d(Reflection.a(ComponentContext.class), null, null), (ProductPurchaseRepository) scope16.d(Reflection.a(ProductPurchaseRepository.class), null, null), (AnalyticsContract) scope16.d(Reflection.a(AnalyticsContract.class), null, null), (FetchProductConfigsUseCase) scope16.d(Reflection.a(FetchProductConfigsUseCase.class), null, null), (FetchMTicketFareBetweenStopsUseCase) scope16.d(Reflection.a(FetchMTicketFareBetweenStopsUseCase.class), null, null), (TicketRepository) scope16.d(Reflection.a(TicketRepository.class), null, null), (CalculateMTicketFareUseCase) scope16.d(Reflection.a(CalculateMTicketFareUseCase.class), null, null), (LocalDataStore) scope16.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("isTermsAndConditionSeenKey")), (KotlinToastManager) scope16.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) scope16.d(Reflection.a(StringProvider.class), null, null), (CreateMTicketOrderUseCase) scope16.d(Reflection.a(CreateMTicketOrderUseCase.class), null, null), (MTicketUtilsHelper) scope16.d(Reflection.a(MTicketUtilsHelper.class), null, null), (ChaloNavigationManager) scope16.d(Reflection.a(ChaloNavigationManager.class), null, null), (ResolveProductPurchaseMinProfileDecisionUseCase) scope16.d(Reflection.a(ResolveProductPurchaseMinProfileDecisionUseCase.class), null, null), (MinProfileUpdateResultStateManager) scope16.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null), (UserProfileDetailsProvider) scope16.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (MobileTicketingConverters) scope16.d(Reflection.a(MobileTicketingConverters.class), null, null), (MTicketPassengerSelectionUIStateFactory) scope16.d(Reflection.a(MTicketPassengerSelectionUIStateFactory.class), null, null), (ProductPurchaseMinProfileDecisionHelper) scope16.d(Reflection.a(ProductPurchaseMinProfileDecisionHelper.class), null, null), (MinProfileAnalyticsHelper) scope16.d(Reflection.a(MinProfileAnalyticsHelper.class), null, null));
        }
    }
}
